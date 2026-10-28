package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r1.o implements q2.k, q2.w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x0 f15358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f15359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15360q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o2.w f15362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15364u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15366w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0.k f15361r = new h0.k(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15365v = 0;

    public f(x0 x0Var, t1 t1Var, boolean z10) {
        this.f15358o = x0Var;
        this.f15359p = t1Var;
        this.f15360q = z10;
    }

    public static final float A0(f fVar, c cVar) {
        x1.c cVar2;
        int iCompare;
        if (n3.m.a(fVar.f15365v, 0L)) {
            return 0.0f;
        }
        h1.e eVar = fVar.f15361r.f6332a;
        int i7 = eVar.f6423c - 1;
        Object[] objArr = eVar.f6421a;
        if (i7 < objArr.length) {
            cVar2 = null;
            while (i7 >= 0) {
                x1.c cVar3 = (x1.c) ((e) objArr[i7]).f15347a.invoke();
                if (cVar3 != null) {
                    long jC = cVar3.c();
                    long jM0 = n3.n.M0(fVar.f15365v);
                    int iOrdinal = fVar.f15358o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jM0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new cc.s();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jM0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (cVar2 != null) {
                            break;
                        }
                        cVar2 = cVar3;
                        break;
                    }
                    cVar2 = cVar3;
                }
                i7--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            x1.c cVarB0 = fVar.f15363t ? fVar.B0() : null;
            if (cVarB0 == null) {
                return 0.0f;
            }
            cVar2 = cVarB0;
        }
        long jM1 = n3.n.M0(fVar.f15365v);
        int iOrdinal2 = fVar.f15358o.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = cVar2.f14524b;
            return cVar.a(f10, cVar2.f14526d - f10, Float.intBitsToFloat((int) (jM1 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new cc.s();
        }
        float f11 = cVar2.f14523a;
        return cVar.a(f11, cVar2.f14525c - f11, Float.intBitsToFloat((int) (jM1 >> 32)));
    }

    public final x1.c B0() {
        if (this.f11129n) {
            q2.h1 h1VarU = q2.f.u(this);
            o2.w wVar = this.f15362s;
            if (wVar != null) {
                if (!wVar.isAttached()) {
                    wVar = null;
                }
                if (wVar != null) {
                    return h1VarU.h(wVar, false);
                }
            }
        }
        return null;
    }

    public final boolean C0(x1.c cVar, long j5) {
        long jE0 = E0(cVar, j5);
        return Math.abs(Float.intBitsToFloat((int) (jE0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jE0 & 4294967295L))) <= 0.5f;
    }

    public final void D0() {
        f1.c0 c0Var = d.f15337a;
        c cVar = (c) q2.f.i(this, c0Var);
        if (this.f15366w) {
            c0.b.c("launchAnimation called when previous animation was running");
        }
        cc.b0.s(m0(), null, new fc.i(this, new g2(((c) q2.f.i(this, c0Var)).b()), cVar, null, 9), 1);
    }

    public final long E0(x1.c cVar, long j5) {
        long jFloatToRawIntBits;
        long j10;
        long jM0 = n3.n.M0(j5);
        int iOrdinal = this.f15358o.ordinal();
        if (iOrdinal == 0) {
            c cVar2 = (c) q2.f.i(this, d.f15337a);
            float f10 = cVar.f14524b;
            float fA = cVar2.a(f10, cVar.f14526d - f10, Float.intBitsToFloat((int) (jM0 & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new cc.s();
            }
            c cVar3 = (c) q2.f.i(this, d.f15337a);
            float f11 = cVar.f14523a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(cVar3.a(f11, cVar.f14525c - f11, Float.intBitsToFloat((int) (jM0 >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // q2.w
    public final /* synthetic */ void T(o2.w wVar) {
    }

    @Override // q2.w
    public final void n(long j5) {
        int iF;
        x1.c cVarB0;
        long j10 = this.f15365v;
        this.f15365v = j5;
        int iOrdinal = this.f15358o.ordinal();
        if (iOrdinal == 0) {
            iF = i9.l.f((int) (j5 & 4294967295L), (int) (4294967295L & j10));
        } else {
            if (iOrdinal != 1) {
                throw new cc.s();
            }
            iF = i9.l.f((int) (j5 >> 32), (int) (j10 >> 32));
        }
        if (iF >= 0 || this.f15366w || this.f15363t || (cVarB0 = B0()) == null || !C0(cVarB0, j10)) {
            return;
        }
        this.f15364u = true;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }
}
