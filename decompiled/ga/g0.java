package ga;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f6076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f6077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f6078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g0[] f6079f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6080a;

    static {
        g0 g0Var = new g0("NULL", 0, null);
        f6075b = g0Var;
        g0 g0Var2 = new g0("INDEX", 1, -1);
        f6076c = g0Var2;
        g0 g0Var3 = new g0("FALSE", 2, Boolean.FALSE);
        f6077d = g0Var3;
        f0 f0Var = new f0("MAP_GET_OR_DEFAULT", 3, null);
        f6078e = f0Var;
        f6079f = new g0[]{g0Var, g0Var2, g0Var3, f0Var};
    }

    public g0(String str, int i7, Object obj) {
        super(str, i7);
        this.f6080a = obj;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f6079f.clone();
    }
}
