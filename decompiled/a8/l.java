package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f166d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l(i9.x xVar, h9.o oVar, m5.l lVar) {
        this.f163a = 4;
        this.f165c = xVar;
        this.f164b = (i9.j) oVar;
        this.f166d = lVar;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7) {
        this.f163a = i7;
        this.f165c = obj;
        this.f164b = obj2;
        this.f166d = obj3;
    }

    public /* synthetic */ l(Object obj, Object obj2, t8.e eVar, int i7, int i10) {
        this.f163a = i10;
        this.f165c = obj;
        this.f164b = obj2;
        this.f166d = eVar;
    }

    public /* synthetic */ l(t8.j jVar, h9.k kVar, f1.b1 b1Var) {
        this.f163a = 5;
        this.f165c = jVar;
        this.f166d = kVar;
        this.f164b = b1Var;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [h9.o, i9.j] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f163a;
        t8.z zVar = t8.z.f12851a;
        Object obj3 = this.f166d;
        Object obj4 = this.f164b;
        Object obj5 = this.f165c;
        switch (i7) {
            case 0:
                ((Integer) obj2).getClass();
                ((g0) obj5).d((String) obj4, (h9.k) obj3, (f1.s) obj, f1.b.y(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((x0) obj5).d((String) obj4, (h9.n) obj3, (f1.s) obj, f1.b.y(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((x0) obj5).e((n8.q) obj4, (h9.n) obj3, (f1.s) obj, f1.b.y(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                l0.q0.f((r1.p) obj5, (w0.t1) obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(385));
                break;
            case 4:
                ((Float) obj2).getClass();
                g5.a.h((i9.x) obj5, (i9.j) obj4, (m5.l) obj3, x1.b.d(((k2.v) obj).f7280c));
                break;
            case 5:
                Object obj6 = ((t8.j) obj5).f12830a;
                h9.k kVar = (h9.k) obj3;
                f1.b1 b1Var = (f1.b1) obj4;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                i9.l.e(str, "fileName");
                if (str.length() == 0) {
                    t8.o oVar = n8.d.f8898a;
                    n8.d.h((String) obj6);
                } else {
                    t8.o oVar2 = n8.d.f8898a;
                    n8.d.g((String) obj6, str);
                }
                kVar.invoke(str);
                b1Var.setValue(bool);
                break;
            case 6:
                z.f0 f0Var = (z.f0) obj5;
                i9.w wVar = (i9.w) obj4;
                l2.d dVar = (l2.d) obj3;
                k2.v vVar = (k2.v) obj;
                x1.b bVar = (x1.b) obj2;
                long jT = q2.f.u(f0Var).t(0L);
                if (!x1.b.b(jT, wVar.f6687a)) {
                    f0Var.f15374x = x1.b.h(f0Var.f15374x, x1.b.g(jT, wVar.f6687a));
                }
                wVar.f6687a = jT;
                g5.a.l(dVar, vVar, f0Var.f15374x);
                ec.h hVar = f0Var.f15371u;
                if (hVar != null) {
                    hVar.x(new z.l(bVar.f14521a));
                }
                break;
            default:
                i9.u uVar = (i9.u) obj5;
                z.t1 t1Var = (z.t1) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = t1Var.h(t1Var.d(fFloatValue - uVar.f6685a));
                z.t1 t1Var2 = ((z.r1) obj3).f15482a;
                uVar.f6685a += t1Var.d(t1Var.g(t1Var2.c(t1Var2.k, jH, 1)));
                break;
        }
        return zVar;
    }
}
