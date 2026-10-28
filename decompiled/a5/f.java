package a5;

import android.os.Bundle;
import android.support.v4.media.session.r;
import androidx.lifecycle.o;
import i9.l;
import java.util.Arrays;
import java.util.Map;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5.a f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f46b;

    public f(c5.a aVar) {
        this.f45a = aVar;
        this.f46b = new r(1, aVar);
    }

    public final void a(Bundle bundle) {
        c5.a aVar = this.f45a;
        g gVar = aVar.f2425a;
        if (!aVar.f2429e) {
            aVar.a();
        }
        if (gVar.g().f1072c.compareTo(o.f1059d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + gVar.g().f1072c).toString());
        }
        if (aVar.f2431g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleE = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleE = a.a.E("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f2430f = bundleE;
        aVar.f2431g = true;
    }

    public final void b(Bundle bundle) {
        c5.a aVar = this.f45a;
        Bundle bundleJ = k9.a.j((j[]) Arrays.copyOf(new j[0], 0));
        Bundle bundle2 = aVar.f2430f;
        if (bundle2 != null) {
            bundleJ.putAll(bundle2);
        }
        synchronized (aVar.f2427c) {
            for (Map.Entry entry : aVar.f2428d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                l.e(str, "key");
                bundleJ.putBundle(str, bundleA);
            }
        }
        if (bundleJ.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleJ);
    }
}
