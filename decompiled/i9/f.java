package i9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements o9.c, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6677b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6678a;

    static {
        int i7 = 0;
        List listJ = n3.l.J(h9.a.class, h9.k.class, h9.n.class, h9.o.class, h9.p.class, h9.q.class, h9.r.class, h9.s.class, h9.t.class, h9.u.class, h9.b.class, h9.c.class, r9.e.class, h9.d.class, h9.e.class, h9.f.class, h9.g.class, h9.h.class, h9.i.class, h9.j.class, h9.l.class, h9.m.class, r9.e.class);
        ArrayList arrayList = new ArrayList(u8.q.a0(listJ, 10));
        for (Object obj : listJ) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                n3.l.Y();
                throw null;
            }
            arrayList.add(new t8.j((Class) obj, Integer.valueOf(i7)));
            i7 = i10;
        }
        f6677b = u8.b0.Z0(arrayList);
    }

    public f(Class cls) {
        l.e(cls, "jClass");
        this.f6678a = cls;
    }

    @Override // i9.e
    public final Class a() {
        return this.f6678a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && g5.a.M(this).equals(g5.a.M((o9.c) obj));
    }

    @Override // o9.c
    public final int hashCode() {
        return g5.a.M(this).hashCode();
    }

    @Override // o9.c
    public final boolean j() {
        throw new cc.a0();
    }

    @Override // o9.c
    public final String k() {
        String strE;
        Class cls = this.f6678a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strE2 = b0.e(cls.getName());
            return strE2 == null ? cls.getCanonicalName() : strE2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strE = b0.e(componentType.getName())) != null) {
            strConcat = strE.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // o9.c
    public final String l() {
        String strG;
        Class cls = this.f6678a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strG2 = b0.g(cls.getName());
                return strG2 == null ? cls.getSimpleName() : strG2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strG = b0.g(componentType.getName())) != null) {
                strConcat = strG.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return zb.j.M0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return zb.j.L0(simpleName, '$', simpleName);
        }
        return zb.j.M0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // o9.c
    public final boolean m(Object obj) {
        Class clsM = this.f6678a;
        l.e(clsM, "jClass");
        Map map = f6677b;
        l.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsM);
        if (num != null) {
            return b0.f(num.intValue(), obj);
        }
        if (clsM.isPrimitive()) {
            clsM = g5.a.M(g5.a.O(clsM));
        }
        return clsM.isInstance(obj);
    }

    public final String toString() {
        return this.f6678a + " (Kotlin reflection is not available)";
    }
}
