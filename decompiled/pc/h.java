package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f10452c = new h(i.f10456a);

    @Override // pc.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        i9.l.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        g gVar = (g) obj;
        i9.l.e(gVar, "builder");
        byte bE = aVar.e(this.f10498b, i7);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.f10446a;
        int i10 = gVar.f10447b;
        gVar.f10447b = i10 + 1;
        bArr[i10] = bE;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        i9.l.e(bArr, "<this>");
        g gVar = new g();
        gVar.f10446a = bArr;
        gVar.f10447b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // pc.r0
    public final Object n() {
        return new byte[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        byte[] bArr = (byte[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(bArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            byte b10 = bArr[i10];
            q0 q0Var = this.f10498b;
            i9.l.e(q0Var, "descriptor");
            sVar.h(q0Var, i10);
            sVar.d(b10);
        }
    }
}
