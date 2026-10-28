package w0;

import android.content.ClipData;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.t1 f13939a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0.u0 f13942d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h9.a f13944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r2.e1 f13945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cc.y f13946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f13947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g2.a f13948j;
    public w1.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1.k1 f13949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1.k1 f13950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b3.q0 f13952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1.k1 f13954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f1.k1 f13955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g3.w f13957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h1 f13958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b3.q0 f13959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f1.k1 f13960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l0.o0 f13961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p1 f13962y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k2.i f13963z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.q f13940b = l0.q0.f7801c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h9.k f13941c = new l0.t0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.k1 f13943e = f1.b.s(new g3.w((String) null, 0, 7));

    public t1(l0.t1 t1Var) {
        this.f13939a = t1Var;
        Boolean bool = Boolean.TRUE;
        this.f13949l = f1.b.s(bool);
        this.f13950m = f1.b.s(bool);
        this.f13951n = 0L;
        this.f13953p = 0L;
        this.f13954q = f1.b.s(null);
        this.f13955r = f1.b.s(null);
        this.f13956s = -1;
        this.f13957t = new g3.w((String) null, 0L, 7);
        this.f13960w = f1.b.s(null);
        this.f13961x = new l0.o0(16, false);
        this.f13962y = new p1(this);
        this.f13963z = new k2.i(this);
    }

    public static final void a(t1 t1Var, b3.q0 q0Var) {
        b3.h hVarL;
        String str;
        cc.y yVar;
        if (q0Var == null) {
            return;
        }
        long j5 = q0Var.f1430a;
        t tVar = t1Var.f13947i;
        if (tVar == null || (hVarL = t1Var.l()) == null || (str = hVarL.f1353b) == null) {
            return;
        }
        g3.q qVar = t1Var.f13940b;
        long jB = b3.g0.b(qVar.b((int) (j5 >> 32)), qVar.b((int) (j5 & 4294967295L)));
        if (str.length() <= 0 || b3.q0.c(jB) || (yVar = t1Var.f13946h) == null) {
            return;
        }
        cc.b0.s(yVar, null, new q1(tVar, str, jB, q0Var, t1Var, qVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(t1 t1Var, a9.c cVar) {
        r1 r1Var;
        String str;
        b3.q0 q0Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i7 = r1Var.f13911c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                r1Var.f13911c = i7 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(t1Var, cVar);
            }
        } else {
            r1Var = new r1(t1Var, cVar);
        }
        Object obj = r1Var.f13909a;
        int i10 = r1Var.f13911c;
        t8.z zVar = t8.z.f12851a;
        if (i10 == 0) {
            t8.a.e(obj);
            b3.h hVarL = t1Var.l();
            if (hVarL != null && (str = hVarL.f1353b) != null && (q0Var = t1Var.f13959v) != null) {
                long j5 = q0Var.f1430a;
                t tVar = t1Var.f13947i;
                if (tVar != null) {
                    long jB = b3.g0.b(t1Var.f13940b.b((int) (j5 >> 32)), t1Var.f13940b.b((int) (j5 & 4294967295L)));
                    r1Var.f13911c = 1;
                    Object objA = (str.length() == 0 || b3.q0.c(jB)) ? zVar : cc.b0.A(tVar.f13927a, new fc.i(tVar, new l0.i1(jB, str, tVar, null), (y8.c) null), r1Var);
                    z8.a aVar = z8.a.f15774a;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        return zVar;
    }

    public static final long c(t1 t1Var, g3.w wVar, long j5, boolean z10, boolean z11, a0 a0Var, boolean z12) {
        l0.s1 s1VarD;
        long j10;
        z zVar;
        g2.a aVar;
        int i7;
        l0.u0 u0Var = t1Var.f13942d;
        if (u0Var == null || (s1VarD = u0Var.d()) == null) {
            return b3.q0.f1428b;
        }
        g3.q qVar = t1Var.f13940b;
        long j11 = wVar.f5890b;
        b3.h hVar = wVar.f5889a;
        int i10 = b3.q0.f1429c;
        long jB = b3.g0.b(qVar.b((int) (j11 >> 32)), t1Var.f13940b.b((int) (j11 & 4294967295L)));
        int iB = s1VarD.b(j5, false);
        int i11 = (z11 || z10) ? iB : (int) (jB >> 32);
        int i12 = (!z11 || z10) ? iB : (int) (jB & 4294967295L);
        h1 h1Var = t1Var.f13958u;
        int i13 = (z10 || h1Var == null || (i7 = t1Var.f13956s) == -1) ? -1 : i7;
        b3.o0 o0Var = s1VarD.f7828a;
        if (z10) {
            j10 = 4294967295L;
            zVar = null;
        } else {
            j10 = 4294967295L;
            int i14 = (int) (jB >> 32);
            y yVar = new y(y0.u(o0Var, i14), i14, 1L);
            int i15 = (int) (jB & 4294967295L);
            zVar = new z(yVar, new y(y0.u(o0Var, i15), i15, 1L), b3.q0.g(jB));
        }
        h1 h1Var2 = new h1(z11, 1, 1, zVar, new w(1L, 1, i11, i12, i13, o0Var));
        if (!h1Var2.m(h1Var)) {
            return j11;
        }
        t1Var.f13958u = h1Var2;
        t1Var.f13956s = iB;
        z zVarA = a0Var.a(h1Var2);
        long jB2 = b3.g0.b(t1Var.f13940b.a(zVarA.f14018a.f14010b), t1Var.f13940b.a(zVarA.f14019b.f14010b));
        if (b3.q0.b(jB2, j11)) {
            return j11;
        }
        boolean z13 = b3.q0.g(jB2) != b3.q0.g(j11) && b3.q0.b(b3.g0.b((int) (jB2 & j10), (int) (jB2 >> 32)), j11);
        boolean z14 = b3.q0.c(jB2) && b3.q0.c(j11);
        if (z12 && hVar.f1353b.length() > 0 && !z13 && !z14 && (aVar = t1Var.f13948j) != null) {
            aVar.a(9);
        }
        t1Var.f13941c.invoke(e(hVar, jB2));
        t1Var.f13959v = new b3.q0(jB2);
        if (!z12) {
            t1Var.s(!b3.q0.c(jB2));
        }
        l0.u0 u0Var2 = t1Var.f13942d;
        if (u0Var2 != null) {
            u0Var2.f7863q.setValue(Boolean.valueOf(z12));
        }
        l0.u0 u0Var3 = t1Var.f13942d;
        if (u0Var3 != null) {
            u0Var3.f7859m.setValue(Boolean.valueOf(!b3.q0.c(jB2) && y0.w(t1Var, true)));
        }
        l0.u0 u0Var4 = t1Var.f13942d;
        if (u0Var4 != null) {
            u0Var4.f7860n.setValue(Boolean.valueOf(!b3.q0.c(jB2) && y0.w(t1Var, false)));
        }
        l0.u0 u0Var5 = t1Var.f13942d;
        if (u0Var5 != null) {
            u0Var5.f7861o.setValue(Boolean.valueOf(b3.q0.c(jB2) && y0.w(t1Var, true)));
        }
        return jB2;
    }

    public static g3.w e(b3.h hVar, long j5) {
        return new g3.w(hVar, j5, (b3.q0) null);
    }

    public final cc.o1 d(boolean z10) {
        cc.y yVar = this.f13946h;
        if (yVar != null) {
            return cc.b0.s(yVar, null, new m1(this, z10, null), 1);
        }
        return null;
    }

    public final void f() {
        cc.y yVar = this.f13946h;
        if (yVar != null) {
            cc.b0.s(yVar, null, new o1(this, null, 0), 1);
        }
    }

    public final void g(x1.b bVar) {
        if (!b3.q0.c(m().f5890b)) {
            l0.u0 u0Var = this.f13942d;
            l0.s1 s1VarD = u0Var != null ? u0Var.d() : null;
            int iE = (bVar == null || s1VarD == null) ? b3.q0.e(m().f5890b) : this.f13940b.a(s1VarD.b(bVar.f14521a, true));
            g3.w wVarA = g3.w.a(m(), null, b3.g0.b(iE, iE), 5);
            this.f13941c.invoke(wVarA);
            this.f13959v = new b3.q0(wVarA.f5890b);
        }
        p((bVar == null || m().f5889a.f1353b.length() <= 0) ? l0.i0.f7678a : l0.i0.f7680c);
        s(false);
    }

    public final void h(boolean z10) {
        w1.o oVar;
        l0.u0 u0Var = this.f13942d;
        if (u0Var != null && !u0Var.b() && (oVar = this.k) != null) {
            w1.o.b(oVar);
        }
        this.f13957t = m();
        s(z10);
        p(l0.i0.f7679b);
    }

    public final x1.b i() {
        return (x1.b) this.f13955r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f13950m.getValue()).booleanValue();
    }

    public final long k(boolean z10) {
        l0.s1 s1VarD;
        long j5;
        l0.u0 u0Var = this.f13942d;
        if (u0Var == null || (s1VarD = u0Var.d()) == null) {
            return 9205357640488583168L;
        }
        b3.o0 o0Var = s1VarD.f7828a;
        b3.h hVarL = l();
        if (hVarL == null) {
            return 9205357640488583168L;
        }
        if (!i9.l.a(hVarL.f1353b, o0Var.f1408a.f1393a.f1353b)) {
            return 9205357640488583168L;
        }
        g3.w wVarM = m();
        if (z10) {
            long j10 = wVarM.f5890b;
            int i7 = b3.q0.f1429c;
            j5 = j10 >> 32;
        } else {
            long j11 = wVarM.f5890b;
            int i10 = b3.q0.f1429c;
            j5 = j11 & 4294967295L;
        }
        return y0.t(o0Var, this.f13940b.b((int) j5), z10, b3.q0.g(m().f5890b));
    }

    public final b3.h l() {
        l0.a1 a1Var;
        l0.u0 u0Var = this.f13942d;
        if (u0Var == null || (a1Var = u0Var.f7848a) == null) {
            return null;
        }
        return a1Var.f7591a;
    }

    public final g3.w m() {
        return (g3.w) this.f13943e.getValue();
    }

    public final void n() {
        cc.o1 o1Var;
        r0.f fVar = (r0.f) this.f13961x.f7772b;
        if (fVar == null || (o1Var = fVar.f11086u) == null) {
            return;
        }
        o1Var.a(null);
        fVar.f11086u = null;
    }

    public final void o() {
        cc.y yVar = this.f13946h;
        if (yVar != null) {
            cc.b0.s(yVar, null, new o1(this, null, 1), 1);
        }
    }

    public final void p(l0.i0 i0Var) {
        l0.u0 u0Var = this.f13942d;
        if (u0Var != null) {
            if (u0Var.a() == i0Var) {
                u0Var = null;
            }
            if (u0Var != null) {
                u0Var.k.setValue(i0Var);
            }
        }
    }

    public final void q() {
        l0.u0 u0Var;
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            if (!j() || ((u0Var = this.f13942d) != null && !((Boolean) u0Var.f7863q.getValue()).booleanValue())) {
                n4.e.r(fVarH, fVarK, kVarE);
            } else {
                n4.e.r(fVarH, fVarK, kVarE);
                this.f13961x.b0();
            }
        } catch (Throwable th) {
            n4.e.r(fVarH, fVarK, kVarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(a9.c cVar) {
        s1 s1Var;
        r2.d1 d1Var;
        t1 t1Var;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i7 = s1Var.f13926d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                s1Var.f13926d = i7 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object d1Var2 = s1Var.f13924b;
        int i10 = s1Var.f13926d;
        if (i10 == 0) {
            t8.a.e(d1Var2);
            r2.e1 e1Var = this.f13945g;
            d1Var = null;
            if (e1Var != null) {
                s1Var.f13923a = this;
                s1Var.f13926d = 1;
                ClipData primaryClip = ((r2.g) e1Var).f11234a.f11247a.getPrimaryClip();
                d1Var2 = primaryClip != null ? new r2.d1(primaryClip) : null;
                z8.a aVar = z8.a.f15774a;
                if (d1Var2 == aVar) {
                    return aVar;
                }
                t1Var = this;
            } else {
                t1Var = this;
            }
            t1Var.f13960w.setValue(d1Var);
            return t8.z.f12851a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1Var = s1Var.f13923a;
        t8.a.e(d1Var2);
        d1Var = (r2.d1) d1Var2;
        t1Var.f13960w.setValue(d1Var);
        return t8.z.f12851a;
    }

    public final void s(boolean z10) {
        l0.u0 u0Var = this.f13942d;
        if (u0Var != null) {
            u0Var.f7858l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            q();
        } else {
            n();
        }
    }
}
