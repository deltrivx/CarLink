package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f1057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f1058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f1059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f1060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f1061f;

    static {
        o oVar = new o("DESTROYED", 0);
        f1056a = oVar;
        o oVar2 = new o("INITIALIZED", 1);
        f1057b = oVar2;
        o oVar3 = new o("CREATED", 2);
        f1058c = oVar3;
        o oVar4 = new o("STARTED", 3);
        f1059d = oVar4;
        o oVar5 = new o("RESUMED", 4);
        f1060e = oVar5;
        f1061f = new o[]{oVar, oVar2, oVar3, oVar4, oVar5};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1061f.clone();
    }
}
