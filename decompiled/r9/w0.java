package r9;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f11789b;

    public /* synthetic */ w0(y0 y0Var, int i7) {
        this.f11788a = i7;
        this.f11789b = y0Var;
    }

    @Override // h9.a
    public final Object invoke() throws n5.q {
        int i7 = this.f11788a;
        y0 y0Var = this.f11789b;
        switch (i7) {
            case 0:
                return new x0(y0Var);
            default:
                Object objN = y0Var.n();
                try {
                    Object obj = l1.f11708i;
                    Object objW = y0Var.m() ? n3.n.W(y0Var.f11712f, y0Var.j()) : null;
                    if (objW == obj) {
                        objW = null;
                    }
                    AccessibleObject accessibleObject = ((AccessibleObject) objN) != null ? (AccessibleObject) objN : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(n4.h.N(y0Var));
                    }
                    if (objN == null) {
                        return null;
                    }
                    if (objN instanceof Field) {
                        return ((Field) objN).get(objW);
                    }
                    if (!(objN instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objN + " neither field nor method");
                    }
                    int length = ((Method) objN).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objN).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objN;
                        if (objW == null) {
                            Class<?> cls = ((Method) objN).getParameterTypes()[0];
                            i9.l.d(cls, "get(...)");
                            objW = x1.e(cls);
                        }
                        return method.invoke(null, objW);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objN;
                        Class<?> cls2 = ((Method) objN).getParameterTypes()[1];
                        i9.l.d(cls2, "get(...)");
                        return method2.invoke(null, objW, x1.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objN + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e7) {
                    throw new n5.q("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e7);
                }
        }
    }
}
