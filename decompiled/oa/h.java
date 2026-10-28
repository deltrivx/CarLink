package oa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f9592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f9593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f9594d;

    static {
        h hVar = new h("FORCE_FLEXIBILITY", 0);
        f9591a = hVar;
        h hVar2 = new h("NULLABLE", 1);
        f9592b = hVar2;
        h hVar3 = new h("NOT_NULL", 2);
        f9593c = hVar3;
        f9594d = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9594d.clone();
    }
}
