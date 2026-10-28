package jc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f7106f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7101a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7102b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7103c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7104d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7105e = bVar5;
        f7106f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7106f.clone();
    }
}
