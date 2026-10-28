package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f9405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f9406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p0[] f9407c;

    static {
        p0 p0Var = new p0("Min", 0);
        f9405a = p0Var;
        p0 p0Var2 = new p0("Max", 1);
        f9406b = p0Var2;
        f9407c = new p0[]{p0Var, p0Var2};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f9407c.clone();
    }
}
