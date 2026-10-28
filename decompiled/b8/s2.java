package b8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 b8.s2[], still in use, count: 1, list:
  (r3v3 b8.s2[]) from 0x001f: CONSTRUCTOR (r3v3 b8.s2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("MODE_DAY", "白天模式"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("MODE_NIGHT", "夜间模式");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2 f1649c = new r2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f1651e = new b9.b(new s2[]{new s2("MODE_DAY", "白天模式"), new s2("MODE_NIGHT", "夜间模式")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1653b;

    static {
    }

    public s2(String str, String str2) {
        super(str, i);
        this.f1652a = str2;
        this.f1653b = i;
    }

    public static s2 valueOf(String str) {
        return (s2) Enum.valueOf(s2.class, str);
    }

    public static s2[] values() {
        return (s2[]) f1650d.clone();
    }
}
