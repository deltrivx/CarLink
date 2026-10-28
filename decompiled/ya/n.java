package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f15244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f15245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f15246c;

    static {
        n nVar = new n("RENDER_OVERRIDE", 0);
        f15244a = nVar;
        n nVar2 = new n("RENDER_OPEN", 1);
        f15245b = nVar2;
        f15246c = new n[]{nVar, nVar2, new n("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f15246c.clone();
    }
}
