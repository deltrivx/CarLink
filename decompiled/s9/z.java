package s9;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f12699c;

    public z(Method method, List list) {
        this.f12697a = method;
        this.f12698b = list;
        Class<?> returnType = method.getReturnType();
        i9.l.d(returnType, "getReturnType(...)");
        this.f12699c = returnType;
    }

    @Override // s9.g
    public final Type p() {
        return this.f12699c;
    }

    @Override // s9.g
    public final List q() {
        return this.f12698b;
    }

    @Override // s9.g
    public final /* bridge */ /* synthetic */ Member r() {
        return null;
    }

    @Override // s9.g
    public final boolean s() {
        return false;
    }
}
