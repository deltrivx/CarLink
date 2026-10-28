package fa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f5506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f5507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f5508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f5509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f5510i;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("FROM_IDE", 0);
        b bVar2 = new b("FROM_BACKEND", 1);
        b bVar3 = new b("FROM_TEST", 2);
        b bVar4 = new b("FROM_BUILTINS", 3);
        f5502a = bVar4;
        b bVar5 = new b("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        b bVar6 = new b("WHEN_CHECK_OVERRIDES", 5);
        b bVar7 = new b("FOR_SCRIPT", 6);
        b bVar8 = new b("FROM_REFLECTION", 7);
        f5503b = bVar8;
        b bVar9 = new b("WHEN_RESOLVE_DECLARATION", 8);
        b bVar10 = new b("WHEN_GET_DECLARATION_SCOPE", 9);
        b bVar11 = new b("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        b bVar12 = new b("FOR_ALREADY_TRACKED", 11);
        f5504c = bVar12;
        b bVar13 = new b("WHEN_GET_ALL_DESCRIPTORS", 12);
        f5505d = bVar13;
        b bVar14 = new b("WHEN_TYPING", 13);
        b bVar15 = new b("WHEN_GET_SUPER_MEMBERS", 14);
        f5506e = bVar15;
        b bVar16 = new b("FOR_NON_TRACKED_SCOPE", 15);
        f5507f = bVar16;
        b bVar17 = new b("FROM_SYNTHETIC_SCOPE", 16);
        b bVar18 = new b("FROM_DESERIALIZATION", 17);
        f5508g = bVar18;
        b bVar19 = new b("FROM_JAVA_LOADER", 18);
        f5509h = bVar19;
        f5510i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, new b("WHEN_GET_LOCAL_VARIABLE", 19), new b("WHEN_FIND_BY_FQNAME", 20), new b("WHEN_GET_COMPANION_OBJECT", 21), new b("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5510i.clone();
    }
}
