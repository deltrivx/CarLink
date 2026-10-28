package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f1049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f1050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f1052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.support.v4.media.session.r f1053e;

    public m0(Application application, a5.g gVar, Bundle bundle) {
        p0 p0Var;
        this.f1053e = gVar.d();
        this.f1052d = gVar.g();
        this.f1051c = bundle;
        this.f1049a = application;
        if (application != null) {
            if (p0.f1063g == null) {
                p0.f1063g = new p0(application);
            }
            p0Var = p0.f1063g;
            i9.l.b(p0Var);
        } else {
            p0Var = new p0(null);
        }
        this.f1050b = p0Var;
    }

    @Override // androidx.lifecycle.q0
    public final o0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final o0 b(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        v vVar = this.f1052d;
        if (vVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f1049a == null) ? n0.a(cls, n0.f1055b) : n0.a(cls, n0.f1054a);
        if (constructorA == null) {
            if (this.f1049a != null) {
                return this.f1050b.a(cls);
            }
            if (kb.d.f7500b == null) {
                kb.d.f7500b = new kb.d(6);
            }
            i9.l.b(kb.d.f7500b);
            return n3.u.w(cls);
        }
        android.support.v4.media.session.r rVar = this.f1053e;
        i9.l.b(rVar);
        g0 g0VarB = i0.b(rVar.s(str), this.f1051c);
        h0 h0Var = new h0(str, g0VarB);
        h0Var.j(rVar, vVar);
        o oVar = vVar.f1072c;
        if (oVar == o.f1057b || oVar.compareTo(o.f1059d) >= 0) {
            rVar.I();
        } else {
            vVar.a(new g(rVar, vVar));
        }
        o0 o0VarB = (!zIsAssignableFrom || (application = this.f1049a) == null) ? n0.b(cls, constructorA, g0VarB) : n0.b(cls, constructorA, application, g0VarB);
        o0VarB.getClass();
        v4.a aVar = o0VarB.f1062a;
        if (aVar == null) {
            return o0VarB;
        }
        if (aVar.f13608d) {
            v4.a.a(h0Var);
            return o0VarB;
        }
        synchronized (aVar.f13605a) {
            autoCloseable = (AutoCloseable) aVar.f13606b.put("androidx.lifecycle.savedstate.vm.tag", h0Var);
        }
        v4.a.a(autoCloseable);
        return o0VarB;
    }

    @Override // androidx.lifecycle.q0
    public final o0 c(Class cls, u4.c cVar) {
        kb.d dVar = i0.f1040d;
        LinkedHashMap linkedHashMap = cVar.f13062a;
        String str = (String) linkedHashMap.get(dVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(i0.f1037a) == null || linkedHashMap.get(i0.f1038b) == null) {
            if (this.f1052d != null) {
                return b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(p0.f1064h);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? n0.a(cls, n0.f1055b) : n0.a(cls, n0.f1054a);
        if (constructorA == null) {
            return this.f1050b.c(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? n0.b(cls, constructorA, i0.c(cVar)) : n0.b(cls, constructorA, application, i0.c(cVar));
    }

    @Override // androidx.lifecycle.q0
    public final o0 f(o9.c cVar, u4.c cVar2) {
        return c(g5.a.L(cVar), cVar2);
    }
}
