package androidx.compose.ui.draw;

import d2.b;
import h9.k;
import o2.i;
import r1.c;
import r1.d;
import r1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, k kVar) {
        return pVar.a(new DrawBehindElement(kVar));
    }

    public static final p b(p pVar, k kVar) {
        return pVar.a(new DrawWithCacheElement(kVar));
    }

    public static final p c(p pVar, k kVar) {
        return pVar.a(new DrawWithContentElement(kVar));
    }

    public static p d(p pVar, b bVar, d dVar, i iVar, float f10, y1.k kVar, int i7) {
        if ((i7 & 4) != 0) {
            dVar = c.f11096e;
        }
        return pVar.a(new PainterElement(bVar, dVar, iVar, (i7 & 16) != 0 ? 1.0f : f10, kVar));
    }
}
