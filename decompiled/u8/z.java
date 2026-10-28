package u8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13126b;

    public z(int i7, Object obj) {
        this.f13125a = i7;
        this.f13126b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f13125a == zVar.f13125a && i9.l.a(this.f13126b, zVar.f13126b);
    }

    public final int hashCode() {
        int i7 = this.f13125a * 31;
        Object obj = this.f13126b;
        return i7 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f13125a + ", value=" + this.f13126b + ')';
    }
}
