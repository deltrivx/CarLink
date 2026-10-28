package g8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 g8.c[], still in use, count: 1, list:
  (r9v6 g8.c[]) from 0x009b: CONSTRUCTOR (r9v6 g8.c[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class c {
    /* JADX INFO: Fake field, exist only in values array */
    TopStart("顶部靠左", 1, r1.c.f11092a),
    /* JADX INFO: Fake field, exist only in values array */
    TopCenter("顶部居中", 2, r1.c.f11093b),
    /* JADX INFO: Fake field, exist only in values array */
    TopEnd("顶部靠右", 3, r1.c.f11094c),
    /* JADX INFO: Fake field, exist only in values array */
    CenterStart("居中靠左", 4, r1.c.f11095d),
    /* JADX INFO: Fake field, exist only in values array */
    Center("居中", 0, r1.c.f11096e),
    /* JADX INFO: Fake field, exist only in values array */
    CenterEnd("居中靠右", 5, r1.c.f11097f),
    /* JADX INFO: Fake field, exist only in values array */
    BottomStart("底部靠左", 6, r1.c.f11098g),
    /* JADX INFO: Fake field, exist only in values array */
    BottomCenter("底部居中", 7, r1.c.f11099h),
    /* JADX INFO: Fake field, exist only in values array */
    BottomEnd("底部靠右", 8, r1.c.f11100i);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6005d = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b9.b f6007f = new b9.b(new c[]{new c("顶部靠左", 1, r1.c.f11092a), new c("顶部居中", 2, r1.c.f11093b), new c("顶部靠右", 3, r1.c.f11094c), new c("居中靠左", 4, r1.c.f11095d), new c("居中", 0, r1.c.f11096e), new c("居中靠右", 5, r1.c.f11097f), new c("底部靠左", 6, r1.c.f11098g), new c("底部居中", 7, r1.c.f11099h), new c("底部靠右", 8, r1.c.f11100i)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.h f6010c;

    static {
    }

    public c(String str, int i7, r1.h hVar) {
        super(str, i);
        this.f6008a = str;
        this.f6009b = i7;
        this.f6010c = hVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f6006e.clone();
    }
}
