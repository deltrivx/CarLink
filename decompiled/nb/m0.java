package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.r0 f9018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la.a f9019b;

    public m0(x9.r0 r0Var, la.a aVar) {
        i9.l.e(r0Var, "typeParameter");
        i9.l.e(aVar, "typeAttr");
        this.f9018a = r0Var;
        this.f9019b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return i9.l.a(m0Var.f9018a, this.f9018a) && i9.l.a(m0Var.f9019b, this.f9019b);
    }

    public final int hashCode() {
        int iHashCode = this.f9018a.hashCode();
        return this.f9019b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f9018a + ", typeAttr=" + this.f9019b + ')';
    }
}
