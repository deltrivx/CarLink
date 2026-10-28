package w0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f13815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3.o0 f13817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3.q f13818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1 f13819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b3.h f13821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g3.w f13822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0.s1 f13823i;

    public j1(g3.w wVar, g3.q qVar, l0.s1 s1Var, x1 x1Var) {
        b3.h hVar = wVar.f5889a;
        long j5 = wVar.f5890b;
        b3.o0 o0Var = s1Var != null ? s1Var.f7828a : null;
        this.f13815a = hVar;
        this.f13816b = j5;
        this.f13817c = o0Var;
        this.f13818d = qVar;
        this.f13819e = x1Var;
        this.f13820f = j5;
        this.f13821g = hVar;
        this.f13822h = wVar;
        this.f13823i = s1Var;
    }

    public final List a(h9.k kVar) {
        if (!b3.q0.c(this.f13820f)) {
            return n3.l.J(new g3.a(0, ""), new g3.v(b3.q0.f(this.f13820f), b3.q0.f(this.f13820f)));
        }
        g3.g gVar = (g3.g) kVar.invoke(this);
        if (gVar != null) {
            return n3.l.I(gVar);
        }
        return null;
    }

    public final Integer b() {
        b3.o0 o0Var = this.f13817c;
        if (o0Var == null) {
            return null;
        }
        b3.p pVar = o0Var.f1409b;
        int iE = b3.q0.e(this.f13820f);
        g3.q qVar = this.f13818d;
        return Integer.valueOf(qVar.a(pVar.c(pVar.d(qVar.b(iE)), true)));
    }

    public final Integer c() {
        b3.o0 o0Var = this.f13817c;
        if (o0Var == null) {
            return null;
        }
        int iF = b3.q0.f(this.f13820f);
        g3.q qVar = this.f13818d;
        return Integer.valueOf(qVar.a(o0Var.g(o0Var.f1409b.d(qVar.b(iF)))));
    }

    public final Integer d() {
        int length;
        b3.o0 o0Var = this.f13817c;
        if (o0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            b3.h hVar = this.f13815a;
            if (iR < hVar.f1353b.length()) {
                int length2 = this.f13821g.f1353b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j5 = o0Var.j(length2);
                int i7 = b3.q0.f1429c;
                int i10 = (int) (j5 & 4294967295L);
                if (i10 > iR) {
                    length = this.f13818d.a(i10);
                    break;
                }
                iR++;
            } else {
                length = hVar.f1353b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iA;
        b3.o0 o0Var = this.f13817c;
        if (o0Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.f13821g.f1353b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j5 = o0Var.j(length);
            int i7 = b3.q0.f1429c;
            int i10 = (int) (j5 >> 32);
            if (i10 < iR) {
                iA = this.f13818d.a(i10);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean f() {
        b3.o0 o0Var = this.f13817c;
        return (o0Var != null ? o0Var.h(r()) : null) != m3.j.f8417b;
    }

    public final int g(b3.o0 o0Var, int i7) {
        int iR = r();
        x1 x1Var = this.f13819e;
        if (x1Var.f14008a == null) {
            x1Var.f14008a = Float.valueOf(o0Var.c(iR).f14523a);
        }
        b3.p pVar = o0Var.f1409b;
        int iD = pVar.d(iR) + i7;
        if (iD < 0) {
            return 0;
        }
        if (iD >= pVar.f1419f) {
            return this.f13821g.f1353b.length();
        }
        float fB = pVar.b(iD) - 1;
        Float f10 = x1Var.f14008a;
        i9.l.b(f10);
        float fFloatValue = f10.floatValue();
        if ((f() && fFloatValue >= o0Var.f(iD)) || (!f() && fFloatValue <= o0Var.e(iD))) {
            return pVar.c(iD, true);
        }
        return this.f13818d.a(pVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f10.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(l0.s1 s1Var, int i7) {
        x1.c cVarH;
        o2.w wVar = s1Var.f7829b;
        b3.o0 o0Var = s1Var.f7828a;
        if (wVar == null) {
            cVarH = x1.c.f14522e;
        } else {
            o2.w wVar2 = s1Var.f7830c;
            cVarH = wVar2 != null ? wVar2.h(wVar, true) : null;
            if (cVarH == null) {
                cVarH = x1.c.f14522e;
            }
        }
        long j5 = this.f13822h.f5890b;
        int i10 = b3.q0.f1429c;
        int i11 = (int) (j5 & 4294967295L);
        g3.q qVar = this.f13818d;
        x1.c cVarC = o0Var.c(qVar.b(i11));
        float f10 = cVarC.f14523a;
        return qVar.a(o0Var.f1409b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVarH.c() & 4294967295L)) * i7) + cVarC.f14524b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
    }

    public final void i() {
        x1 x1Var = this.f13819e;
        x1Var.f14008a = null;
        b3.h hVar = this.f13821g;
        if (hVar.f1353b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            x1Var.f14008a = null;
            if (hVar.f1353b.length() > 0) {
                String str = hVar.f1353b;
                long j5 = this.f13820f;
                int i7 = b3.q0.f1429c;
                int iO = l0.q0.o((int) (j5 & 4294967295L), str);
                if (iO != -1) {
                    q(iO, iO);
                }
            }
        }
    }

    public final void j() {
        this.f13819e.f14008a = null;
        b3.h hVar = this.f13821g;
        String str = hVar.f1353b;
        String str2 = hVar.f1353b;
        if (str.length() > 0) {
            int iP = l0.q0.p(str2, b3.q0.e(this.f13820f));
            if (iP == b3.q0.e(this.f13820f) && iP != str2.length()) {
                iP = l0.q0.p(str2, iP + 1);
            }
            q(iP, iP);
        }
    }

    public final void k() {
        this.f13819e.f14008a = null;
        b3.h hVar = this.f13821g;
        if (hVar.f1353b.length() > 0) {
            String str = hVar.f1353b;
            long j5 = this.f13820f;
            int i7 = b3.q0.f1429c;
            int iR = l0.q0.r((int) (j5 & 4294967295L), str);
            if (iR != -1) {
                q(iR, iR);
            }
        }
    }

    public final void l() {
        this.f13819e.f14008a = null;
        b3.h hVar = this.f13821g;
        String str = hVar.f1353b;
        String str2 = hVar.f1353b;
        if (str.length() > 0) {
            int iQ = l0.q0.q(str2, b3.q0.f(this.f13820f));
            if (iQ == b3.q0.f(this.f13820f) && iQ != 0) {
                iQ = l0.q0.q(str2, iQ - 1);
            }
            q(iQ, iQ);
        }
    }

    public final void m() {
        x1 x1Var = this.f13819e;
        x1Var.f14008a = null;
        b3.h hVar = this.f13821g;
        if (hVar.f1353b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            x1Var.f14008a = null;
            if (hVar.f1353b.length() > 0) {
                String str = hVar.f1353b;
                long j5 = this.f13820f;
                int i7 = b3.q0.f1429c;
                int iO = l0.q0.o((int) (j5 & 4294967295L), str);
                if (iO != -1) {
                    q(iO, iO);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f13819e.f14008a = null;
        if (this.f13821g.f1353b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f13819e.f14008a = null;
        if (this.f13821g.f1353b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f13821g.f1353b.length() > 0) {
            int i7 = b3.q0.f1429c;
            this.f13820f = b3.g0.b((int) (this.f13816b >> 32), (int) (this.f13820f & 4294967295L));
        }
    }

    public final void q(int i7, int i10) {
        this.f13820f = b3.g0.b(i7, i10);
    }

    public final int r() {
        long j5 = this.f13820f;
        int i7 = b3.q0.f1429c;
        return this.f13818d.b((int) (j5 & 4294967295L));
    }
}
