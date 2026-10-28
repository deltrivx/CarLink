package o7;

import com.baidu.carlife.sdk.receiver.CarLife;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9500a = "CarLife设置";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9501b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9502c = 3;

    @Override // v7.e
    public final void a() {
        CarLife.receiver().registerTransportListener(new m());
    }

    @Override // v7.e
    public final void b(int i7, f1.s sVar) {
        n3.l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, f1.s sVar) {
        sVar.Y(-1558610404);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            j.f9496a.d(6, sVar);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new k(this, i7, 0);
        }
    }

    @Override // v7.e
    public final v7.h d() {
        return v7.h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return this.f9501b;
    }

    @Override // v7.e
    public final int f() {
        return this.f9502c;
    }

    @Override // v7.e
    public final String g() {
        return this.f9500a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, f1.s sVar) {
        sVar.Y(-1236926503);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            j.f9497b.g(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new k(this, i7, 1);
        }
    }
}
