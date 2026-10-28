package y2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14979d = new f(0.0f, new n9.a(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9.a f14981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14982c;

    public f(float f10, n9.a aVar, int i7) {
        this.f14980a = f10;
        this.f14981b = aVar;
        this.f14982c = i7;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final n9.a a() {
        return this.f14981b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14980a == fVar.f14980a && i9.l.a(this.f14981b, fVar.f14981b) && this.f14982c == fVar.f14982c;
    }

    public final int hashCode() {
        return ((this.f14981b.hashCode() + (Float.floatToIntBits(this.f14980a) * 31)) * 31) + this.f14982c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f14980a);
        sb2.append(", range=");
        sb2.append(this.f14981b);
        sb2.append(", steps=");
        return a2.f.H(sb2, this.f14982c, ')');
    }
}
