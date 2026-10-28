package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f13838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f13839d;

    static {
        l lVar = new l("BEFORE", 0);
        f13836a = lVar;
        l lVar2 = new l("ON", 1);
        f13837b = lVar2;
        l lVar3 = new l("AFTER", 2);
        f13838c = lVar3;
        f13839d = new l[]{lVar, lVar2, lVar3};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f13839d.clone();
    }
}
