package e8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 e8.k[], still in use, count: 1, list:
  (r4v5 e8.k[]) from 0x0047: CONSTRUCTOR (r4v5 e8.k[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class k {
    /* JADX INFO: Fake field, exist only in values array */
    MODE_DAY("白天模式", 10048, 1),
    /* JADX INFO: Fake field, exist only in values array */
    MODE_NIGHT("夜间模式", 10048, 2),
    /* JADX INFO: Fake field, exist only in values array */
    HEADLIGHT_ON("大灯开启", 10017, 0),
    /* JADX INFO: Fake field, exist only in values array */
    HEADLIGHT_OFF("大灯关闭", 10017, 1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f4567d = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b9.b f4569f = new b9.b(new k[]{new k("白天模式", 10048, 1), new k("夜间模式", 10048, 2), new k("大灯开启", 10017, 0), new k("大灯关闭", 10017, 1)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4572c;

    static {
    }

    public k(String str, int i7, int i10) {
        super(str, i);
        this.f4570a = str;
        this.f4571b = i7;
        this.f4572c = i10;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f4568e.clone();
    }
}
