package wa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f14280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f14281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f14282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f14283d;

    static {
        i iVar = new i("BEGINNING", 0);
        f14280a = iVar;
        i iVar2 = new i("MIDDLE", 1);
        f14281b = iVar2;
        i iVar3 = new i("AFTER_DOT", 2);
        f14282c = iVar3;
        f14283d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f14283d.clone();
    }
}
