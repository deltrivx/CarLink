package s9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12689h;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, boolean z10, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        i9.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : u8.l.s0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f12688g = z10;
        this.f12689h = obj;
    }

    @Override // s9.q, s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        e2.g gVar = new e2.g(2);
        gVar.a(this.f12689h);
        gVar.b(objArr);
        ArrayList arrayList = gVar.f4168a;
        return c(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
