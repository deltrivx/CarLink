package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1.c f12450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f12451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f12452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12458j;
    public /* synthetic */ Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k0 f12459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1.c f12460m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, l1.c cVar, y8.c cVar2) {
        super(2, cVar2);
        this.f12459l = k0Var;
        this.f12460m = cVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        j0 j0Var = new j0(this.f12459l, this.f12460m, cVar);
        j0Var.k = obj;
        return j0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((yb.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f12458j
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f12456h
            int r5 = r0.f12455g
            long r6 = r0.f12457i
            int r8 = r0.f12454f
            int r9 = r0.f12453e
            long[] r10 = r0.f12452d
            s.k0 r11 = r0.f12451c
            l1.c r12 = r0.f12450b
            java.lang.Object r13 = r0.k
            yb.k r13 = (yb.k) r13
            t8.a.e(r22)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            t8.a.e(r22)
            java.lang.Object r1 = r0.k
            yb.k r1 = (yb.k) r1
            s.k0 r5 = r0.f12459l
            s.i0 r6 = r5.f12467b
            long[] r6 = r6.f12444a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            l1.c r8 = r0.f12460m
            r9 = 0
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = 0
            r19 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r19
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f7972b = r2
            s.i0 r3 = r11.f12467b
            java.lang.Object[] r3 = r3.f12445b
            r2 = r3[r2]
            r0.k = r13
            r0.f12450b = r12
            r0.f12451c = r11
            r0.f12452d = r10
            r0.f12453e = r9
            r0.f12454f = r8
            r0.f12457i = r6
            r0.f12455g = r5
            r0.f12456h = r1
            r0.f12458j = r4
            r13.b(r2, r0)
            z8.a r1 = z8.a.f15774a
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            t8.z r1 = t8.z.f12851a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
