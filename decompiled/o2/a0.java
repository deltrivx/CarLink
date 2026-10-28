package o2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements i1, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f9289b;

    public a0(i0 i0Var) {
        this.f9289b = i0Var;
        this.f9288a = i0Var.f9348h;
    }

    @Override // n3.c
    public final long F(float f10) {
        return this.f9288a.F(f10);
    }

    @Override // n3.c
    public final float J(int i7) {
        return this.f9288a.J(i7);
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / this.f9288a.a();
    }

    @Override // o2.o0
    public final n0 M(int i7, int i10, Map map, h9.k kVar, h9.k kVar2) {
        return this.f9288a.M(i7, i10, map, kVar, kVar2);
    }

    @Override // n3.c
    public final float O() {
        return this.f9288a.f9314c;
    }

    @Override // o2.r
    public final boolean Q() {
        return this.f9288a.Q();
    }

    @Override // n3.c
    public final float R(float f10) {
        return this.f9288a.a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f9288a.f9313b;
    }

    @Override // n3.c
    public final int a0(float f10) {
        d0 d0Var = this.f9288a;
        d0Var.getClass();
        return a2.f.j(f10, d0Var);
    }

    @Override // o2.i1
    public final List b0(h9.n nVar, Object obj) {
        i0 i0Var = this.f9289b;
        s.h0 h0Var = i0Var.f9351l;
        s.h0 h0Var2 = i0Var.f9350j;
        q2.h0 h0Var3 = i0Var.f9341a;
        s.h0 h0Var4 = i0Var.f9347g;
        q2.h0 h0Var5 = (q2.h0) h0Var4.g(obj);
        if (h0Var5 != null && ((h1.e) ((h1.b) h0Var3.o()).f6413b).j(h0Var5) < i0Var.f9344d) {
            return h0Var5.m();
        }
        h1.e eVar = i0Var.f9352m;
        if (eVar.f6423c < i0Var.f9345e) {
            n2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i7 = eVar.f6423c;
        int i10 = i0Var.f9345e;
        if (i7 == i10) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f6421a;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        i0Var.f9345e++;
        if (h0Var2.b(obj)) {
            q2.h0 h0Var6 = (q2.h0) h0Var2.g(obj);
            b0 b0Var = h0Var6 != null ? (b0) i0Var.f9346f.g(h0Var6) : null;
            if (b0Var != null && b0Var.f9295d) {
                i0Var.h(h0Var6, obj, false, nVar);
            }
        } else {
            if (h0Var3.I()) {
                i0Var.e();
                if (!h0Var4.c(obj)) {
                    h0Var.k(obj);
                    Object objG = h0Var2.g(obj);
                    if (objG == null) {
                        objG = i0Var.i(obj);
                        if (objG != null) {
                            int iJ = ((h1.e) ((h1.b) h0Var3.o()).f6413b).j(objG);
                            int i11 = ((h1.e) ((h1.b) h0Var3.o()).f6413b).f6423c;
                            h0Var3.f10681p = true;
                            h0Var3.M(iJ, i11, 1);
                            h0Var3.f10681p = false;
                            i0Var.f9354o++;
                        } else {
                            int i12 = ((h1.e) ((h1.b) h0Var3.o()).f6413b).f6423c;
                            q2.h0 h0Var7 = new q2.h0(2);
                            h0Var3.f10681p = true;
                            h0Var3.B(i12, h0Var7);
                            h0Var3.f10681p = false;
                            i0Var.f9354o++;
                            objG = h0Var7;
                        }
                        h0Var2.m(obj, objG);
                    }
                    i0Var.h((q2.h0) objG, obj, false, nVar);
                }
            }
            h0Var.m(obj, !h0Var3.I() ? new g0() : new h0(i0Var, obj));
            if (h0Var3.F.f10732d == q2.d0.f10608c) {
                h0Var3.S(true);
            } else {
                q2.h0.T(h0Var3, true, 6);
            }
        }
        q2.h0 h0Var8 = (q2.h0) h0Var2.g(obj);
        if (h0Var8 == null) {
            return u8.w.f13122a;
        }
        List listY = h0Var8.F.f10743p.Y();
        h1.b bVar = (h1.b) listY;
        int i13 = ((h1.e) bVar.f6413b).f6423c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((q2.y0) bVar.get(i14)).f10849f.f10730b = true;
        }
        return listY;
    }

    @Override // n3.c
    public final long e0(long j5) {
        d0 d0Var = this.f9288a;
        d0Var.getClass();
        return a2.f.n(j5, d0Var);
    }

    @Override // o2.r
    public final n3.o getLayoutDirection() {
        return this.f9288a.f9312a;
    }

    @Override // n3.c
    public final float h0(long j5) {
        d0 d0Var = this.f9288a;
        d0Var.getClass();
        return a2.f.m(j5, d0Var);
    }

    @Override // o2.o0
    public final n0 i(int i7, int i10, Map map, h9.k kVar) {
        return this.f9288a.M(i7, i10, map, null, kVar);
    }

    @Override // n3.c
    public final long o(long j5) {
        d0 d0Var = this.f9288a;
        d0Var.getClass();
        return a2.f.l(j5, d0Var);
    }

    @Override // n3.c
    public final float s(long j5) {
        d0 d0Var = this.f9288a;
        d0Var.getClass();
        return a2.f.k(j5, d0Var);
    }
}
