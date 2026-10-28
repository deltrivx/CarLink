package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k2.v f15317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cc.y f15320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.o f15321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h9.k f15322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h9.k f15323j;
    public final /* synthetic */ h9.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a1 f15324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(cc.y yVar, h9.o oVar, h9.k kVar, h9.k kVar2, h9.k kVar3, a1 a1Var, y8.c cVar) {
        super(2, cVar);
        this.f15320g = yVar;
        this.f15321h = oVar;
        this.f15322i = kVar;
        this.f15323j = kVar2;
        this.k = kVar3;
        this.f15324l = a1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        b2 b2Var = new b2(this.f15320g, this.f15321h, this.f15322i, this.f15323j, this.k, this.f15324l, cVar);
        b2Var.f15319f = obj;
        return b2Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((k2.l0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:21:0x010f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0119  */
    /* JADX WARN: Code duplicated, block: B:27:0x012c  */
    /* JADX WARN: Code duplicated, block: B:30:0x013c A[PHI: r1 r2 r4 r5 r12 r13 r14 r15 r21
      0x013c: PHI (r1v17 cc.a1) = (r1v6 cc.a1), (r1v20 cc.a1) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r2v8 h9.k) = (r12v0 h9.k), (r2v12 h9.k) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r4v12 h9.k) = (r4v4 h9.k), (r4v15 h9.k) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r5v6 k2.l0) = (r5v0 k2.l0), (r5v8 k2.l0) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v8 k2.v) = (r12v33 k2.v), (r12v9 k2.v) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r13v5 java.lang.Object) = (r13v1 java.lang.Object), (r13v8 java.lang.Object) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r14v8 h9.o) = (r13v0 h9.o), (r14v9 h9.o) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r15v6 k2.v) = (r15v2 k2.v), (r15v9 k2.v) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r21v5 z.a1) = (r14v1 z.a1), (r21v6 z.a1) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x016a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:42:0x0179  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0186  */
    /* JADX WARN: Code duplicated, block: B:47:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x0211  */
    /* JADX WARN: Code duplicated, block: B:68:0x0216  */
    /* JADX WARN: Code duplicated, block: B:71:0x0228  */
    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x0252  */
    /* JADX WARN: Code duplicated, block: B:80:0x025d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0261  */
    /* JADX WARN: Code duplicated, block: B:83:0x0269  */
    /* JADX WARN: Code duplicated, block: B:85:0x026d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0272  */
    /* JADX WARN: Code duplicated, block: B:89:0x028b  */
    /* JADX WARN: Code duplicated, block: B:91:0x029f  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        if (r6 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015b, code lost:
    
        if (z.e2.a(r5, r23) == r3) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [y8.c] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [y8.c, y8.h] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [y8.c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, k2.v] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [y8.c] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v7, types: [y8.c] */
    /* JADX WARN: Type inference failed for: r16v3, types: [y8.c] */
    /* JADX WARN: Type inference failed for: r4v25, types: [k2.v] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // a9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
