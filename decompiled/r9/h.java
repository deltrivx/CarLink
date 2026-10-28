package r9;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n3.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Constructor f11688c;

    public h(Constructor constructor) {
        i9.l.e(constructor, "constructor");
        this.f11688c = constructor;
    }

    @Override // n3.n
    public final String P() {
        Class<?>[] parameterTypes = this.f11688c.getParameterTypes();
        i9.l.d(parameterTypes, "getParameterTypes(...)");
        return u8.l.F0(parameterTypes, "", "<init>(", ")V", b.f11654e, 24);
    }
}
