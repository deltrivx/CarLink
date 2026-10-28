package x;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends f {
    public h9.a K;
    public boolean L;
    public final s.a0 M;
    public final s.a0 N;

    public x(b0.k kVar, h9.a aVar, h9.a aVar2) {
        super(kVar, null, false, true, null, null, aVar);
        this.K = aVar2;
        this.L = true;
        s.a0 a0Var = s.o.f12475a;
        this.M = new s.a0();
        this.N = new s.a0();
    }

    @Override // x.f
    public final void D0(y2.j jVar) {
        if (this.K != null) {
            v0.p pVar = new v0.p(1, this);
            o9.u[] uVarArr = y2.t.f15077a;
            jVar.n(y2.i.f14988c, new y2.a(null, pVar));
        }
    }

    @Override // x.f
    public final k2.m0 E0() {
        return k2.h0.a(new q7.g(5, this));
    }

    @Override // x.f
    public final void J0() {
        N0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // x.f
    public final boolean K0(KeyEvent keyEvent) {
        boolean z10;
        long jF = i2.c.F(keyEvent);
        if (this.K != null) {
            s.a0 a0Var = this.M;
            if (a0Var.e(jF) == null) {
                a0Var.h(jF, cc.b0.s(m0(), null, new a8.c1(this, null, 24), 3));
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // x.f
    public final void L0(KeyEvent keyEvent) {
        long jF = i2.c.F(keyEvent);
        s.a0 a0Var = this.M;
        boolean z10 = false;
        if (a0Var.e(jF) != null) {
            cc.a1 a1Var = (cc.a1) a0Var.e(jF);
            if (a1Var != null) {
                if (a1Var.b()) {
                    a1Var.a(null);
                } else {
                    z10 = true;
                }
            }
            a0Var.g(jF);
        }
        if (z10) {
            return;
        }
        this.f14355w.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[LOOP:2: B:24:0x007d->B:35:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[EDGE_INSN: B:44:0x00b0->B:36:0x00b0 BREAK  A[LOOP:2: B:24:0x007d->B:35:0x00ad], SYNTHETIC] */
    public final void N0() {
        long j5;
        long j10;
        long j11;
        char c10;
        s.a0 a0Var = this.M;
        Object[] objArr = a0Var.f12382c;
        long[] jArr = a0Var.f12380a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j12 = -9187201950435737472L;
        if (length >= 0) {
            int i7 = 0;
            j10 = 128;
            while (true) {
                long j13 = jArr[i7];
                j11 = 255;
                if ((((~j13) << c11) & j13 & j12) != j12) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j13 & 255) < 128) {
                            ((cc.a1) objArr[(i7 << 3) + i11]).a(null);
                        }
                        j13 >>= 8;
                        i11++;
                        j12 = j12;
                    }
                    j5 = j12;
                    c10 = 7;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    j5 = j12;
                    c10 = 7;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                j12 = j5;
                c11 = 7;
            }
        } else {
            j5 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
            c10 = 7;
        }
        a0Var.a();
        s.a0 a0Var2 = this.N;
        Object[] objArr2 = a0Var2.f12382c;
        long[] jArr2 = a0Var2.f12380a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j14 = jArr2[i12];
                if ((((~j14) << c10) & j14 & j5) == j5) {
                    if (i12 != length2) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j14 & j11) < j10) {
                            ((u) objArr2[(i12 << 3) + i14]).getClass();
                            throw null;
                        }
                        j14 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length2) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        a0Var2.a();
    }

    @Override // r1.o
    public final void u0() {
        N0();
    }
}
