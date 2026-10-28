package r9;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n3.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11680c;

    public g(Class cls) {
        i9.l.e(cls, "jClass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        i9.l.d(declaredMethods, "getDeclaredMethods(...)");
        this.f11680c = u8.l.K0(declaredMethods, new f(0));
    }

    @Override // n3.n
    public final String P() {
        return u8.p.q0(this.f11680c, "", "<init>(", ")V", b.f11653d, 24);
    }
}
