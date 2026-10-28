package ec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f4688d;

    static {
        a aVar = new a("SUSPEND", 0);
        f4685a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f4686b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f4687c = aVar3;
        f4688d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4688d.clone();
    }
}
