package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f3474e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3478d;

    public r(Context context, boolean z10) {
        this.f3475a = context;
        this.f3478d = z10;
    }

    private static int a(List<UserInfoBean> list) {
        int i7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f2955e > jCurrentTimeMillis - 600000 && ((i7 = userInfoBean.f2952b) == 1 || i7 == 4 || i7 == 3)) {
                i10++;
            }
        }
        return i10;
    }

    private static UserInfoBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j5 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) ap.a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f2951a = j5;
            return userInfoBean;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static List<UserInfoBean> a(String str) {
        Cursor cursorA;
        String str2;
        try {
            if (ap.b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorA = w.a().a("t_ui", (String[]) null, str2);
            if (cursorA == null) {
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorA.moveToNext()) {
                    UserInfoBean userInfoBeanA = a(cursorA);
                    if (userInfoBeanA != null) {
                        arrayList.add(userInfoBeanA);
                    } else {
                        try {
                            long j5 = cursorA.getLong(cursorA.getColumnIndex("_id"));
                            sb2.append(" or _id = ");
                            sb2.append(j5);
                        } catch (Throwable unused) {
                            al.d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb2.toString();
                if (string.length() > 0) {
                    al.d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(w.a().a("t_ui", string.substring(4))));
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

    public static /* synthetic */ void a(UserInfoBean userInfoBean) {
        aa aaVarB;
        if (userInfoBean == null || (aaVarB = aa.b()) == null) {
            return;
        }
        userInfoBean.f2960j = aaVarB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UserInfoBean userInfoBean, boolean z10) {
        List<UserInfoBean> listA;
        if (userInfoBean == null) {
            return;
        }
        if (!z10 && userInfoBean.f2952b != 1 && (listA = a(aa.a(this.f3475a).f3054d)) != null && listA.size() >= 20) {
            al.a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listA.size()));
            return;
        }
        long jA = w.a().a("t_ui", b(userInfoBean), (v) null);
        if (jA >= 0) {
            al.c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jA));
            userInfoBean.f2951a = jA;
        }
    }

    private static void a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i7 = 0;
            while (i7 < list.size() - 1) {
                int i10 = i7 + 1;
                for (int i11 = i10; i11 < list.size(); i11++) {
                    if (list.get(i7).f2955e > list.get(i11).f2955e) {
                        UserInfoBean userInfoBean = list.get(i7);
                        list.set(i7, list.get(i11));
                        list.set(i11, userInfoBean);
                    }
                }
                i7 = i10;
            }
            for (int i12 = 0; i12 < size; i12++) {
                list2.add(list.get(i12));
            }
        }
    }

    private void a(List<UserInfoBean> list, boolean z10) {
        aa aaVarB;
        if (!b(z10)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f2956f = jCurrentTimeMillis;
                a(userInfoBean, true);
            }
            al.d("uploadCheck failed", new Object[0]);
            return;
        }
        int i7 = this.f3477c == 1 ? 1 : 2;
        bv bvVar = null;
        if (list != null && list.size() != 0 && (aaVarB = aa.b()) != null) {
            aaVarB.o();
            bv bvVar2 = new bv();
            bvVar2.f3395b = aaVarB.f3054d;
            bvVar2.f3396c = aaVarB.g();
            ArrayList<bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                bu buVarA = ae.a(it.next());
                if (buVarA != null) {
                    arrayList.add(buVarA);
                }
            }
            bvVar2.f3397d = arrayList;
            HashMap map = new HashMap();
            bvVar2.f3398e = map;
            map.put("A7", "");
            bvVar2.f3398e.put("A6", aa.n());
            bvVar2.f3398e.put("A5", aaVarB.m());
            Map<String, String> map2 = bvVar2.f3398e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aaVarB.k());
            map2.put("A2", sb2.toString());
            Map<String, String> map3 = bvVar2.f3398e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(aaVarB.k());
            map3.put("A1", sb3.toString());
            bvVar2.f3398e.put("A24", aaVarB.k);
            Map<String, String> map4 = bvVar2.f3398e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(aaVarB.l());
            map4.put("A17", sb4.toString());
            bvVar2.f3398e.put("A15", aaVarB.q());
            Map<String, String> map5 = bvVar2.f3398e;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(aaVarB.r());
            map5.put("A13", sb5.toString());
            bvVar2.f3398e.put("F08", aaVarB.E);
            bvVar2.f3398e.put("F09", aaVarB.F);
            Map<String, String> mapY = aaVarB.y();
            if (mapY != null && mapY.size() > 0) {
                for (Map.Entry<String, String> entry : mapY.entrySet()) {
                    bvVar2.f3398e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i7 == 1) {
                bvVar2.f3394a = (byte) 1;
            } else if (i7 != 2) {
                al.e("unknown up type %d ", Integer.valueOf(i7));
            } else {
                bvVar2.f3394a = (byte) 2;
            }
            bvVar = bvVar2;
        }
        if (bvVar == null) {
            al.d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrA = ae.a((m) bvVar);
        if (bArrA == null) {
            al.d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        bq bqVarA = ae.a(this.f3475a, 840, bArrA);
        if (bqVarA == null) {
            al.d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        ai.a().a(ServiceTypes.MSG_CMD_PROTOCOL_VERSION, bqVarA, ac.a().c().f2987q, StrategyBean.f2972a, new android.support.v4.media.session.r(this, list), this.f3477c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: all -> 0x0024, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:9:0x000d, B:12:0x0014, B:14:0x001a, B:20:0x0026, B:22:0x003b, B:24:0x0049, B:27:0x005e, B:29:0x0064, B:31:0x0069, B:34:0x0070, B:37:0x0086, B:25:0x0058), top: B:42:0x0001 }] */
    public synchronized void a(boolean z10) {
        ai aiVarA;
        ac acVarA;
        boolean z11;
        if (this.f3478d && (aiVarA = ai.a()) != null && (acVarA = ac.a()) != null && (!acVarA.b() || aiVarA.b(ServiceTypes.MSG_CMD_PROTOCOL_VERSION))) {
            String str = aa.a(this.f3475a).f3054d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listA = a(str);
            if (listA != null) {
                a(listA, arrayList);
                b(listA, arrayList);
                int iA = a(listA);
                if (iA > 15) {
                    al.d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iA));
                    z11 = false;
                }
                if (arrayList.size() > 0) {
                    b(arrayList);
                }
                if (z11 && listA.size() != 0) {
                    al.c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listA.size()));
                    a(listA, z10);
                    return;
                }
                al.c("[UserInfo] There is no user info in local database.", new Object[0]);
            }
            listA = new ArrayList<>();
            z11 = true;
            if (arrayList.size() > 0) {
                b(arrayList);
            }
            if (z11) {
                al.c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listA.size()));
                a(listA, z10);
                return;
            }
            al.c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    private static ContentValues b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j5 = userInfoBean.f2951a;
            if (j5 > 0) {
                contentValues.put("_id", Long.valueOf(j5));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f2955e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f2956f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f2952b));
            contentValues.put("_pc", userInfoBean.f2953c);
            contentValues.put("_dt", ap.a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static void b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < list.size() && i7 < 50; i7++) {
            UserInfoBean userInfoBean = list.get(i7);
            sb2.append(" or _id = ");
            sb2.append(userInfoBean.f2951a);
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb2.setLength(0);
        try {
            al.c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(w.a().a("t_ui", string)));
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private static void b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f2956f != -1) {
                it.remove();
                if (next.f2955e < ap.b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0074 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private boolean b(boolean z10) {
        boolean z11 = true;
        if (!f3474e) {
            return true;
        }
        File file = new File(this.f3475a.getFilesDir(), "bugly_last_us_up_tm");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z10) {
            am.a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
            return true;
        }
        if (file.exists()) {
            BufferedReader bufferedReaderA = ap.a(file);
            if (bufferedReaderA != null) {
                try {
                    long jLongValue = Long.valueOf(bufferedReaderA.readLine().trim()).longValue();
                    if (jCurrentTimeMillis < jLongValue || jCurrentTimeMillis - jLongValue > 86400000 || jCurrentTimeMillis - jLongValue >= 300000) {
                        am.a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
                    } else {
                        z11 = false;
                    }
                    if (bufferedReaderA != null) {
                    }
                } catch (Throwable th) {
                    try {
                        al.b(th);
                        am.a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
                    } finally {
                        try {
                            bufferedReaderA.close();
                        } catch (Exception e7) {
                            al.a(e7);
                        }
                    }
                }
            } else if (bufferedReaderA != null) {
            }
        } else {
            am.a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
        }
        return z11;
    }

    public final void a() {
        this.f3476b = ap.b() + 86400000;
        ak.a().a(new o0(this, 1), (this.f3476b - System.currentTimeMillis()) + 5000);
    }

    public final void a(int i7, boolean z10) {
        ac acVarA = ac.a();
        if (acVarA != null && !acVarA.c().f2978g && i7 != 1 && i7 != 3) {
            al.e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i7 == 1 || i7 == 3) {
            this.f3477c++;
        }
        aa aaVarA = aa.a(this.f3475a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f2952b = i7;
        userInfoBean.f2953c = aaVarA.f3054d;
        userInfoBean.f2954d = aaVarA.f();
        userInfoBean.f2955e = System.currentTimeMillis();
        userInfoBean.f2956f = -1L;
        userInfoBean.f2963n = aaVarA.f3064o;
        userInfoBean.f2964o = i7 == 1 ? 1 : 0;
        userInfoBean.f2961l = aaVarA.a();
        userInfoBean.f2962m = aaVarA.f3074y;
        userInfoBean.f2957g = aaVarA.f3075z;
        userInfoBean.f2958h = aaVarA.A;
        userInfoBean.f2959i = aaVarA.B;
        userInfoBean.k = aaVarA.C;
        userInfoBean.f2967r = aaVarA.t();
        userInfoBean.f2968s = aaVarA.y();
        userInfoBean.f2965p = aaVarA.z();
        userInfoBean.f2966q = aaVarA.f3073x;
        ak.a().a(new p0(this, userInfoBean, z10), 0L);
    }

    public final void a(long j5) {
        ak.a().a(new q0(this, j5), j5);
    }

    public final void b() {
        ak akVarA = ak.a();
        if (akVarA != null) {
            akVarA.a(new o0(this, 0));
        }
    }
}
