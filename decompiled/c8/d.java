package c8;

import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.h f2478a = v7.h.f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.f f2479b = v7.f.Tasker;

    @Override // v7.e
    public final void a() {
    }

    @Override // v7.e
    public final void b(int i7, f1.s sVar) {
        sVar.Y(1199933040);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            f0.f2498a.c(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 1, this);
        }
    }

    @Override // v7.e
    public final void c(int i7, f1.s sVar) {
        n3.l.c(sVar);
    }

    @Override // v7.e
    public final v7.h d() {
        return this.f2478a;
    }

    @Override // v7.e
    public final int e() {
        return 0;
    }

    @Override // v7.e
    public final int f() {
        return 999;
    }

    @Override // v7.e
    public final String g() {
        return "";
    }

    @Override // v7.e
    public final v7.f h() {
        return this.f2479b;
    }

    @Override // v7.e
    public final void i(int i7, f1.s sVar) {
        n3.l.g(sVar);
    }
}
