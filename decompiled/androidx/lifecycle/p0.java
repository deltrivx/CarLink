package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kb.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static p0 f1063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kb.d f1064h = new kb.d(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Application f1065f;

    public p0(Application application) {
        super(6);
        this.f1065f = application;
    }

    @Override // kb.d, androidx.lifecycle.q0
    public final o0 a(Class cls) {
        Application application = this.f1065f;
        if (application != null) {
            return m(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // kb.d, androidx.lifecycle.q0
    public final o0 c(Class cls, u4.c cVar) {
        if (this.f1065f != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f13062a.get(f1064h);
        if (application != null) {
            return m(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return n3.u.w(cls);
    }

    public final o0 m(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return n3.u.w(cls);
        }
        try {
            o0 o0Var = (o0) cls.getConstructor(Application.class).newInstance(application);
            i9.l.b(o0Var);
            return o0Var;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
