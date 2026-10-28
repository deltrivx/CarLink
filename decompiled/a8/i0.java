package a8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 a8.i0[], still in use, count: 1, list:
  (r9v3 a8.i0[]) from 0x0043: CONSTRUCTOR (r9v3 a8.i0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class i0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("MAIN", "前台启动"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("EMPTY", "静默启动"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("SERVICE", "服务启动"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("HOME", "返回桌面"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("RESTART", "应用重启");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f139c = new h0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f141e = new b9.b(new i0[]{new i0("MAIN", "前台启动"), new i0("EMPTY", "静默启动"), new i0("SERVICE", "服务启动"), new i0("HOME", "返回桌面"), new i0("RESTART", "应用重启")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143b;

    static {
    }

    public i0(String str, String str2) {
        super(str, i);
        this.f142a = str2;
        this.f143b = i;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f140d.clone();
    }
}
