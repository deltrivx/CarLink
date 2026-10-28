package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f10041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f10046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, y8.c cVar) {
        super(2, cVar);
        this.f10046g = jVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        i iVar = new i(this.f10046g, cVar);
        iVar.f10045f = obj;
        return iVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((yb.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:27:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bd -> B:8:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            p1.j r1 = r0.f10046g
            long r2 = r1.f10048a
            long r4 = r1.f10050c
            long r6 = r1.f10049b
            int r8 = r0.f10044e
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            z8.a r11 = z8.a.f15774a
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f10042c
            java.lang.Object r6 = r0.f10045f
            yb.k r6 = (yb.k) r6
            t8.a.e(r23)
        L29:
            r7 = 3
            goto Lc0
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f10042c
            java.lang.Object r8 = r0.f10045f
            yb.k r8 = (yb.k) r8
            t8.a.e(r23)
            goto L95
        L3e:
            int r1 = r0.f10043d
            int r8 = r0.f10042c
            long[] r15 = r0.f10041b
            java.lang.Object r12 = r0.f10045f
            yb.k r12 = (yb.k) r12
            t8.a.e(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            t8.a.e(r23)
            java.lang.Object r8 = r0.f10045f
            r12 = r8
            yb.k r12 = (yb.k) r12
            long[] r15 = r1.f10051d
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f10045f = r12
            r0.f10041b = r15
            r0.f10042c = r8
            r0.f10043d = r1
            r0.f10044e = r10
            r12.b(r4, r0)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f10045f = r8
            r0.f10041b = r9
            r0.f10042c = r1
            r0.f10044e = r13
            r8.b(r2, r0)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc3
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc3
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f10045f = r6
            r0.f10041b = r9
            r0.f10042c = r15
            r7 = 3
            r0.f10044e = r7
            r6.b(r1, r0)
            return r11
        Lbd:
            r1 = r15
            goto L29
        Lc0:
            int r15 = r1 + 1
            goto L9e
        Lc3:
            t8.z r1 = t8.z.f12851a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
