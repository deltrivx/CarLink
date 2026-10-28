package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f5199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f5200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f5201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x1 f5202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x1[] f5203g;

    static {
        x1 x1Var = new x1("ShutDown", 0);
        f5197a = x1Var;
        x1 x1Var2 = new x1("ShuttingDown", 1);
        f5198b = x1Var2;
        x1 x1Var3 = new x1("Inactive", 2);
        f5199c = x1Var3;
        x1 x1Var4 = new x1("InactivePendingWork", 3);
        f5200d = x1Var4;
        x1 x1Var5 = new x1("Idle", 4);
        f5201e = x1Var5;
        x1 x1Var6 = new x1("PendingWork", 5);
        f5202f = x1Var6;
        f5203g = new x1[]{x1Var, x1Var2, x1Var3, x1Var4, x1Var5, x1Var6};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f5203g.clone();
    }
}
