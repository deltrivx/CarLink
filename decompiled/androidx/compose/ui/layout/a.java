package androidx.compose.ui.layout;

import h9.k;
import h9.o;
import o2.l0;
import o2.x;
import r1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(l0 l0Var) {
        Object objW = l0Var.w();
        x xVar = objW instanceof x ? (x) objW : null;
        if (xVar != null) {
            return xVar.f9443o;
        }
        return null;
    }

    public static final p b(o oVar) {
        return new LayoutElement(oVar);
    }

    public static final p c(p pVar, Object obj) {
        return pVar.a(new LayoutIdElement(obj));
    }

    public static final p d(p pVar, k kVar) {
        return pVar.a(new OnGloballyPositionedElement(kVar));
    }

    public static final p e(p pVar, k kVar) {
        return pVar.a(new OnSizeChangedModifier(kVar));
    }
}
