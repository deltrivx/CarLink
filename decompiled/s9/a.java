package s9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f12649c;

    static {
        a aVar = new a("CALL_BY_NAME", 0);
        f12647a = aVar;
        a aVar2 = new a("POSITIONAL_CALL", 1);
        f12648b = aVar2;
        f12649c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12649c.clone();
    }
}
