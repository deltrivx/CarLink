package d2;

import i9.l;
import n3.j;
import n3.m;
import n3.n;
import q2.j0;
import y1.f;
import y1.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f3746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3748g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f3751j;

    public a(f fVar, long j5) {
        int i7;
        int i10;
        this.f3746e = fVar;
        this.f3747f = j5;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i7 = (int) (j5 >> 32)) < 0 || (i10 = (int) (4294967295L & j5)) < 0 || i7 > fVar.f14890a.getWidth() || i10 > fVar.f14890a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f3749h = j5;
        this.f3750i = 1.0f;
    }

    @Override // d2.b
    public final void a(float f10) {
        this.f3750i = f10;
    }

    @Override // d2.b
    public final void b(k kVar) {
        this.f3751j = kVar;
    }

    @Override // d2.b
    public final long d() {
        return n.M0(this.f3749h);
    }

    @Override // d2.b
    public final void e(j0 j0Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j0Var.g() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (j0Var.g() & 4294967295L)));
        float f10 = this.f3750i;
        k kVar = this.f3751j;
        int i7 = this.f3748g;
        a2.f.s(j0Var, this.f3746e, this.f3747f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f10, kVar, i7, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f3746e, aVar.f3746e) && j.a(0L, 0L) && m.a(this.f3747f, aVar.f3747f) && this.f3748g == aVar.f3748g;
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f3746e.hashCode() * 31)) * 31;
        long j5 = this.f3747f;
        return ((((int) ((j5 >>> 32) ^ j5)) + iHashCode) * 31) + this.f3748g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f3746e);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) m.b(this.f3747f));
        sb2.append(", filterQuality=");
        int i7 = this.f3748g;
        if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Low";
        } else if (i7 == 2) {
            str = "Medium";
        } else {
            str = i7 == 3 ? "High" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
