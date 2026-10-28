package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f10431c = new c1(d1.f10436a);

    @Override // pc.a
    public final int h(Object obj) {
        int[] iArr = ((t8.t) obj).f12845a;
        i9.l.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        b1 b1Var = (b1) obj;
        i9.l.e(b1Var, "builder");
        int iH = aVar.k(this.f10498b, i7).h();
        b1Var.b(b1Var.d() + 1);
        int[] iArr = b1Var.f10426a;
        int i10 = b1Var.f10427b;
        b1Var.f10427b = i10 + 1;
        iArr[i10] = iH;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        int[] iArr = ((t8.t) obj).f12845a;
        i9.l.e(iArr, "$this$toBuilder");
        b1 b1Var = new b1();
        b1Var.f10426a = iArr;
        b1Var.f10427b = iArr.length;
        b1Var.b(10);
        return b1Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new t8.t(new int[0]);
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        int[] iArr = ((t8.t) obj).f12845a;
        i9.l.e(sVar, "encoder");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.k(this.f10498b, i10).l(iArr[i10]);
        }
    }
}
