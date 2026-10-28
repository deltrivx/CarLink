package s9;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t8.o f12674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8.o f12675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12676e;

    public d(Class cls, Map map, t8.o oVar, t8.o oVar2, List list) {
        this.f12672a = cls;
        this.f12673b = map;
        this.f12674c = oVar;
        this.f12675d = oVar2;
        this.f12676e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zA;
        boolean z10;
        String name = method.getName();
        Class cls = this.f12672a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f12675d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f12674c.getValue();
            }
        }
        boolean zA2 = i9.l.a(name, "equals");
        Map map = this.f12673b;
        boolean z11 = false;
        if (!zA2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(u8.l.L0(objArr));
            sb2.append(')');
            throw new cc.a0(2, sb2.toString());
        }
        Object objH0 = u8.l.H0(objArr);
        Annotation annotation = objH0 instanceof Annotation ? (Annotation) objH0 : null;
        if (i9.l.a(annotation != null ? g5.a.L(g5.a.G(annotation)) : null, cls)) {
            List list = this.f12676e;
            if (list != null && list.isEmpty()) {
                z10 = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objH0, null);
                if (obj2 instanceof boolean[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zA = i9.l.a(obj2, objInvoke);
                }
                if (!zA) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
