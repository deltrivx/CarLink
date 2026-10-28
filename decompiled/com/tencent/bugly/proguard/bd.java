package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bd implements NativeExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final as f3273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aa f3274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ac f3275d;

    public bd(Context context, aa aaVar, as asVar, ac acVar) {
        this.f3272a = context;
        this.f3273b = asVar;
        this.f3274c = aaVar;
        this.f3275d = acVar;
    }

    private static Map<String, String> a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            al.c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (str != null) {
                al.a("Extra message[%d]: %s", Integer.valueOf(i7), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    al.d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (ay.a() == null) {
            return false;
        }
        ay ayVarA = ay.a();
        if (ayVarA.f3241a.get()) {
            al.c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = ayVarA.f3242b;
        if (z.a(activityManager) || az.a(activityManager, 0L) == null) {
            al.c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (ayVarA.a(System.currentTimeMillis())) {
            return false;
        }
        return ayVarA.a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i7, int i10, long j5, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7) {
        al.a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i7, i10, j5, j10, str, str2, str3, str4, i11, str5, i12, i13, i14, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i7, int i10, long j5, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z10;
        String str9;
        String str10;
        al.a("Native Crash Happen v2", new Object[0]);
        if (i11 > 0) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(");
                str8 = str5;
                sb2.append(str8);
                sb2.append(")");
                string = sb2.toString();
            } catch (Throwable th) {
                if (al.a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strA = be.a(str3);
        Map<String, String> mapA = a(strArr);
        String str11 = mapA.get("HasPendingException");
        if (str11 == null || !str11.equals("true")) {
            z10 = false;
        } else {
            al.a("Native crash happened with a Java pending exception.", new Object[0]);
            z10 = true;
        }
        aa aaVar = this.f3274c;
        String str12 = mapA.get("ExceptionProcessName");
        if (str12 == null || str12.length() == 0) {
            str12 = aaVar.f3054d;
        } else {
            al.c("Name of crash process: %s", str12);
        }
        String str13 = mapA.get("ExceptionThreadName");
        al.c("crash thread name:%s tid:%s", str13, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str13)) {
            str9 = Thread.currentThread().getName() + "(" + i10 + ")";
        } else {
            str9 = str13 + "(" + i10 + ")";
        }
        long j11 = (j5 * 1000) + (j10 / 1000);
        String str14 = mapA.get("SysLogPath");
        String str15 = mapA.get("JniLogPath");
        if (!this.f3275d.b()) {
            al.d("no remote but still store!", new Object[0]);
        }
        if (!this.f3275d.c().f2977f && this.f3275d.b()) {
            al.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            as.a("NATIVE_CRASH", ap.a(), str12, str9, string + "\n" + str2 + "\n" + strA, null);
            ap.c(str4);
            return;
        }
        String str16 = str9;
        if (i11 > 0) {
            str8 = "KERNEL";
        }
        String str17 = "UNKNOWN";
        if (i11 <= 0) {
            str10 = str16;
            String strA2 = i12 > 0 ? z.a(i12) : "UNKNOWN";
            if (strA2.equals(String.valueOf(i12))) {
                str17 = strA2;
            } else {
                str17 = strA2 + "(" + i12 + ")";
            }
        } else {
            str10 = str16;
        }
        String str18 = str12;
        String str19 = str10;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str18, str19, j11, string, str2, strA, str8, str17, str4, str14, str15, str7, null, null, true, z10);
        if (crashDetailBeanPackageCrashDatas == null) {
            al.e("pkg crash datas fail!", new Object[0]);
            return;
        }
        as.a("NATIVE_CRASH", ap.a(), str18, str19, string + "\n" + str2 + "\n" + strA, crashDetailBeanPackageCrashDatas);
        as asVar = this.f3273b;
        if (asVar == null) {
            al.d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zA = asVar.a(crashDetailBeanPackageCrashDatas, true);
        be.a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zA) {
            this.f3273b.b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f3273b.a(crashDetailBeanPackageCrashDatas);
        at.a().f3203t.b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11) {
        int i7;
        String str12;
        int iIndexOf;
        boolean zI = at.a().i();
        if (zI) {
            al.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f2996b = 1;
        crashDetailBean.f2999e = this.f3274c.g();
        aa aaVar = this.f3274c;
        crashDetailBean.f3000f = aaVar.f3064o;
        crashDetailBean.f3001g = aaVar.q();
        crashDetailBean.f3006m = this.f3274c.f();
        crashDetailBean.f3007n = str3;
        crashDetailBean.f3008o = zI ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f3009p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f3010q = str13;
        crashDetailBean.f3011r = j5;
        crashDetailBean.f3014u = ap.c(str13.getBytes());
        crashDetailBean.A = str;
        crashDetailBean.B = str2;
        crashDetailBean.L = this.f3274c.s();
        crashDetailBean.f3002h = this.f3274c.p();
        crashDetailBean.f3003i = this.f3274c.A();
        crashDetailBean.f3015v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strA = be.a(dumpFilePath, str8);
        if (!ap.b(strA)) {
            crashDetailBean.Z = strA;
        }
        crashDetailBean.f2995aa = be.b(dumpFilePath);
        crashDetailBean.f3016w = be.a(str9, at.f3189f, at.k, at.f3198p);
        crashDetailBean.f3017x = be.a(str10, at.f3189f, null, true);
        crashDetailBean.N = str7;
        crashDetailBean.O = str6;
        crashDetailBean.P = str11;
        crashDetailBean.F = this.f3274c.k();
        crashDetailBean.G = this.f3274c.j();
        crashDetailBean.H = this.f3274c.l();
        crashDetailBean.I = ab.b(this.f3272a);
        crashDetailBean.J = ab.g();
        crashDetailBean.K = ab.h();
        if (!z10) {
            crashDetailBean.C = -1L;
            crashDetailBean.D = -1L;
            crashDetailBean.E = -1L;
            if (crashDetailBean.f3016w == null) {
                crashDetailBean.f3016w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.Q = -1L;
            crashDetailBean.U = -1;
            crashDetailBean.V = -1;
            crashDetailBean.W = map;
            crashDetailBean.X = this.f3274c.y();
            crashDetailBean.f3019z = null;
            if (str == null) {
                crashDetailBean.A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f3018y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.C = ab.j();
        crashDetailBean.D = ab.f();
        crashDetailBean.E = ab.l();
        crashDetailBean.f3018y = ao.a();
        aa aaVar2 = this.f3274c;
        crashDetailBean.Q = aaVar2.f3048a;
        crashDetailBean.R = aaVar2.a();
        crashDetailBean.f3019z = ap.a(this.f3274c.Q, at.f3191h);
        int iIndexOf2 = crashDetailBean.f3010q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i7 = iIndexOf2 + 6) < crashDetailBean.f3010q.length()) {
            String str14 = crashDetailBean.f3010q;
            String strSubstring = str14.substring(i7, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f3019z.containsKey(crashDetailBean.B) && (iIndexOf = (str12 = crashDetailBean.f3019z.get(crashDetailBean.B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f3019z.put(crashDetailBean.B, strSubstring2);
                crashDetailBean.f3010q = crashDetailBean.f3010q.substring(0, i7);
                crashDetailBean.f3010q = ob.a.s(new StringBuilder(), crashDetailBean.f3010q, strSubstring2);
            }
        }
        if (str == null) {
            crashDetailBean.A = this.f3274c.f3054d;
        }
        crashDetailBean.U = this.f3274c.z();
        aa aaVar3 = this.f3274c;
        crashDetailBean.V = aaVar3.f3073x;
        crashDetailBean.W = aaVar3.t();
        crashDetailBean.X = this.f3274c.y();
        return crashDetailBean;
    }
}
