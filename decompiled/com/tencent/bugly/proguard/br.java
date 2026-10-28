package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class br extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static byte[] f3357i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static Map<String, String> f3358j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f3359a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3360b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3361c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3362d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3363e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3364f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3365g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f3366h = null;

    static {
        HashMap map = new HashMap();
        f3358j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3359a = kVar.a(this.f3359a, 0, true);
        this.f3360b = kVar.a(this.f3360b, 1, true);
        this.f3361c = kVar.c(2, false);
        this.f3362d = kVar.b(3, false);
        this.f3363e = kVar.a(this.f3363e, 4, false);
        this.f3364f = kVar.b(5, false);
        this.f3365g = kVar.b(6, false);
        this.f3366h = (Map) kVar.a(f3358j, 7, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3359a, 0);
        lVar.a(this.f3360b, 1);
        byte[] bArr = this.f3361c;
        if (bArr != null) {
            lVar.a(bArr, 2);
        }
        String str = this.f3362d;
        if (str != null) {
            lVar.a(str, 3);
        }
        lVar.a(this.f3363e, 4);
        String str2 = this.f3364f;
        if (str2 != null) {
            lVar.a(str2, 5);
        }
        String str3 = this.f3365g;
        if (str3 != null) {
            lVar.a(str3, 6);
        }
        Map<String, String> map = this.f3366h;
        if (map != null) {
            lVar.a((Map) map, 7);
        }
    }
}
