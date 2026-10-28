package u6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f13071a = new ArrayList();

    public static void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strN = ((z6.a) it.next()).n();
            ArrayList arrayList2 = f13071a;
            if (!d7.a.c(strN, arrayList2)) {
                arrayList2.add(strN);
            }
        }
    }
}
