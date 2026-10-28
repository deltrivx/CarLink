package s9;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Method method, Object obj) {
        super(method, false, 4);
        i9.l.e(method, "method");
        this.f12687g = obj;
    }

    @Override // s9.q, s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        return c(this.f12687g, objArr);
    }
}
