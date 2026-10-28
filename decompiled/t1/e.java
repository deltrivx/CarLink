package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f12752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f12753c;

    static {
        e eVar = new e("VIEW_APPEAR", 0);
        f12751a = eVar;
        e eVar2 = new e("VIEW_DISAPPEAR", 1);
        f12752b = eVar2;
        f12753c = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f12753c.clone();
    }
}
