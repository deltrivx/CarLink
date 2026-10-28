package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements w1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10651a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f10652b;

    @Override // w1.k
    public final boolean a() {
        Boolean bool = f10652b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw ob.a.o("canFocus is read before it is written");
    }

    @Override // w1.k
    public final /* synthetic */ void b(q3.n nVar) {
    }

    @Override // w1.k
    public final void c(boolean z10) {
        f10652b = Boolean.valueOf(z10);
    }

    @Override // w1.k
    public final /* synthetic */ void d(q3.n nVar) {
    }
}
