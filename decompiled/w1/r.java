package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f14069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f14071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f14072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f14073e;

    static {
        r rVar = new r("Active", 0);
        f14069a = rVar;
        r rVar2 = new r("ActiveParent", 1);
        f14070b = rVar2;
        r rVar3 = new r("Captured", 2);
        f14071c = rVar3;
        r rVar4 = new r("Inactive", 3);
        f14072d = rVar4;
        f14073e = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f14073e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new cc.s();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new cc.s();
            }
        }
        return true;
    }
}
