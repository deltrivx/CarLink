package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f10726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f10727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k1[] f10728c;

    static {
        k1 k1Var = new k1("Width", 0);
        f10726a = k1Var;
        k1 k1Var2 = new k1("Height", 1);
        f10727b = k1Var2;
        f10728c = new k1[]{k1Var, k1Var2};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f10728c.clone();
    }
}
