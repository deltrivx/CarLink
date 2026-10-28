package z7;

import f1.s;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15753a = "显示设置";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15754b = 2;

    @Override // v7.e
    public final void a() {
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
        return this.f15754b;
    }

    @Override // v7.e
    public final int f() {
        return 0;
    }

    @Override // v7.e
    public final String g() {
        return this.f15753a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(-1352928804);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            f.f15752b.b(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new y7.a(i7, 4, this);
        }
    }
}
