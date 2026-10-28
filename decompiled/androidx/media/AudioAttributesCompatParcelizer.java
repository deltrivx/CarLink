package androidx.media;

import g5.b;
import g5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVarH = audioAttributesCompat.f1091a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f1091a = (AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1091a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
