package androidx.compose.foundation.selection;

import b0.k;
import r1.p;
import x.n0;
import x.r0;
import y2.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final p a(p pVar, boolean z10, k kVar, boolean z11, g gVar, h9.k kVar2) {
        return pVar.a(new ToggleableElement(z10, kVar, z11, gVar, kVar2));
    }

    public static final p b(a3.a aVar, h9.a aVar2, n0 n0Var, g gVar, boolean z10) {
        if (n0Var instanceof r0) {
            return new TriStateToggleableElement(aVar, null, (r0) n0Var, z10, gVar, aVar2);
        }
        return n0Var == null ? new TriStateToggleableElement(aVar, null, null, z10, gVar, aVar2) : new r1.k(new a(aVar, aVar2, n0Var, gVar, z10));
    }
}
