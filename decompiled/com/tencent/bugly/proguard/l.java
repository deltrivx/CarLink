package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f3449b;

    public l() {
        this(128);
    }

    public l(int i7) {
        this.f3449b = "GBK";
        this.f3448a = ByteBuffer.allocate(i7);
    }

    private void a(double d10, int i7) {
        a(10);
        b((byte) 5, i7);
        this.f3448a.putDouble(d10);
    }

    private void a(float f10, int i7) {
        a(6);
        b((byte) 4, i7);
        this.f3448a.putFloat(f10);
    }

    private void a(int i7) {
        if (this.f3448a.remaining() < i7) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f3448a.capacity() + i7) * 2);
            byteBufferAllocate.put(this.f3448a.array(), 0, this.f3448a.position());
            this.f3448a = byteBufferAllocate;
        }
    }

    private void a(double[] dArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(dArr.length, 0);
        for (double d10 : dArr) {
            a(d10, 0);
        }
    }

    private void a(float[] fArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(fArr.length, 0);
        for (float f10 : fArr) {
            a(f10, 0);
        }
    }

    private void a(int[] iArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(iArr.length, 0);
        for (int i10 : iArr) {
            a(i10, 0);
        }
    }

    private void a(long[] jArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(jArr.length, 0);
        for (long j5 : jArr) {
            a(j5, 0);
        }
    }

    private void a(Object[] objArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    private void a(short[] sArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(sArr.length, 0);
        for (short s2 : sArr) {
            a(s2, 0);
        }
    }

    private void a(boolean[] zArr, int i7) {
        a(8);
        b((byte) 9, i7);
        a(zArr.length, 0);
        for (boolean z10 : zArr) {
            a(z10, 0);
        }
    }

    private void b(byte b10, int i7) {
        if (i7 < 15) {
            this.f3448a.put((byte) (b10 | (i7 << 4)));
        } else {
            if (i7 >= 256) {
                throw new j("tag is too large: ".concat(String.valueOf(i7)));
            }
            this.f3448a.put((byte) (b10 | 240));
            this.f3448a.put((byte) i7);
        }
    }

    public final int a(String str) {
        this.f3449b = str;
        return 0;
    }

    public final void a(byte b10, int i7) {
        a(3);
        if (b10 == 0) {
            b((byte) 12, i7);
        } else {
            b((byte) 0, i7);
            this.f3448a.put(b10);
        }
    }

    public final void a(int i7, int i10) {
        a(6);
        if (i7 >= -32768 && i7 <= 32767) {
            a((short) i7, i10);
        } else {
            b((byte) 2, i10);
            this.f3448a.putInt(i7);
        }
    }

    public final void a(long j5, int i7) {
        a(10);
        if (j5 >= -2147483648L && j5 <= 2147483647L) {
            a((int) j5, i7);
        } else {
            b((byte) 3, i7);
            this.f3448a.putLong(j5);
        }
    }

    public final void a(m mVar, int i7) {
        a(2);
        b((byte) 10, i7);
        mVar.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public final void a(Object obj, int i7) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i7);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i7);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i7);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i7);
            return;
        }
        if (obj instanceof Long) {
            a(((Long) obj).longValue(), i7);
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i7);
            return;
        }
        if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i7);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i7);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i7);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i7);
            return;
        }
        if (obj instanceof m) {
            a((m) obj, i7);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i7);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i7);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i7);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i7);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i7);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i7);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i7);
            return;
        }
        if (obj.getClass().isArray()) {
            a((Object[]) obj, i7);
        } else if (obj instanceof Collection) {
            a((Collection) obj, i7);
        } else {
            throw new j("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final void a(String str, int i7) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f3449b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i7);
            this.f3448a.putInt(bytes.length);
            this.f3448a.put(bytes);
        } else {
            b((byte) 6, i7);
            this.f3448a.put((byte) bytes.length);
            this.f3448a.put(bytes);
        }
    }

    public final <T> void a(Collection<T> collection, int i7) {
        a(8);
        b((byte) 9, i7);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public final <K, V> void a(Map<K, V> map, int i7) {
        a(8);
        b((byte) 8, i7);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public final void a(short s2, int i7) {
        a(4);
        if (s2 >= -128 && s2 <= 127) {
            a((byte) s2, i7);
        } else {
            b((byte) 1, i7);
            this.f3448a.putShort(s2);
        }
    }

    public final void a(boolean z10, int i7) {
        a(z10 ? (byte) 1 : (byte) 0, i7);
    }

    public final void a(byte[] bArr, int i7) {
        a(bArr.length + 8);
        b((byte) 13, i7);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f3448a.put(bArr);
    }
}
