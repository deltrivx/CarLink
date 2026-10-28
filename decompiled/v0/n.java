package v0;

import android.os.Trace;
import b3.n0;
import b3.o0;
import b3.r0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l0.q0;
import o2.l0;
import o2.v0;
import o9.u;
import q2.p0;
import q2.x;
import q2.y1;
import u8.w;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r1.o implements x, q2.o, y1 {
    public l A;
    public m B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b3.h f13557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r0 f13558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f3.d f13559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h9.k f13560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f13565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y1.r f13566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f13567y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f13568z;

    public n(b3.h hVar, r0 r0Var, f3.d dVar, h9.k kVar, int i7, boolean z10, int i10, int i11, h hVar2, y1.r rVar) {
        this.f13557o = hVar;
        this.f13558p = r0Var;
        this.f13559q = dVar;
        this.f13560r = kVar;
        this.f13561s = i7;
        this.f13562t = z10;
        this.f13563u = i10;
        this.f13564v = i11;
        this.f13565w = hVar2;
        this.f13566x = rVar;
    }

    public final void A0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            d dVarB0 = B0();
            b3.h hVar = this.f13557o;
            r0 r0Var = this.f13558p;
            f3.d dVar = this.f13559q;
            int i7 = this.f13561s;
            boolean z14 = this.f13562t;
            int i10 = this.f13563u;
            int i11 = this.f13564v;
            dVarB0.f13495a = hVar;
            boolean zC = r0Var.c(dVarB0.k);
            dVarB0.k = r0Var;
            if (!zC) {
                dVarB0.f13510q <<= 2;
                dVarB0.f13505l = null;
                dVarB0.f13507n = null;
                dVarB0.f13509p = -1;
                dVarB0.f13508o = -1;
            }
            dVarB0.f13496b = dVar;
            dVarB0.f13497c = i7;
            dVarB0.f13498d = z14;
            dVarB0.f13499e = i10;
            dVarB0.f13500f = i11;
            dVarB0.f13501g = null;
            dVarB0.f13510q = (dVarB0.f13510q << 2) | 2;
            dVarB0.f13505l = null;
            dVarB0.f13507n = null;
            dVarB0.f13509p = -1;
            dVarB0.f13508o = -1;
        }
        if (this.f11129n) {
            if (z11 || (z10 && this.A != null)) {
                q2.f.n(this);
            }
            if (z11 || z12 || z13) {
                q2.f.m(this);
                q2.f.l(this);
            }
            if (z10) {
                q2.f.l(this);
            }
        }
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final d B0() {
        if (this.f13568z == null) {
            this.f13568z = new d(this.f13557o, this.f13558p, this.f13559q, this.f13561s, this.f13562t, this.f13563u, this.f13564v, null);
        }
        d dVar = this.f13568z;
        i9.l.b(dVar);
        return dVar;
    }

    public final d C0(n3.c cVar) {
        d dVar;
        m mVar = this.B;
        if (mVar != null && mVar.f13555c && (dVar = mVar.f13556d) != null) {
            dVar.d(cVar);
            return dVar;
        }
        d dVarB0 = B0();
        dVarB0.d(cVar);
        return dVarB0;
    }

    public final boolean D0(h9.k kVar, h hVar) {
        boolean z10;
        if (this.f13560r != kVar) {
            this.f13560r = kVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9.l.a(this.f13565w, hVar)) {
            return z10;
        }
        this.f13565w = hVar;
        return true;
    }

    public final boolean E0(r0 r0Var, int i7, int i10, boolean z10, f3.d dVar, int i11) {
        boolean z11 = !this.f13558p.c(r0Var);
        this.f13558p = r0Var;
        if (this.f13564v != i7) {
            this.f13564v = i7;
            z11 = true;
        }
        if (this.f13563u != i10) {
            this.f13563u = i10;
            z11 = true;
        }
        if (this.f13562t != z10) {
            this.f13562t = z10;
            z11 = true;
        }
        if (!i9.l.a(this.f13559q, dVar)) {
            this.f13559q = dVar;
            z11 = true;
        }
        if (this.f13561s == i11) {
            return z11;
        }
        this.f13561s = i11;
        return true;
    }

    public final boolean F0(b3.h hVar) {
        boolean zA = i9.l.a(this.f13557o.f1353b, hVar.f1353b);
        boolean z10 = (zA && i9.l.a(this.f13557o.f1352a, hVar.f1352a)) ? false : true;
        if (z10) {
            this.f13557o = hVar;
        }
        if (!zA) {
            this.B = null;
        }
        return z10;
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v0.l] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // q2.y1
    public final void Y(y2.j jVar) {
        l lVar = this.A;
        ?? r8 = lVar;
        if (lVar == null) {
            final int i7 = 0;
            ?? r10 = new h9.k(this) { // from class: v0.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f13552b;

                {
                    this.f13552b = this;
                }

                @Override // h9.k
                public final Object invoke(Object obj) {
                    o0 o0Var;
                    boolean z10;
                    switch (i7) {
                        case 0:
                            List list = (List) obj;
                            n nVar = this.f13552b;
                            o0 o0Var2 = nVar.B0().f13507n;
                            if (o0Var2 != null) {
                                n0 n0Var = o0Var2.f1408a;
                                b3.h hVar = n0Var.f1393a;
                                r0 r0Var = nVar.f13558p;
                                y1.r rVar = nVar.f13566x;
                                o0Var = new o0(new n0(hVar, r0.e(r0Var, rVar != null ? rVar.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214), n0Var.f1395c, n0Var.f1396d, n0Var.f1397e, n0Var.f1398f, n0Var.f1399g, n0Var.f1400h, n0Var.f1401i, n0Var.f1402j), o0Var2.f1409b, o0Var2.f1410c);
                                list.add(o0Var);
                            } else {
                                o0Var = null;
                            }
                            return Boolean.valueOf(o0Var != null);
                        case 1:
                            b3.h hVar2 = (b3.h) obj;
                            n nVar2 = this.f13552b;
                            m mVar = nVar2.B;
                            w wVar = w.f13122a;
                            if (mVar == null) {
                                m mVar2 = new m(nVar2.f13557o, hVar2);
                                d dVar = new d(hVar2, nVar2.f13558p, nVar2.f13559q, nVar2.f13561s, nVar2.f13562t, nVar2.f13563u, nVar2.f13564v, wVar);
                                dVar.d(nVar2.B0().f13504j);
                                mVar2.f13556d = dVar;
                                nVar2.B = mVar2;
                            } else if (!i9.l.a(hVar2, mVar.f13554b)) {
                                mVar.f13554b = hVar2;
                                d dVar2 = mVar.f13556d;
                                if (dVar2 != null) {
                                    r0 r0Var2 = nVar2.f13558p;
                                    f3.d dVar3 = nVar2.f13559q;
                                    int i10 = nVar2.f13561s;
                                    boolean z11 = nVar2.f13562t;
                                    int i11 = nVar2.f13563u;
                                    int i12 = nVar2.f13564v;
                                    dVar2.f13495a = hVar2;
                                    boolean zC = r0Var2.c(dVar2.k);
                                    dVar2.k = r0Var2;
                                    if (!zC) {
                                        dVar2.f13510q <<= 2;
                                        dVar2.f13505l = null;
                                        dVar2.f13507n = null;
                                        dVar2.f13509p = -1;
                                        dVar2.f13508o = -1;
                                    }
                                    dVar2.f13496b = dVar3;
                                    dVar2.f13497c = i10;
                                    dVar2.f13498d = z11;
                                    dVar2.f13499e = i11;
                                    dVar2.f13500f = i12;
                                    dVar2.f13501g = wVar;
                                    dVar2.f13510q = (dVar2.f13510q << 2) | 2;
                                    dVar2.f13505l = null;
                                    dVar2.f13507n = null;
                                    dVar2.f13509p = -1;
                                    dVar2.f13508o = -1;
                                }
                            }
                            q2.f.n(nVar2);
                            q2.f.m(nVar2);
                            q2.f.l(nVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            n nVar3 = this.f13552b;
                            m mVar3 = nVar3.B;
                            if (mVar3 == null) {
                                z10 = false;
                            } else {
                                if (mVar3 != null) {
                                    mVar3.f13555c = zBooleanValue;
                                }
                                q2.f.n(nVar3);
                                q2.f.m(nVar3);
                                q2.f.l(nVar3);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.A = r10;
            r8 = r10;
        }
        b3.h hVar = this.f13557o;
        u[] uVarArr = t.f15077a;
        jVar.n(y2.r.A, n3.l.I(hVar));
        m mVar = this.B;
        if (mVar != null) {
            b3.h hVar2 = mVar.f13554b;
            y2.u uVar = y2.r.B;
            u[] uVarArr2 = t.f15077a;
            u uVar2 = uVarArr2[15];
            uVar.a(jVar, hVar2);
            boolean z10 = mVar.f13555c;
            y2.u uVar3 = y2.r.C;
            u uVar4 = uVarArr2[16];
            uVar3.a(jVar, Boolean.valueOf(z10));
        }
        final int i10 = 1;
        jVar.n(y2.i.k, new y2.a(null, new h9.k(this) { // from class: v0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f13552b;

            {
                this.f13552b = this;
            }

            @Override // h9.k
            public final Object invoke(Object obj) {
                o0 o0Var;
                boolean z11;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        n nVar = this.f13552b;
                        o0 o0Var2 = nVar.B0().f13507n;
                        if (o0Var2 != null) {
                            n0 n0Var = o0Var2.f1408a;
                            b3.h hVar3 = n0Var.f1393a;
                            r0 r0Var = nVar.f13558p;
                            y1.r rVar = nVar.f13566x;
                            o0Var = new o0(new n0(hVar3, r0.e(r0Var, rVar != null ? rVar.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214), n0Var.f1395c, n0Var.f1396d, n0Var.f1397e, n0Var.f1398f, n0Var.f1399g, n0Var.f1400h, n0Var.f1401i, n0Var.f1402j), o0Var2.f1409b, o0Var2.f1410c);
                            list.add(o0Var);
                        } else {
                            o0Var = null;
                        }
                        return Boolean.valueOf(o0Var != null);
                    case 1:
                        b3.h hVar4 = (b3.h) obj;
                        n nVar2 = this.f13552b;
                        m mVar2 = nVar2.B;
                        w wVar = w.f13122a;
                        if (mVar2 == null) {
                            m mVar3 = new m(nVar2.f13557o, hVar4);
                            d dVar = new d(hVar4, nVar2.f13558p, nVar2.f13559q, nVar2.f13561s, nVar2.f13562t, nVar2.f13563u, nVar2.f13564v, wVar);
                            dVar.d(nVar2.B0().f13504j);
                            mVar3.f13556d = dVar;
                            nVar2.B = mVar3;
                        } else if (!i9.l.a(hVar4, mVar2.f13554b)) {
                            mVar2.f13554b = hVar4;
                            d dVar2 = mVar2.f13556d;
                            if (dVar2 != null) {
                                r0 r0Var2 = nVar2.f13558p;
                                f3.d dVar3 = nVar2.f13559q;
                                int i11 = nVar2.f13561s;
                                boolean z12 = nVar2.f13562t;
                                int i12 = nVar2.f13563u;
                                int i13 = nVar2.f13564v;
                                dVar2.f13495a = hVar4;
                                boolean zC = r0Var2.c(dVar2.k);
                                dVar2.k = r0Var2;
                                if (!zC) {
                                    dVar2.f13510q <<= 2;
                                    dVar2.f13505l = null;
                                    dVar2.f13507n = null;
                                    dVar2.f13509p = -1;
                                    dVar2.f13508o = -1;
                                }
                                dVar2.f13496b = dVar3;
                                dVar2.f13497c = i11;
                                dVar2.f13498d = z12;
                                dVar2.f13499e = i12;
                                dVar2.f13500f = i13;
                                dVar2.f13501g = wVar;
                                dVar2.f13510q = (dVar2.f13510q << 2) | 2;
                                dVar2.f13505l = null;
                                dVar2.f13507n = null;
                                dVar2.f13509p = -1;
                                dVar2.f13508o = -1;
                            }
                        }
                        q2.f.n(nVar2);
                        q2.f.m(nVar2);
                        q2.f.l(nVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n nVar3 = this.f13552b;
                        m mVar4 = nVar3.B;
                        if (mVar4 == null) {
                            z11 = false;
                        } else {
                            if (mVar4 != null) {
                                mVar4.f13555c = zBooleanValue;
                            }
                            q2.f.n(nVar3);
                            q2.f.m(nVar3);
                            q2.f.l(nVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        final int i11 = 2;
        jVar.n(y2.i.f14996l, new y2.a(null, new h9.k(this) { // from class: v0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f13552b;

            {
                this.f13552b = this;
            }

            @Override // h9.k
            public final Object invoke(Object obj) {
                o0 o0Var;
                boolean z11;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        n nVar = this.f13552b;
                        o0 o0Var2 = nVar.B0().f13507n;
                        if (o0Var2 != null) {
                            n0 n0Var = o0Var2.f1408a;
                            b3.h hVar3 = n0Var.f1393a;
                            r0 r0Var = nVar.f13558p;
                            y1.r rVar = nVar.f13566x;
                            o0Var = new o0(new n0(hVar3, r0.e(r0Var, rVar != null ? rVar.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214), n0Var.f1395c, n0Var.f1396d, n0Var.f1397e, n0Var.f1398f, n0Var.f1399g, n0Var.f1400h, n0Var.f1401i, n0Var.f1402j), o0Var2.f1409b, o0Var2.f1410c);
                            list.add(o0Var);
                        } else {
                            o0Var = null;
                        }
                        return Boolean.valueOf(o0Var != null);
                    case 1:
                        b3.h hVar4 = (b3.h) obj;
                        n nVar2 = this.f13552b;
                        m mVar2 = nVar2.B;
                        w wVar = w.f13122a;
                        if (mVar2 == null) {
                            m mVar3 = new m(nVar2.f13557o, hVar4);
                            d dVar = new d(hVar4, nVar2.f13558p, nVar2.f13559q, nVar2.f13561s, nVar2.f13562t, nVar2.f13563u, nVar2.f13564v, wVar);
                            dVar.d(nVar2.B0().f13504j);
                            mVar3.f13556d = dVar;
                            nVar2.B = mVar3;
                        } else if (!i9.l.a(hVar4, mVar2.f13554b)) {
                            mVar2.f13554b = hVar4;
                            d dVar2 = mVar2.f13556d;
                            if (dVar2 != null) {
                                r0 r0Var2 = nVar2.f13558p;
                                f3.d dVar3 = nVar2.f13559q;
                                int i12 = nVar2.f13561s;
                                boolean z12 = nVar2.f13562t;
                                int i13 = nVar2.f13563u;
                                int i14 = nVar2.f13564v;
                                dVar2.f13495a = hVar4;
                                boolean zC = r0Var2.c(dVar2.k);
                                dVar2.k = r0Var2;
                                if (!zC) {
                                    dVar2.f13510q <<= 2;
                                    dVar2.f13505l = null;
                                    dVar2.f13507n = null;
                                    dVar2.f13509p = -1;
                                    dVar2.f13508o = -1;
                                }
                                dVar2.f13496b = dVar3;
                                dVar2.f13497c = i12;
                                dVar2.f13498d = z12;
                                dVar2.f13499e = i13;
                                dVar2.f13500f = i14;
                                dVar2.f13501g = wVar;
                                dVar2.f13510q = (dVar2.f13510q << 2) | 2;
                                dVar2.f13505l = null;
                                dVar2.f13507n = null;
                                dVar2.f13509p = -1;
                                dVar2.f13508o = -1;
                            }
                        }
                        q2.f.n(nVar2);
                        q2.f.m(nVar2);
                        q2.f.l(nVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n nVar3 = this.f13552b;
                        m mVar4 = nVar3.B;
                        if (mVar4 == null) {
                            z11 = false;
                        } else {
                            if (mVar4 != null) {
                                mVar4.f13555c = zBooleanValue;
                            }
                            q2.f.n(nVar3);
                            q2.f.m(nVar3);
                            q2.f.l(nVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        jVar.n(y2.i.f14997m, new y2.a(null, new a5.e(29, this)));
        t.a(jVar, r8);
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, l0 l0Var, long j5) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d dVarC0 = C0(o0Var);
            boolean zC = dVarC0.c(j5, o0Var.getLayoutDirection());
            o0 o0Var2 = dVarC0.f13507n;
            if (o0Var2 == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarC0);
            }
            long j10 = o0Var2.f1410c;
            o0Var2.f1409b.f1414a.a();
            if (zC) {
                q2.f.t(this, 2).N0();
                h9.k kVar = this.f13560r;
                if (kVar != null) {
                    kVar.invoke(o0Var2);
                }
                h hVar = this.f13565w;
                if (hVar != null) {
                    hVar.a(o0Var2);
                }
                Map linkedHashMap = this.f13567y;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(o2.c.f9302a, Integer.valueOf(Math.round(o0Var2.f1411d)));
                linkedHashMap.put(o2.c.f9303b, Integer.valueOf(Math.round(o0Var2.f1412e)));
                this.f13567y = linkedHashMap;
            }
            int i7 = (int) (j10 >> 32);
            int i10 = (int) (j10 & 4294967295L);
            v0 v0VarU = l0Var.u(g5.a.D(i7, i7, i10, i10));
            Map map = this.f13567y;
            i9.l.b(map);
            o2.n0 n0VarI = o0Var.i(i7, i10, map, new d0.i(v0VarU, 7));
            Trace.endSection();
            return n0VarI;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // q2.x
    public final int c(p0 p0Var, l0 l0Var, int i7) {
        return q0.k(C0(p0Var).e(p0Var.getLayoutDirection()).c());
    }

    @Override // q2.x
    public final int d(p0 p0Var, l0 l0Var, int i7) {
        return C0(p0Var).a(i7, p0Var.getLayoutDirection());
    }

    @Override // q2.x
    public final int e(p0 p0Var, l0 l0Var, int i7) {
        return C0(p0Var).a(i7, p0Var.getLayoutDirection());
    }

    @Override // q2.x
    public final int f(p0 p0Var, l0 l0Var, int i7) {
        return q0.k(C0(p0Var).e(p0Var.getLayoutDirection()).d());
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // q2.o
    public final void x(q2.j0 r27) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.n.x(q2.j0):void");
    }
}
