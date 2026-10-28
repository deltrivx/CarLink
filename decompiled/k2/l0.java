package k2;

import cc.o1;
import r2.r2;
import z.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements n3.c, y8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f7246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cc.l f7247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cc.l f7248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f7249d = o.f7270b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y8.i f7250e = y8.i.f15108a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f7251f;

    public l0(m0 m0Var, cc.l lVar) {
        this.f7251f = m0Var;
        this.f7246a = m0Var;
        this.f7247b = lVar;
    }

    @Override // n3.c
    public final long F(float f10) {
        return this.f7246a.F(f10);
    }

    @Override // n3.c
    public final float J(int i7) {
        return this.f7246a.J(i7);
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / this.f7246a.a();
    }

    @Override // n3.c
    public final float O() {
        return this.f7246a.O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return this.f7246a.a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f7246a.a();
    }

    @Override // n3.c
    public final int a0(float f10) {
        m0 m0Var = this.f7246a;
        m0Var.getClass();
        return a2.f.j(f10, m0Var);
    }

    public final Object b(o oVar, a9.a aVar) {
        cc.l lVar = new cc.l(1, n4.h.L(aVar));
        lVar.p();
        this.f7249d = oVar;
        this.f7248c = lVar;
        return lVar.o();
    }

    public final long c() {
        m0 m0Var = this.f7251f;
        m0Var.getClass();
        long jN = a2.f.n(q2.f.v(m0Var).f10691z.d(), m0Var);
        long j5 = m0Var.f7263x;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN >> 32)) - ((int) (j5 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final r2 d() {
        m0 m0Var = this.f7251f;
        m0Var.getClass();
        return q2.f.v(m0Var).f10691z;
    }

    @Override // n3.c
    public final long e0(long j5) {
        m0 m0Var = this.f7246a;
        m0Var.getClass();
        return a2.f.n(j5, m0Var);
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f7250e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cc.a1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [cc.a1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [h9.n] */
    public final Object h(long j5, h9.n nVar, a9.c cVar) {
        i0 i0Var;
        cc.l lVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i7 = i0Var.f7224d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                i0Var.f7224d = i7 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objInvoke = i0Var.f7222b;
        int i10 = i0Var.f7224d;
        try {
            if (i10 == 0) {
                t8.a.e(objInvoke);
                if (j5 <= 0 && (lVar = this.f7248c) != null) {
                    lVar.resumeWith(t8.a.b(new p(j5)));
                }
                o1 o1VarS = cc.b0.s(this.f7251f.m0(), null, new j0(j5, this, null), 3);
                i0Var.f7221a = o1VarS;
                i0Var.f7224d = 1;
                objInvoke = nVar.invoke(this, i0Var);
                z8.a aVar = z8.a.f15774a;
                j5 = o1VarS;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o1 o1Var = i0Var.f7221a;
                t8.a.e(objInvoke);
                j5 = o1Var;
            }
            j5.a(b.f7187b);
            return objInvoke;
        } catch (Throwable th) {
            j5.a(b.f7187b);
            throw th;
        }
    }

    @Override // n3.c
    public final float h0(long j5) {
        m0 m0Var = this.f7246a;
        m0Var.getClass();
        return a2.f.m(j5, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j5, w1 w1Var, a9.a aVar) {
        k0 k0Var;
        if (aVar instanceof k0) {
            k0Var = (k0) aVar;
            int i7 = k0Var.f7237c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                k0Var.f7237c = i7 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, aVar);
            }
        } else {
            k0Var = new k0(this, aVar);
        }
        Object obj = k0Var.f7235a;
        int i10 = k0Var.f7237c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                return obj;
            }
            t8.a.e(obj);
            k0Var.f7237c = 1;
            Object objH = h(j5, w1Var, k0Var);
            Object obj2 = z8.a.f15774a;
            return objH == obj2 ? obj2 : objH;
        } catch (p unused) {
            return null;
        }
    }

    @Override // n3.c
    public final long o(long j5) {
        m0 m0Var = this.f7246a;
        m0Var.getClass();
        return a2.f.l(j5, m0Var);
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        m0 m0Var = this.f7251f;
        synchronized (m0Var.f7260u) {
            m0Var.f7259t.k(this);
        }
        this.f7247b.resumeWith(obj);
    }

    @Override // n3.c
    public final float s(long j5) {
        m0 m0Var = this.f7246a;
        m0Var.getClass();
        return a2.f.k(j5, m0Var);
    }
}
