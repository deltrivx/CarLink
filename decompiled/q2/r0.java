package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f10789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f10790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r0[] f10791d;

    static {
        r0 r0Var = new r0("IsPlacedInLookahead", 0);
        f10788a = r0Var;
        r0 r0Var2 = new r0("IsPlacedInApproach", 1);
        f10789b = r0Var2;
        r0 r0Var3 = new r0("IsNotPlaced", 2);
        f10790c = r0Var3;
        f10791d = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f10791d.clone();
    }
}
