package n6;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f8856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f8857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f8859d = {"ro.flyme.published", "ro.flyme.version.id"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f8860e = {"ro.smartisan.sa", "ro.smartisan.version"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f8861f = {"ro.letv.release.version", "ro.letv.release.version_date", "ro.product.letv_model", "ro.product.letv_name", "sys.letv.fmodelaid", "persist.sys.leui.bootreason", "ro.config.leui_ringtone_slot2", "ro.leui_oem_unlock_enable"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f8862g = {"ro.config.lgsi.fp.incremental", "ro.config.lgsi.os.version"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f8863h = {"ro.com.zui.version", "ro.zui.version.status", "ro.zui.hardware.displayid", "persist.radio.zui.feature", "ro.config.zuisdk.enabled"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8865j;
    public static final String k;

    /* JADX WARN: Code duplicated, block: B:120:0x0398  */
    static {
        int i7;
        String[] strArr = {"ro.miui.build.region", "ro.miui.region", "ro.vendor.miui.region"};
        f8856a = strArr;
        String[] strArr2 = {"ro.miui.ui.version.name", "ro.miui.ui.version.code"};
        f8857b = strArr;
        String[] strArr3 = {"ro.build.display.id", "ro.build.display.id.show", "persist.sys.oplus.ota_ver_display", "ro.build.version.oplusrom", "ro.build.version.oplusrom.confidential"};
        String[] strArr4 = {"ro.vivo.product.version", "ro.vivo.default.version", "ro.vivo.build.version.incremental", "ro.vivo.product.version.incremental", "ro.vivo.build.version", "ro.vivo.system.product.version", "ro.build.software.version"};
        String[] strArr5 = {"msc.config.magic.version", "ro.build.version.magic"};
        String[] strArr6 = {"ro.product.anco.devicetype", "ro.sys.anco.product.software.version", "ro.product.os.dist.anco.apiversion", "ro.product.os.dist.anco.releasetype"};
        String[] strArr7 = {"ro.honor.build.display.id", "persist.sys.hiview.base_version", "ro.comp.hl.product_base_version", "ro.build.display.id"};
        String[] strArr8 = {"ro.huawei.build.display.id", "ro.comp.hl.product_base_version", "persist.sys.hiview.base_version", "hw_sc.build.platform.version"};
        f8858c = strArr8;
        String[] strArr9 = {"ro.build.ohos.devicetype", "persist.sys.ohos.osd.cloud.switch"};
        if (l.F(new String[]{"ro.mi.os.version.name", "ro.mi.os.version.code", "ro.mi.os.version.incremental"})) {
            f8864i = -1248529104;
            f8865j = "HyperOS";
            k = c("ro.mi.os.version.incremental");
        } else if (l.F(strArr2)) {
            f8864i = 2366768;
            f8865j = "MIUI";
            k = c("ro.build.version.incremental");
        }
        if (f8865j == null) {
            String strE = l.E("ro.build.version.realmeui");
            if (!TextUtils.isEmpty(strE)) {
                f8864i = -859411254;
                f8865j = "realmeUI";
                k = d(strE);
            } else if (TextUtils.isEmpty(l.E("ro.build.version.oplusrom"))) {
                String strE2 = l.E("ro.build.version.opporom");
                if (!TextUtils.isEmpty(strE2)) {
                    f8864i = -1680767897;
                    f8865j = "ColorOS";
                    k = d(strE2);
                }
            } else {
                f8864i = -1680767897;
                f8865j = "ColorOS";
                k = c(strArr3);
            }
        }
        if (f8865j == null) {
            String strE3 = l.E("ro.vivo.os.build.display.id");
            if (!TextUtils.isEmpty(strE3)) {
                if (strE3.toLowerCase().contains("origin")) {
                    f8864i = 1443687338;
                    f8865j = "OriginOS";
                    k = c(strArr4);
                } else if (strE3.toLowerCase().contains("funtouch")) {
                    f8864i = -294058204;
                    f8865j = "FuntouchOS";
                    k = c("ro.vivo.os.build.display.id");
                }
            }
        }
        if (f8865j == null && l.F(strArr5)) {
            f8864i = -1801284559;
            f8865j = "MagicOS";
            k = c(strArr7);
        }
        if (f8865j == null && l.F(strArr6)) {
            f8864i = -182666708;
            f8865j = "HarmonyOS NEXT AndroidCompatible";
            k = c("ro.sys.anco.product.software.version");
        }
        if (f8865j == null && l.F(strArr9)) {
            f8864i = 1583864138;
            f8865j = "HarmonyOS";
            k = c(strArr8);
        }
        if (f8865j == null) {
            String strE4 = l.E("ro.build.version.emui");
            if (!TextUtils.isEmpty(strE4) && strE4.toLowerCase().contains("emotionui")) {
                f8864i = 2132284;
                f8865j = "EMUI";
                k = d(strE4);
            }
        }
        if (f8865j == null) {
            String strE5 = l.E("ro.build.version.oneui");
            if (!TextUtils.isEmpty(strE5)) {
                f8864i = 76334938;
                f8865j = "OneUI";
                if (strE5.matches("\\d+")) {
                    try {
                        k = e(Integer.parseInt(strE5));
                    } catch (Exception unused) {
                    }
                } else if (strE5.matches("\\d+(?:\\.\\d+)+")) {
                    k = strE5;
                }
            }
            if (f8865j == null || TextUtils.isEmpty(k)) {
                try {
                    Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
                    declaredField.setAccessible(true);
                    int i10 = declaredField.getInt(null);
                    f8864i = 76334938;
                    f8865j = "OneUI";
                    if (i10 >= 90000) {
                        k = e(i10 - 90000);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (f8865j == null) {
            String strE6 = l.E("ro.oxygen.version");
            if (!TextUtils.isEmpty(strE6)) {
                f8864i = -1363277916;
                f8865j = "OxygenOS";
                k = d(strE6);
            }
        }
        if (f8865j == null) {
            String strE7 = l.E("ro.rom.version");
            if (!TextUtils.isEmpty(strE7)) {
                f8864i = 2195534;
                f8865j = "H2OS";
                k = d(strE7);
            }
        }
        if (f8865j == null && l.F(f8859d)) {
            f8864i = 67983659;
            f8865j = "Flyme";
            k = c("ro.build.display.id");
        }
        if (f8865j == null && !TextUtils.isEmpty(l.E("ro.build.MiFavor_version"))) {
            String strE8 = l.E("ro.build.display.id");
            if (!TextUtils.isEmpty(strE8)) {
                String lowerCase = strE8.toLowerCase();
                if (lowerCase.contains("nebulaaios")) {
                    f8864i = -1668450325;
                    f8865j = "NebulaAIOS";
                    k = d(strE8);
                } else if (lowerCase.contains("redmagicos")) {
                    f8864i = -417455456;
                    f8865j = "RedMagicOS";
                    k = d(strE8);
                } else if (lowerCase.contains("myos")) {
                    f8864i = 2412720;
                    f8865j = "MyOS";
                    k = d(strE8);
                } else if (lowerCase.contains("zte")) {
                    f8864i = -203064298;
                    f8865j = "MifavorUI";
                    k = c("ro.build.MiFavor_version");
                }
            }
        }
        if (f8865j == null) {
            String strE9 = l.E("ro.build.nubia.rom.name");
            if (!TextUtils.isEmpty(strE9) && strE9.toLowerCase().contains("nubiaui")) {
                f8864i = -2010470489;
                f8865j = "nubiaUI";
                k = c("ro.build.nubia.rom.code");
                if (Build.VERSION.SDK_INT >= 27) {
                    String str = Build.VERSION.RELEASE;
                    int i11 = -1;
                    if (str == null || str.isEmpty()) {
                        i7 = -1;
                    } else {
                        String[] strArrSplit = str.split("\\.");
                        if (strArrSplit.length == 0) {
                            i7 = -1;
                        } else {
                            try {
                                i7 = Integer.parseInt(strArrSplit[0]);
                            } catch (Exception unused3) {
                                i7 = -1;
                            }
                        }
                    }
                    String str2 = k;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!str2.isEmpty()) {
                        String[] strArrSplit2 = str2.split("\\.");
                        if (strArrSplit2.length != 0) {
                            try {
                                i11 = Integer.parseInt(strArrSplit2[0]);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                    if (i7 - i11 >= 5) {
                        f8864i = -417455456;
                        f8865j = "RedMagicOS";
                    }
                }
            }
        }
        if (f8865j == null) {
            String strE10 = l.E("ro.config.lgsi.os.name");
            if (!TextUtils.isEmpty(strE10) && strE10.toLowerCase().contains("zuxos")) {
                f8864i = 85736225;
                f8865j = "ZUXOS";
                k = c(f8862g);
            } else if (l.F(f8863h)) {
                f8864i = 89198;
                f8865j = "ZUI";
                k = c("ro.com.zui.version");
            }
        }
        if (f8865j == null && !TextUtils.isEmpty(l.E("ro.asus.rog"))) {
            f8864i = 78153150;
            f8865j = "ROGUI";
            k = c("ro.build.version.incremental");
        }
        if (f8865j == null && l.F(f8860e)) {
            f8864i = 1805724132;
            f8865j = "SmartisanOS";
            k = c("ro.smartisan.version");
        }
        if (f8865j == null && l.F(f8861f)) {
            f8864i = 69017;
            f8865j = "EUI";
            k = c("ro.letv.release.version");
        }
        if (f8865j == null) {
            String strE11 = l.E("ro.build.uiversion");
            if (!TextUtils.isEmpty(strE11) && strE11.toLowerCase().contains("360ui")) {
                f8864i = 48757121;
                f8865j = "360UI";
                k = d(strE11);
            }
        }
        if (f8865j == null) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                Method method = cls.getMethod("getOsBrand", null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(cls, null);
                if (objInvoke != null && String.valueOf(objInvoke).toLowerCase().contains("harmony")) {
                    f8864i = 1583864138;
                    f8865j = "HarmonyOS";
                    k = c(f8858c);
                }
            } catch (Exception unused5) {
            }
        }
        if (f8865j == null) {
            f8865j = "";
        }
        if (k == null) {
            k = "";
        }
    }

    public static int a(String str) {
        String strGroup;
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0 || (strGroup = matcher.group(1)) == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strGroup);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        String strGroup;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d+)+)").matcher(str);
        return (!matcher.find() || matcher.groupCount() <= 0 || (strGroup = matcher.group(1)) == null) ? "" : strGroup;
    }

    public static String c(String... strArr) {
        for (String str : strArr) {
            String strB = b(l.E(str));
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        for (String str2 : strArr) {
            int iA = a(l.E(str2));
            if (iA > 0) {
                return iA + ".0";
            }
        }
        return "";
    }

    public static String d(String str) {
        String strB = b(str);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        int iA = a(str);
        if (iA <= 0) {
            return "";
        }
        return iA + ".0";
    }

    public static String e(int i7) {
        int i10 = i7 / 10000;
        int i11 = i7 % 10000;
        int i12 = i7 % 100;
        if (i12 <= 0) {
            return i10 + "." + (i11 / 100);
        }
        return i10 + "." + (i11 / 100) + "." + i12;
    }

    public static boolean f() {
        return f8864i == -1248529104;
    }

    public static boolean g() {
        if (f()) {
            String[] strArr = new String[3];
            for (int i7 = 0; i7 < 3; i7++) {
                strArr[i7] = l.E(f8856a[i7]);
            }
            for (int i10 = 0; i10 < 3; i10++) {
                if (strArr[i10].equalsIgnoreCase("cn")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h() {
        return f8864i == 2366768;
    }

    public static boolean i() {
        if (h()) {
            String[] strArr = new String[3];
            for (int i7 = 0; i7 < 3; i7++) {
                strArr[i7] = l.E(f8857b[i7]);
            }
            for (int i10 = 0; i10 < 3; i10++) {
                if (strArr[i10].equalsIgnoreCase("cn")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return Boolean.parseBoolean(String.valueOf(cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "persist.sys.miui_optimization", Boolean.valueOf(!"1".equals(String.valueOf(cls.getMethod("get", String.class, String.class).invoke(cls, "ro.miui.cts", "")))))));
        } catch (Exception unused) {
            return true;
        }
    }
}
