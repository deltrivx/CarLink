package a9;

import i9.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements y8.c, d, Serializable {
    private final y8.c completion;

    public a(y8.c cVar) {
        this.completion = cVar;
    }

    public y8.c create(Object obj, y8.c cVar) {
        l.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public y8.c create(y8.c cVar) {
        l.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // a9.d
    public d getCallerFrame() {
        y8.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final y8.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        a2.b bVar = f.f306b;
        a2.b bVar2 = f.f305a;
        if (bVar == null) {
            try {
                a2.b bVar3 = new a2.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 1);
                f.f306b = bVar3;
                bVar = bVar3;
            } catch (Exception unused2) {
                f.f306b = bVar2;
                bVar = bVar2;
            }
        }
        if (bVar != bVar2 && (method = (Method) bVar.f12b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) bVar.f13c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) bVar.f14d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        y8.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            y8.c cVar2 = aVar.completion;
            l.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == z8.a.f15774a) {
                    return;
                }
            } catch (Throwable th) {
                obj = t8.a.b(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
