package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f5852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f5853b;

    public d0(b3.h hVar, q qVar) {
        this.f5852a = hVar;
        this.f5853b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return i9.l.a(this.f5852a, d0Var.f5852a) && i9.l.a(this.f5853b, d0Var.f5853b);
    }

    public final int hashCode() {
        return this.f5853b.hashCode() + (this.f5852a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f5852a) + ", offsetMapping=" + this.f5853b + ')';
    }
}
