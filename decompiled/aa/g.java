package aa;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements nb.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f336a;

    public g(h hVar) {
        this.f336a = hVar;
    }

    @Override // nb.k0
    public final u9.i k() {
        return db.e.e(this.f336a);
    }

    @Override // nb.k0
    public final x9.h l() {
        return this.f336a;
    }

    @Override // nb.k0
    public final Collection m() {
        Collection collectionM = ((lb.s) this.f336a).E0().D0().m();
        i9.l.d(collectionM, "getSupertypes(...)");
        return collectionM;
    }

    @Override // nb.k0
    public final List n() {
        List list = ((lb.s) this.f336a).f8365p;
        if (list != null) {
            return list;
        }
        i9.l.j("typeConstructorParameters");
        throw null;
    }

    @Override // nb.k0
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f336a.getName().b() + ']';
    }
}
