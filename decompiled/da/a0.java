package da;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3851a;

    public a0(Object obj) {
        i9.l.e(obj, "recordComponent");
        this.f3851a = obj;
    }

    @Override // da.w
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f3851a;
        i9.l.e(obj, "recordComponent");
        android.support.v4.media.session.r rVar = a.a.f1a;
        Method method = null;
        if (rVar == null) {
            Class<?> cls = obj.getClass();
            try {
                rVar = new android.support.v4.media.session.r(4, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                rVar = new android.support.v4.media.session.r(4, method, method);
            }
            a.a.f1a = rVar;
        }
        Method method2 = (Method) rVar.f605c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final na.d f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f3851a;
        i9.l.e(obj, "recordComponent");
        android.support.v4.media.session.r rVar = a.a.f1a;
        Class cls = null;
        if (rVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                rVar = new android.support.v4.media.session.r(4, cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                rVar = new android.support.v4.media.session.r(4, cls, cls);
            }
            a.a.f1a = rVar;
        }
        Method method = (Method) rVar.f604b;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
