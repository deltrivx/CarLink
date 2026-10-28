package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f13851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f13852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m0[] f13853d;

    static {
        m0 m0Var = new m0("Left", 0);
        f13850a = m0Var;
        m0 m0Var2 = new m0("Middle", 1);
        f13851b = m0Var2;
        m0 m0Var3 = new m0("Right", 2);
        f13852c = m0Var3;
        f13853d = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f13853d.clone();
    }
}
