package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bu extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static Map<String, String> f3383i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f3385b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3386c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3387d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3388e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f3389f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3390g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3391h = true;

    static {
        HashMap map = new HashMap();
        f3383i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3384a = kVar.a(this.f3384a, 0, true);
        this.f3385b = kVar.a(this.f3385b, 1, true);
        this.f3386c = kVar.b(2, false);
        this.f3387d = kVar.b(3, false);
        this.f3388e = kVar.b(4, false);
        this.f3389f = (Map) kVar.a(f3383i, 5, false);
        this.f3390g = kVar.b(6, false);
        this.f3391h = kVar.a(7, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3384a, 0);
        lVar.a(this.f3385b, 1);
        String str = this.f3386c;
        if (str != null) {
            lVar.a(str, 2);
        }
        String str2 = this.f3387d;
        if (str2 != null) {
            lVar.a(str2, 3);
        }
        String str3 = this.f3388e;
        if (str3 != null) {
            lVar.a(str3, 4);
        }
        Map<String, String> map = this.f3389f;
        if (map != null) {
            lVar.a((Map) map, 5);
        }
        String str4 = this.f3390g;
        if (str4 != null) {
            lVar.a(str4, 6);
        }
        lVar.a(this.f3391h, 7);
    }
}
