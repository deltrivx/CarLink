package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f7679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f7680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i0[] f7681d;

    static {
        i0 i0Var = new i0("None", 0);
        f7678a = i0Var;
        i0 i0Var2 = new i0("Selection", 1);
        f7679b = i0Var2;
        i0 i0Var3 = new i0("Cursor", 2);
        f7680c = i0Var3;
        f7681d = new i0[]{i0Var, i0Var2, i0Var3};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f7681d.clone();
    }
}
