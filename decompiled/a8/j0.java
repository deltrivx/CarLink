package a8;

import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f149b;

    public /* synthetic */ j0(h9.k kVar, int i7) {
        this.f148a = i7;
        this.f149b = kVar;
    }

    public /* synthetic */ j0(h9.k kVar, h2 h2Var, int i7) {
        this.f148a = i7;
        this.f149b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:34:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x020e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0211  */
    /* JADX WARN: Code duplicated, block: B:74:0x0262  */
    /* JADX WARN: Code duplicated, block: B:75:0x0265  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 java.lang.Object, still in use, count: 2, list:
          (r6v4 java.lang.Object) from 0x025e: PHI (r6 I:??) = (r6v1 java.lang.Object), (r6v4 java.lang.Object) binds: [B:71:0x025d, B:90:0x025e] A[DONT_GENERATE, DONT_INLINE]
          (r6v4 java.lang.Object) from 0x0256: CHECK_CAST (a8.i0) (r6v4 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.j0.invoke(java.lang.Object):java.lang.Object");
    }
}
