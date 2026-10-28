package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import u8.w;
import x9.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f6187b;

    public i(o oVar) {
        i9.l.e(oVar, "workerScope");
        this.f6187b = oVar;
    }

    @Override // gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        x9.h hVarA = this.f6187b.a(eVar, bVar);
        if (hVarA != null) {
            x9.e eVar2 = hVarA instanceof x9.e ? (x9.e) hVarA : null;
            if (eVar2 != null) {
                return eVar2;
            }
            if (hVarA instanceof q0) {
                return (q0) hVarA;
            }
        }
        return null;
    }

    @Override // gb.p, gb.o
    public final Set c() {
        return this.f6187b.c();
    }

    @Override // gb.p, gb.q
    public final Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        int i7 = f.f6172l & fVar.f6181b;
        f fVar2 = i7 == 0 ? null : new f(i7, fVar.f6180a);
        if (fVar2 == null) {
            return w.f13122a;
        }
        Collection collectionD = this.f6187b.d(fVar2, kVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionD) {
            if (obj instanceof x9.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // gb.p, gb.o
    public final Set e() {
        return this.f6187b.e();
    }

    @Override // gb.p, gb.o
    public final Set g() {
        return this.f6187b.g();
    }

    public final String toString() {
        return "Classes from " + this.f6187b;
    }
}
