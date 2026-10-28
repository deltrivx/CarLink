package bb;

import aa.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static b a(List list, x9.y yVar, u9.k kVar) {
        List listJ0 = u8.p.J0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            g gVarB = b(null, it.next());
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return yVar != null ? new x(arrayList, yVar.k().r(kVar)) : new b(arrayList, new aa.a(3, kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [u8.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(h0 h0Var, Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new w((String) obj);
        }
        boolean z10 = obj instanceof byte[];
        ?? I = u8.w.f13122a;
        int i7 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    I = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i7 < length2) {
                        I.add(Byte.valueOf(bArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Byte.valueOf(bArr[0]));
                }
            }
            return a(I, h0Var, u9.k.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    I = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i7 < length4) {
                        I.add(Short.valueOf(sArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Short.valueOf(sArr[0]));
                }
            }
            return a(I, h0Var, u9.k.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    I = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i7 < length6) {
                        I.add(Integer.valueOf(iArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Integer.valueOf(iArr[0]));
                }
            }
            return a(I, h0Var, u9.k.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    I = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i7 < length8) {
                        I.add(Long.valueOf(jArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Long.valueOf(jArr[0]));
                }
            }
            return a(I, h0Var, u9.k.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    I = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i7 < length10) {
                        I.add(Character.valueOf(cArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Character.valueOf(cArr[0]));
                }
            }
            return a(I, h0Var, u9.k.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    I = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i7 < length12) {
                        I.add(Float.valueOf(fArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Float.valueOf(fArr[0]));
                }
            }
            return a(I, h0Var, u9.k.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    I = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i7 < length14) {
                        I.add(Double.valueOf(dArr[i7]));
                        i7++;
                    }
                } else {
                    I = n3.l.I(Double.valueOf(dArr[0]));
                }
            }
            return a(I, h0Var, u9.k.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new u(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length15 = zArr.length;
        if (length15 != 0) {
            if (length15 != 1) {
                I = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i7 < length16) {
                    I.add(Boolean.valueOf(zArr[i7]));
                    i7++;
                }
            } else {
                I = n3.l.I(Boolean.valueOf(zArr[0]));
            }
        }
        return a(I, h0Var, u9.k.BOOLEAN);
    }
}
