package d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import f1.q1;
import f1.x2;
import h9.k;
import i9.n;
import n1.g;
import r2.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3529a = new b(1);

    @Override // h9.k
    public final Object invoke(Object obj) {
        x2 x2Var = n0.f11343b;
        g gVar = (g) ((q1) obj);
        gVar.getClass();
        Context baseContext = (Context) f1.b.t(gVar, x2Var);
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        baseContext = null;
        return (Activity) baseContext;
    }
}
