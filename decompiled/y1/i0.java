package y1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14912j;
    public l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n3.c f14915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n3.o f14916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h0 f14918q;

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
        return this.f14915n.O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f14915n.a();
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    public final void b(float f10) {
        if (this.f14906d == f10) {
            return;
        }
        this.f14903a |= 4;
        this.f14906d = f10;
    }

    public final void c(long j5) {
        if (q.c(this.f14908f, j5)) {
            return;
        }
        this.f14903a |= 64;
        this.f14908f = j5;
    }

    public final void d(float f10) {
        if (this.f14907e == f10) {
            return;
        }
        this.f14903a |= 32;
        this.f14907e = f10;
    }

    public final void e(l0 l0Var) {
        if (i9.l.a(this.k, l0Var)) {
            return;
        }
        this.f14903a |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        this.k = l0Var;
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    public final void f(long j5) {
        if (q.c(this.f14909g, j5)) {
            return;
        }
        this.f14903a |= 128;
        this.f14909g = j5;
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }
}
