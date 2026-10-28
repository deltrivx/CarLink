package o7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 o7.w[], still in use, count: 1, list:
  (r5v3 o7.w[]) from 0x002e: CONSTRUCTOR (r5v3 o7.w[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class w {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("AOA", "有线"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("HOTSPOT", "热点"),
    /* JADX INFO: Fake field, exist only in values array */
    EF30("WIFI_DIRECT", "直连");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f9541c = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b9.b f9543e = new b9.b(new w[]{new w("AOA", "有线"), new w("HOTSPOT", "热点"), new w("WIFI_DIRECT", "直连")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9545b;

    static {
    }

    public w(String str, String str2) {
        super(str, i);
        this.f9544a = str2;
        this.f9545b = i;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f9542d.clone();
    }
}
