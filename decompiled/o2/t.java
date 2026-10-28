package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f9424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f9425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f9426c;

    static {
        t tVar = new t("Width", 0);
        f9424a = tVar;
        t tVar2 = new t("Height", 1);
        f9425b = tVar2;
        f9426c = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f9426c.clone();
    }
}
