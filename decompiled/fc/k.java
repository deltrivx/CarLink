package fc;

import a8.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i9.x f5562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.w f5563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f5567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f5568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, s1 s1Var, y8.c cVar) {
        super(3, cVar);
        this.f5567f = gVar;
        this.f5568g = s1Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f5567f, this.f5568g, (y8.c) obj3);
        kVar.f5565d = (cc.y) obj;
        kVar.f5566e = (e) obj2;
        return kVar.invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab A[PHI: r7 r8 r9 r10
      0x00ab: PHI (r7v2 i9.x) = (r7v4 i9.x), (r7v5 i9.x), (r7v5 i9.x) binds: [B:26:0x00a8, B:15:0x0076, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r8v2 ??) = (r8v14 ??), (r8v15 ??), (r8v16 ??) binds: [B:26:0x00a8, B:15:0x0076, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r9v4 fc.e) = (r9v16 fc.e), (r9v17 fc.e), (r9v17 fc.e) binds: [B:26:0x00a8, B:15:0x0076, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r10v4 i9.w) = (r10v6 i9.w), (r10v8 i9.w), (r10v8 i9.w) binds: [B:26:0x00a8, B:15:0x0076, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [ec.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [ec.w] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
