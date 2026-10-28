package fc;

import cc.i1;
import cc.o1;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc.s f5616a = new hc.s(0, "NO_VALUE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hc.s f5617b = new hc.s(0, "NONE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hc.s f5618c = new hc.s(0, "PENDING");

    public static x a(int i7, int i10, ec.a aVar) {
        int i11 = (i10 & 1) != 0 ? 0 : 1;
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        int i12 = i10 & 4;
        ec.a aVar2 = ec.a.f4685a;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.E(i7, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i11 <= 0 && i7 <= 0 && aVar != aVar2) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i13 = i7 + i11;
        if (i13 < 0) {
            i13 = Integer.MAX_VALUE;
        }
        return new x(i11, i13, aVar);
    }

    public static final h0 b(Object obj) {
        if (obj == null) {
            obj = gc.c.f6217b;
        }
        return new h0(obj);
    }

    public static final void c(Object[] objArr, long j5, Object obj) {
        objArr[(objArr.length - 1) & ((int) j5)] = obj;
    }

    public static final d d(d dVar) {
        return ((dVar instanceof f0) || (dVar instanceof c)) ? dVar : new c(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0052, B:28:0x0067, B:30:0x006f, B:20:0x0047, B:23:0x004e), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r1.h(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ec.t] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ec.w] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ec.w] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ec.w] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(fc.e r7, ec.t r8, boolean r9, a9.c r10) {
        /*
            boolean r0 = r10 instanceof fc.f
            if (r0 == 0) goto L13
            r0 = r10
            fc.f r0 = (fc.f) r0
            int r1 = r0.f5535f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5535f = r1
            goto L18
        L13:
            fc.f r0 = new fc.f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5534e
            int r1 = r0.f5535f
            r2 = 0
            r3 = 2
            r4 = 1
            z8.a r5 = z8.a.f15774a
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f5533d
            ec.c r7 = r0.f5532c
            ec.w r8 = r0.f5531b
            fc.e r1 = r0.f5530a
            t8.a.e(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L52
        L35:
            r7 = move-exception
            goto L8c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f5533d
            ec.c r7 = r0.f5532c
            ec.w r8 = r0.f5531b
            fc.e r1 = r0.f5530a
            t8.a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L67
        L4b:
            t8.a.e(r10)
            ec.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            r0.f5530a = r7     // Catch: java.lang.Throwable -> L35
            r0.f5531b = r8     // Catch: java.lang.Throwable -> L35
            r0.f5532c = r10     // Catch: java.lang.Throwable -> L35
            r0.f5533d = r9     // Catch: java.lang.Throwable -> L35
            r0.f5535f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L63
            goto L83
        L63:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f5530a = r1     // Catch: java.lang.Throwable -> L35
            r0.f5531b = r8     // Catch: java.lang.Throwable -> L35
            r0.f5532c = r7     // Catch: java.lang.Throwable -> L35
            r0.f5533d = r9     // Catch: java.lang.Throwable -> L35
            r0.f5535f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.h(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L83:
            return r5
        L84:
            if (r9 == 0) goto L89
            r8.a(r2)
        L89:
            t8.z r7 = t8.z.f12851a
            return r7
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L97
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L97:
            if (r2 != 0) goto La3
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La3:
            r8.a(r2)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.y.e(fc.e, ec.t, boolean, a9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [h9.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fc.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [h9.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object f(d dVar, h9.n nVar, a9.c cVar) {
        q qVar;
        ?? r8;
        i9.x xVar;
        gc.a e7;
        b0.f fVar;
        ?? r10;
        hc.s sVar = gc.c.f6217b;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i7 = qVar.f5593e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qVar.f5593e = i7 - Integer.MIN_VALUE;
            } else {
                qVar = new q(cVar);
            }
        } else {
            qVar = new q(cVar);
        }
        Object obj = qVar.f5592d;
        int i10 = qVar.f5593e;
        if (i10 == 0) {
            t8.a.e(obj);
            i9.x xVar2 = new i9.x();
            xVar2.f6688a = sVar;
            b0.f fVar2 = new b0.f(6, (Object) nVar, xVar2);
            try {
                qVar.f5589a = (a9.i) nVar;
                qVar.f5590b = xVar2;
                qVar.f5591c = fVar2;
                qVar.f5593e = 1;
                Object objL = dVar.l(fVar2, qVar);
                z8.a aVar = z8.a.f15774a;
                if (objL == aVar) {
                    return aVar;
                }
                r10 = nVar;
                xVar = xVar2;
            } catch (gc.a e10) {
                r8 = nVar;
                xVar = xVar2;
                e7 = e10;
                fVar = fVar2;
                r10 = r8;
                if (e7.f6211a != fVar) {
                    throw e7;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = qVar.f5591c;
            xVar = qVar.f5590b;
            r8 = (h9.n) qVar.f5589a;
            try {
                t8.a.e(obj);
                r10 = r8;
            } catch (gc.a e11) {
                e7 = e11;
                r10 = r8;
                if (e7.f6211a != fVar) {
                    throw e7;
                }
            }
        }
        Object obj2 = xVar.f6688a;
        if (obj2 != sVar) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r10);
    }

    public static final u g(a2.d dVar, hc.c cVar, e0 e0Var, Float f10) {
        ec.l.a0.getClass();
        ec.k kVar = ec.k.f4729a;
        u0.k kVar2 = new u0.k(7, dVar, y8.i.f15108a);
        h0 h0VarB = b(f10);
        y8.h hVar = (y8.h) kVar2.f12991c;
        d dVar2 = (d) kVar2.f12990b;
        cc.z zVar = e0Var.equals(b0.f5522a) ? cc.z.f2689a : cc.z.f2692d;
        i iVar = new i(e0Var, dVar2, h0VarB, f10, null, 2);
        y8.h hVarT = cc.b0.t(cVar, hVar);
        cc.a i1Var = zVar == cc.z.f2690b ? new i1(hVarT, iVar) : new o1(hVarT, true);
        i1Var.g0(zVar, i1Var, iVar);
        return new u(h0VarB);
    }
}
