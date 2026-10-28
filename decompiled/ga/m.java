package ga;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.i f6095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f6096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6097c;

    public m(oa.i iVar, Collection collection) {
        this(iVar, collection, iVar.f9595a == oa.h.f9593c);
    }

    public m(oa.i iVar, Collection collection, boolean z10) {
        i9.l.e(collection, "qualifierApplicabilityTypes");
        this.f6095a = iVar;
        this.f6096b = collection;
        this.f6097c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i9.l.a(this.f6095a, mVar.f6095a) && i9.l.a(this.f6096b, mVar.f6096b) && this.f6097c == mVar.f6097c;
    }

    public final int hashCode() {
        return ((this.f6096b.hashCode() + (this.f6095a.hashCode() * 31)) * 31) + (this.f6097c ? 1231 : 1237);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f6095a + ", qualifierApplicabilityTypes=" + this.f6096b + ", definitelyNotNull=" + this.f6097c + ')';
    }
}
