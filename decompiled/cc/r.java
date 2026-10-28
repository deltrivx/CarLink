package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2661b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2662a;

    public r(Throwable th, boolean z10) {
        this.f2662a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2662a + ']';
    }
}
