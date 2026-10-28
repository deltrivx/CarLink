package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f5068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f5070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o1 f5071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o1 f5072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o1 f5073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o1 f5074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ o1[] f5075h;

    static {
        o1 o1Var = new o1("Invalid", 0);
        f5068a = o1Var;
        o1 o1Var2 = new o1("Cancelled", 1);
        f5069b = o1Var2;
        o1 o1Var3 = new o1("InitialPending", 2);
        f5070c = o1Var3;
        o1 o1Var4 = new o1("RecomposePending", 3);
        f5071d = o1Var4;
        o1 o1Var5 = new o1("Recomposing", 4);
        f5072e = o1Var5;
        o1 o1Var6 = new o1("ApplyPending", 5);
        f5073f = o1Var6;
        o1 o1Var7 = new o1("Applied", 6);
        f5074g = o1Var7;
        f5075h = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f5075h.clone();
    }
}
