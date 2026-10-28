package x;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f14515a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc.c f14516b = new lc.c();

    public static final void a(z0 z0Var, x0 x0Var) {
        AtomicReference atomicReference = z0Var.f14515a;
        while (true) {
            x0 x0Var2 = (x0) atomicReference.get();
            if (x0Var2 != null && x0Var.f14498a.compareTo(x0Var2.f14498a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(x0Var2, x0Var)) {
                    if (x0Var2 != null) {
                        x0Var2.f14499b.a(new w0(0, "Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == x0Var2);
        }
    }
}
