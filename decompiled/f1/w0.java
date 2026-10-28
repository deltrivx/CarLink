package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements y8.g, q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w0 f5183b = new w0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f5184c = new w0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f5185d = new w0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w0 f5186e = new w0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f5187f = new w0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5188a;

    public /* synthetic */ w0(int i7) {
        this.f5188a = i7;
    }

    public static final void b(w0 w0Var) {
        fc.h0 h0Var;
        i1.e eVar;
        l1.b bVar;
        fc.h0 h0Var2 = c2.f4901y;
        do {
            h0Var = c2.f4901y;
            eVar = (i1.e) h0Var.getValue();
            bVar = (l1.b) eVar;
            k1.c cVarB = bVar.f7970c;
            l1.a aVar = (l1.a) cVarB.get(w0Var);
            if (aVar != null) {
                Object obj = aVar.f7965a;
                Object obj2 = aVar.f7966b;
                k1.m mVar = cVarB.f7150a;
                k1.m mVarV = mVar.v(w0Var != null ? w0Var.hashCode() : 0, 0, w0Var);
                if (mVar != mVarV) {
                    cVarB = mVarV == null ? k1.c.f7149c : new k1.c(mVarV, cVarB.f7151b - 1);
                }
                m1.b bVar2 = m1.b.f8399a;
                if (obj != bVar2) {
                    Object obj3 = cVarB.get(obj);
                    i9.l.b(obj3);
                    cVarB = cVarB.b(obj, new l1.a(((l1.a) obj3).f7965a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarB.get(obj2);
                    i9.l.b(obj4);
                    cVarB = cVarB.b(obj2, new l1.a(obj, ((l1.a) obj4).f7966b));
                }
                Object obj5 = obj != bVar2 ? bVar.f7968a : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f7969b;
                }
                bVar = new l1.b(obj5, obj, cVarB);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!h0Var.f(eVar, bVar));
    }

    @Override // f1.q2
    public boolean a(Object obj, Object obj2) {
        switch (this.f5188a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return i9.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f5188a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
