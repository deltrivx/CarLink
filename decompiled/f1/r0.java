package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5103b;

    public r0(Object obj, Object obj2) {
        this.f5102a = obj;
        this.f5103b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return i9.l.a(this.f5102a, r0Var.f5102a) && i9.l.a(this.f5103b, r0Var.f5103b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f5102a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i7 = iHashCode * 31;
        Object obj2 = this.f5103b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i7;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f5102a + ", right=" + this.f5103b + ')';
    }
}
