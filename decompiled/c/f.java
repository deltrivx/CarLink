package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements a5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1715b;

    public /* synthetic */ f(int i7, Object obj) {
        this.f1714a = i7;
        this.f1715b = obj;
    }

    @Override // a5.d
    public final Bundle a() {
        t8.j[] jVarArr;
        switch (this.f1714a) {
            case 0:
                p4.l lVar = (p4.l) this.f1715b;
                Bundle bundle = new Bundle();
                l lVar2 = lVar.f1778h;
                lVar2.getClass();
                LinkedHashMap linkedHashMap = lVar2.f1746b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar2.f1748d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar2.f1751g));
                return bundle;
            case 1:
                j.j jVar = (j.j) this.f1715b;
                while (p4.l.k(((p4.k) jVar.f10208s.f7772b).f10206f)) {
                }
                jVar.f10209t.d(androidx.lifecycle.n.ON_STOP);
                return new Bundle();
            case 2:
                return ((p4.u) this.f1715b).O();
            case 3:
                Map mapB = ((o1.g) this.f1715b).b();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                b3.r rVar = (b3.r) this.f1715b;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) rVar.f1436e;
                i9.l.e(linkedHashMap2, "<this>");
                int size = linkedHashMap2.size();
                Map linkedHashMap3 = u8.x.f13123a;
                Map linkedHashMap4 = size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap2) : u8.c0.U0(linkedHashMap2) : linkedHashMap3;
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    rVar.s(((fc.h0) ((fc.t) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) rVar.f1434c;
                i9.l.e(linkedHashMap5, "<this>");
                int size2 = linkedHashMap5.size();
                if (size2 != 0) {
                    linkedHashMap3 = size2 != 1 ? new LinkedHashMap(linkedHashMap5) : u8.c0.U0(linkedHashMap5);
                }
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    rVar.s(((a5.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap6 = (LinkedHashMap) rVar.f1433b;
                if (linkedHashMap6.isEmpty()) {
                    jVarArr = new t8.j[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap6.size());
                    for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
                        arrayList.add(new t8.j((String) entry4.getKey(), entry4.getValue()));
                    }
                    jVarArr = (t8.j[]) arrayList.toArray(new t8.j[0]);
                }
                return k9.a.j((t8.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        }
    }
}
