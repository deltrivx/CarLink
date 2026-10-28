package oa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f9588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f9589c;

    static {
        f fVar = new f("READ_ONLY", 0);
        f9587a = fVar;
        f fVar2 = new f("MUTABLE", 1);
        f9588b = fVar2;
        f9589c = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f9589c.clone();
    }
}
