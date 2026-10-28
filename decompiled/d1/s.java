package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s[] f3745b;

    /* JADX INFO: Fake field, exist only in values array */
    s EF0;

    static {
        s sVar = new s("Filled", 0);
        s sVar2 = new s("Outlined", 1);
        f3744a = sVar2;
        f3745b = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f3745b.clone();
    }
}
