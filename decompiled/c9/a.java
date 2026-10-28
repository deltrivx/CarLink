package c9;

import i9.l;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f2572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f2573b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        l.b(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i7];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.d(parameterTypes, "getParameterTypes(...)");
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i7++;
        }
        f2572a = method2;
        for (Method method3 : methods) {
            if (l.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f2573b = method;
    }
}
