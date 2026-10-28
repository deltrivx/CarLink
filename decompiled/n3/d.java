package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8732b;

    public d(float f10, float f11) {
        this.f8731a = f10;
        this.f8732b = f11;
    }

    @Override // n3.c
    public final long F(float f10) {
        return a2.f.o(L(f10), this);
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // n3.c
    public final float O() {
        return this.f8732b;
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f8731a;
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8731a, dVar.f8731a) == 0 && Float.compare(this.f8732b, dVar.f8732b) == 0;
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8732b) + (Float.floatToIntBits(this.f8731a) * 31);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f8731a);
        sb2.append(", fontScale=");
        return ob.a.r(sb2, this.f8732b, ')');
    }
}
