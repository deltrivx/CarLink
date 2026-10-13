package net.easyconn.gwmec.update

import androidx.core.content.FileProvider

/** Separate provider identity so merged app manifests cannot broaden the update paths. */
class UpdateApkProvider : FileProvider()
