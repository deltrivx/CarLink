package e8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 e8.x[], still in use, count: 1, list:
  (r5v3 e8.x[]) from 0x0031: CONSTRUCTOR (r5v3 e8.x[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class x {
    f4649d("CREATE", "应用启动"),
    f4650e("START", "应用前台"),
    f4651f("STOP", "应用后台");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4648c = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b9.b f4653h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4655b;

    static {
        f4653h = new b9.b(new x[]{r0, r1, r3});
    }

    public x(String str, String str2) {
        super(str, i);
        this.f4654a = str2;
        this.f4655b = i;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f4652g.clone();
    }
}
