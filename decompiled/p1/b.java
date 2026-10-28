package p1;

import f1.r1;
import java.util.ArrayList;
import java.util.HashMap;
import s.i0;
import s.p0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f10000n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9.k f10001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9.k f10002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f10004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f10005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f10006j;
    public int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10008m;

    public b(long j5, j jVar, h9.k kVar, h9.k kVar2) {
        super(j5, jVar);
        this.f10001e = kVar;
        this.f10002f = kVar2;
        this.f10006j = j.f10047e;
        this.k = f10000n;
        this.f10007l = 1;
    }

    public final void A(long j5) {
        synchronized (l.f10057c) {
            this.f10006j = this.f10006j.n(j5);
        }
    }

    public final void B(j jVar) {
        synchronized (l.f10057c) {
            this.f10006j = this.f10006j.m(jVar);
        }
    }

    public void C(i0 i0Var) {
        this.f10004h = i0Var;
    }

    public b D(h9.k kVar, h9.k kVar2) throws Throwable {
        if (this.f10032c) {
            r1.a("Cannot use a disposed snapshot");
        }
        if (this.f10008m && this.f10033d < 0) {
            r1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f10057c;
        synchronized (obj) {
            try {
                long j5 = l.f10059e;
                long j10 = 1;
                l.f10059e = j5 + j10;
                l.f10058d = l.f10058d.n(j5);
                j jVarD = d();
                r(jVarD.n(j5));
                try {
                    c cVar = new c(j5, l.e(jVarD, g() + j10, j5), l.l(kVar, e(), true), l.b(kVar2, i()), this);
                    if (this.f10008m || this.f10032c) {
                        return cVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j11 = l.f10059e;
                        l.f10059e = j11 + j10;
                        s(j11);
                        l.f10058d = l.f10058d.n(g());
                    }
                    r(l.e(d(), jG + j10, g()));
                    return cVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p1.f
    public final void b() {
        l.f10058d = l.f10058d.d(g()).c(this.f10006j);
    }

    @Override // p1.f
    public void c() {
        if (this.f10032c) {
            return;
        }
        this.f10032c = true;
        synchronized (l.f10057c) {
            o();
        }
        l();
    }

    @Override // p1.f
    public boolean f() {
        return false;
    }

    @Override // p1.f
    public int h() {
        return this.f10003g;
    }

    @Override // p1.f
    public h9.k i() {
        return this.f10002f;
    }

    @Override // p1.f
    public void k() {
        this.f10007l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p1.f
    public void l() {
        if (this.f10007l <= 0) {
            r1.a("no pending nested snapshots");
        }
        int i7 = this.f10007l - 1;
        this.f10007l = i7;
        if (i7 != 0 || this.f10008m) {
            return;
        }
        i0 i0VarX = x();
        if (i0VarX != null) {
            if (this.f10008m) {
                r1.b("Unsupported operation on a snapshot that has been applied");
            }
            C(null);
            long jG = g();
            Object[] objArr = i0VarX.f12445b;
            long[] jArr = i0VarX.f12444a;
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
                                for (b0 b0VarC = ((z) objArr[(i10 << 3) + i12]).c(); b0VarC != null; b0VarC = b0VarC.f10010b) {
                                    long j10 = b0VarC.f10009a;
                                    if (j10 == jG || u8.p.g0(this.f10006j, Long.valueOf(j10))) {
                                        o7.q qVar = l.f10055a;
                                        b0VarC.f10009a = 0L;
                                    }
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // p1.f
    public void m() {
        if (this.f10008m || this.f10032c) {
            return;
        }
        v();
    }

    @Override // p1.f
    public void n(z zVar) {
        i0 i0VarX = x();
        if (i0VarX == null) {
            i0 i0Var = p0.f12478a;
            i0VarX = new i0();
            C(i0VarX);
        }
        i0VarX.a(zVar);
    }

    @Override // p1.f
    public final void p() {
        int length = this.k.length;
        for (int i7 = 0; i7 < length; i7++) {
            l.v(this.k[i7]);
        }
        o();
    }

    @Override // p1.f
    public void t(int i7) {
        this.f10003g = i7;
    }

    @Override // p1.f
    public f u(h9.k kVar) throws Throwable {
        if (this.f10032c) {
            r1.a("Cannot use a disposed snapshot");
        }
        if (this.f10008m && this.f10033d < 0) {
            r1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = l.f10057c;
        synchronized (obj) {
            try {
                long j5 = l.f10059e;
                long j10 = 1;
                l.f10059e = j5 + j10;
                l.f10058d = l.f10058d.n(j5);
                try {
                    d dVar = new d(j5, l.e(d(), jG + j10, j5), l.l(kVar, e(), true), this);
                    if (this.f10008m || this.f10032c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j11 = l.f10059e;
                        l.f10059e = j11 + j10;
                        s(j11);
                        l.f10058d = l.f10058d.n(g());
                    }
                    r(l.e(d(), jG2 + j10, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j5;
        A(g());
        if (this.f10008m || this.f10032c) {
            return;
        }
        long jG = g();
        synchronized (l.f10057c) {
            long j10 = l.f10059e;
            j5 = 1;
            l.f10059e = j10 + j5;
            s(j10);
            l.f10058d = l.f10058d.n(g());
        }
        r(l.e(d(), jG + j5, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    public q w() {
        HashMap mapC;
        ?? r8;
        i0 i0Var;
        long j5;
        long j10;
        i0 i0VarX = x();
        if (i0VarX != null) {
            long j11 = l.f10064j.f10031b;
            mapC = l.c(j11, this, l.f10058d.d(j11));
        } else {
            mapC = null;
        }
        u8.w wVar = u8.w.f13122a;
        synchronized (l.f10057c) {
            try {
                l.d(this);
                if (i0VarX == null || i0VarX.f12447d == 0) {
                    b();
                    a aVar = l.f10064j;
                    i0 i0Var2 = aVar.f10004h;
                    l.w(aVar, l.f10055a);
                    if (i0Var2 == null || !i0Var2.h()) {
                        r8 = wVar;
                        i0Var = null;
                    } else {
                        r8 = l.f10062h;
                        i0Var = i0Var2;
                    }
                } else {
                    a aVar2 = l.f10064j;
                    q qVarZ = z(l.f10059e, i0VarX, mapC, l.f10058d.d(aVar2.f10031b));
                    if (!qVarZ.equals(h.f10040c)) {
                        return qVarZ;
                    }
                    b();
                    i0Var = aVar2.f10004h;
                    l.w(aVar2, l.f10055a);
                    C(null);
                    aVar2.f10004h = null;
                    r8 = l.f10062h;
                }
                this.f10008m = true;
                if (i0Var != null) {
                    h1.h hVar = new h1.h(i0Var);
                    if (!i0Var.g()) {
                        int size = r8.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((h9.n) r8.get(i7)).invoke(hVar, this);
                        }
                    }
                }
                if (i0VarX != null && i0VarX.h()) {
                    h1.h hVar2 = new h1.h(i0VarX);
                    int size2 = r8.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((h9.n) r8.get(i10)).invoke(hVar2, this);
                    }
                }
                synchronized (l.f10057c) {
                    try {
                        p();
                        l.g();
                        if (i0Var != null) {
                            Object[] objArr = i0Var.f12445b;
                            long[] jArr = i0Var.f12444a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                j5 = 128;
                                while (true) {
                                    long j12 = jArr[i11];
                                    j10 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i11 != length) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((j12 & 255) < 128) {
                                                l.r((z) objArr[(i11 << 3) + i13]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i12 != 8) {
                                            break;
                                        }
                                        if (i11 != length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else {
                                j5 = 128;
                                j10 = 255;
                            }
                        } else {
                            j5 = 128;
                            j10 = 255;
                        }
                        if (i0VarX != null) {
                            Object[] objArr2 = i0VarX.f12445b;
                            long[] jArr2 = i0VarX.f12444a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j13 = jArr2[i14];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length2) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j13 & j10) < j5) {
                                                l.r((z) objArr2[(i14 << 3) + i16]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                        if (i14 != length2) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f10005i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                l.r((z) arrayList.get(i17));
                            }
                        }
                        this.f10005i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return h.f10040c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 x() {
        return this.f10004h;
    }

    @Override // p1.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public h9.k e() {
        return this.f10001e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final q z(long j5, i0 i0Var, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListX0;
        ArrayList arrayList2;
        int size;
        int i7;
        ArrayList arrayList3;
        int size2;
        int i10;
        z zVar;
        b0 b0Var;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        long j10;
        ArrayList arrayList4;
        b0 b0VarD;
        j jVarM = d().n(g()).m(this.f10006j);
        Object[] objArr3 = i0Var.f12445b;
        long[] jArr3 = i0Var.f12444a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            arrayList2 = null;
            arrayListX0 = null;
            while (true) {
                long j11 = jArr3[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            z zVar2 = (z) objArr3[(i12 << 3) + i14];
                            jArr2 = jArr3;
                            b0 b0VarC = zVar2.c();
                            i11 = i14;
                            ArrayList arrayList5 = arrayList2;
                            b0 b0VarT = l.t(b0VarC, j5, jVar);
                            if (b0VarT == null) {
                                jVar3 = jVarM;
                                arrayList4 = arrayListX0;
                                j10 = j11;
                            } else {
                                arrayList4 = arrayListX0;
                                j10 = j11;
                                b0 b0VarT2 = l.t(b0VarC, g(), jVarM);
                                if (b0VarT2 == null) {
                                    jVar3 = jVarM;
                                } else {
                                    jVar3 = jVarM;
                                    if (b0VarT2.f10009a != 1 && !b0VarT.equals(b0VarT2)) {
                                        b0 b0VarT3 = l.t(b0VarC, g(), d());
                                        if (b0VarT3 == null) {
                                            l.s();
                                            throw null;
                                        }
                                        if (map == null || (b0VarD = (b0) map.get(b0VarT)) == null) {
                                            b0VarD = zVar2.d(b0VarT2, b0VarT, b0VarT3);
                                        }
                                        if (b0VarD == null) {
                                            return new g(this);
                                        }
                                        if (!b0VarD.equals(b0VarT3)) {
                                            if (b0VarD.equals(b0VarT)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new t8.j(zVar2, b0VarT.b(g())));
                                                arrayListX0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListX0.add(zVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!b0VarD.equals(b0VarT2) ? new t8.j(zVar2, b0VarD) : new t8.j(zVar2, b0VarT2.b(g())));
                                            }
                                        }
                                        arrayListX0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListX0 = arrayList4;
                        } else {
                            jVar3 = jVarM;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i14;
                            j10 = j11;
                        }
                        j11 = j10 >> 8;
                        i14 = i11 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarM = jVar3;
                    }
                    jVar2 = jVarM;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarM;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 != length) {
                    i12++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarM = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i10 = 0; i10 < size2; i10++) {
                    t8.j jVar4 = (t8.j) arrayList2.get(i10);
                    zVar = (z) jVar4.f12830a;
                    b0Var = (b0) jVar4.f12831b;
                    b0Var.f10009a = j5;
                    synchronized (l.f10057c) {
                        b0Var.f10010b = zVar.c();
                        zVar.k(b0Var);
                    }
                }
            }
            if (arrayListX0 != null) {
                size = arrayListX0.size();
                for (i7 = 0; i7 < size; i7++) {
                    i0Var.l((z) arrayListX0.get(i7));
                }
                arrayList3 = this.f10005i;
                if (arrayList3 != null) {
                    arrayListX0 = u8.p.x0(arrayListX0, arrayList3);
                }
                this.f10005i = arrayListX0;
            }
            return h.f10040c;
        }
        arrayList = null;
        arrayListX0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i10 < size2) {
                t8.j jVar5 = (t8.j) arrayList2.get(i10);
                zVar = (z) jVar5.f12830a;
                b0Var = (b0) jVar5.f12831b;
                b0Var.f10009a = j5;
                synchronized (l.f10057c) {
                    b0Var.f10010b = zVar.c();
                    zVar.k(b0Var);
                }
            }
        }
        if (arrayListX0 != null) {
            size = arrayListX0.size();
            while (i7 < size) {
                i0Var.l((z) arrayListX0.get(i7));
            }
            arrayList3 = this.f10005i;
            if (arrayList3 != null) {
                arrayListX0 = u8.p.x0(arrayListX0, arrayList3);
            }
            this.f10005i = arrayListX0;
        }
        return h.f10040c;
    }
}
