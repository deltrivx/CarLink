package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k2.v f15583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(k2.v vVar, y8.c cVar) {
        super(2, cVar);
        this.f15583e = vVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        w1 w1Var = new w1(this.f15583e, cVar);
        w1Var.f15582d = obj;
        return w1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f15581c
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            long r2 = r7.f15580b
            java.lang.Object r0 = r7.f15582d
            k2.l0 r0 = (k2.l0) r0
            t8.a.e(r8)
            goto L40
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            t8.a.e(r8)
            java.lang.Object r8 = r7.f15582d
            k2.l0 r8 = (k2.l0) r8
            k2.v r0 = r7.f15583e
            long r2 = r0.f7279b
            r2.r2 r0 = r8.d()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r8
            r2 = r4
        L30:
            r7.f15582d = r0
            r7.f15580b = r2
            r7.f15581c = r1
            r8 = 3
            java.lang.Object r8 = z.e2.c(r0, r7, r8)
            z8.a r4 = z8.a.f15774a
            if (r8 != r4) goto L40
            return r4
        L40:
            k2.v r8 = (k2.v) r8
            long r4 = r8.f7279b
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L30
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
