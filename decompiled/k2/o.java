package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f7270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f7271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f7272d;

    static {
        o oVar = new o("Initial", 0);
        f7269a = oVar;
        o oVar2 = new o("Main", 1);
        f7270b = oVar2;
        o oVar3 = new o("Final", 2);
        f7271c = oVar3;
        f7272d = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f7272d.clone();
    }
}
