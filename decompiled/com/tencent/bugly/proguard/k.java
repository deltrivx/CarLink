package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f3438a = "GBK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f3439b;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f3440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3441b;
    }

    public k() {
    }

    public k(byte[] bArr) {
        this.f3439b = ByteBuffer.wrap(bArr);
    }

    public k(byte[] bArr, byte b10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f3439b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    private double a(double d10, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return d10;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 4) {
            return this.f3439b.getFloat();
        }
        if (b10 == 5) {
            return this.f3439b.getDouble();
        }
        if (b10 == 12) {
            return 0.0d;
        }
        throw new h("type mismatch.");
    }

    private float a(float f10, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return f10;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 4) {
            return this.f3439b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new h("type mismatch.");
    }

    private static int a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f3440a = (byte) (b10 & 15);
        int i7 = (b10 & 240) >> 4;
        aVar.f3441b = i7;
        if (i7 != 15) {
            return 1;
        }
        aVar.f3441b = byteBuffer.get();
        return 2;
    }

    private <T> List<T> a(List<T> list, int i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] objArrB = b(list.get(0), i7, z10);
        if (objArrB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArrB) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i7, boolean z10) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry<K, V> next = map2.entrySet().iterator().next();
        K key = next.getKey();
        V value = next.getValue();
        if (b(i7)) {
            a aVar = new a();
            a(aVar);
            if (aVar.f3440a != 8) {
                throw new h("type mismatch.");
            }
            int iA = a(0, 0, true);
            if (iA < 0) {
                throw new h("size invalid: ".concat(String.valueOf(iA)));
            }
            for (int i10 = 0; i10 < iA; i10++) {
                map.put(a(key, 0, true), a(value, 1, true));
            }
        } else if (z10) {
            throw new h("require field not exist.");
        }
        return map;
    }

    private void a() {
        a aVar = new a();
        do {
            a(aVar);
            a(aVar.f3440a);
        } while (aVar.f3440a != 11);
    }

    private void a(byte b10) {
        int i7 = 0;
        switch (b10) {
            case 0:
                a(1);
                return;
            case 1:
                a(2);
                return;
            case 2:
                a(4);
                return;
            case 3:
                a(8);
                return;
            case 4:
                a(4);
                return;
            case 5:
                a(8);
                return;
            case 6:
                int i10 = this.f3439b.get();
                if (i10 < 0) {
                    i10 += 256;
                }
                a(i10);
                return;
            case 7:
                a(this.f3439b.getInt());
                return;
            case 8:
                int iA = a(0, 0, true);
                while (i7 < iA * 2) {
                    b();
                    i7++;
                }
                return;
            case 9:
                int iA2 = a(0, 0, true);
                while (i7 < iA2) {
                    b();
                    i7++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                a(aVar);
                if (aVar.f3440a == 0) {
                    a(a(0, 0, true));
                    return;
                } else {
                    StringBuilder sbT = ob.a.t("skipField with invalid type, type value: ", ", ", b10);
                    sbT.append((int) aVar.f3440a);
                    throw new h(sbT.toString());
                }
            default:
                throw new h("invalid type.");
        }
    }

    private void a(int i7) {
        ByteBuffer byteBuffer = this.f3439b;
        byteBuffer.position(byteBuffer.position() + i7);
    }

    private void a(a aVar) {
        a(aVar, this.f3439b);
    }

    private <T> T[] a(T[] tArr, int i7, boolean z10) {
        if (tArr == null || tArr.length == 0) {
            throw new h("unable to get type of key and value.");
        }
        return (T[]) b(tArr[0], i7, z10);
    }

    private void b() {
        a aVar = new a();
        a(aVar);
        a(aVar.f3440a);
    }

    private boolean b(int i7) {
        int i10;
        try {
            a aVar = new a();
            while (true) {
                int iA = a(aVar, this.f3439b.duplicate());
                i10 = aVar.f3441b;
                if (i7 <= i10 || aVar.f3440a == 11) {
                    break;
                    break;
                }
                a(iA);
                a(aVar.f3440a);
            }
            return i7 == i10;
        } catch (h | BufferUnderflowException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t2, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance(t2.getClass(), iA));
        for (int i10 = 0; i10 < iA; i10++) {
            tArr[i10] = a((Object) t2, 0, true);
        }
        return tArr;
    }

    private boolean[] d(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        boolean[] zArr = new boolean[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            zArr[i10] = a(0, true);
        }
        return zArr;
    }

    private short[] e(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        short[] sArr = new short[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            sArr[i10] = a(sArr[0], 0, true);
        }
        return sArr;
    }

    private int[] f(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        int[] iArr = new int[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            iArr[i10] = a(iArr[0], 0, true);
        }
        return iArr;
    }

    private long[] g(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        long[] jArr = new long[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            jArr[i10] = a(jArr[0], 0, true);
        }
        return jArr;
    }

    private float[] h(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        float[] fArr = new float[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            fArr[i10] = a(fArr[0], 0, true);
        }
        return fArr;
    }

    private double[] i(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f3440a != 9) {
            throw new h("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new h("size invalid: ".concat(String.valueOf(iA)));
        }
        double[] dArr = new double[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            dArr[i10] = a(dArr[0], 0, true);
        }
        return dArr;
    }

    public final byte a(byte b10, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return b10;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f3440a;
        if (b11 == 0) {
            return this.f3439b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new h("type mismatch.");
    }

    public final int a(int i7, int i10, boolean z10) {
        if (!b(i10)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return i7;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 0) {
            return this.f3439b.get();
        }
        if (b10 == 1) {
            return this.f3439b.getShort();
        }
        if (b10 == 2) {
            return this.f3439b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new h("type mismatch.");
    }

    public final int a(String str) {
        this.f3438a = str;
        return 0;
    }

    public final long a(long j5, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return j5;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 0) {
            return this.f3439b.get();
        }
        if (b10 == 1) {
            return this.f3439b.getShort();
        }
        if (b10 == 2) {
            return this.f3439b.getInt();
        }
        if (b10 == 3) {
            return this.f3439b.getLong();
        }
        if (b10 == 12) {
            return 0L;
        }
        throw new h("type mismatch.");
    }

    public final m a(m mVar, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        try {
            m mVar2 = (m) mVar.getClass().newInstance();
            a aVar = new a();
            a(aVar);
            if (aVar.f3440a != 10) {
                throw new h("type mismatch.");
            }
            mVar2.a(this);
            a();
            return mVar2;
        } catch (Exception e7) {
            throw new h(e7.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object a(T t2, int i7, boolean z10) {
        if (t2 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i7, z10));
        }
        if (t2 instanceof Boolean) {
            return Boolean.valueOf(a(i7, z10));
        }
        if (t2 instanceof Short) {
            return Short.valueOf(a((short) 0, i7, z10));
        }
        if (t2 instanceof Integer) {
            return Integer.valueOf(a(0, i7, z10));
        }
        if (t2 instanceof Long) {
            return Long.valueOf(a(0L, i7, z10));
        }
        if (t2 instanceof Float) {
            return Float.valueOf(a(0.0f, i7, z10));
        }
        if (t2 instanceof Double) {
            return Double.valueOf(a(0.0d, i7, z10));
        }
        if (t2 instanceof String) {
            return String.valueOf(b(i7, z10));
        }
        if (t2 instanceof Map) {
            return a((Map) t2, i7, z10);
        }
        if (t2 instanceof List) {
            return a((List) t2, i7, z10);
        }
        if (t2 instanceof m) {
            return a((m) t2, i7, z10);
        }
        if (!t2.getClass().isArray()) {
            throw new h("read object error: unsupport type.");
        }
        if ((t2 instanceof byte[]) || (t2 instanceof Byte[])) {
            return c(i7, z10);
        }
        if (t2 instanceof boolean[]) {
            return d(i7, z10);
        }
        if (t2 instanceof short[]) {
            return e(i7, z10);
        }
        if (t2 instanceof int[]) {
            return f(i7, z10);
        }
        if (t2 instanceof long[]) {
            return g(i7, z10);
        }
        if (t2 instanceof float[]) {
            return h(i7, z10);
        }
        return t2 instanceof double[] ? i(i7, z10) : a((Object[]) t2, i7, z10);
    }

    public final <K, V> HashMap<K, V> a(Map<K, V> map, int i7, boolean z10) {
        return (HashMap) a(new HashMap(), map, i7, z10);
    }

    public final short a(short s2, int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return s2;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 0) {
            return this.f3439b.get();
        }
        if (b10 == 1) {
            return this.f3439b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new h("type mismatch.");
    }

    public final void a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f3439b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f3439b = ByteBuffer.wrap(bArr);
    }

    public final boolean a(int i7, boolean z10) {
        return a((byte) 0, i7, z10) != 0;
    }

    public final String b(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 6) {
            int i10 = this.f3439b.get();
            if (i10 < 0) {
                i10 += 256;
            }
            byte[] bArr = new byte[i10];
            this.f3439b.get(bArr);
            try {
                return new String(bArr, this.f3438a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 != 7) {
            throw new h("type mismatch.");
        }
        int i11 = this.f3439b.getInt();
        if (i11 > 104857600 || i11 < 0) {
            throw new h("String too long: ".concat(String.valueOf(i11)));
        }
        byte[] bArr2 = new byte[i11];
        this.f3439b.get(bArr2);
        try {
            return new String(bArr2, this.f3438a);
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr2);
        }
    }

    public final byte[] c(int i7, boolean z10) {
        if (!b(i7)) {
            if (z10) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        byte b10 = aVar.f3440a;
        if (b10 == 9) {
            int iA = a(0, 0, true);
            if (iA < 0) {
                throw new h("size invalid: ".concat(String.valueOf(iA)));
            }
            byte[] bArr = new byte[iA];
            for (int i10 = 0; i10 < iA; i10++) {
                bArr[i10] = a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b10 != 13) {
            throw new h("type mismatch.");
        }
        a aVar2 = new a();
        a(aVar2);
        if (aVar2.f3440a != 0) {
            StringBuilder sbT = ob.a.t("type mismatch, tag: ", ", type: ", i7);
            sbT.append((int) aVar.f3440a);
            sbT.append(", ");
            sbT.append((int) aVar2.f3440a);
            throw new h(sbT.toString());
        }
        int iA2 = a(0, 0, true);
        if (iA2 >= 0) {
            byte[] bArr2 = new byte[iA2];
            this.f3439b.get(bArr2);
            return bArr2;
        }
        StringBuilder sbT2 = ob.a.t("invalid size, tag: ", ", type: ", i7);
        sbT2.append((int) aVar.f3440a);
        sbT2.append(", ");
        sbT2.append((int) aVar2.f3440a);
        sbT2.append(", size: ");
        sbT2.append(iA2);
        throw new h(sbT2.toString());
    }
}
