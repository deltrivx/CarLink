package jb;

import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.f f7007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra.k f7008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta.a f7009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f7010d;

    public d(ta.f fVar, ra.k kVar, ta.a aVar, n0 n0Var) {
        i9.l.e(fVar, "nameResolver");
        i9.l.e(kVar, "classProto");
        i9.l.e(n0Var, "sourceElement");
        this.f7007a = fVar;
        this.f7008b = kVar;
        this.f7009c = aVar;
        this.f7010d = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i9.l.a(this.f7007a, dVar.f7007a) && i9.l.a(this.f7008b, dVar.f7008b) && i9.l.a(this.f7009c, dVar.f7009c) && i9.l.a(this.f7010d, dVar.f7010d);
    }

    public final int hashCode() {
        return this.f7010d.hashCode() + ((this.f7009c.hashCode() + ((this.f7008b.hashCode() + (this.f7007a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f7007a + ", classProto=" + this.f7008b + ", metadataVersion=" + this.f7009c + ", sourceElement=" + this.f7010d + ')';
    }
}
