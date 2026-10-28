package com.google.protobuf;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements x1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f2813o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f2814p = j2.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f2819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f2822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2824j;
    public final q1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c1 f2825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f2826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f2827n;

    public o1(int[] iArr, Object[] objArr, int i7, int i10, l1 l1Var, boolean z10, int[] iArr2, int i11, int i12, q1 q1Var, c1 c1Var, b2 b2Var, z zVar, h1 h1Var) {
        this.f2815a = iArr;
        this.f2816b = objArr;
        this.f2817c = i7;
        this.f2818d = i10;
        this.f2820f = l1Var instanceof j0;
        this.f2821g = z10;
        this.f2822h = iArr2;
        this.f2823i = i11;
        this.f2824j = i12;
        this.k = q1Var;
        this.f2825l = c1Var;
        this.f2826m = b2Var;
        this.f2819e = l1Var;
        this.f2827n = h1Var;
    }

    public static o1 C(w1 w1Var, q1 q1Var, c1 c1Var, b2 b2Var, z zVar, h1 h1Var) {
        if (w1Var instanceof w1) {
            return D(w1Var, q1Var, c1Var, b2Var, zVar, h1Var);
        }
        w1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0273  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x0296  */
    /* JADX WARN: Code duplicated, block: B:179:0x0380  */
    public static o1 D(w1 w1Var, q1 q1Var, c1 c1Var, b2 b2Var, z zVar, h1 h1Var) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        int i27;
        Field fieldP;
        char cCharAt9;
        int i28;
        int i29;
        Object obj;
        Field fieldP2;
        int i30;
        Object obj2;
        Field fieldP3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        boolean z10 = (w1Var.f2876d & 1) != 1;
        String str = w1Var.f2874b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i7 = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i7;
            }
        } else {
            i7 = 1;
        }
        int i37 = i7 + 1;
        int iCharAt4 = str.charAt(i7);
        if (iCharAt4 >= 55296) {
            int i38 = iCharAt4 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = str.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt4 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt4 == 0) {
            iArr = f2813o;
            i13 = 0;
            i11 = 0;
            i12 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i10 = 0;
            iCharAt3 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt5 = str.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i21 = i40 + 1;
                    cCharAt8 = str.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i21;
                }
                iCharAt5 = i41 | (cCharAt8 << i42);
                i40 = i21;
            }
            int i43 = i40 + 1;
            int iCharAt6 = str.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i20 = i43 + 1;
                    cCharAt7 = str.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i20;
                }
                iCharAt6 = i44 | (cCharAt7 << i45);
                i43 = i20;
            }
            int i46 = i43 + 1;
            int iCharAt7 = str.charAt(i43);
            if (iCharAt7 >= 55296) {
                int i47 = iCharAt7 & 8191;
                int i48 = 13;
                while (true) {
                    i19 = i46 + 1;
                    cCharAt6 = str.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i19;
                }
                iCharAt7 = i47 | (cCharAt6 << i48);
                i46 = i19;
            }
            int i49 = i46 + 1;
            int iCharAt8 = str.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i18 = i49 + 1;
                    cCharAt5 = str.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i18;
                }
                iCharAt8 = i50 | (cCharAt5 << i51);
                i49 = i18;
            }
            int i52 = i49 + 1;
            iCharAt = str.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i17 = i52 + 1;
                    cCharAt4 = str.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i17;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i17;
            }
            int i55 = i52 + 1;
            iCharAt2 = str.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i16 = i55 + 1;
                    cCharAt3 = str.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i16;
                }
                iCharAt2 = i56 | (cCharAt3 << i57);
                i55 = i16;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i15 = i58 + 1;
                    cCharAt2 = str.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i15;
                }
                iCharAt9 = i59 | (cCharAt2 << i60);
                i58 = i15;
            }
            int i61 = i58 + 1;
            iCharAt3 = str.charAt(i58);
            if (iCharAt3 >= 55296) {
                int i62 = iCharAt3 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i14 = i63 + 1;
                    cCharAt = str.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i63 = i14;
                }
                iCharAt3 = i62 | (cCharAt << i64);
                i61 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i10 = (iCharAt5 * 2) + iCharAt6;
            i11 = iCharAt7;
            i12 = iCharAt8;
            iArr = iArr2;
            i13 = iCharAt5;
            i37 = i61;
        }
        Unsafe unsafe = f2814p;
        Object[] objArr = w1Var.f2875c;
        Class<?> cls = w1Var.f2873a.getClass();
        int i65 = i13;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i66 = iCharAt2 + iCharAt3;
        int i67 = i66;
        int i68 = iCharAt3;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int iCharAt10 = str.charAt(i37);
            int[] iArr4 = iArr3;
            if (iCharAt10 >= 55296) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    cCharAt12 = str.charAt(i73);
                    i22 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                    length = i22;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i23 = i34;
            } else {
                i22 = length;
                i23 = i71;
            }
            int i75 = i23 + 1;
            int iCharAt11 = str.charAt(i23);
            if (iCharAt11 >= 55296) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i32 = i77 + 1;
                    cCharAt11 = str.charAt(i77);
                    i33 = i76;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 = i33 | ((cCharAt11 & 8191) << i78);
                    i78 += 13;
                    i77 = i32;
                }
                iCharAt11 = i33 | (cCharAt11 << i78);
                i24 = i32;
            } else {
                i24 = i75;
            }
            int i79 = iCharAt10;
            int i80 = iCharAt11 & 255;
            int i81 = i11;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i82 = i12;
            if (i80 >= 51) {
                int i83 = i24 + 1;
                int iCharAt12 = str.charAt(i24);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        cCharAt10 = str.charAt(i83);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i31;
                        c10 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i31;
                }
                int i86 = i80 - 51;
                int i87 = iCharAt12;
                if (i86 == 9 || i86 == 17) {
                    i28 = i10 + 1;
                    objArr2[((i70 / 3) * 2) + 1] = objArr[i10];
                } else {
                    if (i86 == 12 && !z10) {
                        i28 = i10 + 1;
                        objArr2[((i70 / 3) * 2) + 1] = objArr[i10];
                    }
                    i29 = i87 * 2;
                    obj = objArr[i29];
                    if (obj instanceof Field) {
                        fieldP2 = (Field) obj;
                    } else {
                        fieldP2 = P(cls, (String) obj);
                        objArr[i29] = fieldP2;
                    }
                    int i88 = i83;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                    i30 = i29 + 1;
                    obj2 = objArr[i30];
                    if (obj2 instanceof Field) {
                        fieldP3 = (Field) obj2;
                    } else {
                        fieldP3 = P(cls, (String) obj2);
                        objArr[i30] = fieldP3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                    i27 = iObjectFieldOffset3;
                    i26 = 0;
                    i25 = i88;
                }
                i10 = i28;
                i29 = i87 * 2;
                obj = objArr[i29];
                if (obj instanceof Field) {
                    fieldP2 = (Field) obj;
                } else {
                    fieldP2 = P(cls, (String) obj);
                    objArr[i29] = fieldP2;
                }
                int i89 = i83;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldP2);
                i30 = i29 + 1;
                obj2 = objArr[i30];
                if (obj2 instanceof Field) {
                    fieldP3 = (Field) obj2;
                } else {
                    fieldP3 = P(cls, (String) obj2);
                    objArr[i30] = fieldP3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                i27 = iObjectFieldOffset4;
                i26 = 0;
                i25 = i89;
            } else {
                int i90 = i10 + 1;
                Field fieldP4 = P(cls, (String) objArr[i10]);
                if (i80 == 9 || i80 == 17) {
                    objArr2[((i70 / 3) * 2) + 1] = fieldP4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i10 += 2;
                        objArr2[((i70 / 3) * 2) + 1] = objArr[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (!z10) {
                            i10 += 2;
                            objArr2[((i70 / 3) * 2) + 1] = objArr[i90];
                        }
                    } else if (i80 == 50) {
                        int i91 = i68 + 1;
                        iArr[i68] = i70;
                        int i92 = (i70 / 3) * 2;
                        int i93 = i10 + 2;
                        objArr2[i92] = objArr[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i92 + 1] = objArr[i93];
                            i10 += 3;
                        } else {
                            i10 = i93;
                        }
                        i68 = i91;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                    if ((iCharAt11 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096 || i80 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i25 = i24;
                        i26 = 0;
                    } else {
                        int i94 = i24 + 1;
                        int iCharAt13 = str.charAt(i24);
                        if (iCharAt13 >= 55296) {
                            int i95 = iCharAt13 & 8191;
                            int i96 = 13;
                            while (true) {
                                i25 = i94 + 1;
                                cCharAt9 = str.charAt(i94);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i95 |= (cCharAt9 & 8191) << i96;
                                i96 += 13;
                                i94 = i25;
                            }
                            iCharAt13 = i95 | (cCharAt9 << i96);
                        } else {
                            i25 = i94;
                        }
                        int i97 = (iCharAt13 / 32) + (i65 * 2);
                        Object obj3 = objArr[i97];
                        if (obj3 instanceof Field) {
                            fieldP = (Field) obj3;
                        } else {
                            fieldP = P(cls, (String) obj3);
                            objArr[i97] = fieldP;
                        }
                        i26 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP);
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i67] = iObjectFieldOffset;
                        i67++;
                    }
                    i27 = iObjectFieldOffset;
                }
                i10 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                if ((iCharAt11 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i24;
                    i26 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i24;
                    i26 = 0;
                }
                if (i80 >= 18) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
                i27 = iObjectFieldOffset;
            }
            int i98 = i70 + 1;
            iArr4[i70] = i79;
            int i99 = i70 + 2;
            String str2 = str;
            iArr4[i98] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i80 << 20) | i27;
            i70 += 3;
            iArr4[i99] = (i26 << 20) | iObjectFieldOffset2;
            iArr3 = iArr4;
            i11 = i81;
            length = i22;
            str = str2;
            i37 = i25;
            i12 = i82;
        }
        return new o1(iArr3, objArr2, i11, i12, w1Var.f2873a, z10, iArr, iCharAt3, i66, q1Var, c1Var, b2Var, zVar, h1Var);
    }

    public static long E(int i7) {
        return i7 & 1048575;
    }

    public static int F(long j5, Object obj) {
        return ((Integer) j2.f2774c.k(j5, obj)).intValue();
    }

    public static long G(long j5, Object obj) {
        return ((Long) j2.f2774c.k(j5, obj)).longValue();
    }

    public static Field P(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int V(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void Y(int i7, Object obj, f1 f1Var) {
        if (!(obj instanceof String)) {
            f1Var.a(i7, (l) obj);
        } else {
            ((u) f1Var.f2744a).r0(i7, (String) obj);
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static a2 q(Object obj) {
        j0 j0Var = (j0) obj;
        a2 a2Var = j0Var.unknownFields;
        if (a2Var != a2.f2712f) {
            return a2Var;
        }
        a2 a2Var2 = new a2();
        j0Var.unknownFields = a2Var2;
        return a2Var2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof j0) {
            return ((j0) obj).isMutable();
        }
        return true;
    }

    public static List w(j0 j0Var, long j5) {
        return (List) j2.f2774c.k(j5, j0Var);
    }

    public final Object A(int i7, Object obj) {
        x1 x1VarP = p(i7);
        long jW = W(i7) & 1048575;
        if (!t(i7, obj)) {
            return x1VarP.j();
        }
        Object object = f2814p.getObject(obj, jW);
        if (u(object)) {
            return object;
        }
        Object objJ = x1VarP.j();
        if (object != null) {
            x1VarP.b(objJ, object);
        }
        return objJ;
    }

    public final Object B(int i7, int i10, Object obj) {
        x1 x1VarP = p(i10);
        if (!v(i7, i10, obj)) {
            return x1VarP.j();
        }
        Object object = f2814p.getObject(obj, W(i10) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objJ = x1VarP.j();
        if (object != null) {
            x1VarP.b(objJ, object);
        }
        return objJ;
    }

    public final void H(int i7, long j5, Object obj) {
        Unsafe unsafe = f2814p;
        Object objO = o(i7);
        Object object = unsafe.getObject(obj, j5);
        this.f2827n.getClass();
        if (!((g1) object).f2751a) {
            g1 g1VarC = g1.f2750b.c();
            h1.b(g1VarC, object);
            unsafe.putObject(obj, j5, g1VarC);
        }
        a2.f.N(objO);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j5, int i16, f fVar) throws w0 {
        Unsafe unsafe = f2814p;
        long j10 = this.f2815a[i16 + 2] & 1048575;
        switch (i15) {
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                if (i13 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j5, Double.valueOf(Double.longBitsToDouble(g5.a.q(bArr, i7))));
                int i17 = i7 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                if (i13 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j5, Float.valueOf(Float.intBitsToFloat(g5.a.p(bArr, i7))));
                int i18 = i7 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
            case 54:
                if (i13 != 0) {
                    return i7;
                }
                int iA = g5.a.A(bArr, i7, fVar);
                unsafe.putObject(obj, j5, Long.valueOf(fVar.f2741b));
                unsafe.putInt(obj, j10, i12);
                return iA;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i7;
                }
                int iY = g5.a.y(bArr, i7, fVar);
                unsafe.putObject(obj, j5, Integer.valueOf(fVar.f2740a));
                unsafe.putInt(obj, j10, i12);
                return iY;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j5, Long.valueOf(g5.a.q(bArr, i7)));
                int i19 = i7 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                if (i13 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j5, Integer.valueOf(g5.a.p(bArr, i7)));
                int i20 = i7 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                if (i13 != 0) {
                    return i7;
                }
                int iA2 = g5.a.A(bArr, i7, fVar);
                unsafe.putObject(obj, j5, Boolean.valueOf(fVar.f2741b != 0));
                unsafe.putInt(obj, j10, i12);
                return iA2;
            case 59:
                if (i13 != 2) {
                    return i7;
                }
                int iY2 = g5.a.y(bArr, i7, fVar);
                int i21 = fVar.f2740a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j5, "");
                } else {
                    if ((i14 & 536870912) != 0) {
                        if (!m2.f2795a.K(bArr, iY2, iY2 + i21)) {
                            throw w0.b();
                        }
                    }
                    unsafe.putObject(obj, j5, new String(bArr, iY2, i21, u0.f2861a));
                    iY2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iY2;
            case 60:
                if (i13 != 2) {
                    return i7;
                }
                Object objB = B(i12, i16, obj);
                int iS = g5.a.S(objB, p(i16), bArr, i7, i10, fVar);
                U(i12, i16, obj, objB);
                return iS;
            case 61:
                if (i13 != 2) {
                    return i7;
                }
                int iO = g5.a.o(bArr, i7, fVar);
                unsafe.putObject(obj, j5, fVar.f2742c);
                unsafe.putInt(obj, j10, i12);
                return iO;
            case 63:
                if (i13 != 0) {
                    return i7;
                }
                int iY3 = g5.a.y(bArr, i7, fVar);
                int i22 = fVar.f2740a;
                p0 p0VarN = n(i16);
                if (p0VarN != null && !p0VarN.isInRange(i22)) {
                    q(obj).f(i11, Long.valueOf(i22));
                    return iY3;
                }
                unsafe.putObject(obj, j5, Integer.valueOf(i22));
                unsafe.putInt(obj, j10, i12);
                return iY3;
            case 66:
                if (i13 != 0) {
                    return i7;
                }
                int iY4 = g5.a.y(bArr, i7, fVar);
                unsafe.putObject(obj, j5, Integer.valueOf(p.b(fVar.f2740a)));
                unsafe.putInt(obj, j10, i12);
                return iY4;
            case 67:
                if (i13 != 0) {
                    return i7;
                }
                int iA3 = g5.a.A(bArr, i7, fVar);
                unsafe.putObject(obj, j5, Long.valueOf(p.c(fVar.f2741b)));
                unsafe.putInt(obj, j10, i12);
                return iA3;
            case 68:
                if (i13 == 3) {
                    Object objB2 = B(i12, i16, obj);
                    int iR = g5.a.R(objB2, p(i16), bArr, i7, i10, (i11 & (-8)) | 4, fVar);
                    U(i12, i16, obj, objB2);
                    return iR;
                }
                break;
        }
        return i7;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int J(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.protobuf.f r35) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.J(java.lang.Object, byte[], int, int, int, com.google.protobuf.f):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x009c. Please report as an issue. */
    public final void K(Object obj, byte[] bArr, int i7, int i10, f fVar) throws w0 {
        Unsafe unsafe;
        Object obj2;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr2;
        int i14;
        byte[] bArr3;
        int i15;
        Object obj4;
        int i16;
        int i17;
        int i18;
        Object obj5;
        int I;
        o1 o1Var = this;
        Object obj6 = obj;
        bArr = bArr;
        i10 = i10;
        fVar = fVar;
        l(obj6);
        Unsafe unsafe4 = f2814p;
        int iO = i7;
        int i19 = -1;
        int iS = 0;
        int i20 = 1048575;
        int i21 = 0;
        while (iO < i10) {
            int iX = iO + 1;
            int i22 = bArr[iO];
            if (i22 < 0) {
                iX = g5.a.x(i22, bArr, iX, fVar);
                i22 = fVar.f2740a;
            }
            i19 = i22 >>> 3;
            int i23 = i22 & 7;
            int i24 = o1Var.f2818d;
            int i25 = o1Var.f2817c;
            iS = i19 > i19 ? (i19 < i25 || i19 > i24) ? -1 : o1Var.S(i19, iS / 3) : (i19 < i25 || i19 > i24) ? -1 : o1Var.S(i19, 0);
            if (iS == -1) {
                unsafe = unsafe4;
                obj2 = obj6;
                i11 = i22;
                i12 = iX;
                i13 = 0;
            } else {
                int[] iArr = o1Var.f2815a;
                int i26 = iArr[iS + 1];
                int iV = V(i26);
                int i27 = i22;
                long j5 = i26 & 1048575;
                if (iV <= 17) {
                    int i28 = iArr[iS + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 != i20) {
                        int i31 = 1048575;
                        if (i20 != 1048575) {
                            unsafe4.putInt(obj6, i20, i21);
                            i31 = 1048575;
                        }
                        if (i30 != i31) {
                            i21 = unsafe4.getInt(obj6, i30);
                        }
                        i20 = i30;
                    }
                    switch (iV) {
                        case 0:
                            unsafe3 = unsafe4;
                            bArr2 = bArr;
                            i14 = iX;
                            if (i23 != 1) {
                                obj3 = obj6;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                j2.f2774c.o(obj6, j5, Double.longBitsToDouble(g5.a.q(bArr2, i14)));
                                iO = i14 + 8;
                                i21 |= i29;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 1:
                            unsafe3 = unsafe4;
                            bArr2 = bArr;
                            i14 = iX;
                            if (i23 != 5) {
                                obj3 = obj6;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                j2.f2774c.p(obj6, j5, Float.intBitsToFloat(g5.a.p(bArr2, i14)));
                                iO = i14 + 4;
                                i21 |= i29;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 2:
                        case 3:
                            fVar = fVar;
                            bArr2 = bArr;
                            i14 = iX;
                            if (i23 != 0) {
                                unsafe3 = unsafe4;
                                obj3 = obj6;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                int iA = g5.a.A(bArr2, i14, fVar);
                                unsafe4.putLong(obj6, j5, fVar.f2741b);
                                i21 |= i29;
                                iO = iA;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 4:
                        case 11:
                            fVar = fVar;
                            bArr3 = bArr;
                            i14 = iX;
                            if (i23 != 0) {
                                unsafe3 = unsafe4;
                                obj3 = obj6;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                int iY = g5.a.y(bArr3, i14, fVar);
                                unsafe4.putInt(obj6, j5, fVar.f2740a);
                                i21 |= i29;
                                iO = iY;
                                bArr = bArr3;
                                fVar = fVar;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe3 = unsafe4;
                            int i32 = iX;
                            fVar = fVar;
                            bArr3 = bArr;
                            Object obj7 = obj6;
                            if (i23 != 1) {
                                obj6 = obj7;
                                i14 = i32;
                                obj3 = obj6;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                long jQ = g5.a.q(bArr3, i32);
                                obj6 = obj7;
                                unsafe4 = unsafe3;
                                unsafe4.putLong(obj6, j5, jQ);
                                iO = i32 + 8;
                                i21 |= i29;
                                bArr = bArr3;
                                fVar = fVar;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe3 = unsafe4;
                            i15 = iX;
                            fVar = fVar;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i23 != 5) {
                                Object obj8 = obj4;
                                i14 = i15;
                                obj3 = obj8;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                unsafe3.putInt(obj4, j5, g5.a.p(bArr2, i15));
                                iO = i15 + 4;
                                i21 |= i29;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 7:
                            unsafe3 = unsafe4;
                            i15 = iX;
                            fVar = fVar;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i23 != 0) {
                                Object obj9 = obj4;
                                i14 = i15;
                                obj3 = obj9;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                iO = g5.a.A(bArr2, i15, fVar);
                                j2.f2774c.m(obj4, j5, fVar.f2741b != 0);
                                i21 |= i29;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 8:
                            unsafe3 = unsafe4;
                            i15 = iX;
                            fVar = fVar;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i23 != 2) {
                                Object obj10 = obj4;
                                i14 = i15;
                                obj3 = obj10;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                iO = (i26 & 536870912) == 0 ? g5.a.u(bArr2, i15, fVar) : g5.a.v(bArr2, i15, fVar);
                                unsafe3.putObject(obj4, j5, fVar.f2742c);
                                i21 |= i29;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 9:
                            Object obj11 = obj6;
                            Unsafe unsafe5 = unsafe4;
                            obj3 = obj11;
                            if (i23 != 2) {
                                unsafe3 = unsafe5;
                                i14 = iX;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                Object objA = o1Var.A(iS, obj3);
                                byte[] bArr4 = bArr;
                                obj4 = obj3;
                                int i33 = i10;
                                unsafe3 = unsafe5;
                                int i34 = iX;
                                f fVar2 = fVar;
                                int iS2 = g5.a.S(objA, o1Var.p(iS), bArr4, i34, i33, fVar2);
                                bArr2 = bArr4;
                                fVar = fVar2;
                                o1Var.T(iS, obj4, objA);
                                i21 |= i29;
                                iO = iS2;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i10 = i10;
                                fVar = fVar;
                            }
                            break;
                        case 10:
                            Object obj12 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj12;
                            if (i23 != 2) {
                                unsafe3 = unsafe2;
                                i14 = iX;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                iO = g5.a.o(bArr, iX, fVar);
                                unsafe2.putObject(obj3, j5, fVar.f2742c);
                                i21 |= i29;
                                Unsafe unsafe6 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe6;
                                iS = iS;
                                i19 = i19;
                            }
                            break;
                        case 12:
                            Object obj13 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj13;
                            if (i23 != 0) {
                                unsafe3 = unsafe2;
                                i14 = iX;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                iO = g5.a.y(bArr, iX, fVar);
                                unsafe2.putInt(obj3, j5, fVar.f2740a);
                                i21 |= i29;
                                Unsafe unsafe7 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe7;
                                iS = iS;
                                i19 = i19;
                            }
                            break;
                        case 15:
                            Object obj14 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj14;
                            if (i23 != 0) {
                                unsafe3 = unsafe2;
                                i14 = iX;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                iO = g5.a.y(bArr, iX, fVar);
                                unsafe2.putInt(obj3, j5, p.b(fVar.f2740a));
                                i21 |= i29;
                                Unsafe unsafe8 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe8;
                                iS = iS;
                                i19 = i19;
                            }
                            break;
                        case 16:
                            if (i23 != 0) {
                                Object obj15 = obj6;
                                unsafe2 = unsafe4;
                                obj3 = obj15;
                                unsafe3 = unsafe2;
                                i14 = iX;
                                i11 = i27 == true ? 1 : 0;
                                obj2 = obj3;
                                i12 = i14;
                                unsafe = unsafe3;
                                i13 = iS;
                            } else {
                                int iA2 = g5.a.A(bArr, iX, fVar);
                                unsafe4.putLong(obj6, j5, p.c(fVar.f2741b));
                                i21 |= i29;
                                obj6 = obj6;
                                unsafe4 = unsafe4;
                                iO = iA2;
                                iS = iS;
                                i19 = i19;
                            }
                            break;
                        default:
                            unsafe3 = unsafe4;
                            obj3 = obj6;
                            i14 = iX;
                            i11 = i27 == true ? 1 : 0;
                            obj2 = obj3;
                            i12 = i14;
                            unsafe = unsafe3;
                            i13 = iS;
                            break;
                    }
                } else {
                    Unsafe unsafe9 = unsafe4;
                    Object obj16 = obj6;
                    byte[] bArr5 = bArr;
                    int i35 = iX;
                    if (iV != 27) {
                        i11 = i27 == true ? 1 : 0;
                        i16 = i35;
                        if (iV <= 49) {
                            i13 = iS;
                            i18 = i20;
                            unsafe = unsafe9;
                            i17 = i21;
                            i19 = i19;
                            I = o1Var.L(obj, bArr, i16, i10, i11 == true ? 1 : 0, i19, i23, i13, i26, iV, j5, fVar);
                            if (I != i16) {
                                obj6 = obj;
                                i19 = i19;
                                iO = I;
                                iS = i13;
                                i20 = i18;
                                i21 = i17;
                                unsafe4 = unsafe;
                                i10 = i10;
                            } else {
                                obj2 = obj;
                                i12 = I;
                                i20 = i18;
                                i21 = i17;
                            }
                        } else {
                            unsafe = unsafe9;
                            i13 = iS;
                            i17 = i21;
                            i19 = i19;
                            i18 = i20;
                            obj5 = obj;
                            if (iV == 50) {
                                if (i23 == 2) {
                                    o1Var.H(i13, j5, obj5);
                                    throw null;
                                }
                                i12 = i16;
                                obj2 = obj5;
                                i20 = i18;
                                i21 = i17;
                            } else {
                                I = o1Var.I(obj5, bArr, i16, i10, i11 == true ? 1 : 0, i19, i23, i26, iV, j5, i13, fVar);
                                obj2 = obj5;
                                if (I != i16) {
                                    i13 = i13;
                                    o1Var = this;
                                    i19 = i19;
                                    iO = I;
                                    iS = i13;
                                    obj6 = obj2;
                                    i20 = i18;
                                    i21 = i17;
                                    unsafe4 = unsafe;
                                    i10 = i10;
                                } else {
                                    i13 = i13;
                                    i12 = I;
                                    i20 = i18;
                                    i21 = i17;
                                }
                            }
                        }
                    } else if (i23 == 2) {
                        t0 t0VarE = (t0) unsafe9.getObject(obj16, j5);
                        if (!((d) t0VarE).f2729a) {
                            int size = t0VarE.size();
                            t0VarE = t0VarE.e(size == 0 ? 10 : size * 2);
                            unsafe9.putObject(obj16, j5, t0VarE);
                        }
                        int iT = g5.a.t(o1Var.p(iS), i27 == true ? 1 : 0, bArr5, i35, i10, t0VarE, fVar);
                        obj6 = obj;
                        fVar = fVar;
                        iO = iT;
                        unsafe4 = unsafe9;
                        iS = iS;
                        i19 = i19;
                        i10 = i10;
                    } else {
                        obj5 = obj;
                        i11 = i27 == true ? 1 : 0;
                        i16 = i35;
                        unsafe = unsafe9;
                        i13 = iS;
                        i18 = i20;
                        i17 = i21;
                        i19 = i19;
                        i12 = i16;
                        obj2 = obj5;
                        i20 = i18;
                        i21 = i17;
                    }
                    int iW = g5.a.w(i11 == true ? 1 : 0, bArr, i12, i10, q(obj2), fVar);
                    bArr = bArr;
                    fVar = fVar;
                    i19 = i19;
                    iS = i13;
                    obj6 = obj2;
                    unsafe4 = unsafe;
                    i10 = i10;
                    iO = iW;
                    o1Var = this;
                }
            }
            int iW2 = g5.a.w(i11 == true ? 1 : 0, bArr, i12, i10, q(obj2), fVar);
            bArr = bArr;
            fVar = fVar;
            i19 = i19;
            iS = i13;
            obj6 = obj2;
            unsafe4 = unsafe;
            i10 = i10;
            iO = iW2;
            o1Var = this;
        }
        Unsafe unsafe10 = unsafe4;
        Object obj17 = obj6;
        int i36 = i10;
        int i37 = i20;
        int i38 = i21;
        if (i37 != 1048575) {
            unsafe10.putInt(obj17, i37, i38);
        }
        if (iO != i36) {
            throw w0.f();
        }
    }

    public final int L(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j5, int i15, long j10, f fVar) throws w0 {
        int i16;
        int iZ;
        Unsafe unsafe = f2814p;
        t0 t0VarE = (t0) unsafe.getObject(obj, j10);
        if (!((d) t0VarE).f2729a) {
            int size = t0VarE.size();
            t0VarE = t0VarE.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, t0VarE);
        }
        t0 t0Var = t0VarE;
        switch (i15) {
            case 18:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                if (i13 == 2) {
                    v vVar = (v) t0Var;
                    int iY = g5.a.y(bArr, i7, fVar);
                    int i17 = fVar.f2740a + iY;
                    while (iY < i17) {
                        vVar.d(Double.longBitsToDouble(g5.a.q(bArr, iY)));
                        iY += 8;
                    }
                    if (iY == i17) {
                        return iY;
                    }
                    throw w0.g();
                }
                if (i13 != 1) {
                    return i7;
                }
                v vVar2 = (v) t0Var;
                vVar2.d(Double.longBitsToDouble(g5.a.q(bArr, i7)));
                int i18 = i7 + 8;
                while (i18 < i10) {
                    int iY2 = g5.a.y(bArr, i18, fVar);
                    if (i11 != fVar.f2740a) {
                        return i18;
                    }
                    vVar2.d(Double.longBitsToDouble(g5.a.q(bArr, iY2)));
                    i18 = iY2 + 8;
                }
                return i18;
            case 19:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                if (i13 == 2) {
                    c0 c0Var = (c0) t0Var;
                    int iY3 = g5.a.y(bArr, i7, fVar);
                    int i19 = fVar.f2740a + iY3;
                    while (iY3 < i19) {
                        c0Var.d(Float.intBitsToFloat(g5.a.p(bArr, iY3)));
                        iY3 += 4;
                    }
                    if (iY3 == i19) {
                        return iY3;
                    }
                    throw w0.g();
                }
                if (i13 != 5) {
                    return i7;
                }
                c0 c0Var2 = (c0) t0Var;
                c0Var2.d(Float.intBitsToFloat(g5.a.p(bArr, i7)));
                int i20 = i7 + 4;
                while (i20 < i10) {
                    int iY4 = g5.a.y(bArr, i20, fVar);
                    if (i11 != fVar.f2740a) {
                        return i20;
                    }
                    c0Var2.d(Float.intBitsToFloat(g5.a.p(bArr, iY4)));
                    i20 = iY4 + 4;
                }
                return i20;
            case 20:
            case 21:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                if (i13 == 2) {
                    d1 d1Var = (d1) t0Var;
                    int iY5 = g5.a.y(bArr, i7, fVar);
                    int i21 = fVar.f2740a + iY5;
                    while (iY5 < i21) {
                        iY5 = g5.a.A(bArr, iY5, fVar);
                        d1Var.d(fVar.f2741b);
                    }
                    if (iY5 == i21) {
                        return iY5;
                    }
                    throw w0.g();
                }
                if (i13 != 0) {
                    return i7;
                }
                d1 d1Var2 = (d1) t0Var;
                int iA = g5.a.A(bArr, i7, fVar);
                d1Var2.d(fVar.f2741b);
                while (iA < i10) {
                    int iY6 = g5.a.y(bArr, iA, fVar);
                    if (i11 != fVar.f2740a) {
                        return iA;
                    }
                    iA = g5.a.A(bArr, iY6, fVar);
                    d1Var2.d(fVar.f2741b);
                }
                return iA;
            case 22:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                if (i13 != 2) {
                    return i13 == 0 ? g5.a.z(i11, bArr, i7, i10, t0Var, fVar) : i7;
                }
                k0 k0Var = (k0) t0Var;
                int iY7 = g5.a.y(bArr, i7, fVar);
                int i22 = fVar.f2740a + iY7;
                while (iY7 < i22) {
                    iY7 = g5.a.y(bArr, iY7, fVar);
                    k0Var.d(fVar.f2740a);
                }
                if (iY7 == i22) {
                    return iY7;
                }
                throw w0.g();
            case 23:
            case 32:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                if (i13 == 2) {
                    d1 d1Var3 = (d1) t0Var;
                    int iY8 = g5.a.y(bArr, i7, fVar);
                    int i23 = fVar.f2740a + iY8;
                    while (iY8 < i23) {
                        d1Var3.d(g5.a.q(bArr, iY8));
                        iY8 += 8;
                    }
                    if (iY8 == i23) {
                        return iY8;
                    }
                    throw w0.g();
                }
                if (i13 != 1) {
                    return i7;
                }
                d1 d1Var4 = (d1) t0Var;
                d1Var4.d(g5.a.q(bArr, i7));
                int i24 = i7 + 8;
                while (i24 < i10) {
                    int iY9 = g5.a.y(bArr, i24, fVar);
                    if (i11 != fVar.f2740a) {
                        return i24;
                    }
                    d1Var4.d(g5.a.q(bArr, iY9));
                    i24 = iY9 + 8;
                }
                return i24;
            case 24:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                if (i13 == 2) {
                    k0 k0Var2 = (k0) t0Var;
                    int iY10 = g5.a.y(bArr, i7, fVar);
                    int i25 = fVar.f2740a + iY10;
                    while (iY10 < i25) {
                        k0Var2.d(g5.a.p(bArr, iY10));
                        iY10 += 4;
                    }
                    if (iY10 == i25) {
                        return iY10;
                    }
                    throw w0.g();
                }
                if (i13 != 5) {
                    return i7;
                }
                k0 k0Var3 = (k0) t0Var;
                k0Var3.d(g5.a.p(bArr, i7));
                int i26 = i7 + 4;
                while (i26 < i10) {
                    int iY11 = g5.a.y(bArr, i26, fVar);
                    if (i11 != fVar.f2740a) {
                        return i26;
                    }
                    k0Var3.d(g5.a.p(bArr, iY11));
                    i26 = iY11 + 4;
                }
                return i26;
            case 25:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                if (i13 == 2) {
                    g gVar = (g) t0Var;
                    int iY12 = g5.a.y(bArr, i7, fVar);
                    int i27 = fVar.f2740a + iY12;
                    while (iY12 < i27) {
                        iY12 = g5.a.A(bArr, iY12, fVar);
                        gVar.d(fVar.f2741b != 0);
                    }
                    if (iY12 == i27) {
                        return iY12;
                    }
                    throw w0.g();
                }
                if (i13 != 0) {
                    return i7;
                }
                g gVar2 = (g) t0Var;
                int iA2 = g5.a.A(bArr, i7, fVar);
                gVar2.d(fVar.f2741b != 0);
                while (iA2 < i10) {
                    int iY13 = g5.a.y(bArr, iA2, fVar);
                    if (i11 != fVar.f2740a) {
                        return iA2;
                    }
                    iA2 = g5.a.A(bArr, iY13, fVar);
                    gVar2.d(fVar.f2741b != 0);
                }
                return iA2;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                if (i13 != 2) {
                    return i7;
                }
                if ((j5 & 536870912) == 0) {
                    int iY14 = g5.a.y(bArr, i7, fVar);
                    int i28 = fVar.f2740a;
                    if (i28 < 0) {
                        throw w0.e();
                    }
                    if (i28 == 0) {
                        t0Var.add("");
                    } else {
                        t0Var.add(new String(bArr, iY14, i28, u0.f2861a));
                        iY14 += i28;
                    }
                    while (iY14 < i10) {
                        int iY15 = g5.a.y(bArr, iY14, fVar);
                        if (i11 != fVar.f2740a) {
                            return iY14;
                        }
                        iY14 = g5.a.y(bArr, iY15, fVar);
                        int i29 = fVar.f2740a;
                        if (i29 < 0) {
                            throw w0.e();
                        }
                        if (i29 == 0) {
                            t0Var.add("");
                        } else {
                            t0Var.add(new String(bArr, iY14, i29, u0.f2861a));
                            iY14 += i29;
                        }
                    }
                    return iY14;
                }
                int iY16 = g5.a.y(bArr, i7, fVar);
                int i30 = fVar.f2740a;
                if (i30 < 0) {
                    throw w0.e();
                }
                if (i30 == 0) {
                    t0Var.add("");
                } else {
                    int i31 = iY16 + i30;
                    if (!m2.f2795a.K(bArr, iY16, i31)) {
                        throw w0.b();
                    }
                    t0Var.add(new String(bArr, iY16, i30, u0.f2861a));
                    iY16 = i31;
                }
                while (iY16 < i10) {
                    int iY17 = g5.a.y(bArr, iY16, fVar);
                    if (i11 != fVar.f2740a) {
                        return iY16;
                    }
                    iY16 = g5.a.y(bArr, iY17, fVar);
                    int i32 = fVar.f2740a;
                    if (i32 < 0) {
                        throw w0.e();
                    }
                    if (i32 == 0) {
                        t0Var.add("");
                    } else {
                        int i33 = iY16 + i32;
                        if (!m2.f2795a.K(bArr, iY16, i33)) {
                            throw w0.b();
                        }
                        t0Var.add(new String(bArr, iY16, i32, u0.f2861a));
                        iY16 = i33;
                    }
                }
                return iY16;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                i16 = i7;
                if (i13 == 2) {
                    return g5.a.t(p(i14), i11, bArr, i16, i10, t0Var, fVar);
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                i16 = i7;
                if (i13 == 2) {
                    int iY18 = g5.a.y(bArr, i7, fVar);
                    int i34 = fVar.f2740a;
                    if (i34 < 0) {
                        throw w0.e();
                    }
                    if (i34 > bArr.length - iY18) {
                        throw w0.g();
                    }
                    if (i34 == 0) {
                        t0Var.add(l.f2785b);
                    } else {
                        t0Var.add(l.k(bArr, iY18, i34));
                        iY18 += i34;
                    }
                    while (iY18 < i10) {
                        int iY19 = g5.a.y(bArr, iY18, fVar);
                        if (i11 != fVar.f2740a) {
                            return iY18;
                        }
                        iY18 = g5.a.y(bArr, iY19, fVar);
                        int i35 = fVar.f2740a;
                        if (i35 < 0) {
                            throw w0.e();
                        }
                        if (i35 > bArr.length - iY18) {
                            throw w0.g();
                        }
                        if (i35 == 0) {
                            t0Var.add(l.f2785b);
                        } else {
                            t0Var.add(l.k(bArr, iY18, i35));
                            iY18 += i35;
                        }
                    }
                    return iY18;
                }
                break;
            case 30:
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                if (i13 == 2) {
                    k0 k0Var4 = (k0) t0Var;
                    iZ = g5.a.y(bArr, i7, fVar);
                    int i36 = fVar.f2740a + iZ;
                    while (iZ < i36) {
                        iZ = g5.a.y(bArr, iZ, fVar);
                        k0Var4.d(fVar.f2740a);
                    }
                    if (iZ != i36) {
                        throw w0.g();
                    }
                } else {
                    if (i13 != 0) {
                        return i7;
                    }
                    iZ = g5.a.z(i11, bArr, i7, i10, t0Var, fVar);
                }
                y1.v(obj, i12, t0Var, n(i14), null, this.f2826m);
                return iZ;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                if (i13 == 2) {
                    k0 k0Var5 = (k0) t0Var;
                    int iY20 = g5.a.y(bArr, i7, fVar);
                    int i37 = fVar.f2740a + iY20;
                    while (iY20 < i37) {
                        iY20 = g5.a.y(bArr, iY20, fVar);
                        k0Var5.d(p.b(fVar.f2740a));
                    }
                    if (iY20 == i37) {
                        return iY20;
                    }
                    throw w0.g();
                }
                if (i13 != 0) {
                    return i7;
                }
                k0 k0Var6 = (k0) t0Var;
                int iY21 = g5.a.y(bArr, i7, fVar);
                k0Var6.d(p.b(fVar.f2740a));
                while (iY21 < i10) {
                    int iY22 = g5.a.y(bArr, iY21, fVar);
                    if (i11 != fVar.f2740a) {
                        return iY21;
                    }
                    iY21 = g5.a.y(bArr, iY22, fVar);
                    k0Var6.d(p.b(fVar.f2740a));
                }
                return iY21;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                if (i13 == 2) {
                    d1 d1Var5 = (d1) t0Var;
                    int iY23 = g5.a.y(bArr, i7, fVar);
                    int i38 = fVar.f2740a + iY23;
                    while (iY23 < i38) {
                        iY23 = g5.a.A(bArr, iY23, fVar);
                        d1Var5.d(p.c(fVar.f2741b));
                    }
                    if (iY23 == i38) {
                        return iY23;
                    }
                    throw w0.g();
                }
                if (i13 != 0) {
                    return i7;
                }
                d1 d1Var6 = (d1) t0Var;
                int iA3 = g5.a.A(bArr, i7, fVar);
                d1Var6.d(p.c(fVar.f2741b));
                while (iA3 < i10) {
                    int iY24 = g5.a.y(bArr, iA3, fVar);
                    if (i11 != fVar.f2740a) {
                        return iA3;
                    }
                    iA3 = g5.a.A(bArr, iY24, fVar);
                    d1Var6.d(p.c(fVar.f2741b));
                }
                return iA3;
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                if (i13 == 3) {
                    x1 x1VarP = p(i14);
                    int i39 = (i11 & (-8)) | 4;
                    int iR = g5.a.r(x1VarP, bArr, i7, i10, i39, fVar);
                    x1 x1Var = x1VarP;
                    t0Var.add(fVar.f2742c);
                    while (iR < i10) {
                        int iY25 = g5.a.y(bArr, iR, fVar);
                        if (i11 != fVar.f2740a) {
                            return iR;
                        }
                        x1 x1Var2 = x1Var;
                        iR = g5.a.r(x1Var2, bArr, iY25, i10, i39, fVar);
                        t0Var.add(fVar.f2742c);
                        x1Var = x1Var2;
                    }
                    return iR;
                }
            default:
                return i7;
        }
        return i16;
    }

    public final void M(Object obj, long j5, q qVar, x1 x1Var, y yVar) throws v0 {
        int iZ;
        List listC = this.f2825l.c(j5, obj);
        p pVar = (p) qVar.f2837e;
        int i7 = qVar.f2834b;
        if ((i7 & 7) != 3) {
            throw w0.c();
        }
        do {
            Object objJ = x1Var.j();
            qVar.e(objJ, x1Var, yVar);
            x1Var.d(objJ);
            listC.add(objJ);
            if (pVar.e() || qVar.f2836d != 0) {
                return;
            } else {
                iZ = pVar.z();
            }
        } while (iZ == i7);
        qVar.f2836d = iZ;
    }

    public final void N(Object obj, int i7, q qVar, x1 x1Var, y yVar) throws w0 {
        int iZ;
        List listC = this.f2825l.c(i7 & 1048575, obj);
        p pVar = (p) qVar.f2837e;
        int i10 = qVar.f2834b;
        if ((i10 & 7) != 2) {
            throw w0.c();
        }
        do {
            Object objJ = x1Var.j();
            qVar.f(objJ, x1Var, yVar);
            x1Var.d(objJ);
            listC.add(objJ);
            if (pVar.e() || qVar.f2836d != 0) {
                return;
            } else {
                iZ = pVar.z();
            }
        } while (iZ == i10);
        qVar.f2836d = iZ;
    }

    public final void O(Object obj, int i7, q qVar) throws v0 {
        if ((536870912 & i7) != 0) {
            qVar.y(2);
            j2.p(i7 & 1048575, obj, ((p) qVar.f2837e).y());
        } else if (!this.f2820f) {
            j2.p(i7 & 1048575, obj, qVar.h());
        } else {
            qVar.y(2);
            j2.p(i7 & 1048575, obj, ((p) qVar.f2837e).x());
        }
    }

    public final void Q(int i7, Object obj) {
        int i10 = this.f2815a[i7 + 2];
        long j5 = 1048575 & i10;
        if (j5 == 1048575) {
            return;
        }
        j2.n((1 << (i10 >>> 20)) | j2.f2774c.i(j5, obj), j5, obj);
    }

    public final void R(int i7, int i10, Object obj) {
        j2.n(i7, this.f2815a[i10 + 2] & 1048575, obj);
    }

    public final int S(int i7, int i10) {
        int[] iArr = this.f2815a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i7 == i13) {
                return i12;
            }
            if (i7 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final void T(int i7, Object obj, Object obj2) {
        f2814p.putObject(obj, W(i7) & 1048575, obj2);
        Q(i7, obj);
    }

    public final void U(int i7, int i10, Object obj, Object obj2) {
        f2814p.putObject(obj, W(i10) & 1048575, obj2);
        R(i7, i10, obj);
    }

    public final int W(int i7) {
        return this.f2815a[i7 + 1];
    }

    public final void X(Object obj, f1 f1Var) {
        int i7;
        int i10;
        int i11;
        int[] iArr = this.f2815a;
        int length = iArr.length;
        Unsafe unsafe = f2814p;
        int i12 = 1048575;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11 + 3) {
            int iW = W(i14);
            int i15 = iArr[i14];
            int iV = V(iW);
            if (iV <= 17) {
                int i16 = iArr[i14 + 2];
                i7 = 1048575;
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i7 = 1048575;
                i10 = 0;
            }
            int i18 = i14;
            long j5 = iW & i7;
            switch (iV) {
                case 0:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        double dG = j2.f2774c.g(j5, obj);
                        u uVar = (u) f1Var.f2744a;
                        uVar.getClass();
                        uVar.m0(i15, Double.doubleToRawLongBits(dG));
                        continue;
                    }
                    break;
                case 1:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        float fH = j2.f2774c.h(j5, obj);
                        u uVar2 = (u) f1Var.f2744a;
                        uVar2.getClass();
                        uVar2.k0(i15, Float.floatToRawIntBits(fH));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.f(i15, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).v0(i15, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.e(i15, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.c(i15, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.b(i15, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).i0(i15, j2.f2774c.d(j5, obj));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        Y(i15, unsafe.getObject(obj, j5), f1Var);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.g(i15, unsafe.getObject(obj, j5), p(i11));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.a(i15, (l) unsafe.getObject(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).t0(i15, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).o0(i15, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).k0(i15, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((u) f1Var.f2744a).m0(i15, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        int i19 = unsafe.getInt(obj, j5);
                        ((u) f1Var.f2744a).t0(i15, (i19 >> 31) ^ (i19 << 1));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        long j10 = unsafe.getLong(obj, j5);
                        ((u) f1Var.f2744a).v0(i15, (j10 << 1) ^ (j10 >> 63));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        f1Var.d(i15, unsafe.getObject(obj, j5), p(i11));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    i11 = i18;
                    y1.C(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 19:
                    i11 = i18;
                    y1.G(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 20:
                    i11 = i18;
                    y1.J(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 21:
                    i11 = i18;
                    y1.R(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 22:
                    i11 = i18;
                    y1.I(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 23:
                    i11 = i18;
                    y1.F(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 24:
                    i11 = i18;
                    y1.E(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 25:
                    i11 = i18;
                    y1.A(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    i11 = i18;
                    y1.P(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var);
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    i11 = i18;
                    y1.K(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, p(i11));
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    i11 = i18;
                    y1.B(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var);
                    break;
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                    i11 = i18;
                    y1.Q(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    break;
                case 30:
                    i11 = i18;
                    y1.D(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                    i11 = i18;
                    y1.L(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case 32:
                    i11 = i18;
                    y1.M(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                    i11 = i18;
                    y1.N(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                    i11 = i18;
                    y1.O(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, false);
                    continue;
                    break;
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                    i11 = i18;
                    y1.C(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                    i11 = i18;
                    y1.G(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                    i11 = i18;
                    y1.J(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                    i11 = i18;
                    y1.R(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                    i11 = i18;
                    y1.I(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                    i11 = i18;
                    y1.F(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                    i11 = i18;
                    y1.E(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                    i11 = i18;
                    y1.A(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                    i11 = i18;
                    y1.Q(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                    i11 = i18;
                    y1.D(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                    i11 = i18;
                    y1.L(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                    i11 = i18;
                    y1.M(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                    i11 = i18;
                    y1.N(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    i11 = i18;
                    y1.O(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    i11 = i18;
                    y1.H(iArr[i11], (List) unsafe.getObject(obj, j5), f1Var, p(i11));
                    break;
                case 50:
                    i11 = i18;
                    if (unsafe.getObject(obj, j5) != null) {
                        Object objO = o(i11);
                        this.f2827n.getClass();
                        a2.f.N(objO);
                        throw null;
                    }
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        double dDoubleValue = ((Double) j2.f2774c.k(j5, obj)).doubleValue();
                        u uVar3 = (u) f1Var.f2744a;
                        uVar3.getClass();
                        uVar3.m0(i15, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        float fFloatValue = ((Float) j2.f2774c.k(j5, obj)).floatValue();
                        u uVar4 = (u) f1Var.f2744a;
                        uVar4.getClass();
                        uVar4.k0(i15, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.f(i15, G(j5, obj));
                    }
                    break;
                case 54:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).v0(i15, G(j5, obj));
                    }
                    break;
                case 55:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.e(i15, F(j5, obj));
                    }
                    break;
                case 56:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.c(i15, G(j5, obj));
                    }
                    break;
                case 57:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.b(i15, F(j5, obj));
                    }
                    break;
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).i0(i15, ((Boolean) j2.f2774c.k(j5, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        Y(i15, unsafe.getObject(obj, j5), f1Var);
                    }
                    break;
                case 60:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.g(i15, unsafe.getObject(obj, j5), p(i11));
                    }
                    break;
                case 61:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.a(i15, (l) unsafe.getObject(obj, j5));
                    }
                    break;
                case 62:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).t0(i15, F(j5, obj));
                    }
                    break;
                case 63:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).o0(i15, F(j5, obj));
                    }
                    break;
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).k0(i15, F(j5, obj));
                    }
                    break;
                case 65:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        ((u) f1Var.f2744a).m0(i15, G(j5, obj));
                    }
                    break;
                case 66:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        int iF = F(j5, obj);
                        ((u) f1Var.f2744a).t0(i15, (iF >> 31) ^ (iF << 1));
                    }
                    break;
                case 67:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        long jG = G(j5, obj);
                        ((u) f1Var.f2744a).v0(i15, (jG << 1) ^ (jG >> 63));
                    }
                    break;
                case 68:
                    i11 = i18;
                    if (v(i15, i11, obj)) {
                        f1Var.d(i15, unsafe.getObject(obj, j5), p(i11));
                    }
                    break;
                default:
                    i11 = i18;
                    break;
            }
        }
        this.f2826m.getClass();
        ((j0) obj).unknownFields.g(f1Var);
    }

    @Override // com.google.protobuf.x1
    public final void a(Object obj, f1 f1Var) {
        f1Var.getClass();
        u uVar = (u) f1Var.f2744a;
        if (!this.f2821g) {
            X(obj, f1Var);
            return;
        }
        int[] iArr = this.f2815a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iW = W(i7);
            int i10 = iArr[i7];
            switch (V(iW)) {
                case 0:
                    if (t(i7, obj)) {
                        double dG = j2.f2774c.g(iW & 1048575, obj);
                        uVar.getClass();
                        uVar.m0(i10, Double.doubleToRawLongBits(dG));
                    }
                    break;
                case 1:
                    if (t(i7, obj)) {
                        float fH = j2.f2774c.h(iW & 1048575, obj);
                        uVar.getClass();
                        uVar.k0(i10, Float.floatToRawIntBits(fH));
                    }
                    break;
                case 2:
                    if (t(i7, obj)) {
                        f1Var.f(i10, j2.f2774c.j(iW & 1048575, obj));
                    }
                    break;
                case 3:
                    if (t(i7, obj)) {
                        uVar.v0(i10, j2.f2774c.j(iW & 1048575, obj));
                    }
                    break;
                case 4:
                    if (t(i7, obj)) {
                        f1Var.e(i10, j2.f2774c.i(iW & 1048575, obj));
                    }
                    break;
                case 5:
                    if (t(i7, obj)) {
                        f1Var.c(i10, j2.f2774c.j(iW & 1048575, obj));
                    }
                    break;
                case 6:
                    if (t(i7, obj)) {
                        f1Var.b(i10, j2.f2774c.i(iW & 1048575, obj));
                    }
                    break;
                case 7:
                    if (t(i7, obj)) {
                        uVar.i0(i10, j2.f2774c.d(iW & 1048575, obj));
                    }
                    break;
                case 8:
                    if (t(i7, obj)) {
                        Y(i10, j2.f2774c.k(iW & 1048575, obj), f1Var);
                    }
                    break;
                case 9:
                    if (t(i7, obj)) {
                        f1Var.g(i10, j2.f2774c.k(iW & 1048575, obj), p(i7));
                    }
                    break;
                case 10:
                    if (t(i7, obj)) {
                        f1Var.a(i10, (l) j2.f2774c.k(iW & 1048575, obj));
                    }
                    break;
                case 11:
                    if (t(i7, obj)) {
                        uVar.t0(i10, j2.f2774c.i(iW & 1048575, obj));
                    }
                    break;
                case 12:
                    if (t(i7, obj)) {
                        uVar.o0(i10, j2.f2774c.i(iW & 1048575, obj));
                    }
                    break;
                case 13:
                    if (t(i7, obj)) {
                        uVar.k0(i10, j2.f2774c.i(iW & 1048575, obj));
                    }
                    break;
                case 14:
                    if (t(i7, obj)) {
                        uVar.m0(i10, j2.f2774c.j(iW & 1048575, obj));
                    }
                    break;
                case 15:
                    if (t(i7, obj)) {
                        int i11 = j2.f2774c.i(iW & 1048575, obj);
                        uVar.t0(i10, (i11 >> 31) ^ (i11 << 1));
                    }
                    break;
                case 16:
                    if (t(i7, obj)) {
                        long j5 = j2.f2774c.j(iW & 1048575, obj);
                        uVar.v0(i10, (j5 >> 63) ^ (j5 << 1));
                    }
                    break;
                case 17:
                    if (t(i7, obj)) {
                        f1Var.d(i10, j2.f2774c.k(iW & 1048575, obj), p(i7));
                    }
                    break;
                case 18:
                    y1.C(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 19:
                    y1.G(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 20:
                    y1.J(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 21:
                    y1.R(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 22:
                    y1.I(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 23:
                    y1.F(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 24:
                    y1.E(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 25:
                    y1.A(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    y1.P(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var);
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    y1.K(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, p(i7));
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    y1.B(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var);
                    break;
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                    y1.Q(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 30:
                    y1.D(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                    y1.L(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case 32:
                    y1.M(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                    y1.N(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                    y1.O(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, false);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                    y1.C(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                    y1.G(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                    y1.J(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                    y1.R(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                    y1.I(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                    y1.F(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                    y1.E(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                    y1.A(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                    y1.Q(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                    y1.D(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                    y1.L(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                    y1.M(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                    y1.N(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    y1.O(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, true);
                    break;
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    y1.H(iArr[i7], (List) j2.f2774c.k(iW & 1048575, obj), f1Var, p(i7));
                    break;
                case 50:
                    if (j2.f2774c.k(iW & 1048575, obj) != null) {
                        Object objO = o(i7);
                        this.f2827n.getClass();
                        a2.f.N(objO);
                        throw null;
                    }
                    break;
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    if (v(i10, i7, obj)) {
                        double dDoubleValue = ((Double) j2.f2774c.k(iW & 1048575, obj)).doubleValue();
                        uVar.getClass();
                        uVar.m0(i10, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    if (v(i10, i7, obj)) {
                        float fFloatValue = ((Float) j2.f2774c.k(iW & 1048575, obj)).floatValue();
                        uVar.getClass();
                        uVar.k0(i10, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    if (v(i10, i7, obj)) {
                        f1Var.f(i10, G(iW & 1048575, obj));
                    }
                    break;
                case 54:
                    if (v(i10, i7, obj)) {
                        uVar.v0(i10, G(iW & 1048575, obj));
                    }
                    break;
                case 55:
                    if (v(i10, i7, obj)) {
                        f1Var.e(i10, F(iW & 1048575, obj));
                    }
                    break;
                case 56:
                    if (v(i10, i7, obj)) {
                        f1Var.c(i10, G(iW & 1048575, obj));
                    }
                    break;
                case 57:
                    if (v(i10, i7, obj)) {
                        f1Var.b(i10, F(iW & 1048575, obj));
                    }
                    break;
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    if (v(i10, i7, obj)) {
                        uVar.i0(i10, ((Boolean) j2.f2774c.k(iW & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (v(i10, i7, obj)) {
                        Y(i10, j2.f2774c.k(iW & 1048575, obj), f1Var);
                    }
                    break;
                case 60:
                    if (v(i10, i7, obj)) {
                        f1Var.g(i10, j2.f2774c.k(iW & 1048575, obj), p(i7));
                    }
                    break;
                case 61:
                    if (v(i10, i7, obj)) {
                        f1Var.a(i10, (l) j2.f2774c.k(iW & 1048575, obj));
                    }
                    break;
                case 62:
                    if (v(i10, i7, obj)) {
                        uVar.t0(i10, F(iW & 1048575, obj));
                    }
                    break;
                case 63:
                    if (v(i10, i7, obj)) {
                        uVar.o0(i10, F(iW & 1048575, obj));
                    }
                    break;
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    if (v(i10, i7, obj)) {
                        uVar.k0(i10, F(iW & 1048575, obj));
                    }
                    break;
                case 65:
                    if (v(i10, i7, obj)) {
                        uVar.m0(i10, G(iW & 1048575, obj));
                    }
                    break;
                case 66:
                    if (v(i10, i7, obj)) {
                        int iF = F(iW & 1048575, obj);
                        uVar.t0(i10, (iF >> 31) ^ (iF << 1));
                    }
                    break;
                case 67:
                    if (v(i10, i7, obj)) {
                        long jG = G(iW & 1048575, obj);
                        uVar.v0(i10, (jG >> 63) ^ (jG << 1));
                    }
                    break;
                case 68:
                    if (v(i10, i7, obj)) {
                        f1Var.d(i10, j2.f2774c.k(iW & 1048575, obj), p(i7));
                    }
                    break;
            }
        }
        this.f2826m.getClass();
        ((j0) obj).unknownFields.g(f1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.protobuf.x1
    public final void b(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f2815a;
            if (i7 >= iArr.length) {
                y1.x(this.f2826m, obj, obj2);
                return;
            }
            int iW = W(i7);
            long j5 = 1048575 & iW;
            int i10 = iArr[i7];
            switch (V(iW)) {
                case 0:
                    if (!t(i7, obj2)) {
                        obj3 = obj;
                    } else {
                        i2 i2Var = j2.f2774c;
                        obj3 = obj;
                        i2Var.o(obj3, j5, i2Var.g(j5, obj2));
                        Q(i7, obj3);
                    }
                    break;
                case 1:
                    if (t(i7, obj2)) {
                        i2 i2Var2 = j2.f2774c;
                        i2Var2.p(obj, j5, i2Var2.h(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (t(i7, obj2)) {
                        j2.o(obj, j5, j2.f2774c.j(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (t(i7, obj2)) {
                        j2.o(obj, j5, j2.f2774c.j(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (t(i7, obj2)) {
                        j2.o(obj, j5, j2.f2774c.j(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (t(i7, obj2)) {
                        i2 i2Var3 = j2.f2774c;
                        i2Var3.m(obj, j5, i2Var3.d(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (t(i7, obj2)) {
                        j2.p(j5, obj, j2.f2774c.k(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    y(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (t(i7, obj2)) {
                        j2.p(j5, obj, j2.f2774c.k(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (t(i7, obj2)) {
                        j2.o(obj, j5, j2.f2774c.j(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (t(i7, obj2)) {
                        j2.n(j2.f2774c.i(j5, obj2), j5, obj);
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (t(i7, obj2)) {
                        j2.o(obj, j5, j2.f2774c.j(j5, obj2));
                        Q(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    y(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                case 30:
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                case 32:
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    this.f2825l.b(j5, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = y1.f2891a;
                    i2 i2Var4 = j2.f2774c;
                    Object objK = i2Var4.k(j5, obj);
                    Object objK2 = i2Var4.k(j5, obj2);
                    this.f2827n.getClass();
                    j2.p(j5, obj, h1.b(objK, objK2));
                    obj3 = obj;
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                case 59:
                    if (v(i10, i7, obj2)) {
                        j2.p(j5, obj, j2.f2774c.k(j5, obj2));
                        R(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    z(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (v(i10, i7, obj2)) {
                        j2.p(j5, obj, j2.f2774c.k(j5, obj2));
                        R(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    z(i7, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i7 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x06c5 A[Catch: all -> 0x0445, TryCatch #5 {all -> 0x0445, blocks: (B:168:0x06c0, B:170:0x06c5, B:171:0x06ca, B:130:0x042f, B:131:0x0439, B:134:0x0448, B:135:0x0458, B:136:0x0469, B:137:0x047a, B:138:0x048b, B:139:0x049c, B:140:0x04ad, B:141:0x04be, B:142:0x04cf, B:143:0x04e8, B:144:0x0503, B:145:0x051e, B:146:0x053a, B:147:0x0556, B:149:0x056d, B:152:0x0574, B:153:0x057a, B:154:0x0586, B:155:0x05a1, B:156:0x05b5, B:157:0x05cf, B:158:0x05db, B:159:0x05f8, B:160:0x0614, B:161:0x0630, B:162:0x064b, B:163:0x0666, B:164:0x0681, B:165:0x069e), top: B:196:0x06c0 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x06d2 A[LOOP:2: B:173:0x06d0->B:174:0x06d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:182:0x06f0 A[LOOP:3: B:181:0x06ee->B:182:0x06f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[PHI: r13
      0x0046: PHI (r13v6 java.lang.Object) = (r13v1 java.lang.Object), (r13v4 java.lang.Object), (r13v27 java.lang.Object) binds: [B:17:0x0043, B:28:0x006a, B:41:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // com.google.protobuf.x1
    public final void c(Object obj, q qVar, y yVar) throws Throwable {
        o1 o1Var;
        Object obj2;
        q qVar2;
        o1 o1Var2 = this;
        Object obj3 = obj;
        q qVar3 = qVar;
        y yVar2 = yVar;
        yVar2.getClass();
        l(obj3);
        b2 b2Var = o1Var2.f2826m;
        int[] iArr = o1Var2.f2822h;
        int i7 = o1Var2.f2824j;
        int i10 = o1Var2.f2823i;
        Object objA = null;
        while (true) {
            try {
                int iB = qVar3.b();
                int iS = (iB < o1Var2.f2817c || iB > o1Var2.f2818d) ? -1 : o1Var2.S(iB, 0);
                if (iS >= 0) {
                    int iW = o1Var2.W(iS);
                    try {
                        int iV = V(iW);
                        c1 c1Var = o1Var2.f2825l;
                        switch (iV) {
                            case 0:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE = E(iW);
                                qVar2.y(1);
                                j2.f2774c.o(obj2, jE, ((p) qVar2.f2837e).l());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 1:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE2 = E(iW);
                                qVar2.y(5);
                                j2.f2774c.p(obj2, jE2, ((p) qVar2.f2837e).p());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 2:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE3 = E(iW);
                                qVar2.y(0);
                                j2.o(obj2, jE3, ((p) qVar2.f2837e).r());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 3:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE4 = E(iW);
                                qVar2.y(0);
                                j2.o(obj2, jE4, ((p) qVar2.f2837e).B());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 4:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE5 = E(iW);
                                qVar2.y(0);
                                j2.n(((p) qVar2.f2837e).q(), jE5, obj2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 5:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE6 = E(iW);
                                qVar2.y(1);
                                j2.o(obj2, jE6, ((p) qVar2.f2837e).o());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 6:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE7 = E(iW);
                                qVar2.y(5);
                                j2.n(((p) qVar2.f2837e).n(), jE7, obj2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 7:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE8 = E(iW);
                                qVar2.y(0);
                                j2.f2774c.m(obj2, jE8, ((p) qVar2.f2837e).j());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 8:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                o1Var.O(obj2, iW, qVar2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 9:
                                qVar2 = qVar3;
                                y yVar3 = yVar2;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                l1 l1Var = (l1) o1Var.A(iS, obj2);
                                x1 x1VarP = o1Var.p(iS);
                                qVar2.y(2);
                                qVar2.f(l1Var, x1VarP, yVar3);
                                o1Var.T(iS, obj2, l1Var);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 10:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                j2.p(E(iW), obj2, qVar2.h());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 11:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE9 = E(iW);
                                qVar2.y(0);
                                j2.n(((p) qVar2.f2837e).A(), jE9, obj2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 12:
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.y(0);
                                int iM = ((p) qVar2.f2837e).m();
                                p0 p0VarN = o1Var.n(iS);
                                if (p0VarN == null || p0VarN.isInRange(iM)) {
                                    j2.n(iM, E(iW), obj2);
                                    o1Var.Q(iS, obj2);
                                } else {
                                    objA = y1.z(obj2, iB, iM, objA, b2Var);
                                }
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 13:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE10 = E(iW);
                                qVar2.y(5);
                                j2.n(((p) qVar2.f2837e).t(), jE10, obj2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 14:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE11 = E(iW);
                                qVar2.y(1);
                                j2.o(obj2, jE11, ((p) qVar2.f2837e).u());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 15:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE12 = E(iW);
                                qVar2.y(0);
                                j2.n(((p) qVar2.f2837e).v(), jE12, obj2);
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 16:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                long jE13 = E(iW);
                                qVar2.y(0);
                                j2.o(obj2, jE13, ((p) qVar2.f2837e).w());
                                o1Var.Q(iS, obj2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 17:
                                qVar2 = qVar3;
                                y yVar4 = yVar2;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                l1 l1Var2 = (l1) o1Var.A(iS, obj2);
                                x1 x1VarP2 = o1Var.p(iS);
                                qVar2.y(3);
                                qVar2.e(l1Var2, x1VarP2, yVar4);
                                o1Var.T(iS, obj2, l1Var2);
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 18:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.j(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 19:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.n(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 20:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.p(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 21:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.w(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 22:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.o(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 23:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.m(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 24:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.l(c1Var.c(E(iW), obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 25:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2.g(c1Var.c(iW & 1048575, obj2));
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                                qVar2 = qVar3;
                                o1Var = o1Var2;
                                obj2 = obj3;
                                if ((536870912 & iW) != 0) {
                                    try {
                                        qVar2.u(c1Var.c(iW & 1048575, obj2), true);
                                        break;
                                    } catch (v0 unused) {
                                        try {
                                            b2Var.getClass();
                                            if (objA == null) {
                                                objA = b2.a(obj2);
                                            }
                                            if (!b2.b(objA, qVar2)) {
                                                while (i10 < i7) {
                                                    o1Var.m(iArr[i10], obj2, objA);
                                                    i10++;
                                                }
                                                if (objA != null) {
                                                    ((j0) obj2).unknownFields = (a2) objA;
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            while (i10 < i7) {
                                                o1Var.m(iArr[i10], obj2, objA);
                                                i10++;
                                            }
                                            if (objA != null) {
                                                b2Var.getClass();
                                                ((j0) obj2).unknownFields = (a2) objA;
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    qVar2.u(c1Var.c(iW & 1048575, obj2), false);
                                }
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                try {
                                    try {
                                        o1Var2.N(obj3, iW, qVar3, o1Var2.p(iS), yVar);
                                        qVar2 = qVar3;
                                        o1Var = o1Var2;
                                        obj2 = obj3;
                                    } catch (v0 unused2) {
                                        qVar2 = qVar3;
                                        o1Var = o1Var2;
                                        obj2 = obj3;
                                        b2Var.getClass();
                                        if (objA == null) {
                                            objA = b2.a(obj2);
                                        }
                                        if (!b2.b(objA, qVar2)) {
                                            while (i10 < i7) {
                                                o1Var.m(iArr[i10], obj2, objA);
                                                i10++;
                                            }
                                            if (objA != null) {
                                                ((j0) obj2).unknownFields = (a2) objA;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (v0 unused3) {
                                    o1Var = o1Var2;
                                    b2Var.getClass();
                                    if (objA == null) {
                                        objA = b2.a(obj2);
                                    }
                                    if (!b2.b(objA, qVar2)) {
                                        while (i10 < i7) {
                                            o1Var.m(iArr[i10], obj2, objA);
                                            i10++;
                                        }
                                        if (objA != null) {
                                            ((j0) obj2).unknownFields = (a2) objA;
                                            return;
                                        }
                                        return;
                                    }
                                    obj3 = obj2;
                                    o1Var2 = o1Var;
                                    qVar3 = qVar2;
                                    yVar2 = yVar;
                                    break;
                                }
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.i(c1Var.c(iW & 1048575, obj2));
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_TEL /* 29 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.v(c1Var.c(iW & 1048575, obj2));
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 30:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                b2 b2Var2 = b2Var;
                                List listC = c1Var.c(iW & 1048575, obj2);
                                qVar2.k(listC);
                                objA = y1.v(obj2, iB, listC, o1Var2.n(iS), objA, b2Var2);
                                b2Var = b2Var2;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.q(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 32:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.r(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.s(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.t(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.j(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.n(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.p(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.w(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.o(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.m(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.l(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.g(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.v(c1Var.c(iW & 1048575, obj2));
                                objA = objA;
                                b2Var = b2Var;
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                try {
                                    List listC2 = c1Var.c(iW & 1048575, obj2);
                                    qVar2.k(listC2);
                                    b2Var = b2Var;
                                    Object obj4 = objA;
                                    try {
                                        objA = y1.v(obj2, iB, listC2, o1Var2.n(iS), obj4, b2Var);
                                        b2Var = b2Var;
                                        o1Var = o1Var2;
                                    } catch (v0 unused4) {
                                        objA = obj4;
                                        b2Var = b2Var;
                                        o1Var = o1Var2;
                                        b2Var.getClass();
                                        if (objA == null) {
                                            objA = b2.a(obj2);
                                        }
                                        if (!b2.b(objA, qVar2)) {
                                            while (i10 < i7) {
                                                o1Var.m(iArr[i10], obj2, objA);
                                                i10++;
                                            }
                                            if (objA != null) {
                                                ((j0) obj2).unknownFields = (a2) objA;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objA = obj4;
                                        b2Var = b2Var;
                                        o1Var = o1Var2;
                                        while (i10 < i7) {
                                            o1Var.m(iArr[i10], obj2, objA);
                                            i10++;
                                        }
                                        if (objA != null) {
                                            b2Var.getClass();
                                            ((j0) obj2).unknownFields = (a2) objA;
                                        }
                                        throw th;
                                    }
                                } catch (v0 unused5) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.q(c1Var.c(iW & 1048575, obj2));
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.r(c1Var.c(iW & 1048575, obj2));
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                qVar2.s(c1Var.c(iW & 1048575, obj2));
                                o1Var = o1Var2;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                                o1Var2 = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                try {
                                    try {
                                        qVar2.t(c1Var.c(iW & 1048575, obj2));
                                        o1Var = o1Var2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        o1Var = o1Var2;
                                        while (i10 < i7) {
                                            o1Var.m(iArr[i10], obj2, objA);
                                            i10++;
                                        }
                                        if (objA != null) {
                                            b2Var.getClass();
                                            ((j0) obj2).unknownFields = (a2) objA;
                                        }
                                        throw th;
                                    }
                                } catch (v0 unused6) {
                                    o1Var = o1Var2;
                                    b2Var.getClass();
                                    if (objA == null) {
                                        objA = b2.a(obj2);
                                    }
                                    if (!b2.b(objA, qVar2)) {
                                        while (i10 < i7) {
                                            o1Var.m(iArr[i10], obj2, objA);
                                            i10++;
                                        }
                                        if (objA != null) {
                                            ((j0) obj2).unknownFields = (a2) objA;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                                try {
                                    q qVar4 = qVar3;
                                    try {
                                        o1Var2.M(obj3, iW & 1048575, qVar4, o1Var2.p(iS), yVar);
                                        o1Var2 = o1Var2;
                                        obj2 = obj3;
                                        qVar2 = qVar4;
                                        o1Var = o1Var2;
                                    } catch (v0 unused7) {
                                        o1Var = o1Var2;
                                        obj2 = obj3;
                                        qVar2 = qVar4;
                                        b2Var.getClass();
                                        if (objA == null) {
                                            objA = b2.a(obj2);
                                        }
                                        if (!b2.b(objA, qVar2)) {
                                            while (i10 < i7) {
                                                o1Var.m(iArr[i10], obj2, objA);
                                                i10++;
                                            }
                                            if (objA != null) {
                                                ((j0) obj2).unknownFields = (a2) objA;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    obj3 = obj2;
                                    o1Var2 = o1Var;
                                    qVar3 = qVar2;
                                    yVar2 = yVar;
                                } catch (Throwable th5) {
                                    th = th5;
                                    o1Var2 = o1Var2;
                                    obj2 = obj3;
                                    o1Var = o1Var2;
                                    while (i10 < i7) {
                                        o1Var.m(iArr[i10], obj2, objA);
                                        i10++;
                                    }
                                    if (objA != null) {
                                        b2Var.getClass();
                                        ((j0) obj2).unknownFields = (a2) objA;
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                o1Var2.x(iS, obj3, o1Var2.o(iS));
                                throw null;
                            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                                qVar3.y(1);
                                j2.p(iW & 1048575, obj3, Double.valueOf(((p) qVar3.f2837e).l()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                                qVar3.y(5);
                                j2.p(iW & 1048575, obj3, Float.valueOf(((p) qVar3.f2837e).p()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Long.valueOf(((p) qVar3.f2837e).r()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 54:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Long.valueOf(((p) qVar3.f2837e).B()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 55:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Integer.valueOf(((p) qVar3.f2837e).q()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 56:
                                qVar3.y(1);
                                j2.p(iW & 1048575, obj3, Long.valueOf(((p) qVar3.f2837e).o()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 57:
                                qVar3.y(5);
                                j2.p(iW & 1048575, obj3, Integer.valueOf(((p) qVar3.f2837e).n()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Boolean.valueOf(((p) qVar3.f2837e).j()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 59:
                                o1Var2.O(obj3, iW, qVar3);
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 60:
                                l1 l1Var3 = (l1) o1Var2.B(iB, iS, obj3);
                                x1 x1VarP3 = o1Var2.p(iS);
                                qVar3.y(2);
                                qVar3.f(l1Var3, x1VarP3, yVar2);
                                o1Var2.U(iB, iS, obj3, l1Var3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 61:
                                j2.p(iW & 1048575, obj3, qVar3.h());
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 62:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Integer.valueOf(((p) qVar3.f2837e).A()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 63:
                                qVar3.y(0);
                                int iM2 = ((p) qVar3.f2837e).m();
                                p0 p0VarN2 = o1Var2.n(iS);
                                if (p0VarN2 == null || p0VarN2.isInRange(iM2)) {
                                    j2.p(iW & 1048575, obj3, Integer.valueOf(iM2));
                                    o1Var2.R(iB, iS, obj3);
                                } else {
                                    objA = y1.z(obj3, iB, iM2, objA, b2Var);
                                }
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                qVar3.y(5);
                                j2.p(iW & 1048575, obj3, Integer.valueOf(((p) qVar3.f2837e).t()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 65:
                                qVar3.y(1);
                                j2.p(iW & 1048575, obj3, Long.valueOf(((p) qVar3.f2837e).u()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 66:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Integer.valueOf(((p) qVar3.f2837e).v()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 67:
                                qVar3.y(0);
                                j2.p(iW & 1048575, obj3, Long.valueOf(((p) qVar3.f2837e).w()));
                                o1Var2.R(iB, iS, obj3);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            case 68:
                                l1 l1Var4 = (l1) o1Var2.B(iB, iS, obj3);
                                x1 x1VarP4 = o1Var2.p(iS);
                                qVar3.y(3);
                                qVar3.e(l1Var4, x1VarP4, yVar2);
                                o1Var2.U(iB, iS, obj3, l1Var4);
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                            default:
                                if (objA == null) {
                                    try {
                                        b2Var.getClass();
                                        objA = b2.a(obj3);
                                    } catch (v0 unused8) {
                                        o1Var = o1Var2;
                                        obj2 = obj3;
                                        qVar2 = qVar3;
                                        b2Var.getClass();
                                        if (objA == null) {
                                            objA = b2.a(obj2);
                                        }
                                        if (!b2.b(objA, qVar2)) {
                                            while (i10 < i7) {
                                                o1Var.m(iArr[i10], obj2, objA);
                                                i10++;
                                            }
                                            if (objA != null) {
                                                ((j0) obj2).unknownFields = (a2) objA;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                b2Var.getClass();
                                if (!b2.b(objA, qVar3)) {
                                    while (i10 < i7) {
                                        o1Var2.m(iArr[i10], obj3, objA);
                                        i10++;
                                    }
                                    if (objA != null) {
                                        ((j0) obj3).unknownFields = (a2) objA;
                                    }
                                }
                                o1Var = o1Var2;
                                obj2 = obj3;
                                qVar2 = qVar3;
                                obj3 = obj2;
                                o1Var2 = o1Var;
                                qVar3 = qVar2;
                                yVar2 = yVar;
                                break;
                        }
                    } catch (v0 unused9) {
                        o1Var = o1Var2;
                        obj2 = obj3;
                        qVar2 = qVar3;
                    }
                } else if (iB == Integer.MAX_VALUE) {
                    while (i10 < i7) {
                        o1Var2.m(iArr[i10], obj3, objA);
                        i10++;
                    }
                    if (objA != null) {
                        b2Var.getClass();
                        ((j0) obj3).unknownFields = (a2) objA;
                    }
                } else {
                    b2Var.getClass();
                    if (objA == null) {
                        objA = b2.a(obj3);
                    }
                    if (!b2.b(objA, qVar3)) {
                        while (i10 < i7) {
                            o1Var2.m(iArr[i10], obj3, objA);
                            i10++;
                        }
                        if (objA != null) {
                            ((j0) obj3).unknownFields = (a2) objA;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                o1Var = o1Var2;
                obj2 = obj3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[SYNTHETIC] */
    @Override // com.google.protobuf.x1
    public final void d(Object obj) {
        if (u(obj)) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                j0Var.clearMemoizedSerializedSize();
                j0Var.clearMemoizedHashCode();
                j0Var.markImmutable();
            }
            int length = this.f2815a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iW = W(i7);
                long j5 = 1048575 & iW;
                int iV = V(iW);
                if (iV != 9) {
                    switch (iV) {
                        case 17:
                            if (t(i7, obj)) {
                                p(i7).d(f2814p.getObject(obj, j5));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                        case 30:
                        case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        case 32:
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                        case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                        case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                        case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                        case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                        case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                        case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                        case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                        case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                            this.f2825l.a(j5, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f2814p;
                            Object object = unsafe.getObject(obj, j5);
                            if (object != null) {
                                this.f2827n.getClass();
                                ((g1) object).f2751a = false;
                                unsafe.putObject(obj, j5, object);
                            }
                            break;
                    }
                } else if (t(i7, obj)) {
                    p(i7).d(f2814p.getObject(obj, j5));
                }
            }
            this.f2826m.getClass();
            ((j0) obj).unknownFields.f2717e = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[SYNTHETIC] */
    @Override // com.google.protobuf.x1
    public final boolean e(Object obj) {
        int iV;
        int i7 = 0;
        int i10 = 1048575;
        int i11 = 0;
        while (true) {
            boolean zT = true;
            if (i7 >= this.f2823i) {
                return true;
            }
            int i12 = this.f2822h[i7];
            int[] iArr = this.f2815a;
            int i13 = iArr[i12];
            int iW = W(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i10) {
                if (i15 != 1048575) {
                    i11 = f2814p.getInt(obj, i15);
                }
                i10 = i15;
            }
            if ((268435456 & iW) == 0) {
                iV = V(iW);
                if (iV != 9 || iV == 17) {
                    if (i10 == 1048575) {
                        zT = t(i12, obj);
                    } else if ((i16 & i11) == 0) {
                        zT = false;
                    }
                    if (zT) {
                        continue;
                    } else if (!p(i12).e(j2.f2774c.k(iW & 1048575, obj))) {
                    }
                    i7++;
                } else {
                    if (iV != 27) {
                        if (iV == 60 || iV == 68) {
                            if (!v(i13, i12, obj)) {
                                continue;
                            } else if (!p(i12).e(j2.f2774c.k(iW & 1048575, obj))) {
                            }
                        } else if (iV != 49) {
                            if (iV != 50) {
                                continue;
                            } else {
                                Object objK = j2.f2774c.k(iW & 1048575, obj);
                                this.f2827n.getClass();
                                if (!((g1) objK).isEmpty()) {
                                    a2.f.N(o(i12));
                                    throw null;
                                }
                            }
                        }
                        i7++;
                    }
                    List list = (List) j2.f2774c.k(iW & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x1 x1VarP = p(i12);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (x1VarP.e(list.get(i17))) {
                            }
                        }
                    }
                    i7++;
                }
            } else {
                if (i10 == 1048575 ? t(i12, obj) : (i11 & i16) != 0) {
                    iV = V(iW);
                    if (iV != 9) {
                    }
                    if (i10 == 1048575) {
                        zT = t(i12, obj);
                    } else if ((i16 & i11) == 0) {
                        zT = false;
                    }
                    if (zT) {
                        continue;
                    } else if (!p(i12).e(j2.f2774c.k(iW & 1048575, obj))) {
                    }
                    i7++;
                }
            }
            return false;
        }
    }

    @Override // com.google.protobuf.x1
    public final void f(Object obj, byte[] bArr, int i7, int i10, f fVar) throws w0 {
        if (this.f2821g) {
            K(obj, bArr, i7, i10, fVar);
        } else {
            J(obj, bArr, i7, i10, 0, fVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0217, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.x1
    public final int g(j0 j0Var) {
        int i7;
        int iB;
        int i10;
        int[] iArr = this.f2815a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iW = W(i12);
            int i13 = iArr[i12];
            long j5 = 1048575 & iW;
            int i14 = 1237;
            int iHashCode = 37;
            switch (V(iW)) {
                case 0:
                    i7 = i11 * 53;
                    iB = u0.b(Double.doubleToLongBits(j2.f2774c.g(j5, j0Var)));
                    i11 = iB + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    iB = Float.floatToIntBits(j2.f2774c.h(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    iB = u0.b(j2.f2774c.j(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    iB = u0.b(j2.f2774c.j(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    iB = u0.b(j2.f2774c.j(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean zD = j2.f2774c.d(j5, j0Var);
                    Charset charset = u0.f2861a;
                    if (zD) {
                        i14 = 1231;
                    }
                    i11 = i14 + i10;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iB = ((String) j2.f2774c.k(j5, j0Var)).hashCode();
                    i11 = iB + i7;
                    break;
                case 9:
                    Object objK = j2.f2774c.k(j5, j0Var);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iB = j2.f2774c.k(j5, j0Var).hashCode();
                    i11 = iB + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    iB = u0.b(j2.f2774c.j(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    iB = j2.f2774c.i(j5, j0Var);
                    i11 = iB + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    iB = u0.b(j2.f2774c.j(j5, j0Var));
                    i11 = iB + i7;
                    break;
                case 17:
                    Object objK2 = j2.f2774c.k(j5, j0Var);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                case 30:
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                case 32:
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    i7 = i11 * 53;
                    iB = j2.f2774c.k(j5, j0Var).hashCode();
                    i11 = iB + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iB = j2.f2774c.k(j5, j0Var).hashCode();
                    i11 = iB + i7;
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(Double.doubleToLongBits(((Double) j2.f2774c.k(j5, j0Var)).doubleValue()));
                        i11 = iB + i7;
                    }
                    break;
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = Float.floatToIntBits(((Float) j2.f2774c.k(j5, j0Var)).floatValue());
                        i11 = iB + i7;
                    }
                    break;
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(G(j5, j0Var));
                        i11 = iB + i7;
                    }
                    break;
                case 54:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(G(j5, j0Var));
                        i11 = iB + i7;
                    }
                    break;
                case 55:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case 56:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(G(j5, j0Var));
                        i11 = iB + i7;
                    }
                    break;
                case 57:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    if (v(i13, i12, j0Var)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) j2.f2774c.k(j5, j0Var)).booleanValue();
                        Charset charset2 = u0.f2861a;
                        if (zBooleanValue) {
                            i14 = 1231;
                        }
                        i11 = i14 + i10;
                    }
                    break;
                case 59:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = ((String) j2.f2774c.k(j5, j0Var)).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 60:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = j2.f2774c.k(j5, j0Var).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 61:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = j2.f2774c.k(j5, j0Var).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 62:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case 63:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case 65:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(G(j5, j0Var));
                        i11 = iB + i7;
                    }
                    break;
                case 66:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = F(j5, j0Var);
                        i11 = iB + i7;
                    }
                    break;
                case 67:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = u0.b(G(j5, j0Var));
                        i11 = iB + i7;
                    }
                    break;
                case 68:
                    if (v(i13, i12, j0Var)) {
                        i7 = i11 * 53;
                        iB = j2.f2774c.k(j5, j0Var).hashCode();
                        i11 = iB + i7;
                    }
                    break;
            }
        }
        this.f2826m.getClass();
        return j0Var.unknownFields.hashCode() + (i11 * 53);
    }

    @Override // com.google.protobuf.x1
    public final int h(j0 j0Var) {
        return this.f2821g ? s(j0Var) : r(j0Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.x1
    public final boolean i(j0 j0Var, j0 j0Var2) {
        int[] iArr = this.f2815a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zY = true;
            if (i7 < length) {
                int iW = W(i7);
                long j5 = iW & 1048575;
                switch (V(iW)) {
                    case 0:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var = j2.f2774c;
                            if (Double.doubleToLongBits(i2Var.g(j5, j0Var)) != Double.doubleToLongBits(i2Var.g(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var2 = j2.f2774c;
                            if (Float.floatToIntBits(i2Var2.h(j5, j0Var)) != Float.floatToIntBits(i2Var2.h(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var3 = j2.f2774c;
                            if (i2Var3.j(j5, j0Var) != i2Var3.j(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 3:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var4 = j2.f2774c;
                            if (i2Var4.j(j5, j0Var) != i2Var4.j(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 4:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var5 = j2.f2774c;
                            if (i2Var5.i(j5, j0Var) != i2Var5.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 5:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var6 = j2.f2774c;
                            if (i2Var6.j(j5, j0Var) != i2Var6.j(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 6:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var7 = j2.f2774c;
                            if (i2Var7.i(j5, j0Var) != i2Var7.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 7:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var8 = j2.f2774c;
                            if (i2Var8.d(j5, j0Var) != i2Var8.d(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var9 = j2.f2774c;
                            if (!y1.y(i2Var9.k(j5, j0Var), i2Var9.k(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 9:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var10 = j2.f2774c;
                            if (!y1.y(i2Var10.k(j5, j0Var), i2Var10.k(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 10:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var11 = j2.f2774c;
                            if (!y1.y(i2Var11.k(j5, j0Var), i2Var11.k(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 11:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var12 = j2.f2774c;
                            if (i2Var12.i(j5, j0Var) != i2Var12.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 12:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var13 = j2.f2774c;
                            if (i2Var13.i(j5, j0Var) != i2Var13.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 13:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var14 = j2.f2774c;
                            if (i2Var14.i(j5, j0Var) != i2Var14.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 14:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var15 = j2.f2774c;
                            if (i2Var15.j(j5, j0Var) != i2Var15.j(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 15:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var16 = j2.f2774c;
                            if (i2Var16.i(j5, j0Var) != i2Var16.i(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 16:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var17 = j2.f2774c;
                            if (i2Var17.j(j5, j0Var) != i2Var17.j(j5, j0Var2)) {
                                zY = false;
                            }
                        }
                        break;
                    case 17:
                        if (!k(j0Var, j0Var2, i7)) {
                            zY = false;
                        } else {
                            i2 i2Var18 = j2.f2774c;
                            if (!y1.y(i2Var18.k(j5, j0Var), i2Var18.k(j5, j0Var2))) {
                                zY = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    case ServiceTypes.KEYCODE_TEL /* 29 */:
                    case 30:
                    case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                    case 32:
                    case ServiceTypes.KEYCODE_VR_START /* 33 */:
                    case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                    case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                    case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                    case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                    case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                    case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                    case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                    case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                    case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                    case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                    case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                    case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                    case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                    case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                    case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                        i2 i2Var19 = j2.f2774c;
                        zY = y1.y(i2Var19.k(j5, j0Var), i2Var19.k(j5, j0Var2));
                        break;
                    case 50:
                        i2 i2Var20 = j2.f2774c;
                        zY = y1.y(i2Var20.k(j5, j0Var), i2Var20.k(j5, j0Var2));
                        break;
                    case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i7 + 2] & 1048575;
                        i2 i2Var21 = j2.f2774c;
                        if (i2Var21.i(j10, j0Var) != i2Var21.i(j10, j0Var2) || !y1.y(i2Var21.k(j5, j0Var), i2Var21.k(j5, j0Var2))) {
                            zY = false;
                        }
                        break;
                }
                if (zY) {
                    i7 += 3;
                }
            } else {
                this.f2826m.getClass();
                if (j0Var.unknownFields.equals(j0Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.x1
    public final Object j() {
        this.k.getClass();
        return ((j0) this.f2819e).newMutableInstance();
    }

    public final boolean k(j0 j0Var, j0 j0Var2, int i7) {
        return t(i7, j0Var) == t(i7, j0Var2);
    }

    public final void m(int i7, Object obj, Object obj2) {
        int i10 = this.f2815a[i7];
        Object objK = j2.f2774c.k(W(i7) & 1048575, obj);
        if (objK == null || n(i7) == null) {
            return;
        }
        this.f2827n.getClass();
        a2.f.N(o(i7));
        throw null;
    }

    public final p0 n(int i7) {
        return (p0) this.f2816b[((i7 / 3) * 2) + 1];
    }

    public final Object o(int i7) {
        return this.f2816b[(i7 / 3) * 2];
    }

    public final x1 p(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f2816b;
        x1 x1Var = (x1) objArr[i10];
        if (x1Var != null) {
            return x1Var;
        }
        x1 x1VarA = u1.f2863c.a((Class) objArr[i10 + 1]);
        objArr[i10] = x1VarA;
        return x1VarA;
    }

    public final int r(j0 j0Var) {
        int i7;
        int iC0;
        int iF0;
        int iC1;
        int iA0;
        int iY;
        int iC2;
        int iB0;
        int iB;
        int iZ;
        Unsafe unsafe = f2814p;
        int i10 = 1048575;
        int i11 = 0;
        int iA = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f2815a;
            if (i11 >= iArr.length) {
                this.f2826m.getClass();
                return j0Var.unknownFields.c() + iA;
            }
            int iW = W(i11);
            int i14 = iArr[i11];
            int iV = V(iW);
            if (iV <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i10;
                i7 = 1 << (i15 >>> 20);
                if (i16 != i12) {
                    i13 = unsafe.getInt(j0Var, i16);
                    i12 = i16;
                }
            } else {
                i7 = 0;
            }
            long j5 = iW & i10;
            switch (iV) {
                case 0:
                    if ((i13 & i7) != 0) {
                        iA = a2.f.A(i14, 8, iA);
                    }
                    break;
                case 1:
                    if ((i13 & i7) != 0) {
                        iA = a2.f.A(i14, 4, iA);
                    }
                    break;
                case 2:
                    if ((i7 & i13) != 0) {
                        long j10 = unsafe.getLong(j0Var, j5);
                        iC0 = u.c0(i14);
                        iF0 = u.f0(j10);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 3:
                    if ((i7 & i13) != 0) {
                        long j11 = unsafe.getLong(j0Var, j5);
                        iC0 = u.c0(i14);
                        iF0 = u.f0(j11);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 4:
                    if ((i7 & i13) != 0) {
                        int i17 = unsafe.getInt(j0Var, j5);
                        iC1 = u.c0(i14);
                        iA0 = u.a0(i17);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 5:
                    if ((i13 & i7) != 0) {
                        iY = u.Y(i14);
                        iA += iY;
                    }
                    break;
                case 6:
                    if ((i13 & i7) != 0) {
                        iY = u.X(i14);
                        iA += iY;
                    }
                    break;
                case 7:
                    if ((i13 & i7) != 0) {
                        iA = a2.f.A(i14, 1, iA);
                    }
                    break;
                case 8:
                    if ((i7 & i13) != 0) {
                        Object object = unsafe.getObject(j0Var, j5);
                        if (object instanceof l) {
                            int iC3 = u.c0(i14);
                            int size = ((l) object).size();
                            iB = a2.f.B(size, size, iC3, iA);
                        } else {
                            iC2 = u.c0(i14);
                            iB0 = u.b0((String) object);
                            iB = iB0 + iC2 + iA;
                        }
                        iA = iB;
                    }
                    break;
                case 9:
                    if ((i7 & i13) != 0) {
                        Object object2 = unsafe.getObject(j0Var, j5);
                        x1 x1VarP = p(i11);
                        Class cls = y1.f2891a;
                        int iC4 = u.c0(i14);
                        int serializedSize = ((c) ((l1) object2)).getSerializedSize(x1VarP);
                        iA = a2.f.B(serializedSize, serializedSize, iC4, iA);
                    }
                    break;
                case 10:
                    if ((i7 & i13) != 0) {
                        iY = u.V(i14, (l) unsafe.getObject(j0Var, j5));
                        iA += iY;
                    }
                    break;
                case 11:
                    if ((i7 & i13) != 0) {
                        iY = u.d0(i14, unsafe.getInt(j0Var, j5));
                        iA += iY;
                    }
                    break;
                case 12:
                    if ((i7 & i13) != 0) {
                        int i18 = unsafe.getInt(j0Var, j5);
                        iC1 = u.c0(i14);
                        iA0 = u.a0(i18);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 13:
                    if ((i13 & i7) != 0) {
                        iA = a2.f.A(i14, 4, iA);
                    }
                    break;
                case 14:
                    if ((i13 & i7) != 0) {
                        iA = a2.f.A(i14, 8, iA);
                    }
                    break;
                case 15:
                    if ((i7 & i13) != 0) {
                        int i19 = unsafe.getInt(j0Var, j5);
                        iC1 = u.c0(i14);
                        iA0 = u.e0((i19 >> 31) ^ (i19 << 1));
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 16:
                    if ((i7 & i13) != 0) {
                        long j12 = unsafe.getLong(j0Var, j5);
                        iC0 = u.c0(i14);
                        iF0 = u.f0((j12 >> 63) ^ (j12 << 1));
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 17:
                    if ((i7 & i13) != 0) {
                        iY = u.Z(i14, (l1) unsafe.getObject(j0Var, j5), p(i11));
                        iA += iY;
                    }
                    break;
                case 18:
                    iY = y1.f(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 19:
                    iY = y1.d(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 20:
                    iY = y1.j(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 21:
                    iY = y1.t(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 22:
                    iY = y1.h(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 23:
                    iY = y1.f(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 24:
                    iY = y1.d(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(j0Var, j5);
                    Class cls2 = y1.f2891a;
                    int size2 = list.size();
                    iA += size2 == 0 ? 0 : (u.c0(i14) + 1) * size2;
                    break;
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    iY = y1.q(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    iY = y1.l(i14, (List) unsafe.getObject(j0Var, j5), p(i11));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    iY = y1.a(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                    iY = y1.r(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 30:
                    iY = y1.b(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                    iY = y1.d(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case 32:
                    iY = y1.f(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                    iY = y1.m(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                    iY = y1.o(i14, (List) unsafe.getObject(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                    int iG = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG > 0) {
                        iA = a2.f.B(iG, u.c0(i14), iG, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                    int iE = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE > 0) {
                        iA = a2.f.B(iE, u.c0(i14), iE, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                    int iK = y1.k((List) unsafe.getObject(j0Var, j5));
                    if (iK > 0) {
                        iA = a2.f.B(iK, u.c0(i14), iK, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                    int iU = y1.u((List) unsafe.getObject(j0Var, j5));
                    if (iU > 0) {
                        iA = a2.f.B(iU, u.c0(i14), iU, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                    int i20 = y1.i((List) unsafe.getObject(j0Var, j5));
                    if (i20 > 0) {
                        iA = a2.f.B(i20, u.c0(i14), i20, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                    int iG2 = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG2 > 0) {
                        iA = a2.f.B(iG2, u.c0(i14), iG2, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                    int iE2 = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE2 > 0) {
                        iA = a2.f.B(iE2, u.c0(i14), iE2, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                    List list2 = (List) unsafe.getObject(j0Var, j5);
                    Class cls3 = y1.f2891a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iA = a2.f.B(size3, u.c0(i14), size3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                    int iS = y1.s((List) unsafe.getObject(j0Var, j5));
                    if (iS > 0) {
                        iA = a2.f.B(iS, u.c0(i14), iS, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                    int iC = y1.c((List) unsafe.getObject(j0Var, j5));
                    if (iC > 0) {
                        iA = a2.f.B(iC, u.c0(i14), iC, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                    int iE3 = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE3 > 0) {
                        iA = a2.f.B(iE3, u.c0(i14), iE3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                    int iG3 = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG3 > 0) {
                        iA = a2.f.B(iG3, u.c0(i14), iG3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                    int iN = y1.n((List) unsafe.getObject(j0Var, j5));
                    if (iN > 0) {
                        iA = a2.f.B(iN, u.c0(i14), iN, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    int iP = y1.p((List) unsafe.getObject(j0Var, j5));
                    if (iP > 0) {
                        iA = a2.f.B(iP, u.c0(i14), iP, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    List list3 = (List) unsafe.getObject(j0Var, j5);
                    x1 x1VarP2 = p(i11);
                    Class cls4 = y1.f2891a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iZ = 0;
                    } else {
                        iZ = 0;
                        for (int i21 = 0; i21 < size4; i21++) {
                            iZ += u.Z(i14, (l1) list3.get(i21), x1VarP2);
                        }
                    }
                    iA += iZ;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(j0Var, j5);
                    Object objO = o(i11);
                    this.f2827n.getClass();
                    h1.a(object3, objO);
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    if (v(i14, i11, j0Var)) {
                        iA = a2.f.A(i14, 8, iA);
                    }
                    break;
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    if (v(i14, i11, j0Var)) {
                        iA = a2.f.A(i14, 4, iA);
                    }
                    break;
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    if (v(i14, i11, j0Var)) {
                        long jG = G(j5, j0Var);
                        iC0 = u.c0(i14);
                        iF0 = u.f0(jG);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 54:
                    if (v(i14, i11, j0Var)) {
                        long jG2 = G(j5, j0Var);
                        iC0 = u.c0(i14);
                        iF0 = u.f0(jG2);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 55:
                    if (v(i14, i11, j0Var)) {
                        int iF = F(j5, j0Var);
                        iC1 = u.c0(i14);
                        iA0 = u.a0(iF);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 56:
                    if (v(i14, i11, j0Var)) {
                        iY = u.Y(i14);
                        iA += iY;
                    }
                    break;
                case 57:
                    if (v(i14, i11, j0Var)) {
                        iY = u.X(i14);
                        iA += iY;
                    }
                    break;
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    if (v(i14, i11, j0Var)) {
                        iA = a2.f.A(i14, 1, iA);
                    }
                    break;
                case 59:
                    if (v(i14, i11, j0Var)) {
                        Object object4 = unsafe.getObject(j0Var, j5);
                        if (object4 instanceof l) {
                            int iC5 = u.c0(i14);
                            int size5 = ((l) object4).size();
                            iB = a2.f.B(size5, size5, iC5, iA);
                        } else {
                            iC2 = u.c0(i14);
                            iB0 = u.b0((String) object4);
                            iB = iB0 + iC2 + iA;
                        }
                        iA = iB;
                    }
                    break;
                case 60:
                    if (v(i14, i11, j0Var)) {
                        Object object5 = unsafe.getObject(j0Var, j5);
                        x1 x1VarP3 = p(i11);
                        Class cls5 = y1.f2891a;
                        int iC6 = u.c0(i14);
                        int serializedSize2 = ((c) ((l1) object5)).getSerializedSize(x1VarP3);
                        iA = a2.f.B(serializedSize2, serializedSize2, iC6, iA);
                    }
                    break;
                case 61:
                    if (v(i14, i11, j0Var)) {
                        iY = u.V(i14, (l) unsafe.getObject(j0Var, j5));
                        iA += iY;
                    }
                    break;
                case 62:
                    if (v(i14, i11, j0Var)) {
                        iY = u.d0(i14, F(j5, j0Var));
                        iA += iY;
                    }
                    break;
                case 63:
                    if (v(i14, i11, j0Var)) {
                        int iF2 = F(j5, j0Var);
                        iC1 = u.c0(i14);
                        iA0 = u.a0(iF2);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    if (v(i14, i11, j0Var)) {
                        iA = a2.f.A(i14, 4, iA);
                    }
                    break;
                case 65:
                    if (v(i14, i11, j0Var)) {
                        iA = a2.f.A(i14, 8, iA);
                    }
                    break;
                case 66:
                    if (v(i14, i11, j0Var)) {
                        int iF3 = F(j5, j0Var);
                        iC1 = u.c0(i14);
                        iA0 = u.e0((iF3 >> 31) ^ (iF3 << 1));
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 67:
                    if (v(i14, i11, j0Var)) {
                        long jG3 = G(j5, j0Var);
                        iC0 = u.c0(i14);
                        iF0 = u.f0((jG3 >> 63) ^ (jG3 << 1));
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 68:
                    if (v(i14, i11, j0Var)) {
                        iY = u.Z(i14, (l1) unsafe.getObject(j0Var, j5), p(i11));
                        iA += iY;
                    }
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
    }

    public final int s(j0 j0Var) {
        int iC0;
        int iF0;
        int iC1;
        int iA0;
        int iY;
        int iC2;
        int iB0;
        int iC3;
        int iF1;
        int iZ;
        Unsafe unsafe = f2814p;
        int i7 = 0;
        int iA = 0;
        while (true) {
            int[] iArr = this.f2815a;
            if (i7 >= iArr.length) {
                this.f2826m.getClass();
                return j0Var.unknownFields.c() + iA;
            }
            int iW = W(i7);
            int iV = V(iW);
            int i10 = iArr[i7];
            long j5 = iW & 1048575;
            if (iV >= b0.f2718b.f2722a && iV <= b0.f2719c.f2722a) {
                int i11 = iArr[i7 + 2];
            }
            switch (iV) {
                case 0:
                    if (t(i7, j0Var)) {
                        iA = a2.f.A(i10, 8, iA);
                    }
                    break;
                case 1:
                    if (t(i7, j0Var)) {
                        iA = a2.f.A(i10, 4, iA);
                    }
                    break;
                case 2:
                    if (t(i7, j0Var)) {
                        long j10 = j2.f2774c.j(j5, j0Var);
                        iC0 = u.c0(i10);
                        iF0 = u.f0(j10);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 3:
                    if (t(i7, j0Var)) {
                        long j11 = j2.f2774c.j(j5, j0Var);
                        iC0 = u.c0(i10);
                        iF0 = u.f0(j11);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 4:
                    if (t(i7, j0Var)) {
                        int i12 = j2.f2774c.i(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.a0(i12);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 5:
                    if (t(i7, j0Var)) {
                        iY = u.Y(i10);
                        iA += iY;
                    }
                    break;
                case 6:
                    if (t(i7, j0Var)) {
                        iY = u.X(i10);
                        iA += iY;
                    }
                    break;
                case 7:
                    if (t(i7, j0Var)) {
                        iA = a2.f.A(i10, 1, iA);
                    }
                    break;
                case 8:
                    if (t(i7, j0Var)) {
                        Object objK = j2.f2774c.k(j5, j0Var);
                        if (objK instanceof l) {
                            int iC4 = u.c0(i10);
                            int size = ((l) objK).size();
                            iA = a2.f.B(size, size, iC4, iA);
                        } else {
                            iC2 = u.c0(i10);
                            iB0 = u.b0((String) objK);
                            iA = iB0 + iC2 + iA;
                        }
                    }
                    break;
                case 9:
                    if (t(i7, j0Var)) {
                        Object objK2 = j2.f2774c.k(j5, j0Var);
                        x1 x1VarP = p(i7);
                        Class cls = y1.f2891a;
                        int iC5 = u.c0(i10);
                        int serializedSize = ((c) ((l1) objK2)).getSerializedSize(x1VarP);
                        iA = a2.f.B(serializedSize, serializedSize, iC5, iA);
                    }
                    break;
                case 10:
                    if (t(i7, j0Var)) {
                        iY = u.V(i10, (l) j2.f2774c.k(j5, j0Var));
                        iA += iY;
                    }
                    break;
                case 11:
                    if (t(i7, j0Var)) {
                        iY = u.d0(i10, j2.f2774c.i(j5, j0Var));
                        iA += iY;
                    }
                    break;
                case 12:
                    if (t(i7, j0Var)) {
                        int i13 = j2.f2774c.i(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.a0(i13);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 13:
                    if (t(i7, j0Var)) {
                        iA = a2.f.A(i10, 4, iA);
                    }
                    break;
                case 14:
                    if (t(i7, j0Var)) {
                        iA = a2.f.A(i10, 8, iA);
                    }
                    break;
                case 15:
                    if (t(i7, j0Var)) {
                        int i14 = j2.f2774c.i(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.e0((i14 >> 31) ^ (i14 << 1));
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 16:
                    if (t(i7, j0Var)) {
                        long j12 = j2.f2774c.j(j5, j0Var);
                        iC3 = u.c0(i10);
                        iF1 = u.f0((j12 >> 63) ^ (j12 << 1));
                        iY = iF1 + iC3;
                        iA += iY;
                    }
                    break;
                case 17:
                    if (t(i7, j0Var)) {
                        iY = u.Z(i10, (l1) j2.f2774c.k(j5, j0Var), p(i7));
                        iA += iY;
                    }
                    break;
                case 18:
                    iY = y1.f(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 19:
                    iY = y1.d(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 20:
                    iY = y1.j(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 21:
                    iY = y1.t(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 22:
                    iY = y1.h(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 23:
                    iY = y1.f(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 24:
                    iY = y1.d(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 25:
                    List listW = w(j0Var, j5);
                    Class cls2 = y1.f2891a;
                    int size2 = listW.size();
                    iA += size2 == 0 ? 0 : (u.c0(i10) + 1) * size2;
                    break;
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    iY = y1.q(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                    iY = y1.l(i10, w(j0Var, j5), p(i7));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    iY = y1.a(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_TEL /* 29 */:
                    iY = y1.r(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 30:
                    iY = y1.b(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                    iY = y1.d(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case 32:
                    iY = y1.f(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_VR_START /* 33 */:
                    iY = y1.m(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                    iY = y1.o(i10, w(j0Var, j5));
                    iA += iY;
                    break;
                case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                    int iG = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG > 0) {
                        iA = a2.f.B(iG, u.c0(i10), iG, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                    int iE = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE > 0) {
                        iA = a2.f.B(iE, u.c0(i10), iE, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                    int iK = y1.k((List) unsafe.getObject(j0Var, j5));
                    if (iK > 0) {
                        iA = a2.f.B(iK, u.c0(i10), iK, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                    int iU = y1.u((List) unsafe.getObject(j0Var, j5));
                    if (iU > 0) {
                        iA = a2.f.B(iU, u.c0(i10), iU, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                    int i15 = y1.i((List) unsafe.getObject(j0Var, j5));
                    if (i15 > 0) {
                        iA = a2.f.B(i15, u.c0(i10), i15, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                    int iG2 = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG2 > 0) {
                        iA = a2.f.B(iG2, u.c0(i10), iG2, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                    int iE2 = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE2 > 0) {
                        iA = a2.f.B(iE2, u.c0(i10), iE2, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                    List list = (List) unsafe.getObject(j0Var, j5);
                    Class cls3 = y1.f2891a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iA = a2.f.B(size3, u.c0(i10), size3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                    int iS = y1.s((List) unsafe.getObject(j0Var, j5));
                    if (iS > 0) {
                        iA = a2.f.B(iS, u.c0(i10), iS, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                    int iC = y1.c((List) unsafe.getObject(j0Var, j5));
                    if (iC > 0) {
                        iA = a2.f.B(iC, u.c0(i10), iC, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                    int iE3 = y1.e((List) unsafe.getObject(j0Var, j5));
                    if (iE3 > 0) {
                        iA = a2.f.B(iE3, u.c0(i10), iE3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                    int iG3 = y1.g((List) unsafe.getObject(j0Var, j5));
                    if (iG3 > 0) {
                        iA = a2.f.B(iG3, u.c0(i10), iG3, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                    int iN = y1.n((List) unsafe.getObject(j0Var, j5));
                    if (iN > 0) {
                        iA = a2.f.B(iN, u.c0(i10), iN, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    int iP = y1.p((List) unsafe.getObject(j0Var, j5));
                    if (iP > 0) {
                        iA = a2.f.B(iP, u.c0(i10), iP, iA);
                    }
                    break;
                case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    List listW2 = w(j0Var, j5);
                    x1 x1VarP2 = p(i7);
                    Class cls4 = y1.f2891a;
                    int size4 = listW2.size();
                    if (size4 == 0) {
                        iZ = 0;
                    } else {
                        iZ = 0;
                        for (int i16 = 0; i16 < size4; i16++) {
                            iZ += u.Z(i10, (l1) listW2.get(i16), x1VarP2);
                        }
                    }
                    iA += iZ;
                    break;
                case 50:
                    Object objK3 = j2.f2774c.k(j5, j0Var);
                    Object objO = o(i7);
                    this.f2827n.getClass();
                    h1.a(objK3, objO);
                    break;
                case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                    if (v(i10, i7, j0Var)) {
                        iA = a2.f.A(i10, 8, iA);
                    }
                    break;
                case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                    if (v(i10, i7, j0Var)) {
                        iA = a2.f.A(i10, 4, iA);
                    }
                    break;
                case UsbAccessoryStarter.AOA_START_ACCESSORY /* 53 */:
                    if (v(i10, i7, j0Var)) {
                        long jG = G(j5, j0Var);
                        iC0 = u.c0(i10);
                        iF0 = u.f0(jG);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 54:
                    if (v(i10, i7, j0Var)) {
                        long jG2 = G(j5, j0Var);
                        iC0 = u.c0(i10);
                        iF0 = u.f0(jG2);
                        iY = iF0 + iC0;
                        iA += iY;
                    }
                    break;
                case 55:
                    if (v(i10, i7, j0Var)) {
                        int iF = F(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.a0(iF);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 56:
                    if (v(i10, i7, j0Var)) {
                        iY = u.Y(i10);
                        iA += iY;
                    }
                    break;
                case 57:
                    if (v(i10, i7, j0Var)) {
                        iY = u.X(i10);
                        iA += iY;
                    }
                    break;
                case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                    if (v(i10, i7, j0Var)) {
                        iA = a2.f.A(i10, 1, iA);
                    }
                    break;
                case 59:
                    if (v(i10, i7, j0Var)) {
                        Object objK4 = j2.f2774c.k(j5, j0Var);
                        if (objK4 instanceof l) {
                            int iC6 = u.c0(i10);
                            int size5 = ((l) objK4).size();
                            iA = a2.f.B(size5, size5, iC6, iA);
                        } else {
                            iC2 = u.c0(i10);
                            iB0 = u.b0((String) objK4);
                            iA = iB0 + iC2 + iA;
                        }
                    }
                    break;
                case 60:
                    if (v(i10, i7, j0Var)) {
                        Object objK5 = j2.f2774c.k(j5, j0Var);
                        x1 x1VarP3 = p(i7);
                        Class cls5 = y1.f2891a;
                        int iC7 = u.c0(i10);
                        int serializedSize2 = ((c) ((l1) objK5)).getSerializedSize(x1VarP3);
                        iA = a2.f.B(serializedSize2, serializedSize2, iC7, iA);
                    }
                    break;
                case 61:
                    if (v(i10, i7, j0Var)) {
                        iY = u.V(i10, (l) j2.f2774c.k(j5, j0Var));
                        iA += iY;
                    }
                    break;
                case 62:
                    if (v(i10, i7, j0Var)) {
                        iY = u.d0(i10, F(j5, j0Var));
                        iA += iY;
                    }
                    break;
                case 63:
                    if (v(i10, i7, j0Var)) {
                        int iF2 = F(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.a0(iF2);
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                    if (v(i10, i7, j0Var)) {
                        iA = a2.f.A(i10, 4, iA);
                    }
                    break;
                case 65:
                    if (v(i10, i7, j0Var)) {
                        iA = a2.f.A(i10, 8, iA);
                    }
                    break;
                case 66:
                    if (v(i10, i7, j0Var)) {
                        int iF3 = F(j5, j0Var);
                        iC1 = u.c0(i10);
                        iA0 = u.e0((iF3 >> 31) ^ (iF3 << 1));
                        iY = iA0 + iC1;
                        iA += iY;
                    }
                    break;
                case 67:
                    if (v(i10, i7, j0Var)) {
                        long jG3 = G(j5, j0Var);
                        iC3 = u.c0(i10);
                        iF1 = u.f0((jG3 >> 63) ^ (jG3 << 1));
                        iY = iF1 + iC3;
                        iA += iY;
                    }
                    break;
                case 68:
                    if (v(i10, i7, j0Var)) {
                        iY = u.Z(i10, (l1) j2.f2774c.k(j5, j0Var), p(i7));
                        iA += iY;
                    }
                    break;
            }
            i7 += 3;
        }
    }

    public final boolean t(int i7, Object obj) {
        int i10 = this.f2815a[i7 + 2];
        long j5 = i10 & 1048575;
        if (j5 == 1048575) {
            int iW = W(i7);
            long j10 = iW & 1048575;
            switch (V(iW)) {
                case 0:
                    if (Double.doubleToRawLongBits(j2.f2774c.g(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j2.f2774c.h(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j2.f2774c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j2.f2774c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j2.f2774c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j2.f2774c.d(j10, obj);
                case 8:
                    Object objK = j2.f2774c.k(j10, obj);
                    if (objK instanceof String) {
                        return !((String) objK).isEmpty();
                    }
                    if (objK instanceof l) {
                        return !l.f2785b.equals(objK);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j2.f2774c.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !l.f2785b.equals(j2.f2774c.k(j10, obj));
                case 11:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j2.f2774c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j2.f2774c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j2.f2774c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j2.f2774c.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & j2.f2774c.i(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(int i7, int i10, Object obj) {
        return j2.f2774c.i((long) (this.f2815a[i10 + 2] & 1048575), obj) == i7;
    }

    public final void x(int i7, Object obj, Object obj2) {
        long jW = W(i7) & 1048575;
        Object objK = j2.f2774c.k(jW, obj);
        h1 h1Var = this.f2827n;
        if (objK != null) {
            h1Var.getClass();
            if (!((g1) objK).f2751a) {
                g1 g1VarC = g1.f2750b.c();
                h1.b(g1VarC, objK);
                j2.p(jW, obj, g1VarC);
                objK = g1VarC;
            }
        } else {
            h1Var.getClass();
            objK = g1.f2750b.c();
            j2.p(jW, obj, objK);
        }
        h1Var.getClass();
        a2.f.N(obj2);
        throw null;
    }

    public final void y(int i7, Object obj, Object obj2) {
        if (t(i7, obj2)) {
            long jW = W(i7) & 1048575;
            Unsafe unsafe = f2814p;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2815a[i7] + " is present but null: " + obj2);
            }
            x1 x1VarP = p(i7);
            if (!t(i7, obj)) {
                if (u(object)) {
                    Object objJ = x1VarP.j();
                    x1VarP.b(objJ, object);
                    unsafe.putObject(obj, jW, objJ);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                Q(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!u(object2)) {
                Object objJ2 = x1VarP.j();
                x1VarP.b(objJ2, object2);
                unsafe.putObject(obj, jW, objJ2);
                object2 = objJ2;
            }
            x1VarP.b(object2, object);
        }
    }

    public final void z(int i7, Object obj, Object obj2) {
        int[] iArr = this.f2815a;
        int i10 = iArr[i7];
        if (v(i10, i7, obj2)) {
            long jW = W(i7) & 1048575;
            Unsafe unsafe = f2814p;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            x1 x1VarP = p(i7);
            if (!v(i10, i7, obj)) {
                if (u(object)) {
                    Object objJ = x1VarP.j();
                    x1VarP.b(objJ, object);
                    unsafe.putObject(obj, jW, objJ);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                R(i10, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!u(object2)) {
                Object objJ2 = x1VarP.j();
                x1VarP.b(objJ2, object2);
                unsafe.putObject(obj, jW, objJ2);
                object2 = objJ2;
            }
            x1VarP.b(object2, object);
        }
    }
}
