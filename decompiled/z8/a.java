package z8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f15777d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f15774a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f15775b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f15776c = aVar3;
        f15777d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15777d.clone();
    }
}
