package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f14004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f14006c;

    static {
        x xVar = new x("EditableText", 0);
        f14004a = xVar;
        x xVar2 = new x("StaticText", 1);
        f14005b = xVar2;
        f14006c = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f14006c.clone();
    }
}
