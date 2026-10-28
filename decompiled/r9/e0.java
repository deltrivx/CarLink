package r9;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements i9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zb.i f11673a = new zb.i("<v#(\\d+)>");

    public static void b(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        boolean zA = i9.l.a(u8.p.t0(arrayList2), i9.g.class);
        List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i7 = 0; i7 < size; i7++) {
            Class cls = Integer.TYPE;
            i9.l.d(cls, "TYPE");
            arrayList.add(cls);
        }
        arrayList.add(z10 ? i9.g.class : Object.class);
    }

    public static Method o(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class clsT;
        Method methodO;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodR = r(cls, str, clsArr, cls2);
        if (methodR != null) {
            return methodR;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodO = o(superclass, str, clsArr, cls2, z10)) != null) {
            return methodO;
        }
        i9.b bVarH = i9.l.h(cls.getInterfaces());
        while (bVarH.hasNext()) {
            Class cls3 = (Class) bVarH.next();
            i9.l.b(cls3);
            Method methodO2 = o(cls3, str, clsArr, cls2, z10);
            if (methodO2 != null) {
                return methodO2;
            }
            if (z10 && (clsT = o9.e0.T(da.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodR2 = r(clsT, str, clsArr, cls2);
                if (methodR2 != null) {
                    return methodR2;
                }
            }
        }
        return null;
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (i9.l.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            i9.l.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (i9.l.a(method.getName(), str) && i9.l.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method c(String str, String str2, boolean z10) {
        i9.l.e(str, "name");
        i9.l.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(a());
        }
        u0.k kVarP = p(str2, true);
        b(arrayList, (ArrayList) kVarP.f12990b, false);
        Class clsI = i();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) kVarP.f12991c;
        i9.l.b(cls);
        return o(clsI, strConcat, clsArr, cls, z10);
    }

    public final Method d(String str, String str2) {
        Method methodO;
        i9.l.e(str, "name");
        i9.l.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        u0.k kVarP = p(str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) kVarP.f12990b).toArray(new Class[0]);
        Class cls = (Class) kVarP.f12991c;
        i9.l.b(cls);
        Method methodO2 = o(i(), str, clsArr, cls, false);
        if (methodO2 != null) {
            return methodO2;
        }
        if (!i().isInterface() || (methodO = o(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodO;
    }

    public abstract Collection e();

    public abstract Collection f(wa.e eVar);

    public abstract x9.k0 g(int i7);

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    public final List h(gb.o oVar, c0 c0Var) {
        r rVar;
        i9.l.e(oVar, "scope");
        d0 d0Var = new d0(17, this);
        Collection<x9.k> collectionI = g5.a.I(oVar, null, 3);
        ArrayList arrayList = new ArrayList();
        for (x9.k kVar : collectionI) {
            if (kVar instanceof x9.c) {
                x9.c cVar = (x9.c) kVar;
                if (i9.l.a(cVar.d(), x9.o.f14724h)) {
                    rVar = null;
                } else if ((cVar.f() != 2) == (c0Var == c0.f11666a)) {
                    rVar = (r) kVar.J(d0Var, t8.z.f12851a);
                } else {
                    rVar = null;
                }
            } else {
                rVar = null;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return u8.p.J0(arrayList);
    }

    public Class i() {
        Class clsA = a();
        List list = da.d.f3860a;
        i9.l.e(clsA, "<this>");
        Class cls = (Class) da.d.f3862c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection n(wa.e eVar);

    public final u0.k p(String str, boolean z10) {
        int iZ0;
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        while (str.charAt(i7) != ')') {
            int i10 = i7;
            while (str.charAt(i10) == '[') {
                i10++;
            }
            char cCharAt = str.charAt(i10);
            if (zb.j.s0("VZCBSIFJD", cCharAt)) {
                iZ0 = i10 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new cc.a0(2, "Unknown type prefix in the method signature: ".concat(str));
                }
                iZ0 = zb.j.z0(str, ';', i7, 4) + 1;
            }
            arrayList.add(q(str, i7, iZ0));
            i7 = iZ0;
        }
        return new u0.k(24, arrayList, z10 ? q(str, i7 + 1, str.length()) : null);
    }

    public final Class q(String str, int i7, int i10) throws ClassNotFoundException {
        char cCharAt = str.charAt(i7);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = da.d.d(a());
            String strSubstring = str.substring(i7 + 1, i10 - 1);
            i9.l.d(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(zb.q.m0(strSubstring, '/', '.'));
            i9.l.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            i9.l.d(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsQ = q(str, i7 + 1, i10);
            wa.c cVar = x1.f11793a;
            i9.l.e(clsQ, "<this>");
            return Array.newInstance((Class<?>) clsQ, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new cc.a0(2, "Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
