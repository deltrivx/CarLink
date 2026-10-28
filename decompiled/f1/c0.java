package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4899b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h9.a aVar) {
        super(aVar);
        w0 w0Var = w0.f5187f;
        this.f4900c = w0Var;
    }

    public c0(h9.k kVar) {
        super(new b3.i0(10));
        this.f4900c = new d0(kVar);
    }

    @Override // f1.t1
    public final u1 a(Object obj) {
        switch (this.f4899b) {
            case 0:
                return new u1(this, obj, obj == null, null, true);
            default:
                return new u1(this, obj, obj == null, (q2) this.f4900c, true);
        }
    }

    @Override // f1.t1
    public z2 b() {
        switch (this.f4899b) {
            case 0:
                return (d0) this.f4900c;
            default:
                return super.b();
        }
    }
}
