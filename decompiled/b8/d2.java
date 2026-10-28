package b8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 b8.d2[], still in use, count: 1, list:
  (r13v3 b8.d2[]) from 0x0061: CONSTRUCTOR (r13v3 b8.d2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("默认键码", "keyCode"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("硬件扫描码", "scanCode"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("按键事件类型", "keyEvent"),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("哈弗大狗安波福档位", "PAL_SDK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF53("媒体键码", "KEYCODE_MEDIA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF63("按键按下事件", "ACTION_DOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("按键松开事件", "ACTION_UP");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b9.b f1577d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1579b;

    static {
        f1577d = new b9.b(d2VarArr);
    }

    public d2(String str, String str2) {
        super(str, i);
        this.f1578a = str;
        this.f1579b = str2;
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f1576c.clone();
    }
}
