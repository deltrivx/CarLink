package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f3694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f3695d;

    static {
        g gVar = new g("Focused", 0);
        f3692a = gVar;
        g gVar2 = new g("UnfocusedEmpty", 1);
        f3693b = gVar2;
        g gVar3 = new g("UnfocusedNotEmpty", 2);
        f3694c = gVar3;
        f3695d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f3695d.clone();
    }
}
