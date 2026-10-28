package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f10525c = new z0(a1.f10423a);

    @Override // pc.a
    public final int h(Object obj) {
        byte[] bArr = ((t8.r) obj).f12843a;
        i9.l.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        y0 y0Var = (y0) obj;
        i9.l.e(y0Var, "builder");
        byte bX = aVar.k(this.f10498b, i7).x();
        y0Var.b(y0Var.d() + 1);
        byte[] bArr = y0Var.f10521a;
        int i10 = y0Var.f10522b;
        y0Var.f10522b = i10 + 1;
        bArr[i10] = bX;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        byte[] bArr = ((t8.r) obj).f12843a;
        i9.l.e(bArr, "$this$toBuilder");
        y0 y0Var = new y0();
        y0Var.f10521a = bArr;
        y0Var.f10522b = bArr.length;
        y0Var.b(10);
        return y0Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new t8.r(new byte[0]);
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        byte[] bArr = ((t8.r) obj).f12843a;
        i9.l.e(sVar, "encoder");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.k(this.f10498b, i10).d(bArr[i10]);
        }
    }
}
