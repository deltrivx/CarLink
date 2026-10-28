package x1;

import n3.n;
import n4.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14534h;

    static {
        h.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j5, long j10, long j11, long j12) {
        this.f14527a = f10;
        this.f14528b = f11;
        this.f14529c = f12;
        this.f14530d = f13;
        this.f14531e = j5;
        this.f14532f = j10;
        this.f14533g = j11;
        this.f14534h = j12;
    }

    public final float a() {
        return this.f14530d - this.f14528b;
    }

    public final float b() {
        return this.f14529c - this.f14527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f14527a, dVar.f14527a) == 0 && Float.compare(this.f14528b, dVar.f14528b) == 0 && Float.compare(this.f14529c, dVar.f14529c) == 0 && Float.compare(this.f14530d, dVar.f14530d) == 0 && h.A(this.f14531e, dVar.f14531e) && h.A(this.f14532f, dVar.f14532f) && h.A(this.f14533g, dVar.f14533g) && h.A(this.f14534h, dVar.f14534h);
    }

    public final int hashCode() {
        int iJ = ob.a.j(this.f14530d, ob.a.j(this.f14529c, ob.a.j(this.f14528b, Float.floatToIntBits(this.f14527a) * 31, 31), 31), 31);
        long j5 = this.f14531e;
        long j10 = this.f14532f;
        int i7 = (((int) (j10 ^ (j10 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + iJ) * 31)) * 31;
        long j11 = this.f14533g;
        int i10 = (((int) (j11 ^ (j11 >>> 32))) + i7) * 31;
        long j12 = this.f14534h;
        return ((int) (j12 ^ (j12 >>> 32))) + i10;
    }

    public final String toString() {
        String str = n.N0(this.f14527a) + ", " + n.N0(this.f14528b) + ", " + n.N0(this.f14529c) + ", " + n.N0(this.f14530d);
        long j5 = this.f14531e;
        long j10 = this.f14532f;
        boolean zA = h.A(j5, j10);
        long j11 = this.f14533g;
        long j12 = this.f14534h;
        if (!zA || !h.A(j10, j11) || !h.A(j11, j12)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) h.g0(j5)) + ", topRight=" + ((Object) h.g0(j10)) + ", bottomRight=" + ((Object) h.g0(j11)) + ", bottomLeft=" + ((Object) h.g0(j12)) + ')';
        }
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i10)) {
            return "RoundRect(rect=" + str + ", radius=" + n.N0(Float.intBitsToFloat(i7)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + n.N0(Float.intBitsToFloat(i7)) + ", y=" + n.N0(Float.intBitsToFloat(i10)) + ')';
    }
}
