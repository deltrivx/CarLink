package q2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends o2.v0 implements o2.o0, a1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f10768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h9.k f10769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u1 f10770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10772j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o2.j0 f10773l = new o2.j0(0, this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p.p f10774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s.h0 f10775n;

    public static void s0(h1 h1Var) {
        i0 i0Var;
        h1 h1Var2 = h1Var.f10693p;
        h0 h0Var = h1Var.f10692o;
        if (!i9.l.a(h1Var2 != null ? h1Var2.f10692o : null, h0Var)) {
            h0Var.F.f10743p.f10865w.f();
            return;
        }
        a aVarJ = h0Var.F.f10743p.j();
        if (aVarJ == null || (i0Var = ((y0) aVarJ).f10865w) == null) {
            return;
        }
        i0Var.f();
    }

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

    @Override // o2.o0
    public final o2.n0 M(int i7, int i10, Map map, h9.k kVar, h9.k kVar2) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            n2.a.b("Size(" + i7 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new o0(i7, i10, map, kVar, kVar2, this);
    }

    @Override // o2.r
    public boolean Q() {
        return false;
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(h0 h0Var, o2.o oVar) {
        long j5;
        long j10;
        char c10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i7;
        long j13;
        long j14;
        int i10;
        int i11;
        s.h0 h0Var2 = this.f10775n;
        char c11 = 7;
        long j15 = -9187201950435737472L;
        if (h0Var2 != null) {
            Object[] objArr = h0Var2.f12439c;
            long[] jArr3 = h0Var2.f12437a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                long j16 = 128;
                while (true) {
                    long j17 = jArr3[i12];
                    j10 = 255;
                    if ((((~j17) << c11) & j17 & j15) != j15) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j17 & 255) < j16) {
                                s.i0 i0Var = (s.i0) objArr[(i12 << 3) + i14];
                                j13 = j15;
                                Object[] objArr2 = i0Var.f12445b;
                                long[] jArr4 = i0Var.f12444a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j14 = j16;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = length2;
                                        long j18 = jArr4[i15];
                                        jArr2 = jArr3;
                                        j12 = j17;
                                        if ((((~j18) << 7) & j18 & j13) != j13) {
                                            int i17 = 8 - ((~(i15 - i16)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j18 & 255) < j14) {
                                                    int i19 = (i15 << 3) + i18;
                                                    h0 h0Var3 = (h0) ((e2) objArr2[i19]).get();
                                                    i10 = i18;
                                                    if (h0Var3 != null) {
                                                        boolean zI = h0Var3.I();
                                                        i11 = i14;
                                                        if (zI) {
                                                        }
                                                    } else {
                                                        i11 = i14;
                                                    }
                                                    i0Var.m(i19);
                                                } else {
                                                    i10 = i18;
                                                    i11 = i14;
                                                }
                                                j18 >>= 8;
                                                i18 = i10 + 1;
                                                i14 = i11;
                                            }
                                            i7 = i14;
                                            if (i17 != 8) {
                                                break;
                                            }
                                        } else {
                                            i7 = i14;
                                        }
                                        length2 = i16;
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        jArr3 = jArr2;
                                        j17 = j12;
                                        i14 = i7;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j12 = j17;
                                    i7 = i14;
                                    j14 = j16;
                                }
                            } else {
                                jArr2 = jArr3;
                                j12 = j17;
                                i7 = i14;
                                j13 = j15;
                                j14 = j16;
                            }
                            j17 = j12 >> 8;
                            j15 = j13;
                            j16 = j14;
                            i14 = i7 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        j5 = j15;
                        j11 = j16;
                        c10 = 7;
                        if (i13 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        j5 = j15;
                        j11 = j16;
                        c10 = 7;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    j15 = j5;
                    j16 = j11;
                    jArr3 = jArr;
                    c11 = 7;
                }
            } else {
                j5 = -9187201950435737472L;
                j10 = 255;
                c10 = 7;
                j11 = 128;
            }
        } else {
            j5 = -9187201950435737472L;
            j10 = 255;
            c10 = 7;
            j11 = 128;
        }
        s.h0 h0Var4 = this.f10775n;
        if (h0Var4 != null) {
            long[] jArr5 = h0Var4.f12437a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i20 = 0;
                while (true) {
                    long j19 = jArr5[i20];
                    if ((((~j19) << c10) & j19 & j5) != j5) {
                        int i21 = 8 - ((~(i20 - length3)) >>> 31);
                        for (int i22 = 0; i22 < i21; i22++) {
                            if ((j19 & j10) < j11) {
                                int i23 = (i20 << 3) + i22;
                                if (((s.i0) h0Var4.f12439c[i23]).g()) {
                                    h0Var4.l(i23);
                                }
                            }
                            j19 >>= 8;
                        }
                        if (i21 != 8) {
                            break;
                        }
                    }
                    if (i20 == length3) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
        }
        s.h0 h0Var5 = this.f10775n;
        if (h0Var5 == null) {
            h0Var5 = new s.h0();
            this.f10775n = h0Var5;
        }
        Object objG = h0Var5.g(oVar);
        if (objG == null) {
            objG = new s.i0();
            h0Var5.m(oVar, objG);
        }
        ((s.i0) objG).j(new e2(h0Var));
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    public abstract int d0(o2.m mVar);

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(u1 u1Var, long j5, long j10) {
        boolean z10;
        long j11;
        long j12;
        char c10;
        long j13;
        h0 h0Var;
        boolean z11;
        long j14;
        char c11;
        s1 snapshotObserver;
        s.h0 h0Var2 = this.f10775n;
        p.p pVar = this.f10774m;
        if (pVar == null) {
            pVar = new p.p();
            this.f10774m = pVar;
        }
        p.p pVar2 = pVar;
        q1 q1Var = n0().f10678m;
        if (q1Var != null && (snapshotObserver = ((r2.u) q1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(u1Var, e.f10623c, new n0(this, j5, j10, u1Var));
        }
        boolean zQ = Q();
        s.i0 i0Var = (s.i0) pVar2.f9863e;
        s.i0 i0Var2 = (s.i0) pVar2.f9864f;
        int i7 = pVar2.f9859a;
        for (int i10 = 0; i10 < i7; i10++) {
            byte b10 = ((byte[]) pVar2.f9862d)[i10];
            if (b10 == 3) {
                o2.o oVar = ((o2.o[]) pVar2.f9860b)[i10];
                i9.l.b(oVar);
                i0Var2.j(oVar);
            } else if (b10 != 0 && h0Var2 != null) {
                o2.o oVar2 = ((o2.o[]) pVar2.f9860b)[i10];
                i9.l.b(oVar2);
                s.i0 i0Var3 = (s.i0) h0Var2.k(oVar2);
                if (i0Var3 != null) {
                    i0Var.k(i0Var3);
                }
            }
        }
        int i11 = pVar2.f9859a;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr = (byte[]) pVar2.f9862d;
            if (bArr[i13] == 2) {
                i12++;
            } else if (i12 > 0) {
                o2.o[] oVarArr = (o2.o[]) pVar2.f9860b;
                oVarArr[i13 - i12] = oVarArr[i13];
            }
            bArr[i13] = 2;
        }
        int i14 = pVar2.f9859a;
        for (int i15 = i14 - i12; i15 < i14; i15++) {
            ((o2.o[]) pVar2.f9860b)[i15] = null;
        }
        pVar2.f9859a -= i12;
        p0 p0VarP0 = p0();
        Object[] objArr = i0Var2.f12445b;
        long[] jArr = i0Var2.f12444a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        if (length >= 0) {
            j12 = 128;
            int i16 = 0;
            while (true) {
                long j16 = jArr[i16];
                j13 = 255;
                if ((((~j16) << c12) & j16 & j15) != j15) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j16 & 255) < 128) {
                            o2.o oVar3 = (o2.o) objArr[(i16 << 3) + i18];
                            j14 = j15;
                            p0 p0Var = p0VarP0 == null ? this : p0VarP0;
                            p0 p0Var2 = p0Var;
                            c11 = '\b';
                            while (true) {
                                p.p pVar3 = p0Var2.f10774m;
                                if (pVar3 != null) {
                                    z11 = zQ;
                                    if (u8.l.l0(oVar3, (o2.o[]) pVar3.f9860b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z11 = zQ;
                                p0 p0VarP1 = p0Var2.p0();
                                if (p0VarP1 == null) {
                                    break;
                                }
                                p0Var2 = p0VarP1;
                                zQ = z11;
                            }
                            s.h0 h0Var3 = p0Var2.f10775n;
                            s.i0 i0Var4 = h0Var3 != null ? (s.i0) h0Var3.k(oVar3) : null;
                            if (i0Var4 != null) {
                                p0Var.t0(i0Var4);
                            }
                        } else {
                            z11 = zQ;
                            j14 = j15;
                            c11 = '\b';
                        }
                        j16 >>= c11;
                        i18++;
                        j15 = j14;
                        zQ = z11;
                    }
                    z10 = zQ;
                    j11 = j15;
                    c10 = 7;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    z10 = zQ;
                    j11 = j15;
                    c10 = 7;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                j15 = j11;
                zQ = z10;
                c12 = 7;
            }
        } else {
            z10 = zQ;
            j11 = -9187201950435737472L;
            j12 = 128;
            c10 = 7;
            j13 = 255;
        }
        i0Var2.b();
        Object[] objArr2 = i0Var.f12445b;
        long[] jArr2 = i0Var.f12444a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j17 = jArr2[i19];
                if ((((~j17) << c10) & j17 & j11) != j11) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j17 & j13) < j12 && (h0Var = (h0) ((e2) objArr2[(i19 << 3) + i21]).get()) != null) {
                            if (z10) {
                                h0Var.S(false);
                            } else {
                                h0Var.U(false);
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length2) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        i0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:11:0x001f->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0059 A[EDGE_INSN: B:47:0x0059->B:22:0x0059 BREAK  A[LOOP:0: B:11:0x001f->B:21:0x0056], SYNTHETIC] */
    public final void g0(o2.n0 n0Var) {
        long j5;
        long j10;
        s.h0 h0Var = this.f10775n;
        if (this.k) {
            return;
        }
        h9.k kVarD = n0Var.d();
        if (kVarD != null) {
            boolean z10 = this.f10769g != kVarD;
            if (z10 || !r0().f10747a) {
                j5 = 9223372034707292159L;
                j10 = 0;
            } else {
                o2.w wVarL0 = l0();
                long jO = o9.e0.O(wVarL0.t(0L));
                long jL = wVarL0.l();
                j10 = jL;
                z10 = (n3.j.a(jO, r0().f10748b) && n3.m.a(jL, r0().f10749c)) ? false : true;
                j5 = jO;
            }
            if (z10) {
                u1 u1Var = this.f10770h;
                if (u1Var != null) {
                    u1Var.f10827a = n0Var;
                } else {
                    u1Var = new u1(n0Var, this);
                    this.f10770h = u1Var;
                }
                f0(u1Var, j5, j10);
                this.f10769g = n0Var.d();
                return;
            }
            return;
        }
        if (h0Var != null) {
            Object[] objArr = h0Var.f12439c;
            long[] jArr = h0Var.f12437a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j11 = jArr[i7];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j11) < 128) {
                                t0((s.i0) objArr[(i7 << 3) + i11]);
                            }
                            j11 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i7 != length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            h0Var.a();
        }
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    @Override // o2.o0
    public final o2.n0 i(int i7, int i10, Map map, h9.k kVar) {
        return M(i7, i10, map, null, kVar);
    }

    public final int j0(o2.m mVar) {
        int iD0;
        if (m0() && (iD0 = d0(mVar)) != Integer.MIN_VALUE) {
            return iD0 + ((int) (this.f9439e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract p0 k0();

    public abstract o2.w l0();

    public abstract boolean m0();

    public abstract h0 n0();

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    public abstract o2.n0 o0();

    public abstract p0 p0();

    public abstract long q0();

    public final m0 r0() {
        m0 m0Var = this.f10768f;
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(this);
        this.f10768f = m0Var2;
        return m0Var2;
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(s.i0 i0Var) {
        h0 h0Var;
        Object[] objArr = i0Var.f12445b;
        long[] jArr = i0Var.f12444a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128 && (h0Var = (h0) ((e2) objArr[(i7 << 3) + i11]).get()) != null) {
                        if (Q()) {
                            h0Var.S(false);
                        } else {
                            h0Var.U(false);
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public abstract void u0();

    @Override // q2.a1
    public final void z(boolean z10) {
        p0 p0VarP0 = p0();
        h0 h0VarN0 = p0VarP0 != null ? p0VarP0.n0() : null;
        if (i9.l.a(h0VarN0, n0())) {
            this.f10771i = z10;
            return;
        }
        if ((h0VarN0 != null ? h0VarN0.F.f10732d : null) != d0.f10608c) {
            if ((h0VarN0 != null ? h0VarN0.F.f10732d : null) != d0.f10609d) {
                return;
            }
        }
        this.f10771i = z10;
    }
}
