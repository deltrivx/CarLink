package gc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f6211a;

    public a(b0.f fVar) {
        super("Flow was aborted, no more elements needed");
        this.f6211a = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
