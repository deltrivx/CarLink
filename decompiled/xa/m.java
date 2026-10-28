package xa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f14801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f14802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f14803e;

    public m(a aVar, Object obj, a aVar2, l lVar, Class cls) {
        if (aVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (lVar.f14797b == m0.f14807f && aVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f14799a = aVar;
        this.f14800b = obj;
        this.f14801c = aVar2;
        this.f14802d = lVar;
        if (!o.class.isAssignableFrom(cls)) {
            this.f14803e = null;
            return;
        }
        try {
            this.f14803e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e7) {
            String name = cls.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 52);
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb2.toString(), e7);
        }
    }

    public final Object a(Object obj) {
        if (this.f14802d.f14797b.f14810a != n0.ENUM) {
            return obj;
        }
        try {
            return this.f14803e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f14802d.f14797b.f14810a == n0.ENUM ? Integer.valueOf(((o) obj).getNumber()) : obj;
    }
}
