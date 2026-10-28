package pa;

import cc.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import nb.a0;
import nb.w;
import ra.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements jb.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f10335b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10336c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10337d = new f();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k b(String str) {
        eb.c cVar;
        i9.l.e(str, "representation");
        char cCharAt = str.charAt(0);
        eb.c[] cVarArrValues = eb.c.values();
        int length = cVarArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i7];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i7++;
        }
        if (cVar != null) {
            return new j(cVar);
        }
        if (cCharAt == 'V') {
            return new j(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            i9.l.d(strSubstring, "substring(...)");
            return new h(b(strSubstring));
        }
        if (cCharAt == 'L') {
            zb.j.u0(';', str);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        i9.l.d(strSubstring2, "substring(...)");
        return new i(strSubstring2);
    }

    public static i c(String str) {
        i9.l.e(str, "internalName");
        return new i(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        i9.l.e(str, "internalName");
        i9.l.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        i9.l.e(strArr, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(k kVar) {
        String strC;
        i9.l.e(kVar, "type");
        if (kVar instanceof h) {
            return "[" + h(((h) kVar).f10341i);
        }
        if (kVar instanceof j) {
            eb.c cVar = ((j) kVar).f10343i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (kVar instanceof i) {
            return a2.f.I(new StringBuilder("L"), ((i) kVar).f10342i, ';');
        }
        throw new s();
    }

    @Override // jb.n
    public w d(s0 s0Var, String str, a0 a0Var, a0 a0Var2) {
        i9.l.e(s0Var, "proto");
        i9.l.e(str, "flexibleId");
        i9.l.e(a0Var, "lowerBound");
        i9.l.e(a0Var2, "upperBound");
        if (str.equals("kotlin.jvm.PlatformType")) {
            return s0Var.j(ua.k.f13306g) ? new la.h(a0Var, a0Var2) : nb.c.e(a0Var, a0Var2);
        }
        return pb.l.c(pb.k.ERROR_FLEXIBLE_TYPE, str, a0Var.toString(), a0Var2.toString());
    }
}
