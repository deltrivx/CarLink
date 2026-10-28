package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f10470c = new l(m.f10474a);

    @Override // pc.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        i9.l.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        k kVar = (k) obj;
        i9.l.e(kVar, "builder");
        char cV = aVar.v(this.f10498b, i7);
        kVar.b(kVar.d() + 1);
        char[] cArr = kVar.f10464a;
        int i10 = kVar.f10465b;
        kVar.f10465b = i10 + 1;
        cArr[i10] = cV;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        i9.l.e(cArr, "<this>");
        k kVar = new k();
        kVar.f10464a = cArr;
        kVar.f10465b = cArr.length;
        kVar.b(10);
        return kVar;
    }

    @Override // pc.r0
    public final Object n() {
        return new char[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        char[] cArr = (char[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(cArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            char c10 = cArr[i10];
            q0 q0Var = this.f10498b;
            i9.l.e(q0Var, "descriptor");
            sVar.h(q0Var, i10);
            sVar.e(c10);
        }
    }
}
