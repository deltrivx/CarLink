package r9;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n3.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f11715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f11716h;

    public m(Method method, Method method2) {
        i9.l.e(method, "getterMethod");
        this.f11715g = method;
        this.f11716h = method2;
    }

    @Override // n3.r
    public final String d() {
        return n3.l.k(this.f11715g);
    }
}
