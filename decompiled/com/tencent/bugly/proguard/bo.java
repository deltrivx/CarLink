package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bo extends m {
    static ArrayList<bn> A;
    static Map<String, String> B;
    static Map<String, String> C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static Map<String, String> f3305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static bm f3306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static bl f3307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static ArrayList<bl> f3308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static ArrayList<bl> f3309z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3310a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3311b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3312c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3313d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3314e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3315f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3316g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f3317h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3318i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bm f3319j = null;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3320l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3321m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bl f3322n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<bl> f3323o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<bl> f3324p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<bn> f3325q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map<String, String> f3326r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<String, String> f3327s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3328t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3329u = true;

    static {
        HashMap map = new HashMap();
        f3305v = map;
        map.put("", "");
        f3306w = new bm();
        f3307x = new bl();
        f3308y = new ArrayList<>();
        f3308y.add(new bl());
        f3309z = new ArrayList<>();
        f3309z.add(new bl());
        A = new ArrayList<>();
        A.add(new bn());
        HashMap map2 = new HashMap();
        B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3310a = kVar.b(0, true);
        this.f3311b = kVar.a(this.f3311b, 1, true);
        this.f3312c = kVar.b(2, true);
        this.f3313d = kVar.b(3, false);
        this.f3314e = kVar.b(4, false);
        this.f3315f = kVar.b(5, false);
        this.f3316g = kVar.b(6, false);
        this.f3317h = (Map) kVar.a(f3305v, 7, false);
        this.f3318i = kVar.b(8, false);
        this.f3319j = (bm) kVar.a((m) f3306w, 9, false);
        this.k = kVar.a(this.k, 10, false);
        this.f3320l = kVar.b(11, false);
        this.f3321m = kVar.b(12, false);
        this.f3322n = (bl) kVar.a((m) f3307x, 13, false);
        this.f3323o = (ArrayList) kVar.a(f3308y, 14, false);
        this.f3324p = (ArrayList) kVar.a(f3309z, 15, false);
        this.f3325q = (ArrayList) kVar.a(A, 16, false);
        this.f3326r = (Map) kVar.a(B, 17, false);
        this.f3327s = (Map) kVar.a(C, 18, false);
        this.f3328t = kVar.b(19, false);
        this.f3329u = kVar.a(20, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3310a, 0);
        lVar.a(this.f3311b, 1);
        lVar.a(this.f3312c, 2);
        String str = this.f3313d;
        if (str != null) {
            lVar.a(str, 3);
        }
        String str2 = this.f3314e;
        if (str2 != null) {
            lVar.a(str2, 4);
        }
        String str3 = this.f3315f;
        if (str3 != null) {
            lVar.a(str3, 5);
        }
        String str4 = this.f3316g;
        if (str4 != null) {
            lVar.a(str4, 6);
        }
        Map<String, String> map = this.f3317h;
        if (map != null) {
            lVar.a((Map) map, 7);
        }
        String str5 = this.f3318i;
        if (str5 != null) {
            lVar.a(str5, 8);
        }
        bm bmVar = this.f3319j;
        if (bmVar != null) {
            lVar.a((m) bmVar, 9);
        }
        lVar.a(this.k, 10);
        String str6 = this.f3320l;
        if (str6 != null) {
            lVar.a(str6, 11);
        }
        String str7 = this.f3321m;
        if (str7 != null) {
            lVar.a(str7, 12);
        }
        bl blVar = this.f3322n;
        if (blVar != null) {
            lVar.a((m) blVar, 13);
        }
        ArrayList<bl> arrayList = this.f3323o;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 14);
        }
        ArrayList<bl> arrayList2 = this.f3324p;
        if (arrayList2 != null) {
            lVar.a((Collection) arrayList2, 15);
        }
        ArrayList<bn> arrayList3 = this.f3325q;
        if (arrayList3 != null) {
            lVar.a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f3326r;
        if (map2 != null) {
            lVar.a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f3327s;
        if (map3 != null) {
            lVar.a((Map) map3, 18);
        }
        String str8 = this.f3328t;
        if (str8 != null) {
            lVar.a(str8, 19);
        }
        lVar.a(this.f3329u, 20);
    }
}
