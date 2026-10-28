package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f9534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f9535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f9536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f9537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f9538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f9539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f9540g;

    static {
        v vVar = new v("Unconnected", 0);
        f9534a = vVar;
        v vVar2 = new v("Connecting", 1);
        f9535b = vVar2;
        v vVar3 = new v("Connected", 2);
        f9536c = vVar3;
        v vVar4 = new v("VersionNotSupport", 3);
        f9537d = vVar4;
        v vVar5 = new v("Disconnected", 4);
        f9538e = vVar5;
        v vVar6 = new v("AuthFailed", 5);
        f9539f = vVar6;
        f9540g = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f9540g.clone();
    }
}
