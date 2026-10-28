package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8266c;

    public /* synthetic */ w(int i7, int i10, Object obj) {
        this.f8264a = i10;
        this.f8266c = obj;
        this.f8265b = i7;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8264a) {
            case 0:
                ((h9.k) this.f8266c).invoke(Integer.valueOf(this.f8265b));
                return t8.z.f12851a;
            default:
                x9.c cVar = (x9.c) this.f8266c;
                Object obj = cVar.X().get(this.f8265b);
                i9.l.d(obj, "get(...)");
                return (x9.i0) obj;
        }
    }
}
