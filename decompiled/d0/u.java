package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f3632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f3633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f3634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f3635d;

    static {
        u uVar = new u("Vertical", 0);
        f3632a = uVar;
        u uVar2 = new u("Horizontal", 1);
        f3633b = uVar2;
        u uVar3 = new u("Both", 2);
        f3634c = uVar3;
        f3635d = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f3635d.clone();
    }
}
