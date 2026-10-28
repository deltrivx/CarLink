package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f10425c = new b0(c0.f10429a);

    @Override // pc.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        i9.l.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        a0 a0Var = (a0) obj;
        i9.l.e(a0Var, "builder");
        int iU = aVar.u(this.f10498b, i7);
        a0Var.b(a0Var.d() + 1);
        int[] iArr = a0Var.f10421a;
        int i10 = a0Var.f10422b;
        a0Var.f10422b = i10 + 1;
        iArr[i10] = iU;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        i9.l.e(iArr, "<this>");
        a0 a0Var = new a0();
        a0Var.f10421a = iArr;
        a0Var.f10422b = iArr.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new int[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        int[] iArr = (int[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(iArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.m(i10, iArr[i10], this.f10498b);
        }
    }
}
