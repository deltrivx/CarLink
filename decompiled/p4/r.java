package p4;

import java.lang.reflect.InvocationTargetException;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f10223b = new q0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f10224a;

    public r(u uVar) {
        this.f10224a = uVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q0 q0Var = f10223b;
        q0 q0Var2 = (q0) q0Var.get(classLoader);
        if (q0Var2 == null) {
            q0Var2 = new q0(0);
            q0Var.put(classLoader, q0Var2);
        }
        Class cls = (Class) q0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        q0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e10) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final i a(String str) {
        try {
            return (i) c(this.f10224a.f10246t.f10204d.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e10) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new cc.s(a2.f.G("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
