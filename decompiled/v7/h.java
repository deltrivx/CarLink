package v7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f13651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f13652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f13653d;

    static {
        h hVar = new h("Option", 0);
        f13650a = hVar;
        h hVar2 = new h("Display", 1);
        f13651b = hVar2;
        h hVar3 = new h("Settings", 2);
        f13652c = hVar3;
        f13653d = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f13653d.clone();
    }
}
