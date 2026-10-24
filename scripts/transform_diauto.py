#!/usr/bin/env python3
"""Convert the imported DiAuto app module into an Android library.

Runs on the GitHub Actions runner inside the CarLink checkout after
`app/` and `contract/` have been copied from the DiAuto repository.
Idempotent: safe to re-run.
"""
import re
import sys

def drop_block(text: str, start_marker: str) -> str:
    """Remove from the line containing start_marker through the line that
    closes its brace block (balanced counting from the opening line)."""
    lines = text.split("\n")
    for i, line in enumerate(lines):
        if start_marker in line and not line.lstrip().startswith("//"):
            depth = line.count("{") - line.count("}")
            j = i
            while depth > 0 and j + 1 < len(lines):
                j += 1
                depth += lines[j].count("{") - lines[j].count("}")
            del lines[i:j + 1]
            return "\n".join(lines)
    return text

def drop_lines(text: str, pattern: str) -> str:
    return re.sub(rf"[ \t]*{pattern}[^\n]*\n", "", text)

def convert(path: str, is_app: bool) -> None:
    src = open(path, encoding="utf-8").read()

    src = src.replace("import org.jetbrains.kotlin.config.KotlinCompilerVersion\n", "")
    src = src.replace("import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions\n", "")

    if is_app:
        src = re.sub(
            r"plugins \{.*?\n\}",
            "plugins {\n    alias(libs.plugins.android.library)\n}",
            src, count=1, flags=re.S,
        )

    src = src.replace("compileSdk = 36", "compileSdk = 37")
    src = src.replace('ndkVersion = "29.0.14206865"', 'ndkVersion = "28.2.13676358"')

    # Application-only configuration
    src = drop_lines(src, r'applicationId = "')
    src = drop_lines(src, r"versionCode = ")
    src = drop_lines(src, r'versionName = "')
    src = drop_lines(src, r'setProperty\("archivesBaseName"')
    src = drop_lines(src, r"applicationIdSuffix")
    src = drop_lines(src, r"versionNameSuffix")
    src = drop_lines(src, r'val relConfig = signingConfigs')
    src = drop_lines(src, r"if \(relConfig\.storeFile")
    src = drop_lines(src, r"signingConfig = relConfig")
    src = drop_lines(src, r"kapt\(")
    src = drop_lines(src, r"\"playstoreImplementation\"")
    src = drop_lines(src, r"\"githubImplementation\"")
    src = drop_lines(src, r'implementation\("org.jetbrains.kotlin:kotlin-stdlib-jdk8')
    src = src.replace('implementation(project(":contract"))',
                      'implementation(project(":auto-contract"))')
    src = src.replace("sourceCompatibility = JavaVersion.VERSION_1_8",
                      "sourceCompatibility = JavaVersion.VERSION_17")
    src = src.replace("targetCompatibility = JavaVersion.VERSION_1_8",
                      "targetCompatibility = JavaVersion.VERSION_17")
    src = src.replace('it.jvmTarget = "1.8"', 'it.jvmTarget = "17"')

    if is_app:
        # Whole blocks that only make sense for an application module
        src = drop_block(src, 'flavorDimensions.add("distribution")')
        src = drop_block(src, "productFlavors {")
        src = drop_block(src, "signingConfigs {")
        src = drop_block(src, "applicationVariants.all {")

    # Library modules must not declare a standalone Application class
    open(path, "w", encoding="utf-8").write(src)

def strip_application_attrs(path: str) -> None:
    src = open(path, encoding="utf-8").read()
    src = re.sub(r"<application\b[^>]*>", "<application>", src, count=1)
    open(path, "w", encoding="utf-8").write(src)

convert("auto/build.gradle.kts", is_app=True)
try:
    convert("contract/build.gradle.kts", is_app=False)
except FileNotFoundError:
    sys.exit("contract/build.gradle.kts missing - check the copy step")
strip_application_attrs("auto/src/main/AndroidManifest.xml")

# Disable DiAuto's own auto-start entry points; the CarLink home frame owns
# session dispatch and must not fight CarPlay for USB attach events.
for manifest in ["auto/src/main/AndroidManifest.xml"]:
    src = open(manifest, encoding="utf-8").read()
    for comp in ["UsbAttachedActivity", "AutoStartReceiver",
                 "BootCompleteReceiver", "WifiAutoStartReceiver"]:
        src = src.replace(
            f'android:name=".app.{comp}"',
            f'android:name=".app.{comp}"\n        android:enabled="false"',
        )
    open(manifest, "w", encoding="utf-8").write(src)

print("transform ok")
