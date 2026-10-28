package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f14746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f14748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f14749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f14750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f14751f;

    static {
        x xVar = new x("FINAL", 0);
        f14747b = xVar;
        x xVar2 = new x("SEALED", 1);
        f14748c = xVar2;
        x xVar3 = new x("OPEN", 2);
        f14749d = xVar3;
        x xVar4 = new x("ABSTRACT", 3);
        f14750e = xVar4;
        f14751f = new x[]{xVar, xVar2, xVar3, xVar4};
        f14746a = new o0(5);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f14751f.clone();
    }
}
