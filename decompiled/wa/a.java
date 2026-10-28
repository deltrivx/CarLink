package wa;

import i9.l;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f14235b;

    static {
        e eVar = g.f14256f;
        c cVar = c.f14239c;
        n4.h.h0(eVar);
    }

    public a(c cVar, e eVar) {
        l.e(cVar, "packageName");
        this.f14234a = cVar;
        this.f14235b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f14234a, aVar.f14234a) && this.f14235b.equals(aVar.f14235b);
    }

    public final int hashCode() {
        return this.f14235b.hashCode() + ((this.f14234a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return q.m0(this.f14234a.f14240a.f14243a, '.', '/') + "/" + this.f14235b;
    }
}
