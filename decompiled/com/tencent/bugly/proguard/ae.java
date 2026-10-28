package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ae {
    public static bq a(Context context, int i7, byte[] bArr) {
        String str;
        aa aaVarB = aa.b();
        StrategyBean strategyBeanC = ac.a().c();
        if (aaVarB == null || strategyBeanC == null) {
            al.e("Can not create request pkg for parameters is invalid.", new Object[0]);
            return null;
        }
        try {
            bq bqVar = new bq();
            synchronized (aaVarB) {
                try {
                    bqVar.f3334a = aaVarB.f3052b;
                    bqVar.f3335b = aaVarB.e();
                    bqVar.f3336c = aaVarB.f3053c;
                    bqVar.f3337d = aaVarB.f3064o;
                    bqVar.f3338e = aaVarB.f3068s;
                    bqVar.f3339f = aaVarB.f3058h;
                    bqVar.f3340g = i7;
                    if (bArr == null) {
                        bArr = "".getBytes();
                    }
                    bqVar.f3341h = bArr;
                    bqVar.f3342i = aaVarB.h();
                    bqVar.f3343j = aaVarB.k;
                    bqVar.k = new HashMap();
                    bqVar.f3344l = aaVarB.d();
                    bqVar.f3345m = strategyBeanC.f2985o;
                    bqVar.f3347o = aaVarB.g();
                    bqVar.f3348p = ab.c(context);
                    bqVar.f3349q = System.currentTimeMillis();
                    bqVar.f3351s = aaVarB.i();
                    bqVar.f3354v = aaVarB.g();
                    bqVar.f3355w = bqVar.f3348p;
                    bqVar.f3346n = "com.tencent.bugly";
                    bqVar.k.put("A26", aaVarB.s());
                    Map<String, String> map = bqVar.k;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aa.C());
                    map.put("A62", sb2.toString());
                    Map<String, String> map2 = bqVar.k;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(aa.D());
                    map2.put("A63", sb3.toString());
                    Map<String, String> map3 = bqVar.k;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(aaVarB.J);
                    map3.put("F11", sb4.toString());
                    Map<String, String> map4 = bqVar.k;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(aaVarB.I);
                    map4.put("F12", sb5.toString());
                    bqVar.k.put("D3", aaVarB.f3066q);
                    List<o> list = p.f3464b;
                    if (list != null) {
                        for (o oVar : list) {
                            String str2 = oVar.versionKey;
                            if (str2 != null && (str = oVar.version) != null) {
                                bqVar.k.put(str2, str);
                            }
                        }
                    }
                    bqVar.k.put("G15", ap.d("G15", ""));
                    bqVar.k.put("G10", ap.d("G10", ""));
                    bqVar.k.put("D4", ap.d("D4", "0"));
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map<String, String> mapX = aaVarB.x();
            if (mapX != null) {
                for (Map.Entry<String, String> entry : mapX.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getValue())) {
                        bqVar.k.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            return bqVar;
        } catch (Throwable th2) {
            if (!al.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static br a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            e eVar = new e();
            eVar.b();
            eVar.a("utf-8");
            eVar.a(bArr);
            Object objB = eVar.b("detail", new br());
            if (br.class.isInstance(objB)) {
                return (br) br.class.cast(objB);
            }
            return null;
        } catch (Throwable th) {
            if (al.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public static bu a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        bu buVar = new bu();
        buVar.f3384a = userInfoBean.f2955e;
        buVar.f3388e = userInfoBean.f2960j;
        buVar.f3387d = userInfoBean.f2953c;
        buVar.f3386c = userInfoBean.f2954d;
        buVar.f3391h = userInfoBean.f2964o == 1;
        int i7 = userInfoBean.f2952b;
        if (i7 == 1) {
            buVar.f3385b = (byte) 1;
        } else if (i7 == 2) {
            buVar.f3385b = (byte) 4;
        } else if (i7 == 3) {
            buVar.f3385b = (byte) 2;
        } else if (i7 == 4) {
            buVar.f3385b = (byte) 3;
        } else if (i7 == 8) {
            buVar.f3385b = (byte) 8;
        } else {
            if (i7 < 10 || i7 >= 20) {
                al.e("unknown uinfo type %d ", Integer.valueOf(i7));
                return null;
            }
            buVar.f3385b = (byte) i7;
        }
        HashMap map = new HashMap();
        buVar.f3389f = map;
        if (userInfoBean.f2965p >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f2965p);
            map.put("C01", sb2.toString());
        }
        if (userInfoBean.f2966q >= 0) {
            Map<String, String> map2 = buVar.f3389f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(userInfoBean.f2966q);
            map2.put("C02", sb3.toString());
        }
        Map<String, String> map3 = userInfoBean.f2967r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f2967r.entrySet()) {
                buVar.f3389f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f2968s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f2968s.entrySet()) {
                buVar.f3389f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = buVar.f3389f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(!userInfoBean.f2961l);
        map5.put("A36", sb4.toString());
        Map<String, String> map6 = buVar.f3389f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f2957g);
        map6.put("F02", sb5.toString());
        Map<String, String> map7 = buVar.f3389f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f2958h);
        map7.put("F03", sb6.toString());
        buVar.f3389f.put("F04", userInfoBean.f2960j);
        Map<String, String> map8 = buVar.f3389f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f2959i);
        map8.put("F05", sb7.toString());
        buVar.f3389f.put("F06", userInfoBean.f2962m);
        Map<String, String> map9 = buVar.f3389f;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(userInfoBean.k);
        map9.put("F10", sb8.toString());
        al.c("summary type %d vm:%d", Byte.valueOf(buVar.f3385b), Integer.valueOf(buVar.f3389f.size()));
        return buVar;
    }

    public static <T extends m> T a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                k kVar = new k(bArr);
                kVar.a("utf-8");
                tNewInstance.a(kVar);
                return tNewInstance;
            } catch (Throwable th) {
                if (!al.b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static byte[] a(m mVar) {
        try {
            l lVar = new l();
            lVar.a("utf-8");
            mVar.a(lVar);
            byte[] bArr = new byte[lVar.f3448a.position()];
            System.arraycopy(lVar.f3448a.array(), 0, bArr, 0, lVar.f3448a.position());
            return bArr;
        } catch (Throwable th) {
            if (al.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Object obj) {
        try {
            e eVar = new e();
            eVar.b();
            eVar.a("utf-8");
            eVar.c();
            eVar.b("RqdServer");
            eVar.c("sync");
            eVar.a("detail", obj);
            return eVar.a();
        } catch (Throwable th) {
            if (al.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
