package pa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f10325d;

    static {
        b bVar = new b("PROPERTY", 0);
        f10322a = bVar;
        b bVar2 = new b("BACKING_FIELD", 1);
        f10323b = bVar2;
        b bVar3 = new b("DELEGATE_FIELD", 2);
        f10324c = bVar3;
        f10325d = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10325d.clone();
    }
}
