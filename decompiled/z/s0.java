package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i9.t f15488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.t f15489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i9.u f15493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i9.x f15494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i9.x f15495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f15496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f15497j;
    public final /* synthetic */ float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t1 f15498l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(i9.u uVar, i9.x xVar, i9.x xVar2, float f10, w0 w0Var, float f11, t1 t1Var, y8.c cVar) {
        super(2, cVar);
        this.f15493f = uVar;
        this.f15494g = xVar;
        this.f15495h = xVar2;
        this.f15496i = f10;
        this.f15497j = w0Var;
        this.k = f11;
        this.f15498l = t1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        s0 s0Var = new s0(this.f15493f, this.f15494g, this.f15495h, this.f15496i, this.f15497j, this.k, this.f15498l, cVar);
        s0Var.f15492e = obj;
        return s0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((r1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x0145  */
    /* JADX WARN: Code duplicated, block: B:29:0x0149  */
    /* JADX WARN: Code duplicated, block: B:30:0x014c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0154  */
    /* JADX WARN: Code duplicated, block: B:35:0x0174  */
    /* JADX WARN: Code duplicated, block: B:36:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x0187  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0176 -> B:37:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0187 -> B:39:0x0184). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
