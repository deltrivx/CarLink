package androidx.compose.foundation.text.contextmenu.modifier;

import h9.k;
import h9.n;
import l0.o0;
import n3.u;
import o2.d1;
import o2.w;
import r1.p;
import w0.l1;
import x1.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, n nVar) {
        return pVar.a(new AddTextContextMenuDataComponentsWithContextElement(nVar));
    }

    public static final p b(k kVar) {
        return new TextContextMenuGestureElement(kVar);
    }

    public static final p c(p pVar, o0 o0Var, k kVar, l1 l1Var, k kVar2) {
        return pVar.a(new TextContextMenuToolbarHandlerElement(o0Var, kVar, l1Var, kVar2));
    }

    public static final c d(c cVar, w wVar, w wVar2) {
        if (!wVar.isAttached() || !wVar2.isAttached()) {
            return c.f14522e;
        }
        return u.c(wVar2.n(d1.g(wVar), cVar.d()), cVar.c());
    }
}
