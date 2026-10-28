package v7;

import f1.s;
import f1.w1;
import n3.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13638a = h.f13651b;

    @Override // v7.e
    public final void a() {
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        sVar.Y(-57296309);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            c.f13637a.a(6, sVar);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 23, this);
        }
    }

    @Override // v7.e
    public final h d() {
        return this.f13638a;
    }

    @Override // v7.e
    public final int e() {
        return 0;
    }

    @Override // v7.e
    public final int f() {
        return 0;
    }

    @Override // v7.e
    public final String g() {
        return "";
    }

    @Override // v7.e
    public final f h() {
        return f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        l.g(sVar);
    }
}
