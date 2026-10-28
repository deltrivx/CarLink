package f3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5247a;

    public a(int i7) {
        this.f5247a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5247a == ((a) obj).f5247a;
    }

    public final int hashCode() {
        return this.f5247a;
    }

    public final String toString() {
        return a2.f.H(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f5247a, ')');
    }
}
