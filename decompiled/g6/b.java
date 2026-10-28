package g6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5935a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f5935a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return f6.a.a(arrayList);
    }

    public final void b(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        HashMap map = this.f5935a;
        Integer num = (Integer) map.get(numValueOf);
        if (num == null) {
            num = 0;
        }
        map.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() + 1));
    }
}
