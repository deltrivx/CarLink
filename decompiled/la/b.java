package la;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f8292d;

    static {
        b bVar = new b("INFLEXIBLE", 0);
        f8289a = bVar;
        b bVar2 = new b("FLEXIBLE_UPPER_BOUND", 1);
        f8290b = bVar2;
        b bVar3 = new b("FLEXIBLE_LOWER_BOUND", 2);
        f8291c = bVar3;
        f8292d = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8292d.clone();
    }
}
