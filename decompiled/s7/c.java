package s7;

import android.os.Handler;
import android.os.Looper;
import n8.k;
import n8.n;
import t8.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12586a = new c();

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((e) e.f12588f.getValue()).f12589a) {
            if (zBooleanValue) {
                o oVar = n.f8927a;
                new Handler(Looper.getMainLooper()).post(new k(0));
            } else {
                n.c("FLOAT_ICON_SWITCH");
            }
        }
        return z.f12851a;
    }
}
