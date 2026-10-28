package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f1092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1093b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1092a.equals(((AudioAttributesImplApi21) obj).f1092a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1092a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1092a;
    }
}
