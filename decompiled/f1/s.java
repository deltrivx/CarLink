package f1;

import android.os.Trace;
import com.baidu.carlife.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public int A;
    public int B;
    public boolean C;
    public final r D;
    public final ArrayList E;
    public boolean F;
    public h2 G;
    public i2 H;
    public l2 I;
    public boolean J;
    public q1 K;
    public g1.a L;
    public final g1.b M;
    public a N;
    public g1.c O;
    public b3.l0 P;
    public final q1.c Q;
    public final y8.h R;
    public boolean S;
    public long T;
    public x U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.b f5106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f5108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.k0 f5109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1.a f5110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.a f5111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2.d f5112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f5113h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p1 f5115j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5117m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f5119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s.u f5120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5122r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s.w f5126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5127w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5129y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5114i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f5118n = new o0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f5123s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f5124t = new o0();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q1 f5125u = n1.g.f8712d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f5128x = new o0();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5130z = -1;

    public s(a2.b bVar, v vVar, i2 i2Var, s.k0 k0Var, g1.a aVar, g1.a aVar2, a2.d dVar, y yVar) {
        this.f5106a = bVar;
        this.f5107b = vVar;
        this.f5108c = i2Var;
        this.f5109d = k0Var;
        this.f5110e = aVar;
        this.f5111f = aVar2;
        this.f5112g = dVar;
        this.f5113h = yVar;
        this.C = vVar.f() || vVar.d();
        this.D = new r(0, this);
        this.E = new ArrayList();
        h2 h2VarK = i2Var.k();
        h2VarK.c();
        this.G = h2VarK;
        i2 i2Var2 = new i2();
        if (vVar.f()) {
            i2Var2.d();
        }
        if (vVar.d()) {
            i2Var2.k = new s.w();
        }
        this.H = i2Var2;
        l2 l2VarM = i2Var2.m();
        l2VarM.e(true);
        this.I = l2VarM;
        this.M = new g1.b(this, aVar);
        h2 h2VarK2 = this.H.k();
        try {
            a aVarA = h2VarK2.a(0);
            h2VarK2.c();
            this.N = aVarA;
            this.O = new g1.c();
            this.Q = new q1.c(this);
            y8.h hVarJ = vVar.j();
            y8.h hVarY = y();
            this.R = hVarJ.s(hVarY == null ? y8.i.f15108a : hVarY);
        } catch (Throwable th) {
            h2VarK2.c();
            throw th;
        }
    }

    public static final int M(s sVar, int i7, boolean z10, int i10) {
        h2 h2Var = sVar.G;
        if (h2Var.j(i7)) {
            int i11 = h2Var.i(i7);
            Object objP = h2Var.p(h2Var.f4971b, i7);
            if (i11 == 206 && i9.l.a(objP, t.f5146e)) {
                Object objH = h2Var.h(i7, 0);
                p pVar = objH instanceof p ? (p) objH : null;
                if (pVar != null) {
                    for (s sVar2 : pVar.f5077a.f5092e) {
                        i2 i2Var = sVar2.f5108c;
                        if (i2Var.f4986b > 0 && (i2Var.f4985a[1] & 67108864) != 0) {
                            y yVar = sVar2.f5113h;
                            synchronized (yVar.f5207d) {
                                yVar.p();
                                s.h0 h0Var = yVar.f5216n;
                                yVar.f5216n = k9.a.o();
                                try {
                                    yVar.f5224v.d0(h0Var);
                                } catch (Throwable th) {
                                    yVar.f5216n = h0Var;
                                    throw th;
                                }
                            }
                            g1.a aVar = new g1.a();
                            sVar2.L = aVar;
                            h2 h2VarK = sVar2.f5108c.k();
                            try {
                                sVar2.G = h2VarK;
                                g1.b bVar = sVar2.M;
                                g1.a aVar2 = bVar.f5764b;
                                try {
                                    bVar.f5764b = aVar;
                                    sVar2.L(0);
                                    g1.b bVar2 = sVar2.M;
                                    bVar2.b();
                                    if (bVar2.f5765c) {
                                        bVar2.f5764b.f5761g.a0(g1.c0.f5777d);
                                        if (bVar2.f5765c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f5764b.f5761g.a0(g1.m.f5801d);
                                            bVar2.f5765c = false;
                                        }
                                    }
                                    bVar.f5764b = aVar2;
                                    h2VarK.c();
                                } catch (Throwable th2) {
                                    bVar.f5764b = aVar2;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                h2VarK.c();
                                throw th3;
                            }
                        }
                        sVar.f5107b.q(sVar2.f5113h);
                    }
                }
                return h2Var.o(i7);
            }
            if (!h2Var.l(i7)) {
                return h2Var.o(i7);
            }
        } else if (h2Var.d(i7)) {
            int i12 = h2Var.f4971b[(i7 * 5) + 3] + i7;
            int iM = 0;
            for (int i13 = i7 + 1; i13 < i12; i13 += h2Var.f4971b[(i13 * 5) + 3]) {
                boolean zL = h2Var.l(i13);
                if (zL) {
                    sVar.M.c();
                    g1.b bVar3 = sVar.M;
                    Object objN = h2Var.n(i13);
                    bVar3.c();
                    bVar3.f5770h.add(objN);
                }
                iM += M(sVar, i13, zL || z10, zL ? 0 : i10 + iM);
                if (zL) {
                    sVar.M.c();
                    sVar.M.a();
                }
            }
            if (!h2Var.l(i7)) {
                return iM;
            }
        } else if (!h2Var.l(i7)) {
            return h2Var.o(i7);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        g1.a aVar = this.f5111f;
        g1.b bVar = this.M;
        g1.a aVar2 = bVar.f5764b;
        try {
            bVar.f5764b = aVar;
            aVar.f5761g.a0(g1.a0.f5762d);
            if (arrayList.size() <= 0) {
                bVar.f5764b.f5761g.a0(g1.n.f5802d);
                bVar.f5768f = 0;
                bVar.f5764b = aVar2;
            } else {
                t8.j jVar = (t8.j) arrayList.get(0);
                a1 a1Var = (a1) jVar.f12830a;
                a1Var.getClass();
                throw null;
            }
        } catch (Throwable th) {
            bVar.f5764b = aVar2;
            throw th;
        }
    }

    public final void B(q1 q1Var, Object obj) {
        U(126665345, null);
        C();
        i0(obj);
        long j5 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                l2.y(this.I);
            }
            boolean z10 = (this.S || i9.l.a(this.G.f(), q1Var)) ? false : true;
            if (z10) {
                I(q1Var);
            }
            R(202, 0, t.f5144c, q1Var);
            this.K = null;
            boolean z11 = this.f5127w;
            this.f5127w = z10;
            n1.h.c(this, new n1.c(new c8.v(2, obj), 316014703, true));
            this.f5127w = z11;
            p(false);
            this.K = null;
            this.T = j5;
            p(false);
        } catch (Throwable th) {
            try {
                n3.r.b0(th, new o(2, this));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j5;
                p(false);
                throw th2;
            }
        }
    }

    public final Object C() {
        boolean z10 = this.S;
        w0 w0Var = n.f5051a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f5129y || (objM instanceof p)) {
                return objM;
            }
        } else if (this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return w0Var;
        }
        return w0Var;
    }

    public final List D() {
        v vVar = this.f5107b;
        u uVarH = vVar.h();
        y yVar = ob.a.A(uVarH) ? (y) uVarH : null;
        if (yVar != null) {
            i2 i2Var = yVar.f5209f;
            h2 h2VarK = i2Var.k();
            try {
                Integer numH0 = n3.n.h0(h2VarK, vVar, 0, h2VarK.f4972c);
                h2VarK.c();
                if (numH0 != null) {
                    h2 h2VarK2 = i2Var.k();
                    try {
                        return n3.n.O0(h2VarK2, numH0.intValue(), 0);
                    } finally {
                        h2VarK2.c();
                    }
                }
            } catch (Throwable th) {
                h2VarK.c();
                throw th;
            }
        }
        return u8.w.f13122a;
    }

    public final int E(int i7) {
        int iQ = this.G.q(i7) + 1;
        int i10 = 0;
        while (iQ < i7) {
            if (!this.G.k(iQ)) {
                i10++;
            }
            iQ += k2.a(this.G.f4971b, iQ);
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object F(y yVar, y yVar2, Integer num, List list, h9.a aVar) {
        Object objInvoke;
        boolean z10 = this.F;
        int i7 = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t8.j jVar = (t8.j) list.get(i10);
                w1 w1Var = (w1) jVar.f12830a;
                Object obj = jVar.f12831b;
                if (obj != null) {
                    c0(w1Var, obj);
                } else {
                    c0(w1Var, null);
                }
            }
            if (yVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (yVar2 == null || yVar2.equals(yVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    yVar.f5220r = yVar2;
                    yVar.f5221s = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        yVar.f5220r = null;
                        yVar.f5221s = 0;
                    } catch (Throwable th) {
                        yVar.f5220r = null;
                        yVar.f5221s = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.F = z10;
            this.k = i7;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z10;
            this.k = i7;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[LOOP:7: B:34:0x00b0->B:50:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:66:0x0143
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.s.G():void");
    }

    public final void H() {
        int i7;
        L(this.G.f4976g);
        g1.b bVar = this.M;
        bVar.d(false);
        o0 o0Var = bVar.f5766d;
        s sVar = bVar.f5763a;
        h2 h2Var = sVar.G;
        if (h2Var.f4972c > 0 && o0Var.a(-2) != (i7 = h2Var.f4978i)) {
            if (!bVar.f5765c && bVar.f5767e) {
                bVar.d(false);
                bVar.f5764b.f5761g.a0(g1.q.f5805d);
                bVar.f5765c = true;
            }
            if (i7 > 0) {
                a aVarA = h2Var.a(i7);
                o0Var.c(i7);
                bVar.d(false);
                g1.l0 l0Var = bVar.f5764b.f5761g;
                l0Var.a0(g1.p.f5804d);
                k9.a.Q(l0Var, 0, aVarA);
                bVar.f5765c = true;
            }
        }
        bVar.f5764b.f5761g.a0(g1.y.f5817d);
        int i10 = bVar.f5768f;
        h2 h2Var2 = sVar.G;
        bVar.f5768f = h2Var2.f4971b[(h2Var2.f4976g * 5) + 3] + i10;
    }

    public final void I(q1 q1Var) {
        s.w wVar = this.f5126v;
        if (wVar == null) {
            wVar = new s.w();
            this.f5126v = wVar;
        }
        wVar.h(this.G.f4976g, q1Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void J(int i7, int i10, int i11) {
        h2 h2Var = this.G;
        if (i7 == i10) {
            i11 = i7;
        } else if (i7 != i11 && i10 != i11) {
            if (h2Var.q(i7) == i10) {
                i11 = i10;
            } else if (h2Var.q(i10) == i7) {
                i11 = i7;
            } else if (h2Var.q(i7) == h2Var.q(i10)) {
                i11 = h2Var.q(i7);
            } else {
                int iQ = i7;
                int i12 = 0;
                while (iQ > 0 && iQ != i11) {
                    iQ = h2Var.q(iQ);
                    i12++;
                }
                int iQ2 = i10;
                int i13 = 0;
                while (iQ2 > 0 && iQ2 != i11) {
                    iQ2 = h2Var.q(iQ2);
                    i13++;
                }
                int i14 = i12 - i13;
                int iQ3 = i7;
                for (int i15 = 0; i15 < i14; i15++) {
                    iQ3 = h2Var.q(iQ3);
                }
                int i16 = i13 - i12;
                int iQ4 = i10;
                for (int i17 = 0; i17 < i16; i17++) {
                    iQ4 = h2Var.q(iQ4);
                }
                i11 = iQ3;
                for (int iQ5 = iQ4; i11 != iQ5; iQ5 = h2Var.q(iQ5)) {
                    i11 = h2Var.q(i11);
                }
            }
        }
        while (i7 > 0 && i7 != i11) {
            if (h2Var.l(i7)) {
                this.M.a();
            }
            i7 = h2Var.q(i7);
        }
        o(i10, i11);
    }

    public final Object K() {
        boolean z10 = this.S;
        w0 w0Var = n.f5051a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f5129y || (objM instanceof p)) {
                return objM instanceof e2 ? ((e2) objM).f4944a : objM;
            }
        } else if (this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return w0Var;
        }
        return w0Var;
    }

    public final void L(int i7) {
        boolean zL = this.G.l(i7);
        g1.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i7);
            bVar.c();
            bVar.f5770h.add(objN);
        }
        M(this, i7, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean N(int i7, boolean z10) {
        if ((i7 & 1) == 0 && (this.S || this.f5129y)) {
            b3.l0 l0Var = this.P;
            if (l0Var != null && w() != null) {
                l0Var.getClass();
            }
        } else if (!z10 && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    public final void O() {
        int i7;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.f5123s.isEmpty()) {
            this.f5116l = this.G.s() + this.f5116l;
            return;
        }
        h2 h2Var = this.G;
        int iG = h2Var.g();
        int[] iArr = h2Var.f4971b;
        int i10 = h2Var.f4976g;
        Object objP = i10 < h2Var.f4977h ? h2Var.p(iArr, i10) : null;
        Object objF = h2Var.f();
        int i11 = this.f5117m;
        w0 w0Var = n.f5051a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(w0Var)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i11);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i11);
            }
            V(null, (iArr[(h2Var.f4976g * 5) + 1] & 1073741824) != 0);
            G();
            h2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(w0Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i11), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i11), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i7 = 0;
        } else {
            i7 = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i7);
        this.T = jRotateLeft2;
        V(null, (iArr[(h2Var.f4976g * 5) + 1] & 1073741824) != 0);
        G();
        h2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i11), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void P() {
        h2 h2Var = this.G;
        int i7 = h2Var.f4978i;
        this.f5116l = i7 >= 0 ? h2Var.f4971b[(i7 * 5) + 1] & 67108863 : 0;
        h2Var.t();
    }

    public final void Q() {
        if (this.f5116l != 0) {
            t.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        w1 w1VarW = w();
        if (w1VarW != null) {
            int i7 = w1VarW.f5190b;
            if ((i7 & 128) == 0) {
                w1VarW.f5190b = i7 | 16;
            }
        }
        if (this.f5123s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    public final void R(int i7, int i10, Object obj, Object obj2) {
        long jRotateLeft;
        long j5;
        boolean z10;
        boolean z11;
        boolean z12;
        p1 p1Var;
        p1 p1Var2;
        ArrayList arrayList;
        s.w wVar;
        int i11;
        Object objValueOf;
        s.h0 h0Var;
        Object objG;
        s.d0 d0Var;
        l2 l2Var;
        int i12;
        Object obj3;
        int i13;
        int i14;
        Object[] objArr;
        Object[] objArr2;
        int i15;
        int i16;
        char c10;
        h2 h2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        h2 h2Var2;
        int i20;
        Object objP;
        l2 l2Var2;
        int i21;
        p1 p1Var3;
        Object obj4 = obj;
        if (this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i22 = this.f5117m;
        Object obj5 = n.f5051a;
        if (obj4 == null) {
            if (obj2 == null || i7 != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i7), 3);
                j5 = i22;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i22);
            }
            if (obj4 == null) {
                this.f5117m++;
            }
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S) {
                this.G.k++;
                l2Var2 = this.I;
                i21 = l2Var2.f5036t;
                if (z10) {
                    l2Var2.P(i7, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    l2Var2.P(i7, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    l2Var2.P(i7, obj4, obj5, false);
                }
                p1Var3 = this.f5115j;
                if (p1Var3 != null) {
                    int i23 = (-2) - i21;
                    s0 s0Var = new s0(-1, i7, i23, -1);
                    p1Var3.f5085e.h(i23, new l0(-1, this.k - p1Var3.f5082b, 0));
                    p1Var3.f5084d.add(s0Var);
                }
                u(z10, null);
                return;
            }
            if (i10 != 1 && this.f5129y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f5115j == null) {
                int iG = this.G.g();
                if (!z11 && iG == i7) {
                    h2Var2 = this.G;
                    i20 = h2Var2.f4976g;
                    if (i20 < h2Var2.f4977h) {
                        objP = h2Var2.p(h2Var2.f4971b, i20);
                    } else {
                        objP = null;
                    }
                    if (i9.l.a(obj4, objP)) {
                        V(obj2, z10);
                        z12 = z11;
                    }
                }
                h2Var = this.G;
                iArr = h2Var.f4971b;
                arrayList2 = new ArrayList();
                if (h2Var.k <= 0) {
                    i17 = h2Var.f4976g;
                    while (i17 < h2Var.f4977h) {
                        int i24 = i17 * 5;
                        int i25 = iArr[i24];
                        Object objP2 = h2Var.p(iArr, i17);
                        i18 = iArr[i24 + 1];
                        if ((i18 & 1073741824) != 0) {
                            i19 = 1;
                        } else {
                            i19 = i18 & 67108863;
                        }
                        arrayList2.add(new s0(objP2, i25, i17, i19));
                        i17 += iArr[i24 + 3];
                        z11 = z11;
                    }
                }
                z12 = z11;
                this.f5115j = new p1(this.k, arrayList2);
            } else {
                z12 = z11;
            }
            p1Var = this.f5115j;
            if (p1Var != null) {
                arrayList = p1Var.f5084d;
                wVar = p1Var.f5085e;
                i11 = p1Var.f5082b;
                if (obj4 != null) {
                    objValueOf = new r0(Integer.valueOf(i7), obj4);
                } else {
                    objValueOf = Integer.valueOf(i7);
                }
                h0Var = ((h1.a) p1Var.f5086f.getValue()).f6411a;
                objG = h0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof s.d0) {
                    d0Var = (s.d0) objG;
                    Object objJ = d0Var.j(0);
                    if (d0Var.g()) {
                        h0Var.k(objValueOf);
                    }
                    if (d0Var.f12408b == 1) {
                        h0Var.m(objValueOf, d0Var.d());
                    }
                    objG = objJ;
                } else {
                    h0Var.k(objValueOf);
                }
                s0 s0Var2 = (s0) objG;
                if (!z12 || s0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.f5039w) {
                        l2 l2VarM = this.H.m();
                        this.I = l2VarM;
                        l2VarM.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    l2Var = this.I;
                    int i26 = l2Var.f5036t;
                    if (z10) {
                        l2Var.P(i7, obj5, obj5, true);
                        i12 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i12 = 0;
                        l2Var.P(i7, obj5, obj2, false);
                    } else {
                        i12 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        l2Var.P(i7, obj3, obj5, false);
                    }
                    this.N = this.I.b(i26);
                    int i27 = (-2) - i26;
                    s0 s0Var3 = new s0(-1, i7, i27, -1);
                    wVar.h(i27, new l0(-1, this.k - i11, i12));
                    arrayList.add(s0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = this.k;
                    }
                    p1Var2 = new p1(i13, arrayList3);
                } else {
                    int i28 = s0Var2.f5133c;
                    arrayList.add(s0Var2);
                    l0 l0Var = (l0) wVar.b(i28);
                    this.k = (l0Var != null ? l0Var.f5012b : -1) + i11;
                    l0 l0Var2 = (l0) wVar.b(i28);
                    int i29 = l0Var2 != null ? l0Var2.f5011a : -1;
                    int i30 = p1Var.f5083c;
                    int i31 = i29 - i30;
                    if (i29 <= i30) {
                        i14 = i31;
                        if (i30 > i29) {
                            Object[] objArr3 = wVar.f12463c;
                            long[] jArr = wVar.f12461a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i32 = 0;
                                while (true) {
                                    long j10 = jArr[i32];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i32 - length)) >>> 31);
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            if ((j10 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                l0 l0Var3 = (l0) objArr3[(i32 << 3) + i34];
                                                int i35 = l0Var3.f5011a;
                                                if (i35 == i29) {
                                                    l0Var3.f5011a = i30;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i29 + 1 <= i35 && i35 < i30) {
                                                        l0Var3.f5011a = i35 - 1;
                                                    }
                                                }
                                            }
                                            j10 >>= 8;
                                            i34++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i33 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i32 == length) {
                                        break;
                                    }
                                    i32++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = wVar.f12463c;
                        long[] jArr2 = wVar.f12461a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i36 = 0;
                            while (true) {
                                long j11 = jArr2[i36];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                    int i38 = 0;
                                    while (i38 < i37) {
                                        if ((j11 & 255) < 128) {
                                            c10 = '\b';
                                            l0 l0Var4 = (l0) objArr4[(i36 << 3) + i38];
                                            i16 = i31;
                                            int i39 = l0Var4.f5011a;
                                            if (i39 == i29) {
                                                l0Var4.f5011a = i30;
                                            } else if (i30 <= i39 && i39 < i29) {
                                                l0Var4.f5011a = i39 + 1;
                                            }
                                        } else {
                                            i16 = i31;
                                            c10 = '\b';
                                        }
                                        j11 >>= c10;
                                        i38++;
                                        i31 = i16;
                                    }
                                    i14 = i31;
                                    if (i37 != 8) {
                                        break;
                                    }
                                } else {
                                    i14 = i31;
                                }
                                if (i36 == length2) {
                                    break;
                                }
                                i36++;
                                i31 = i14;
                            }
                        } else {
                            i14 = i31;
                        }
                    }
                    g1.b bVar = this.M;
                    int i40 = bVar.f5768f;
                    s sVar = bVar.f5763a;
                    bVar.f5768f = (i28 - sVar.G.f4976g) + i40;
                    this.G.r(i28);
                    if (i14 > 0) {
                        bVar.d(false);
                        o0 o0Var = bVar.f5766d;
                        h2 h2Var3 = sVar.G;
                        if (h2Var3.f4972c > 0 && o0Var.a(-2) != (i15 = h2Var3.f4978i)) {
                            if (!bVar.f5765c && bVar.f5767e) {
                                bVar.d(false);
                                bVar.f5764b.f5761g.a0(g1.q.f5805d);
                                bVar.f5765c = true;
                            }
                            if (i15 > 0) {
                                a aVarA = h2Var3.a(i15);
                                o0Var.c(i15);
                                bVar.d(false);
                                g1.l0 l0Var5 = bVar.f5764b.f5761g;
                                l0Var5.a0(g1.p.f5804d);
                                k9.a.Q(l0Var5, 0, aVarA);
                                bVar.f5765c = true;
                            }
                        }
                        g1.l0 l0Var6 = bVar.f5764b.f5761g;
                        l0Var6.a0(g1.u.f5813d);
                        l0Var6.f5798i[l0Var6.f5799j - l0Var6.f5796g[l0Var6.f5797h - 1].f5792b] = i14;
                    }
                    V(obj2, z10);
                    p1Var2 = null;
                }
            } else {
                p1Var2 = null;
            }
            u(z10, p1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j5 = 0;
        this.T = jRotateLeft ^ j5;
        if (obj4 == null) {
            this.f5117m++;
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S) {
            this.G.k++;
            l2Var2 = this.I;
            i21 = l2Var2.f5036t;
            if (z10) {
                l2Var2.P(i7, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                l2Var2.P(i7, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                l2Var2.P(i7, obj4, obj5, false);
            }
            p1Var3 = this.f5115j;
            if (p1Var3 != null) {
                int i210 = (-2) - i21;
                s0 s0Var4 = new s0(-1, i7, i210, -1);
                p1Var3.f5085e.h(i210, new l0(-1, this.k - p1Var3.f5082b, 0));
                p1Var3.f5084d.add(s0Var4);
            }
            u(z10, null);
            return;
        }
        if (i10 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f5115j == null) {
            int iG2 = this.G.g();
            if (!z11) {
                h2Var2 = this.G;
                i20 = h2Var2.f4976g;
                if (i20 < h2Var2.f4977h) {
                    objP = h2Var2.p(h2Var2.f4971b, i20);
                } else {
                    objP = null;
                }
                if (i9.l.a(obj4, objP)) {
                    V(obj2, z10);
                    z12 = z11;
                }
            }
            h2Var = this.G;
            iArr = h2Var.f4971b;
            arrayList2 = new ArrayList();
            if (h2Var.k <= 0) {
                i17 = h2Var.f4976g;
                while (i17 < h2Var.f4977h) {
                    int i211 = i17 * 5;
                    int i212 = iArr[i211];
                    Object objP3 = h2Var.p(iArr, i17);
                    i18 = iArr[i211 + 1];
                    if ((i18 & 1073741824) != 0) {
                        i19 = 1;
                    } else {
                        i19 = i18 & 67108863;
                    }
                    arrayList2.add(new s0(objP3, i212, i17, i19));
                    i17 += iArr[i211 + 3];
                    z11 = z11;
                }
            }
            z12 = z11;
            this.f5115j = new p1(this.k, arrayList2);
        } else {
            z12 = z11;
        }
        p1Var = this.f5115j;
        if (p1Var != null) {
            arrayList = p1Var.f5084d;
            wVar = p1Var.f5085e;
            i11 = p1Var.f5082b;
            if (obj4 != null) {
                objValueOf = new r0(Integer.valueOf(i7), obj4);
            } else {
                objValueOf = Integer.valueOf(i7);
            }
            h0Var = ((h1.a) p1Var.f5086f.getValue()).f6411a;
            objG = h0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof s.d0) {
                d0Var = (s.d0) objG;
                Object objJ2 = d0Var.j(0);
                if (d0Var.g()) {
                    h0Var.k(objValueOf);
                }
                if (d0Var.f12408b == 1) {
                    h0Var.m(objValueOf, d0Var.d());
                }
                objG = objJ2;
            } else {
                h0Var.k(objValueOf);
            }
            s0 s0Var5 = (s0) objG;
            if (z12) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.f5039w) {
                l2 l2VarM2 = this.H.m();
                this.I = l2VarM2;
                l2VarM2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            l2Var = this.I;
            int i213 = l2Var.f5036t;
            if (z10) {
                l2Var.P(i7, obj5, obj5, true);
                i12 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i12 = 0;
                l2Var.P(i7, obj5, obj2, false);
            } else {
                i12 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                l2Var.P(i7, obj3, obj5, false);
            }
            this.N = this.I.b(i213);
            int i214 = (-2) - i213;
            s0 s0Var6 = new s0(-1, i7, i214, -1);
            wVar.h(i214, new l0(-1, this.k - i11, i12));
            arrayList.add(s0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z10) {
                i13 = 0;
            } else {
                i13 = this.k;
            }
            p1Var2 = new p1(i13, arrayList4);
        } else {
            p1Var2 = null;
        }
        u(z10, p1Var2);
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i7, e1 e1Var) {
        R(i7, 0, e1Var, null);
    }

    public final void U(int i7, Object obj) {
        R(i7, 0, obj, null);
    }

    public final void V(Object obj, boolean z10) {
        if (z10) {
            h2 h2Var = this.G;
            if (h2Var.k <= 0) {
                if ((h2Var.f4971b[(h2Var.f4976g * 5) + 1] & 1073741824) == 0) {
                    r1.a("Expected a node group");
                }
                h2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            g1.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            g1.l0 l0Var = bVar.f5764b.f5761g;
            l0Var.a0(g1.f0.f5783d);
            k9.a.Q(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i7) {
        int i10;
        int i11;
        if (this.f5115j != null) {
            R(i7, 0, null, null);
            return;
        }
        if (this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i7), 3) ^ ((long) this.f5117m);
        this.f5117m++;
        h2 h2Var = this.G;
        boolean z10 = this.S;
        w0 w0Var = n.f5051a;
        if (z10) {
            h2Var.k++;
            this.I.P(i7, w0Var, w0Var, false);
            u(false, null);
            return;
        }
        if (h2Var.g() == i7 && ((i11 = h2Var.f4976g) >= h2Var.f4977h || (h2Var.f4971b[(i11 * 5) + 1] & 536870912) == 0)) {
            h2Var.u();
            u(false, null);
            return;
        }
        if (h2Var.k <= 0 && (i10 = h2Var.f4976g) != h2Var.f4977h) {
            int i12 = this.k;
            H();
            this.M.e(i12, h2Var.s());
            t.a(this.f5123s, i10, h2Var.f4976g);
        }
        h2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.f5039w) {
            l2 l2VarM = this.H.m();
            this.I = l2VarM;
            l2VarM.L();
            this.J = false;
            this.K = null;
        }
        l2 l2Var = this.I;
        l2Var.d();
        int i13 = l2Var.f5036t;
        l2Var.P(i7, w0Var, w0Var, false);
        this.N = l2Var.b(i13);
        u(false, null);
    }

    public final void X(int i7) {
        R(i7, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    public final s Y(int i7) {
        w1 w1Var;
        boolean z10;
        W(i7);
        boolean z11 = this.S;
        a2.d dVar = this.f5112g;
        ArrayList arrayList = this.E;
        y yVar = this.f5113h;
        if (z11) {
            w1 w1Var2 = new w1(yVar);
            arrayList.add(w1Var2);
            i0(w1Var2);
            w1Var2.f5193e = this.B;
            w1Var2.f5190b &= -17;
            dVar.m();
            return this;
        }
        int i10 = this.G.f4978i;
        ArrayList arrayList2 = this.f5123s;
        int iE = t.e(i10, arrayList2);
        p0 p0Var = iE >= 0 ? (p0) arrayList2.remove(iE) : null;
        Object objM = this.G.m();
        if (i9.l.a(objM, n.f5051a)) {
            w1Var = new w1(yVar);
            i0(w1Var);
        } else {
            i9.l.c(objM, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            w1Var = (w1) objM;
        }
        if (p0Var == null) {
            int i11 = w1Var.f5190b;
            boolean z12 = (i11 & 64) != 0;
            if (z12) {
                w1Var.f5190b = i11 & (-65);
            }
            if (z12) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        int i12 = w1Var.f5190b;
        w1Var.f5190b = z10 ? i12 | 8 : i12 & (-9);
        arrayList.add(w1Var);
        w1Var.f5193e = this.B;
        w1Var.f5190b &= -17;
        dVar.m();
        int i13 = w1Var.f5190b;
        if ((i13 & 256) != 0) {
            w1Var.f5190b = (i13 & (-257)) | 512;
            g1.l0 l0Var = this.M.f5764b.f5761g;
            l0Var.a0(g1.d0.f5779d);
            k9.a.Q(l0Var, 0, w1Var);
            if (!this.f5129y) {
                int i14 = w1Var.f5190b;
                if ((i14 & 128) != 0) {
                    this.f5129y = true;
                    w1Var.f5190b = i14 | 1024;
                }
            }
        }
        return this;
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !i9.l.a(this.G.f(), obj) && this.f5130z < 0) {
            this.f5130z = this.G.f4976g;
            this.f5129y = true;
        }
        R(207, 0, null, obj);
    }

    public final void a() {
        i();
        this.f5114i.clear();
        this.f5118n.f5067b = 0;
        this.f5124t.f5067b = 0;
        this.f5128x.f5067b = 0;
        this.f5126v = null;
        g1.c cVar = this.O;
        cVar.f5776h.W();
        cVar.f5775g.W();
        this.T = 0;
        this.A = 0;
        this.f5122r = false;
        this.S = false;
        this.f5129y = false;
        this.F = false;
        this.f5130z = -1;
        h2 h2Var = this.G;
        if (!h2Var.f4975f) {
            h2Var.c();
        }
        if (this.I.f5039w) {
            return;
        }
        v();
    }

    public final void a0() {
        R(125, 2, null, null);
        this.f5122r = true;
    }

    public final void b(h9.n nVar, Object obj) {
        if (this.S) {
            g1.l0 l0Var = this.O.f5775g;
            l0Var.a0(g1.g0.f5785d);
            k9.a.Q(l0Var, 0, obj);
            i9.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            i9.b0.d(2, nVar);
            k9.a.Q(l0Var, 1, nVar);
            return;
        }
        g1.b bVar = this.M;
        bVar.b();
        g1.l0 l0Var2 = bVar.f5764b.f5761g;
        l0Var2.a0(g1.g0.f5785d);
        i9.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        i9.b0.d(2, nVar);
        k9.a.R(l0Var2, 0, obj, 1, nVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b0() {
        this.f5117m = 0;
        this.G = this.f5108c.k();
        R(100, 0, null, null);
        v vVar = this.f5107b;
        vVar.r();
        q1 q1VarI = vVar.i();
        this.f5128x.c(this.f5127w ? 1 : 0);
        this.f5127w = f(q1VarI);
        this.K = null;
        if (!this.f5121q) {
            this.f5121q = vVar.e();
        }
        if (!this.C) {
            this.C = vVar.f();
        }
        if (this.C) {
            x2 x2Var = q1.d.f10581a;
            i9.l.c(x2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            q1VarI = ((n1.g) q1VarI).c(x2Var, new y2(y()));
        }
        this.f5125u = q1VarI;
        Set set = (Set) b.t(q1VarI, q1.f.f10583a);
        if (set != null) {
            x xVar = this.U;
            if (xVar == null) {
                xVar = new x(this.f5113h);
                this.U = xVar;
            }
            set.add(xVar);
            vVar.n(set);
        }
        long jG = vVar.g();
        R((int) (jG ^ (jG >>> 32)), 0, null, null);
    }

    public final boolean c(float f10) {
        Object objC = C();
        if ((objC instanceof Float) && f10 == ((Number) objC).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f10));
        return true;
    }

    public final boolean c0(w1 w1Var, Object obj) {
        a aVar = w1Var.f5191c;
        if (aVar == null) {
            return false;
        }
        int iC = this.G.f4970a.c(aVar);
        if (!this.F || iC < this.G.f4976g) {
            return false;
        }
        ArrayList arrayList = this.f5123s;
        int iE = t.e(iC, arrayList);
        if (iE < 0) {
            int i7 = -(iE + 1);
            if (!(obj instanceof f0)) {
                obj = null;
            }
            arrayList.add(i7, new p0(w1Var, iC, obj));
            return true;
        }
        p0 p0Var = (p0) arrayList.get(iE);
        if (!(obj instanceof f0)) {
            p0Var.f5080c = null;
            return true;
        }
        Object obj2 = p0Var.f5080c;
        if (obj2 == null) {
            p0Var.f5080c = obj;
            return true;
        }
        if (obj2 instanceof s.i0) {
            ((s.i0) obj2).a(obj);
            return true;
        }
        s.i0 i0Var = s.p0.f12478a;
        s.i0 i0Var2 = new s.i0(2);
        i0Var2.j(obj2);
        i0Var2.j(obj);
        p0Var.f5080c = i0Var2;
        return true;
    }

    public final boolean d(int i7) {
        Object objC = C();
        if ((objC instanceof Integer) && i7 == ((Number) objC).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i7));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[LOOP:1: B:17:0x003a->B:32:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[EDGE_INSN: B:40:0x008b->B:33:0x008b BREAK  A[LOOP:1: B:17:0x003a->B:32:0x0088], SYNTHETIC] */
    public final void d0(s.h0 h0Var) {
        ArrayList arrayList = this.f5123s;
        for (int iA = n3.l.A(arrayList); -1 < iA; iA--) {
            p0 p0Var = (p0) arrayList.get(iA);
            a aVar = p0Var.f5078a.f5191c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(iA);
            } else {
                int i7 = p0Var.f5079b;
                int i10 = aVar.f4875a;
                if (i7 != i10) {
                    p0Var.f5079b = i10;
                }
            }
        }
        Object[] objArr = h0Var.f12438b;
        Object[] objArr2 = h0Var.f12439c;
        long[] jArr = h0Var.f12437a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j5 = jArr[i11];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j5) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            w1 w1Var = (w1) obj;
                            a aVar2 = w1Var.f5191c;
                            if (aVar2 != null) {
                                int i15 = aVar2.f4875a;
                                if (obj2 == w0.f5186e) {
                                    obj2 = null;
                                }
                                arrayList.add(new p0(w1Var, i15, obj2));
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        u8.t.b0(arrayList, t.f5147f);
    }

    public final boolean e(long j5) {
        Object objC = C();
        if ((objC instanceof Long) && j5 == ((Number) objC).longValue()) {
            return false;
        }
        i0(Long.valueOf(j5));
        return true;
    }

    public final void e0(int i7, int i10) {
        if (j0(i7) != i10) {
            if (i7 < 0) {
                s.u uVar = this.f5120p;
                if (uVar == null) {
                    uVar = new s.u();
                    this.f5120p = uVar;
                }
                uVar.f(i7, i10);
                return;
            }
            int[] iArr = this.f5119o;
            if (iArr == null) {
                int i11 = this.G.f4972c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f5119o = iArr2;
                iArr = iArr2;
            }
            iArr[i7] = i10;
        }
    }

    public final boolean f(Object obj) {
        if (i9.l.a(C(), obj)) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void f0(int i7, int i10) {
        int iJ0 = j0(i7);
        if (iJ0 != i10) {
            int i11 = i10 - iJ0;
            ArrayList arrayList = this.f5114i;
            int size = arrayList.size() - 1;
            while (i7 != -1) {
                int iJ1 = j0(i7) + i11;
                e0(i7, iJ1);
                for (int i12 = size; -1 < i12; i12--) {
                    p1 p1Var = (p1) arrayList.get(i12);
                    if (p1Var != null && p1Var.a(i7, iJ1)) {
                        size = i12 - 1;
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = this.G.f4978i;
                } else if (this.G.l(i7)) {
                    return;
                } else {
                    i7 = this.G.q(i7);
                }
            }
        }
    }

    public final boolean g(boolean z10) {
        Object objC = C();
        if ((objC instanceof Boolean) && z10 == ((Boolean) objC).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z10));
        return true;
    }

    public final n1.g g0(q1 q1Var, n1.g gVar) {
        n1.g gVar2 = (n1.g) q1Var;
        gVar2.getClass();
        n1.f fVar = new n1.f(gVar2);
        fVar.f8711g = gVar2;
        fVar.putAll(gVar);
        n1.g gVarBuild = fVar.build();
        T(204, t.f5145d);
        C();
        i0(gVarBuild);
        C();
        i0(gVar);
        p(false);
        return gVarBuild;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void h0(Object obj) {
        int i7;
        h2 h2Var;
        int i10;
        l2 l2Var;
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            a aVarA = null;
            if (this.S) {
                l2 l2Var2 = this.I;
                int i11 = l2Var2.f5036t;
                if (i11 > l2Var2.f5038v + 1) {
                    int i12 = i11 - 1;
                    int iD = l2Var2.D(l2Var2.f5019b, i12);
                    while (true) {
                        i10 = i12;
                        i12 = iD;
                        l2Var = this.I;
                        if (i12 == l2Var.f5038v || i12 < 0) {
                            break;
                        } else {
                            iD = l2Var.D(l2Var.f5019b, i12);
                        }
                    }
                    aVarA = l2Var.b(i10);
                }
            } else {
                h2 h2Var2 = this.G;
                int i13 = h2Var2.f4976g;
                if (i13 > h2Var2.f4978i + 1) {
                    int i14 = i13 - 1;
                    int iQ = h2Var2.q(i14);
                    while (true) {
                        i7 = i14;
                        i14 = iQ;
                        h2Var = this.G;
                        if (i14 == h2Var.f4978i || i14 < 0) {
                            break;
                        } else {
                            iQ = h2Var.q(i14);
                        }
                    }
                    aVarA = h2Var.a(i7);
                }
            }
            e2 e2Var = new e2(d2Var, aVarA);
            if (this.S) {
                g1.l0 l0Var = this.M.f5764b.f5761g;
                l0Var.a0(g1.w.f5815d);
                k9.a.Q(l0Var, 0, e2Var);
            }
            this.f5109d.add(obj);
            obj = e2Var;
        }
        i0(obj);
    }

    public final void i() {
        this.f5115j = null;
        this.k = 0;
        this.f5116l = 0;
        this.T = 0L;
        this.f5122r = false;
        g1.b bVar = this.M;
        bVar.f5765c = false;
        bVar.f5766d.f5067b = 0;
        bVar.f5768f = 0;
        bVar.f5767e = true;
        bVar.f5769g = 0;
        bVar.f5770h.clear();
        bVar.f5771i = -1;
        bVar.f5772j = -1;
        bVar.k = -1;
        bVar.f5773l = 0;
        this.E.clear();
        this.f5119o = null;
        this.f5120p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            l2 l2Var = this.I;
            if (l2Var.f5030n <= 0 || l2Var.f5026i == l2Var.k) {
                l2Var.E(obj);
                return;
            }
            s.w wVar = l2Var.f5035s;
            if (wVar == null) {
                wVar = new s.w();
            }
            l2Var.f5035s = wVar;
            int i7 = l2Var.f5038v;
            Object objB = wVar.b(i7);
            if (objB == null) {
                objB = new s.d0();
                wVar.h(i7, objB);
            }
            ((s.d0) objB).a(obj);
            return;
        }
        h2 h2Var = this.G;
        boolean z10 = h2Var.f4982n;
        g1.b bVar = this.M;
        if (!z10) {
            a aVarA = h2Var.a(h2Var.f4978i);
            g1.l0 l0Var = bVar.f5764b.f5761g;
            l0Var.a0(g1.e.f5780d);
            k9.a.R(l0Var, 0, aVarA, 1, obj);
            return;
        }
        int iC = (h2Var.f4980l - k2.c(h2Var.f4971b, h2Var.f4978i)) - 1;
        if (bVar.f5763a.G.f4978i - bVar.f5768f >= 0) {
            bVar.d(true);
            g1.l0 l0Var2 = bVar.f5764b.f5761g;
            l0Var2.a0(g1.r.f5809h);
            k9.a.Q(l0Var2, 0, obj);
            l0Var2.f5798i[l0Var2.f5799j - l0Var2.f5796g[l0Var2.f5797h - 1].f5792b] = iC;
            return;
        }
        h2 h2Var2 = this.G;
        a aVarA2 = h2Var2.a(h2Var2.f4978i);
        g1.l0 l0Var3 = bVar.f5764b.f5761g;
        l0Var3.a0(g1.r.f5808g);
        k9.a.R(l0Var3, 0, obj, 1, aVarA2);
        l0Var3.f5798i[l0Var3.f5799j - l0Var3.f5796g[l0Var3.f5797h - 1].f5792b] = iC;
    }

    public final Object j(t1 t1Var) {
        return b.t(l(), t1Var);
    }

    public final int j0(int i7) {
        int i10;
        if (i7 >= 0) {
            int[] iArr = this.f5119o;
            return (iArr == null || (i10 = iArr[i7]) < 0) ? this.G.o(i7) : i10;
        }
        s.u uVar = this.f5120p;
        if (uVar == null || uVar.c(i7) < 0) {
            return 0;
        }
        int iC = uVar.c(i7);
        if (iC >= 0) {
            return uVar.f12504c[iC];
        }
        t.a.e("Cannot find value for key " + i7);
        throw null;
    }

    public final void k(h9.a aVar) {
        if (!this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5122r = false;
        if (!this.S) {
            t.c("createNode() can only be called when inserting");
        }
        o0 o0Var = this.f5118n;
        int i7 = o0Var.f5066a[o0Var.f5067b - 1];
        l2 l2Var = this.I;
        a aVarB = l2Var.b(l2Var.f5038v);
        this.f5116l++;
        g1.c cVar = this.O;
        g1.l0 l0Var = cVar.f5775g;
        l0Var.a0(g1.r.f5806e);
        k9.a.Q(l0Var, 0, aVar);
        l0Var.f5798i[l0Var.f5799j - l0Var.f5796g[l0Var.f5797h - 1].f5792b] = i7;
        k9.a.Q(l0Var, 1, aVarB);
        g1.l0 l0Var2 = cVar.f5776h;
        l0Var2.a0(g1.r.f5807f);
        l0Var2.f5798i[l0Var2.f5799j - l0Var2.f5796g[l0Var2.f5797h - 1].f5792b] = i7;
        k9.a.Q(l0Var2, 0, aVarB);
    }

    public final void k0() {
        if (!this.f5122r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5122r = false;
        if (this.S) {
            t.c("useNode() called while inserting");
        }
        h2 h2Var = this.G;
        Object objN = h2Var.n(h2Var.f4978i);
        g1.b bVar = this.M;
        bVar.c();
        bVar.f5770h.add(objN);
        if (this.f5129y && (objN instanceof j)) {
            bVar.b();
            bVar.f5764b.f5761g.a0(g1.i0.f5789d);
        }
    }

    public final q1 l() {
        q1 q1Var;
        q1 q1Var2 = this.K;
        if (q1Var2 != null) {
            return q1Var2;
        }
        int iQ = this.G.f4978i;
        boolean z10 = this.S;
        e1 e1Var = t.f5144c;
        if (z10 && this.J) {
            int iD = this.I.f5038v;
            while (iD > 0) {
                l2 l2Var = this.I;
                if (l2Var.f5019b[l2Var.r(iD) * 5] == 202 && i9.l.a(this.I.s(iD), e1Var)) {
                    Object objQ = this.I.q(iD);
                    i9.l.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    q1 q1Var3 = (q1) objQ;
                    this.K = q1Var3;
                    return q1Var3;
                }
                l2 l2Var2 = this.I;
                iD = l2Var2.D(l2Var2.f5019b, iD);
            }
        }
        if (this.G.f4972c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    h2 h2Var = this.G;
                    if (i9.l.a(h2Var.p(h2Var.f4971b, iQ), e1Var)) {
                        s.w wVar = this.f5126v;
                        if (wVar == null || (q1Var = (q1) wVar.b(iQ)) == null) {
                            h2 h2Var2 = this.G;
                            Object objB = h2Var2.b(h2Var2.f4971b, iQ);
                            i9.l.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            q1Var = (q1) objB;
                        }
                        this.K = q1Var;
                        return q1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        q1 q1Var4 = this.f5125u;
        this.K = q1Var4;
        return q1Var4;
    }

    public final List m() {
        boolean z10 = this.C;
        List list = u8.w.f13122a;
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        l2 l2Var = this.I;
        arrayList.addAll(n3.n.S(l2Var, null, l2Var.f5036t, null));
        h2 h2Var = this.G;
        if (!h2Var.f4975f && h2Var.f4972c != 0) {
            q1.i iVar = new q1.i(h2Var);
            int iQ = h2Var.f4978i;
            Object objValueOf = Integer.valueOf(h2Var.f4980l - k2.c(h2Var.f4971b, iQ));
            while (iQ >= 0) {
                iVar.e(h2Var.f4970a.o(iQ), objValueOf);
                objValueOf = h2Var.a(iQ);
                iQ = h2Var.q(iQ);
            }
            list = iVar.f10577a;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n(s.h0 h0Var, h9.n nVar) {
        ArrayList arrayList = this.f5123s;
        if (this.F) {
            t.c("Reentrant composition is not supported");
        }
        this.f5112g.m();
        Trace.beginSection("Compose:recompose");
        try {
            long jG = p1.l.k().g();
            this.B = (int) (jG ^ (jG >>> 32));
            this.f5126v = null;
            d0(h0Var);
            this.k = 0;
            this.F = true;
            try {
                b0();
                Object objC = C();
                if (objC != nVar && nVar != null) {
                    i0(nVar);
                }
                r rVar = this.D;
                h1.e eVarM = b.m();
                try {
                    eVarM.b(rVar);
                    e1 e1Var = t.f5142a;
                    if (nVar != null) {
                        T(Constants.MSG_RESPONSE_SUCCESS, e1Var);
                        n1.h.c(this, nVar);
                        p(false);
                    } else if (!this.f5127w || objC == null || objC.equals(n.f5051a)) {
                        O();
                    } else {
                        T(Constants.MSG_RESPONSE_SUCCESS, e1Var);
                        i9.b0.d(2, objC);
                        n1.h.c(this, (h9.n) objC);
                        p(false);
                    }
                    eVarM.l(eVarM.f6423c - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f5039w) {
                        t.c("Check failed");
                    }
                    v();
                    Trace.endSection();
                } catch (Throwable th) {
                    eVarM.l(eVarM.f6423c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    n3.r.b0(th2, new o(1, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.f5039w) {
                        t.c("Check failed");
                    }
                    v();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void o(int i7, int i10) {
        if (i7 <= 0 || i7 == i10) {
            return;
        }
        o(this.G.q(i7), i10);
        if (this.G.l(i7)) {
            Object objN = this.G.n(i7);
            g1.b bVar = this.M;
            bVar.c();
            bVar.f5770h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x051f  */
    public final void p(boolean z10) {
        long jRotateRight;
        o0 o0Var;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        o0 o0Var2;
        int i14;
        LinkedHashSet linkedHashSet;
        int i15;
        int i16;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i17;
        int i18;
        Object[] objArr;
        long[] jArr;
        int i19;
        Object[] objArr2;
        long[] jArr2;
        int i20;
        Object[] objArr3;
        long[] jArr3;
        int i21;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        o0 o0Var3 = this.f5118n;
        int i22 = o0Var3.f5066a[o0Var3.f5067b - 2] - 1;
        boolean z11 = this.S;
        w0 w0Var = n.f5051a;
        if (z11) {
            l2 l2Var = this.I;
            int i23 = l2Var.f5038v;
            int i24 = l2Var.f5019b[l2Var.r(i23) * 5];
            Object objS = this.I.s(i23);
            Object objQ = this.I.q(i23);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode())), 3);
            } else if (objQ == null || i24 != 207 || objQ.equals(w0Var)) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i22), 3) ^ ((long) i24), 3);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i22), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = jRotateRight2;
        } else {
            h2 h2Var = this.G;
            int i25 = h2Var.f4978i;
            int i26 = h2Var.i(i25);
            h2 h2Var2 = this.G;
            Object objP = h2Var2.p(h2Var2.f4971b, i25);
            h2 h2Var3 = this.G;
            Object objB = h2Var3.b(h2Var3.f4971b, i25);
            if (objP != null) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
            } else if (objB == null || i26 != 207 || objB.equals(w0Var)) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i22), 3) ^ ((long) i26), 3);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i22), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = jRotateRight;
        }
        int i27 = this.f5116l;
        p1 p1Var = this.f5115j;
        ArrayList arrayList4 = this.f5123s;
        g1.b bVar = this.M;
        if (p1Var != null) {
            s.w wVar = p1Var.f5085e;
            int i28 = p1Var.f5082b;
            ArrayList arrayList5 = p1Var.f5081a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = p1Var.f5084d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i29 = 0; i29 < size; i29++) {
                    hashSet2.add(arrayList6.get(i29));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i30 < size3) {
                    s0 s0Var = (s0) arrayList5.get(i30);
                    if (hashSet2.contains(s0Var)) {
                        o0Var2 = o0Var3;
                        i14 = i30;
                        if (!linkedHashSet2.contains(s0Var)) {
                            int i33 = i31;
                            if (i33 < size2) {
                                s0 s0Var2 = (s0) arrayList6.get(i33);
                                if (s0Var2 != s0Var) {
                                    l0 l0Var = (l0) wVar.b(s0Var2.f5133c);
                                    int i34 = l0Var != null ? l0Var.f5012b : -1;
                                    linkedHashSet2.add(s0Var2);
                                    i17 = i32;
                                    if (i34 != i17) {
                                        l0 l0Var2 = (l0) wVar.b(s0Var2.f5133c);
                                        int i35 = l0Var2 != null ? l0Var2.f5013c : s0Var2.f5134d;
                                        linkedHashSet = linkedHashSet2;
                                        int i36 = i34 + i28;
                                        i15 = size2;
                                        int i37 = i17 + i28;
                                        if (i35 > 0) {
                                            i16 = i28;
                                            int i38 = bVar.f5773l;
                                            if (i38 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.f5772j == i36 - i38 && bVar.k == i37 - i38) {
                                                    bVar.f5773l = i38 + i35;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.f5772j = i36;
                                            bVar.k = i37;
                                            bVar.f5773l = i35;
                                        } else {
                                            i16 = i28;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i34 <= i17) {
                                            int i39 = i35;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i17 > i34) {
                                                Object[] objArr5 = wVar.f12463c;
                                                long[] jArr5 = wVar.f12461a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i40 = 0;
                                                    while (true) {
                                                        long j5 = jArr5[i40];
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i41 = 8 - ((~(i40 - length)) >>> 31);
                                                            int i42 = 0;
                                                            while (i42 < i41) {
                                                                if ((j5 & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    l0 l0Var3 = (l0) objArr5[(i40 << 3) + i42];
                                                                    jArr2 = jArr5;
                                                                    int i43 = l0Var3.f5012b;
                                                                    i20 = i34;
                                                                    if (i34 <= i43 && i43 < i20 + i39) {
                                                                        l0Var3.f5012b = (i43 - i20) + i17;
                                                                    } else if (i20 + 1 <= i43 && i43 < i17) {
                                                                        l0Var3.f5012b = i43 - i39;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i20 = i34;
                                                                }
                                                                j5 >>= 8;
                                                                i42++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i34 = i20;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i19 = i34;
                                                            if (i41 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i19 = i34;
                                                        }
                                                        if (i40 == length) {
                                                            break;
                                                        }
                                                        i40++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i34 = i19;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = wVar.f12463c;
                                            long[] jArr6 = wVar.f12461a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i44 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i44];
                                                    int i45 = i35;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i46 = 8 - ((~(i44 - length2)) >>> 31);
                                                        int i47 = 0;
                                                        while (i47 < i46) {
                                                            if ((j10 & 255) < 128) {
                                                                i21 = i47;
                                                                l0 l0Var4 = (l0) objArr6[(i44 << 3) + i47];
                                                                objArr4 = objArr6;
                                                                int i48 = l0Var4.f5012b;
                                                                jArr4 = jArr6;
                                                                if (i34 <= i48 && i48 < i34 + i45) {
                                                                    l0Var4.f5012b = (i48 - i34) + i17;
                                                                } else if (i17 <= i48 && i48 < i34) {
                                                                    l0Var4.f5012b = i48 + i45;
                                                                }
                                                            } else {
                                                                i21 = i47;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j10 >>= 8;
                                                            i47 = i21 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i46 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i44 == length2) {
                                                        break;
                                                    }
                                                    i44++;
                                                    arrayList4 = arrayList4;
                                                    i35 = i45;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i18 = i14;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i15 = size2;
                                        i16 = i28;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i18 = i14;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i15 = size2;
                                    i16 = i28;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i17 = i32;
                                    i18 = i14 + 1;
                                }
                                i31 = i33 + 1;
                                l0 l0Var5 = (l0) wVar.b(s0Var2.f5133c);
                                int i49 = i17 + (l0Var5 != null ? l0Var5.f5013c : s0Var2.f5134d);
                                i30 = i18;
                                p1Var = p1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i15;
                                i28 = i16;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i32 = i49;
                                o0Var3 = o0Var2;
                            } else {
                                i31 = i33;
                                o0Var3 = o0Var2;
                                i30 = i14;
                            }
                        }
                    } else {
                        o0Var2 = o0Var3;
                        l0 l0Var6 = (l0) wVar.b(s0Var.f5133c);
                        int i50 = l0Var6 != null ? l0Var6.f5012b : -1;
                        int i51 = s0Var.f5133c;
                        i14 = i30;
                        bVar.e(i50 + i28, s0Var.f5134d);
                        p1Var.a(i51, 0);
                        bVar.f5768f = (i51 - bVar.f5763a.G.f4976g) + bVar.f5768f;
                        this.G.r(i51);
                        H();
                        this.G.s();
                        t.a(arrayList4, i51, this.G.f4971b[(i51 * 5) + 3] + i51);
                    }
                    i30 = i14 + 1;
                    o0Var3 = o0Var2;
                }
                o0Var = o0Var3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    h2 h2Var4 = this.G;
                    bVar.f5768f = (h2Var4.f4977h - bVar.f5763a.G.f4976g) + bVar.f5768f;
                    h2Var4.t();
                }
            } else {
                o0Var = o0Var3;
                arrayList = arrayList4;
            }
        } else {
            o0Var = o0Var3;
            arrayList = arrayList4;
        }
        boolean z12 = this.S;
        if (!z12) {
            h2 h2Var5 = this.G;
            int i52 = h2Var5.f4981m - h2Var5.f4980l;
            if (i52 > 0) {
                if (i52 > 0) {
                    bVar.d(false);
                    o0 o0Var4 = bVar.f5766d;
                    h2 h2Var6 = bVar.f5763a.G;
                    if (h2Var6.f4972c > 0 && o0Var4.a(-2) != (i13 = h2Var6.f4978i)) {
                        if (!bVar.f5765c && bVar.f5767e) {
                            bVar.d(false);
                            bVar.f5764b.f5761g.a0(g1.q.f5805d);
                            bVar.f5765c = true;
                        }
                        if (i13 > 0) {
                            a aVarA = h2Var6.a(i13);
                            o0Var4.c(i13);
                            bVar.d(false);
                            g1.l0 l0Var7 = bVar.f5764b.f5761g;
                            l0Var7.a0(g1.p.f5804d);
                            k9.a.Q(l0Var7, 0, aVarA);
                            bVar.f5765c = true;
                        }
                    }
                    g1.l0 l0Var8 = bVar.f5764b.f5761g;
                    l0Var8.a0(g1.e0.f5781d);
                    l0Var8.f5798i[l0Var8.f5799j - l0Var8.f5796g[l0Var8.f5797h - 1].f5792b] = i52;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i53 = this.k;
        while (true) {
            h2 h2Var7 = this.G;
            if (h2Var7.k > 0 || (i12 = h2Var7.f4976g) == h2Var7.f4977h) {
                break;
            }
            H();
            bVar.e(i53, this.G.s());
            t.a(arrayList, i12, this.G.f4976g);
        }
        if (z12) {
            if (z10) {
                g1.c cVar = this.O;
                g1.l0 l0Var9 = cVar.f5776h;
                if (!l0Var9.Z()) {
                    t.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                g1.l0 l0Var10 = cVar.f5775g;
                g1.j0[] j0VarArr = l0Var9.f5796g;
                int i54 = l0Var9.f5797h - 1;
                l0Var9.f5797h = i54;
                g1.j0 j0Var = j0VarArr[i54];
                j0VarArr[i54] = null;
                l0Var10.a0(j0Var);
                Object[] objArr7 = l0Var9.k;
                Object[] objArr8 = l0Var10.k;
                int i55 = l0Var10.f5800l;
                int i56 = j0Var.f5793c;
                int i57 = l0Var9.f5800l;
                int i58 = i57 - i56;
                System.arraycopy(objArr7, i58, objArr8, i55 - i56, i57 - i58);
                Object[] objArr9 = l0Var9.k;
                int i59 = l0Var9.f5800l;
                Arrays.fill(objArr9, i59 - i56, i59, (Object) null);
                int[] iArr = l0Var9.f5798i;
                int[] iArr2 = l0Var10.f5798i;
                int i60 = l0Var10.f5799j;
                int i61 = j0Var.f5792b;
                int i62 = l0Var9.f5799j;
                u8.l.m0(i60 - i61, i62 - i61, i62, iArr, iArr2);
                l0Var9.f5800l -= i56;
                l0Var9.f5799j -= i61;
                i27 = 1;
            }
            h2 h2Var8 = this.G;
            if (h2Var8.k <= 0) {
                r1.a("Unbalanced begin/end empty");
            }
            h2Var8.k--;
            l2 l2Var2 = this.I;
            int i63 = l2Var2.f5038v;
            l2Var2.j();
            if (this.G.k <= 0) {
                int i64 = (-2) - i63;
                this.I.k();
                this.I.e(true);
                a aVar = this.N;
                if (this.O.f5775g.Y()) {
                    i2 i2Var = this.H;
                    bVar.b();
                    bVar.d(false);
                    o0 o0Var5 = bVar.f5766d;
                    h2 h2Var9 = bVar.f5763a.G;
                    if (h2Var9.f4972c <= 0 || o0Var5.a(-2) == (i11 = h2Var9.f4978i)) {
                        i10 = 1;
                    } else {
                        if (!bVar.f5765c && bVar.f5767e) {
                            bVar.d(false);
                            bVar.f5764b.f5761g.a0(g1.q.f5805d);
                            bVar.f5765c = true;
                        }
                        if (i11 > 0) {
                            a aVarA2 = h2Var9.a(i11);
                            o0Var5.c(i11);
                            bVar.d(false);
                            g1.l0 l0Var11 = bVar.f5764b.f5761g;
                            l0Var11.a0(g1.p.f5804d);
                            k9.a.Q(l0Var11, 0, aVarA2);
                            i10 = 1;
                            bVar.f5765c = true;
                        } else {
                            i10 = 1;
                        }
                    }
                    bVar.c();
                    g1.l0 l0Var12 = bVar.f5764b.f5761g;
                    l0Var12.a0(g1.s.f5811d);
                    k9.a.R(l0Var12, 0, aVar, i10, i2Var);
                } else {
                    i2 i2Var2 = this.H;
                    g1.c cVar2 = this.O;
                    bVar.b();
                    bVar.d(false);
                    o0 o0Var6 = bVar.f5766d;
                    h2 h2Var10 = bVar.f5763a.G;
                    if (h2Var10.f4972c > 0 && o0Var6.a(-2) != (i7 = h2Var10.f4978i)) {
                        if (!bVar.f5765c && bVar.f5767e) {
                            bVar.d(false);
                            bVar.f5764b.f5761g.a0(g1.q.f5805d);
                            bVar.f5765c = true;
                        }
                        if (i7 > 0) {
                            a aVarA3 = h2Var10.a(i7);
                            o0Var6.c(i7);
                            bVar.d(false);
                            g1.l0 l0Var13 = bVar.f5764b.f5761g;
                            l0Var13.a0(g1.p.f5804d);
                            k9.a.Q(l0Var13, 0, aVarA3);
                            bVar.f5765c = true;
                        }
                    }
                    bVar.c();
                    g1.l0 l0Var14 = bVar.f5764b.f5761g;
                    l0Var14.a0(g1.t.f5812d);
                    int i65 = l0Var14.f5800l - l0Var14.f5796g[l0Var14.f5797h - 1].f5793c;
                    Object[] objArr10 = l0Var14.k;
                    objArr10[i65] = aVar;
                    objArr10[i65 + 1] = i2Var2;
                    objArr10[i65 + 2] = cVar2;
                    this.O = new g1.c();
                }
                this.S = false;
                if (this.f5108c.f4986b != 0) {
                    e0(i64, 0);
                    f0(i64, i27);
                }
            }
        } else {
            if (z10) {
                bVar.a();
            }
            int i66 = bVar.f5763a.G.f4978i;
            o0 o0Var7 = bVar.f5766d;
            if (o0Var7.a(-1) > i66) {
                t.c("Missed recording an endGroup");
            }
            if (o0Var7.a(-1) == i66) {
                bVar.d(false);
                o0Var7.b();
                bVar.f5764b.f5761g.a0(g1.m.f5801d);
            }
            int i67 = this.G.f4978i;
            if (i27 != j0(i67)) {
                f0(i67, i27);
            }
            if (z10) {
                i27 = 1;
            }
            this.G.e();
            bVar.c();
        }
        ArrayList arrayList7 = this.f5114i;
        p1 p1Var2 = (p1) arrayList7.remove(arrayList7.size() - 1);
        if (p1Var2 != null && !z12) {
            p1Var2.f5083c++;
        }
        this.f5115j = p1Var2;
        this.k = o0Var.b() + i27;
        this.f5117m = o0Var.b();
        this.f5116l = o0Var.b() + i27;
    }

    public final void q() {
        p(false);
        w1 w1VarW = w();
        if (w1VarW != null) {
            int i7 = w1VarW.f5190b;
            if ((i7 & 1) != 0) {
                w1VarW.f5190b = i7 | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0083 A[SYNTHETIC] */
    public final w1 r() {
        w1 w1Var;
        a aVarA;
        v1 v1Var;
        ArrayList arrayList = this.E;
        w1 w1Var2 = !arrayList.isEmpty() ? (w1) arrayList.remove(arrayList.size() - 1) : null;
        if (w1Var2 != null) {
            w1Var2.f5190b &= -9;
            this.f5112g.m();
            int i7 = this.B;
            s.c0 c0Var = w1Var2.f5194f;
            if (c0Var == null || (w1Var2.f5190b & 16) != 0) {
                v1Var = null;
                break;
            }
            Object[] objArr = c0Var.f12398b;
            int[] iArr = c0Var.f12399c;
            long[] jArr = c0Var.f12397a;
            int length = jArr.length - 2;
            if (length < 0) {
                v1Var = null;
                break;
            }
            int i10 = 0;
            loop0: while (true) {
                long j5 = jArr[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j5 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            if (iArr[i13] != i7) {
                                v1Var = new v1(i7, 0, w1Var2, c0Var);
                                break loop0;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 == length) {
                            i10++;
                        }
                    }
                    v1Var = null;
                    break;
                }
                if (i10 == length) {
                    v1Var = null;
                    break;
                }
                i10++;
            }
            g1.b bVar = this.M;
            if (v1Var != null) {
                g1.l0 l0Var = bVar.f5764b.f5761g;
                l0Var.a0(g1.l.f5795d);
                k9.a.R(l0Var, 0, v1Var, 1, this.f5113h);
            }
            int i14 = w1Var2.f5190b;
            if ((i14 & 512) != 0) {
                w1Var2.f5190b = i14 & (-513);
                g1.l0 l0Var2 = bVar.f5764b.f5761g;
                l0Var2.a0(g1.o.f5803d);
                k9.a.Q(l0Var2, 0, w1Var2);
                int i15 = w1Var2.f5190b;
                w1Var2.f5190b = i15 & (-129);
                if ((i15 & 1024) != 0) {
                    w1Var2.f5190b = i15 & (-1153);
                    this.f5129y = false;
                }
            }
        }
        if (w1Var2 != null) {
            int i16 = w1Var2.f5190b;
            if ((i16 & 16) == 0 && ((i16 & 1) != 0 || this.f5121q)) {
                if (w1Var2.f5191c == null) {
                    if (this.S) {
                        l2 l2Var = this.I;
                        aVarA = l2Var.b(l2Var.f5038v);
                    } else {
                        h2 h2Var = this.G;
                        aVarA = h2Var.a(h2Var.f4978i);
                    }
                    w1Var2.f5191c = aVarA;
                }
                w1Var2.f5190b &= -5;
                w1Var = w1Var2;
            } else {
                w1Var = null;
            }
        } else {
            w1Var = null;
        }
        p(false);
        return w1Var;
    }

    public final void s() {
        if (this.F || this.f5130z != 100) {
            r1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f5130z = -1;
        this.f5129y = false;
    }

    public final void t() {
        p(false);
        this.f5107b.c();
        p(false);
        g1.b bVar = this.M;
        if (bVar.f5765c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f5764b.f5761g.a0(g1.m.f5801d);
            bVar.f5765c = false;
        }
        bVar.b();
        if (bVar.f5766d.f5067b != 0) {
            t.c("Missed recording an endGroup()");
        }
        if (!this.f5114i.isEmpty()) {
            t.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f5127w = this.f5128x.b() != 0;
    }

    public final void u(boolean z10, p1 p1Var) {
        this.f5114i.add(this.f5115j);
        this.f5115j = p1Var;
        int i7 = this.f5116l;
        o0 o0Var = this.f5118n;
        o0Var.c(i7);
        o0Var.c(this.f5117m);
        o0Var.c(this.k);
        if (z10) {
            this.k = 0;
        }
        this.f5116l = 0;
        this.f5117m = 0;
    }

    public final void v() {
        i2 i2Var = new i2();
        if (this.C) {
            i2Var.d();
        }
        if (this.f5107b.d()) {
            i2Var.k = new s.w();
        }
        this.H = i2Var;
        l2 l2VarM = i2Var.m();
        l2VarM.e(true);
        this.I = l2VarM;
    }

    public final w1 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (w1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.f5127w) {
            return true;
        }
        w1 w1VarW = w();
        return (w1VarW == null || (w1VarW.f5190b & 4) == 0) ? false : true;
    }

    public final q1.c y() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        w1 w1VarW;
        return (this.S || this.f5129y || this.f5127w || (w1VarW = w()) == null || (w1VarW.f5190b & 8) != 0) ? false : true;
    }
}
