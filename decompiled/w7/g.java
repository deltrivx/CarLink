package w7;

import android.app.Activity;
import b3.r;
import i9.l;
import java.util.ArrayList;
import java.util.List;
import t8.o;
import u0.k;
import w0.e1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f14171a = t8.a.d(new e1(6));

    public static boolean a(Activity activity, String str, List list) {
        if (activity == null) {
            hc.c cVar = n8.c.f8897a;
            n8.c.j(0, "无法获取 Activity 上下文");
            return false;
        }
        if (d7.a.u(activity, list)) {
            return true;
        }
        b(activity, str, list);
        return false;
    }

    public static void b(Activity activity, String str, List list) {
        l.e(str, "label");
        if (activity == null) {
            hc.c cVar = n8.c.f8897a;
            n8.c.j(0, "无法获取 Activity 上下文");
            return;
        }
        r rVar = new r(activity);
        if (!list.isEmpty()) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                z6.a aVar = (z6.a) list.get(i7);
                ArrayList arrayList = (ArrayList) rVar.f1432a;
                arrayList.remove(aVar);
                arrayList.add(aVar);
            }
        }
        rVar.q(new k(27, activity, str));
    }
}
