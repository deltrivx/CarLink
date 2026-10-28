package s9;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12696d;

    public x(Method method, Object obj) {
        super(method, u8.w.f13122a);
        this.f12696d = obj;
    }

    @Override // s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        return this.f12697a.invoke(this.f12696d, Arrays.copyOf(objArr, objArr.length));
    }
}
