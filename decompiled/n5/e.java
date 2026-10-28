package n5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f8822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f8823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f8824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f8825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f8826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f8827g;

    static {
        e eVar = new e("ERROR_CORRECTION", 0);
        f8821a = eVar;
        e eVar2 = new e("CHARACTER_SET", 1);
        f8822b = eVar2;
        e eVar3 = new e("DATA_MATRIX_SHAPE", 2);
        e eVar4 = new e("MIN_SIZE", 3);
        e eVar5 = new e("MAX_SIZE", 4);
        e eVar6 = new e("MARGIN", 5);
        f8823c = eVar6;
        e eVar7 = new e("PDF417_COMPACT", 6);
        e eVar8 = new e("PDF417_COMPACTION", 7);
        e eVar9 = new e("PDF417_DIMENSIONS", 8);
        e eVar10 = new e("AZTEC_LAYERS", 9);
        e eVar11 = new e("QR_VERSION", 10);
        f8824d = eVar11;
        e eVar12 = new e("QR_MASK_PATTERN", 11);
        f8825e = eVar12;
        e eVar13 = new e("GS1_FORMAT", 12);
        f8826f = eVar13;
        f8827g = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f8827g.clone();
    }
}
