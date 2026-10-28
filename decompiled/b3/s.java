package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1447g;

    public s(b bVar, int i7, int i10, int i11, int i12, float f10, float f11) {
        this.f1441a = bVar;
        this.f1442b = i7;
        this.f1443c = i10;
        this.f1444d = i11;
        this.f1445e = i12;
        this.f1446f = f10;
        this.f1447g = f11;
    }

    public final x1.c a(x1.c cVar) {
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f1446f)) & 4294967295L));
    }

    public final long b(long j5, boolean z10) {
        if (z10) {
            long j10 = q0.f1428b;
            if (q0.b(j5, j10)) {
                return j10;
            }
        }
        int i7 = q0.f1429c;
        int i10 = (int) (j5 >> 32);
        int i11 = this.f1442b;
        return g0.b(i10 + i11, ((int) (j5 & 4294967295L)) + i11);
    }

    public final x1.c c(x1.c cVar) {
        float f10 = -this.f1446f;
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    public final int d(int i7) {
        int i10 = this.f1443c;
        int i11 = this.f1442b;
        return n3.r.m(i7, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1441a.equals(sVar.f1441a) && this.f1442b == sVar.f1442b && this.f1443c == sVar.f1443c && this.f1444d == sVar.f1444d && this.f1445e == sVar.f1445e && Float.compare(this.f1446f, sVar.f1446f) == 0 && Float.compare(this.f1447g, sVar.f1447g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1447g) + ob.a.j(this.f1446f, ((((((((this.f1441a.hashCode() * 31) + this.f1442b) * 31) + this.f1443c) * 31) + this.f1444d) * 31) + this.f1445e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f1441a);
        sb2.append(", startIndex=");
        sb2.append(this.f1442b);
        sb2.append(", endIndex=");
        sb2.append(this.f1443c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f1444d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f1445e);
        sb2.append(", top=");
        sb2.append(this.f1446f);
        sb2.append(", bottom=");
        return ob.a.r(sb2, this.f1447g, ')');
    }
}
