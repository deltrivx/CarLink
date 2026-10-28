package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f10805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f10806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f10807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f10808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f10809e;

    static {
        u uVar = new u("LookaheadMeasurement", 0);
        f10805a = uVar;
        u uVar2 = new u("LookaheadPlacement", 1);
        f10806b = uVar2;
        u uVar3 = new u("Measurement", 2);
        f10807c = uVar3;
        u uVar4 = new u("Placement", 3);
        f10808d = uVar4;
        f10809e = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f10809e.clone();
    }
}
