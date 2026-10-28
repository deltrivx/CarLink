package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13363c;

    public g0(float f10, float f11, Object obj) {
        this.f13361a = f10;
        this.f13362b = f11;
        this.f13363c = obj;
    }

    public /* synthetic */ g0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override // v.j
    public final x0 d(w0 w0Var) {
        Object obj = this.f13363c;
        return new l0.o0(this.f13361a, this.f13362b, obj == null ? null : (p) w0Var.f13471a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (g0Var.f13361a == this.f13361a && g0Var.f13362b == this.f13362b && i9.l.a(g0Var.f13363c, this.f13363c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13363c;
        return Float.floatToIntBits(this.f13362b) + ob.a.j(this.f13361a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
