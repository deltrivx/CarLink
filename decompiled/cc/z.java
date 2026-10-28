package cc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f2689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f2690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f2691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f2692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f2693e;

    static {
        z zVar = new z("DEFAULT", 0);
        f2689a = zVar;
        z zVar2 = new z("LAZY", 1);
        f2690b = zVar2;
        z zVar3 = new z("ATOMIC", 2);
        f2691c = zVar3;
        z zVar4 = new z("UNDISPATCHED", 3);
        f2692d = zVar4;
        f2693e = new z[]{zVar, zVar2, zVar3, zVar4};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f2693e.clone();
    }
}
