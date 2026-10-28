package androidx.media;

import android.util.SparseIntArray;
import g5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1090b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f1091a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f1091a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f1091a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f1091a);
    }

    public final int hashCode() {
        return this.f1091a.hashCode();
    }

    public final String toString() {
        return this.f1091a.toString();
    }
}
