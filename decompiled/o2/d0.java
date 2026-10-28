package o2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n3.o f9312a = n3.o.f8750b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f9315d;

    public d0(i0 i0Var) {
        this.f9315d = i0Var;
    }

    @Override // n3.c
    public final long F(float f10) {
        return a2.f.o(L(f10), this);
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // o2.o0
    public final n0 M(int i7, int i10, Map map, h9.k kVar, h9.k kVar2) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            n2.a.b("Size(" + i7 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new c0(i7, i10, map, kVar, this, this.f9315d, kVar2);
    }

    @Override // n3.c
    public final float O() {
        return this.f9314c;
    }

    @Override // o2.r
    public final boolean Q() {
        q2.d0 d0Var = this.f9315d.f9341a.F.f10732d;
        return d0Var == q2.d0.f10609d || d0Var == q2.d0.f10607b;
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f9313b;
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    @Override // o2.i1
    public final List b0(h9.n nVar, Object obj) {
        i0 i0Var = this.f9315d;
        i0Var.e();
        q2.h0 h0Var = i0Var.f9341a;
        q2.d0 d0Var = h0Var.F.f10732d;
        q2.d0 d0Var2 = q2.d0.f10608c;
        q2.d0 d0Var3 = q2.d0.f10606a;
        if (d0Var != d0Var3 && d0Var != d0Var2 && d0Var != q2.d0.f10607b && d0Var != q2.d0.f10609d) {
            n2.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        s.h0 h0Var2 = i0Var.f9347g;
        Object objG = h0Var2.g(obj);
        if (objG == null) {
            objG = (q2.h0) i0Var.f9350j.k(obj);
            if (objG != null) {
                if (i0Var.f9354o <= 0) {
                    n2.a.b("Check failed.");
                }
                i0Var.f9354o--;
            } else {
                objG = i0Var.i(obj);
                if (objG == null) {
                    int i7 = i0Var.f9344d;
                    q2.h0 h0Var3 = new q2.h0(2);
                    h0Var.f10681p = true;
                    h0Var.B(i7, h0Var3);
                    h0Var.f10681p = false;
                    objG = h0Var3;
                }
            }
            h0Var2.m(obj, objG);
        }
        q2.h0 h0Var4 = (q2.h0) objG;
        if (u8.p.n0(i0Var.f9344d, h0Var.o()) != h0Var4) {
            int iJ = ((h1.e) ((h1.b) h0Var.o()).f6413b).j(h0Var4);
            if (iJ < i0Var.f9344d) {
                n2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i10 = i0Var.f9344d;
            if (i10 != iJ) {
                h0Var.f10681p = true;
                h0Var.M(iJ, i10, 1);
                h0Var.f10681p = false;
            }
        }
        i0Var.f9344d++;
        i0Var.h(h0Var4, obj, false, nVar);
        return (d0Var == d0Var3 || d0Var == d0Var2) ? h0Var4.m() : h0Var4.l();
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    @Override // o2.r
    public final n3.o getLayoutDirection() {
        return this.f9312a;
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    @Override // o2.o0
    public final n0 i(int i7, int i10, Map map, h9.k kVar) {
        return M(i7, i10, map, null, kVar);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }
}
