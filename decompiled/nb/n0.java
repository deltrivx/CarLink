package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public abstract x0 a();

    public abstract w b();

    public abstract boolean c();

    public abstract n0 d(ob.g gVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return c() == n0Var.c() && a() == n0Var.a() && b().equals(n0Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (u0.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == x0.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
