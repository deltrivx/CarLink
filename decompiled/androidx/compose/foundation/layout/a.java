package androidx.compose.foundation.layout;

import d0.h0;
import n3.o;
import r1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static h0 a(float f10, int i7) {
        float f11 = 0;
        if ((i7 & 2) != 0) {
            f10 = 0;
        }
        return new h0(f11, f10, f11, f10);
    }

    public static final h0 b(float f10, float f11, float f12, float f13) {
        return new h0(f10, f11, f12, f13);
    }

    public static p c(p pVar, float f10) {
        return pVar.a(new AspectRatioElement(f10));
    }

    public static final float d(h0 h0Var, o oVar) {
        return oVar == o.f8749a ? h0Var.a(oVar) : h0Var.b(oVar);
    }

    public static final boolean e(int i7, int i10, long j5) {
        int iJ = n3.a.j(j5);
        if (i7 > n3.a.h(j5) || iJ > i7) {
            return false;
        }
        return i10 <= n3.a.g(j5) && n3.a.i(j5) <= i10;
    }

    public static p f(float f10, float f11, int i7) {
        if ((i7 & 1) != 0) {
            f10 = 0;
        }
        if ((i7 & 2) != 0) {
            f11 = 0;
        }
        return new OffsetElement(f10, f11);
    }

    public static final p g(p pVar, h0 h0Var) {
        return pVar.a(new PaddingValuesElement(h0Var));
    }

    public static final p h(p pVar, float f10) {
        return pVar.a(new PaddingElement(f10, f10, f10, f10));
    }

    public static final p i(p pVar, float f10, float f11) {
        return pVar.a(new PaddingElement(f10, f11, f10, f11));
    }

    public static p j(p pVar, float f10, float f11, int i7) {
        if ((i7 & 1) != 0) {
            f10 = 0;
        }
        if ((i7 & 2) != 0) {
            f11 = 0;
        }
        return i(pVar, f10, f11);
    }

    public static p k(p pVar, float f10, float f11, float f12, float f13, int i7) {
        if ((i7 & 1) != 0) {
            f10 = 0;
        }
        if ((i7 & 2) != 0) {
            f11 = 0;
        }
        if ((i7 & 4) != 0) {
            f12 = 0;
        }
        if ((i7 & 8) != 0) {
            f13 = 0;
        }
        return pVar.a(new PaddingElement(f10, f11, f12, f13));
    }

    public static final p l(p pVar) {
        return pVar.a(new IntrinsicWidthElement());
    }
}
