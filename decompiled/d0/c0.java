package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f3546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f3547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c0[] f3548c;

    static {
        c0 c0Var = new c0("Min", 0);
        f3546a = c0Var;
        c0 c0Var2 = new c0("Max", 1);
        f3547b = c0Var2;
        f3548c = new c0[]{c0Var, c0Var2};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f3548c.clone();
    }
}
