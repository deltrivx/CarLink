package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15620c;

    public c(String str, long j5, int i7) {
        this.f15618a = str;
        this.f15619b = j5;
        this.f15620c = i7;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15620c == cVar.f15620c && i9.l.a(this.f15618a, cVar.f15618a)) {
            return b.a(this.f15619b, cVar.f15619b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f15618a.hashCode() * 31;
        int i7 = b.f15617e;
        long j5 = this.f15619b;
        return ((iHashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f15620c;
    }

    public final String toString() {
        return this.f15618a + " (id=" + this.f15620c + ", model=" + ((Object) b.b(this.f15619b)) + ')';
    }
}
