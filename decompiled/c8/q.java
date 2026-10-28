package c8;

import b8.n2;
import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2538f;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f2533a = i10;
        this.f2535c = obj;
        this.f2536d = obj2;
        this.f2537e = obj3;
        this.f2538f = obj4;
        this.f2534b = i7;
    }

    public /* synthetic */ q(r1.p pVar, w0.z zVar, h9.k kVar, n1.c cVar, int i7) {
        this.f2533a = 2;
        this.f2535c = pVar;
        this.f2536d = zVar;
        this.f2538f = kVar;
        this.f2537e = cVar;
        this.f2534b = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2533a) {
            case 0:
                ((Integer) obj2).intValue();
                ((f0) this.f2535c).d((n2) this.f2536d, (h9.a) this.f2537e, (h9.k) this.f2538f, (f1.s) obj, f1.b.y(this.f2534b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((n1.c) this.f2535c).h((s0.b) this.f2536d, this.f2537e, this.f2538f, (f1.s) obj, f1.b.y(this.f2534b) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                y0.c((r1.p) this.f2535c, (w0.z) this.f2536d, (h9.k) this.f2538f, (n1.c) this.f2537e, (f1.s) obj, f1.b.y(this.f2534b | 1));
                break;
        }
        return t8.z.f12851a;
    }
}
