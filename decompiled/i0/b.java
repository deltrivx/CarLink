package i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.e f6576a = new h1.e(new c[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object a(x1.c r8, a9.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i0.a
            if (r0 == 0) goto L13
            r0 = r9
            i0.a r0 = (i0.a) r0
            int r1 = r0.f6575g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6575g = r1
            goto L18
        L13:
            i0.a r0 = new i0.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f6573e
            int r1 = r0.f6575g
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r8 = r0.f6572d
            int r1 = r0.f6571c
            java.lang.Object[] r3 = r0.f6570b
            x1.c r4 = r0.f6569a
            t8.a.e(r9)
            r9 = r4
            goto L64
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            t8.a.e(r9)
            h1.e r9 = r7.f6576a
            java.lang.Object[] r1 = r9.f6421a
            int r9 = r9.f6423c
            r3 = 0
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = 0
        L45:
            if (r1 >= r8) goto L66
            r4 = r3[r1]
            i0.c r4 = (i0.c) r4
            a5.e r5 = new a5.e
            r6 = 6
            r5.<init>(r6, r9)
            r0.f6569a = r9
            r0.f6570b = r3
            r0.f6571c = r1
            r0.f6572d = r8
            r0.f6575g = r2
            java.lang.Object r4 = n3.n.R(r4, r5, r0)
            z8.a r5 = z8.a.f15774a
            if (r4 != r5) goto L64
            return r5
        L64:
            int r1 = r1 + r2
            goto L45
        L66:
            t8.z r8 = t8.z.f12851a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a(x1.c, a9.c):java.lang.Object");
    }
}
