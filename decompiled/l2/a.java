package l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7976b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7975a == aVar.f7975a && Float.compare(this.f7976b, aVar.f7976b) == 0;
    }

    public final int hashCode() {
        long j5 = this.f7975a;
        return Float.floatToIntBits(this.f7976b) + (((int) (j5 ^ (j5 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f7975a);
        sb2.append(", dataPoint=");
        return ob.a.r(sb2, this.f7976b, ')');
    }
}
