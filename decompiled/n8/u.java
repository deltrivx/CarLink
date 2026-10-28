package n8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements a5.g, androidx.lifecycle.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.r f8946b;

    public u() {
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(this, true);
        this.f8945a = vVar;
        c5.a aVar = new c5.a(this, new a5.e(0, this));
        a5.f fVar = new a5.f(aVar);
        this.f8946b = fVar.f46b;
        aVar.a();
        fVar.a(null);
        vVar.c("setCurrentState");
        vVar.e(androidx.lifecycle.o.f1060e);
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return this.f8946b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        return this.f8945a;
    }
}
