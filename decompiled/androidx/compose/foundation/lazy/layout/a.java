package androidx.compose.foundation.lazy.layout;

import h0.k;
import h0.l0;
import h0.o;
import o9.r;
import r1.p;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final p a(o oVar, k kVar, x0 x0Var) {
        return new LazyLayoutBeyondBoundsModifierElement(oVar, kVar, x0Var);
    }

    public static final p b(p pVar, r rVar, l0 l0Var, x0 x0Var, boolean z10) {
        return pVar.a(new LazyLayoutSemanticsModifier(rVar, l0Var, x0Var, z10));
    }
}
