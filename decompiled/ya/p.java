package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f15251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f15252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f15253c;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("PRETTY", 0);
        p pVar2 = new p("DEBUG", 1);
        f15251a = pVar2;
        p pVar3 = new p("NONE", 2);
        f15252b = pVar3;
        f15253c = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f15253c.clone();
    }
}
