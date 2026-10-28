package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3174a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<Integer, Pair<String, String>> f3175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ArrayList<h0> f3176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<Integer, Integer> f3177j;
    private static final Map<Integer, String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<Integer, String> f3178l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f3179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ai f3180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final w f3181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final ac f3182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected aw f3183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BuglyStrategy.a f3184g;

    static {
        a0 a0Var = new a0();
        a0Var.put(3, new Pair("203", "103"));
        a0Var.put(7, new Pair("208", "108"));
        a0Var.put(0, new Pair("200", "100"));
        a0Var.put(1, new Pair("201", "101"));
        a0Var.put(2, new Pair("202", "102"));
        a0Var.put(4, new Pair("204", "104"));
        a0Var.put(6, new Pair("206", "106"));
        a0Var.put(5, new Pair("207", "107"));
        f3175h = a0Var;
        c cVar = new c();
        cVar.add(new h0(3, 0));
        cVar.add(new h0(7, 1));
        cVar.add(new h0(2, 2));
        cVar.add(new h0(0, 3));
        cVar.add(new h0(1, 6));
        cVar.add(new h0(4, 7));
        cVar.add(new h0(5, 4));
        cVar.add(new h0(6, 5));
        f3176i = cVar;
        f0 f0Var = new f0();
        f0Var.put(3, 4);
        f0Var.put(7, 7);
        f0Var.put(2, 1);
        f0Var.put(0, 0);
        f0Var.put(1, 2);
        f0Var.put(4, 3);
        f0Var.put(5, 5);
        f0Var.put(6, 6);
        f3177j = f0Var;
        a0 a0Var2 = new a0();
        a0Var2.put(3, "BuglyAnrCrash");
        a0Var2.put(0, "BuglyJavaCrash");
        a0Var2.put(1, "BuglyNativeCrash");
        k = a0Var2;
        a0 a0Var3 = new a0();
        a0Var3.put(3, "BuglyAnrCrashReport");
        a0Var3.put(0, "BuglyJavaCrashReport");
        a0Var3.put(1, "BuglyNativeCrashReport");
        f3178l = a0Var3;
    }

    public as(Context context, ai aiVar, w wVar, ac acVar, BuglyStrategy.a aVar) {
        f3174a = CrashModule.MODULE_ID;
        this.f3179b = context;
        this.f3180c = aiVar;
        this.f3181d = wVar;
        this.f3182e = acVar;
        this.f3184g = aVar;
        this.f3183f = null;
    }

    private static CrashDetailBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j5 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) ap.a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f2994a = j5;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static CrashDetailBean a(List<ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listC;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (ar arVar : list) {
            if (arVar.f3172e) {
                arrayList.add(arVar);
            }
        }
        if (arrayList.isEmpty() || (listC = c(arrayList)) == null || listC.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listC);
            crashDetailBean2 = listC.get(0);
            a(crashDetailBean2, listC);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f3004j = true;
            crashDetailBean.f3013t = 0;
            crashDetailBean.f3012s = "";
            crashDetailBean2 = crashDetailBean;
        }
        b(crashDetailBean2, list);
        if (crashDetailBean2.f3011r != crashDetailBean.f3011r) {
            String str = crashDetailBean2.f3012s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3011r);
            if (!str.contains(sb2.toString())) {
                crashDetailBean2.f3013t++;
                crashDetailBean2.f3012s += crashDetailBean.f3011r + "\n";
            }
        }
        return crashDetailBean2;
    }

    private static bn a(String str, Context context, String str2) {
        FileInputStream fileInputStream;
        if (str2 == null || context == null) {
            al.d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
            return null;
        }
        al.c("zip %s", str2);
        File file = new File(str2);
        File file2 = new File(context.getCacheDir(), str);
        if (!ap.a(file, file2)) {
            al.d("zip fail!", new Object[0]);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fileInputStream = new FileInputStream(file2);
            try {
                byte[] bArr = new byte[ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT];
                while (true) {
                    int i7 = fileInputStream.read(bArr);
                    if (i7 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                al.c("read bytes :%d", Integer.valueOf(byteArray.length));
                bn bnVar = new bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e7) {
                    if (!al.a(e7)) {
                        e7.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    al.c("del tmp", new Object[0]);
                    file2.delete();
                }
                return bnVar;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            if (!al.a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        al.c("del tmp", new Object[0]);
                    }
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            if (!al.a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        al.c("del tmp", new Object[0]);
                        file2.delete();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static bo a(Context context, CrashDetailBean crashDetailBean, aa aaVar) {
        ArrayList<bl> arrayList = null;
        if (context == null || crashDetailBean == null || aaVar == null) {
            al.d("enExp args == null", new Object[0]);
            return null;
        }
        bo boVar = new bo();
        boVar.f3310a = e(crashDetailBean);
        boVar.f3311b = crashDetailBean.f3011r;
        boVar.f3312c = crashDetailBean.f3007n;
        boVar.f3313d = crashDetailBean.f3008o;
        boVar.f3314e = crashDetailBean.f3009p;
        boVar.f3316g = crashDetailBean.f3010q;
        boVar.f3317h = crashDetailBean.f3019z;
        boVar.f3318i = crashDetailBean.f2997c;
        boVar.f3319j = null;
        boVar.f3320l = crashDetailBean.f3006m;
        boVar.f3321m = crashDetailBean.f2999e;
        boVar.f3315f = crashDetailBean.B;
        boVar.f3322n = null;
        Map<String, PlugInBean> map = crashDetailBean.f3002h;
        if (map != null && !map.isEmpty()) {
            arrayList = new ArrayList<>(crashDetailBean.f3002h.size());
            for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f3002h.entrySet()) {
                bl blVar = new bl();
                blVar.f3293a = entry.getValue().f2969a;
                blVar.f3295c = entry.getValue().f2971c;
                blVar.f3297e = entry.getValue().f2970b;
                arrayList.add(blVar);
            }
        }
        boVar.f3324p = arrayList;
        al.c("libInfo %s", boVar.f3323o);
        ArrayList<bn> arrayList2 = new ArrayList<>(20);
        a(arrayList2, crashDetailBean);
        a(arrayList2, crashDetailBean.f3016w);
        b(arrayList2, crashDetailBean.f3017x);
        c(arrayList2, crashDetailBean.Z);
        a(arrayList2, crashDetailBean.f2995aa, context);
        a(arrayList2, crashDetailBean.f3018y);
        a(arrayList2, crashDetailBean, context);
        b(arrayList2, crashDetailBean, context);
        a(arrayList2, aaVar.L);
        b(arrayList2, crashDetailBean.Y);
        boVar.f3325q = arrayList2;
        if (crashDetailBean.f3004j) {
            boVar.k = crashDetailBean.f3013t;
        }
        boVar.f3326r = a(crashDetailBean, aaVar);
        boVar.f3327s = new HashMap();
        Map<String, String> map2 = crashDetailBean.S;
        if (map2 != null && map2.size() > 0) {
            boVar.f3327s.putAll(crashDetailBean.S);
            al.a("setted message size %d", Integer.valueOf(boVar.f3327s.size()));
        }
        Map<String, String> map3 = boVar.f3327s;
        al.c("pss:" + crashDetailBean.I + " vss:" + crashDetailBean.J + " javaHeap:" + crashDetailBean.K, new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(crashDetailBean.I);
        map3.put("SDK_UPLOAD_U1", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(crashDetailBean.J);
        map3.put("SDK_UPLOAD_U2", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(crashDetailBean.K);
        map3.put("SDK_UPLOAD_U3", sb4.toString());
        al.c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f3007n, crashDetailBean.f2997c, aaVar.d(), Long.valueOf((crashDetailBean.f3011r - crashDetailBean.Q) / 1000), Boolean.valueOf(crashDetailBean.k), Boolean.valueOf(crashDetailBean.R), Boolean.valueOf(crashDetailBean.f3004j), Boolean.valueOf(crashDetailBean.f2996b == 1), Integer.valueOf(crashDetailBean.f3013t), crashDetailBean.f3012s, Boolean.valueOf(crashDetailBean.f2998d), Integer.valueOf(boVar.f3326r.size()));
        return boVar;
    }

    private static bp a(Context context, List<CrashDetailBean> list, aa aaVar) {
        if (context == null || list == null || list.size() == 0 || aaVar == null) {
            al.d("enEXPPkg args == null!", new Object[0]);
            return null;
        }
        bp bpVar = new bp();
        bpVar.f3331a = new ArrayList<>();
        Iterator<CrashDetailBean> it = list.iterator();
        while (it.hasNext()) {
            bpVar.f3331a.add(a(context, it.next(), aaVar));
        }
        return bpVar;
    }

    public static List<CrashDetailBean> a() {
        StrategyBean strategyBeanC = ac.a().c();
        if (strategyBeanC == null) {
            al.d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanC.f2977f) {
            al.d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            al.b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = ap.b();
        List<ar> listB = b();
        al.c("Size of crash list loaded from DB: %s", Integer.valueOf(listB.size()));
        if (listB.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a(listB));
        listB.removeAll(arrayList);
        Iterator<ar> it = listB.iterator();
        while (it.hasNext()) {
            ar next = it.next();
            long j5 = next.f3169b;
            if (j5 < jB - at.f3193j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f3171d) {
                if (j5 >= jCurrentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.f3172e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f3173f >= 3 && j5 < jCurrentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        b(arrayList2);
        if (arrayList.size() > 0) {
            d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listC = c(listB);
        if (listC != null && listC.size() > 0) {
            String str = aa.b().f3064o;
            Iterator<CrashDetailBean> it2 = listC.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f3000f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            e(arrayList3);
        }
        return listC;
    }

    private static List<ar> a(List<ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (ar arVar : list) {
            if (arVar.f3171d && arVar.f3169b <= jCurrentTimeMillis - 86400000) {
                arrayList.add(arVar);
            }
        }
        return arrayList;
    }

    private static Map<String, String> a(CrashDetailBean crashDetailBean, aa aaVar) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.C);
            map.put("A9", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.D);
            map.put("A11", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.E);
            map.put("A10", sb4.toString());
            map.put("A23", crashDetailBean.f3000f);
            aaVar.getClass();
            map.put("A7", "");
            map.put("A6", aa.n());
            map.put("A5", aaVar.m());
            map.put("A22", aaVar.g());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.G);
            map.put("A2", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.F);
            map.put("A1", sb6.toString());
            map.put("A24", aaVar.k);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.H);
            map.put("A17", sb7.toString());
            map.put("A25", aaVar.g());
            map.put("A15", aaVar.q());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(aaVar.r());
            map.put("A13", sb8.toString());
            map.put("A34", crashDetailBean.A);
            if (aaVar.G != null) {
                map.put("productIdentify", aaVar.G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.L, "utf-8"));
            if (crashDetailBean.f2996b == 1) {
                map.put("A27", crashDetailBean.O);
                map.put("A28", crashDetailBean.N);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(crashDetailBean.k);
                map.put("A29", sb9.toString());
            }
            map.put("A30", crashDetailBean.P);
            StringBuilder sb10 = new StringBuilder();
            sb10.append(crashDetailBean.Q);
            map.put("A18", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(true ^ crashDetailBean.R);
            map.put("A36", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(aaVar.f3075z);
            map.put("F02", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(aaVar.A);
            map.put("F03", sb13.toString());
            map.put("F04", aaVar.d());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(aaVar.B);
            map.put("F05", sb14.toString());
            map.put("F06", aaVar.f3074y);
            map.put("F08", aaVar.E);
            map.put("F09", aaVar.F);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(aaVar.C);
            map.put("F10", sb15.toString());
            a(map, crashDetailBean);
            return map;
        } catch (Exception e7) {
            e7.printStackTrace();
            al.a(e7);
            return map;
        }
    }

    private static void a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb2 = new StringBuilder(128);
        for (int i7 = 1; i7 < list.size(); i7++) {
            String str = list.get(i7).f3012s;
            if (str != null && (strArrSplit = str.split("\n")) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f3012s.contains(str2)) {
                        crashDetailBean.f3013t++;
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                }
            }
        }
        crashDetailBean.f3012s += sb2.toString();
    }

    private static void a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map == null || map.isEmpty()) {
            al.d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
            return;
        }
        crashDetailBean.S = new LinkedHashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!ap.b(entry.getKey())) {
                String key = entry.getKey();
                if (key.length() > 100) {
                    key = key.substring(0, 100);
                    al.d("setted key length is over limit %d substring to %s", 100, key);
                }
                if (ap.b(entry.getValue()) || entry.getValue().length() <= 100000) {
                    value = entry.getValue();
                } else {
                    value = entry.getValue().substring(entry.getValue().length() - BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH);
                    al.d("setted %s value length is over limit %d substring", key, Integer.valueOf(BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH));
                }
                crashDetailBean.S.put(key, value);
                al.a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        aa aaVarB = aa.b();
        if (aaVarB == null) {
            return;
        }
        al.e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        al.e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        al.e("# PKG NAME: %s", aaVarB.f3053c);
        al.e("# APP VER: %s", aaVarB.f3064o);
        al.e("# SDK VER: %s", aaVarB.f3058h);
        al.e("# LAUNCH TIME: %s", ap.a(new Date(aa.b().f3048a)));
        al.e("# CRASH TYPE: %s", str);
        al.e("# CRASH TIME: %s", str2);
        al.e("# CRASH PROCESS: %s", str3);
        al.e("# CRASH FOREGROUND: %s", Boolean.valueOf(aaVarB.a()));
        al.e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            al.e("# REPORT ID: %s", crashDetailBean.f2997c);
            al.e("# CRASH DEVICE: %s %s", aaVarB.h(), aaVarB.r().booleanValue() ? "ROOTED" : "UNROOT");
            al.e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.C), Long.valueOf(crashDetailBean.D), Long.valueOf(crashDetailBean.E));
            al.e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.F), Long.valueOf(crashDetailBean.G), Long.valueOf(crashDetailBean.H));
            if (!ap.b(crashDetailBean.O)) {
                al.e("# EXCEPTION FIRED BY %s %s", crashDetailBean.O, crashDetailBean.N);
            } else if (crashDetailBean.f2996b == 3) {
                if (crashDetailBean.T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.T.get("BUGLY_CR_01");
                }
                al.e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!ap.b(str5)) {
            al.e("# CRASH STACK: ", new Object[0]);
            al.e(str5, new Object[0]);
        }
        al.e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    private static void a(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f3004j && (str = crashDetailBean.f3012s) != null && str.length() > 0) {
            try {
                arrayList.add(new bn((byte) 1, "alltimes.txt", crashDetailBean.f3012s.getBytes("utf-8")));
            } catch (Exception e7) {
                e7.printStackTrace();
                al.a(e7);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        bn bnVarA;
        if (crashDetailBean.f2996b != 3) {
            return;
        }
        al.c("crashBean.anrMessages:%s", crashDetailBean.T);
        try {
            Map<String, String> map = crashDetailBean.T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.T.get("BUGLY_CR_01"))) {
                    arrayList.add(new bn((byte) 1, "anrMessage.txt", crashDetailBean.T.get("BUGLY_CR_01").getBytes("utf-8")));
                    al.c("attach anr message", new Object[0]);
                }
                crashDetailBean.T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f3015v;
            if (str == null || (bnVarA = a("trace.zip", context, str)) == null) {
                return;
            }
            al.c("attach traces", new Object[0]);
            arrayList.add(bnVarA);
        } catch (Exception e7) {
            e7.printStackTrace();
            al.a(e7);
        }
    }

    private static void a(ArrayList<bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e7) {
                e7.printStackTrace();
                al.a(e7);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                bn bnVarA = a("backupRecord.zip", context, str);
                if (bnVarA != null) {
                    al.c("attach backup record", new Object[0]);
                    arrayList.add(bnVarA);
                }
            } catch (Exception e7) {
                al.a(e7);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        try {
            arrayList.add(new bn((byte) 1, "martianlog.txt", sb2.toString().getBytes("utf-8")));
            al.c("attach pageTracingList", new Object[0]);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private static void a(ArrayList<bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            bn bnVar = new bn((byte) 2, "buglylog.zip", bArr);
            al.c("attach user log", new Object[0]);
            arrayList.add(bnVar);
        } catch (Exception e7) {
            al.a(e7);
        }
    }

    public static /* synthetic */ void a(List list, boolean z10, long j5, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f3178l.get(Integer.valueOf(crashDetailBean.f2996b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new ag.c(crashDetailBean.f2997c, str3, crashDetailBean.f3011r, z10, j5, str, str2));
            }
        }
        ag.a.f3094a.a(arrayList);
    }

    private static void a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.U >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.U);
            map.put("C01", sb2.toString());
        }
        if (crashDetailBean.V >= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.V);
            map.put("C02", sb3.toString());
        }
        Map<String, String> map2 = crashDetailBean.W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    public static void a(boolean z10, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            al.c("up finish update state %b", Boolean.valueOf(z10));
            for (CrashDetailBean crashDetailBean : list) {
                al.c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f2997c, Integer.valueOf(crashDetailBean.f3005l), Boolean.valueOf(crashDetailBean.f2998d), Boolean.valueOf(crashDetailBean.f3004j));
                int i7 = crashDetailBean.f3005l + 1;
                crashDetailBean.f3005l = i7;
                crashDetailBean.f2998d = z10;
                al.c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f2997c, Integer.valueOf(i7), Boolean.valueOf(crashDetailBean.f2998d), Boolean.valueOf(crashDetailBean.f3004j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                at.a().a(it.next());
            }
            al.c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z10) {
            return;
        }
        al.b("[crash] upload fail.", new Object[0]);
    }

    private static boolean a(CrashDetailBean crashDetailBean, List<ar> list, List<ar> list2) {
        boolean z10 = false;
        for (ar arVar : list) {
            if (crashDetailBean.f3014u.equals(arVar.f3170c)) {
                if (arVar.f3172e) {
                    z10 = true;
                }
                list2.add(arVar);
            }
        }
        return z10;
    }

    private static boolean a(String str) {
        String str2 = at.f3200r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                al.c("Crash regular filter for crash stack is: %s", at.f3200r);
                if (Pattern.compile(at.f3200r).matcher(str).find()) {
                    al.d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e7) {
                al.a(e7);
                al.d("Failed to compile " + at.f3200r, new Object[0]);
            }
        }
        return false;
    }

    private static ar b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            ar arVar = new ar();
            arVar.f3168a = cursor.getLong(cursor.getColumnIndex("_id"));
            arVar.f3169b = cursor.getLong(cursor.getColumnIndex("_tm"));
            arVar.f3170c = cursor.getString(cursor.getColumnIndex("_s1"));
            arVar.f3171d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            arVar.f3172e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            arVar.f3173f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return arVar;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static List<ar> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = w.a().a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorA == null) {
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            }
            try {
                if (cursorA.getCount() <= 0) {
                    cursorA.close();
                    return arrayList;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_id in (");
                int i7 = 0;
                while (cursorA.moveToNext()) {
                    ar arVarB = b(cursorA);
                    if (arVarB != null) {
                        arrayList.add(arVarB);
                    } else {
                        try {
                            sb2.append(cursorA.getLong(cursorA.getColumnIndex("_id")));
                            sb2.append(",");
                            i7++;
                        } catch (Throwable unused) {
                            al.d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string = sb2.toString();
                sb2.setLength(0);
                if (i7 > 0) {
                    al.d("deleted %s illegal data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", string)));
                }
                cursorA.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorA;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    return arrayList;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void b(CrashDetailBean crashDetailBean, List<ar> list) {
        StringBuilder sb2 = new StringBuilder(64);
        for (ar arVar : list) {
            if (!arVar.f3172e && !arVar.f3171d) {
                String str = crashDetailBean.f3012s;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(arVar.f3169b);
                if (!str.contains(sb3.toString())) {
                    crashDetailBean.f3013t++;
                    sb2.append(arVar.f3169b);
                    sb2.append("\n");
                }
            }
        }
        crashDetailBean.f3012s += sb2.toString();
    }

    private static void b(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f2996b == 1 && (str = crashDetailBean.f3015v) != null) {
            try {
                bn bnVarA = a("tomb.zip", context, str);
                if (bnVarA != null) {
                    al.c("attach tombs", new Object[0]);
                    arrayList.add(bnVarA);
                }
            } catch (Exception e7) {
                al.a(e7);
            }
        }
    }

    private static void b(ArrayList<bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e7) {
                e7.printStackTrace();
                al.a(e7);
            }
        }
    }

    private static void b(ArrayList<bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new bn((byte) 1, "userExtraByteData", bArr));
            al.c("attach extraData", new Object[0]);
        } catch (Exception e7) {
            al.a(e7);
        }
    }

    private static void b(List<ar> list) {
        List<CrashDetailBean> listC = c(list);
        if (listC == null || listC.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listC) {
            String str = f3178l.get(Integer.valueOf(crashDetailBean.f2996b));
            if (!TextUtils.isEmpty(str)) {
                al.c("find expired data,crashId:%s eventType:%s", crashDetailBean.f2997c, str);
                arrayList.add(new ag.c(crashDetailBean.f2997c, str, crashDetailBean.f3011r, false, 0L, "expired", null));
            }
        }
        ag.a.f3094a.a(arrayList);
    }

    private boolean b(CrashDetailBean crashDetailBean, List<ar> list, List<ar> list2) {
        int i7 = crashDetailBean.f2996b;
        boolean z10 = i7 == 0 || i7 == 1;
        if (!(p.f3465c ? false : ((i7 == 3) || z10) ? at.f3188e : true)) {
            return false;
        }
        ArrayList<ar> arrayList = new ArrayList(10);
        if (!a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= at.f3187d) {
                }
            } catch (Exception e7) {
                al.a(e7);
                al.d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        al.a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanA = a((List<ar>) arrayList, crashDetailBean);
        for (ar arVar : arrayList) {
            if (arVar.f3168a != crashDetailBeanA.f2994a) {
                list2.add(arVar);
            }
        }
        b(crashDetailBeanA);
        d(list2);
        al.b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    private static ContentValues c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j5 = crashDetailBean.f2994a;
            if (j5 > 0) {
                contentValues.put("_id", Long.valueOf(j5));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f3011r));
            contentValues.put("_s1", crashDetailBean.f3014u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f2998d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f3004j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f3005l));
            contentValues.put("_dt", ap.a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static List<CrashDetailBean> c(List<ar> list) {
        Cursor cursorA;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f3168a);
            sb2.append(",");
        }
        if (sb2.toString().contains(",")) {
            sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        }
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            cursorA = w.a().a("t_cr", (String[]) null, string);
            if (cursorA == null) {
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb2.append("_id in (");
                int i7 = 0;
                while (cursorA.moveToNext()) {
                    CrashDetailBean crashDetailBeanA = a(cursorA);
                    if (crashDetailBeanA != null) {
                        arrayList.add(crashDetailBeanA);
                    } else {
                        try {
                            sb2.append(cursorA.getLong(cursorA.getColumnIndex("_id")));
                            sb2.append(",");
                            i7++;
                        } catch (Throwable unused) {
                            al.d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string2 = sb2.toString();
                if (i7 > 0) {
                    al.d("deleted %s illegal data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", string2)));
                }
                cursorA.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorA = null;
        }
    }

    private static void c(ArrayList<bn> arrayList, String str) {
        if (ap.b(str)) {
            return;
        }
        try {
            bn bnVar = new bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            al.c("attach crash infos", new Object[0]);
            arrayList.add(bnVar);
        } catch (Exception e7) {
            e7.printStackTrace();
            al.a(e7);
        }
    }

    private static void d(List<ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f3168a);
            sb2.append(",");
        }
        StringBuilder sb3 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append(")");
        String string = sb3.toString();
        sb3.setLength(0);
        try {
            al.c("deleted %s data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", string)));
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private boolean d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            al.c("save eup logs", new Object[0]);
            aa aaVarB = aa.b();
            String str = "#--------\npackage:" + aaVarB.e() + "\nversion:" + aaVarB.f3064o + "\nsdk:" + aaVarB.f3058h + "\nprocess:" + crashDetailBean.A + "\ndate:" + ap.a(new Date(crashDetailBean.f3011r)) + "\ntype:" + crashDetailBean.f3007n + "\nmessage:" + crashDetailBean.f3008o + "\nstack:\n" + crashDetailBean.f3010q + "\neupID:" + crashDetailBean.f2997c + "\n";
            if (at.f3195m != null) {
                File file = new File(at.f3195m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            } else if (Environment.getExternalStorageState().equals("mounted")) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f3179b.getPackageName();
            } else {
                absolutePath = null;
            }
            am.a(absolutePath + "/euplog.txt", str, at.f3196n);
            return true;
        } catch (Throwable th) {
            al.d("rqdp{  save error} %s", th.toString());
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    private static String e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f3175h.get(Integer.valueOf(crashDetailBean.f2996b));
            if (pair != null) {
                return crashDetailBean.f3004j ? (String) pair.first : (String) pair.second;
            }
            al.e("crash type error! %d", Integer.valueOf(crashDetailBean.f2996b));
            return "";
        } catch (Exception e7) {
            al.a(e7);
            return "";
        }
    }

    private static void e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb2.append(" or _id = ");
                sb2.append(crashDetailBean.f2994a);
            }
            String string = sb2.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb2.setLength(0);
            al.c("deleted %s data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", string)));
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(CrashDetailBean crashDetailBean) {
        int i7 = crashDetailBean.f2996b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 3 && !at.a().k()) {
                    return;
                }
            } else if (!at.a().j()) {
                return;
            }
        } else if (!at.a().j()) {
            return;
        }
        if (this.f3183f != null) {
            al.c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    public final void a(List<CrashDetailBean> list, long j5, boolean z10, boolean z11, boolean z12) {
        if (!aa.a(this.f3179b).f3056f) {
            al.d("warn: not upload process", new Object[0]);
            return;
        }
        ai aiVar = this.f3180c;
        if (aiVar == null) {
            al.d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z12 && !aiVar.b(at.f3185a)) {
            al.d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanC = this.f3182e.c();
        if (!strategyBeanC.f2977f) {
            al.d("remote report is disable!", new Object[0]);
            al.b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list == null || list.size() == 0) {
            al.d("warn: crashList is null or crashList num is 0", new Object[0]);
            return;
        }
        try {
            String str = strategyBeanC.f2988r;
            String str2 = StrategyBean.f2973b;
            bp bpVarA = a(this.f3179b, list, aa.b());
            if (bpVarA == null) {
                al.d("create eupPkg fail!", new Object[0]);
                return;
            }
            byte[] bArrA = ae.a((m) bpVarA);
            if (bArrA == null) {
                al.d("send encode fail!", new Object[0]);
                return;
            }
            bq bqVarA = ae.a(this.f3179b, 830, bArrA);
            if (bqVarA == null) {
                al.d("request package is null.", new Object[0]);
                return;
            }
            g0 g0Var = new g0(System.currentTimeMillis(), list, z10);
            if (z10) {
                this.f3180c.a(f3174a, bqVarA, str, str2, g0Var, j5, z11);
            } else {
                this.f3180c.a(f3174a, bqVarA, str, str2, g0Var, false);
            }
        } catch (Throwable th) {
            al.e("req cr error %s", th.toString());
            if (al.b(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0278, code lost:
    
        if (b(r20, r7, r8) != false) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.bugly.crashreport.crash.CrashDetailBean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.as.a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    public final void b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesC = c(crashDetailBean);
        if (contentValuesC != null) {
            long jA = w.a().a("t_cr", contentValuesC, (v) null);
            if (jA >= 0) {
                al.c("insert %s success!", "t_cr");
                crashDetailBean.f2994a = jA;
            }
        }
        if (at.f3194l) {
            d(crashDetailBean);
        }
    }

    public final void b(CrashDetailBean crashDetailBean, boolean z10) {
        if (!at.f3197o) {
            al.a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
            return;
        }
        al.a("try to upload right now", new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(crashDetailBean);
        a(arrayList, 3000L, z10, crashDetailBean.f2996b == 7, z10);
    }
}
