package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f9419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f9420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f9421c;

    static {
        s sVar = new s("Min", 0);
        f9419a = sVar;
        s sVar2 = new s("Max", 1);
        f9420b = sVar2;
        f9421c = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f9421c.clone();
    }
}
