package b8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 b8.a[], still in use, count: 1, list:
  (r5v3 b8.a[]) from 0x002b: CONSTRUCTOR (r5v3 b8.a[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("SINGLE", "单击"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("DOUBLE", "双击"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("MULTIPLE", "长按");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kb.d f1559c = new kb.d(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f1561e = new b9.b(new a[]{new a("SINGLE", "单击"), new a("DOUBLE", "双击"), new a("MULTIPLE", "长按")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1563b;

    static {
    }

    public a(String str, String str2) {
        super(str, i);
        this.f1562a = str2;
        this.f1563b = i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1560d.clone();
    }
}
