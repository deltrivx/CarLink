package cc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends y8.a implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f2636b = new k1(v.f2678b);

    @Override // cc.a1
    public final void a(CancellationException cancellationException) {
    }

    @Override // cc.a1
    public final boolean b() {
        return true;
    }

    @Override // cc.a1
    public final Object d(a9.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // cc.a1
    public final CancellationException j() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // cc.a1
    public final l0 o(boolean z10, boolean z11, d1 d1Var) {
        return l1.f2642a;
    }

    @Override // cc.a1
    public final o r(h1 h1Var) {
        return l1.f2642a;
    }

    @Override // cc.a1
    public final boolean start() {
        return false;
    }

    @Override // cc.a1
    public final l0 t(h9.k kVar) {
        return l1.f2642a;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
