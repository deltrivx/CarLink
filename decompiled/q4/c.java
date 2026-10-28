package q4;

import android.util.Log;
import i9.l;
import p4.i;
import p4.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10948a = b.f10947a;

    public static b a(i iVar) {
        while (iVar != null) {
            if (iVar.isAdded()) {
                iVar.j();
            }
            iVar = iVar.f10195u;
        }
        return f10948a;
    }

    public static void b(a aVar) {
        if (u.D(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f10946a.getClass().getName()), aVar);
        }
    }

    public static final void c(i iVar, String str) {
        l.e(str, "previousFragmentId");
        b(new a(iVar, "Attempting to reuse fragment " + iVar + " with previous ID " + str));
        a(iVar).getClass();
    }
}
