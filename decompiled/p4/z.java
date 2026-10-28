package p4;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.i0;
import androidx.lifecycle.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.k f10280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f10281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f10282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10283d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10284e = -1;

    public z(u0.k kVar, da.a aVar, ClassLoader classLoader, r rVar, y yVar) {
        this.f10280a = kVar;
        this.f10281b = aVar;
        i iVarA = rVar.a(yVar.f10268a);
        Bundle bundle = yVar.f10277j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        iVarA.setArguments(bundle);
        iVarA.f10180e = yVar.f10269b;
        iVarA.f10187m = yVar.f10270c;
        iVarA.f10189o = true;
        iVarA.f10196v = yVar.f10271d;
        iVarA.f10197w = yVar.f10272e;
        iVarA.f10198x = yVar.f10273f;
        iVarA.A = yVar.f10274g;
        iVarA.f10186l = yVar.f10275h;
        iVarA.f10200z = yVar.f10276i;
        iVarA.f10199y = yVar.k;
        iVarA.L = androidx.lifecycle.o.values()[yVar.f10278l];
        Bundle bundle2 = yVar.f10279m;
        if (bundle2 != null) {
            iVarA.f10177b = bundle2;
        } else {
            iVarA.f10177b = new Bundle();
        }
        this.f10282c = iVarA;
        if (u.D(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + iVarA);
        }
    }

    public z(u0.k kVar, da.a aVar, i iVar) {
        this.f10280a = kVar;
        this.f10281b = aVar;
        this.f10282c = iVar;
    }

    public z(u0.k kVar, da.a aVar, i iVar, y yVar) {
        this.f10280a = kVar;
        this.f10281b = aVar;
        this.f10282c = iVar;
        iVar.f10178c = null;
        iVar.f10179d = null;
        iVar.f10191q = 0;
        iVar.f10188n = false;
        iVar.k = false;
        i iVar2 = iVar.f10182g;
        iVar.f10183h = iVar2 != null ? iVar2.f10180e : null;
        iVar.f10182g = null;
        Bundle bundle = yVar.f10279m;
        if (bundle != null) {
            iVar.f10177b = bundle;
        } else {
            iVar.f10177b = new Bundle();
        }
    }

    public final void a() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + iVar);
        }
        Bundle bundle = iVar.f10177b;
        iVar.f10194t.J();
        iVar.f10176a = 3;
        iVar.D = true;
        if (u.D(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + iVar);
        }
        iVar.f10177b = null;
        u uVar = iVar.f10194t;
        uVar.E = false;
        uVar.F = false;
        uVar.L.f10267g = false;
        uVar.t(4);
        this.f10280a.E0(false);
    }

    public final void b() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "moveto ATTACHED: " + iVar);
        }
        i iVar2 = iVar.f10182g;
        z zVar = null;
        da.a aVar = this.f10281b;
        if (iVar2 != null) {
            z zVar2 = (z) ((HashMap) aVar.f3848c).get(iVar2.f10180e);
            if (zVar2 == null) {
                throw new IllegalStateException("Fragment " + iVar + " declared target fragment " + iVar.f10182g + " that does not belong to this FragmentManager!");
            }
            iVar.f10183h = iVar.f10182g.f10180e;
            iVar.f10182g = null;
            zVar = zVar2;
        } else {
            String str = iVar.f10183h;
            if (str != null && (zVar = (z) ((HashMap) aVar.f3848c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(iVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(ob.a.s(sb2, iVar.f10183h, " that does not belong to this FragmentManager!"));
            }
        }
        if (zVar != null) {
            zVar.j();
        }
        u uVar = iVar.f10192r;
        iVar.f10193s = uVar.f10246t;
        iVar.f10195u = uVar.f10248v;
        u0.k kVar = this.f10280a;
        kVar.K0(false);
        ArrayList arrayList = iVar.P;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t6.a aVar2 = ((g) it.next()).f10174a;
            aVar2.O.f45a.a();
            i0.d(aVar2);
        }
        arrayList.clear();
        iVar.f10194t.b(iVar.f10193s, new h(iVar), iVar);
        iVar.f10176a = 0;
        iVar.D = false;
        k kVar2 = iVar.f10193s;
        j.j jVar = kVar2.f10204d;
        iVar.D = true;
        if (kVar2.f10203c != null) {
            iVar.D = true;
        }
        if (!iVar.D) {
            throw new e0("Fragment " + iVar + " did not call through to super.onAttach()");
        }
        Iterator it2 = iVar.f10192r.f10239m.iterator();
        while (it2.hasNext()) {
            ((x) it2.next()).a();
        }
        u uVar2 = iVar.f10194t;
        uVar2.E = false;
        uVar2.F = false;
        uVar2.L.f10267g = false;
        uVar2.t(0);
        kVar.F0(false);
    }

    public final int c() {
        i iVar = this.f10282c;
        if (iVar.f10192r == null) {
            return iVar.f10176a;
        }
        int iMin = this.f10284e;
        int iOrdinal = iVar.L.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (iVar.f10187m) {
            if (iVar.f10188n) {
                iMin = Math.max(this.f10284e, 2);
            } else {
                iMin = this.f10284e < 4 ? Math.min(iMin, iVar.f10176a) : Math.min(iMin, 1);
            }
        }
        if (!iVar.k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = iVar.E;
        if (viewGroup != null) {
            f fVarD = f.d(viewGroup, iVar.j().B());
            Iterator it = fVarD.f10170b.iterator();
            if (it.hasNext()) {
                ((d0) it.next()).getClass();
                throw null;
            }
            Iterator it2 = fVarD.f10171c.iterator();
            if (it2.hasNext()) {
                ((d0) it2.next()).getClass();
                throw null;
            }
        }
        if (iVar.f10186l) {
            iMin = iVar.n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (iVar.F && iVar.f10176a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (u.D(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + iVar);
        }
        return iMin;
    }

    public final void d() {
        Parcelable parcelable;
        Parcelable parcelable2;
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "moveto CREATED: " + iVar);
        }
        if (iVar.J) {
            Bundle bundle = iVar.f10177b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                iVar.f10194t.N(parcelable);
                u uVar = iVar.f10194t;
                uVar.E = false;
                uVar.F = false;
                uVar.L.f10267g = false;
                uVar.t(1);
            }
            iVar.f10176a = 1;
            return;
        }
        u0.k kVar = this.f10280a;
        kVar.L0(false);
        Bundle bundle2 = iVar.f10177b;
        iVar.f10194t.J();
        iVar.f10176a = 1;
        iVar.D = false;
        iVar.M.a(new a5.b(4, iVar));
        iVar.O.a(bundle2);
        iVar.D = true;
        if (bundle2 != null && (parcelable2 = bundle2.getParcelable("android:support:fragments")) != null) {
            iVar.f10194t.N(parcelable2);
            u uVar2 = iVar.f10194t;
            uVar2.E = false;
            uVar2.F = false;
            uVar2.L.f10267g = false;
            uVar2.t(1);
        }
        u uVar3 = iVar.f10194t;
        if (uVar3.f10245s < 1) {
            uVar3.E = false;
            uVar3.F = false;
            uVar3.L.f10267g = false;
            uVar3.t(1);
        }
        iVar.J = true;
        if (iVar.D) {
            iVar.M.d(androidx.lifecycle.n.ON_CREATE);
            kVar.G0(false);
        } else {
            throw new e0("Fragment " + iVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String resourceName;
        i iVar = this.f10282c;
        if (iVar.f10187m) {
            return;
        }
        if (u.D(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + iVar);
        }
        iVar.p();
        ViewGroup viewGroup = iVar.E;
        if (viewGroup == null) {
            int i7 = iVar.f10197w;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + iVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) iVar.f10192r.f10247u.U(i7);
                if (viewGroup == null) {
                    if (!iVar.f10189o) {
                        try {
                            resourceName = iVar.q().getResources().getResourceName(iVar.f10197w);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(iVar.f10197w) + " (" + resourceName + ") for fragment " + iVar);
                    }
                } else if (!(viewGroup instanceof m)) {
                    q4.b bVar = q4.c.f10948a;
                    q4.c.b(new q4.a(iVar, "Attempting to add fragment " + iVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    q4.c.a(iVar).getClass();
                }
            }
        }
        iVar.E = viewGroup;
        iVar.f10194t.J();
        iVar.f10190p = true;
        iVar.b();
        iVar.f10176a = 2;
    }

    public final void f() {
        boolean z10;
        i iVarP;
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "movefrom CREATED: " + iVar);
        }
        boolean z11 = iVar.f10186l && !iVar.n();
        da.a aVar = this.f10281b;
        if (z11) {
        }
        if (!z11) {
            w wVar = (w) aVar.f3850e;
            if (!((wVar.f10262b.containsKey(iVar.f10180e) && wVar.f10265e) ? wVar.f10266f : true)) {
                String str = iVar.f10183h;
                if (str != null && (iVarP = aVar.p(str)) != null && iVarP.A) {
                    iVar.f10182g = iVarP;
                }
                iVar.f10176a = 0;
                return;
            }
        }
        k kVar = iVar.f10193s;
        if (kVar != null) {
            z10 = ((w) aVar.f3850e).f10266f;
        } else {
            j.j jVar = kVar.f10204d;
            z10 = ob.a.A(jVar) ? !jVar.isChangingConfigurations() : true;
        }
        if (z11 || z10) {
            ((w) aVar.f3850e).d(iVar);
        }
        iVar.f10194t.k();
        iVar.M.d(androidx.lifecycle.n.ON_DESTROY);
        iVar.f10176a = 0;
        iVar.D = false;
        iVar.J = false;
        t6.a aVar2 = (t6.a) iVar;
        aVar2.D = true;
        aVar2.f().d();
        if (!iVar.D) {
            throw new e0("Fragment " + iVar + " did not call through to super.onDestroy()");
        }
        this.f10280a.H0(false);
        for (z zVar : aVar.u()) {
            if (zVar != null) {
                i iVar2 = zVar.f10282c;
                if (iVar.f10180e.equals(iVar2.f10183h)) {
                    iVar2.f10182g = iVar;
                    iVar2.f10183h = null;
                }
            }
        }
        String str2 = iVar.f10183h;
        if (str2 != null) {
            iVar.f10182g = aVar.p(str2);
        }
        aVar.C(this);
    }

    public final void g() {
        i iVar = this.f10282c;
        if (u.D(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + iVar);
        }
        ViewGroup viewGroup = iVar.E;
        iVar.f10194t.t(1);
        iVar.f10176a = 1;
        iVar.D = true;
        r0 r0VarB = iVar.b();
        n4.e eVar = w4.a.f14135c;
        i9.l.e(r0VarB, "store");
        u4.a aVar = u4.a.f13061b;
        i9.l.e(aVar, "defaultCreationExtras");
        da.a aVar2 = new da.a(r0VarB, eVar, aVar);
        o9.c cVarO = g5.a.O(w4.a.class);
        String strK = cVarO.k();
        if (strK == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        s.r0 r0Var = ((w4.a) aVar2.z("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), cVarO)).f14136b;
        if (r0Var.f12491c > 0) {
            r0Var.f(0).getClass();
            throw new ClassCastException();
        }
        iVar.f10190p = false;
        this.f10280a.Q0(false);
        iVar.E = null;
        androidx.lifecycle.x xVar = iVar.N;
        xVar.getClass();
        ((q.a) q.a.M().f10527d).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        xVar.f1084c = null;
        if (xVar.f1086e) {
            xVar.f1087f = true;
        } else {
            xVar.f1086e = true;
            do {
                xVar.f1087f = false;
                r.f fVar = xVar.f1083b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f11073c.put(dVar, Boolean.FALSE);
                if (dVar.hasNext()) {
                    ((Map.Entry) dVar.next()).getValue().getClass();
                    throw new ClassCastException();
                }
            } while (xVar.f1087f);
            xVar.f1086e = false;
        }
        iVar.f10188n = false;
    }

    public final void h() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + iVar);
        }
        iVar.f10176a = -1;
        boolean z10 = true;
        iVar.D = true;
        u uVar = iVar.f10194t;
        if (!uVar.G) {
            uVar.k();
            iVar.f10194t = new u();
        }
        this.f10280a.I0(false);
        iVar.f10176a = -1;
        iVar.f10193s = null;
        iVar.f10195u = null;
        iVar.f10192r = null;
        if (!iVar.f10186l || iVar.n()) {
            w wVar = (w) this.f10281b.f3850e;
            if (wVar.f10262b.containsKey(iVar.f10180e) && wVar.f10265e) {
                z10 = wVar.f10266f;
            }
            if (!z10) {
                return;
            }
        }
        if (u.D(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + iVar);
        }
        iVar.l();
    }

    public final void i() {
        i iVar = this.f10282c;
        if (iVar.f10187m && iVar.f10188n && !iVar.f10190p) {
            if (u.D(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + iVar);
            }
            iVar.p();
            iVar.f10194t.J();
            iVar.f10190p = true;
            iVar.b();
        }
    }

    public final void j() {
        da.a aVar = this.f10281b;
        boolean z10 = this.f10283d;
        i iVar = this.f10282c;
        if (z10) {
            if (u.D(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + iVar);
                return;
            }
            return;
        }
        try {
            this.f10283d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i7 = iVar.f10176a;
                if (iC == i7) {
                    if (!z11 && i7 == -1 && iVar.f10186l && !iVar.n()) {
                        if (u.D(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + iVar);
                        }
                        ((w) aVar.f3850e).d(iVar);
                        aVar.C(this);
                        if (u.D(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + iVar);
                        }
                        iVar.l();
                    }
                    if (iVar.I) {
                        u uVar = iVar.f10192r;
                        if (uVar != null && iVar.k && u.E(iVar)) {
                            uVar.D = true;
                        }
                        iVar.I = false;
                        iVar.f10194t.n();
                    }
                    return;
                }
                if (iC <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            iVar.f10176a = 1;
                            break;
                        case 2:
                            iVar.f10188n = false;
                            iVar.f10176a = 2;
                            break;
                        case 3:
                            if (u.D(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + iVar);
                            }
                            iVar.f10176a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            iVar.f10176a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            iVar.f10176a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            iVar.f10176a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } finally {
            this.f10283d = false;
        }
    }

    public final void k() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "movefrom RESUMED: " + iVar);
        }
        iVar.f10194t.t(5);
        iVar.M.d(androidx.lifecycle.n.ON_PAUSE);
        iVar.f10176a = 6;
        iVar.D = true;
        this.f10280a.J0(false);
    }

    public final void l(ClassLoader classLoader) {
        i iVar = this.f10282c;
        Bundle bundle = iVar.f10177b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        iVar.f10178c = iVar.f10177b.getSparseParcelableArray("android:view_state");
        iVar.f10179d = iVar.f10177b.getBundle("android:view_registry_state");
        String string = iVar.f10177b.getString("android:target_state");
        iVar.f10183h = string;
        if (string != null) {
            iVar.f10184i = iVar.f10177b.getInt("android:target_req_state", 0);
        }
        boolean z10 = iVar.f10177b.getBoolean("android:user_visible_hint", true);
        iVar.G = z10;
        if (z10) {
            return;
        }
        iVar.F = true;
    }

    public final void m() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "moveto RESUMED: " + iVar);
        }
        n7.g gVar = iVar.H;
        View view = gVar == null ? null : (View) gVar.f8891i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        iVar.c().f8891i = null;
        iVar.f10194t.J();
        iVar.f10194t.w(true);
        iVar.f10176a = 7;
        iVar.D = false;
        t6.a aVar = (t6.a) iVar;
        aVar.D = true;
        aVar.f().f();
        if (!iVar.D) {
            throw new e0("Fragment " + iVar + " did not call through to super.onResume()");
        }
        iVar.M.d(androidx.lifecycle.n.ON_RESUME);
        u uVar = iVar.f10194t;
        uVar.E = false;
        uVar.F = false;
        uVar.L.f10267g = false;
        uVar.t(7);
        this.f10280a.M0(false);
        iVar.f10177b = null;
        iVar.f10178c = null;
        iVar.f10179d = null;
    }

    public final void n() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "moveto STARTED: " + iVar);
        }
        iVar.f10194t.J();
        iVar.f10194t.w(true);
        iVar.f10176a = 5;
        iVar.D = true;
        iVar.M.d(androidx.lifecycle.n.ON_START);
        u uVar = iVar.f10194t;
        uVar.E = false;
        uVar.F = false;
        uVar.L.f10267g = false;
        uVar.t(5);
        this.f10280a.O0(false);
    }

    public final void o() {
        boolean zD = u.D(3);
        i iVar = this.f10282c;
        if (zD) {
            Log.d("FragmentManager", "movefrom STARTED: " + iVar);
        }
        u uVar = iVar.f10194t;
        uVar.F = true;
        uVar.L.f10267g = true;
        uVar.t(4);
        iVar.M.d(androidx.lifecycle.n.ON_STOP);
        iVar.f10176a = 4;
        iVar.D = true;
        this.f10280a.P0(false);
    }
}
