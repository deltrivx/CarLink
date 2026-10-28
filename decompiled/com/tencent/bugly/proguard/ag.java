package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f3092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad f3093b;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ag f3094a = new ag(0);
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f3095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f3096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3097c;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SLAData{uuid='");
            sb2.append(this.f3095a);
            sb2.append("', time=");
            sb2.append(this.f3096b);
            sb2.append(", data='");
            return ob.a.s(sb2, this.f3097c, "'}");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f3098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f3100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f3102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f3103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f3104g;

        public c() {
        }

        public c(String str, String str2, long j5, boolean z10, long j10, String str3, String str4) {
            this.f3098a = str;
            this.f3099b = str2;
            this.f3100c = j5;
            this.f3101d = z10;
            this.f3102e = j10;
            this.f3103f = str3;
            this.f3104g = str4;
        }
    }

    private ag() {
        this.f3092a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f3093b = new ad();
    }

    public /* synthetic */ ag(byte b10) {
        this();
    }

    private static String a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("'");
        sb2.append(it.next().f3095a);
        sb2.append("'");
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append("'");
            sb2.append(it.next().f3095a);
            sb2.append("'");
        }
        return sb2.toString();
    }

    public static List<b> a() {
        Cursor cursorA = w.a().a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorA == null) {
            return null;
        }
        if (cursorA.getCount() <= 0) {
            cursorA.close();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorA.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f3095a = cursorA.getString(cursorA.getColumnIndex("_id"));
                bVar.f3096b = cursorA.getLong(cursorA.getColumnIndex("_tm"));
                bVar.f3097c = cursorA.getString(cursorA.getColumnIndex("_dt"));
                al.c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    al.b(th);
                    return arrayList;
                } finally {
                    cursorA.close();
                }
            }
        }
        cursorA.close();
        return arrayList;
    }

    private b b(c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.f3099b)) {
            al.d("sla convert event is null", new Object[0]);
            return null;
        }
        aa aaVarB = aa.b();
        if (aaVarB == null) {
            al.d("sla convert failed because ComInfoManager is null", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder("&app_version=");
        sb2.append(aaVarB.f3064o);
        sb2.append("&app_name=");
        sb2.append(aaVarB.f3066q);
        sb2.append("&app_bundle_id=");
        sb2.append(aaVarB.f3053c);
        sb2.append("&client_type=android&user_id=");
        sb2.append(aaVarB.f());
        sb2.append("&sdk_version=");
        sb2.append(aaVarB.f3058h);
        sb2.append("&event_code=");
        sb2.append(cVar.f3099b);
        sb2.append("&event_result=");
        sb2.append(cVar.f3101d ? 1 : 0);
        sb2.append("&event_time=");
        sb2.append(this.f3092a.format(new Date(cVar.f3100c)));
        sb2.append("&event_cost=");
        sb2.append(cVar.f3102e);
        sb2.append("&device_id=");
        sb2.append(aaVarB.g());
        sb2.append("&debug=");
        sb2.append(aaVarB.D ? 1 : 0);
        sb2.append("&param_0=");
        sb2.append(cVar.f3103f);
        sb2.append("&param_1=");
        sb2.append(cVar.f3098a);
        sb2.append("&param_2=");
        sb2.append(aaVarB.M ? "rqd" : "ext");
        sb2.append("&param_4=");
        sb2.append(aaVarB.e());
        String string = sb2.toString();
        if (!TextUtils.isEmpty(cVar.f3104g)) {
            string = string + "&param_3=" + cVar.f3104g;
        }
        al.c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f3098a, cVar.f3099b, Long.valueOf(cVar.f3100c), Boolean.valueOf(cVar.f3101d), Long.valueOf(cVar.f3102e), cVar.f3103f, cVar.f3104g);
        String str = cVar.f3098a + "-" + cVar.f3099b;
        b bVar = new b();
        bVar.f3095a = str;
        bVar.f3096b = cVar.f3100c;
        bVar.f3097c = string;
        return bVar;
    }

    public static void c(List<b> list) {
        if (list == null || list.isEmpty()) {
            al.c("sla batch report data is empty", new Object[0]);
            return;
        }
        al.c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f3097c);
        }
        Pair<Integer, String> pairA = ad.a(arrayList);
        al.c("sla batch report result, rspCode:%s rspMsg:%s", pairA.first, pairA.second);
        if (((Integer) pairA.first).intValue() == 200) {
            d(list);
        }
    }

    public static void d(List<b> list) {
        if (list == null || list.isEmpty()) {
            al.c("sla batch delete list is null", new Object[0]);
            return;
        }
        al.c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + a(",", list) + ")";
            al.c("sla batch delete where:%s", str);
            w.a().a("t_sla", str);
        } catch (Throwable th) {
            al.b(th);
        }
    }

    private static void e(List<b> list) {
        for (b bVar : list) {
            al.c("sla save id:%s time:%s msg:%s", bVar.f3095a, Long.valueOf(bVar.f3096b), bVar.f3097c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f3095a);
                contentValues.put("_tm", Long.valueOf(bVar.f3096b));
                contentValues.put("_dt", bVar.f3097c);
                w.a().a("t_sla", contentValues, (v) null);
            } catch (Throwable th) {
                al.b(th);
            }
        }
    }

    public final void a(c cVar) {
        if (TextUtils.isEmpty(cVar.f3099b)) {
            al.d("sla report event is null", new Object[0]);
        } else {
            al.c("sla report single event", new Object[0]);
            a(Collections.singletonList(cVar));
        }
    }

    public final void a(List<c> list) {
        if (list == null || list.isEmpty()) {
            al.d("sla batch report event is null", new Object[0]);
            return;
        }
        al.c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarB = b(it.next());
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        e(arrayList);
        b(arrayList);
    }

    public final void b(List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ak.a().a(new c0(0, list));
        } else {
            c(list);
        }
    }
}
