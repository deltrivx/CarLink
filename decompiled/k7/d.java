package k7;

import android.media.AudioTrack;
import android.os.Build;
import b3.i0;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f7346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n7.f f7347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f7348e = h.f7355c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f7349f;

    public d(int i7, g gVar) {
        this.f7344a = i7;
        this.f7345b = gVar;
    }

    public final void a(CarLifeMessage carLifeMessage) {
        n7.f fVar = this.f7347d;
        if (fVar == null || carLifeMessage.getPayloadSize() == 0) {
            return;
        }
        carLifeMessage.acquire();
        fVar.f8878c.offer(carLifeMessage);
    }

    @Override // m7.a
    public final m7.j b() {
        return i2.c.B();
    }

    public final void c(n7.f fVar) {
        if (this.f7347d != null) {
            f();
        }
        this.f7347d = fVar;
        d(fVar);
    }

    public final void d(n7.d dVar) {
        i9.l.e(dVar, "source");
        Thread thread = new Thread(new c.n(4, this, dVar));
        thread.setName("Carlife-Audio-Player-" + this.f7344a);
        thread.start();
        this.f7349f = thread;
    }

    public final void e(Float f10) {
        float fFloatValue = f10 != null ? f10.floatValue() : i2.c.B().f8593b / 100.0f;
        AudioTrack audioTrack = this.f7346c;
        if (audioTrack != null) {
            audioTrack.setVolume(fFloatValue);
        }
    }

    public final void f() {
        h hVar = this.f7348e;
        h hVar2 = h.f7359g;
        if (hVar == hVar2) {
            return;
        }
        h(hVar2);
        n7.f fVar = this.f7347d;
        if (fVar != null) {
            fVar.close();
        }
        this.f7347d = null;
        Thread thread = this.f7349f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f7349f = null;
        AudioTrack audioTrack = this.f7346c;
        if (audioTrack != null) {
            try {
                if (audioTrack.getPlayState() == 3) {
                    audioTrack.stop();
                }
            } catch (IllegalStateException e7) {
                Logger.INSTANCE.e(Constants.TAG, "【音频播放】停止播放异常-" + this.f7344a + ": " + e7.getMessage());
            }
        }
        this.f7346c = null;
    }

    public final void g(n7.d dVar) {
        int iA = dVar.k().a();
        k6.a aVar = new k6.a();
        aVar.f7310a = new byte[iA];
        int i7 = -1;
        while (!dVar.isClosed() && this.f7348e != h.f7359g) {
            aVar.f7311b = 0;
            int i10 = dVar.i(aVar, new i0(14));
            int i11 = this.f7344a;
            if (i10 > 0) {
                AudioTrack audioTrack = this.f7346c;
                if (audioTrack == null || audioTrack.getState() != 1) {
                    Logger.INSTANCE.e(Constants.TAG, a2.f.E(i11, "【音频播放】AudioTrack 未初始化，无法播放-"));
                } else {
                    AudioTrack audioTrack2 = this.f7346c;
                    if (audioTrack2 != null) {
                        audioTrack2.write(aVar.f7310a, 0, i10);
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        AudioTrack audioTrack3 = this.f7346c;
                        int underrunCount = audioTrack3 != null ? audioTrack3.getUnderrunCount() : 0;
                        if (underrunCount > i7) {
                            Logger.INSTANCE.d(Constants.TAG, "【音频播放】欠载次数=" + underrunCount + " (上次=" + i7 + ", 缓存大小=" + dVar.f() + ", 线程=" + Thread.currentThread().getName() + ")");
                            i7 = underrunCount;
                        }
                    }
                    AudioTrack audioTrack4 = this.f7346c;
                    if (audioTrack4 == null || audioTrack4.getPlayState() != 3) {
                        AudioTrack audioTrack5 = this.f7346c;
                        if (audioTrack5 != null) {
                            audioTrack5.play();
                        }
                        h(h.f7357e);
                    }
                }
            } else if (i10 == -1) {
                Logger.INSTANCE.d(Constants.TAG, a2.f.E(i11, "【音频播放】音频流读取完成-"));
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k7.g] */
    public final void h(h hVar) {
        if (this.f7348e != hVar) {
            this.f7348e = hVar;
            this.f7345b.c(hVar);
        }
    }
}
