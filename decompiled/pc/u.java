package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f10509c = new u(v.f10512a);

    @Override // pc.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        i9.l.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        t tVar = (t) obj;
        i9.l.e(tVar, "builder");
        float fI = aVar.i(this.f10498b, i7);
        tVar.b(tVar.d() + 1);
        float[] fArr = tVar.f10506a;
        int i10 = tVar.f10507b;
        tVar.f10507b = i10 + 1;
        fArr[i10] = fI;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        i9.l.e(fArr, "<this>");
        t tVar = new t();
        tVar.f10506a = fArr;
        tVar.f10507b = fArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // pc.r0
    public final Object n() {
        return new float[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        float[] fArr = (float[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(fArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            float f10 = fArr[i10];
            q0 q0Var = this.f10498b;
            i9.l.e(q0Var, "descriptor");
            sVar.h(q0Var, i10);
            sVar.i(f10);
        }
    }
}
