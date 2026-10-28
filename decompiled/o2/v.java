package o2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements o0, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3.o f9434b;

    public v(r rVar, n3.o oVar) {
        this.f9433a = rVar;
        this.f9434b = oVar;
    }

    @Override // n3.c
    public final long F(float f10) {
        return this.f9433a.F(f10);
    }

    @Override // n3.c
    public final float J(int i7) {
        return this.f9433a.J(i7);
    }

    @Override // n3.c
    public final float L(float f10) {
        return this.f9433a.L(f10);
    }

    @Override // o2.o0
    public final n0 M(int i7, int i10, Map map, h9.k kVar, h9.k kVar2) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            n2.a.b("Size(" + i7 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u(i7, i10, map, kVar);
    }

    @Override // n3.c
    public final float O() {
        return this.f9433a.O();
    }

    @Override // o2.r
    public final boolean Q() {
        return this.f9433a.Q();
    }

    @Override // n3.c
    public final float R(float f10) {
        return this.f9433a.R(f10);
    }

    @Override // n3.c
    public final float a() {
        return this.f9433a.a();
    }

    @Override // n3.c
    public final int a0(float f10) {
        return this.f9433a.a0(f10);
    }

    @Override // n3.c
    public final long e0(long j5) {
        return this.f9433a.e0(j5);
    }

    @Override // o2.r
    public final n3.o getLayoutDirection() {
        return this.f9434b;
    }

    @Override // n3.c
    public final float h0(long j5) {
        return this.f9433a.h0(j5);
    }

    @Override // o2.o0
    public final n0 i(int i7, int i10, Map map, h9.k kVar) {
        return M(i7, i10, map, null, kVar);
    }

    @Override // n3.c
    public final long o(long j5) {
        return this.f9433a.o(j5);
    }

    @Override // n3.c
    public final float s(long j5) {
        return this.f9433a.s(j5);
    }
}
