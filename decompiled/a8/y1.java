package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f288c;

    public /* synthetic */ y1(f1.b1 b1Var, f1.b1 b1Var2, int i7) {
        this.f286a = i7;
        this.f287b = b1Var;
        this.f288c = b1Var2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f286a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f288c;
        f1.b1 b1Var2 = this.f287b;
        switch (i7) {
            case 0:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "option");
                b1Var2.setValue(j0Var.f8197b.b());
                b1Var.setValue(Boolean.FALSE);
                return zVar;
            case 1:
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "option");
                String strB = j0Var2.f8197b.b();
                int i10 = e8.b0.f4485e;
                b1Var2.setValue(strB);
                b1Var.setValue(Boolean.FALSE);
                return zVar;
            case 2:
                l8.j0 j0Var3 = (l8.j0) obj;
                i9.l.e(j0Var3, "option");
                b1Var2.setValue(j0Var3.f8197b.b());
                b1Var.setValue(Boolean.FALSE);
                return zVar;
            case 3:
                l8.j0 j0Var4 = (l8.j0) obj;
                i9.l.e(j0Var4, "it");
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(j0Var4);
                return zVar;
            default:
                i9.l.e(b1Var2, "$center$delegate");
                i9.l.e(b1Var, "$radius$delegate");
                long jG = x1.b.g(((x1.b) obj).f14521a, ((x1.b) b1Var2.getValue()).f14521a);
                float fAtan2 = (float) Math.atan2(x1.b.e(jG), x1.b.d(jG));
                float f10 = ((-(57.295776f * fAtan2)) + 360.0f) % 360.0f;
                float fMin = Math.min(((float) Math.sqrt((x1.b.e(jG) * x1.b.e(jG)) + (x1.b.d(jG) * x1.b.d(jG)))) / ((Number) b1Var.getValue()).floatValue(), 1.0f);
                float fFloatValue = ((Number) b1Var.getValue()).floatValue() * fMin;
                double d10 = fAtan2;
                long jH = x1.b.h(n3.r.a(((float) Math.cos(d10)) * fFloatValue, ((float) Math.sin(d10)) * fFloatValue), ((x1.b) b1Var2.getValue()).f14521a);
                try {
                    int i11 = y1.q.f14959n;
                    return new t8.j(new y1.q(n4.e.i(f10, fMin, 1.0f, 0.0f, 24)), new x1.b(jH));
                } catch (IllegalArgumentException unused) {
                    int i12 = y1.q.f14959n;
                    return new t8.j(new y1.q(n4.e.i(0.0f, 0.0f, 0.0f, 0.0f, 24)), new x1.b(jH));
                }
        }
    }
}
