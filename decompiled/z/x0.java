package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f15591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f15592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x0[] f15593c;

    static {
        x0 x0Var = new x0("Vertical", 0);
        f15591a = x0Var;
        x0 x0Var2 = new x0("Horizontal", 1);
        f15592b = x0Var2;
        f15593c = new x0[]{x0Var, x0Var2};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f15593c.clone();
    }
}
