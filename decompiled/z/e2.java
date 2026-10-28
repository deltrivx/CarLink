package z;

import r2.a3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f15357a = new g0(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object a(k2.l0 r7, a9.a r8) {
        /*
            boolean r0 = r8 instanceof z.x1
            if (r0 == 0) goto L13
            r0 = r8
            z.x1 r0 = (z.x1) r0
            int r1 = r0.f15596c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15596c = r1
            goto L18
        L13:
            z.x1 r0 = new z.x1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15595b
            int r1 = r0.f15596c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            k2.l0 r7 = r0.f15594a
            t8.a.e(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            t8.a.e(r8)
        L32:
            r0.f15594a = r7
            r0.f15596c = r2
            java.lang.Object r8 = a2.f.q(r7, r0)
            z8.a r1 = z8.a.f15774a
            if (r8 != r1) goto L3f
            return r1
        L3f:
            k2.n r8 = (k2.n) r8
            java.lang.Object r1 = r8.f7264a
            int r3 = r1.size()
            r4 = 0
            r5 = 0
        L49:
            if (r5 >= r3) goto L57
            java.lang.Object r6 = r1.get(r5)
            k2.v r6 = (k2.v) r6
            r6.a()
            int r5 = r5 + 1
            goto L49
        L57:
            java.lang.Object r8 = r8.f7264a
            int r1 = r8.size()
        L5d:
            if (r4 >= r1) goto L6d
            java.lang.Object r3 = r8.get(r4)
            k2.v r3 = (k2.v) r3
            boolean r3 = r3.f7281d
            if (r3 == 0) goto L6a
            goto L32
        L6a:
            int r4 = r4 + 1
            goto L5d
        L6d:
            t8.z r7 = t8.z.f12851a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e2.a(k2.l0, a9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(k2.l0 r5, boolean r6, k2.o r7, a9.a r8) {
        /*
            boolean r0 = r8 instanceof z.u1
            if (r0 == 0) goto L13
            r0 = r8
            z.u1 r0 = (z.u1) r0
            int r1 = r0.f15552e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15552e = r1
            goto L18
        L13:
            z.u1 r0 = new z.u1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15551d
            int r1 = r0.f15552e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f15550c
            k2.o r6 = r0.f15549b
            k2.l0 r7 = r0.f15548a
            t8.a.e(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            t8.a.e(r8)
        L3a:
            r0.f15548a = r5
            r0.f15549b = r7
            r0.f15550c = r6
            r0.f15552e = r2
            java.lang.Object r8 = r5.b(r7, r0)
            z8.a r1 = z8.a.f15774a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            k2.n r8 = (k2.n) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L3a
            java.lang.Object r5 = r8.f7264a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e2.b(k2.l0, boolean, k2.o, a9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(k2.l0 r5, k2.o r6, a9.a r7) {
        /*
            boolean r0 = r7 instanceof z.v1
            if (r0 == 0) goto L13
            r0 = r7
            z.v1 r0 = (z.v1) r0
            int r1 = r0.f15567d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15567d = r1
            goto L18
        L13:
            z.v1 r0 = new z.v1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15566c
            int r1 = r0.f15567d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            k2.o r5 = r0.f15565b
            k2.l0 r6 = r0.f15564a
            t8.a.e(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            t8.a.e(r7)
        L37:
            r0.f15564a = r5
            r0.f15565b = r6
            r0.f15567d = r2
            java.lang.Object r7 = r5.b(r6, r0)
            z8.a r1 = z8.a.f15774a
            if (r7 != r1) goto L46
            return r1
        L46:
            k2.n r7 = (k2.n) r7
            r1 = 0
            boolean r3 = f(r7, r1, r2)
            if (r3 == 0) goto L37
            java.lang.Object r5 = r7.f7264a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e2.d(k2.l0, k2.o, a9.a):java.lang.Object");
    }

    public static Object e(k2.z zVar, c1.f2 f2Var, h9.k kVar, a9.i iVar, int i7) {
        Object obj = f2Var;
        if ((i7 & 4) != 0) {
            obj = f15357a;
        }
        Object objG = cc.b0.g(new a3(zVar, obj, null, null, kVar, null, 4), iVar);
        return objG == z8.a.f15774a ? objG : t8.z.f12851a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean f(k2.n nVar, boolean z10, boolean z11) {
        if (z11) {
            ?? r8 = nVar.f7264a;
            int size = r8.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    if ((nVar.f7267d & 33) != 0) {
                        break;
                    }
                    return false;
                }
                if (((k2.v) r8.get(i7)).f7286i != 2) {
                    break;
                }
                i7++;
            }
        }
        ?? r10 = nVar.f7264a;
        int size2 = r10.size();
        int i10 = 0;
        while (true) {
            boolean zA = true;
            if (i10 >= size2) {
                return true;
            }
            k2.v vVar = (k2.v) r10.get(i10);
            if (!z10) {
                zA = k2.u.a(vVar);
            } else if (vVar.b() || vVar.f7285h || !vVar.f7281d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i10++;
        }
    }

    public static cc.o1 g(cc.y yVar, cc.a1 a1Var, h9.n nVar) {
        return cc.b0.s(yVar, null, new b1.f(a1Var, nVar, (y8.c) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(k2.l0 l0Var, k2.o oVar, a9.a aVar) {
        c2 c2Var;
        i9.x xVar;
        if (aVar instanceof c2) {
            c2Var = (c2) aVar;
            int i7 = c2Var.f15336c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c2Var.f15336c = i7 - Integer.MIN_VALUE;
            } else {
                c2Var = new c2(aVar);
            }
        } else {
            c2Var = new c2(aVar);
        }
        Object obj = c2Var.f15335b;
        int i10 = c2Var.f15336c;
        try {
            if (i10 == 0) {
                t8.a.e(obj);
                i9.x xVar2 = new i9.x();
                xVar2.f6688a = l0.f15429a;
                long jB = l0Var.d().b();
                h9.n x0Var = new l0.x0(oVar, xVar2, null, 4);
                c2Var.f15334a = xVar2;
                c2Var.f15336c = 1;
                Object objH = l0Var.h(jB, x0Var, c2Var);
                Object obj2 = z8.a.f15774a;
                if (objH == obj2) {
                    return obj2;
                }
                xVar = xVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = c2Var.f15334a;
                t8.a.e(obj);
            }
            return xVar.f6688a;
        } catch (k2.p unused) {
            return n0.f15436a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[LOOP:1: B:23:0x005f->B:44:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object i(k2.l0 r13, k2.o r14, a9.a r15) {
        /*
            boolean r0 = r15 instanceof z.d2
            if (r0 == 0) goto L13
            r0 = r15
            z.d2 r0 = (z.d2) r0
            int r1 = r0.f15346d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15346d = r1
            goto L18
        L13:
            z.d2 r0 = new z.d2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f15345c
            int r1 = r0.f15346d
            r2 = 2
            r3 = 0
            r4 = 1
            z8.a r5 = z8.a.f15774a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            k2.o r13 = r0.f15344b
            k2.l0 r14 = r0.f15343a
            t8.a.e(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            k2.o r13 = r0.f15344b
            k2.l0 r14 = r0.f15343a
            t8.a.e(r15)
            goto L56
        L43:
            t8.a.e(r15)
        L46:
            r0.f15343a = r13
            r0.f15344b = r14
            r0.f15346d = r4
            java.lang.Object r15 = r13.b(r14, r0)
            if (r15 != r5) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            k2.n r15 = (k2.n) r15
            java.lang.Object r15 = r15.f7264a
            int r1 = r15.size()
            r6 = 0
        L5f:
            if (r6 >= r1) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            k2.v r7 = (k2.v) r7
            boolean r7 = k2.u.b(r7)
            if (r7 != 0) goto Lbd
            int r1 = r15.size()
            r6 = 0
        L72:
            if (r6 >= r1) goto L92
            java.lang.Object r7 = r15.get(r6)
            k2.v r7 = (k2.v) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb8
            k2.m0 r8 = r14.f7251f
            long r8 = r8.f7263x
            long r10 = r14.c()
            boolean r7 = k2.u.e(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            r0.f15343a = r14
            r0.f15344b = r13
            r0.f15346d = r2
            k2.o r15 = k2.o.f7271c
            java.lang.Object r15 = r14.b(r15, r0)
            if (r15 != r5) goto L2e
        La0:
            return r5
        La1:
            k2.n r15 = (k2.n) r15
            java.lang.Object r15 = r15.f7264a
            int r1 = r15.size()
            r6 = 0
        Laa:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            k2.v r7 = (k2.v) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e2.i(k2.l0, k2.o, a9.a):java.lang.Object");
    }
}
