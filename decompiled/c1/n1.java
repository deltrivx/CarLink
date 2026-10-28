package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f2012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f2013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n1[] f2014c;

    static {
        n1 n1Var = new n1("THUMB", 0);
        f2012a = n1Var;
        n1 n1Var2 = new n1("TRACK", 1);
        f2013b = n1Var2;
        f2014c = new n1[]{n1Var, n1Var2};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f2014c.clone();
    }
}
