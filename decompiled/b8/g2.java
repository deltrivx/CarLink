package b8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g2 f1594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g2[] f1595c;

    static {
        g2 g2Var = new g2("TRIGGER", 0);
        f1593a = g2Var;
        g2 g2Var2 = new g2("ACTION", 1);
        f1594b = g2Var2;
        f1595c = new g2[]{g2Var, g2Var2};
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f1595c.clone();
    }
}
