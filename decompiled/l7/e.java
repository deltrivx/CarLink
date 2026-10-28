package l7;

import android.media.AudioRecord;
import cc.b0;
import cc.k0;
import cc.o1;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f8084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f8085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioRecord f8086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1 f8087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f8088e;

    public e(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        this.f8084a = carLifeContext;
    }

    public final void a() {
        AudioRecord audioRecord;
        y8.c cVar = null;
        if (f.a(n8.a.b(), "android.permission.RECORD_AUDIO") != 0) {
            Logger.INSTANCE.e("CarLife_Vehicle", "缺少录音权限，无法启动录音");
            audioRecord = null;
        } else {
            audioRecord = new AudioRecord(6, 16000, 16, 2, 65536);
        }
        this.f8086c = audioRecord;
        c cVar2 = new c(this.f8084a);
        jc.e eVar = k0.f2635a;
        jc.d dVar = jc.d.f7117c;
        b0.s(b0.a(dVar), null, new b1.f(cVar2, cVar, 6), 3);
        this.f8085b = cVar2;
        this.f8087d = b0.s(b0.a(dVar), null, new d(this, null), 3);
    }
}
