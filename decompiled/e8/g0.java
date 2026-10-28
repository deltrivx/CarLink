package e8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 e8.g0[], still in use, count: 1, list:
  (r7v3 e8.g0[]) from 0x0037: CONSTRUCTOR (r7v3 e8.g0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class g0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("Unconnected", "CarLife未连接"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("Connecting", "CarLife连接中"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("Connected", "CarLife已连接"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("Disconnected", "CarLife连接断开");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4542c = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f4544e = new b9.b(new g0[]{new g0("Unconnected", "CarLife未连接"), new g0("Connecting", "CarLife连接中"), new g0("Connected", "CarLife已连接"), new g0("Disconnected", "CarLife连接断开")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4546b;

    static {
    }

    public g0(String str, String str2) {
        super(str, i);
        this.f4545a = str2;
        this.f4546b = i;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f4543d.clone();
    }
}
