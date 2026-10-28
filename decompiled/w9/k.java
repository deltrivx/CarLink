package w9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f14207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f14208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f14209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f14210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f14211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f14212f;

    static {
        k kVar = new k("HIDDEN", 0);
        f14207a = kVar;
        k kVar2 = new k("VISIBLE", 1);
        f14208b = kVar2;
        k kVar3 = new k("DEPRECATED_LIST_METHODS", 2);
        f14209c = kVar3;
        k kVar4 = new k("NOT_CONSIDERED", 3);
        f14210d = kVar4;
        k kVar5 = new k("DROP", 4);
        f14211e = kVar5;
        f14212f = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f14212f.clone();
    }
}
