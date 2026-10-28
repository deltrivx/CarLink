package m0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import b3.q0;
import h9.k;
import java.util.ArrayList;
import o0.g;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(n0.a aVar, final Context context, final boolean z10, final CharSequence charSequence, final long j5) {
        if (q0.c(j5) || charSequence.length() == 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayListA = b.a(context);
        if (arrayListA.isEmpty()) {
            return;
        }
        aVar.a();
        int size = arrayListA.size();
        for (int i7 = 0; i7 < size; i7++) {
            final ResolveInfo resolveInfo = (ResolveInfo) arrayListA.get(i7);
            aVar.f8700a.a(new o0.d(new o0.a(i7), resolveInfo.loadLabel(packageManager).toString(), 0, new k() { // from class: m0.c
                @Override // h9.k
                public final Object invoke(Object obj) {
                    b.f8392a.d(context, resolveInfo, Boolean.valueOf(z10), charSequence, new q0(j5));
                    ((g) obj).close();
                    return z.f12851a;
                }
            }));
        }
        aVar.a();
    }
}
