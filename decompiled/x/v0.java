package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f14491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f14492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v0[] f14493c;

    static {
        v0 v0Var = new v0("Default", 0);
        f14491a = v0Var;
        v0 v0Var2 = new v0("UserInput", 1);
        f14492b = v0Var2;
        f14493c = new v0[]{v0Var, v0Var2, new v0("PreventUserInput", 2)};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f14493c.clone();
    }
}
