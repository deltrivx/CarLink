package net.easyconn.gwmec.update

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [29])
class UpdateCatalogTest {
    private val releaseJson = """
        [
          {
            "tag_name": "v0.2.15",
            "draft": true,
            "assets": [
              {"name": "DiPlay-0.2.15.apk", "browser_download_url": "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.15/DiPlay-0.2.15.apk"},
              {"name": "SHA256SUMS.txt", "browser_download_url": "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.15/SHA256SUMS.txt"}
            ]
          },
          {
            "tag_name": "v0.2.14",
            "draft": false,
            "prerelease": true,
            "assets": [
              {"name": "DiPlay-0.2.14.apk", "browser_download_url": "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.14/DiPlay-0.2.14.apk"},
              {"name": "SHA256SUMS.txt", "browser_download_url": "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.14/SHA256SUMS.txt"}
            ]
          }
        ]
    """.trimIndent()

    @Test
    fun skipsDraftsAndReturnsTheFirstPublishedRelease() {
        val release = UpdateCatalog.parse(releaseJson, generic = false)
        assertEquals("v0.2.14", release?.tagName)
        assertEquals("DiPlay-0.2.14.apk", release?.apkName)
        assertEquals(
            "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.14/DiPlay-0.2.14.apk",
            release?.apkUrl,
        )
        assertEquals(
            "https://github.com/shihabal3amri/DiPlay/releases/download/v0.2.14/SHA256SUMS.txt",
            release?.checksumsUrl,
        )
    }

    @Test
    fun returnsNullWithoutAnApkAsset() {
        val json = """
            [
              {"tag_name": "v0.2.14", "draft": false, "assets": [
                {"name": "source.zip", "browser_download_url": "https://example.com/source.zip"}
              ]}
            ]
        """.trimIndent()
        assertNull(UpdateCatalog.parse(json, generic = false))
    }

    @Test
    fun returnsNullWithoutChecksums() {
        val json = """
            [
              {"tag_name": "v0.2.14", "draft": false, "assets": [
                {"name": "DiPlay-0.2.14.apk", "browser_download_url": "https://example.com/DiPlay-0.2.14.apk"}
              ]}
            ]
        """.trimIndent()
        assertNull(UpdateCatalog.parse(json, generic = false))
    }

    @Test
    fun returnsNullForAnEmptyReleaseList() {
        assertNull(UpdateCatalog.parse("[]", generic = false))
    }

    @Test
    fun routesEachInstallToItsOwnApk() {
        val json = """
            [
              {"tag_name": "v1.2.12", "draft": false, "assets": [
                {"name": "CarLink-1.2.12.apk", "browser_download_url": "https://example.com/CarLink-1.2.12.apk"},
                {"name": "CarLink-1.2.12-generic.apk", "browser_download_url": "https://example.com/CarLink-1.2.12-generic.apk"},
                {"name": "SHA256SUMS-custom.txt", "browser_download_url": "https://example.com/SHA256SUMS-custom.txt"},
                {"name": "SHA256SUMS-generic.txt", "browser_download_url": "https://example.com/SHA256SUMS-generic.txt"}
              ]}
            ]
        """.trimIndent()
        val custom = UpdateCatalog.parse(json, generic = false)
        assertEquals("CarLink-1.2.12.apk", custom?.apkName)
        assertEquals("https://example.com/SHA256SUMS-custom.txt", custom?.checksumsUrl)
        val generic = UpdateCatalog.parse(json, generic = true)
        assertEquals("CarLink-1.2.12-generic.apk", generic?.apkName)
        assertEquals("https://example.com/SHA256SUMS-generic.txt", generic?.checksumsUrl)
    }
}
