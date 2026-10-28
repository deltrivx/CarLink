package oa;

import java.util.LinkedHashMap;
import java.util.Map;
import u8.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9631a;

    public t(LinkedHashMap linkedHashMap) {
        this.f9631a = linkedHashMap;
    }

    public final t a() {
        LinkedHashMap linkedHashMap = this.f9631a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0.S0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            e eVar = (e) entry.getValue();
            linkedHashMap2.put(key, new e(eVar.f9583a, eVar.f9584b, eVar.f9585c, true));
        }
        return new t(linkedHashMap2);
    }
}
