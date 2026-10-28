package qb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f11023b;

    static {
        b bVar = new b("FOR_SUBTYPING", 0);
        f11022a = bVar;
        f11023b = new b[]{bVar, new b("FOR_INCORPORATION", 1), new b("FROM_EXPRESSION", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11023b.clone();
    }
}
