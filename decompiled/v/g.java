package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f13358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f13359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f13360c;

    static {
        g gVar = new g("BoundReached", 0);
        f13358a = gVar;
        g gVar2 = new g("Finished", 1);
        f13359b = gVar2;
        f13360c = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13360c.clone();
    }
}
