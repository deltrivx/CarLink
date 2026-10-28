package w9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.b f14174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.b f14175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.b f14176c;

    public c(wa.b bVar, wa.b bVar2, wa.b bVar3) {
        this.f14174a = bVar;
        this.f14175b = bVar2;
        this.f14176c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i9.l.a(this.f14174a, cVar.f14174a) && i9.l.a(this.f14175b, cVar.f14175b) && i9.l.a(this.f14176c, cVar.f14176c);
    }

    public final int hashCode() {
        return this.f14176c.hashCode() + ((this.f14175b.hashCode() + (this.f14174a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f14174a + ", kotlinReadOnly=" + this.f14175b + ", kotlinMutable=" + this.f14176c + ')';
    }
}
