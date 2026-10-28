package qc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f11031c;

    static {
        a aVar = new a("NONE", 0);
        f11029a = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f11030b = aVar3;
        f11031c = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11031c.clone();
    }
}
