package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f4928a;

    public d0(h9.k kVar) {
        this.f4928a = kVar;
    }

    @Override // f1.z2
    public final Object a(q1 q1Var) {
        return this.f4928a.invoke(q1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && i9.l.a(this.f4928a, ((d0) obj).f4928a);
    }

    public final int hashCode() {
        return this.f4928a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4928a + ')';
    }
}
