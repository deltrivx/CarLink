package r3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f11527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f11528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f11529c;

    static {
        a0 a0Var = new a0("Inherit", 0);
        f11527a = a0Var;
        a0 a0Var2 = new a0("SecureOn", 1);
        f11528b = a0Var2;
        f11529c = new a0[]{a0Var, a0Var2, new a0("SecureOff", 2)};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f11529c.clone();
    }
}
