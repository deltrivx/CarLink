package c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f1713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(l0 l0Var, int i7) {
        super(1);
        this.f1712a = i7;
        this.f1713b = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x005a: PHI (r1 I:??) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:22:0x0059, B:32:0x005a] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x0052: CHECK_CAST (c.m0) (r1v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // h9.k
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f1712a
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            c.b r4 = (c.b) r4
            java.lang.String r0 = "backEvent"
            i9.l.e(r4, r0)
            c.l0 r4 = r3.f1713b
            c.m0 r0 = r4.f1755c
            if (r0 != 0) goto L31
            u8.k r4 = r4.f1754b
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L1c:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.previous()
            r1 = r0
            c.m0 r1 = (c.m0) r1
            boolean r1 = r1.f1762a
            if (r1 == 0) goto L1c
            goto L2f
        L2e:
            r0 = 0
        L2f:
            c.m0 r0 = (c.m0) r0
        L31:
            t8.z r4 = t8.z.f12851a
            return r4
        L34:
            c.b r4 = (c.b) r4
            java.lang.String r0 = "backEvent"
            i9.l.e(r4, r0)
            c.l0 r4 = r3.f1713b
            u8.k r0 = r4.f1754b
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L47:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.previous()
            r2 = r1
            c.m0 r2 = (c.m0) r2
            boolean r2 = r2.f1762a
            if (r2 == 0) goto L47
            goto L5a
        L59:
            r1 = 0
        L5a:
            c.m0 r1 = (c.m0) r1
            c.m0 r0 = r4.f1755c
            if (r0 == 0) goto L63
            r4.b()
        L63:
            r4.f1755c = r1
            t8.z r4 = t8.z.f12851a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e0.invoke(java.lang.Object):java.lang.Object");
    }
}
