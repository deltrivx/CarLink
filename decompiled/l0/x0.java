package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, Object obj2, y8.c cVar, int i7) {
        super(2, cVar);
        this.f7897b = i7;
        this.f7900e = obj;
        this.f7901f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, y8.c cVar, int i7) {
        super(2, cVar);
        this.f7897b = i7;
        this.f7901f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(y8.h hVar, h9.n nVar, y8.c cVar) {
        super(2, cVar);
        this.f7897b = 2;
        this.f7900e = hVar;
        this.f7901f = (a9.h) nVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [a9.h, h9.n] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f7897b) {
            case 0:
                x0 x0Var = new x0((b1) this.f7901f, cVar, 0);
                x0Var.f7899d = obj;
                return x0Var;
            case 1:
                x0 x0Var2 = new x0((w0.w0) this.f7900e, (w0.f0) this.f7901f, cVar, 1);
                x0Var2.f7899d = obj;
                return x0Var2;
            case 2:
                x0 x0Var3 = new x0((y8.h) this.f7900e, (h9.n) this.f7901f, cVar);
                x0Var3.f7899d = obj;
                return x0Var3;
            case 3:
                x0 x0Var4 = new x0((v0.p) this.f7901f, cVar, 3);
                x0Var4.f7900e = obj;
                return x0Var4;
            default:
                x0 x0Var5 = new x0((k2.o) this.f7900e, (i9.x) this.f7901f, cVar, 4);
                x0Var5.f7899d = obj;
                return x0Var5;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7897b) {
            case 0:
                return ((x0) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((x0) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((x0) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 3:
                return ((x0) create((yb.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((x0) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014c A[PHI: r5
      0x014c: PHI (r5v8 ??) = (r5v24 ??), (r5v25 ??), (r5v9 ??), (r5v26 ??) binds: [B:88:0x017a, B:83:0x0169, B:76:0x014b, B:68:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0152 A[Catch: CancellationException -> 0x0139, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0139, blocks: (B:79:0x0152, B:82:0x0160, B:68:0x0135, B:73:0x0140), top: B:140:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160 A[Catch: CancellationException -> 0x0139, PHI: r5
      0x0160: PHI (r5v7 k2.l0) = (r5v27 k2.l0), (r5v28 k2.l0) binds: [B:80:0x015d, B:73:0x0140] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0139, blocks: (B:79:0x0152, B:82:0x0160, B:68:0x0135, B:73:0x0140), top: B:140:0x0119 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [a9.h, h9.n] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0234 -> B:130:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a4 -> B:35:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x010d -> B:56:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0169 -> B:77:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x017a -> B:77:0x014c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
