package p1;

import java.util.HashMap;
import s.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7.q f10055a = new o7.q(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2.b f10056b = new a2.b(17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10057c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f10058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f10059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e4.d f10060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g7.l f10061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f10062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f10063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f10064j;
    public static final n1.a k;

    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.lang.Cloneable] */
    static {
        j jVar = j.f10047e;
        f10058d = jVar;
        long j5 = 1;
        f10059e = j5 + j5;
        e4.d dVar = new e4.d(2);
        dVar.f4327b = new long[16];
        dVar.f4330e = new int[16];
        ?? r8 = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i10 = i7 + 1;
            r8[i7] = i10;
            i7 = i10;
        }
        dVar.f4331f = r8;
        f10060f = dVar;
        g7.l lVar = new g7.l(3);
        lVar.f5999c = new int[16];
        lVar.f6000d = new n1.l[16];
        f10061g = lVar;
        u8.w wVar = u8.w.f13122a;
        f10062h = wVar;
        f10063i = wVar;
        long j10 = f10059e;
        f10059e = j5 + j10;
        a aVar = new a(j10, jVar, null, new o7.q(2));
        f10058d = f10058d.n(aVar.f10031b);
        f10064j = aVar;
        k = new n1.a(0);
    }

    public static final void a() {
        f(f10055a);
    }

    public static final h9.k b(h9.k kVar, h9.k kVar2) {
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            return kVar == null ? kVar2 : kVar;
        }
        return new k(kVar, kVar2, 1);
    }

    public static final HashMap c(long j5, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        char c10;
        b0 b0VarT;
        i0 i0VarX = bVar.x();
        if (i0VarX != null) {
            j jVarM = bVar.d().n(bVar.g()).m(bVar.f10006j);
            Object[] objArr = i0VarX.f12445b;
            long[] jArr3 = i0VarX.f12444a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                HashMap map = null;
                while (true) {
                    long j10 = jArr3[i7];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j10 & 255) < 128) {
                                z zVar = (z) objArr[(i7 << 3) + i11];
                                b0 b0VarC = zVar.c();
                                jArr2 = jArr3;
                                c10 = '\b';
                                b0 b0VarT2 = t(b0VarC, j5, jVar);
                                if (b0VarT2 != null && (b0VarT = t(b0VarC, j5, jVarM)) != null && !b0VarT2.equals(b0VarT)) {
                                    b0 b0VarT3 = t(b0VarC, bVar.g(), bVar.d());
                                    if (b0VarT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    b0 b0VarD = zVar.d(b0VarT, b0VarT2, b0VarT3);
                                    if (b0VarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(b0VarT2, b0VarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c10 = '\b';
                            }
                            j10 >>= c10;
                            i11++;
                            j5 = j5;
                            jArr3 = jArr2;
                            jVarM = jVarM;
                        }
                        jArr = jArr3;
                        jVar2 = jVarM;
                        if (i10 != 8) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarM;
                    }
                    if (i7 == length) {
                        return map;
                    }
                    i7++;
                    jArr3 = jArr;
                    jVarM = jVar2;
                }
            }
        }
        return null;
    }

    public static final void d(f fVar) {
        long j5;
        if (f10058d.k(fVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(fVar.g());
        sb2.append(", disposed=");
        sb2.append(fVar.f10032c);
        sb2.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.f10008m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f10057c) {
            e4.d dVar = f10060f;
            j5 = dVar.f4328c > 0 ? ((long[]) dVar.f4327b)[0] : -1L;
        }
        sb2.append(j5);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final j e(j jVar, long j5, long j10) {
        while (i9.l.g(j5, j10) < 0) {
            jVar = jVar.n(j5);
            j5 += (long) 1;
        }
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0092 A[LOOP:1: B:31:0x0058->B:44:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0095 A[EDGE_INSN: B:59:0x0095->B:45:0x0095 BREAK  A[LOOP:1: B:31:0x0058->B:44:0x0092], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object f(h9.k kVar) {
        i0 i0Var;
        Object objW;
        a aVar = f10064j;
        synchronized (f10057c) {
            try {
                i0Var = aVar.f10004h;
                if (i0Var != null) {
                    k.addAndGet(1);
                }
                objW = w(aVar, kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i0Var != null) {
            try {
                ?? r8 = f10062h;
                int size = r8.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((h9.n) r8.get(i7)).invoke(new h1.h(i0Var), aVar);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f10057c) {
            g();
            if (i0Var != null) {
                Object[] objArr = i0Var.f12445b;
                long[] jArr = i0Var.f12444a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j5) < 128) {
                                    r((z) objArr[(i10 << 3) + i12]);
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                            if (i10 != length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return objW;
    }

    public static final void g() {
        g7.l lVar = f10061g;
        int i7 = lVar.f5998b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            n1.l lVar2 = ((n1.l[]) lVar.f6000d)[i10];
            Object obj = lVar2 != null ? lVar2.get() : null;
            if (obj != null && q((z) obj)) {
                if (i11 != i10) {
                    ((n1.l[]) lVar.f6000d)[i11] = lVar2;
                    int[] iArr = (int[]) lVar.f5999c;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i7; i12++) {
            ((n1.l[]) lVar.f6000d)[i12] = null;
            ((int[]) lVar.f5999c)[i12] = 0;
        }
        if (i11 != i7) {
            lVar.f5998b = i11;
        }
    }

    public static final f h(f fVar, h9.k kVar, boolean z10) {
        boolean z11 = fVar instanceof b;
        if (z11 || fVar == null) {
            return new e0(z11 ? (b) fVar : null, kVar, null, false, z10);
        }
        return new f0(fVar, kVar, false, z10);
    }

    public static final b0 i(b0 b0Var) {
        b0 b0VarT;
        f fVarK = k();
        b0 b0VarT2 = t(b0Var, fVarK.g(), fVarK.d());
        if (b0VarT2 != null) {
            return b0VarT2;
        }
        synchronized (f10057c) {
            f fVarK2 = k();
            b0VarT = t(b0Var, fVarK2.g(), fVarK2.d());
        }
        if (b0VarT != null) {
            return b0VarT;
        }
        s();
        throw null;
    }

    public static final b0 j(b0 b0Var, f fVar) {
        b0 b0VarT;
        b0 b0VarT2 = t(b0Var, fVar.g(), fVar.d());
        if (b0VarT2 != null) {
            return b0VarT2;
        }
        synchronized (f10057c) {
            b0VarT = t(b0Var, fVar.g(), fVar.d());
        }
        if (b0VarT != null) {
            return b0VarT;
        }
        s();
        throw null;
    }

    public static final f k() {
        f fVar = (f) f10056b.y();
        return fVar == null ? f10064j : fVar;
    }

    public static final h9.k l(h9.k kVar, h9.k kVar2, boolean z10) {
        if (!z10) {
            kVar2 = null;
        }
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            return kVar == null ? kVar2 : kVar;
        }
        return new k(kVar, kVar2, 0);
    }

    public static final b0 m(b0 b0Var, z zVar) {
        long j5 = f10059e;
        e4.d dVar = f10060f;
        if (dVar.f4328c > 0) {
            j5 = ((long[]) dVar.f4327b)[0];
        }
        long j10 = j5 - ((long) 1);
        b0 b0Var2 = null;
        b0 b0Var3 = null;
        for (b0 b0VarC = zVar.c(); b0VarC != null; b0VarC = b0VarC.f10010b) {
            long j11 = b0VarC.f10009a;
            if (j11 != 0) {
                if (j11 != 0 && i9.l.g(j11, j10) <= 0 && !j.f10047e.k(j11)) {
                    if (b0Var3 != null) {
                        if (i9.l.g(b0VarC.f10009a, b0Var3.f10009a) >= 0) {
                            b0Var2 = b0Var3;
                            break;
                        }
                        break;
                    }
                    b0Var3 = b0VarC;
                }
            }
            b0Var2 = b0VarC;
            break;
        }
        if (b0Var2 != null) {
            b0Var2.f10009a = Long.MAX_VALUE;
            return b0Var2;
        }
        b0 b0VarB = b0Var.b(Long.MAX_VALUE);
        b0VarB.f10010b = zVar.c();
        zVar.k(b0VarB);
        return b0VarB;
    }

    public static final b0 n(b0 b0Var, f1.f0 f0Var, f fVar) {
        b0 b0VarM;
        synchronized (f10057c) {
            b0VarM = m(b0Var, f0Var);
            b0VarM.a(b0Var);
            b0VarM.f10009a = fVar.g();
        }
        return b0VarM;
    }

    public static final void o(f fVar, z zVar) {
        fVar.t(fVar.h() + 1);
        h9.k kVarI = fVar.i();
        if (kVarI != null) {
            kVarI.invoke(zVar);
        }
    }

    public static final b0 p(b0 b0Var, a0 a0Var, f fVar, b0 b0Var2) {
        b0 b0VarM;
        if (fVar.f()) {
            fVar.n(a0Var);
        }
        long jG = fVar.g();
        if (b0Var2.f10009a == jG) {
            return b0Var2;
        }
        synchronized (f10057c) {
            b0VarM = m(b0Var, a0Var);
        }
        b0VarM.f10009a = jG;
        if (b0Var2.f10009a != 1) {
            fVar.n(a0Var);
        }
        return b0VarM;
    }

    public static final boolean q(z zVar) {
        b0 b0Var;
        long j5 = f10059e;
        e4.d dVar = f10060f;
        if (dVar.f4328c > 0) {
            j5 = ((long[]) dVar.f4327b)[0];
        }
        b0 b0Var2 = null;
        b0 b0VarC = null;
        int i7 = 0;
        for (b0 b0VarC2 = zVar.c(); b0VarC2 != null; b0VarC2 = b0VarC2.f10010b) {
            long j10 = b0VarC2.f10009a;
            if (j10 != 0) {
                if (i9.l.g(j10, j5) >= 0) {
                    i7++;
                } else if (b0Var2 == null) {
                    i7++;
                    b0Var2 = b0VarC2;
                } else {
                    if (i9.l.g(b0VarC2.f10009a, b0Var2.f10009a) < 0) {
                        b0Var = b0Var2;
                        b0Var2 = b0VarC2;
                    } else {
                        b0Var = b0VarC2;
                    }
                    if (b0VarC == null) {
                        b0VarC = zVar.c();
                        b0 b0Var3 = b0VarC;
                        while (true) {
                            if (b0VarC == null) {
                                b0VarC = b0Var3;
                                break;
                            }
                            if (i9.l.g(b0VarC.f10009a, j5) >= 0) {
                                break;
                            }
                            if (i9.l.g(b0Var3.f10009a, b0VarC.f10009a) < 0) {
                                b0Var3 = b0VarC;
                            }
                            b0VarC = b0VarC.f10010b;
                        }
                    }
                    b0Var2.f10009a = 0L;
                    b0Var2.a(b0VarC);
                    b0Var2 = b0Var;
                }
            }
        }
        return i7 > 1;
    }

    public static final void r(z zVar) {
        if (q(zVar)) {
            g7.l lVar = f10061g;
            int i7 = lVar.f5998b;
            int iIdentityHashCode = System.identityHashCode(zVar);
            int i10 = -1;
            if (i7 > 0) {
                int i11 = lVar.f5998b - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) lVar.f5999c)[i13];
                    if (i14 < iIdentityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > iIdentityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        n1.l lVar2 = ((n1.l[]) lVar.f6000d)[i13];
                        if (zVar == (lVar2 != null ? lVar2.get() : null)) {
                            i10 = i13;
                            break;
                        }
                        int i15 = i13 - 1;
                        while (true) {
                            if (-1 >= i15 || ((int[]) lVar.f5999c)[i15] != iIdentityHashCode) {
                                i13++;
                                int i16 = lVar.f5998b;
                                while (true) {
                                    if (i13 >= i16) {
                                        i10 = -(lVar.f5998b + 1);
                                        break;
                                    }
                                    if (((int[]) lVar.f5999c)[i13] != iIdentityHashCode) {
                                        i10 = -(i13 + 1);
                                        break;
                                    }
                                    n1.l lVar3 = ((n1.l[]) lVar.f6000d)[i13];
                                    if ((lVar3 != null ? lVar3.get() : null) == zVar) {
                                        i10 = i13;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                n1.l lVar4 = ((n1.l[]) lVar.f6000d)[i15];
                                if ((lVar4 != null ? lVar4.get() : null) == zVar) {
                                    i10 = i15;
                                    break;
                                }
                                i15--;
                            }
                        }
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            n1.l[] lVarArr = (n1.l[]) lVar.f6000d;
            int length = lVarArr.length;
            if (i7 == length) {
                int i18 = length * 2;
                n1.l[] lVarArr2 = new n1.l[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr2, i19, i7 - i17);
                System.arraycopy((n1.l[]) lVar.f6000d, 0, lVarArr2, 0, i17);
                u8.l.m0(i19, i17, i7, (int[]) lVar.f5999c, iArr);
                u8.l.q0(0, i17, 6, (int[]) lVar.f5999c, iArr);
                lVar.f6000d = lVarArr2;
                lVar.f5999c = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr, i20, i7 - i17);
                int[] iArr2 = (int[]) lVar.f5999c;
                u8.l.m0(i20, i17, i7, iArr2, iArr2);
            }
            ((n1.l[]) lVar.f6000d)[i17] = new n1.l(zVar);
            ((int[]) lVar.f5999c)[i17] = iIdentityHashCode;
            lVar.f5998b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final b0 t(b0 b0Var, long j5, j jVar) {
        b0 b0Var2 = null;
        while (b0Var != null) {
            long j10 = b0Var.f10009a;
            if (j10 != 0 && i9.l.g(j10, j5) <= 0 && !jVar.k(j10) && (b0Var2 == null || i9.l.g(b0Var2.f10009a, b0Var.f10009a) < 0)) {
                b0Var2 = b0Var;
            }
            b0Var = b0Var.f10010b;
        }
        if (b0Var2 != null) {
            return b0Var2;
        }
        return null;
    }

    public static final b0 u(b0 b0Var, z zVar) {
        b0 b0VarT;
        f fVarK = k();
        h9.k kVarE = fVarK.e();
        if (kVarE != null) {
            kVarE.invoke(zVar);
        }
        b0 b0VarT2 = t(b0Var, fVarK.g(), fVarK.d());
        if (b0VarT2 != null) {
            return b0VarT2;
        }
        synchronized (f10057c) {
            f fVarK2 = k();
            b0 b0VarC = zVar.c();
            i9.l.c(b0VarC, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            b0VarT = t(b0VarC, fVarK2.g(), fVarK2.d());
            if (b0VarT == null) {
                s();
                throw null;
            }
        }
        return b0VarT;
    }

    public static final void v(int i7) {
        e4.d dVar = f10060f;
        int i10 = ((int[]) dVar.f4331f)[i7];
        dVar.f(i10, dVar.f4328c - 1);
        dVar.f4328c--;
        long[] jArr = (long[]) dVar.f4327b;
        long j5 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (i9.l.g(jArr[i12], j5) <= 0) {
                break;
            }
            dVar.f(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) dVar.f4327b;
        int i13 = dVar.f4328c >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < dVar.f4328c && i9.l.g(jArr2[i14], jArr2[i15]) < 0) {
                if (i9.l.g(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                dVar.f(i14, i10);
                i10 = i14;
            } else {
                if (i9.l.g(jArr2[i15], jArr2[i10]) >= 0) {
                    break;
                }
                dVar.f(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) dVar.f4331f)[i7] = dVar.f4329d;
        dVar.f4329d = i7;
    }

    public static final Object w(a aVar, h9.k kVar) {
        long j5 = aVar.f10031b;
        Object objInvoke = kVar.invoke(f10058d.d(j5));
        long j10 = f10059e;
        f10059e = ((long) 1) + j10;
        j jVarD = f10058d.d(j5);
        f10058d = jVarD;
        aVar.f10031b = j10;
        aVar.f10030a = jVarD;
        aVar.f10003g = 0;
        aVar.f10004h = null;
        aVar.o();
        f10058d = f10058d.n(j10);
        return objInvoke;
    }

    public static final b0 x(b0 b0Var, z zVar, f fVar) {
        b0 b0VarT;
        if (fVar.f()) {
            fVar.n(zVar);
        }
        long jG = fVar.g();
        b0 b0VarT2 = t(b0Var, jG, fVar.d());
        if (b0VarT2 == null) {
            s();
            throw null;
        }
        if (b0VarT2.f10009a == fVar.g()) {
            return b0VarT2;
        }
        synchronized (f10057c) {
            b0VarT = t(zVar.c(), jG, fVar.d());
            if (b0VarT == null) {
                s();
                throw null;
            }
            if (b0VarT.f10009a != jG) {
                b0 b0VarM = m(b0VarT, zVar);
                b0VarM.a(b0VarT);
                b0VarM.f10009a = fVar.g();
                b0VarT = b0VarM;
            }
        }
        if (b0VarT2.f10009a != 1) {
            fVar.n(zVar);
        }
        return b0VarT;
    }
}
