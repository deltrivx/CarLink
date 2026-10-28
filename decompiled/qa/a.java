package qa;

import java.util.LinkedHashMap;
import u8.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4.e f10989b = new n4.e(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f10990c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10998a;

    static {
        a[] aVarArrValues = values();
        int iS0 = c0.S0(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0 < 16 ? 16 : iS0);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f10998a), aVar);
        }
        f10990c = linkedHashMap;
    }

    a(int i7) {
        this.f10998a = i7;
    }
}
