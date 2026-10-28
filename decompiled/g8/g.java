package g8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 g8.g[], still in use, count: 1, list:
  (r6v2 g8.g[]) from 0x0025: CONSTRUCTOR (r6v2 g8.g[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    EF5("SurfaceView", "SurfaceView"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("TextureView", "TextureView"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("GLSurfaceView", "GLSurfaceView");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b9.b f6019d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6021b;

    static {
        f6019d = new b9.b(gVarArr);
    }

    public g(String str, String str2) {
        super(str, i);
        this.f6020a = str2;
        this.f6021b = i;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f6018c.clone();
    }
}
