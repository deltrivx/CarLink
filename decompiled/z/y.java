package z;

import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f15597a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[LOOP:0: B:24:0x00a0->B:28:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9 A[EDGE_INSN: B:65:0x00b9->B:30:0x00b9 BREAK  A[LOOP:0: B:24:0x00a0->B:28:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:23:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(k2.l0 r17, k2.v r18, k2.o r19, a9.a r20) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.y.a(k2.l0, k2.v, k2.o, a9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(k2.l0 r12, long r13, a9.c r15) {
        /*
            boolean r0 = r15 instanceof z.q
            if (r0 == 0) goto L13
            r0 = r15
            z.q r0 = (z.q) r0
            int r1 = r0.f15456d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15456d = r1
            goto L18
        L13:
            z.q r0 = new z.q
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f15455c
            int r1 = r0.f15456d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            i9.w r12 = r0.f15454b
            k2.l0 r13 = r0.f15453a
            t8.a.e(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            t8.a.e(r15)
            k2.m0 r15 = r12.f7251f
            k2.n r15 = r15.f7258s
            boolean r15 = h(r15, r13)
            if (r15 == 0) goto L44
            goto Lc2
        L44:
            i9.w r15 = new i9.w
            r15.<init>()
            r15.f6687a = r13
        L4b:
            r0.f15453a = r12
            r0.f15454b = r15
            r0.f15456d = r2
            java.lang.Object r13 = a2.f.q(r12, r0)
            z8.a r14 = z8.a.f15774a
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            k2.n r15 = (k2.n) r15
            java.lang.Object r14 = r15.f7264a
            int r1 = r14.size()
            r4 = 0
            r5 = 0
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            k2.v r7 = (k2.v) r7
            long r7 = r7.f7278a
            long r9 = r13.f6687a
            boolean r7 = k2.u.d(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            k2.v r6 = (k2.v) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = k2.u.c(r6)
            if (r14 == 0) goto Lad
            java.lang.Object r14 = r15.f7264a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            k2.v r5 = (k2.v) r5
            boolean r5 = r5.f7281d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            k2.v r1 = (k2.v) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.f7278a
            r13.f6687a = r14
            goto Lc3
        Lad:
            long r14 = k2.u.f(r6, r2)
            r4 = 0
            boolean r14 = x1.b.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: z.y.b(k2.l0, long, a9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf A[LOOP:0: B:26:0x00b6->B:30:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[EDGE_INSN: B:67:0x00db->B:32:0x00db BREAK  A[LOOP:0: B:26:0x00b6->B:30:0x00cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x010f -> B:57:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0140 -> B:57:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0167 -> B:62:0x016d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(k2.l0 r19, long r20, int r22, y7.a r23, a9.a r24) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.y.c(k2.l0, long, int, y7.a, a9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [i9.x] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final Object d(k2.l0 l0Var, long j5, a9.c cVar) {
        s sVar;
        Object obj;
        k2.v vVar;
        i9.t tVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i7 = sVar.f15487e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                sVar.f15487e = i7 - Integer.MIN_VALUE;
            } else {
                sVar = new s(cVar);
            }
        } else {
            sVar = new s(cVar);
        }
        Object obj2 = sVar.f15486d;
        int i10 = sVar.f15487e;
        try {
            if (i10 == 0) {
                t8.a.e(obj2);
                if (!h(l0Var.f7251f.f7258s, j5)) {
                    ?? r11 = l0Var.f7251f.f7258s.f7264a;
                    int size = r11.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r11.get(i11);
                        if (k2.u.d(((k2.v) obj).f7278a, j5)) {
                            break;
                        }
                        i11++;
                    }
                    vVar = (k2.v) obj;
                    if (vVar != null) {
                        i9.x xVar = new i9.x();
                        i9.x xVar2 = new i9.x();
                        xVar2.f6688a = vVar;
                        long jB = l0Var.d().b();
                        i9.t tVar2 = new i9.t();
                        h9.n tVar3 = new t(tVar2, xVar2, xVar, null);
                        sVar.f15483a = vVar;
                        sVar.f15484b = xVar;
                        sVar.f15485c = tVar2;
                        sVar.f15487e = 1;
                        Object objH = l0Var.h(jB, tVar3, sVar);
                        Object obj3 = z8.a.f15774a;
                        if (objH == obj3) {
                            return obj3;
                        }
                        tVar = tVar2;
                        j5 = xVar;
                    }
                }
                return null;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = sVar.f15485c;
            i9.x xVar3 = sVar.f15484b;
            vVar = sVar.f15483a;
            t8.a.e(obj2);
            j5 = xVar3;
            if (tVar.f6684a) {
                k2.v vVar2 = (k2.v) j5.f6688a;
                return vVar2 == null ? vVar : vVar2;
            }
            return null;
        } catch (k2.p unused) {
            k2.v vVar3 = (k2.v) j5.f6688a;
            return vVar3 == null ? vVar : vVar3;
        }
    }

    public static Object e(k2.z zVar, h9.n nVar, y8.c cVar) {
        x.n1 n1Var = new x.n1(17);
        w0.e1 e1Var = new w0.e1(11);
        Object objL = n4.h.l(zVar, new u(new w0.e1(12), new i9.w(), null, new cc.k(5, n1Var), nVar, new w0.e1(11), new w0.b1(e1Var, 3), null), cVar);
        t8.z zVar2 = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        if (objL != aVar) {
            objL = zVar2;
        }
        return objL == aVar ? objL : zVar2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(k2.l0 r4, long r5, h9.k r7, a9.c r8) {
        /*
            boolean r0 = r8 instanceof z.w
            if (r0 == 0) goto L13
            r0 = r8
            z.w r0 = (z.w) r0
            int r1 = r0.f15571d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15571d = r1
            goto L18
        L13:
            z.w r0 = new z.w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15570c
            int r1 = r0.f15571d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            h9.k r4 = r0.f15569b
            k2.l0 r5 = r0.f15568a
            t8.a.e(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            t8.a.e(r8)
        L36:
            r0.f15568a = r4
            r0.f15569b = r7
            r0.f15571d = r2
            java.lang.Object r8 = b(r4, r5, r0)
            z8.a r5 = z8.a.f15774a
            if (r8 != r5) goto L45
            return r5
        L45:
            k2.v r8 = (k2.v) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = k2.u.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f7278a
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: z.y.f(k2.l0, long, h9.k, a9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[LOOP:0: B:24:0x0085->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x009d A[EDGE_INSN: B:72:0x009d->B:30:0x009d BREAK  A[LOOP:0: B:24:0x0085->B:28:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(k2.l0 r17, long r18, s0.d r20, a9.a r21) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.y.g(k2.l0, long, s0.d, a9.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean h(k2.n nVar, long j5) {
        Object obj;
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = r8.get(i7);
            if (k2.u.d(((k2.v) obj).f7278a, j5)) {
                break;
            }
            i7++;
        }
        k2.v vVar = (k2.v) obj;
        if (vVar != null && vVar.f7281d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float i(r2 r2Var, int i7) {
        return i7 == 2 ? r2Var.f() * f15597a : r2Var.f();
    }
}
