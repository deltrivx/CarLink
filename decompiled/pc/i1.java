package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f10460c = new i1(j1.f10462a);

    @Override // pc.a
    public final int h(Object obj) {
        short[] sArr = ((t8.y) obj).f12850a;
        i9.l.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        h1 h1Var = (h1) obj;
        i9.l.e(h1Var, "builder");
        short sY = aVar.k(this.f10498b, i7).y();
        h1Var.b(h1Var.d() + 1);
        short[] sArr = h1Var.f10454a;
        int i10 = h1Var.f10455b;
        h1Var.f10455b = i10 + 1;
        sArr[i10] = sY;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        short[] sArr = ((t8.y) obj).f12850a;
        i9.l.e(sArr, "$this$toBuilder");
        h1 h1Var = new h1();
        h1Var.f10454a = sArr;
        h1Var.f10455b = sArr.length;
        h1Var.b(10);
        return h1Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new t8.y(new short[0]);
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        short[] sArr = ((t8.y) obj).f12850a;
        i9.l.e(sVar, "encoder");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.k(this.f10498b, i10).q(sArr[i10]);
        }
    }
}
