package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f13735b = new b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f13736c = new b0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f13737d = new a0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f13738e = new a0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f13739f = new a0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f13740g = new a0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13741a;

    public /* synthetic */ b0(int i7) {
        this.f13741a = i7;
    }

    @Override // w0.j
    public long a(w wVar, int i7) {
        switch (this.f13741a) {
            case 0:
                String str = wVar.f13978f.f1408a.f1393a.f1353b;
                return b3.g0.b(l0.q0.q(str, i7), l0.q0.p(str, i7));
            default:
                return wVar.f13978f.j(i7);
        }
    }
}
