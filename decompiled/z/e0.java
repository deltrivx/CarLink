package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15349a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.x f15350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i9.x f15351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f15354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i9.x xVar, f0 f0Var, y8.c cVar) {
        super(2, cVar);
        this.f15351c = xVar;
        this.f15354f = f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, y8.c cVar) {
        super(2, cVar);
        this.f15354f = f0Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15349a) {
            case 0:
                e0 e0Var = new e0(this.f15351c, this.f15354f, cVar);
                e0Var.f15353e = obj;
                return e0Var;
            default:
                e0 e0Var2 = new e0(this.f15354f, cVar);
                e0Var2.f15353e = obj;
                return e0Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15349a) {
            case 0:
                return ((e0) create((h9.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((e0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f A[PHI: r5
      0x005f: PHI (r5v7 cc.y) = (r5v0 cc.y), (r5v3 cc.y), (r5v3 cc.y), (r5v3 cc.y), (r5v5 cc.y), (r5v8 cc.y) binds: [B:21:0x0057, B:48:0x00cf, B:50:0x00dc, B:44:0x00c7, B:33:0x008b, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[Catch: CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, blocks: (B:41:0x00b4, B:43:0x00ba, B:47:0x00cd, B:49:0x00d1), top: B:89:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[Catch: CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, blocks: (B:41:0x00b4, B:43:0x00ba, B:47:0x00cd, B:49:0x00d1), top: B:89:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: CancellationException -> 0x00ca, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ca, blocks: (B:41:0x00b4, B:43:0x00ba, B:47:0x00cd, B:49:0x00d1), top: B:89:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008b -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c7 -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cf -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00dc -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ea -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0140 -> B:80:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0145 -> B:82:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x009f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
