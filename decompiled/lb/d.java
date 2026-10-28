package lb;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f8306b;

    public /* synthetic */ d(h hVar, int i7) {
        this.f8305a = i7;
        this.f8306b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 java.lang.Object, still in use, count: 2, list:
          (r2v8 java.lang.Object) from 0x03a6: PHI (r2 I:??) = (r2v5 java.lang.Object), (r2v8 java.lang.Object) binds: [B:140:0x03a5, B:160:0x03a6] A[DONT_GENERATE, DONT_INLINE]
          (r2v8 java.lang.Object) from 0x0394: CHECK_CAST (ra.n) (r2v8 java.lang.Object)
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
    @Override // h9.a
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.d.invoke():java.lang.Object");
    }
}
