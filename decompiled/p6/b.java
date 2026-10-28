package p6;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.z;
import java.util.ArrayList;
import p4.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q6.b] */
    @Override // p6.a
    public final void e(int i7) {
        Bundle arguments = this.f10295e.getArguments();
        if (i7 != (arguments == null ? 0 : arguments.getInt("request_code"))) {
            return;
        }
        ArrayList arrayList = u6.c.f13072a;
        synchronized (u6.c.class) {
            u6.c.f13072a.remove(Integer.valueOf(i7));
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
    @Override // p6.a
    public final void g(Activity activity, ArrayList arrayList, int i7) {
        String[] strArr;
        if (!d7.a.t()) {
            z zVar = new z(18, this);
            Handler handler = d7.b.f3791a;
            d7.b.f3791a.postAtTime(zVar, this.f10291a, SystemClock.uptimeMillis());
            return;
        }
        if (arrayList.isEmpty()) {
            strArr = new String[0];
        } else {
            strArr = new String[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                strArr[i10] = ((z6.a) arrayList.get(i10)).n();
            }
        }
        ?? r8 = this.f10295e;
        try {
            r8.requestPermissions(strArr, i7);
        } catch (Exception e7) {
            e7.printStackTrace();
            Activity activity2 = r8.getActivity();
            if (!(activity2 instanceof l) && !d7.a.q(activity2)) {
                try {
                    activity2.requestPermissions(strArr, i7);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        u6.b.a(arrayList);
    }
}
