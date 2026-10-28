package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f15254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f15255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f15256c;

    static {
        r rVar = new r();
        f15254a = rVar;
        q qVar = new q();
        f15255b = qVar;
        f15256c = new s[]{rVar, qVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f15256c.clone();
    }

    public abstract String a(String str);
}
