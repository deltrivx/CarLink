package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f2718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f2719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0[] f2720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f2721e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2722a;

    /* JADX INFO: Fake field, exist only in values array */
    b0 EF0;

    static {
        x0 x0Var = x0.f2882e;
        b0 b0Var = new b0("DOUBLE", 0, 0, 1, x0Var);
        x0 x0Var2 = x0.f2881d;
        b0 b0Var2 = new b0("FLOAT", 1, 1, 1, x0Var2);
        x0 x0Var3 = x0.f2880c;
        b0 b0Var3 = new b0("INT64", 2, 2, 1, x0Var3);
        b0 b0Var4 = new b0("UINT64", 3, 3, 1, x0Var3);
        x0 x0Var4 = x0.f2879b;
        b0 b0Var5 = new b0("INT32", 4, 4, 1, x0Var4);
        b0 b0Var6 = new b0("FIXED64", 5, 5, 1, x0Var3);
        b0 b0Var7 = new b0("FIXED32", 6, 6, 1, x0Var4);
        x0 x0Var5 = x0.f2883f;
        b0 b0Var8 = new b0("BOOL", 7, 7, 1, x0Var5);
        x0 x0Var6 = x0.f2884g;
        b0 b0Var9 = new b0("STRING", 8, 8, 1, x0Var6);
        x0 x0Var7 = x0.f2887j;
        b0 b0Var10 = new b0("MESSAGE", 9, 9, 1, x0Var7);
        x0 x0Var8 = x0.f2885h;
        b0 b0Var11 = new b0("BYTES", 10, 10, 1, x0Var8);
        b0 b0Var12 = new b0("UINT32", 11, 11, 1, x0Var4);
        x0 x0Var9 = x0.f2886i;
        b0 b0Var13 = new b0("ENUM", 12, 12, 1, x0Var9);
        b0 b0Var14 = new b0("SFIXED32", 13, 13, 1, x0Var4);
        b0 b0Var15 = new b0("SFIXED64", 14, 14, 1, x0Var3);
        b0 b0Var16 = new b0("SINT32", 15, 15, 1, x0Var4);
        b0 b0Var17 = new b0("SINT64", 16, 16, 1, x0Var3);
        b0 b0Var18 = new b0("GROUP", 17, 17, 1, x0Var7);
        b0 b0Var19 = new b0("DOUBLE_LIST", 18, 18, 2, x0Var);
        b0 b0Var20 = new b0("FLOAT_LIST", 19, 19, 2, x0Var2);
        b0 b0Var21 = new b0("INT64_LIST", 20, 20, 2, x0Var3);
        b0 b0Var22 = new b0("UINT64_LIST", 21, 21, 2, x0Var3);
        b0 b0Var23 = new b0("INT32_LIST", 22, 22, 2, x0Var4);
        b0 b0Var24 = new b0("FIXED64_LIST", 23, 23, 2, x0Var3);
        b0 b0Var25 = new b0("FIXED32_LIST", 24, 24, 2, x0Var4);
        b0 b0Var26 = new b0("BOOL_LIST", 25, 25, 2, x0Var5);
        b0 b0Var27 = new b0("STRING_LIST", 26, 26, 2, x0Var6);
        b0 b0Var28 = new b0("MESSAGE_LIST", 27, 27, 2, x0Var7);
        b0 b0Var29 = new b0("BYTES_LIST", 28, 28, 2, x0Var8);
        b0 b0Var30 = new b0("UINT32_LIST", 29, 29, 2, x0Var4);
        b0 b0Var31 = new b0("ENUM_LIST", 30, 30, 2, x0Var9);
        b0 b0Var32 = new b0("SFIXED32_LIST", 31, 31, 2, x0Var4);
        b0 b0Var33 = new b0("SFIXED64_LIST", 32, 32, 2, x0Var3);
        b0 b0Var34 = new b0("SINT32_LIST", 33, 33, 2, x0Var4);
        b0 b0Var35 = new b0("SINT64_LIST", 34, 34, 2, x0Var3);
        b0 b0Var36 = new b0("DOUBLE_LIST_PACKED", 35, 35, 3, x0Var);
        f2718b = b0Var36;
        b0 b0Var37 = new b0("FLOAT_LIST_PACKED", 36, 36, 3, x0Var2);
        b0 b0Var38 = new b0("INT64_LIST_PACKED", 37, 37, 3, x0Var3);
        b0 b0Var39 = new b0("UINT64_LIST_PACKED", 38, 38, 3, x0Var3);
        b0 b0Var40 = new b0("INT32_LIST_PACKED", 39, 39, 3, x0Var4);
        b0 b0Var41 = new b0("FIXED64_LIST_PACKED", 40, 40, 3, x0Var3);
        b0 b0Var42 = new b0("FIXED32_LIST_PACKED", 41, 41, 3, x0Var4);
        b0 b0Var43 = new b0("BOOL_LIST_PACKED", 42, 42, 3, x0Var5);
        b0 b0Var44 = new b0("UINT32_LIST_PACKED", 43, 43, 3, x0Var4);
        b0 b0Var45 = new b0("ENUM_LIST_PACKED", 44, 44, 3, x0Var9);
        b0 b0Var46 = new b0("SFIXED32_LIST_PACKED", 45, 45, 3, x0Var4);
        b0 b0Var47 = new b0("SFIXED64_LIST_PACKED", 46, 46, 3, x0Var3);
        b0 b0Var48 = new b0("SINT32_LIST_PACKED", 47, 47, 3, x0Var4);
        b0 b0Var49 = new b0("SINT64_LIST_PACKED", 48, 48, 3, x0Var3);
        f2719c = b0Var49;
        f2721e = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10, b0Var11, b0Var12, b0Var13, b0Var14, b0Var15, b0Var16, b0Var17, b0Var18, b0Var19, b0Var20, b0Var21, b0Var22, b0Var23, b0Var24, b0Var25, b0Var26, b0Var27, b0Var28, b0Var29, b0Var30, b0Var31, b0Var32, b0Var33, b0Var34, b0Var35, b0Var36, b0Var37, b0Var38, b0Var39, b0Var40, b0Var41, b0Var42, b0Var43, b0Var44, b0Var45, b0Var46, b0Var47, b0Var48, b0Var49, new b0("GROUP_LIST", 49, 49, 2, x0Var7), new b0("MAP", 50, 50, 4, x0.f2878a)};
        b0[] b0VarArrValues = values();
        f2720d = new b0[b0VarArrValues.length];
        for (b0 b0Var50 : b0VarArrValues) {
            f2720d[b0Var50.f2722a] = b0Var50;
        }
    }

    public b0(String str, int i7, int i10, int i11, x0 x0Var) {
        super(str, i7);
        this.f2722a = i10;
        int iB = e1.d.b(i11);
        if (iB == 1 || iB == 3) {
            x0Var.getClass();
        }
        if (i11 == 1) {
            x0Var.ordinal();
        }
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f2721e.clone();
    }
}
