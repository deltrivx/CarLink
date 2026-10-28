package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bt extends m implements Cloneable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static bs f3369m = new bs();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static Map<String, String> f3370n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f3371o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3372a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3373b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3374c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3375d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3376e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bs f3377f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f3378g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3379h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3380i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3381j = "";
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3382l = 0;

    static {
        HashMap map = new HashMap();
        f3370n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3372a = kVar.a(0, true);
        this.f3373b = kVar.a(1, true);
        this.f3374c = kVar.a(2, true);
        this.f3375d = kVar.b(3, false);
        this.f3376e = kVar.b(4, false);
        this.f3377f = (bs) kVar.a((m) f3369m, 5, false);
        this.f3378g = (Map) kVar.a(f3370n, 6, false);
        this.f3379h = kVar.a(this.f3379h, 7, false);
        this.f3380i = kVar.b(8, false);
        this.f3381j = kVar.b(9, false);
        this.k = kVar.a(this.k, 10, false);
        this.f3382l = kVar.a(this.f3382l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3372a, 0);
        lVar.a(this.f3373b, 1);
        lVar.a(this.f3374c, 2);
        String str = this.f3375d;
        if (str != null) {
            lVar.a(str, 3);
        }
        String str2 = this.f3376e;
        if (str2 != null) {
            lVar.a(str2, 4);
        }
        bs bsVar = this.f3377f;
        if (bsVar != null) {
            lVar.a((m) bsVar, 5);
        }
        Map<String, String> map = this.f3378g;
        if (map != null) {
            lVar.a((Map) map, 6);
        }
        lVar.a(this.f3379h, 7);
        String str3 = this.f3380i;
        if (str3 != null) {
            lVar.a(str3, 8);
        }
        String str4 = this.f3381j;
        if (str4 != null) {
            lVar.a(str4, 9);
        }
        lVar.a(this.k, 10);
        lVar.a(this.f3382l, 11);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
        i iVar = new i(sb2, i7);
        iVar.a(this.f3372a, "enable");
        iVar.a(this.f3373b, "enableUserInfo");
        iVar.a(this.f3374c, "enableQuery");
        iVar.a(this.f3375d, "url");
        iVar.a(this.f3376e, "expUrl");
        iVar.a((m) this.f3377f, "security");
        iVar.a((Map) this.f3378g, "valueMap");
        iVar.a(this.f3379h, "strategylastUpdateTime");
        iVar.a(this.f3380i, "httpsUrl");
        iVar.a(this.f3381j, "httpsExpUrl");
        iVar.a(this.k, "eventRecordCount");
        iVar.a(this.f3382l, "eventTimeInterval");
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f3371o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        bt btVar = (bt) obj;
        return n.a(this.f3372a, btVar.f3372a) && n.a(this.f3373b, btVar.f3373b) && n.a(this.f3374c, btVar.f3374c) && n.a(this.f3375d, btVar.f3375d) && n.a(this.f3376e, btVar.f3376e) && n.a(this.f3377f, btVar.f3377f) && n.a(this.f3378g, btVar.f3378g) && n.a(this.f3379h, btVar.f3379h) && n.a(this.f3380i, btVar.f3380i) && n.a(this.f3381j, btVar.f3381j) && n.a(this.k, btVar.k) && n.a(this.f3382l, btVar.f3382l);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e7) {
            e7.printStackTrace();
            return 0;
        }
    }
}
