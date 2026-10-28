package h0;

import f1.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6395e;

    public /* synthetic */ u(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f6391a = i11;
        this.f6394d = obj;
        this.f6392b = obj2;
        this.f6393c = i7;
        this.f6395e = obj3;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f6391a = i10;
        this.f6394d = obj;
        this.f6392b = obj2;
        this.f6395e = obj3;
        this.f6393c = i7;
    }

    public /* synthetic */ u(r1.p pVar, t1 t1Var, n1.c cVar, int i7) {
        this.f6391a = 7;
        n1.c cVar2 = q0.i.f10558a;
        this.f6394d = pVar;
        this.f6392b = t1Var;
        this.f6395e = cVar;
        this.f6393c = i7;
    }

    public /* synthetic */ u(r1.p pVar, y.c cVar, h9.k kVar, int i7, int i10) {
        this.f6391a = 9;
        this.f6394d = pVar;
        this.f6392b = cVar;
        this.f6395e = kVar;
        this.f6393c = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f6391a;
        int i10 = this.f6393c;
        Object obj3 = this.f6395e;
        Object obj4 = this.f6392b;
        t8.z zVar = t8.z.f12851a;
        Object obj5 = this.f6394d;
        switch (i7) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(1);
                z.d((v) obj5, this.f6392b, this.f6393c, this.f6395e, (f1.s) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((q0) obj5).d(obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(3079);
                o9.e0.d((String) obj5, (n9.d) obj4, this.f6393c, (h9.k) obj3, (f1.s) obj, iY2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((n1.c) obj5).g(obj4, obj3, (f1.s) obj, f1.b.y(i10) | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((o1.d) obj5).d(obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iY3 = f1.b.y(385);
                ((o7.g) obj5).b((t8.j) obj4, this.f6393c, (h9.k) obj3, (f1.s) obj, iY3);
                break;
            case 6:
                ((Integer) obj2).getClass();
                q0.k.c((s0.b) obj5, (s0.e) obj4, (h9.a) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
            case 7:
                n1.c cVar = q0.i.f10558a;
                ((Integer) obj2).getClass();
                n3.r.b((r1.p) obj5, (t1) obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                w0.y0.a((w0.q) obj5, (r1.d) obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                y.g.b((r1.p) obj5, (y.c) obj4, (h9.k) obj3, (f1.s) obj, f1.b.y(1), this.f6393c);
                break;
            default:
                ((Integer) obj2).getClass();
                y.g.a((y.c) obj5, (r1.p) obj4, (n1.c) obj3, (f1.s) obj, f1.b.y(i10 | 1));
                break;
        }
        return zVar;
    }
}
