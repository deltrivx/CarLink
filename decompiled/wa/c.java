package wa;

import i9.l;
import zb.j;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f14239c = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f14241b;

    public c(String str) {
        l.e(str, "fqName");
        this.f14240a = new d(str, this);
    }

    public c(d dVar) {
        this.f14240a = dVar;
    }

    public c(d dVar, c cVar) {
        this.f14240a = dVar;
        this.f14241b = cVar;
    }

    public final c a(e eVar) {
        l.e(eVar, "name");
        return new c(this.f14240a.a(eVar), this);
    }

    public final c b() {
        c cVar = this.f14241b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f14240a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        d dVar2 = dVar.f14245c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f14245c;
            l.b(dVar2);
        }
        c cVar2 = new c(dVar2);
        this.f14241b = cVar2;
        return cVar2;
    }

    public final boolean c(e eVar) {
        l.e(eVar, "segment");
        d dVar = this.f14240a;
        dVar.getClass();
        String str = dVar.f14243a;
        if (!dVar.c()) {
            int iZ0 = j.z0(str, '.', 0, 6);
            if (iZ0 == -1) {
                iZ0 = str.length();
            }
            int i7 = iZ0;
            String strB = eVar.b();
            l.d(strB, "asString(...)");
            if (i7 == strB.length() && q.k0(0, 0, i7, dVar.f14243a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f14240a, ((c) obj).f14240a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14240a.f14243a.hashCode();
    }

    public final String toString() {
        return this.f14240a.toString();
    }
}
