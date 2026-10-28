package p4;

import android.util.Log;
import android.view.ViewGroup;
import com.baidu.carlifevehicle.R;
import e4.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10170b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10171c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10172d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10173e = false;

    public f(ViewGroup viewGroup) {
        this.f10169a = viewGroup;
    }

    public static f d(ViewGroup viewGroup, n4.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof f) {
            return (f) tag;
        }
        eVar.getClass();
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public final void a(ArrayList arrayList, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((d0) it.next()).getClass();
            throw null;
        }
        if (u.D(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        ((d0) arrayList.get(arrayList.size() - 1)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((d0) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            ((d0) it3.next()).b();
            throw null;
        }
        HashMap map = new HashMap();
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            ((e) it4.next()).getClass();
            throw null;
        }
        Iterator it5 = arrayList3.iterator();
        if (it5.hasNext()) {
            ((e) it5.next()).getClass();
            map.put(null, Boolean.FALSE);
            throw null;
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        this.f10169a.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            ((d) it6.next()).getClass();
            throw null;
        }
        Iterator it7 = arrayList5.iterator();
        if (it7.hasNext()) {
            ((d) it7.next()).getClass();
            if (!zContainsValue || !u.D(2)) {
                throw null;
            }
            Log.v("FragmentManager", "Ignoring Animation set on null as Animations cannot run alongside Transitions.");
            throw null;
        }
        Iterator it8 = arrayList4.iterator();
        if (it8.hasNext()) {
            ((d0) it8.next()).getClass();
            throw null;
        }
        arrayList4.clear();
        if (u.D(2)) {
            Log.v("FragmentManager", "Completed executing operations from null to null");
        }
    }

    public final void b() {
        if (this.f10173e) {
            return;
        }
        ViewGroup viewGroup = this.f10169a;
        WeakHashMap weakHashMap = l0.f4369a;
        if (!viewGroup.isAttachedToWindow()) {
            c();
            this.f10172d = false;
            return;
        }
        synchronized (this.f10170b) {
            try {
                if (!this.f10170b.isEmpty()) {
                    ArrayList<d0> arrayList = new ArrayList(this.f10171c);
                    this.f10171c.clear();
                    for (d0 d0Var : arrayList) {
                        if (u.D(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + d0Var);
                        }
                        d0Var.a();
                        this.f10171c.add(d0Var);
                    }
                    e();
                    ArrayList arrayList2 = new ArrayList(this.f10170b);
                    this.f10170b.clear();
                    this.f10171c.addAll(arrayList2);
                    if (u.D(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((d0) it.next()).b();
                    }
                    a(arrayList2, this.f10172d);
                    this.f10172d = false;
                    if (u.D(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (u.D(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f10169a;
        WeakHashMap weakHashMap = l0.f4369a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f10170b) {
            try {
                e();
                Iterator it = this.f10170b.iterator();
                while (it.hasNext()) {
                    ((d0) it.next()).b();
                }
                for (d0 d0Var : new ArrayList(this.f10171c)) {
                    if (u.D(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zIsAttachedToWindow ? "" : "Container " + this.f10169a + " is not attached to window. ");
                        sb2.append("Cancelling running operation ");
                        sb2.append(d0Var);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    d0Var.a();
                }
                for (d0 d0Var2 : new ArrayList(this.f10170b)) {
                    if (u.D(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: ");
                        sb3.append(zIsAttachedToWindow ? "" : "Container " + this.f10169a + " is not attached to window. ");
                        sb3.append("Cancelling pending operation ");
                        sb3.append(d0Var2);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    d0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        Iterator it = this.f10170b.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).getClass();
        }
    }
}
