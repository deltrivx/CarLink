package s4;

import androidx.lifecycle.t;
import f1.t1;
import f1.x2;
import i9.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import n8.f;
import t8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f12577a;

    static {
        Object objB;
        try {
            ClassLoader classLoader = t.class.getClassLoader();
            l.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof t1) {
                        objB = (t1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i7] instanceof c)) {
                    i7++;
                }
                objB = null;
                break;
            }
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        t1 x2Var = (t1) (objB instanceof t8.l ? null : objB);
        if (x2Var == null) {
            x2Var = new x2(new f(23));
        }
        f12577a = x2Var;
    }
}
