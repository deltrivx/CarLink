package cc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient h1 f2600a;

    public b1(String str, Throwable th, h1 h1Var) {
        super(str);
        this.f2600a = h1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return i9.l.a(b1Var.getMessage(), getMessage()) && i9.l.a(b1Var.f2600a, this.f2600a) && i9.l.a(b1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        i9.l.b(message);
        int iHashCode = (this.f2600a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f2600a;
    }
}
