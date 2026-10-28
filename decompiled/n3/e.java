package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3.a f8735c;

    public e(float f10, float f11, o3.a aVar) {
        this.f8733a = f10;
        this.f8734b = f11;
        this.f8735c = aVar;
    }

    @Override // n3.c
    public final long F(float f10) {
        return r.K(this.f8735c.a(L(f10)), 4294967296L);
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
        return this.f8734b;
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f8733a;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8733a, eVar.f8733a) == 0 && Float.compare(this.f8734b, eVar.f8734b) == 0 && i9.l.a(this.f8735c, eVar.f8735c);
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    public final int hashCode() {
        return this.f8735c.hashCode() + ob.a.j(this.f8734b, Float.floatToIntBits(this.f8733a) * 31, 31);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final float s(long j5) {
        if (s.a(q.b(j5), 4294967296L)) {
            return this.f8735c.b(q.c(j5));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f8733a + ", fontScale=" + this.f8734b + ", converter=" + this.f8735c + ')';
    }
}
