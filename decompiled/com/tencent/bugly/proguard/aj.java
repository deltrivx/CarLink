package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class aj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f3116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f3117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f3118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f3121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f3123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aa f3124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ac f3125j;
    private final af k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ai f3126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ah f3128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ah f3129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f3130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f3131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map<String, String> f3132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f3133s;

    public aj(Context context, int i7, int i10, byte[] bArr, String str, String str2, ah ahVar, int i11, int i12, boolean z10) {
        this.f3119d = 2;
        this.f3120e = 30000;
        this.f3130p = null;
        this.f3116a = 0;
        this.f3117b = 0L;
        this.f3118c = 0L;
        this.f3133s = false;
        this.f3121f = context;
        this.f3124i = aa.a(context);
        this.f3123h = bArr;
        this.f3125j = ac.a();
        if (af.f3089a == null) {
            af.f3089a = new af(context);
        }
        this.k = af.f3089a;
        ai aiVarA = ai.a();
        this.f3126l = aiVarA;
        this.f3127m = i7;
        this.f3130p = str;
        this.f3131q = str2;
        this.f3128n = ahVar;
        this.f3129o = aiVarA.f3106a;
        this.f3122g = i10;
        if (i11 > 0) {
            this.f3119d = i11;
        }
        if (i12 > 0) {
            this.f3120e = i12;
        }
        this.f3133s = z10;
        this.f3132r = null;
    }

    public aj(Context context, int i7, int i10, byte[] bArr, String str, String str2, ah ahVar, boolean z10) {
        this(context, i7, i10, bArr, str, str2, ahVar, 2, 30000, z10);
    }

    private Pair<Boolean, Boolean> a(Map<String, String> map) {
        int i7;
        if (map == null || map.size() == 0) {
            al.d("[Upload] Headers is empty.", new Object[0]);
        } else if (!map.containsKey("status")) {
            al.d("[Upload] Headers does not contain %s", "status");
        } else if (map.containsKey("Bugly-Version")) {
            String str = map.get("Bugly-Version");
            if (str.contains("bugly")) {
                al.c("[Upload] Bugly version from headers is: %s", str);
                try {
                    i7 = Integer.parseInt(map.get("status"));
                    try {
                        al.c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i7), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i7 == 0) {
                            Boolean bool = Boolean.TRUE;
                            return new Pair<>(bool, bool);
                        }
                        a(false, 1, "status of server is ".concat(String.valueOf(i7)));
                        Boolean bool2 = Boolean.FALSE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused) {
                        a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i7));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                } catch (Throwable unused2) {
                    i7 = -1;
                }
            } else {
                al.d("[Upload] Bugly version is not valid: %s", str);
            }
        } else {
            al.d("[Upload] Headers does not contain %s", "Bugly-Version");
        }
        al.c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                al.c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        al.c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }

    private Pair<Boolean, Boolean> a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        al.c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length != 0) {
            Boolean bool = Boolean.TRUE;
            return new Pair<>(bool, bool);
        }
        a(false, 1, "response data from server is empty");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                al.c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
            }
        }
        Boolean bool2 = Boolean.FALSE;
        return new Pair<>(bool2, bool2);
    }

    private static void a(String str) {
        al.e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    private void a(boolean z10, int i7, String str) {
        String strValueOf;
        int i10 = this.f3122g;
        if (i10 == 630) {
            strValueOf = "crash";
        } else if (i10 == 640) {
            strValueOf = "userinfo";
        } else if (i10 == 830) {
            strValueOf = "crash";
        } else if (i10 != 840) {
            strValueOf = String.valueOf(i10);
        } else {
            strValueOf = "userinfo";
        }
        if (z10) {
            al.a("[Upload] Success: %s", strValueOf);
        } else {
            al.e("[Upload] Failed to upload(%d) %s: %s", Integer.valueOf(i7), strValueOf, str);
        }
        if (this.f3117b + this.f3118c > 0) {
            this.f3126l.a(this.f3126l.a(this.f3133s) + this.f3117b + this.f3118c, this.f3133s);
        }
        ah ahVar = this.f3128n;
        if (ahVar != null) {
            ahVar.a(z10, str);
        }
        ah ahVar2 = this.f3129o;
        if (ahVar2 != null) {
            ahVar2.a(z10, str);
        }
    }

    private static boolean a(br brVar, aa aaVar, ac acVar) {
        if (brVar == null) {
            al.d("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = brVar.f3359a;
        if (b10 != 0) {
            al.e("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!ap.b(brVar.f3365g) && !aa.b().i().equals(brVar.f3365g)) {
                w.a().a(ac.f3079a, "device", brVar.f3365g.getBytes("UTF-8"), true);
                aaVar.d(brVar.f3365g);
            }
        } catch (Throwable th) {
            al.a(th);
        }
        aaVar.f3062m = brVar.f3363e;
        int i7 = brVar.f3360b;
        if (i7 == 510) {
            byte[] bArr = brVar.f3361c;
            if (bArr == null) {
                al.e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i7));
                return false;
            }
            bt btVar = (bt) ae.a(bArr, bt.class);
            if (btVar == null) {
                al.e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(brVar.f3360b));
                return false;
            }
            acVar.a(btVar);
        }
        return true;
    }

    private static String b(String str) {
        if (ap.b(str)) {
            return str;
        }
        try {
            return str + "?aid=" + UUID.randomUUID().toString();
        } catch (Throwable th) {
            al.a(th);
            return str;
        }
    }

    public final void a(long j5) {
        this.f3116a++;
        this.f3117b += j5;
    }

    public final void b(long j5) {
        this.f3118c += j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ac acVar;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f3116a = 0;
            this.f3117b = 0L;
            this.f3118c = 0L;
            if (ab.c(this.f3121f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f3123h;
                if (bArr == null || bArr.length == 0) {
                    str = "request package is empty!";
                } else if (this.f3121f == null || this.f3124i == null || (acVar = this.f3125j) == null || this.k == null) {
                    str = "illegal access error";
                } else {
                    str = acVar.c() == null ? "illegal local strategy" : null;
                }
            }
            if (str != null) {
                a(false, 0, str);
                return;
            }
            byte[] bArrA = ap.a(this.f3123h);
            if (bArrA == null) {
                a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f3124i.e());
            map.put("bundleId", this.f3124i.f3053c);
            map.put("appVer", this.f3124i.f3064o);
            Map<String, String> map2 = this.f3132r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f3122g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f3124i.f3058h);
            map.put("strategylastUpdateTime", Long.toString(this.f3125j.c().f2985o));
            this.f3126l.a(this.f3127m, System.currentTimeMillis());
            String strB = this.f3130p;
            this.f3125j.c();
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i7 + 1;
                if (i7 >= this.f3119d) {
                    a(false, i10, "failed after many attempts");
                    return;
                }
                if (i11 > 1) {
                    al.d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i11));
                    ap.b(this.f3120e);
                    if (i11 == this.f3119d) {
                        al.d("[Upload] Use the back-up url at the last time: %s", this.f3131q);
                        strB = this.f3131q;
                    }
                }
                al.c("[Upload] Send %d bytes", Integer.valueOf(bArrA.length));
                strB = b(strB);
                al.c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strB, Integer.valueOf(this.f3122g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrA2 = this.k.a(strB, bArrA, this, map);
                Map<String, String> map3 = this.k.f3091c;
                Pair<Boolean, Boolean> pairA = a(bArrA2, map3);
                if (((Boolean) pairA.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairA2 = a(map3);
                    if (((Boolean) pairA2.first).booleanValue()) {
                        byte[] bArrB = ap.b(bArrA2);
                        if (bArrB != null) {
                            bArrA2 = bArrB;
                        }
                        br brVarA = ae.a(bArrA2);
                        if (brVarA == null) {
                            a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(brVarA.f3360b);
                            byte[] bArr2 = brVarA.f3361c;
                            al.c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (a(brVarA, this.f3124i, this.f3125j)) {
                                a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairA2.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairA.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i7 = i11;
                i10 = 1;
            }
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }
}
