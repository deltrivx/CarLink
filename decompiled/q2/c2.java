package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f10601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f10602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f10603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c2[] f10604d;

    static {
        c2 c2Var = new c2("ContinueTraversal", 0);
        f10601a = c2Var;
        c2 c2Var2 = new c2("SkipSubtreeAndContinueTraversal", 1);
        f10602b = c2Var2;
        c2 c2Var3 = new c2("CancelTraversal", 2);
        f10603c = c2Var3;
        f10604d = new c2[]{c2Var, c2Var2, c2Var3};
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) f10604d.clone();
    }
}
