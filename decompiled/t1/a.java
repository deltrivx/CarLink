package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f12728c;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f12726a = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f12727b = aVar2;
        f12728c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12728c.clone();
    }
}
