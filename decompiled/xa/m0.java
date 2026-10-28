package xa;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f14804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f14805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f14806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f14807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0 f14808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m0[] f14809h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f14810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14811b;

    /* JADX INFO: Fake field, exist only in values array */
    m0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    m0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    m0 EF2;

    static {
        m0 m0Var = new m0("DOUBLE", 0, n0.DOUBLE, 1);
        m0 m0Var2 = new m0("FLOAT", 1, n0.FLOAT, 5);
        n0 n0Var = n0.LONG;
        m0 m0Var3 = new m0("INT64", 2, n0Var, 0);
        m0 m0Var4 = new m0("UINT64", 3, n0Var, 0);
        n0 n0Var2 = n0.INT;
        m0 m0Var5 = new m0("INT32", 4, n0Var2, 0);
        f14804c = m0Var5;
        m0 m0Var6 = new m0("FIXED64", 5, n0Var, 1);
        m0 m0Var7 = new m0("FIXED32", 6, n0Var2, 5);
        m0 m0Var8 = new m0("BOOL", 7, n0.BOOLEAN, 0);
        f14805d = m0Var8;
        i0 i0Var = new i0("STRING", 8, n0.STRING, 2);
        n0 n0Var3 = n0.MESSAGE;
        j0 j0Var = new j0("GROUP", 9, n0Var3, 3);
        f14806e = j0Var;
        k0 k0Var = new k0("MESSAGE", 10, n0Var3, 2);
        f14807f = k0Var;
        l0 l0Var = new l0("BYTES", 11, n0.BYTE_STRING, 2);
        m0 m0Var9 = new m0("UINT32", 12, n0Var2, 0);
        m0 m0Var10 = new m0("ENUM", 13, n0.ENUM, 0);
        f14808g = m0Var10;
        f14809h = new m0[]{m0Var, m0Var2, m0Var3, m0Var4, m0Var5, m0Var6, m0Var7, m0Var8, i0Var, j0Var, k0Var, l0Var, m0Var9, m0Var10, new m0("SFIXED32", 14, n0Var2, 5), new m0("SFIXED64", 15, n0Var, 1), new m0("SINT32", 16, n0Var2, 0), new m0("SINT64", 17, n0Var, 0)};
    }

    public m0(String str, int i7, n0 n0Var, int i10) {
        super(str, i7);
        this.f14810a = n0Var;
        this.f14811b = i10;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f14809h.clone();
    }

    public boolean a() {
        return !(this instanceof i0);
    }
}
