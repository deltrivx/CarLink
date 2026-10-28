package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13422b;

    public o0(Object obj, Object obj2) {
        this.f13421a = obj;
        this.f13422b = obj2;
    }

    public final boolean a(d1.g gVar, d1.g gVar2) {
        return gVar.equals(this.f13421a) && gVar2.equals(this.f13422b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return i9.l.a(this.f13421a, o0Var.f13421a) && i9.l.a(this.f13422b, o0Var.f13422b);
    }

    public final int hashCode() {
        Object obj = this.f13421a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f13422b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
