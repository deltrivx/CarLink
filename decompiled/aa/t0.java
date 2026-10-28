package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends gb.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.y f434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.c f435c;

    public t0(x9.y yVar, wa.c cVar) {
        i9.l.e(yVar, "moduleDescriptor");
        i9.l.e(cVar, "fqName");
        this.f434b = yVar;
        this.f435c = cVar;
    }

    @Override // gb.p, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        if (fVar.a(gb.f.f6169h)) {
            wa.c cVar = this.f435c;
            if (!cVar.f14240a.c() || !fVar.f6180a.contains(gb.c.f6161a)) {
                x9.y yVar = this.f434b;
                Collection collectionH = yVar.h(cVar, kVar);
                ArrayList arrayList = new ArrayList(collectionH.size());
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    wa.e eVarF = ((wa.c) it.next()).f14240a.f();
                    if (((Boolean) kVar.invoke(eVarF)).booleanValue()) {
                        c0 c0Var = null;
                        if (!eVarF.f14248b) {
                            c0 c0Var2 = (c0) yVar.F(cVar.a(eVarF));
                            if (!((Boolean) k9.a.z(c0Var2.f325f, c0.f321h[1])).booleanValue()) {
                                c0Var = c0Var2;
                            }
                        }
                        wb.l.a(arrayList, c0Var);
                    }
                }
                return arrayList;
            }
        }
        return u8.w.f13122a;
    }

    @Override // gb.p, gb.o
    public final Set e() {
        return u8.y.f13124a;
    }

    public final String toString() {
        return "subpackages of " + this.f435c + " from " + this.f434b;
    }
}
