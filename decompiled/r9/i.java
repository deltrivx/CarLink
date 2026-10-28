package r9;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n3.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f11692c;

    public i(Method method) {
        i9.l.e(method, "method");
        this.f11692c = method;
    }

    @Override // n3.n
    public final String P() {
        return n3.l.k(this.f11692c);
    }
}
