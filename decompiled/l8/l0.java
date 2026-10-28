package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8216a;

    public l0(int i7) {
        this.f8216a = i7;
    }

    @Override // l8.n0
    public final int a() {
        return this.f8216a;
    }

    @Override // l8.n0
    public final String b() {
        return k9.a.i(this);
    }

    @Override // l8.n0
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f8216a == ((l0) obj).f8216a;
    }

    public final int hashCode() {
        return this.f8216a;
    }

    public final String toString() {
        return a2.f.F("IntType(value=", ")", this.f8216a);
    }
}
