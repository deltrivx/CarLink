package p4;

import android.util.Log;
import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n4.e f10261h = new n4.e(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10265e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10262b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10263c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10264d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10266f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10267g = false;

    public w(boolean z10) {
        this.f10265e = z10;
    }

    @Override // androidx.lifecycle.o0
    public final void b() {
        if (u.D(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f10266f = true;
    }

    public final void c(i iVar) {
        if (this.f10267g) {
            if (u.D(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = iVar.f10180e;
        HashMap map = this.f10262b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(iVar.f10180e, iVar);
        if (u.D(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + iVar);
        }
    }

    public final void d(i iVar) {
        if (u.D(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + iVar);
        }
        e(iVar.f10180e);
    }

    public final void e(String str) {
        HashMap map = this.f10263c;
        w wVar = (w) map.get(str);
        if (wVar != null) {
            wVar.b();
            map.remove(str);
        }
        HashMap map2 = this.f10264d;
        r0 r0Var = (r0) map2.get(str);
        if (r0Var != null) {
            r0Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f10262b.equals(wVar.f10262b) && this.f10263c.equals(wVar.f10263c) && this.f10264d.equals(wVar.f10264d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(i iVar) {
        if (this.f10267g) {
            if (u.D(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10262b.remove(iVar.f10180e) == null || !u.D(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + iVar);
        }
    }

    public final int hashCode() {
        return this.f10264d.hashCode() + ((this.f10263c.hashCode() + (this.f10262b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f10262b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f10263c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f10264d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
