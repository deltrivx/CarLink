package x1;

import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f14522e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14526d;

    public c(float f10, float f11, float f12, float f13) {
        this.f14523a = f10;
        this.f14524b = f11;
        this.f14525c = f12;
        this.f14526d = f13;
    }

    public static c a(c cVar, float f10, float f11, float f12, int i7) {
        if ((i7 & 1) != 0) {
            f10 = cVar.f14523a;
        }
        float f13 = cVar.f14524b;
        if ((i7 & 4) != 0) {
            f11 = cVar.f14525c;
        }
        if ((i7 & 8) != 0) {
            f12 = cVar.f14526d;
        }
        return new c(f10, f13, f11, f12);
    }

    public final long b() {
        float f10 = this.f14525c;
        float f11 = this.f14523a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f14526d;
        float f14 = this.f14524b;
        return (((long) Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f14525c - this.f14523a;
        return (((long) Float.floatToRawIntBits(this.f14526d - this.f14524b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.f14523a)) << 32) | (((long) Float.floatToRawIntBits(this.f14524b)) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f14523a, cVar.f14523a), Math.max(this.f14524b, cVar.f14524b), Math.min(this.f14525c, cVar.f14525c), Math.min(this.f14526d, cVar.f14526d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f14523a, cVar.f14523a) == 0 && Float.compare(this.f14524b, cVar.f14524b) == 0 && Float.compare(this.f14525c, cVar.f14525c) == 0 && Float.compare(this.f14526d, cVar.f14526d) == 0;
    }

    public final boolean f() {
        return (this.f14523a >= this.f14525c) | (this.f14524b >= this.f14526d);
    }

    public final boolean g(c cVar) {
        return (this.f14523a < cVar.f14525c) & (cVar.f14523a < this.f14525c) & (this.f14524b < cVar.f14526d) & (cVar.f14524b < this.f14526d);
    }

    public final c h(float f10, float f11) {
        return new c(this.f14523a + f10, this.f14524b + f11, this.f14525c + f10, this.f14526d + f11);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14526d) + ob.a.j(this.f14525c, ob.a.j(this.f14524b, Float.floatToIntBits(this.f14523a) * 31, 31), 31);
    }

    public final c i(long j5) {
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        return new c(Float.intBitsToFloat(i7) + this.f14523a, Float.intBitsToFloat(i10) + this.f14524b, Float.intBitsToFloat(i7) + this.f14525c, Float.intBitsToFloat(i10) + this.f14526d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + n.N0(this.f14523a) + ", " + n.N0(this.f14524b) + ", " + n.N0(this.f14525c) + ", " + n.N0(this.f14526d) + ')';
    }
}
