package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f4995a;

    public j0(k1 k1Var) {
        this.f4995a = k1Var;
    }

    @Override // f1.z2
    public final Object a(q1 q1Var) {
        return this.f4995a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f4995a.equals(((j0) obj).f4995a);
    }

    public final int hashCode() {
        return this.f4995a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4995a + ')';
    }
}
