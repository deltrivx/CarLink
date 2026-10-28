package ec;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f4732b = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4733a;

    public static final Object a(Object obj) {
        if (obj instanceof n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return i9.l.a(this.f4733a, ((o) obj).f4733a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4733a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4733a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
