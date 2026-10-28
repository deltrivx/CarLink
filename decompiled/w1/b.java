package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f14031d;

    static {
        b bVar = new b("None", 0);
        f14028a = bVar;
        b bVar2 = new b("Cancelled", 1);
        f14029b = bVar2;
        b bVar3 = new b("Redirected", 2);
        f14030c = bVar3;
        f14031d = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14031d.clone();
    }
}
