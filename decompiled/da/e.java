package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f3868a;

    public e(Annotation annotation) {
        i9.l.e(annotation, "annotation");
        this.f3868a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        na.a pVar;
        Annotation annotation = this.f3868a;
        Method[] declaredMethods = g5.a.L(g5.a.G(annotation)).getDeclaredMethods();
        i9.l.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            i9.l.d(objInvoke, "invoke(...)");
            wa.e eVarE = wa.e.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = d.f3860a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(eVarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                pVar = new g(eVarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                pVar = new h(eVarE, (Object[]) objInvoke);
            } else {
                pVar = objInvoke instanceof Class ? new p(eVarE, (Class) objInvoke) : new v(eVarE, objInvoke);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3868a == ((e) obj).f3868a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3868a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f3868a;
    }
}
