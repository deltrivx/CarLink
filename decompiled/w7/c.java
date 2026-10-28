package w7;

import f1.s;
import f1.w1;
import n3.l;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14160a = h.f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.f f14161b = v7.f.Permission;

    @Override // v7.e
    public final void a() {
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        sVar.Y(-1318922710);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            f.f14170a.d(6, sVar);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 26, this);
        }
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        l.c(sVar);
    }

    @Override // v7.e
    public final h d() {
        return this.f14160a;
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
        return this.f14161b;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        l.g(sVar);
    }
}
