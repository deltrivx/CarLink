package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements a5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.r f1043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f1045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8.o f1046d;

    public k0(android.support.v4.media.session.r rVar, s0 s0Var) {
        i9.l.e(rVar, "savedStateRegistry");
        this.f1043a = rVar;
        this.f1046d = t8.a.d(new j0(0, s0Var));
    }

    @Override // a5.d
    public final Bundle a() {
        Bundle bundleJ = k9.a.j((t8.j[]) Arrays.copyOf(new t8.j[0], 0));
        Bundle bundle = this.f1045c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        for (Map.Entry entry : ((l0) this.f1046d.getValue()).f1047b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((c.f) ((g0) entry.getValue()).f1033a.f1432a).a();
            if (!bundleA.isEmpty()) {
                i9.l.e(str, "key");
                bundleJ.putBundle(str, bundleA);
            }
        }
        this.f1044b = false;
        return bundleJ;
    }

    public final void b() {
        if (this.f1044b) {
            return;
        }
        Bundle bundleS = this.f1043a.s("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleJ = k9.a.j((t8.j[]) Arrays.copyOf(new t8.j[0], 0));
        Bundle bundle = this.f1045c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        if (bundleS != null) {
            bundleJ.putAll(bundleS);
        }
        this.f1045c = bundleJ;
        this.f1044b = true;
    }
}
