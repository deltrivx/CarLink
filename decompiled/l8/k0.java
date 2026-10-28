package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8207a;

    public k0(boolean z10) {
        this.f8207a = z10;
    }

    @Override // l8.n0
    public final int a() {
        return 0;
    }

    @Override // l8.n0
    public final String b() {
        return k9.a.i(this);
    }

    @Override // l8.n0
    public final boolean c() {
        return this.f8207a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f8207a == ((k0) obj).f8207a;
    }

    public final int hashCode() {
        return this.f8207a ? 1231 : 1237;
    }

    public final String toString() {
        return "BooleanType(value=" + this.f8207a + ")";
    }
}
