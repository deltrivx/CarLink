package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m {
    static byte[] k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static Map<String, String> f3416l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f3417m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f3424g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f3426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f3427j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f3418a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f3419b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3420c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3421d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3422e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3423f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3425h = 0;

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        try {
            this.f3418a = kVar.a(this.f3418a, 1, true);
            this.f3419b = kVar.a(this.f3419b, 2, true);
            this.f3420c = kVar.a(this.f3420c, 3, true);
            this.f3421d = kVar.a(this.f3421d, 4, true);
            this.f3422e = kVar.b(5, true);
            this.f3423f = kVar.b(6, true);
            if (k == null) {
                k = new byte[]{0};
            }
            this.f3424g = kVar.c(7, true);
            this.f3425h = kVar.a(this.f3425h, 8, true);
            if (f3416l == null) {
                HashMap map = new HashMap();
                f3416l = map;
                map.put("", "");
            }
            this.f3426i = (Map) kVar.a(f3416l, 9, true);
            if (f3416l == null) {
                HashMap map2 = new HashMap();
                f3416l = map2;
                map2.put("", "");
            }
            this.f3427j = (Map) kVar.a(f3416l, 10, true);
        } catch (Exception e7) {
            e7.printStackTrace();
            System.out.println("RequestPacket decode error " + f.a(this.f3424g));
            throw new RuntimeException(e7);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3418a, 1);
        lVar.a(this.f3419b, 2);
        lVar.a(this.f3420c, 3);
        lVar.a(this.f3421d, 4);
        lVar.a(this.f3422e, 5);
        lVar.a(this.f3423f, 6);
        lVar.a(this.f3424g, 7);
        lVar.a(this.f3425h, 8);
        lVar.a((Map) this.f3426i, 9);
        lVar.a((Map) this.f3427j, 10);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
        i iVar = new i(sb2, i7);
        iVar.a(this.f3418a, "iVersion");
        iVar.a(this.f3419b, "cPacketType");
        iVar.a(this.f3420c, "iMessageType");
        iVar.a(this.f3421d, "iRequestId");
        iVar.a(this.f3422e, "sServantName");
        iVar.a(this.f3423f, "sFuncName");
        iVar.a(this.f3424g, "sBuffer");
        iVar.a(this.f3425h, "iTimeout");
        iVar.a((Map) this.f3426i, "context");
        iVar.a((Map) this.f3427j, "status");
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f3417m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        g gVar = (g) obj;
        return n.a(1, (int) gVar.f3418a) && n.a(1, (int) gVar.f3419b) && n.a(1, gVar.f3420c) && n.a(1, gVar.f3421d) && n.a((Object) 1, (Object) gVar.f3422e) && n.a((Object) 1, (Object) gVar.f3423f) && n.a((Object) 1, (Object) gVar.f3424g) && n.a(1, gVar.f3425h) && n.a((Object) 1, (Object) gVar.f3426i) && n.a((Object) 1, (Object) gVar.f3427j);
    }
}
