package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.baidu.carlifevehicle.R;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb.d f1037a = new kb.d(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kb.d f1038b = new kb.d(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kb.d f1039c = new kb.d(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kb.d f1040d = new kb.d(7);

    public static final void a(o0 o0Var, android.support.v4.media.session.r rVar, v vVar) {
        AutoCloseable autoCloseable;
        i9.l.e(rVar, "registry");
        i9.l.e(vVar, "lifecycle");
        v4.a aVar = o0Var.f1062a;
        if (aVar != null) {
            synchronized (aVar.f13605a) {
                autoCloseable = (AutoCloseable) aVar.f13606b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        h0 h0Var = (h0) autoCloseable;
        if (h0Var == null || h0Var.f1036c) {
            return;
        }
        h0Var.j(rVar, vVar);
        o oVar = vVar.f1072c;
        if (oVar == o.f1057b || oVar.compareTo(o.f1059d) >= 0) {
            rVar.I();
        } else {
            vVar.a(new g(rVar, vVar));
        }
    }

    public static g0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            g0 g0Var = new g0();
            new LinkedHashMap();
            g0Var.f1033a = new b3.r(u8.x.f13123a);
            return g0Var;
        }
        ClassLoader classLoader = g0.class.getClassLoader();
        i9.l.b(classLoader);
        bundle.setClassLoader(classLoader);
        v8.e eVar = new v8.e(bundle.size());
        for (String str : bundle.keySet()) {
            i9.l.b(str);
            eVar.put(str, bundle.get(str));
        }
        v8.e eVarB = eVar.b();
        g0 g0Var2 = new g0();
        new LinkedHashMap();
        g0Var2.f1033a = new b3.r(eVarB);
        return g0Var2;
    }

    public static final g0 c(u4.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f13062a;
        a5.g gVar = (a5.g) linkedHashMap.get(f1037a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        s0 s0Var = (s0) linkedHashMap.get(f1038b);
        if (s0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1039c);
        String str = (String) linkedHashMap.get(f1040d);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        a5.d dVarB = gVar.d().B();
        Bundle bundle2 = null;
        k0 k0Var = dVarB instanceof k0 ? (k0) dVarB : null;
        if (k0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(s0Var).f1047b;
        g0 g0Var = (g0) linkedHashMap2.get(str);
        if (g0Var != null) {
            return g0Var;
        }
        k0Var.b();
        Bundle bundle3 = k0Var.f1045c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = k9.a.j((t8.j[]) Arrays.copyOf(new t8.j[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                k0Var.f1045c = null;
            }
            bundle2 = bundle4;
        }
        g0 g0VarB = b(bundle2, bundle);
        linkedHashMap2.put(str, g0VarB);
        return g0VarB;
    }

    public static final void d(a5.g gVar) {
        o oVar = gVar.g().f1072c;
        if (oVar != o.f1057b && oVar != o.f1058c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.d().B() == null) {
            k0 k0Var = new k0(gVar.d(), (s0) gVar);
            gVar.d().H("androidx.lifecycle.internal.SavedStateHandlesProvider", k0Var);
            gVar.g().a(new a5.b(2, k0Var));
        }
    }

    public static final t e(View view) {
        i9.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                return tVar;
            }
            Object objC = o9.e0.C(view);
            view = objC instanceof View ? (View) objC : null;
        }
        return null;
    }

    public static final s0 f(View view) {
        i9.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            s0 s0Var = tag instanceof s0 ? (s0) tag : null;
            if (s0Var != null) {
                return s0Var;
            }
            Object objC = o9.e0.C(view);
            view = objC instanceof View ? (View) objC : null;
        }
        return null;
    }

    public static final l0 g(s0 s0Var) {
        kb.d dVar = new kb.d(1);
        u4.b bVarA = s0Var instanceof j ? ((j) s0Var).a() : u4.a.f13061b;
        i9.l.e(bVarA, "extras");
        r0 r0VarB = s0Var.b();
        i9.l.e(r0VarB, "store");
        return (l0) new da.a(r0VarB, dVar, bVarA).z("androidx.lifecycle.internal.SavedStateHandlesVM", i9.y.f6689a.b(l0.class));
    }

    public static final void h(View view, t tVar) {
        i9.l.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
