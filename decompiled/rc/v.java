package rc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 rc.v[], still in use, count: 1, list:
  (r4v3 rc.v[]) from 0x003f: CONSTRUCTOR (r4v3 rc.v[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class v {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b9.b f12375h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f12376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f12377b;

    static {
        f12375h = new b9.b(vVarArr);
    }

    public v(char c10, char c11) {
        super(str, i);
        this.f12376a = c10;
        this.f12377b = c11;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f12374g.clone();
    }
}
