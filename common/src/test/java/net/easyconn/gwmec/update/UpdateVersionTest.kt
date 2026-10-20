package net.easyconn.gwmec.update

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UpdateVersionTest {
    @Test
    fun newerTagIsAnUpdate() {
        assertTrue(UpdateVersion.isNewer("v0.2.15", "0.2.14"))
    }

    @Test
    fun sameVersionIsNotAnUpdate() {
        assertFalse(UpdateVersion.isNewer("0.2.14", "0.2.14"))
    }

    @Test
    fun olderTagIsIgnored() {
        assertFalse(UpdateVersion.isNewer("v0.2.13", "0.2.14"))
    }

    @Test
    fun numericFieldsCompareLeftToRight() {
        assertTrue(UpdateVersion.isNewer("0.3.0", "0.2.14"))
        assertFalse(UpdateVersion.isNewer("0.2.9", "0.2.14"))
    }

    @Test
    fun preReleaseSuffixStillComparesByNumbers() {
        assertTrue(UpdateVersion.isNewer("0.2.15-beta.1", "0.2.14"))
        assertFalse(UpdateVersion.isNewer("0.2.14-rc.1", "0.2.14"))
    }

    @Test
    fun unparseableRemoteVersionIsNeverAnUpdate() {
        assertFalse(UpdateVersion.isNewer("public-preview", "0.2.14"))
    }

    @Test
    fun unparseableInstalledVersionAcceptsAnyParseableRemote() {
        assertTrue(UpdateVersion.isNewer("0.2.15", "psa.2"))
        assertFalse(UpdateVersion.isNewer("public-preview", "psa.2"))
    }

    @Test
    fun fourSegmentDateBuildOfTheDayIsNewer() {
        // The date scheme: the fourth segment is the build of the day.
        assertTrue(UpdateVersion.isNewer("2026.10.20.12", "2026.10.20"))
        assertTrue(UpdateVersion.isNewer("2026.10.20.12", "2026.10.20.11"))
        assertFalse(UpdateVersion.isNewer("2026.10.20.12", "2026.10.20.12"))
        assertFalse(UpdateVersion.isNewer("2026.10.20.12", "2026.10.21"))
    }

    @Test
    fun missingSegmentsCountAsZero() {
        assertTrue(UpdateVersion.isNewer("1.3", "1.2.99"))
        assertFalse(UpdateVersion.isNewer("1.3", "1.3.0"))
    }
}