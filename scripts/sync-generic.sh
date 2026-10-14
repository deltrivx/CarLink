#!/usr/bin/env bash
#
# Publishes the generic build to the public repository.
#
# The generic build is the one for any Android device: no system uid, upstream
# accessory identity. The custom build for the car — and the accessory identity
# provisioned for it — stays in the private repository and is never published.
#
# Usage: scripts/sync-generic.sh <version> <generic-apk> <checksums-file>
#   version         e.g. 1.3.41
#   generic-apk     path to CarLink-<version>-generic.apk
#   checksums-file  path to SHA256SUMS-generic.txt
#
# Requires: gh (authenticated), git
set -euo pipefail

VERSION="${1:?version required}"
APK="${2:?generic apk path required}"
SUMS="${3:?checksums file required}"

PUBLIC_REPO="deltrivx/CarLink"
PRIVATE_REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
WORK="$(mktemp -d)"
trap 'rm -rf "$WORK"' EXIT

echo "==> Preparing source snapshot for $VERSION"
# A single commit: the public repository carries the code, not the history of
# how it was arrived at. Nothing private has ever been in these files, but a
# fresh snapshot leaves no doubt.
rsync -a \
  --exclude='.git/' \
  --exclude='.gradle/' \
  --exclude='local.properties' \
  --exclude='build/' \
  --exclude='*/build/' \
  --exclude='.DS_Store' \
  --exclude='AGENTS.md' \
  "$PRIVATE_REPO_ROOT/" "$WORK/repo/"
# The public repository carries its own release workflow, which builds the generic
# APK and needs no credentials. Two workflows do not belong there either: the
# upstream sync assumed this tree tracked DiPlay wholesale, and the Android TV
# build repeated what the checks workflow already does.
rm -f "$WORK/repo/.github/workflows/upstream-sync.yml" \
      "$WORK/repo/.github/workflows/build-android-tv.yml"

# The two READMEs differ: this repository is written for the head unit, with its
# cluster and vehicle features; the public one is written for any Android device.
# Mirror the public wording so the snapshot does not overwrite it with the head-unit one.
if [ -d "$PRIVATE_REPO_ROOT/docs/generic" ]; then
  cp "$PRIVATE_REPO_ROOT/docs/generic/README.md" "$WORK/repo/README.md"
  cp "$PRIVATE_REPO_ROOT/docs/generic/README.en.md" "$WORK/repo/README.en.md"
  rm -f "$WORK/repo/README.zh-CN.md"
  # The public repository publishes its own generic releases, so it carries the
  # workflow that builds them.
  if [ -f "$PRIVATE_REPO_ROOT/docs/generic/workflows/release.yml" ]; then
    mkdir -p "$WORK/repo/.github/workflows"
    cp "$PRIVATE_REPO_ROOT/docs/generic/workflows/release.yml"       "$WORK/repo/.github/workflows/release.yml"
  fi
fi

cd "$WORK/repo"

echo "==> Checking for anything that must not be published"
if find . -name '*.jks' -o -name 'identity.pk8' -o -name 'certificate.p7b' -o -name 'ota-token.txt' | grep -q .; then
  echo "!! Refusing to publish: private credentials found in the snapshot." >&2
  exit 1
fi
# The public repository's name must not appear either: the private one is the
# custom build's home, and a public tree has no business naming it.
if grep -rq 'deltrivx/EasyConnect' --include='*.kt' --include='*.kts' --include='*.xml' .; then
  echo "!! Refusing to publish: the private repository is named in the source." >&2
  exit 1
fi

echo "==> Committing and pushing to $PUBLIC_REPO"
git init -q
git add -A
git -c user.name="CarLink" -c user.email="noreply@example.com" commit -q -m "CarLink $VERSION — generic build source

Generic build source for $VERSION. Licensed GPL-3.0 (see LICENSE).
A derivative work of DiPlay / XcertPlay." || echo "(nothing changed)"
git branch -M main
git remote remove origin 2>/dev/null || true
git remote add origin "https://github.com/$PUBLIC_REPO.git"
git -c http.proxy= -c https.proxy= -c credential.helper="!gh auth git-credential" push --force origin main

echo "==> Publishing the generic APK to $PUBLIC_REPO"
cd "$WORK"
gh release view "v$VERSION" --repo "$PUBLIC_REPO" >/dev/null 2>&1 || gh release create "v$VERSION" --repo "$PUBLIC_REPO" \
  --title "CarLink $VERSION (generic)" \
  --notes "Generic build of CarLink $VERSION.

Install target: any Android device — **not** the car's custom build. No
\`android.uid.system\`; uses the upstream accessory identity.

Source: this repository at tag \`v$VERSION\`. Licensed GPL-3.0 (see LICENSE).
A derivative work of DiPlay (<https://github.com/shihabal3amri/DiPlay>) / XcertPlay.

**Not Apple-certified.** Experimental accessory identity; compatibility across
iPhones and head units is still being tested.

The car's custom build carries the provisioned accessory identity and is not
part of this repository."

gh release upload "v$VERSION" --repo "$PUBLIC_REPO" --clobber \
  "$APK" "$SUMS"

echo "==> Done: $PUBLIC_REPO v$VERSION"
