package u7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 u7.g[], still in use, count: 1, list:
  (r6v4 u7.g[]) from 0x003f: CONSTRUCTOR (r6v4 u7.g[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("05:20 • 周五\n2025/05/20", "hh:mm • EEE|yyyy/MM/dd"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("下午 05:20:05", "a hh:mm:ss"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("17:20 • 周五\n2025/05/20", "HH:mm • EEE|yyyy/MM/dd"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("17:20:05 周五", "HH:mm:ss EEE");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13079c = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f13081e = new b9.b(new g[]{new g("05:20 • 周五\n2025/05/20", "hh:mm • EEE|yyyy/MM/dd"), new g("下午 05:20:05", "a hh:mm:ss"), new g("17:20 • 周五\n2025/05/20", "HH:mm • EEE|yyyy/MM/dd"), new g("17:20:05 周五", "HH:mm:ss EEE")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13083b;

    static {
    }

    public g(String str, String str2) {
        super(str, i);
        this.f13082a = str;
        this.f13083b = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13080d.clone();
    }
}
