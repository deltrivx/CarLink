package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f1054a = n3.l.J(Application.class, g0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f1055b = n3.l.I(g0.class);

    public static final Constructor a(Class cls, List list) {
        i9.l.e(list, "signature");
        i9.b bVarH = i9.l.h(cls.getConstructors());
        while (bVarH.hasNext()) {
            Constructor constructor = (Constructor) bVarH.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            i9.l.d(parameterTypes, "getParameterTypes(...)");
            List listL0 = u8.l.L0(parameterTypes);
            if (list.equals(listL0)) {
                return constructor;
            }
            if (list.size() == listL0.size() && listL0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final o0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (o0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
