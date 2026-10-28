package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f5095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f5096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f5097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f5098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q0[] f5099e;

    static {
        q0 q0Var = new q0("IGNORED", 0);
        f5095a = q0Var;
        q0 q0Var2 = new q0("SCHEDULED", 1);
        f5096b = q0Var2;
        q0 q0Var3 = new q0("DEFERRED", 2);
        f5097c = q0Var3;
        q0 q0Var4 = new q0("IMMINENT", 3);
        f5098d = q0Var4;
        f5099e = new q0[]{q0Var, q0Var2, q0Var3, q0Var4};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f5099e.clone();
    }
}
