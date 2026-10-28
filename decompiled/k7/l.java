package k7;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import cc.y;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import java.io.File;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i7, y8.c cVar, boolean z10) {
        super(2, cVar);
        this.f7370b = i7;
        this.f7371c = z10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        l lVar = new l(this.f7370b, cVar, this.f7371c);
        lVar.f7369a = obj;
        return lVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((y) obj, (y8.c) obj2);
        z zVar = z.f12851a;
        lVar.invokeSuspend(zVar);
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [k7.k] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        char c10;
        z zVar = z.f12851a;
        t8.a.e(obj);
        try {
            try {
                File fileC = n.f7380g;
                if (fileC == null) {
                    fileC = n.c();
                }
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(fileC.getAbsolutePath());
                MediaFormat mediaFormatE = n.e(mediaExtractor);
                if (mediaFormatE == null) {
                    Logger.INSTANCE.e(Constants.TAG, "【音频测试】未找到音频轨道");
                    return zVar;
                }
                MediaCodec mediaCodecB = n.b(mediaFormatE);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                a aVar = new a();
                c10 = 0;
                try {
                    n7.c cVar = new n7.c(mediaFormatE.getInteger("sample-rate"), mediaFormatE.getInteger("channel-count"), 16, mediaFormatE.getLong("durationUs") / ((long) 1000));
                    final int i7 = this.f7370b;
                    AudioTrack audioTrackA = a.a(aVar, cVar, i7, this.f7371c, new h9.a() { // from class: k7.k
                        @Override // h9.a
                        public final Object invoke() {
                            hc.c cVar2 = n8.c.f8897a;
                            n8.c.j(0, "音频通道 " + i7 + " 无效");
                            return z.f12851a;
                        }
                    }, 8);
                    n.f7375b = audioTrackA;
                    if (audioTrackA != null) {
                        audioTrackA.play();
                    }
                    Logger.INSTANCE.d(Constants.TAG, "【音频测试】开始播放");
                    n.f7377d = true;
                    n.a(mediaExtractor, mediaCodecB, bufferInfo);
                    return zVar;
                } catch (Exception e7) {
                    e = e7;
                    Logger.Companion companion = Logger.INSTANCE;
                    Object[] objArr = new Object[1];
                    objArr[c10] = "【音频测试】播放异常: " + e.getMessage();
                    companion.e(Constants.TAG, objArr);
                    return zVar;
                }
            } catch (Exception e10) {
                e = e10;
                c10 = 0;
            }
        } finally {
            n.d();
        }
    }
}
