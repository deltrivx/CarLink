package cb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f2585b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("WARNING", 0);
        a aVar2 = new a("ERROR", 1);
        f2584a = aVar2;
        f2585b = new a[]{aVar, aVar2, new a("HIDDEN", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2585b.clone();
    }
}
