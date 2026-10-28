package com.google.protobuf;

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
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f2843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r2[] f2844b;

    /* JADX INFO: Fake field, exist only in values array */
    r2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r2 EF2;

    static {
        r2 r2Var = new r2("DOUBLE", 0, s2.f2848d, 1);
        r2 r2Var2 = new r2("FLOAT", 1, s2.f2847c, 5);
        s2 s2Var = s2.f2846b;
        r2 r2Var3 = new r2("INT64", 2, s2Var, 0);
        r2 r2Var4 = new r2("UINT64", 3, s2Var, 0);
        s2 s2Var2 = s2.f2845a;
        r2 r2Var5 = new r2("INT32", 4, s2Var2, 0);
        r2 r2Var6 = new r2("FIXED64", 5, s2Var, 1);
        r2 r2Var7 = new r2("FIXED32", 6, s2Var2, 5);
        r2 r2Var8 = new r2("BOOL", 7, s2.f2849e, 0);
        n2 n2Var = new n2("STRING", 8, s2.f2850f, 2);
        s2 s2Var3 = s2.f2853i;
        o2 o2Var = new o2("GROUP", 9, s2Var3, 3);
        p2 p2Var = new p2("MESSAGE", 10, s2Var3, 2);
        f2843a = p2Var;
        f2844b = new r2[]{r2Var, r2Var2, r2Var3, r2Var4, r2Var5, r2Var6, r2Var7, r2Var8, n2Var, o2Var, p2Var, new q2("BYTES", 11, s2.f2851g, 2), new r2("UINT32", 12, s2Var2, 0), new r2("ENUM", 13, s2.f2852h, 0), new r2("SFIXED32", 14, s2Var2, 5), new r2("SFIXED64", 15, s2Var, 1), new r2("SINT32", 16, s2Var2, 0), new r2("SINT64", 17, s2Var, 0)};
    }

    public r2(String str, int i7, s2 s2Var, int i10) {
        super(str, i7);
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) f2844b.clone();
    }
}
