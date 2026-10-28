package a5;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n;
import androidx.lifecycle.o0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import i9.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f41a = i7;
        this.f42b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, n nVar) {
        switch (this.f41a) {
            case 0:
                g gVar = (g) this.f42b;
                if (nVar != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                tVar.g().f(this);
                Bundle bundleS = gVar.d().s("androidx.savedstate.Restarter");
                if (bundleS == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleS.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                l.b(objNewInstance);
                                if (!(gVar instanceof s0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + gVar).toString());
                                }
                                r0 r0VarB = ((s0) gVar).b();
                                android.support.v4.media.session.r rVarD = gVar.d();
                                r0VarB.getClass();
                                LinkedHashMap linkedHashMap = r0VarB.f1067a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    l.e(str2, "key");
                                    o0 o0Var = (o0) linkedHashMap.get(str2);
                                    if (o0Var != null) {
                                        i0.a(o0Var, rVarD, gVar.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    rVarD.I();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(ob.a.q("Failed to instantiate ", str), e7);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(a2.f.G("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                new HashMap();
                i[] iVarArr = (i[]) this.f42b;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 2:
                if (nVar != n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nVar).toString());
                }
                tVar.g().f(this);
                ((k0) this.f42b).b();
                return;
            case 3:
                p4.l lVar = (p4.l) this.f42b;
                if (lVar.f1775e == null) {
                    c.i iVar3 = (c.i) lVar.getLastNonConfigurationInstance();
                    if (iVar3 != null) {
                        lVar.f1775e = iVar3.f1729a;
                    }
                    if (lVar.f1775e == null) {
                        lVar.f1775e = new r0();
                    }
                }
                lVar.f13057a.f(this);
                return;
            default:
                if (nVar == n.ON_STOP) {
                    ((p4.i) this.f42b).getClass();
                    return;
                }
                return;
        }
    }
}
