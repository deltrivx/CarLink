package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f8334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f8335c;

    static {
        i iVar = new i("STABLE", 0);
        f8333a = iVar;
        i iVar2 = new i("UNSTABLE", 1);
        f8334b = iVar2;
        f8335c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8335c.clone();
    }
}
