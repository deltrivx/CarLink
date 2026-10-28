package jc;

import cc.u;
import cc.u0;
import hc.t;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7117c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f7118d;

    static {
        l lVar = l.f7131c;
        int i7 = t.f6539a;
        if (64 >= i7) {
            i7 = 64;
        }
        f7118d = lVar.w(hc.a.j("kotlinx.coroutines.io.parallelism", i7, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(y8.i.f15108a, runnable);
    }

    @Override // cc.u
    public final void g(y8.h hVar, Runnable runnable) {
        f7118d.g(hVar, runnable);
    }

    @Override // cc.u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // cc.u
    public final void u(y8.h hVar, Runnable runnable) {
        f7118d.u(hVar, runnable);
    }
}
