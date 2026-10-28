package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.r f11349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(boolean z10, android.support.v4.media.session.r rVar, String str) {
        super(0);
        this.f11348a = z10;
        this.f11349b = rVar;
        this.f11350c = str;
    }

    @Override // h9.a
    public final Object invoke() {
        if (this.f11348a) {
            android.support.v4.media.session.r rVar = this.f11349b;
            String str = this.f11350c;
            c5.a aVar = (c5.a) rVar.f604b;
            synchronized (aVar.f2427c) {
            }
        }
        return t8.z.f12851a;
    }
}
