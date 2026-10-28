package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5230a;

    public y2(Object obj) {
        this.f5230a = obj;
    }

    @Override // f1.z2
    public final Object a(q1 q1Var) {
        return this.f5230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && i9.l.a(this.f5230a, ((y2) obj).f5230a);
    }

    public final int hashCode() {
        Object obj = this.f5230a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f5230a + ')';
    }
}
