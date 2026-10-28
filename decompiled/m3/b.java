package m3;

import y1.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8403b;

    public b(j0 j0Var, float f10) {
        this.f8402a = j0Var;
        this.f8403b = f10;
    }

    @Override // m3.o
    public final float a() {
        return this.f8403b;
    }

    @Override // m3.o
    public final long b() {
        int i7 = y1.q.f14959n;
        return y1.q.f14958m;
    }

    @Override // m3.o
    public final /* synthetic */ o c(o oVar) {
        return a2.f.e(this, oVar);
    }

    @Override // m3.o
    public final o d(h9.a aVar) {
        return !equals(n.f8425a) ? this : (o) aVar.invoke();
    }

    @Override // m3.o
    public final y1.m e() {
        return this.f8402a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i9.l.a(this.f8402a, bVar.f8402a) && Float.compare(this.f8403b, bVar.f8403b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8403b) + (this.f8402a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f8402a);
        sb2.append(", alpha=");
        return ob.a.r(sb2, this.f8403b, ')');
    }
}
