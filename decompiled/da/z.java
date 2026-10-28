package da;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 implements na.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3891a;

    public z(Class cls) {
        this.f3891a = cls;
    }

    @Override // da.b0
    public final Type b() {
        return this.f3891a;
    }

    @Override // na.b
    public final Collection getAnnotations() {
        return u8.w.f13122a;
    }
}
