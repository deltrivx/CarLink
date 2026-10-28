package x7;

import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import f1.s;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14628a = "显示设置";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14629b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14630c = 4;

    @Override // v7.e
    public final void a() {
        CarLifeReceiver carLifeReceiverReceiver = CarLife.receiver();
        l lVar = (l) l.f14660o.getValue();
        if (lVar.f14669i == 2) {
            carLifeReceiverReceiver.registerTransportListener(new m(carLifeReceiverReceiver));
        } else {
            int i7 = lVar.f14668h;
            if (i7 != 0) {
                carLifeReceiverReceiver.registerTransportListener(new f(i7));
            }
        }
        int i10 = lVar.f14661a;
        if (i10 != 0) {
            carLifeReceiverReceiver.registerTransportListener(new o(i10));
        }
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        n3.l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        n3.l.c(sVar);
    }

    @Override // v7.e
    public final v7.h d() {
        return v7.h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return this.f14629b;
    }

    @Override // v7.e
    public final int f() {
        return this.f14630c;
    }

    @Override // v7.e
    public final String g() {
        return this.f14628a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(-1219304157);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            k.f14658a.c(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 28, this);
        }
    }
}
