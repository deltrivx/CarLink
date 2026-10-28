package p4;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, s0, androidx.lifecycle.j, a5.g {
    public static final Object R = new Object();
    public boolean A;
    public boolean B;
    public boolean D;
    public ViewGroup E;
    public boolean F;
    public n7.g H;
    public boolean I;
    public boolean J;
    public String K;
    public androidx.lifecycle.v M;
    public a5.f O;
    public final ArrayList P;
    public final g Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f10177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f10178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f10179d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f10181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f10182g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10184i;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f10192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f10193s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f10195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f10198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10200z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10176a = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10180e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10183h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f10185j = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u f10194t = new u();
    public final boolean C = true;
    public boolean G = true;
    public androidx.lifecycle.o L = androidx.lifecycle.o.f1060e;
    public final androidx.lifecycle.x N = new androidx.lifecycle.x();

    public i() {
        new AtomicInteger();
        this.P = new ArrayList();
        this.Q = new g((t6.a) this);
        k();
    }

    @Override // androidx.lifecycle.j
    public final u4.c a() {
        Application application;
        Context applicationContext = q().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && u.D(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + q().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        u4.c cVar = new u4.c(0);
        LinkedHashMap linkedHashMap = cVar.f13062a;
        if (application != null) {
            linkedHashMap.put(p0.f1064h, application);
        }
        linkedHashMap.put(i0.f1037a, this);
        linkedHashMap.put(i0.f1038b, this);
        Bundle bundle = this.f10181f;
        if (bundle != null) {
            linkedHashMap.put(i0.f1039c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.s0
    public final r0 b() {
        if (this.f10192r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f10192r.L.f10264d;
        r0 r0Var = (r0) map.get(this.f10180e);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        map.put(this.f10180e, r0Var2);
        return r0Var2;
    }

    public final n7.g c() {
        if (this.H == null) {
            n7.g gVar = new n7.g();
            Object obj = R;
            gVar.f8888f = obj;
            gVar.f8889g = obj;
            gVar.f8890h = obj;
            gVar.f8891i = null;
            this.H = gVar;
        }
        return this.H;
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return this.O.f46b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        return this.M;
    }

    public final l getActivity() {
        k kVar = this.f10193s;
        if (kVar == null) {
            return null;
        }
        return kVar.f10203c;
    }

    public final Bundle getArguments() {
        return this.f10181f;
    }

    public final u h() {
        if (this.f10193s != null) {
            return this.f10194t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int i() {
        androidx.lifecycle.o oVar = this.L;
        return (oVar == androidx.lifecycle.o.f1057b || this.f10195u == null) ? oVar.ordinal() : Math.min(oVar.ordinal(), this.f10195u.i());
    }

    public final boolean isAdded() {
        return this.f10193s != null && this.k;
    }

    public final boolean isRemoving() {
        return this.f10186l;
    }

    public final u j() {
        u uVar = this.f10192r;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.M = new androidx.lifecycle.v(this, true);
        this.O = new a5.f(new c5.a(this, new a5.e(0, this)));
        ArrayList arrayList = this.P;
        g gVar = this.Q;
        if (arrayList.contains(gVar)) {
            return;
        }
        if (this.f10176a < 0) {
            arrayList.add(gVar);
            return;
        }
        t6.a aVar = gVar.f10174a;
        aVar.O.f45a.a();
        i0.d(aVar);
    }

    public final void l() {
        k();
        this.K = this.f10180e;
        this.f10180e = UUID.randomUUID().toString();
        this.k = false;
        this.f10186l = false;
        this.f10187m = false;
        this.f10188n = false;
        this.f10189o = false;
        this.f10191q = 0;
        this.f10192r = null;
        this.f10194t = new u();
        this.f10193s = null;
        this.f10196v = 0;
        this.f10197w = 0;
        this.f10198x = null;
        this.f10199y = false;
        this.f10200z = false;
    }

    public final boolean m() {
        if (this.f10199y) {
            return true;
        }
        u uVar = this.f10192r;
        if (uVar != null) {
            i iVar = this.f10195u;
            uVar.getClass();
            if (iVar == null ? false : iVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.f10191q > 0;
    }

    public abstract void o(int i7, int i10, Intent intent);

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        l activity = getActivity();
        if (activity != null) {
            activity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.D = true;
    }

    public final LayoutInflater p() {
        k kVar = this.f10193s;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        j.j jVar = kVar.f10207g;
        LayoutInflater layoutInflaterCloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
        layoutInflaterCloneInContext.setFactory2(this.f10194t.f10233f);
        return layoutInflaterCloneInContext;
    }

    public final Context q() {
        k kVar = this.f10193s;
        j.j jVar = kVar == null ? null : kVar.f10204d;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void r(int i7, int i10, int i11, int i12) {
        if (this.H == null && i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        c().f8884b = i7;
        c().f8885c = i10;
        c().f8886d = i11;
        c().f8887e = i12;
    }

    public final void requestPermissions(String[] strArr, int i7) {
        if (this.f10193s == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        u uVarJ = j();
        if (uVarJ.B == null) {
            uVarJ.f10246t.getClass();
            return;
        }
        uVarJ.C.addLast(new t(i7, this.f10180e));
        uVarJ.B.O(strArr);
    }

    public final void setArguments(Bundle bundle) {
        u uVar = this.f10192r;
        if (uVar != null && (uVar.E || uVar.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f10181f = bundle;
    }

    public final void setRetainInstance(boolean z10) {
        q4.b bVar = q4.c.f10948a;
        q4.c.b(new q4.a(this, "Attempting to set retain instance for fragment " + this));
        q4.c.a(this).getClass();
        this.A = z10;
        u uVar = this.f10192r;
        if (uVar == null) {
            this.B = true;
        } else if (z10) {
            uVar.L.c(this);
        } else {
            uVar.L.f(this);
        }
    }

    public final void startActivity(Intent intent) {
        k kVar = this.f10193s;
        if (kVar != null) {
            kVar.f10204d.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final void startActivityForResult(Intent intent, int i7) {
        if (this.f10193s == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        u uVarJ = j();
        if (uVarJ.f10252z != null) {
            uVarJ.C.addLast(new t(i7, this.f10180e));
            uVarJ.f10252z.O(intent);
        } else {
            k kVar = uVarJ.f10246t;
            if (i7 == -1) {
                kVar.f10204d.startActivity(intent, null);
            } else {
                kVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f10180e);
        if (this.f10196v != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f10196v));
        }
        if (this.f10198x != null) {
            sb2.append(" tag=");
            sb2.append(this.f10198x);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
