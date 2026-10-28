package n3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f8749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f8750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o[] f8751c;

    static {
        o oVar = new o("Ltr", 0);
        f8749a = oVar;
        o oVar2 = new o("Rtl", 1);
        f8750b = oVar2;
        f8751c = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f8751c.clone();
    }
}
