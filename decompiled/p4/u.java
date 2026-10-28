package p4;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.r0;
import c.l0;
import c.m0;
import com.baidu.carlifevehicle.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public a2.b A;
    public a2.b B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w L;
    public final com.tencent.bugly.proguard.c0 M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10229b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f10232e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f10234g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0.k f10238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f10239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f10240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f10241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f10242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f10243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f10244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f10246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n4.h f10247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f10248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f10249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f10250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n4.e f10251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a2.b f10252z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10228a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da.a f10230c = new da.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f10233f = new n(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f10235h = new m0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f10236i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f10237j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [p4.o] */
    /* JADX WARN: Type inference failed for: r0v13, types: [p4.o] */
    /* JADX WARN: Type inference failed for: r0v14, types: [p4.o] */
    /* JADX WARN: Type inference failed for: r0v15, types: [p4.o] */
    public u() {
        Collections.synchronizedMap(new HashMap());
        this.f10238l = new u0.k(this);
        this.f10239m = new CopyOnWriteArrayList();
        final int i7 = 0;
        this.f10240n = new d4.a(this) { // from class: p4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f10219b;

            {
                this.f10219b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        u uVar = this.f10219b;
                        if (uVar.F()) {
                            uVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u uVar2 = this.f10219b;
                        if (uVar2.F() && num.intValue() == 80) {
                            uVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        u3.i iVar = (u3.i) obj;
                        u uVar3 = this.f10219b;
                        if (uVar3.F()) {
                            boolean z10 = iVar.f13058a;
                            uVar3.m(false);
                        }
                        break;
                    default:
                        u3.l lVar = (u3.l) obj;
                        u uVar4 = this.f10219b;
                        if (uVar4.F()) {
                            boolean z11 = lVar.f13060a;
                            uVar4.r(false);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f10241o = new d4.a(this) { // from class: p4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f10219b;

            {
                this.f10219b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        u uVar = this.f10219b;
                        if (uVar.F()) {
                            uVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u uVar2 = this.f10219b;
                        if (uVar2.F() && num.intValue() == 80) {
                            uVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        u3.i iVar = (u3.i) obj;
                        u uVar3 = this.f10219b;
                        if (uVar3.F()) {
                            boolean z10 = iVar.f13058a;
                            uVar3.m(false);
                        }
                        break;
                    default:
                        u3.l lVar = (u3.l) obj;
                        u uVar4 = this.f10219b;
                        if (uVar4.F()) {
                            boolean z11 = lVar.f13060a;
                            uVar4.r(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f10242p = new d4.a(this) { // from class: p4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f10219b;

            {
                this.f10219b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        u uVar = this.f10219b;
                        if (uVar.F()) {
                            uVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u uVar2 = this.f10219b;
                        if (uVar2.F() && num.intValue() == 80) {
                            uVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        u3.i iVar = (u3.i) obj;
                        u uVar3 = this.f10219b;
                        if (uVar3.F()) {
                            boolean z10 = iVar.f13058a;
                            uVar3.m(false);
                        }
                        break;
                    default:
                        u3.l lVar = (u3.l) obj;
                        u uVar4 = this.f10219b;
                        if (uVar4.F()) {
                            boolean z11 = lVar.f13060a;
                            uVar4.r(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f10243q = new d4.a(this) { // from class: p4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f10219b;

            {
                this.f10219b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        u uVar = this.f10219b;
                        if (uVar.F()) {
                            uVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u uVar2 = this.f10219b;
                        if (uVar2.F() && num.intValue() == 80) {
                            uVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        u3.i iVar = (u3.i) obj;
                        u uVar3 = this.f10219b;
                        if (uVar3.F()) {
                            boolean z10 = iVar.f13058a;
                            uVar3.m(false);
                        }
                        break;
                    default:
                        u3.l lVar = (u3.l) obj;
                        u uVar4 = this.f10219b;
                        if (uVar4.F()) {
                            boolean z11 = lVar.f13060a;
                            uVar4.r(false);
                        }
                        break;
                }
            }
        };
        this.f10244r = new q(this);
        this.f10245s = -1;
        this.f10250x = new r(this);
        this.f10251y = new n4.e(6);
        this.C = new ArrayDeque();
        this.M = new com.tencent.bugly.proguard.c0(7, this);
    }

    public static boolean D(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean E(i iVar) {
        iVar.getClass();
        boolean zE = false;
        for (i iVar2 : iVar.f10194t.f10230c.v()) {
            if (iVar2 != null) {
                zE = E(iVar2);
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    public static boolean G(i iVar) {
        if (iVar == null) {
            return true;
        }
        if (iVar.C) {
            return iVar.f10192r == null || G(iVar.f10195u);
        }
        return false;
    }

    public static boolean H(i iVar) {
        if (iVar == null) {
            return true;
        }
        u uVar = iVar.f10192r;
        return iVar.equals(uVar.f10249w) && H(uVar.f10248v);
    }

    public static void U(i iVar) {
        if (D(2)) {
            Log.v("FragmentManager", "show: " + iVar);
        }
        if (iVar.f10199y) {
            iVar.f10199y = false;
            iVar.I = !iVar.I;
        }
    }

    public final r A() {
        i iVar = this.f10248v;
        return iVar != null ? iVar.f10192r.A() : this.f10250x;
    }

    public final n4.e B() {
        i iVar = this.f10248v;
        return iVar != null ? iVar.f10192r.B() : this.f10251y;
    }

    public final void C(i iVar) {
        if (D(2)) {
            Log.v("FragmentManager", "hide: " + iVar);
        }
        if (iVar.f10199y) {
            return;
        }
        iVar.f10199y = true;
        iVar.I = true ^ iVar.I;
        T(iVar);
    }

    public final boolean F() {
        i iVar = this.f10248v;
        if (iVar == null) {
            return true;
        }
        return iVar.isAdded() && this.f10248v.j().F();
    }

    public final void I(int i7, boolean z10) {
        k kVar;
        if (this.f10246t == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i7 != this.f10245s) {
            this.f10245s = i7;
            da.a aVar = this.f10230c;
            HashMap map = (HashMap) aVar.f3848c;
            Iterator it = ((ArrayList) aVar.f3847b).iterator();
            while (it.hasNext()) {
                z zVar = (z) map.get(((i) it.next()).f10180e);
                if (zVar != null) {
                    zVar.j();
                }
            }
            for (z zVar2 : map.values()) {
                if (zVar2 != null) {
                    zVar2.j();
                    i iVar = zVar2.f10282c;
                    if (iVar.f10186l && !iVar.n()) {
                        aVar.C(zVar2);
                    }
                }
            }
            V();
            if (this.D && (kVar = this.f10246t) != null && this.f10245s == 7) {
                kVar.f10207g.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void J() {
        if (this.f10246t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f10267g = false;
        for (i iVar : this.f10230c.x()) {
            if (iVar != null) {
                iVar.f10194t.J();
            }
        }
    }

    public final boolean K() {
        boolean z10;
        w(false);
        v(true);
        i iVar = this.f10249w;
        if (iVar != null && iVar.h().K()) {
            return true;
        }
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.J;
        ArrayList arrayList3 = this.f10231d;
        int size = (arrayList3 == null || arrayList3.isEmpty()) ? -1 : this.f10231d.size() - 1;
        if (size < 0) {
            z10 = false;
        } else {
            for (int size2 = this.f10231d.size() - 1; size2 >= size; size2--) {
                arrayList.add((a) this.f10231d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
            z10 = true;
        }
        if (z10) {
            this.f10229b = true;
            try {
                M(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        X();
        if (this.H) {
            this.H = false;
            V();
        }
        ((HashMap) this.f10230c.f3848c).values().removeAll(Collections.singleton(null));
        return z10;
    }

    public final void L(i iVar) {
        if (D(2)) {
            Log.v("FragmentManager", "remove: " + iVar + " nesting=" + iVar.f10191q);
        }
        boolean zN = iVar.n();
        if (iVar.f10200z && zN) {
            return;
        }
        da.a aVar = this.f10230c;
        synchronized (((ArrayList) aVar.f3847b)) {
            ((ArrayList) aVar.f3847b).remove(iVar);
        }
        iVar.k = false;
        if (E(iVar)) {
            this.D = true;
        }
        iVar.f10186l = true;
        T(iVar);
    }

    public final void M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i7 < size) {
            if (!((a) arrayList.get(i7)).f10139o) {
                if (i10 != i7) {
                    x(arrayList, arrayList2, i10, i7);
                }
                i10 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f10139o) {
                        i10++;
                    }
                }
                x(arrayList, arrayList2, i7, i10);
                i7 = i10 - 1;
            }
            i7++;
        }
        if (i10 != size) {
            x(arrayList, arrayList2, i10, size);
        }
    }

    public final void N(Parcelable parcelable) {
        u0.k kVar;
        z zVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f10246t.f10204d.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<y> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f10246t.f10204d.getClassLoader());
                arrayList.add((y) bundle.getParcelable("state"));
            }
        }
        da.a aVar = this.f10230c;
        HashMap map = (HashMap) aVar.f3849d;
        HashMap map2 = (HashMap) aVar.f3848c;
        map.clear();
        for (y yVar : arrayList) {
            map.put(yVar.f10269b, yVar);
        }
        v vVar = (v) bundle3.getParcelable("state");
        if (vVar == null) {
            return;
        }
        map2.clear();
        Iterator it = vVar.f10253a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kVar = this.f10238l;
            if (!zHasNext) {
                break;
            }
            y yVar2 = (y) ((HashMap) aVar.f3849d).remove((String) it.next());
            if (yVar2 != null) {
                i iVar = (i) this.L.f10262b.get(yVar2.f10269b);
                if (iVar != null) {
                    if (D(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + iVar);
                    }
                    zVar = new z(kVar, aVar, iVar, yVar2);
                } else {
                    zVar = new z(this.f10238l, this.f10230c, this.f10246t.f10204d.getClassLoader(), A(), yVar2);
                }
                i iVar2 = zVar.f10282c;
                iVar2.f10192r = this;
                if (D(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + iVar2.f10180e + "): " + iVar2);
                }
                zVar.l(this.f10246t.f10204d.getClassLoader());
                aVar.B(zVar);
                zVar.f10284e = this.f10245s;
            }
        }
        w wVar = this.L;
        wVar.getClass();
        for (i iVar3 : new ArrayList(wVar.f10262b.values())) {
            if (map2.get(iVar3.f10180e) == null) {
                if (D(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + iVar3 + " that was not found in the set of active Fragments " + vVar.f10253a);
                }
                this.L.f(iVar3);
                iVar3.f10192r = this;
                z zVar2 = new z(kVar, aVar, iVar3);
                zVar2.f10284e = 1;
                zVar2.j();
                iVar3.f10186l = true;
                zVar2.j();
            }
        }
        ArrayList<String> arrayList2 = vVar.f10254b;
        ((ArrayList) aVar.f3847b).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                i iVarP = aVar.p(str3);
                if (iVarP == null) {
                    throw new IllegalStateException(a2.f.G("No instantiated fragment for (", str3, ")"));
                }
                if (D(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + iVarP);
                }
                aVar.n(iVarP);
            }
        }
        if (vVar.f10255c != null) {
            this.f10231d = new ArrayList(vVar.f10255c.length);
            int i7 = 0;
            while (true) {
                b[] bVarArr = vVar.f10255c;
                if (i7 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i7];
                ArrayList arrayList3 = bVar.f10153b;
                a aVar2 = new a(this);
                int[] iArr = bVar.f10152a;
                int i10 = 0;
                int i11 = 0;
                while (i10 < iArr.length) {
                    a0 a0Var = new a0();
                    int i12 = i10 + 1;
                    a0Var.f10143a = iArr[i10];
                    if (D(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar2 + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    a0Var.f10150h = androidx.lifecycle.o.values()[bVar.f10154c[i11]];
                    a0Var.f10151i = androidx.lifecycle.o.values()[bVar.f10155d[i11]];
                    int i13 = i10 + 2;
                    a0Var.f10145c = iArr[i12] != 0;
                    int i14 = iArr[i13];
                    a0Var.f10146d = i14;
                    int i15 = iArr[i10 + 3];
                    a0Var.f10147e = i15;
                    int i16 = i10 + 5;
                    int i17 = iArr[i10 + 4];
                    a0Var.f10148f = i17;
                    i10 += 6;
                    int[] iArr2 = iArr;
                    int i18 = iArr2[i16];
                    a0Var.f10149g = i18;
                    aVar2.f10127b = i14;
                    aVar2.f10128c = i15;
                    aVar2.f10129d = i17;
                    aVar2.f10130e = i18;
                    aVar2.a(a0Var);
                    i11++;
                    iArr = iArr2;
                }
                aVar2.f10131f = bVar.f10156e;
                aVar2.f10133h = bVar.f10157f;
                aVar2.f10132g = true;
                aVar2.f10134i = bVar.f10159h;
                aVar2.f10135j = bVar.f10160i;
                aVar2.k = bVar.f10161j;
                aVar2.f10136l = bVar.k;
                aVar2.f10137m = bVar.f10162l;
                aVar2.f10138n = bVar.f10163m;
                aVar2.f10139o = bVar.f10164n;
                aVar2.f10142r = bVar.f10158g;
                for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                    String str4 = (String) arrayList3.get(i19);
                    if (str4 != null) {
                        ((a0) aVar2.f10126a.get(i19)).f10144b = aVar.p(str4);
                    }
                }
                aVar2.b(1);
                if (D(2)) {
                    StringBuilder sbT = ob.a.t("restoreAllState: back stack #", " (index ", i7);
                    sbT.append(aVar2.f10142r);
                    sbT.append("): ");
                    sbT.append(aVar2);
                    Log.v("FragmentManager", sbT.toString());
                    PrintWriter printWriter = new PrintWriter(new c0());
                    aVar2.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f10231d.add(aVar2);
                i7++;
            }
        } else {
            this.f10231d = null;
        }
        this.f10236i.set(vVar.f10256d);
        String str5 = vVar.f10257e;
        if (str5 != null) {
            i iVarP2 = aVar.p(str5);
            this.f10249w = iVarP2;
            q(iVarP2);
        }
        ArrayList arrayList4 = vVar.f10258f;
        if (arrayList4 != null) {
            for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                this.f10237j.put((String) arrayList4.get(i20), (c) vVar.f10259g.get(i20));
            }
        }
        this.C = new ArrayDeque(vVar.f10260h);
    }

    public final Bundle O() {
        int i7;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (fVar.f10173e) {
                if (D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                fVar.f10173e = false;
                fVar.b();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).c();
        }
        w(true);
        this.E = true;
        this.L.f10267g = true;
        da.a aVar = this.f10230c;
        aVar.getClass();
        HashMap map = (HashMap) aVar.f3848c;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            z zVar = (z) it3.next();
            if (zVar != null) {
                i iVar = zVar.f10282c;
                y yVar = new y(iVar);
                if (iVar.f10176a <= -1 || yVar.f10279m != null) {
                    yVar.f10279m = iVar.f10177b;
                } else {
                    Bundle bundle2 = new Bundle();
                    iVar.O.b(bundle2);
                    bundle2.putParcelable("android:support:fragments", iVar.f10194t.O());
                    zVar.f10280a.N0(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (iVar.f10178c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", iVar.f10178c);
                    }
                    if (iVar.f10179d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", iVar.f10179d);
                    }
                    if (!iVar.G) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", iVar.G);
                    }
                    yVar.f10279m = bundle3;
                    if (iVar.f10183h != null) {
                        if (bundle3 == null) {
                            yVar.f10279m = new Bundle();
                        }
                        yVar.f10279m.putString("android:target_state", iVar.f10183h);
                        int i10 = iVar.f10184i;
                        if (i10 != 0) {
                            yVar.f10279m.putInt("android:target_req_state", i10);
                        }
                    }
                }
                arrayList2.add(iVar.f10180e);
                if (D(2)) {
                    Log.v("FragmentManager", "Saved state of " + iVar + ": " + iVar.f10177b);
                }
            }
        }
        da.a aVar2 = this.f10230c;
        aVar2.getClass();
        ArrayList<y> arrayList3 = new ArrayList(((HashMap) aVar2.f3849d).values());
        if (!arrayList3.isEmpty()) {
            da.a aVar3 = this.f10230c;
            synchronized (((ArrayList) aVar3.f3847b)) {
                try {
                    if (((ArrayList) aVar3.f3847b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) aVar3.f3847b).size());
                        for (i iVar2 : (ArrayList) aVar3.f3847b) {
                            arrayList.add(iVar2.f10180e);
                            if (D(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + iVar2.f10180e + "): " + iVar2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList4 = this.f10231d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (i7 = 0; i7 < size; i7++) {
                    bVarArr[i7] = new b((a) this.f10231d.get(i7));
                    if (D(2)) {
                        StringBuilder sbT = ob.a.t("saveAllState: adding back stack #", ": ", i7);
                        sbT.append(this.f10231d.get(i7));
                        Log.v("FragmentManager", sbT.toString());
                    }
                }
            }
            v vVar = new v();
            vVar.f10257e = null;
            ArrayList arrayList5 = new ArrayList();
            vVar.f10258f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            vVar.f10259g = arrayList6;
            vVar.f10253a = arrayList2;
            vVar.f10254b = arrayList;
            vVar.f10255c = bVarArr;
            vVar.f10256d = this.f10236i.get();
            i iVar3 = this.f10249w;
            if (iVar3 != null) {
                vVar.f10257e = iVar3.f10180e;
            }
            arrayList5.addAll(this.f10237j.keySet());
            arrayList6.addAll(this.f10237j.values());
            vVar.f10260h = new ArrayList(this.C);
            bundle.putParcelable("state", vVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle(ob.a.q("result_", str), (Bundle) this.k.get(str));
            }
            for (y yVar2 : arrayList3) {
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", yVar2);
                bundle.putBundle("fragment_" + yVar2.f10269b, bundle4);
            }
        } else if (D(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void P() {
        synchronized (this.f10228a) {
            try {
                if (this.f10228a.size() == 1) {
                    this.f10246t.f10205e.removeCallbacks(this.M);
                    this.f10246t.f10205e.post(this.M);
                    X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(i iVar, boolean z10) {
        ViewGroup viewGroupZ = z(iVar);
        if (viewGroupZ == null || !(viewGroupZ instanceof m)) {
            return;
        }
        ((m) viewGroupZ).setDrawDisappearingViewsLast(!z10);
    }

    public final void R(i iVar, androidx.lifecycle.o oVar) {
        if (iVar.equals(this.f10230c.p(iVar.f10180e)) && (iVar.f10193s == null || iVar.f10192r == this)) {
            iVar.L = oVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void S(i iVar) {
        if (iVar != null) {
            if (!iVar.equals(this.f10230c.p(iVar.f10180e)) || (iVar.f10193s != null && iVar.f10192r != this)) {
                throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        i iVar2 = this.f10249w;
        this.f10249w = iVar;
        q(iVar2);
        q(this.f10249w);
    }

    public final void T(i iVar) {
        ViewGroup viewGroupZ = z(iVar);
        if (viewGroupZ != null) {
            n7.g gVar = iVar.H;
            if ((gVar == null ? 0 : gVar.f8887e) + (gVar == null ? 0 : gVar.f8886d) + (gVar == null ? 0 : gVar.f8885c) + (gVar == null ? 0 : gVar.f8884b) > 0) {
                if (viewGroupZ.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupZ.setTag(R.id.visible_removing_fragment_view_tag, iVar);
                }
                i iVar2 = (i) viewGroupZ.getTag(R.id.visible_removing_fragment_view_tag);
                n7.g gVar2 = iVar.H;
                boolean z10 = gVar2 != null ? gVar2.f8883a : false;
                if (iVar2.H == null) {
                    return;
                }
                iVar2.c().f8883a = z10;
            }
        }
    }

    public final void V() {
        for (z zVar : this.f10230c.u()) {
            i iVar = zVar.f10282c;
            if (iVar.F) {
                if (this.f10229b) {
                    this.H = true;
                } else {
                    iVar.F = false;
                    zVar.j();
                }
            }
        }
    }

    public final void W(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c0());
        k kVar = this.f10246t;
        if (kVar == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            kVar.f10207g.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h9.a, i9.j] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h9.a, i9.j] */
    public final void X() {
        synchronized (this.f10228a) {
            try {
                if (!this.f10228a.isEmpty()) {
                    m0 m0Var = this.f10235h;
                    m0Var.f1762a = true;
                    ?? r8 = m0Var.f1764c;
                    if (r8 != 0) {
                        r8.invoke();
                    }
                    return;
                }
                m0 m0Var2 = this.f10235h;
                ArrayList arrayList = this.f10231d;
                m0Var2.f1762a = (arrayList != null ? arrayList.size() : 0) > 0 && H(this.f10248v);
                ?? r10 = m0Var2.f1764c;
                if (r10 != 0) {
                    r10.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z a(i iVar) {
        String str = iVar.K;
        if (str != null) {
            q4.c.c(iVar, str);
        }
        if (D(2)) {
            Log.v("FragmentManager", "add: " + iVar);
        }
        z zVarF = f(iVar);
        iVar.f10192r = this;
        da.a aVar = this.f10230c;
        aVar.B(zVarF);
        if (!iVar.f10200z) {
            aVar.n(iVar);
            iVar.f10186l = false;
            iVar.I = false;
            if (E(iVar)) {
                this.D = true;
            }
        }
        return zVarF;
    }

    public final void b(k kVar, n4.h hVar, i iVar) {
        if (this.f10246t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f10246t = kVar;
        this.f10247u = hVar;
        this.f10248v = iVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10239m;
        if (iVar != null) {
            copyOnWriteArrayList.add(new s(iVar));
        } else if (kVar != null) {
            copyOnWriteArrayList.add(kVar);
        }
        if (this.f10248v != null) {
            X();
        }
        if (kVar != null) {
            l0 l0VarI = kVar.f10207g.i();
            this.f10234g = l0VarI;
            l0VarI.a(iVar != null ? iVar : kVar, this.f10235h);
        }
        if (iVar != null) {
            w wVar = iVar.f10192r.L;
            HashMap map = wVar.f10263c;
            w wVar2 = (w) map.get(iVar.f10180e);
            if (wVar2 == null) {
                wVar2 = new w(wVar.f10265e);
                map.put(iVar.f10180e, wVar2);
            }
            this.L = wVar2;
        } else if (kVar != null) {
            r0 r0VarB = kVar.f10207g.b();
            u4.a aVar = u4.a.f13061b;
            i9.l.e(aVar, "defaultCreationExtras");
            da.a aVar2 = new da.a(r0VarB, w.f10261h, aVar);
            o9.c cVarO = g5.a.O(w.class);
            String strK = cVarO.k();
            if (strK == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.L = (w) aVar2.z("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), cVarO);
        } else {
            this.L = new w(false);
        }
        w wVar3 = this.L;
        wVar3.f10267g = this.E || this.F;
        this.f10230c.f3850e = wVar3;
        k kVar2 = this.f10246t;
        if (kVar2 != null && iVar == null) {
            android.support.v4.media.session.r rVarD = kVar2.d();
            rVarD.H("android:support:fragments", new c.f(2, this));
            Bundle bundleS = rVarD.s("android:support:fragments");
            if (bundleS != null) {
                N(bundleS);
            }
        }
        k kVar3 = this.f10246t;
        if (kVar3 != null) {
            c.l lVar = kVar3.f10207g.f1778h;
            String strQ = ob.a.q("FragmentManager:", iVar != null ? ob.a.s(new StringBuilder(), iVar.f10180e, ":") : "");
            this.f10252z = lVar.c(ob.a.B(strQ, "StartActivityForResult"), new g.a(1), new p(this, 1));
            this.A = lVar.c(ob.a.B(strQ, "StartIntentSenderForResult"), new g.a(2), new p(this, 2));
            this.B = lVar.c(ob.a.B(strQ, "RequestPermissions"), new g.a(0), new p(this, 0));
        }
        k kVar4 = this.f10246t;
        if (kVar4 != null) {
            kVar4.f10207g.f(this.f10240n);
        }
        k kVar5 = this.f10246t;
        if (kVar5 != null) {
            j.j jVar = kVar5.f10207g;
            jVar.getClass();
            o oVar = this.f10241o;
            i9.l.e(oVar, "listener");
            jVar.f1780j.add(oVar);
        }
        k kVar6 = this.f10246t;
        if (kVar6 != null) {
            j.j jVar2 = kVar6.f10207g;
            jVar2.getClass();
            o oVar2 = this.f10242p;
            i9.l.e(oVar2, "listener");
            jVar2.f1781l.add(oVar2);
        }
        k kVar7 = this.f10246t;
        if (kVar7 != null) {
            j.j jVar3 = kVar7.f10207g;
            jVar3.getClass();
            o oVar3 = this.f10243q;
            i9.l.e(oVar3, "listener");
            jVar3.f1782m.add(oVar3);
        }
        k kVar8 = this.f10246t;
        if (kVar8 == null || iVar != null) {
            return;
        }
        j.j jVar4 = kVar8.f10207g;
        jVar4.getClass();
        q qVar = this.f10244r;
        i9.l.e(qVar, "provider");
        a2.b bVar = jVar4.f1773c;
        ((CopyOnWriteArrayList) bVar.f13c).add(qVar);
        ((Runnable) bVar.f12b).run();
    }

    public final void c(i iVar) {
        if (D(2)) {
            Log.v("FragmentManager", "attach: " + iVar);
        }
        if (iVar.f10200z) {
            iVar.f10200z = false;
            if (iVar.k) {
                return;
            }
            this.f10230c.n(iVar);
            if (D(2)) {
                Log.v("FragmentManager", "add from attach: " + iVar);
            }
            if (E(iVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.f10229b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f10230c.u().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((z) it.next()).f10282c.E;
            if (viewGroup != null) {
                hashSet.add(f.d(viewGroup, B()));
            }
        }
        return hashSet;
    }

    public final z f(i iVar) {
        String str = iVar.f10180e;
        da.a aVar = this.f10230c;
        z zVar = (z) ((HashMap) aVar.f3848c).get(str);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f10238l, aVar, iVar);
        zVar2.l(this.f10246t.f10204d.getClassLoader());
        zVar2.f10284e = this.f10245s;
        return zVar2;
    }

    public final void g(i iVar) {
        if (D(2)) {
            Log.v("FragmentManager", "detach: " + iVar);
        }
        if (iVar.f10200z) {
            return;
        }
        iVar.f10200z = true;
        if (iVar.k) {
            if (D(2)) {
                Log.v("FragmentManager", "remove from detach: " + iVar);
            }
            da.a aVar = this.f10230c;
            synchronized (((ArrayList) aVar.f3847b)) {
                ((ArrayList) aVar.f3847b).remove(iVar);
            }
            iVar.k = false;
            if (E(iVar)) {
                this.D = true;
            }
            T(iVar);
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.f10246t != null) {
            W(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (i iVar : this.f10230c.x()) {
            if (iVar != null) {
                iVar.D = true;
                if (z10) {
                    iVar.f10194t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f10245s >= 1) {
            for (i iVar : this.f10230c.x()) {
                if (iVar != null) {
                    if (!iVar.f10199y ? iVar.f10194t.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f10245s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (i iVar : this.f10230c.x()) {
            if (iVar != null && G(iVar)) {
                if (!iVar.f10199y ? iVar.f10194t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(iVar);
                    z10 = true;
                }
            }
        }
        if (this.f10232e != null) {
            for (int i7 = 0; i7 < this.f10232e.size(); i7++) {
                i iVar2 = (i) this.f10232e.get(i7);
                if (arrayList == null || !arrayList.contains(iVar2)) {
                    iVar2.getClass();
                }
            }
        }
        this.f10232e = arrayList;
        return z10;
    }

    public final void k() {
        boolean z10;
        this.G = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).c();
        }
        k kVar = this.f10246t;
        da.a aVar = this.f10230c;
        if (kVar != null) {
            z10 = ((w) aVar.f3850e).f10266f;
        } else {
            j.j jVar = kVar.f10204d;
            z10 = ob.a.A(jVar) ? !jVar.isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator it2 = this.f10237j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((c) it2.next()).f10165a) {
                    w wVar = (w) aVar.f3850e;
                    wVar.getClass();
                    if (D(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    wVar.e(str);
                }
            }
        }
        t(-1);
        k kVar2 = this.f10246t;
        if (kVar2 != null) {
            j.j jVar2 = kVar2.f10207g;
            jVar2.getClass();
            o oVar = this.f10241o;
            i9.l.e(oVar, "listener");
            jVar2.f1780j.remove(oVar);
        }
        k kVar3 = this.f10246t;
        if (kVar3 != null) {
            j.j jVar3 = kVar3.f10207g;
            jVar3.getClass();
            o oVar2 = this.f10240n;
            i9.l.e(oVar2, "listener");
            jVar3.f1779i.remove(oVar2);
        }
        k kVar4 = this.f10246t;
        if (kVar4 != null) {
            j.j jVar4 = kVar4.f10207g;
            jVar4.getClass();
            o oVar3 = this.f10242p;
            i9.l.e(oVar3, "listener");
            jVar4.f1781l.remove(oVar3);
        }
        k kVar5 = this.f10246t;
        if (kVar5 != null) {
            j.j jVar5 = kVar5.f10207g;
            jVar5.getClass();
            o oVar4 = this.f10243q;
            i9.l.e(oVar4, "listener");
            jVar5.f1782m.remove(oVar4);
        }
        k kVar6 = this.f10246t;
        if (kVar6 != null) {
            j.j jVar6 = kVar6.f10207g;
            jVar6.getClass();
            q qVar = this.f10244r;
            i9.l.e(qVar, "provider");
            a2.b bVar = jVar6.f1773c;
            ((CopyOnWriteArrayList) bVar.f13c).remove(qVar);
            if (((HashMap) bVar.f14d).remove(qVar) != null) {
                throw new ClassCastException();
            }
            ((Runnable) bVar.f12b).run();
        }
        this.f10246t = null;
        this.f10247u = null;
        this.f10248v = null;
        if (this.f10234g != null) {
            Iterator it3 = this.f10235h.f1763b.iterator();
            while (it3.hasNext()) {
                ((c.c) it3.next()).cancel();
            }
            this.f10234g = null;
        }
        a2.b bVar2 = this.f10252z;
        if (bVar2 != null) {
            bVar2.e0();
            this.A.e0();
            this.B.e0();
        }
    }

    public final void l(boolean z10) {
        if (z10 && this.f10246t != null) {
            W(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (i iVar : this.f10230c.x()) {
            if (iVar != null) {
                iVar.D = true;
                if (z10) {
                    iVar.f10194t.l(true);
                }
            }
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.f10246t != null) {
            W(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (i iVar : this.f10230c.x()) {
            if (iVar != null && z10) {
                iVar.f10194t.m(true);
            }
        }
    }

    public final void n() {
        for (i iVar : this.f10230c.v()) {
            if (iVar != null) {
                iVar.m();
                iVar.f10194t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f10245s >= 1) {
            for (i iVar : this.f10230c.x()) {
                if (iVar != null) {
                    if (!iVar.f10199y ? iVar.f10194t.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f10245s < 1) {
            return;
        }
        for (i iVar : this.f10230c.x()) {
            if (iVar != null && !iVar.f10199y) {
                iVar.f10194t.p();
            }
        }
    }

    public final void q(i iVar) {
        if (iVar != null) {
            if (iVar.equals(this.f10230c.p(iVar.f10180e))) {
                iVar.f10192r.getClass();
                boolean zH = H(iVar);
                Boolean bool = iVar.f10185j;
                if (bool == null || bool.booleanValue() != zH) {
                    iVar.f10185j = Boolean.valueOf(zH);
                    u uVar = iVar.f10194t;
                    uVar.X();
                    uVar.q(uVar.f10249w);
                }
            }
        }
    }

    public final void r(boolean z10) {
        if (z10 && this.f10246t != null) {
            W(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (i iVar : this.f10230c.x()) {
            if (iVar != null && z10) {
                iVar.f10194t.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f10245s < 1) {
            return false;
        }
        boolean z10 = false;
        for (i iVar : this.f10230c.x()) {
            if (iVar != null && G(iVar)) {
                if (!iVar.f10199y ? iVar.f10194t.s() : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(int i7) {
        try {
            this.f10229b = true;
            for (z zVar : ((HashMap) this.f10230c.f3848c).values()) {
                if (zVar != null) {
                    zVar.f10284e = i7;
                }
            }
            I(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((f) it.next()).c();
            }
            this.f10229b = false;
            w(true);
        } catch (Throwable th) {
            this.f10229b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        i iVar = this.f10248v;
        if (iVar != null) {
            sb2.append(iVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f10248v)));
            sb2.append("}");
        } else {
            k kVar = this.f10246t;
            if (kVar != null) {
                sb2.append(kVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f10246t)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strB = ob.a.B(str, "    ");
        da.a aVar = this.f10230c;
        ArrayList arrayList = (ArrayList) aVar.f3847b;
        String strB2 = ob.a.B(str, "    ");
        HashMap map = (HashMap) aVar.f3848c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z zVar : map.values()) {
                printWriter.print(str);
                if (zVar != null) {
                    i iVar = zVar.f10282c;
                    printWriter.println(iVar);
                    iVar.getClass();
                    printWriter.print(strB2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(iVar.f10196v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(iVar.f10197w));
                    printWriter.print(" mTag=");
                    printWriter.println(iVar.f10198x);
                    printWriter.print(strB2);
                    printWriter.print("mState=");
                    printWriter.print(iVar.f10176a);
                    printWriter.print(" mWho=");
                    printWriter.print(iVar.f10180e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(iVar.f10191q);
                    printWriter.print(strB2);
                    printWriter.print("mAdded=");
                    printWriter.print(iVar.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(iVar.f10186l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(iVar.f10187m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(iVar.f10188n);
                    printWriter.print(strB2);
                    printWriter.print("mHidden=");
                    printWriter.print(iVar.f10199y);
                    printWriter.print(" mDetached=");
                    printWriter.print(iVar.f10200z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(iVar.C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strB2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(iVar.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(iVar.G);
                    if (iVar.f10192r != null) {
                        printWriter.print(strB2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(iVar.f10192r);
                    }
                    if (iVar.f10193s != null) {
                        printWriter.print(strB2);
                        printWriter.print("mHost=");
                        printWriter.println(iVar.f10193s);
                    }
                    if (iVar.f10195u != null) {
                        printWriter.print(strB2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(iVar.f10195u);
                    }
                    if (iVar.f10181f != null) {
                        printWriter.print(strB2);
                        printWriter.print("mArguments=");
                        printWriter.println(iVar.f10181f);
                    }
                    if (iVar.f10177b != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(iVar.f10177b);
                    }
                    if (iVar.f10178c != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(iVar.f10178c);
                    }
                    if (iVar.f10179d != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(iVar.f10179d);
                    }
                    Object objP = iVar.f10182g;
                    if (objP == null) {
                        u uVar = iVar.f10192r;
                        objP = (uVar == null || (str2 = iVar.f10183h) == null) ? null : uVar.f10230c.p(str2);
                    }
                    if (objP != null) {
                        printWriter.print(strB2);
                        printWriter.print("mTarget=");
                        printWriter.print(objP);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(iVar.f10184i);
                    }
                    printWriter.print(strB2);
                    printWriter.print("mPopDirection=");
                    n7.g gVar = iVar.H;
                    printWriter.println(gVar == null ? false : gVar.f8883a);
                    n7.g gVar2 = iVar.H;
                    if ((gVar2 == null ? 0 : gVar2.f8884b) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getEnterAnim=");
                        n7.g gVar3 = iVar.H;
                        printWriter.println(gVar3 == null ? 0 : gVar3.f8884b);
                    }
                    n7.g gVar4 = iVar.H;
                    if ((gVar4 == null ? 0 : gVar4.f8885c) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getExitAnim=");
                        n7.g gVar5 = iVar.H;
                        printWriter.println(gVar5 == null ? 0 : gVar5.f8885c);
                    }
                    n7.g gVar6 = iVar.H;
                    if ((gVar6 == null ? 0 : gVar6.f8886d) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getPopEnterAnim=");
                        n7.g gVar7 = iVar.H;
                        printWriter.println(gVar7 == null ? 0 : gVar7.f8886d);
                    }
                    n7.g gVar8 = iVar.H;
                    if ((gVar8 == null ? 0 : gVar8.f8887e) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getPopExitAnim=");
                        n7.g gVar9 = iVar.H;
                        printWriter.println(gVar9 == null ? 0 : gVar9.f8887e);
                    }
                    if (iVar.E != null) {
                        printWriter.print(strB2);
                        printWriter.print("mContainer=");
                        printWriter.println(iVar.E);
                    }
                    k kVar = iVar.f10193s;
                    if ((kVar == null ? null : kVar.f10204d) != null) {
                        r0 r0VarB = iVar.b();
                        n4.e eVar = w4.a.f14135c;
                        i9.l.e(r0VarB, "store");
                        u4.a aVar2 = u4.a.f13061b;
                        i9.l.e(aVar2, "defaultCreationExtras");
                        da.a aVar3 = new da.a(r0VarB, eVar, aVar2);
                        o9.c cVarO = g5.a.O(w4.a.class);
                        String strK = cVarO.k();
                        if (strK == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        s.r0 r0Var = ((w4.a) aVar3.z("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), cVarO)).f14136b;
                        if (r0Var.f12491c > 0) {
                            printWriter.print(strB2);
                            printWriter.println("Loaders:");
                            if (r0Var.f12491c > 0) {
                                if (r0Var.f(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strB2);
                                printWriter.print("  #");
                                printWriter.print(r0Var.f12489a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strB2);
                    printWriter.println("Child " + iVar.f10194t + ":");
                    iVar.f10194t.u(ob.a.B(strB2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size3; i7++) {
                i iVar2 = (i) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(iVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f10232e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                i iVar3 = (i) this.f10232e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(iVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f10231d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar4 = (a) this.f10231d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar4.toString());
                aVar4.e(strB, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f10236i.get());
        synchronized (this.f10228a) {
            try {
                int size4 = this.f10228a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (a) this.f10228a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10246t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10247u);
        if (this.f10248v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10248v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10245s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(boolean z10) {
        if (this.f10229b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f10246t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f10246t.f10205e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean w(boolean z10) {
        boolean z11;
        v(z10);
        boolean z12 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f10228a) {
                if (this.f10228a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f10228a.size();
                        int i7 = 0;
                        z11 = false;
                        while (i7 < size) {
                            ((a) this.f10228a.get(i7)).f(arrayList, arrayList2);
                            i7++;
                            z11 = true;
                        }
                        this.f10228a.clear();
                        this.f10246t.f10205e.removeCallbacks(this.M);
                    } catch (Throwable th) {
                        this.f10228a.clear();
                        this.f10246t.f10205e.removeCallbacks(this.M);
                        throw th;
                    }
                }
            }
            if (!z11) {
                break;
            }
            this.f10229b = true;
            try {
                M(this.I, this.J);
                d();
                z12 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        X();
        if (this.H) {
            this.H = false;
            V();
        }
        ((HashMap) this.f10230c.f3848c).values().removeAll(Collections.singleton(null));
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    public final void x(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        ViewGroup viewGroup;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        int i14;
        da.a aVar = this.f10230c;
        boolean z14 = ((a) arrayList.get(i7)).f10139o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(aVar.x());
        i iVar = this.f10249w;
        int i15 = i7;
        boolean z15 = false;
        while (true) {
            int i16 = 1;
            if (i15 >= i10) {
                boolean z16 = z14;
                this.K.clear();
                if (!z16 && this.f10245s >= 1) {
                    for (int i17 = i7; i17 < i10; i17++) {
                        Iterator it = ((a) arrayList.get(i17)).f10126a.iterator();
                        while (it.hasNext()) {
                            i iVar2 = ((a0) it.next()).f10144b;
                            if (iVar2 != null && iVar2.f10192r != null) {
                                aVar.B(f(iVar2));
                            }
                        }
                    }
                }
                for (int i18 = i7; i18 < i10; i18++) {
                    a aVar2 = (a) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                        aVar2.b(-1);
                        u uVar = aVar2.f10140p;
                        ArrayList arrayList4 = aVar2.f10126a;
                        boolean z17 = true;
                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                            a0 a0Var = (a0) arrayList4.get(size);
                            i iVar3 = a0Var.f10144b;
                            if (iVar3 != null) {
                                if (iVar3.H != null) {
                                    iVar3.c().f8883a = z17;
                                }
                                int i19 = aVar2.f10131f;
                                char c10 = 8194;
                                if (i19 != 4097) {
                                    if (i19 != 8194) {
                                        c10 = 4100;
                                        if (i19 != 8197) {
                                            c10 = i19 != 4099 ? i19 != 4100 ? (char) 0 : (char) 8197 : (char) 4099;
                                        }
                                    } else {
                                        c10 = 4097;
                                    }
                                }
                                if (iVar3.H != null || c10 != 0) {
                                    iVar3.c();
                                    iVar3.H.getClass();
                                }
                                iVar3.c();
                                iVar3.H.getClass();
                            }
                            switch (a0Var.f10143a) {
                                case 1:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    z17 = true;
                                    uVar.Q(iVar3, true);
                                    uVar.L(iVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a0Var.f10143a);
                                case 3:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    uVar.a(iVar3);
                                    z17 = true;
                                    break;
                                case 4:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    uVar.getClass();
                                    U(iVar3);
                                    z17 = true;
                                    break;
                                case 5:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    uVar.Q(iVar3, true);
                                    uVar.C(iVar3);
                                    z17 = true;
                                    break;
                                case 6:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    uVar.c(iVar3);
                                    z17 = true;
                                    break;
                                case 7:
                                    iVar3.r(a0Var.f10146d, a0Var.f10147e, a0Var.f10148f, a0Var.f10149g);
                                    uVar.Q(iVar3, true);
                                    uVar.g(iVar3);
                                    z17 = true;
                                    break;
                                case 8:
                                    uVar.S(null);
                                    z17 = true;
                                    break;
                                case 9:
                                    uVar.S(iVar3);
                                    z17 = true;
                                    break;
                                case 10:
                                    uVar.R(iVar3, a0Var.f10150h);
                                    z17 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar2.b(1);
                        u uVar2 = aVar2.f10140p;
                        ArrayList arrayList5 = aVar2.f10126a;
                        int size2 = arrayList5.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            a0 a0Var2 = (a0) arrayList5.get(i20);
                            i iVar4 = a0Var2.f10144b;
                            if (iVar4 != null) {
                                if (iVar4.H != null) {
                                    iVar4.c().f8883a = false;
                                }
                                int i21 = aVar2.f10131f;
                                if (iVar4.H != null || i21 != 0) {
                                    iVar4.c();
                                    iVar4.H.getClass();
                                }
                                iVar4.c();
                                iVar4.H.getClass();
                            }
                            switch (a0Var2.f10143a) {
                                case 1:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.Q(iVar4, false);
                                    uVar2.a(iVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a0Var2.f10143a);
                                case 3:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.L(iVar4);
                                    break;
                                case 4:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.C(iVar4);
                                    break;
                                case 5:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.Q(iVar4, false);
                                    U(iVar4);
                                    break;
                                case 6:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.g(iVar4);
                                    break;
                                case 7:
                                    iVar4.r(a0Var2.f10146d, a0Var2.f10147e, a0Var2.f10148f, a0Var2.f10149g);
                                    uVar2.Q(iVar4, false);
                                    uVar2.c(iVar4);
                                    break;
                                case 8:
                                    uVar2.S(iVar4);
                                    break;
                                case 9:
                                    uVar2.S(null);
                                    break;
                                case 10:
                                    uVar2.R(iVar4, a0Var2.f10151i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                for (int i22 = i7; i22 < i10; i22++) {
                    a aVar3 = (a) arrayList.get(i22);
                    if (zBooleanValue) {
                        for (int size3 = aVar3.f10126a.size() - 1; size3 >= 0; size3--) {
                            i iVar5 = ((a0) aVar3.f10126a.get(size3)).f10144b;
                            if (iVar5 != null) {
                                f(iVar5).j();
                            }
                        }
                    } else {
                        Iterator it2 = aVar3.f10126a.iterator();
                        while (it2.hasNext()) {
                            i iVar6 = ((a0) it2.next()).f10144b;
                            if (iVar6 != null) {
                                f(iVar6).j();
                            }
                        }
                    }
                }
                I(this.f10245s, true);
                HashSet<f> hashSet = new HashSet();
                for (int i23 = i7; i23 < i10; i23++) {
                    Iterator it3 = ((a) arrayList.get(i23)).f10126a.iterator();
                    while (it3.hasNext()) {
                        i iVar7 = ((a0) it3.next()).f10144b;
                        if (iVar7 != null && (viewGroup = iVar7.E) != null) {
                            hashSet.add(f.d(viewGroup, B()));
                        }
                    }
                }
                for (f fVar : hashSet) {
                    fVar.f10172d = zBooleanValue;
                    synchronized (fVar.f10170b) {
                        fVar.e();
                        fVar.f10173e = false;
                        int size4 = fVar.f10170b.size() - 1;
                        if (size4 >= 0) {
                            ((d0) fVar.f10170b.get(size4)).getClass();
                            throw null;
                        }
                    }
                    fVar.b();
                }
                for (int i24 = i7; i24 < i10; i24++) {
                    a aVar4 = (a) arrayList.get(i24);
                    if (((Boolean) arrayList2.get(i24)).booleanValue() && aVar4.f10142r >= 0) {
                        aVar4.f10142r = -1;
                    }
                    aVar4.getClass();
                }
                return;
            }
            a aVar5 = (a) arrayList.get(i15);
            if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                z10 = z14;
                i11 = i15;
                z11 = z15;
                int i25 = 1;
                ArrayList arrayList6 = this.K;
                ArrayList arrayList7 = aVar5.f10126a;
                int size5 = arrayList7.size() - 1;
                while (size5 >= 0) {
                    a0 a0Var3 = (a0) arrayList7.get(size5);
                    int i26 = a0Var3.f10143a;
                    if (i26 == i25) {
                        arrayList6.remove(a0Var3.f10144b);
                    } else if (i26 != 3) {
                        switch (i26) {
                            case 6:
                                arrayList6.add(a0Var3.f10144b);
                                break;
                            case 7:
                                arrayList6.remove(a0Var3.f10144b);
                                break;
                            case 8:
                                iVar = null;
                                break;
                            case 9:
                                iVar = a0Var3.f10144b;
                                break;
                            case 10:
                                a0Var3.f10151i = a0Var3.f10150h;
                                break;
                        }
                    } else {
                        arrayList6.add(a0Var3.f10144b);
                    }
                    size5--;
                    i25 = 1;
                }
            } else {
                ArrayList arrayList8 = this.K;
                ArrayList arrayList9 = aVar5.f10126a;
                int i27 = 0;
                while (i27 < arrayList9.size()) {
                    a0 a0Var4 = (a0) arrayList9.get(i27);
                    int i28 = a0Var4.f10143a;
                    if (i28 != i16) {
                        z12 = z14;
                        if (i28 != 2) {
                            if (i28 == 3 || i28 == 6) {
                                arrayList8.remove(a0Var4.f10144b);
                                i iVar8 = a0Var4.f10144b;
                                if (iVar8 == iVar) {
                                    arrayList9.add(i27, new a0(9, iVar8));
                                    i27++;
                                    i12 = i15;
                                    z13 = z15;
                                    i13 = 1;
                                    iVar = null;
                                }
                            } else if (i28 != 7) {
                                if (i28 == 8) {
                                    arrayList9.add(i27, new a0(9, iVar, 0));
                                    a0Var4.f10145c = true;
                                    i27++;
                                    iVar = a0Var4.f10144b;
                                }
                            }
                            i12 = i15;
                            z13 = z15;
                            i13 = 1;
                        } else {
                            i iVar9 = a0Var4.f10144b;
                            int i29 = iVar9.f10197w;
                            int size6 = arrayList8.size() - 1;
                            boolean z18 = false;
                            while (size6 >= 0) {
                                int i30 = size6;
                                i iVar10 = (i) arrayList8.get(size6);
                                int i31 = i15;
                                if (iVar10.f10197w != i29) {
                                    z15 = z15;
                                } else if (iVar10 == iVar9) {
                                    z15 = z15;
                                    z18 = true;
                                } else {
                                    if (iVar10 == iVar) {
                                        i14 = 0;
                                        arrayList9.add(i27, new a0(9, iVar10, 0));
                                        i27++;
                                        iVar = null;
                                    } else {
                                        i14 = 0;
                                    }
                                    a0 a0Var5 = new a0(3, iVar10, i14);
                                    a0Var5.f10146d = a0Var4.f10146d;
                                    a0Var5.f10148f = a0Var4.f10148f;
                                    a0Var5.f10147e = a0Var4.f10147e;
                                    a0Var5.f10149g = a0Var4.f10149g;
                                    arrayList9.add(i27, a0Var5);
                                    arrayList8.remove(iVar10);
                                    i27++;
                                    iVar = iVar;
                                }
                                size6 = i30 - 1;
                                z15 = z15;
                                i15 = i31;
                            }
                            i12 = i15;
                            z13 = z15;
                            i13 = 1;
                            if (z18) {
                                arrayList9.remove(i27);
                                i27--;
                            } else {
                                a0Var4.f10143a = 1;
                                a0Var4.f10145c = true;
                                arrayList8.add(iVar9);
                            }
                        }
                        i27 += i13;
                        z14 = z12;
                        z15 = z13;
                        i15 = i12;
                        i16 = 1;
                    } else {
                        z12 = z14;
                    }
                    i12 = i15;
                    z13 = z15;
                    i13 = 1;
                    arrayList8.add(a0Var4.f10144b);
                    i27 += i13;
                    z14 = z12;
                    z15 = z13;
                    i15 = i12;
                    i16 = 1;
                }
                z10 = z14;
                i11 = i15;
                z11 = z15;
            }
            z15 = z11 || aVar5.f10132g;
            i15 = i11 + 1;
            z14 = z10;
        }
    }

    public final i y(int i7) {
        da.a aVar = this.f10230c;
        ArrayList arrayList = (ArrayList) aVar.f3847b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (iVar != null && iVar.f10196v == i7) {
                return iVar;
            }
        }
        for (z zVar : ((HashMap) aVar.f3848c).values()) {
            if (zVar != null) {
                i iVar2 = zVar.f10282c;
                if (iVar2.f10196v == i7) {
                    return iVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup z(i iVar) {
        ViewGroup viewGroup = iVar.E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (iVar.f10197w <= 0 || !this.f10247u.V()) {
            return null;
        }
        View viewU = this.f10247u.U(iVar.f10197w);
        if (viewU instanceof ViewGroup) {
            return (ViewGroup) viewU;
        }
        return null;
    }
}
