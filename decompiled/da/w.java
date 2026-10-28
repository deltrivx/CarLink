package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import x9.c1;
import x9.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends s implements na.b, na.c {
    @Override // na.b
    public final e a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        Member memberB = b();
        i9.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return i2.c.x(declaredAnnotations, cVar);
        }
        return null;
    }

    public abstract Member b();

    public final wa.e c() {
        String name = b().getName();
        return name != null ? wa.e.e(name) : wa.g.f14251a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z10) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        b0 iVar;
        b0 zVar;
        String str;
        boolean z11;
        u0.k kVar;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        b bVar = b.f3852a;
        Member memberB = b();
        i9.l.e(memberB, "member");
        u0.k kVar2 = b.f3853b;
        Object obj = null;
        if (kVar2 == null) {
            synchronized (bVar) {
                kVar2 = b.f3853b;
                if (kVar2 == null) {
                    Class<?> cls = memberB.getClass();
                    try {
                        kVar = new u0.k(4, cls.getMethod("getParameters", null), d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        kVar = new u0.k(4, obj, obj);
                    }
                    b.f3853b = kVar;
                    kVar2 = kVar;
                }
            }
        }
        Method method2 = (Method) kVar2.f12990b;
        if (method2 == null || (method = (Method) kVar2.f12991c) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberB, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object objInvoke2 = method.invoke(obj2, null);
                i9.l.c(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Type type = typeArr[i7];
            i9.l.e(type, "type");
            boolean z12 = type instanceof Class;
            if (z12) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    zVar = new z(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z12 && ((Class) type).isArray())) {
                        iVar = new i(type);
                    } else {
                        iVar = type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    iVar = new i(type);
                } else {
                    iVar = new i(type);
                }
                zVar = iVar;
            }
            if (arrayList != null) {
                str = (String) u8.p.n0(i7 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i7 + '+' + size + " (name=" + c() + " type=" + zVar + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z10) {
                z11 = true;
                if (i7 != typeArr.length - 1) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            arrayList2.add(new d0(zVar, annotationArr[i7], str, z11));
        }
        return arrayList2;
    }

    public final n.a e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return c1.f14693d;
        }
        if (Modifier.isPrivate(modifiers)) {
            return z0.f14756d;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? ba.c.f1678d : ba.b.f1677d;
        }
        return ba.a.f1676d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && i9.l.a(b(), ((w) obj).b());
    }

    @Override // na.b
    public final Collection getAnnotations() {
        Member memberB = b();
        i9.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? i2.c.z(declaredAnnotations) : u8.w.f13122a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
