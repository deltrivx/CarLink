package androidx.media;

import android.media.AudioAttributes;
import g5.b;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1092a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f1092a, 1);
        audioAttributesImplApi26.f1093b = bVar.f(audioAttributesImplApi26.f1093b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f1092a, 1);
        bVar.j(audioAttributesImplApi26.f1093b, 2);
    }
}
