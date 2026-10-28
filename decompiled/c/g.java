package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4.l f1719b;

    public /* synthetic */ g(p4.l lVar, int i7) {
        this.f1718a = i7;
        this.f1719b = lVar;
    }

    @Override // e.b
    public final void a(o oVar) {
        switch (this.f1718a) {
            case 0:
                i9.l.e(oVar, "it");
                p4.l lVar = this.f1719b;
                Bundle bundleS = lVar.f1774d.f46b.s("android:support:activity-result");
                if (bundleS != null) {
                    l lVar2 = lVar.f1778h;
                    LinkedHashMap linkedHashMap = lVar2.f1746b;
                    LinkedHashMap linkedHashMap2 = lVar2.f1745a;
                    Bundle bundle = lVar2.f1751g;
                    ArrayList<Integer> integerArrayList = bundleS.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleS.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleS.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            lVar2.f1748d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleS.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            String str = stringArrayList.get(i7);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    i9.b0.b(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i7);
                            i9.l.d(num2, "rcs[i]");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i7);
                            i9.l.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            lVar2.f1746b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                p4.k kVar = (p4.k) ((j.j) this.f1719b).f10208s.f7772b;
                kVar.f10206f.b(kVar, kVar, null);
                break;
        }
    }
}
