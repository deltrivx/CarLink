package nb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f9033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f9034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s0[] f9035c;

    static {
        s0 s0Var = new s0("SUPERTYPE", 0);
        f9033a = s0Var;
        s0 s0Var2 = new s0("COMMON", 1);
        f9034b = s0Var2;
        f9035c = new s0[]{s0Var, s0Var2};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f9035c.clone();
    }
}
