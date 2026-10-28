package cc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2643c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public m(l lVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + lVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }
}
