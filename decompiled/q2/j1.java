package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f10722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f10723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j1[] f10724c;

    static {
        j1 j1Var = new j1("Min", 0);
        f10722a = j1Var;
        j1 j1Var2 = new j1("Max", 1);
        f10723b = j1Var2;
        f10724c = new j1[]{j1Var, j1Var2};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f10724c.clone();
    }
}
