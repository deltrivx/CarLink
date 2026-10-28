package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f1375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f1376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f1377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f1378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f1379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j[] f1380h;

    static {
        j jVar = new j("Paragraph", 0);
        f1373a = jVar;
        j jVar2 = new j("Span", 1);
        f1374b = jVar2;
        j jVar3 = new j("VerbatimTts", 2);
        f1375c = jVar3;
        j jVar4 = new j("Url", 3);
        f1376d = jVar4;
        j jVar5 = new j("Link", 4);
        f1377e = jVar5;
        j jVar6 = new j("Clickable", 5);
        f1378f = jVar6;
        j jVar7 = new j("String", 6);
        f1379g = jVar7;
        f1380h = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f1380h.clone();
    }
}
