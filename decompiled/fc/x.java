package fc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class x extends gc.b implements s, d, gc.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ec.a f5611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f5612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5614j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5615l;

    public x(int i7, int i10, ec.a aVar) {
        this.f5609e = i7;
        this.f5610f = i10;
        this.f5611g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [fc.e] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [gc.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [fc.x] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fc.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [gc.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [fc.z] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [fc.z] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x0081
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void j(fc.x r8, fc.e r9, y8.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof fc.w
            if (r0 == 0) goto L13
            r0 = r10
            fc.w r0 = (fc.w) r0
            int r1 = r0.f5608g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5608g = r1
            goto L18
        L13:
            fc.w r0 = new fc.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5606e
            int r1 = r0.f5608g
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            cc.a1 r8 = r0.f5605d
            fc.z r9 = r0.f5604c
            fc.e r1 = r0.f5603b
            fc.x r4 = r0.f5602a
            t8.a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L74
        L36:
            r8 = move-exception
            goto Lb4
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            cc.a1 r8 = r0.f5605d
            fc.z r9 = r0.f5604c
            fc.e r1 = r0.f5603b
            fc.x r4 = r0.f5602a
            t8.a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L77
        L4d:
            fc.z r9 = r0.f5604c
            fc.e r8 = r0.f5603b
            fc.x r1 = r0.f5602a
            t8.a.e(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb4
        L5c:
            t8.a.e(r10)
            gc.d r10 = r8.a()
            fc.z r10 = (fc.z) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            y8.h r1 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            cc.v r4 = cc.v.f2678b     // Catch: java.lang.Throwable -> Lb1
            y8.f r1 = r1.l(r4)     // Catch: java.lang.Throwable -> Lb1
            cc.a1 r1 = (cc.a1) r1     // Catch: java.lang.Throwable -> Lb1
        L74:
            r4 = r8
            r8 = r1
            r1 = r10
        L77:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            hc.s r5 = fc.y.f5616a     // Catch: java.lang.Throwable -> L36
            z8.a r6 = z8.a.f15774a
            if (r10 != r5) goto L92
            r0.f5602a = r4     // Catch: java.lang.Throwable -> L36
            r0.f5603b = r1     // Catch: java.lang.Throwable -> L36
            r0.f5604c = r9     // Catch: java.lang.Throwable -> L36
            r0.f5605d = r8     // Catch: java.lang.Throwable -> L36
            r0.f5608g = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.f(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L77
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.j()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La0:
            r0.f5602a = r4     // Catch: java.lang.Throwable -> L36
            r0.f5603b = r1     // Catch: java.lang.Throwable -> L36
            r0.f5604c = r9     // Catch: java.lang.Throwable -> L36
            r0.f5605d = r8     // Catch: java.lang.Throwable -> L36
            r0.f5608g = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.h(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb4:
            r4.d(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.x.j(fc.x, fc.e, y8.c):void");
    }

    @Override // gc.b
    public final gc.d b() {
        z zVar = new z();
        zVar.f5619a = -1L;
        return zVar;
    }

    @Override // gc.b
    public final gc.d[] c() {
        return new z[2];
    }

    public final Object f(z zVar, w wVar) {
        cc.l lVar = new cc.l(1, n4.h.L(wVar));
        lVar.p();
        synchronized (this) {
            try {
                if (s(zVar) < 0) {
                    zVar.f5620b = lVar;
                } else {
                    lVar.resumeWith(t8.z.f12851a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objO = lVar.o();
        return objO == z8.a.f15774a ? objO : t8.z.f12851a;
    }

    @Override // gc.r
    public final d g(y8.h hVar, int i7, ec.a aVar) {
        return ((i7 == 0 || i7 == -3) && aVar == ec.a.f4685a) ? this : new gc.g(this, hVar, i7, aVar);
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) throws Throwable {
        Throwable th;
        y8.c[] cVarArrN;
        v vVar;
        if (q(obj)) {
            return t8.z.f12851a;
        }
        cc.l lVar = new cc.l(1, n4.h.L(cVar));
        lVar.p();
        y8.c[] cVarArrN2 = gc.c.f6216a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        lVar.resumeWith(t8.z.f12851a);
                        cVarArrN = n(cVarArrN2);
                        vVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        v vVar2 = new v(this, o() + ((long) (this.k + this.f5615l)), obj, lVar);
                        m(vVar2);
                        this.f5615l++;
                        if (this.f5610f == 0) {
                            cVarArrN2 = n(cVarArrN2);
                        }
                        cVarArrN = cVarArrN2;
                        vVar = vVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (vVar != null) {
                    lVar.s(new cc.h(1, vVar));
                }
                for (y8.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(t8.z.f12851a);
                    }
                }
                Object objO = lVar.o();
                z8.a aVar = z8.a.f15774a;
                if (objO != aVar) {
                    objO = t8.z.f12851a;
                }
                return objO == aVar ? objO : t8.z.f12851a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void i() {
        if (this.f5610f != 0 || this.f5615l > 1) {
            Object[] objArr = this.f5612h;
            i9.l.b(objArr);
            while (this.f5615l > 0) {
                long jO = o();
                int i7 = this.k;
                int i10 = this.f5615l;
                if (objArr[(objArr.length - 1) & ((int) ((jO + ((long) (i7 + i10))) - 1))] != y.f5616a) {
                    return;
                }
                this.f5615l = i10 - 1;
                y.c(objArr, o() + ((long) (this.k + this.f5615l)), null);
            }
        }
    }

    public final void k() {
        gc.d[] dVarArr;
        Object[] objArr = this.f5612h;
        i9.l.b(objArr);
        y.c(objArr, o(), null);
        this.k--;
        long jO = o() + 1;
        if (this.f5613i < jO) {
            this.f5613i = jO;
        }
        if (this.f5614j < jO) {
            if (this.f6213b != 0 && (dVarArr = this.f6212a) != null) {
                for (gc.d dVar : dVarArr) {
                    if (dVar != null) {
                        z zVar = (z) dVar;
                        long j5 = zVar.f5619a;
                        if (j5 >= 0 && j5 < jO) {
                            zVar.f5619a = jO;
                        }
                    }
                }
            }
            this.f5614j = jO;
        }
    }

    @Override // fc.d
    public final Object l(e eVar, y8.c cVar) throws Throwable {
        j(this, eVar, cVar);
        return z8.a.f15774a;
    }

    public final void m(Object obj) {
        int i7 = this.k + this.f5615l;
        Object[] objArrP = this.f5612h;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i7 >= objArrP.length) {
            objArrP = p(objArrP, i7, objArrP.length * 2);
        }
        y.c(objArrP, o() + ((long) i7), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [y8.c[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final y8.c[] n(y8.c[] cVarArr) {
        gc.d[] dVarArr;
        z zVar;
        cc.l lVar;
        int length = cVarArr.length;
        if (this.f6213b != 0 && (dVarArr = this.f6212a) != null) {
            int length2 = dVarArr.length;
            int i7 = 0;
            while (i7 < length2) {
                gc.d dVar = dVarArr[i7];
                if (dVar == null || (lVar = (zVar = (z) dVar).f5620b) == null || s(zVar) < 0) {
                    cVarArr = cVarArr;
                } else {
                    if (length >= cVarArr.length) {
                        cVarArr = cVarArr;
                        cVarArr = cVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        i9.l.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    cVarArr = cVarArr;
                    cVarArr = cVarArr;
                    ((y8.c[]) cVarArr)[length] = lVar;
                    zVar.f5620b = null;
                    length++;
                }
                i7++;
                cVarArr = cVarArr;
            }
            cVarArr = cVarArr;
        }
        return (y8.c[]) cVarArr;
    }

    public final long o() {
        return Math.min(this.f5614j, this.f5613i);
    }

    public final Object[] p(Object[] objArr, int i7, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f5612h = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i11 = 0; i11 < i7; i11++) {
                long j5 = ((long) i11) + jO;
                y.c(objArr2, j5, objArr[((int) j5) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i7;
        boolean z10;
        y8.c[] cVarArrN = gc.c.f6216a;
        synchronized (this) {
            if (r(obj)) {
                cVarArrN = n(cVarArrN);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (y8.c cVar : cVarArrN) {
            if (cVar != null) {
                cVar.resumeWith(t8.z.f12851a);
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean r(Object obj) {
        int i7;
        long jO;
        long j5;
        int i10 = this.f6213b;
        int i11 = this.f5609e;
        if (i10 != 0) {
            int i12 = this.k;
            int i13 = this.f5610f;
            if (i12 < i13 || this.f5614j > this.f5613i) {
                m(obj);
                i7 = this.k + 1;
                this.k = i7;
                if (i7 > i13) {
                    k();
                }
                jO = o() + ((long) this.k);
                j5 = this.f5613i;
                if (((int) (jO - j5)) > i11) {
                    u(1 + j5, this.f5614j, o() + ((long) this.k), o() + ((long) this.k) + ((long) this.f5615l));
                }
            } else {
                int iOrdinal = this.f5611g.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m(obj);
                    i7 = this.k + 1;
                    this.k = i7;
                    if (i7 > i13) {
                        k();
                    }
                    jO = o() + ((long) this.k);
                    j5 = this.f5613i;
                    if (((int) (jO - j5)) > i11) {
                        u(1 + j5, this.f5614j, o() + ((long) this.k), o() + ((long) this.k) + ((long) this.f5615l));
                    }
                } else if (iOrdinal != 2) {
                    throw new cc.s();
                }
            }
        } else if (i11 != 0) {
            m(obj);
            int i14 = this.k + 1;
            this.k = i14;
            if (i14 > i11) {
                k();
            }
            this.f5614j = o() + ((long) this.k);
            return true;
        }
        return true;
    }

    public final long s(z zVar) {
        long j5 = zVar.f5619a;
        if (j5 < o() + ((long) this.k)) {
            return j5;
        }
        if (this.f5610f <= 0 && j5 <= o() && this.f5615l != 0) {
            return j5;
        }
        return -1L;
    }

    public final Object t(z zVar) {
        Object obj;
        y8.c[] cVarArrV = gc.c.f6216a;
        synchronized (this) {
            try {
                long jS = s(zVar);
                if (jS < 0) {
                    obj = y.f5616a;
                } else {
                    long j5 = zVar.f5619a;
                    Object[] objArr = this.f5612h;
                    i9.l.b(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof v) {
                        obj2 = ((v) obj2).f5600c;
                    }
                    zVar.f5619a = jS + 1;
                    Object obj3 = obj2;
                    cVarArrV = v(j5);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (y8.c cVar : cVarArrV) {
            if (cVar != null) {
                cVar.resumeWith(t8.z.f12851a);
            }
        }
        return obj;
    }

    public final void u(long j5, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j5);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f5612h;
            i9.l.b(objArr);
            y.c(objArr, jO, null);
        }
        this.f5613i = j5;
        this.f5614j = j10;
        this.k = (int) (j11 - jMin);
        this.f5615l = (int) (j12 - j11);
    }

    public final y8.c[] v(long j5) {
        long j10;
        long j11;
        y8.c[] cVarArr;
        y8.c[] cVarArr2;
        gc.d[] dVarArr;
        hc.s sVar = y.f5616a;
        y8.c[] cVarArr3 = gc.c.f6216a;
        if (j5 <= this.f5614j) {
            long jO = o();
            long j12 = ((long) this.k) + jO;
            int i7 = this.f5610f;
            if (i7 == 0 && this.f5615l > 0) {
                j12++;
            }
            int i10 = 0;
            if (this.f6213b != 0 && (dVarArr = this.f6212a) != null) {
                for (gc.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((z) dVar).f5619a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f5614j) {
                long jO2 = o() + ((long) this.k);
                int iMin = this.f6213b > 0 ? Math.min(this.f5615l, i7 - ((int) (jO2 - j12))) : this.f5615l;
                long j14 = ((long) this.f5615l) + jO2;
                if (iMin > 0) {
                    j11 = 1;
                    Object[] objArr = this.f5612h;
                    i9.l.b(objArr);
                    y8.c[] cVarArr4 = new y8.c[iMin];
                    long j15 = jO2;
                    while (true) {
                        if (jO2 >= j14) {
                            cVarArr2 = cVarArr4;
                            j10 = j12;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != sVar) {
                            i9.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            v vVar = (v) obj;
                            int i11 = i10 + 1;
                            j10 = j12;
                            cVarArr2[i10] = vVar.f5601d;
                            y.c(objArr, jO2, sVar);
                            y.c(objArr, j15, vVar.f5600c);
                            j15++;
                            if (i11 >= iMin) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            j10 = j12;
                        }
                        jO2++;
                        cVarArr4 = cVarArr2;
                        j12 = j10;
                    }
                    jO2 = j15;
                    cVarArr = cVarArr2;
                } else {
                    j10 = j12;
                    j11 = 1;
                    cVarArr = cVarArr3;
                }
                int i12 = (int) (jO2 - jO);
                long j16 = this.f6213b == 0 ? jO2 : j10;
                long jMax = Math.max(this.f5613i, jO2 - ((long) Math.min(this.f5609e, i12)));
                if (i7 == 0 && jMax < j14) {
                    Object[] objArr2 = this.f5612h;
                    i9.l.b(objArr2);
                    if (i9.l.a(objArr2[((int) jMax) & (objArr2.length - 1)], sVar)) {
                        jO2 += j11;
                        jMax += j11;
                    }
                }
                u(jMax, j16, jO2, j14);
                i();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr3;
    }
}
