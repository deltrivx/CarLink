package g8;

import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import f1.s;
import f1.w1;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6015a = "CarLife设置";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6016b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6017c = 1;

    @Override // v7.e
    public final void a() {
        CarLifeReceiver carLifeReceiverReceiver = CarLife.receiver();
        l.e(carLifeReceiverReceiver, "context");
        carLifeReceiverReceiver.registerTransportListener(new h8.c());
        Logger.INSTANCE.d("AudioEntry", "【视频模块】注册视频模块");
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        n3.l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        sVar.Y(-945073314);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            d.f6011a.a(6, sVar);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new e(this, i7, 0);
        }
    }

    @Override // v7.e
    public final v7.h d() {
        return v7.h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return this.f6016b;
    }

    @Override // v7.e
    public final int f() {
        return this.f6017c;
    }

    @Override // v7.e
    public final String g() {
        return this.f6015a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(267984001);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            d.f6012b.c(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new e(this, i7, 1);
        }
    }
}
