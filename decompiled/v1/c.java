package v1;

import h9.k;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13592a = f.f13596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f13593b;

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
        return this.f13592a.a().O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f13592a.a().a();
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    public final o0 b(k kVar) {
        o0 o0Var = new o0(27, false);
        o0Var.f7772b = kVar;
        this.f13593b = o0Var;
        return o0Var;
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
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
