package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k2.n f15503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i9.t f15507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i9.x f15508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i9.x f15509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i9.t tVar, i9.x xVar, i9.x xVar2, y8.c cVar) {
        super(2, cVar);
        this.f15507f = tVar;
        this.f15508g = xVar;
        this.f15509h = xVar2;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        t tVar = new t(this.f15507f, this.f15508g, this.f15509h, cVar);
        tVar.f15506e = obj;
        return tVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:2: B:16:0x0058->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x006b A[EDGE_INSN: B:75:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x0058->B:20:0x0067], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:39:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
