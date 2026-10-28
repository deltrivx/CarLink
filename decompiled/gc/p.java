package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ec.l f6254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f6255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc.d[] f6260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fc.n f6261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fc.e f6262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fc.d[] dVarArr, fc.n nVar, fc.e eVar, y8.c cVar) {
        super(2, cVar);
        this.f6260g = dVarArr;
        this.f6261h = nVar;
        this.f6262i = eVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        p pVar = new p(this.f6260g, this.f6261h, this.f6262i, cVar);
        pVar.f6259f = obj;
        return pVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[DONT_INVERT, EDGE_INSN: B:32:0x00bb->B:18:0x007c BREAK  A[LOOP:0: B:25:0x009c->B:38:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:25:0x009c->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:18:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
