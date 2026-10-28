package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f9416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q0[] f9417c;

    static {
        q0 q0Var = new q0("Width", 0);
        f9415a = q0Var;
        q0 q0Var2 = new q0("Height", 1);
        f9416b = q0Var2;
        f9417c = new q0[]{q0Var, q0Var2};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f9417c.clone();
    }
}
