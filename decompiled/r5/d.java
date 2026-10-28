package r5;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11627a = Pattern.compile(",");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f11628b;

    static {
        EnumSet enumSetOf = EnumSet.of(n5.a.f8800l);
        EnumSet enumSetOf2 = EnumSet.of(n5.a.f8795f);
        EnumSet enumSetOf3 = EnumSet.of(n5.a.f8790a);
        EnumSet enumSetOf4 = EnumSet.of(n5.a.k);
        EnumSet enumSetOf5 = EnumSet.of(n5.a.f8803o, n5.a.f8804p, n5.a.f8797h, n5.a.f8796g, n5.a.f8801m, n5.a.f8802n);
        EnumSet enumSetOf6 = EnumSet.of(n5.a.f8792c, n5.a.f8793d, n5.a.f8794e, n5.a.f8798i, n5.a.f8791b);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f11628b = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
