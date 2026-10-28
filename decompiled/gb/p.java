package gb;

import aa.s0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements o {
    @Override // gb.q
    public x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return null;
    }

    @Override // gb.o
    public Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return w.f13122a;
    }

    @Override // gb.o
    public Set c() {
        Collection collectionD = d(f.f6176p, wb.c.f14285a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof s0) {
                wa.e name = ((s0) obj).getName();
                i9.l.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // gb.q
    public Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return w.f13122a;
    }

    @Override // gb.o
    public Set e() {
        return null;
    }

    @Override // gb.o
    public Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return w.f13122a;
    }

    @Override // gb.o
    public Set g() {
        Collection collectionD = d(f.f6177q, wb.c.f14285a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof s0) {
                wa.e name = ((s0) obj).getName();
                i9.l.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
