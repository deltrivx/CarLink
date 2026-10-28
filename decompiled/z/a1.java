package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n3.c f15297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lc.c f15300d = new lc.c();

    public a1(n3.c cVar) {
        this.f15297a = cVar;
    }

    @Override // n3.c
    public final long F(float f10) {
        return this.f15297a.F(f10);
    }

    @Override // n3.c
    public final float J(int i7) {
        return this.f15297a.J(i7);
    }

    @Override // n3.c
    public final float L(float f10) {
        return this.f15297a.L(f10);
    }

    @Override // n3.c
    public final float O() {
        return this.f15297a.O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return this.f15297a.R(f10);
    }

    @Override // n3.c
    public final float a() {
        return this.f15297a.a();
    }

    @Override // n3.c
    public final int a0(float f10) {
        return this.f15297a.a0(f10);
    }

    public final void b() {
        this.f15299c = true;
        lc.c cVar = this.f15300d;
        if (cVar.c()) {
            cVar.f(null);
        }
    }

    public final void c() {
        this.f15298b = true;
        lc.c cVar = this.f15300d;
        if (cVar.c()) {
            cVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(a9.c cVar) {
        y0 y0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i7 = y0Var.f15600c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                y0Var.f15600c = i7 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object obj = y0Var.f15598a;
        int i10 = y0Var.f15600c;
        if (i10 == 0) {
            t8.a.e(obj);
            y0Var.f15600c = 1;
            Object objD = this.f15300d.d(y0Var);
            z8.a aVar = z8.a.f15774a;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        this.f15298b = false;
        this.f15299c = false;
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(a9.c cVar) {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i7 = z0Var.f15607c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                z0Var.f15607c = i7 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object obj = z0Var.f15605a;
        int i10 = z0Var.f15607c;
        lc.c cVar2 = this.f15300d;
        if (i10 == 0) {
            t8.a.e(obj);
            if (!this.f15298b && !this.f15299c) {
                z0Var.f15607c = 1;
                Object objD = cVar2.d(z0Var);
                z8.a aVar = z8.a.f15774a;
                if (objD == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.f15298b);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        cVar2.f(null);
        return Boolean.valueOf(this.f15298b);
    }

    @Override // n3.c
    public final long e0(long j5) {
        return this.f15297a.e0(j5);
    }

    @Override // n3.c
    public final float h0(long j5) {
        return this.f15297a.h0(j5);
    }

    @Override // n3.c
    public final long o(long j5) {
        return this.f15297a.o(j5);
    }

    @Override // n3.c
    public final float s(long j5) {
        return this.f15297a.s(j5);
    }
}
