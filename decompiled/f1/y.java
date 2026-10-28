package f1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f5206c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5207d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.k0 f5208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i2 f5209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s.h0 f5210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.i0 f5211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s.i0 f5212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s.h0 f5213j;
    public final g1.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1.a f5214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s.h0 f5215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s.h0 f5216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b3.l0 f5218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n1 f5219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f5220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2.d f5222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n1.i f5223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f5224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5225w;

    public y(v vVar, a2.b bVar) {
        this.f5204a = vVar;
        this.f5205b = bVar;
        s.k0 k0Var = new s.k0(new s.i0());
        this.f5208e = k0Var;
        i2 i2Var = new i2();
        if (vVar.d()) {
            i2Var.k = new s.w();
        }
        if (vVar.f()) {
            i2Var.d();
        }
        this.f5209f = i2Var;
        this.f5210g = k9.a.o();
        this.f5211h = new s.i0();
        this.f5212i = new s.i0();
        this.f5213j = k9.a.o();
        g1.a aVar = new g1.a();
        this.k = aVar;
        g1.a aVar2 = new g1.a();
        this.f5214l = aVar2;
        this.f5215m = k9.a.o();
        this.f5216n = k9.a.o();
        a2.d dVar = new a2.d(11, vVar);
        this.f5222t = dVar;
        this.f5223u = new n1.i();
        s sVar = new s(bVar, vVar, i2Var, k0Var, aVar, aVar2, dVar, this);
        vVar.o(sVar);
        this.f5224v = sVar;
        int i7 = i.f4983a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0005, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060), top: B:29:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EDGE_INSN: B:31:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    public final void A(Object obj) {
        synchronized (this.f5207d) {
            try {
                v(obj);
                Object objG = this.f5213j.g(obj);
                if (objG != null) {
                    if (objG instanceof s.i0) {
                        s.i0 i0Var = (s.i0) objG;
                        Object[] objArr = i0Var.f12445b;
                        long[] jArr = i0Var.f12444a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j5 = jArr[i7];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i7 != length) {
                                        break;
                                        break;
                                    }
                                    i7++;
                                } else {
                                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j5) < 128) {
                                            v((f0) objArr[(i7 << 3) + i11]);
                                        }
                                        j5 >>= 8;
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
                    } else {
                        v((f0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(h9.n nVar) {
        boolean zI = i();
        q();
        v vVar = this.f5204a;
        if (!zI) {
            vVar.a(this, nVar);
            return;
        }
        s sVar = this.f5224v;
        sVar.f5130z = 100;
        sVar.f5129y = true;
        vVar.a(this, nVar);
        sVar.s();
    }

    public final void a() {
        this.f5206c.set(null);
        this.k.f5761g.W();
        this.f5214l.f5761g.W();
        s.k0 k0Var = this.f5208e;
        if (k0Var.f12466a.g()) {
            return;
        }
        n1.i iVar = this.f5223u;
        try {
            iVar.g(k0Var, this.f5224v.y());
            iVar.b();
        } finally {
            iVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    public final void b(Object obj, boolean z10) {
        char c10;
        Object objG = this.f5210g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z11 = objG instanceof s.i0;
        q0 q0Var = q0.f5095a;
        s.i0 i0Var = this.f5211h;
        s.i0 i0Var2 = this.f5212i;
        s.h0 h0Var = this.f5215m;
        if (!z11) {
            w1 w1Var = (w1) objG;
            if (k9.a.K(h0Var, obj, w1Var) || w1Var.c(obj) == q0Var) {
                return;
            }
            if (w1Var.f5195g == null || z10) {
                i0Var.a(w1Var);
                return;
            } else {
                i0Var2.a(w1Var);
                return;
            }
        }
        s.i0 i0Var3 = (s.i0) objG;
        Object[] objArr = i0Var3.f12445b;
        long[] jArr = i0Var3.f12444a;
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
                    if ((j5 & 255) < 128) {
                        w1 w1Var2 = (w1) objArr[(i7 << 3) + i11];
                        if (k9.a.K(h0Var, obj, w1Var2)) {
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if (w1Var2.c(obj) != q0Var) {
                                if (w1Var2.f5195g == null || z10) {
                                    i0Var.a(w1Var2);
                                } else {
                                    i0Var2.a(w1Var2);
                                }
                            }
                        }
                    } else {
                        c10 = '\b';
                    }
                    j5 >>= c10;
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

    /* JADX WARN: Code duplicated, block: B:110:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0236 A[LOOP:6: B:94:0x01e2->B:111:0x0236, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0243 A[EDGE_INSN: B:202:0x0243->B:113:0x0243 BREAK  A[LOOP:6: B:94:0x01e2->B:111:0x0236], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0121 A[EDGE_INSN: B:222:0x0121->B:217:0x0121 BREAK  A[LOOP:13: B:63:0x0150->B:74:0x0184], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[LOOP:13: B:63:0x0150->B:74:0x0184, LOOP_END] */
    public final void c(Set set, boolean z10) {
        long j5;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        boolean zC;
        long[] jArr3;
        long j13;
        long[] jArr4;
        long[] jArr5;
        int i7;
        long j14;
        boolean zG;
        int i10;
        long j15;
        long[] jArr6;
        long[] jArr7;
        long j16;
        int i11;
        boolean z11 = set instanceof h1.h;
        s.h0 h0Var = this.f5213j;
        Object obj = null;
        if (z11) {
            s.i0 i0Var = ((h1.h) set).f6434a;
            Object[] objArr = i0Var.f12445b;
            long[] jArr8 = i0Var.f12444a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i12 = 0;
                j5 = 128;
                j10 = 255;
                while (true) {
                    long j17 = jArr8[i12];
                    j11 = -9187201950435737472L;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j17 & 255) < 128) {
                                Object obj2 = objArr[(i12 << 3) + i14];
                                if (obj2 instanceof w1) {
                                    ((w1) obj2).c(obj);
                                } else {
                                    b(obj2, z10);
                                    Object objG = h0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof s.i0) {
                                            s.i0 i0Var2 = (s.i0) objG;
                                            Object[] objArr2 = i0Var2.f12445b;
                                            long[] jArr9 = i0Var2.f12444a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                i11 = length;
                                                int i15 = 0;
                                                while (true) {
                                                    long j18 = jArr9[i15];
                                                    j16 = j17;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j18 & 255) < 128) {
                                                                b((f0) objArr2[(i15 << 3) + i17], z10);
                                                            }
                                                            j18 >>= 8;
                                                            i17++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i16 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i15 == length2) {
                                                        break;
                                                    }
                                                    i15++;
                                                    jArr9 = jArr10;
                                                    j17 = j16;
                                                    jArr8 = jArr7;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j16 = j17;
                                            i11 = length;
                                            b((f0) objG, z10);
                                        }
                                    }
                                }
                                jArr7 = jArr8;
                                j16 = j17;
                                i11 = length;
                            } else {
                                jArr7 = jArr8;
                                j16 = j17;
                                i11 = length;
                            }
                            j17 = j16 >> 8;
                            i14++;
                            length = i11;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        int i18 = length;
                        c10 = 7;
                        if (i13 != 8) {
                            break;
                        } else {
                            length = i18;
                        }
                    } else {
                        jArr6 = jArr8;
                        c10 = 7;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    jArr8 = jArr6;
                    obj = null;
                }
            } else {
                j5 = 128;
                j10 = 255;
                j11 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j5 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof w1) {
                    ((w1) obj3).c(null);
                } else {
                    b(obj3, z10);
                    Object objG2 = h0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof s.i0) {
                            s.i0 i0Var3 = (s.i0) objG2;
                            Object[] objArr3 = i0Var3.f12445b;
                            long[] jArr11 = i0Var3.f12444a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j19 = jArr11[i19];
                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i19 != length3) {
                                            break;
                                            break;
                                        }
                                        i19++;
                                    } else {
                                        int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j19 & 255) < 128) {
                                                b((f0) objArr3[(i19 << 3) + i21], z10);
                                            }
                                            j19 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        } else if (i19 != length3) {
                                            break;
                                        } else {
                                            i19++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((f0) objG2, z10);
                        }
                    }
                }
            }
        }
        s.h0 h0Var2 = this.f5210g;
        s.i0 i0Var4 = this.f5211h;
        if (z10) {
            s.i0 i0Var5 = this.f5212i;
            if (i0Var5.h()) {
                long[] jArr12 = h0Var2.f12437a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j20 = jArr12[i22];
                        if ((((~j20) << c10) & j20 & j11) != j11) {
                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j20 & j10) < j5) {
                                    int i25 = (i22 << 3) + i24;
                                    Object obj4 = h0Var2.f12438b[i25];
                                    Object obj5 = h0Var2.f12439c[i25];
                                    if (obj5 instanceof s.i0) {
                                        s.i0 i0Var6 = (s.i0) obj5;
                                        Object[] objArr4 = i0Var6.f12445b;
                                        long[] jArr13 = i0Var6.f12444a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j14 = j20;
                                            int i26 = 0;
                                            while (true) {
                                                long j21 = jArr13[i26];
                                                jArr5 = jArr12;
                                                i7 = length4;
                                                if ((((~j21) << c10) & j21 & j11) != j11) {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    for (int i28 = 0; i28 < i27; i28 = i10 + 1) {
                                                        if ((j21 & j10) < j5) {
                                                            i10 = i28;
                                                            int i29 = (i26 << 3) + i10;
                                                            j15 = j21;
                                                            w1 w1Var = (w1) objArr4[i29];
                                                            if (i0Var5.c(w1Var) || i0Var4.c(w1Var)) {
                                                                i0Var6.m(i29);
                                                            }
                                                        } else {
                                                            i10 = i28;
                                                            j15 = j21;
                                                        }
                                                        j21 = j15 >> 8;
                                                    }
                                                    if (i27 != 8) {
                                                        break;
                                                    }
                                                    if (i26 != length5) {
                                                        break;
                                                    }
                                                    i26++;
                                                    length4 = i7;
                                                    jArr12 = jArr5;
                                                } else if (i26 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i26++;
                                                    length4 = i7;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i7 = length4;
                                            j14 = j20;
                                        }
                                        zG = i0Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i7 = length4;
                                        j14 = j20;
                                        i9.l.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        w1 w1Var2 = (w1) obj5;
                                        zG = i0Var5.c(w1Var2) || i0Var4.c(w1Var2);
                                    }
                                    if (zG) {
                                        h0Var2.l(i25);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i7 = length4;
                                    j14 = j20;
                                }
                                j20 = j14 >> 8;
                                i24++;
                                length4 = i7;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i30 = length4;
                            if (i23 != 8) {
                                break;
                            } else {
                                length4 = i30;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i22 == length4) {
                            break;
                        }
                        i22++;
                        jArr12 = jArr4;
                    }
                }
                i0Var5.b();
                h();
                return;
            }
        }
        if (i0Var4.h()) {
            long[] jArr14 = h0Var2.f12437a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i31 = 0;
                while (true) {
                    long j22 = jArr14[i31];
                    if ((((~j22) << c10) & j22 & j11) != j11) {
                        int i32 = 8 - ((~(i31 - length6)) >>> 31);
                        int i33 = 0;
                        while (i33 < i32) {
                            if ((j22 & j10) < j5) {
                                int i34 = (i31 << 3) + i33;
                                Object obj6 = h0Var2.f12438b[i34];
                                Object obj7 = h0Var2.f12439c[i34];
                                if (obj7 instanceof s.i0) {
                                    s.i0 i0Var7 = (s.i0) obj7;
                                    Object[] objArr5 = i0Var7.f12445b;
                                    long[] jArr15 = i0Var7.f12444a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j12 = j22;
                                        int i35 = 0;
                                        while (true) {
                                            long j23 = jArr15[i35];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j23) << c10) & j23 & j11) != j11) {
                                                int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                int i37 = 0;
                                                while (i37 < i36) {
                                                    if ((j23 & j10) < j5) {
                                                        jArr3 = jArr14;
                                                        int i38 = (i35 << 3) + i37;
                                                        j13 = j23;
                                                        if (i0Var4.c((w1) objArr6[i38])) {
                                                            i0Var7.m(i38);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j13 = j23;
                                                    }
                                                    i37++;
                                                    jArr14 = jArr3;
                                                    j23 = j13 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i36 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i35 == length7) {
                                                break;
                                            }
                                            i35++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j12 = j22;
                                    }
                                    zC = i0Var7.g();
                                } else {
                                    jArr2 = jArr14;
                                    j12 = j22;
                                    i9.l.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = i0Var4.c((w1) obj7);
                                }
                                if (zC) {
                                    h0Var2.l(i34);
                                }
                            } else {
                                jArr2 = jArr14;
                                j12 = j22;
                            }
                            i33++;
                            j22 = j12 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i32 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i31 == length6) {
                        break;
                    }
                    i31++;
                    jArr14 = jArr;
                }
            }
            h();
            i0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f5207d) {
            try {
                e(this.k);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.f5208e.f12466a.g()) {
                        n1.i iVar = this.f5223u;
                        try {
                            iVar.g(this.f5208e, this.f5224v.y());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x011f A[EDGE_INSN: B:153:0x011f->B:71:0x011f BREAK  A[LOOP:2: B:136:0x00d2->B:69:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0115 A[Catch: all -> 0x0105, LOOP:2: B:136:0x00d2->B:69:0x0115, LOOP_END, TryCatch #3 {all -> 0x0105, blocks: (B:53:0x00d2, B:55:0x00e1, B:57:0x00eb, B:59:0x00f1, B:61:0x0101, B:65:0x010a, B:71:0x011f, B:79:0x0143, B:82:0x0156, B:69:0x0115, B:74:0x0129, B:88:0x0175, B:90:0x0181), top: B:136:0x00d2 }] */
    public final void e(g1.a aVar) throws Throwable {
        a2.b bVar;
        n1.i iVar;
        n1.i iVar2;
        long[] jArr;
        int i7;
        long[] jArr2;
        n1.i iVar3;
        long j5;
        long j10;
        boolean zG;
        long j11;
        g1.a aVar2 = this.f5214l;
        s sVar = this.f5224v;
        q1.c cVarY = sVar.y();
        n1.i iVar4 = this.f5223u;
        iVar4.g(this.f5208e, cVarY);
        if (aVar.f5761g.Y()) {
            try {
                if (aVar2.f5761g.Y() && this.f5219q == null) {
                    iVar4.b();
                }
                return;
            } finally {
                iVar4.a();
            }
        }
        try {
            Trace.beginSection("Compose:applyChanges");
            try {
                n1 n1Var = this.f5219q;
                if (n1Var == null || (bVar = n1Var.k) == null) {
                    bVar = this.f5205b;
                }
                if (n1Var == null || (iVar = n1Var.f5062j) == null) {
                    iVar = iVar4;
                }
                l2 l2VarM = this.f5209f.m();
                try {
                    aVar.W(bVar, l2VarM, iVar, sVar.y());
                    l2VarM.e(true);
                    bVar.m();
                    Trace.endSection();
                    iVar4.c();
                    iVar4.d();
                    if (this.f5217o) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f5217o = false;
                            s.h0 h0Var = this.f5210g;
                            long[] jArr3 = h0Var.f12437a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j12 = jArr3[i10];
                                    long j13 = -9187201950435737472L;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j12 & 255) < 128) {
                                                int i13 = (i10 << 3) + i12;
                                                j10 = j13;
                                                Object obj = h0Var.f12438b[i13];
                                                Object obj2 = h0Var.f12439c[i13];
                                                if (obj2 instanceof s.i0) {
                                                    s.i0 i0Var = (s.i0) obj2;
                                                    Object[] objArr = i0Var.f12445b;
                                                    long[] jArr4 = i0Var.f12444a;
                                                    char c10 = '\b';
                                                    int length2 = jArr4.length - 2;
                                                    i7 = i12;
                                                    jArr2 = jArr3;
                                                    iVar3 = iVar4;
                                                    if (length2 >= 0) {
                                                        int i14 = 0;
                                                        while (true) {
                                                            try {
                                                                long j14 = jArr4[i14];
                                                                j5 = j12;
                                                                long[] jArr5 = jArr4;
                                                                if ((((~j14) << 7) & j14 & j10) == j10) {
                                                                    if (i14 != length2) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i14++;
                                                                    jArr4 = jArr5;
                                                                    j12 = j5;
                                                                    c10 = '\b';
                                                                } else {
                                                                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                    for (int i16 = 0; i16 < i15; i16++) {
                                                                        if ((j14 & 255) < 128) {
                                                                            j11 = j14;
                                                                            int i17 = (i14 << 3) + i16;
                                                                            if (!((w1) objArr[i17]).b()) {
                                                                                i0Var.m(i17);
                                                                            }
                                                                        } else {
                                                                            j11 = j14;
                                                                        }
                                                                        j14 = j11 >> c10;
                                                                    }
                                                                    if (i15 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i14 != length2) {
                                                                        break;
                                                                    }
                                                                    i14++;
                                                                    jArr4 = jArr5;
                                                                    j12 = j5;
                                                                    c10 = '\b';
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        j5 = j12;
                                                    }
                                                    zG = i0Var.g();
                                                } else {
                                                    i7 = i12;
                                                    jArr2 = jArr3;
                                                    iVar3 = iVar4;
                                                    j5 = j12;
                                                    i9.l.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    zG = !((w1) obj2).b();
                                                }
                                                if (zG) {
                                                    h0Var.l(i13);
                                                }
                                            } else {
                                                i7 = i12;
                                                jArr2 = jArr3;
                                                iVar3 = iVar4;
                                                j5 = j12;
                                                j10 = j13;
                                            }
                                            j12 = j5 >> 8;
                                            i12 = i7 + 1;
                                            j13 = j10;
                                            iVar4 = iVar3;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        iVar2 = iVar4;
                                        if (i11 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                        iVar2 = iVar4;
                                    }
                                    if (i10 == length) {
                                        break;
                                    }
                                    i10++;
                                    iVar4 = iVar2;
                                    jArr3 = jArr;
                                }
                            } else {
                                iVar2 = iVar4;
                            }
                            h();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        iVar2 = iVar4;
                    }
                    try {
                        if (aVar2.f5761g.Y() && this.f5219q == null) {
                            iVar2.b();
                        }
                        return;
                    } finally {
                        iVar2.a();
                    }
                } catch (Throwable th3) {
                    try {
                        l2VarM.e(false);
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        Trace.endSection();
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        try {
            if (aVar2.f5761g.Y() && this.f5219q == null) {
                iVar4.b();
            }
            throw th;
        } finally {
            iVar4.a();
        }
    }

    public final void f() {
        synchronized (this.f5207d) {
            try {
                if (this.f5214l.f5761g.Z()) {
                    e(this.f5214l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f5208e.f12466a.g()) {
                        n1.i iVar = this.f5223u;
                        try {
                            iVar.g(this.f5208e, this.f5224v.y());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f5207d) {
            try {
                this.f5224v.f5126v = null;
                if (!this.f5208e.f12466a.g()) {
                    n1.i iVar = this.f5223u;
                    try {
                        iVar.g(this.f5208e, this.f5224v.y());
                        iVar.b();
                        iVar.a();
                    } catch (Throwable th) {
                        iVar.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f5208e.f12466a.g()) {
                        n1.i iVar2 = this.f5223u;
                        try {
                            iVar2.g(this.f5208e, this.f5224v.y());
                            iVar2.b();
                        } finally {
                            iVar2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x0058->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ae A[EDGE_INSN: B:81:0x00ae->B:32:0x00ae BREAK  A[LOOP:2: B:16:0x0058->B:30:0x00a1], SYNTHETIC] */
    public final void h() {
        long j5;
        long j10;
        char c10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i7;
        long j12;
        long j13;
        long j14;
        boolean zG;
        int i10;
        long j15;
        s.h0 h0Var = this.f5213j;
        long[] jArr3 = h0Var.f12437a;
        int length = jArr3.length - 2;
        char c11 = 7;
        long j16 = -9187201950435737472L;
        if (length >= 0) {
            int i11 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr3[i11];
                j10 = 255;
                if ((((~j18) << c11) & j18 & j16) != j16) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j18 & 255) < j17) {
                            int i14 = (i11 << 3) + i13;
                            j13 = j16;
                            Object obj = h0Var.f12438b[i14];
                            Object obj2 = h0Var.f12439c[i14];
                            boolean z10 = obj2 instanceof s.i0;
                            s.h0 h0Var2 = this.f5210g;
                            if (z10) {
                                s.i0 i0Var = (s.i0) obj2;
                                Object[] objArr = i0Var.f12445b;
                                long[] jArr4 = i0Var.f12444a;
                                j14 = j17;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j18;
                                    int i15 = 0;
                                    while (true) {
                                        long j19 = jArr4[i15];
                                        jArr2 = jArr3;
                                        i7 = length;
                                        if ((((~j19) << 7) & j19 & j13) != j13) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j19 & 255) < j14) {
                                                    i10 = i17;
                                                    int i18 = (i15 << 3) + i10;
                                                    j15 = j19;
                                                    if (!h0Var2.c((f0) objArr[i18])) {
                                                        i0Var.m(i18);
                                                    }
                                                } else {
                                                    i10 = i17;
                                                    j15 = j19;
                                                }
                                                j19 = j15 >> 8;
                                                i17 = i10 + 1;
                                            }
                                            if (i16 != 8) {
                                                break;
                                            }
                                            if (i15 != length2) {
                                                break;
                                            }
                                            i15++;
                                            jArr3 = jArr2;
                                            length = i7;
                                        } else if (i15 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i15++;
                                            jArr3 = jArr2;
                                            length = i7;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i7 = length;
                                    j12 = j18;
                                }
                                zG = i0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i7 = length;
                                j12 = j18;
                                j14 = j17;
                                i9.l.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !h0Var2.c((f0) obj2);
                            }
                            if (zG) {
                                h0Var.l(i14);
                            }
                        } else {
                            jArr2 = jArr3;
                            i7 = length;
                            j12 = j18;
                            j13 = j16;
                            j14 = j17;
                        }
                        j18 = j12 >> 8;
                        i13++;
                        j16 = j13;
                        j17 = j14;
                        jArr3 = jArr2;
                        length = i7;
                    }
                    jArr = jArr3;
                    int i19 = length;
                    j5 = j16;
                    j11 = j17;
                    c10 = 7;
                    if (i12 != 8) {
                        break;
                    } else {
                        length = i19;
                    }
                } else {
                    jArr = jArr3;
                    j5 = j16;
                    j11 = j17;
                    c10 = 7;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                j16 = j5;
                j17 = j11;
                jArr3 = jArr;
                c11 = 7;
            }
        } else {
            j5 = -9187201950435737472L;
            j10 = 255;
            c10 = 7;
            j11 = 128;
        }
        s.i0 i0Var2 = this.f5212i;
        if (!i0Var2.h()) {
            return;
        }
        Object[] objArr2 = i0Var2.f12445b;
        long[] jArr5 = i0Var2.f12444a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j20 = jArr5[i20];
            if ((((~j20) << c10) & j20 & j5) != j5) {
                int i21 = 8 - ((~(i20 - length3)) >>> 31);
                for (int i22 = 0; i22 < i21; i22++) {
                    if ((j20 & j10) < j11) {
                        int i23 = (i20 << 3) + i22;
                        if (!(((w1) objArr2[i23]).f5195g != null)) {
                            i0Var2.m(i23);
                        }
                    }
                    j20 >>= 8;
                }
                if (i21 != 8) {
                    return;
                }
            }
            if (i20 == length3) {
                return;
            } else {
                i20++;
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f5207d) {
            z10 = true;
            if (this.f5225w != 1) {
                z10 = false;
            }
            if (z10) {
                this.f5225w = 0;
            }
        }
        return z10;
    }

    public final void j(h9.n nVar) {
        try {
            synchronized (this.f5207d) {
                n();
                s.h0 h0Var = this.f5216n;
                this.f5216n = k9.a.o();
                try {
                    s sVar = this.f5224v;
                    b3.l0 l0Var = this.f5218p;
                    if (!sVar.f5110e.f5761g.Y()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    sVar.P = l0Var;
                    try {
                        sVar.n(h0Var, nVar);
                        sVar.P = null;
                    } catch (Throwable th) {
                        sVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f5216n = h0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f5208e.f12466a.g()) {
                    n1.i iVar = this.f5223u;
                    try {
                        iVar.g(this.f5208e, this.f5224v.y());
                        iVar.b();
                    } finally {
                        iVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final n1 k(boolean z10, h9.n nVar) {
        if (this.f5219q != null) {
            r1.b("A pausable composition is in progress");
        }
        n1 n1Var = new n1(this, this.f5204a, this.f5224v, this.f5208e, nVar, z10, this.f5205b, this.f5207d);
        this.f5219q = n1Var;
        return n1Var;
    }

    public final void l() {
        synchronized (this.f5207d) {
            try {
                if (this.f5219q != null) {
                    r1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.f5209f.f4986b > 0;
                if (z10 || !this.f5208e.f12466a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        n1.i iVar = this.f5223u;
                        try {
                            iVar.g(this.f5208e, this.f5224v.y());
                            if (z10) {
                                l2 l2VarM = this.f5209f.m();
                                try {
                                    l2VarM.n(l2VarM.f5036t, new a8.m(5, this.f5223u, l2VarM));
                                    l2VarM.e(true);
                                    this.f5205b.m();
                                    iVar.c();
                                } catch (Throwable th) {
                                    l2VarM.e(false);
                                    throw th;
                                }
                            }
                            iVar.b();
                            iVar.a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            iVar.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f5210g.a();
                this.f5213j.a();
                this.f5216n.a();
                this.k.f5761g.W();
                this.f5214l.f5761g.W();
                s sVar = this.f5224v;
                sVar.E.clear();
                sVar.f5123s.clear();
                sVar.f5110e.f5761g.W();
                sVar.f5126v = null;
                this.f5225w = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.f5207d) {
            try {
                if (this.f5224v.F) {
                    r1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f5225w != 3) {
                    this.f5225w = 3;
                    int i7 = i.f4983a;
                    g1.a aVar = this.f5224v.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z10 = this.f5209f.f4986b > 0;
                    if (z10 || !this.f5208e.f12466a.g()) {
                        n1.i iVar = this.f5223u;
                        try {
                            iVar.g(this.f5208e, this.f5224v.y());
                            if (z10) {
                                l2 l2VarM = this.f5209f.m();
                                try {
                                    l2VarM.n(l2VarM.f5036t, new b3.a(6, this.f5223u));
                                    l2VarM.G();
                                    l2VarM.e(true);
                                    this.f5205b.r();
                                    this.f5205b.m();
                                    iVar.c();
                                } catch (Throwable th) {
                                    l2VarM.e(false);
                                    throw th;
                                }
                            }
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th2) {
                            iVar.a();
                            throw th2;
                        }
                    }
                    s sVar = this.f5224v;
                    sVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        sVar.f5107b.s(sVar);
                        sVar.E.clear();
                        sVar.f5123s.clear();
                        sVar.f5110e.f5761g.W();
                        sVar.f5126v = null;
                        sVar.f5106a.r();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f5204a.t(this);
    }

    public final void n() {
        Object obj = b.f4886a;
        AtomicReference atomicReference = this.f5206c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                t.d("pending composition has not been applied");
                throw new cc.s();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                t.d("corrupt pendingModifications drain: " + atomicReference);
                throw new cc.s();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f5206c;
        Object andSet = atomicReference.getAndSet(null);
        if (i9.l.a(andSet, b.f4886a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            t.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new cc.s();
        }
        t.d("corrupt pendingModifications drain: " + atomicReference);
        throw new cc.s();
    }

    public final void p() {
        u8.y yVar = u8.y.f13124a;
        AtomicReference atomicReference = this.f5206c;
        Object andSet = atomicReference.getAndSet(yVar);
        if (i9.l.a(andSet, b.f4886a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            t.d("corrupt pendingModifications drain: " + atomicReference);
            throw new cc.s();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i7 = this.f5225w;
        if (i7 != 0) {
            if (i7 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i7 != 2) {
                str = i7 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            r1.b(str);
        }
        if (this.f5219q == null) {
            return;
        }
        r1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        s.k0 k0Var = this.f5208e;
        s sVar = this.f5224v;
        if (arrayList.size() > 0) {
            ((a1) ((t8.j) arrayList.get(0)).f12830a).getClass();
            throw null;
        }
        try {
            sVar.getClass();
            try {
                sVar.A(arrayList);
                sVar.i();
            } catch (Throwable th) {
                sVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!k0Var.f12466a.g()) {
                    n1.i iVar = this.f5223u;
                    try {
                        iVar.g(k0Var, sVar.y());
                        iVar.b();
                    } finally {
                        iVar.a();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final q0 s(w1 w1Var, Object obj) {
        y yVar;
        int i7 = w1Var.f5190b;
        if ((i7 & 2) != 0) {
            w1Var.f5190b = i7 | 4;
        }
        a aVar = w1Var.f5191c;
        if (aVar == null || !aVar.a()) {
            return q0.f5095a;
        }
        if (this.f5209f.n(aVar)) {
            if (w1Var.f5192d == null) {
                return q0.f5095a;
            }
            q0 q0VarU = u(w1Var, aVar, obj);
            if (q0VarU != q0.f5095a) {
                this.f5222t.m();
            }
            return q0VarU;
        }
        synchronized (this.f5207d) {
            yVar = this.f5220r;
        }
        if (yVar != null) {
            s sVar = yVar.f5224v;
            if (sVar.F && sVar.c0(w1Var, obj)) {
                return q0.f5098d;
            }
        }
        return q0.f5095a;
    }

    public final void t() {
        y yVar;
        synchronized (this.f5207d) {
            try {
                for (Object obj : this.f5209f.f4987c) {
                    w1 w1Var = obj instanceof w1 ? (w1) obj : null;
                    if (w1Var != null && (yVar = w1Var.f5189a) != null) {
                        yVar.s(w1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd A[Catch: all -> 0x0042, LOOP:0: B:47:0x008b->B:61:0x00cd, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0073, B:42:0x007b, B:44:0x007f, B:47:0x008b, B:49:0x009b, B:51:0x00a7, B:53:0x00b1, B:57:0x00c0, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:65:0x00d5->B:66:0x00da BREAK  A[LOOP:0: B:47:0x008b->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0073, B:42:0x007b, B:44:0x007f, B:47:0x008b, B:49:0x009b, B:51:0x00a7, B:53:0x00b1, B:57:0x00c0, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5 A[SYNTHETIC] */
    public final q0 u(w1 w1Var, a aVar, Object obj) {
        char c10;
        synchronized (this.f5207d) {
            try {
                y yVar = this.f5220r;
                y yVar2 = null;
                if (yVar != null) {
                    i2 i2Var = this.f5209f;
                    int i7 = this.f5221s;
                    if (i2Var.f4991g) {
                        t.c("Writer is active");
                    }
                    if (i7 < 0 || i7 >= i2Var.f4986b) {
                        t.c("Invalid group index");
                    }
                    if (i2Var.n(aVar)) {
                        int i10 = i2Var.f4985a[(i7 * 5) + 3] + i7;
                        int i11 = aVar.f4875a;
                        if (i7 > i11 || i11 >= i10) {
                            yVar = null;
                        }
                    } else {
                        yVar = null;
                    }
                    yVar2 = yVar;
                }
                if (yVar2 == null) {
                    s sVar = this.f5224v;
                    if (sVar.F && sVar.c0(w1Var, obj)) {
                        return q0.f5098d;
                    }
                    if (obj != null && (obj instanceof f0)) {
                        Object objG = this.f5216n.g(w1Var);
                        if (objG == null) {
                            k9.a.h(this.f5216n, w1Var, obj);
                            break;
                        }
                        if (objG instanceof s.i0) {
                            s.i0 i0Var = (s.i0) objG;
                            Object[] objArr = i0Var.f12445b;
                            long[] jArr = i0Var.f12444a;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                k9.a.h(this.f5216n, w1Var, obj);
                                break;
                            }
                            int i12 = 0;
                            loop0: while (true) {
                                long j5 = jArr[i12];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j5 & 255) < 128) {
                                            c10 = '\b';
                                            if (objArr[(i12 << 3) + i14] == w0.f5186e) {
                                                break loop0;
                                            }
                                        } else {
                                            c10 = '\b';
                                        }
                                        j5 >>= c10;
                                    }
                                    if (i13 == 8) {
                                        if (i12 == length) {
                                            i12++;
                                        }
                                    }
                                    k9.a.h(this.f5216n, w1Var, obj);
                                    break;
                                }
                                if (i12 == length) {
                                    k9.a.h(this.f5216n, w1Var, obj);
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            if (objG != w0.f5186e) {
                                k9.a.h(this.f5216n, w1Var, obj);
                                break;
                            }
                        }
                    } else {
                        this.f5216n.m(w1Var, w0.f5186e);
                    }
                }
                if (yVar2 != null) {
                    return yVar2.u(w1Var, aVar, obj);
                }
                this.f5204a.k(this);
                return this.f5224v.F ? q0.f5097c : q0.f5096b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.f5210g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z10 = objG instanceof s.i0;
        s.h0 h0Var = this.f5215m;
        if (!z10) {
            w1 w1Var = (w1) objG;
            if (w1Var.c(obj) == q0.f5098d) {
                k9.a.h(h0Var, obj, w1Var);
                return;
            }
            return;
        }
        s.i0 i0Var = (s.i0) objG;
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
                    if ((255 & j5) < 128) {
                        w1 w1Var2 = (w1) objArr[(i7 << 3) + i11];
                        if (w1Var2.c(obj) == q0.f5098d) {
                            k9.a.h(h0Var, obj, w1Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean w(Set set) {
        boolean z10 = set instanceof h1.h;
        s.h0 h0Var = this.f5213j;
        s.h0 h0Var2 = this.f5210g;
        if (z10) {
            s.i0 i0Var = ((h1.h) set).f6434a;
            Object[] objArr = i0Var.f12445b;
            long[] jArr = i0Var.f12444a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                loop0: while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j5) < 128) {
                                Object obj = objArr[(i7 << 3) + i11];
                                if (h0Var2.c(obj) || h0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i10 == 8) {
                            if (i7 != length) {
                                i7++;
                            }
                        }
                    } else if (i7 != length) {
                        i7++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (h0Var2.c(obj2) || h0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.f5207d) {
            n1 n1Var = this.f5219q;
            boolean Z = false;
            if (n1Var != null && n1Var.f5060h.get() != o1.f5072e) {
                n1Var.e();
                return false;
            }
            n();
            try {
                s.h0 h0Var = this.f5216n;
                this.f5216n = k9.a.o();
                try {
                    s sVar = this.f5224v;
                    b3.l0 l0Var = this.f5218p;
                    g1.l0 l0Var2 = sVar.f5110e.f5761g;
                    if (!l0Var2.Y()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    if (h0Var.f12441e > 0 || !sVar.f5123s.isEmpty()) {
                        sVar.P = l0Var;
                        try {
                            sVar.n(h0Var, null);
                            sVar.P = null;
                            Z = l0Var2.Z();
                        } catch (Throwable th) {
                            sVar.P = null;
                            throw th;
                        }
                    }
                    if (!Z) {
                        o();
                    }
                    return Z;
                } catch (Throwable th2) {
                    this.f5216n = h0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f5208e.f12466a.g()) {
                        n1.i iVar = this.f5223u;
                        try {
                            iVar.g(this.f5208e, this.f5224v.y());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(h1.h hVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f5206c.get();
            if (obj2 == null || obj2.equals(b.f4886a)) {
                obj = hVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, hVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f5206c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f5206c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f5207d) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void z(Object obj) {
        w1 w1VarW;
        int i7;
        boolean z10;
        char c10;
        s sVar = this.f5224v;
        if (sVar.A <= 0 && (w1VarW = sVar.w()) != null) {
            int i10 = w1VarW.f5190b | 1;
            w1VarW.f5190b = i10;
            if ((i10 & 32) == 0) {
                s.c0 c0Var = w1VarW.f5194f;
                if (c0Var == null) {
                    c0Var = new s.c0();
                    w1VarW.f5194f = c0Var;
                }
                int i11 = w1VarW.f5193e;
                int iC = c0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i7 = -1;
                } else {
                    i7 = c0Var.f12399c[iC];
                }
                c0Var.f12398b[iC] = obj;
                c0Var.f12399c[iC] = i11;
                if (i7 == w1VarW.f5193e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.f5222t.m();
            if (z10) {
                return;
            }
            if (obj instanceof p1.a0) {
                ((p1.a0) obj).e(1);
            }
            k9.a.h(this.f5210g, obj, w1VarW);
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                e0 e0VarG = f0Var.g();
                s.h0 h0Var = this.f5213j;
                k9.a.L(h0Var, obj);
                s.c0 c0Var2 = e0VarG.f4940e;
                Object[] objArr = c0Var2.f12398b;
                long[] jArr = c0Var2.f12397a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j5 & 255) < 128) {
                                    c10 = '\b';
                                    p1.z zVar = (p1.z) objArr[(i12 << 3) + i14];
                                    if (zVar instanceof p1.a0) {
                                        ((p1.a0) zVar).e(1);
                                    }
                                    k9.a.h(h0Var, zVar, obj);
                                } else {
                                    c10 = '\b';
                                }
                                j5 >>= c10;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                Object obj2 = e0VarG.f4941f;
                s.h0 h0Var2 = w1VarW.f5195g;
                if (h0Var2 == null) {
                    h0Var2 = new s.h0();
                    w1VarW.f5195g = h0Var2;
                }
                h0Var2.m(f0Var, obj2);
            }
        }
    }
}
