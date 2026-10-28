package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s implements na.b, na.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3881a;

    public o(Class cls) {
        i9.l.e(cls, "klass");
        this.f3881a = cls;
    }

    @Override // na.b
    public final e a(wa.c cVar) {
        Annotation[] declaredAnnotations;
        i9.l.e(cVar, "fqName");
        Class cls = this.f3881a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i2.c.x(declaredAnnotations, cVar);
    }

    public final List b() {
        Field[] declaredFields = this.f3881a.getDeclaredFields();
        i9.l.d(declaredFields, "getDeclaredFields(...)");
        return yb.l.U(yb.l.S(new yb.h(u8.l.k0(declaredFields), false, l.f3878i), m.f3879i));
    }

    public final wa.c c() {
        return d.a(this.f3881a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.f3881a.getDeclaredMethods();
        i9.l.d(declaredMethods, "getDeclaredMethods(...)");
        return yb.l.U(yb.l.S(new yb.h(u8.l.k0(declaredMethods), true, new aa.a(5, this)), n.f3880i));
    }

    public final wa.e e() {
        Class cls = this.f3881a;
        if (!cls.isAnonymousClass()) {
            return wa.e.e(cls.getSimpleName());
        }
        String name = cls.getName();
        int iE0 = zb.j.E0(0, 6, name, ".");
        if (iE0 != -1) {
            name = name.substring(1 + iE0, name.length());
            i9.l.d(name, "substring(...)");
        }
        return wa.e.e(name);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return i9.l.a(this.f3881a, ((o) obj).f3881a);
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.f3881a;
        i9.l.e(cls, "clazz");
        a aVar = g5.a.f5918b;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 0);
            } catch (NoSuchMethodException unused) {
                aVar = new a(objArr, objArr, objArr, objArr, 0);
            }
            g5.a.f5918b = aVar;
        }
        Method method = (Method) aVar.f3850e;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new a0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f3881a;
        i9.l.e(cls, "clazz");
        a aVar = g5.a.f5918b;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 0);
            } catch (NoSuchMethodException unused) {
                aVar = new a(bool, bool, bool, bool, 0);
            }
            g5.a.f5918b = aVar;
        }
        Method method = (Method) aVar.f3849d;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // na.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f3881a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? u8.w.f13122a : i2.c.z(declaredAnnotations);
    }

    @Override // na.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f3881a.getTypeParameters();
        i9.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f3881a;
        i9.l.e(cls, "clazz");
        a aVar = g5.a.f5918b;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 0);
            } catch (NoSuchMethodException unused) {
                aVar = new a(bool, bool, bool, bool, 0);
            }
            g5.a.f5918b = aVar;
        }
        Method method = (Method) aVar.f3847b;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f3881a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f3881a;
    }
}
