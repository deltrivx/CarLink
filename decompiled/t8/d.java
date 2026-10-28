package t8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f12820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f12821b;

    static {
        d dVar = new d("WARNING", 0);
        f12820a = dVar;
        f12821b = new d[]{dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12821b.clone();
    }
}
