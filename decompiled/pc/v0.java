package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f10514c = new v0(w0.f10515a);

    @Override // pc.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        i9.l.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        u0 u0Var = (u0) obj;
        i9.l.e(u0Var, "builder");
        short sF = aVar.f(this.f10498b, i7);
        u0Var.b(u0Var.d() + 1);
        short[] sArr = u0Var.f10510a;
        int i10 = u0Var.f10511b;
        u0Var.f10511b = i10 + 1;
        sArr[i10] = sF;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        i9.l.e(sArr, "<this>");
        u0 u0Var = new u0();
        u0Var.f10510a = sArr;
        u0Var.f10511b = sArr.length;
        u0Var.b(10);
        return u0Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new short[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        short[] sArr = (short[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(sArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            short s2 = sArr[i10];
            q0 q0Var = this.f10498b;
            i9.l.e(q0Var, "descriptor");
            sVar.h(q0Var, i10);
            sVar.q(s2);
        }
    }
}
