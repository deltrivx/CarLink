package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f13824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f13825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f13826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f13827d;

    static {
        k kVar = new k("CROSSED", 0);
        f13824a = kVar;
        k kVar2 = new k("NOT_CROSSED", 1);
        f13825b = kVar2;
        k kVar3 = new k("COLLAPSED", 2);
        f13826c = kVar3;
        f13827d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f13827d.clone();
    }
}
