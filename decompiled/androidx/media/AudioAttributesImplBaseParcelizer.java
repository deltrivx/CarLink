package androidx.media;

import g5.b;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1094a = bVar.f(audioAttributesImplBase.f1094a, 1);
        audioAttributesImplBase.f1095b = bVar.f(audioAttributesImplBase.f1095b, 2);
        audioAttributesImplBase.f1096c = bVar.f(audioAttributesImplBase.f1096c, 3);
        audioAttributesImplBase.f1097d = bVar.f(audioAttributesImplBase.f1097d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f1094a, 1);
        bVar.j(audioAttributesImplBase.f1095b, 2);
        bVar.j(audioAttributesImplBase.f1096c, 3);
        bVar.j(audioAttributesImplBase.f1097d, 4);
    }
}
