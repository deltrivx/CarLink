package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 extends i9.s implements o9.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2075h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i7, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f2075h = i10;
    }

    @Override // o9.u
    public final o9.q b() {
        return ((o9.r) h()).b();
    }

    @Override // i9.d
    public final o9.b e() {
        return i9.y.f6689a.f(this);
    }

    @Override // o9.r
    public final Object get() {
        switch (this.f2075h) {
            case 0:
                return ((f1.w2) this.f6672b).getValue();
            case 1:
                return ((f1.w2) this.f6672b).getValue();
            case 2:
                return ((f1.w2) this.f6672b).getValue();
            default:
                return this.f6672b.getClass().getSimpleName();
        }
    }

    @Override // h9.a
    public final Object invoke() {
        return get();
    }
}
