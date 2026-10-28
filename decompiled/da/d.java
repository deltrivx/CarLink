package da;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f3861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f3862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f3863d;

    static {
        i9.z zVar = i9.y.f6689a;
        int i7 = 0;
        List<o9.c> listJ = n3.l.J(zVar.b(Boolean.TYPE), zVar.b(Byte.TYPE), zVar.b(Character.TYPE), zVar.b(Double.TYPE), zVar.b(Float.TYPE), zVar.b(Integer.TYPE), zVar.b(Long.TYPE), zVar.b(Short.TYPE));
        f3860a = listJ;
        ArrayList arrayList = new ArrayList(u8.q.a0(listJ, 10));
        for (o9.c cVar : listJ) {
            arrayList.add(new t8.j(g5.a.M(cVar), g5.a.N(cVar)));
        }
        f3861b = u8.b0.Z0(arrayList);
        List<o9.c> list = f3860a;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
        for (o9.c cVar2 : list) {
            arrayList2.add(new t8.j(g5.a.N(cVar2), g5.a.M(cVar2)));
        }
        f3862c = u8.b0.Z0(arrayList2);
        List listJ2 = n3.l.J(h9.a.class, h9.k.class, h9.n.class, h9.o.class, h9.p.class, h9.q.class, h9.r.class, h9.s.class, h9.t.class, h9.u.class, h9.b.class, h9.c.class, r9.e.class, h9.d.class, h9.e.class, h9.f.class, h9.g.class, h9.h.class, h9.i.class, h9.j.class, h9.l.class, h9.m.class, r9.e.class);
        ArrayList arrayList3 = new ArrayList(u8.q.a0(listJ2, 10));
        for (Object obj : listJ2) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                n3.l.Y();
                throw null;
            }
            arrayList3.add(new t8.j((Class) obj, Integer.valueOf(i7)));
            i7 = i10;
        }
        f3863d = u8.b0.Z0(arrayList3);
    }

    public static final wa.b a(Class cls) {
        i9.l.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            wa.c cVar = new wa.c(cls.getName());
            return new wa.b(cVar.b(), n4.h.h0(cVar.f14240a.f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(wa.e.e(cls.getSimpleName()));
        }
        wa.c cVar2 = new wa.c(cls.getName());
        return new wa.b(cVar2.b(), cVar2.f14240a.f());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        i9.l.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return zb.q.m0(cls.getName(), '.', '/');
            }
            return "L" + zb.q.m0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        i9.l.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return u8.w.f13122a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return yb.l.U(new yb.i(yb.l.R(type, c.f3854b), c.f3855c, yb.o.f15282i));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        i9.l.d(actualTypeArguments, "getActualTypeArguments(...)");
        return u8.l.L0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        i9.l.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        i9.l.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
