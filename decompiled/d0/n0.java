package d0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements o2.m0, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.g f3601b;

    public n0(e eVar, r1.g gVar) {
        this.f3600a = eVar;
        this.f3601b = gVar;
    }

    @Override // o2.m0
    public final int a(o2.r rVar, List list, int i7) {
        int iA0 = rVar.a0(this.f3600a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            o2.l0 l0Var = (o2.l0) list.get(i11);
            float fC = c.c(c.b(l0Var));
            int iM = l0Var.m(i7);
            if (fC == 0.0f) {
                i10 += iM;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iM / fC));
            }
        }
        return ((list.size() - 1) * iA0) + Math.round(iMax * f10) + i10;
    }

    @Override // d0.j0
    public final int b(o2.v0 v0Var) {
        return v0Var.f9436b;
    }

    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        return c.d(this, n3.a.j(j5), n3.a.i(j5), n3.a.h(j5), n3.a.g(j5), o0Var.a0(this.f3600a.a()), o0Var, list, new o2.v0[list.size()], list.size());
    }

    @Override // d0.j0
    public final long d(int i7, int i10, int i11, boolean z10) {
        return !z10 ? n3.b.a(i7, i10, 0, i11) : g5.a.D(i7, i10, 0, i11);
    }

    @Override // d0.j0
    public final o2.n0 e(o2.v0[] v0VarArr, o2.o0 o0Var, int[] iArr, int i7, int i10) {
        return o0Var.i(i7, i10, u8.x.f13123a, new m0(v0VarArr, this, i10, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return i9.l.a(this.f3600a, n0Var.f3600a) && i9.l.a(this.f3601b, n0Var.f3601b);
    }

    @Override // o2.m0
    public final int f(o2.r rVar, List list, int i7) {
        int iA0 = rVar.a0(this.f3600a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            o2.l0 l0Var = (o2.l0) list.get(i11);
            float fC = c.c(c.b(l0Var));
            int iR = l0Var.r(i7);
            if (fC == 0.0f) {
                i10 += iR;
            } else if (fC > 0.0f) {
                f10 += fC;
                iMax = Math.max(iMax, Math.round(iR / fC));
            }
        }
        return ((list.size() - 1) * iA0) + Math.round(iMax * f10) + i10;
    }

    @Override // d0.j0
    public final int g(o2.v0 v0Var) {
        return v0Var.f9435a;
    }

    @Override // o2.m0
    public final int h(o2.r rVar, List list, int i7) {
        int iA0 = rVar.a0(this.f3600a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iA0, i7);
        int size = list.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            o2.l0 l0Var = (o2.l0) list.get(i10);
            float fC = c.c(c.b(l0Var));
            if (fC == 0.0f) {
                int iMin2 = Math.min(l0Var.r(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, l0Var.c(iMin2));
            } else if (fC > 0.0f) {
                f10 += fC;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            o2.l0 l0Var2 = (o2.l0) list.get(i11);
            float fC2 = c.c(c.b(l0Var2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, l0Var2.c(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f3601b.hashCode() + (this.f3600a.hashCode() * 31);
    }

    @Override // d0.j0
    public final void i(int i7, o2.o0 o0Var, int[] iArr, int[] iArr2) {
        this.f3600a.c(o0Var, i7, iArr, o0Var.getLayoutDirection(), iArr2);
    }

    @Override // o2.m0
    public final int j(o2.r rVar, List list, int i7) {
        int iA0 = rVar.a0(this.f3600a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iA0, i7);
        int size = list.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            o2.l0 l0Var = (o2.l0) list.get(i10);
            float fC = c.c(c.b(l0Var));
            if (fC == 0.0f) {
                int iMin2 = Math.min(l0Var.r(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, l0Var.H(iMin2));
            } else if (fC > 0.0f) {
                f10 += fC;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            o2.l0 l0Var2 = (o2.l0) list.get(i11);
            float fC2 = c.c(c.b(l0Var2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, l0Var2.H(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f3600a + ", verticalAlignment=" + this.f3601b + ')';
    }
}
