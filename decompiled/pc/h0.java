package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f10453c = new h0(i0.f10458a);

    @Override // pc.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        i9.l.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        g0 g0Var = (g0) obj;
        i9.l.e(g0Var, "builder");
        long jA = aVar.a(this.f10498b, i7);
        g0Var.b(g0Var.d() + 1);
        long[] jArr = g0Var.f10448a;
        int i10 = g0Var.f10449b;
        g0Var.f10449b = i10 + 1;
        jArr[i10] = jA;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        i9.l.e(jArr, "<this>");
        g0 g0Var = new g0();
        g0Var.f10448a = jArr;
        g0Var.f10449b = jArr.length;
        g0Var.b(10);
        return g0Var;
    }

    @Override // pc.r0
    public final Object n() {
        return new long[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        long[] jArr = (long[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(jArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            long j5 = jArr[i10];
            q0 q0Var = this.f10498b;
            i9.l.e(q0Var, "descriptor");
            sVar.h(q0Var, i10);
            sVar.n(j5);
        }
    }
}
