package androidx.compose.foundation;

import android.view.KeyEvent;
import b0.k;
import r1.m;
import r1.p;
import x.g0;
import x.n0;
import x.r0;
import x.t;
import y1.h0;
import y1.l0;
import y1.z;
import z.h;
import z.n1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static p a(p pVar, z zVar) {
        return pVar.a(new BackgroundElement(0L, zVar, h0.f14898a, 1));
    }

    public static final p b(p pVar, long j5, l0 l0Var) {
        return pVar.a(new BackgroundElement(j5, null, l0Var, 2));
    }

    public static p c(p pVar, k kVar, n0 n0Var, boolean z10, h9.a aVar, int i7) {
        p pVarA;
        boolean z11 = (i7 & 4) != 0 ? true : z10;
        if (n0Var instanceof r0) {
            pVarA = new ClickableElement(kVar, (r0) n0Var, false, z11, null, aVar);
        } else if (n0Var == null) {
            pVarA = new ClickableElement(kVar, null, false, z11, null, aVar);
        } else {
            m mVar = m.f11116a;
            pVarA = kVar != null ? c.a(mVar, kVar, n0Var).a(new ClickableElement(kVar, null, false, z11, null, aVar)) : r1.a.a(mVar, new b(n0Var, z11, aVar));
        }
        return pVar.a(pVarA);
    }

    public static p d(p pVar, String str, h9.a aVar, int i7) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        return pVar.a(new ClickableElement(null, null, true, true, str, aVar));
    }

    public static p e(p pVar, k kVar, h9.a aVar, h9.a aVar2) {
        return pVar.a(new CombinedClickableElement(kVar, aVar2, aVar));
    }

    public static final p f(p pVar, boolean z10, k kVar) {
        return pVar.a(z10 ? new FocusableElement(kVar) : m.f11116a);
    }

    public static p g(p pVar, k kVar) {
        return pVar.a(new HoverableElement(kVar));
    }

    public static final boolean h(KeyEvent keyEvent) {
        long jF = i2.c.F(keyEvent);
        int i7 = i2.a.f6599p;
        return i2.a.a(jF, i2.a.f6592h) || i2.a.a(jF, i2.a.k) || i2.a.a(jF, i2.a.f6598o) || i2.a.a(jF, i2.a.f6594j);
    }

    public static p i(p pVar, n1 n1Var, x0 x0Var, boolean z10, h hVar, k kVar, boolean z11, x.h hVar2) {
        float f10 = t.f14476a;
        x0 x0Var2 = x0.f15591a;
        m mVar = m.f11116a;
        return pVar.a(x0Var == x0Var2 ? n4.h.o(mVar, g0.f14368c) : n4.h.o(mVar, g0.f14367b)).a(new ScrollingContainerElement(kVar, hVar2, hVar, x0Var, n1Var, z10, z11));
    }
}
