package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f14701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f14703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f14705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f14706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f14707g;

    static {
        f fVar = new f("CLASS", 0);
        f14701a = fVar;
        f fVar2 = new f("INTERFACE", 1);
        f14702b = fVar2;
        f fVar3 = new f("ENUM_CLASS", 2);
        f14703c = fVar3;
        f fVar4 = new f("ENUM_ENTRY", 3);
        f14704d = fVar4;
        f fVar5 = new f("ANNOTATION_CLASS", 4);
        f14705e = fVar5;
        f fVar6 = new f("OBJECT", 5);
        f14706f = fVar6;
        f14707g = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f14707g.clone();
    }

    public final boolean a() {
        return this == f14706f || this == f14704d;
    }
}
