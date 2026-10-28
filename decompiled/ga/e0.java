package ga;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f6068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f6069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e0[] f6070d;

    static {
        e0 e0Var = new e0("ONE_COLLECTION_PARAMETER", 0);
        f6067a = e0Var;
        e0 e0Var2 = new e0("OBJECT_PARAMETER_NON_GENERIC", 1);
        f6068b = e0Var2;
        e0 e0Var3 = new e0("OBJECT_PARAMETER_GENERIC", 2);
        f6069c = e0Var3;
        f6070d = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f6070d.clone();
    }
}
