package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f10445c = new f1(g1.f10450a);

    @Override // pc.a
    public final int h(Object obj) {
        long[] jArr = ((t8.v) obj).f12847a;
        i9.l.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        e1 e1Var = (e1) obj;
        i9.l.e(e1Var, "builder");
        long jN = aVar.k(this.f10498b, i7).n();
        e1Var.b(e1Var.d() + 1);
        long[] jArr = e1Var.f10440a;
        int i10 = e1Var.f10441b;
        e1Var.f10441b = i10 + 1;
        jArr[i10] = jN;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        long[] jArr = ((t8.v) obj).f12847a;
        i9.l.e(jArr, "$this$toBuilder");
        e1 e1Var = new e1();
        e1Var.f10440a = jArr;
        e1Var.f10441b = jArr.length;
        e1Var.b(10);
        return e1Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new t8.v(new long[0]);
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        long[] jArr = ((t8.v) obj).f12847a;
        i9.l.e(sVar, "encoder");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.k(this.f10498b, i10).n(jArr[i10]);
        }
    }
}
