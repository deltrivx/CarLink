package nb;

import f1.y0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k0, qb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f9045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9047c;

    public v(AbstractCollection abstractCollection) {
        i9.l.e(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f9046b = linkedHashSet;
        this.f9047c = linkedHashSet.hashCode();
    }

    public final a0 b() {
        h0.f8997b.getClass();
        return c.v(h0.f8998c, this, u8.w.f13122a, false, i2.c.t(this.f9046b, "member scope for intersection type"), new aa.a(22, this));
    }

    public final String c(h9.k kVar) {
        i9.l.e(kVar, "getProperTypeRelatedToStringify");
        return u8.p.q0(u8.p.E0(this.f9046b, new u(0, kVar)), " & ", "{", "}", new y0(kVar, 1), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return i9.l.a(this.f9046b, ((v) obj).f9046b);
    }

    public final int hashCode() {
        return this.f9047c;
    }

    @Override // nb.k0
    public final u9.i k() {
        u9.i iVarK = ((w) this.f9046b.iterator().next()).D0().k();
        i9.l.d(iVarK, "getBuiltIns(...)");
        return iVarK;
    }

    @Override // nb.k0
    public final x9.h l() {
        return null;
    }

    @Override // nb.k0
    public final Collection m() {
        return this.f9046b;
    }

    @Override // nb.k0
    public final List n() {
        return u8.w.f13122a;
    }

    @Override // nb.k0
    public final boolean o() {
        return false;
    }

    public final String toString() {
        return c(t.f9036b);
    }
}
