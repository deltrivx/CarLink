package oa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f9627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f9628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f9629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f9630d;

    static {
        s sVar = new s("FLEXIBLE_LOWER", 0);
        f9627a = sVar;
        s sVar2 = new s("FLEXIBLE_UPPER", 1);
        f9628b = sVar2;
        s sVar3 = new s("INFLEXIBLE", 2);
        f9629c = sVar3;
        f9630d = new s[]{sVar, sVar2, sVar3};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f9630d.clone();
    }
}
