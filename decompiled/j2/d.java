package j2;

import cc.y;
import i9.n;
import n3.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f6901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f6902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f6903c = new b1.a(7, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f6904d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, long r13, a9.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof j2.b
            if (r0 == 0) goto L14
            r0 = r15
            j2.b r0 = (j2.b) r0
            int r1 = r0.f6897c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6897c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            j2.b r0 = new j2.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f6895a
            int r0 = r6.f6897c
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2a
            t8.a.e(r15)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            t8.a.e(r15)
            goto L5f
        L36:
            t8.a.e(r15)
            j2.g r15 = r10.f6901a
            r0 = 0
            if (r15 == 0) goto L49
            boolean r3 = r15.f11129n
            if (r3 == 0) goto L49
            q2.d2 r15 = q2.f.j(r15)
            j2.g r15 = (j2.g) r15
            goto L4a
        L49:
            r15 = r0
        L4a:
            r3 = 0
            z8.a r7 = z8.a.f15774a
            if (r15 != 0) goto L64
            j2.g r1 = r10.f6902b
            if (r1 == 0) goto L89
            r6.f6897c = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.l(r2, r4, r6)
            if (r15 != r7) goto L5f
            goto L82
        L5f:
            n3.t r15 = (n3.t) r15
            long r3 = r15.f8763a
            goto L89
        L64:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            j2.g r13 = r10.f6901a
            if (r13 == 0) goto L77
            boolean r14 = r13.f11129n
            if (r14 == 0) goto L77
            q2.d2 r13 = q2.f.j(r13)
            r0 = r13
            j2.g r0 = (j2.g) r0
        L77:
            if (r0 == 0) goto L88
            r6.f6897c = r1
            r1 = r0
            java.lang.Object r15 = r1.l(r2, r4, r6)
            if (r15 != r7) goto L83
        L82:
            return r7
        L83:
            n3.t r15 = (n3.t) r15
            long r3 = r15.f8763a
            goto L89
        L88:
            r3 = r11
        L89:
            n3.t r11 = new n3.t
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.a(long, long, a9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j5, a9.c cVar) {
        c cVar2;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i7 = cVar2.f6900c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar2.f6900c = i7 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objU = cVar2.f6898a;
        int i10 = cVar2.f6900c;
        if (i10 == 0) {
            t8.a.e(objU);
            g gVar = this.f6901a;
            g gVar2 = null;
            if (gVar != null && gVar.f11129n) {
                gVar2 = (g) q2.f.j(gVar);
            }
            if (gVar2 != null) {
                cVar2.f6900c = 1;
                objU = gVar2.u(j5, cVar2);
                z8.a aVar = z8.a.f15774a;
                if (objU == aVar) {
                    return aVar;
                }
            } else {
                j10 = 0;
            }
            return new t(j10);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(objU);
        j10 = ((t) objU).f8763a;
        return new t(j10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h9.a, i9.n] */
    public final y c() {
        y yVar = (y) this.f6903c.invoke();
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
