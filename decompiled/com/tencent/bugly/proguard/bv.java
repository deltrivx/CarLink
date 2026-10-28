package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bv extends m implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList<bu> f3392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Map<String, String> f3393g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f3394a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3395b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3396c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<bu> f3397d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f3398e = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3394a = kVar.a(this.f3394a, 0, true);
        this.f3395b = kVar.b(1, false);
        this.f3396c = kVar.b(2, false);
        if (f3392f == null) {
            f3392f = new ArrayList<>();
            f3392f.add(new bu());
        }
        this.f3397d = (ArrayList) kVar.a(f3392f, 3, false);
        if (f3393g == null) {
            HashMap map = new HashMap();
            f3393g = map;
            map.put("", "");
        }
        this.f3398e = (Map) kVar.a(f3393g, 4, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3394a, 0);
        String str = this.f3395b;
        if (str != null) {
            lVar.a(str, 1);
        }
        String str2 = this.f3396c;
        if (str2 != null) {
            lVar.a(str2, 2);
        }
        ArrayList<bu> arrayList = this.f3397d;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f3398e;
        if (map != null) {
            lVar.a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
