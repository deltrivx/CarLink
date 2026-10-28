package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f5527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f5528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f5529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, y8.c cVar) {
        super(3, cVar);
        this.f5529d = e0Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        d0 d0Var = new d0(this.f5529d, (y8.c) obj3);
        d0Var.f5527b = (e) obj;
        d0Var.f5528c = iIntValue;
        return d0Var.invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[PHI: r0
      0x0062: PHI (r0v3 fc.e) = (r0v2 fc.e), (r0v6 fc.e) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.h(fc.a0.f5515a, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.h(fc.a0.f5517c, r7) == r6) goto L32;
     */
    @Override // a9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f5526a
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            z8.a r6 = z8.a.f15774a
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            fc.e r0 = r7.f5527b
            t8.a.e(r8)
            goto L72
        L24:
            fc.e r0 = r7.f5527b
            t8.a.e(r8)
            goto L62
        L2a:
            fc.e r0 = r7.f5527b
            t8.a.e(r8)
            goto L55
        L30:
            t8.a.e(r8)
            goto L80
        L34:
            t8.a.e(r8)
            fc.e r0 = r7.f5527b
            int r8 = r7.f5528c
            if (r8 <= 0) goto L48
            r7.f5526a = r5
            fc.a0 r8 = fc.a0.f5515a
            java.lang.Object r8 = r0.h(r8, r7)
            if (r8 != r6) goto L80
            goto L7f
        L48:
            r7.f5527b = r0
            r7.f5526a = r4
            r4 = 0
            java.lang.Object r8 = cc.b0.h(r4, r7)
            if (r8 != r6) goto L55
            goto L7f
        L55:
            r7.f5527b = r0
            r7.f5526a = r3
            fc.a0 r8 = fc.a0.f5516b
            java.lang.Object r8 = r0.h(r8, r7)
            if (r8 != r6) goto L62
            goto L7f
        L62:
            r7.f5527b = r0
            r7.f5526a = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = cc.b0.h(r2, r7)
            if (r8 != r6) goto L72
            goto L7f
        L72:
            r8 = 0
            r7.f5527b = r8
            r7.f5526a = r1
            fc.a0 r8 = fc.a0.f5517c
            java.lang.Object r8 = r0.h(r8, r7)
            if (r8 != r6) goto L80
        L7f:
            return r6
        L80:
            t8.z r8 = t8.z.f12851a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
