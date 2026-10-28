package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f15247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f15248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f15249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f15250d;

    static {
        o oVar = new o("ALL", 0);
        f15247a = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f15248b = oVar2;
        o oVar3 = new o("NONE", 2);
        f15249c = oVar3;
        f15250d = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f15250d.clone();
    }
}
