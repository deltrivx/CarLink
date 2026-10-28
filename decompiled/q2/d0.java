package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f10606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f10607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f10608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f10609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f10610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d0[] f10611f;

    static {
        d0 d0Var = new d0("Measuring", 0);
        f10606a = d0Var;
        d0 d0Var2 = new d0("LookaheadMeasuring", 1);
        f10607b = d0Var2;
        d0 d0Var3 = new d0("LayingOut", 2);
        f10608c = d0Var3;
        d0 d0Var4 = new d0("LookaheadLayingOut", 3);
        f10609d = d0Var4;
        d0 d0Var5 = new d0("Idle", 4);
        f10610e = d0Var5;
        f10611f = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f10611f.clone();
    }
}
