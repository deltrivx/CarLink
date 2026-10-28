package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8219a;

    public m0(String str) {
        i9.l.e(str, "value");
        this.f8219a = str;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && i9.l.a(this.f8219a, ((m0) obj).f8219a);
    }

    public final int hashCode() {
        return this.f8219a.hashCode();
    }

    public final String toString() {
        return a2.f.G("StringType(value=", this.f8219a, ")");
    }
}
