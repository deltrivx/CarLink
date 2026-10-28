package k7;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import b3.i0;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m7.a {
    public static AudioTrack a(a aVar, n7.c cVar, int i7, boolean z10, k kVar, int i10) {
        h9.a i0Var = (i10 & 16) != 0 ? new i0(14) : kVar;
        i9.l.e(cVar, "params");
        int i11 = cVar.f8874c;
        int i12 = cVar.f8873b;
        try {
            if (Build.VERSION.SDK_INT < 23 || z10) {
                return new AudioTrack(i7, cVar.f8872a, i12 == 1 ? 4 : 12, i11 == 16 ? 2 : 3, cVar.a(), 1);
            }
            i4.j.q();
            AudioTrack audioTrackBuild = i4.j.e().setAudioAttributes(new AudioAttributes.Builder().setUsage(i7).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(cVar.f8872a).setChannelMask(i12 == 1 ? 4 : 12).setEncoding(i11 == 16 ? 2 : 3).build()).setTransferMode(1).setBufferSizeInBytes(cVar.a()).setSessionId(0).build();
            i9.l.b(audioTrackBuild);
            return audioTrackBuild;
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "AudioTrack 构造失败: " + e7.getMessage() + ", channelConfig=" + (i12 == 1 ? 4 : 12));
            i0Var.invoke();
            return null;
        }
    }

    @Override // m7.a
    public final m7.j b() {
        return i2.c.B();
    }
}
