package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15553b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t8.e f15558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t8.e f15559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(cc.y yVar, h9.o oVar, h9.k kVar, a1 a1Var, y8.c cVar) {
        super(2, cVar);
        this.f15557f = yVar;
        this.f15558g = (a9.i) oVar;
        this.f15559h = kVar;
        this.f15560i = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x.n1 n1Var, a8.l lVar, w0.e1 e1Var, w0.e1 e1Var2, y8.c cVar) {
        super(2, cVar);
        this.f15557f = n1Var;
        this.f15558g = lVar;
        this.f15559h = e1Var;
        this.f15560i = e1Var2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a9.i, h9.o] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15553b) {
            case 0:
                v vVar = new v((x.n1) this.f15557f, (a8.l) this.f15558g, (w0.e1) this.f15559h, (w0.e1) this.f15560i, cVar);
                vVar.f15555d = obj;
                return vVar;
            default:
                v vVar2 = new v((cc.y) this.f15557f, (h9.o) this.f15558g, (h9.k) this.f15559h, (a1) this.f15560i, cVar);
                vVar2.f15555d = obj;
                return vVar2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        k2.l0 l0Var = (k2.l0) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15553b) {
            case 0:
                break;
        }
        return ((v) create(l0Var, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r2 == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
    
        if (r0 == r5) goto L47;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [a9.i, h9.o] */
    @Override // a9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
