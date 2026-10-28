package n5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f8844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f8845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f8846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f8847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f8848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f8849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f8850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f8851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f8852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f8853j;
    public static final /* synthetic */ n[] k;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    static {
        n nVar = new n("OTHER", 0);
        n nVar2 = new n("ORIENTATION", 1);
        f8844a = nVar2;
        n nVar3 = new n("BYTE_SEGMENTS", 2);
        f8845b = nVar3;
        n nVar4 = new n("ERROR_CORRECTION_LEVEL", 3);
        f8846c = nVar4;
        n nVar5 = new n("ISSUE_NUMBER", 4);
        f8847d = nVar5;
        n nVar6 = new n("SUGGESTED_PRICE", 5);
        f8848e = nVar6;
        n nVar7 = new n("POSSIBLE_COUNTRY", 6);
        f8849f = nVar7;
        n nVar8 = new n("UPC_EAN_EXTENSION", 7);
        f8850g = nVar8;
        n nVar9 = new n("PDF417_EXTRA_METADATA", 8);
        f8851h = nVar9;
        n nVar10 = new n("STRUCTURED_APPEND_SEQUENCE", 9);
        f8852i = nVar10;
        n nVar11 = new n("STRUCTURED_APPEND_PARITY", 10);
        f8853j = nVar11;
        k = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) k.clone();
    }
}
