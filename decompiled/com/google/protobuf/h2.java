package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends i2 {
    @Override // com.google.protobuf.i2
    public final void c(long j5, byte[] bArr, long j10) {
        this.f2769a.copyMemory((Object) null, j5, bArr, j2.f2777f, j10);
    }

    @Override // com.google.protobuf.i2
    public final boolean d(long j5, Object obj) {
        return this.f2769a.getBoolean(obj, j5);
    }

    @Override // com.google.protobuf.i2
    public final byte e(long j5) {
        return this.f2769a.getByte(j5);
    }

    @Override // com.google.protobuf.i2
    public final byte f(long j5, Object obj) {
        return this.f2769a.getByte(obj, j5);
    }

    @Override // com.google.protobuf.i2
    public final double g(long j5, Object obj) {
        return this.f2769a.getDouble(obj, j5);
    }

    @Override // com.google.protobuf.i2
    public final float h(long j5, Object obj) {
        return this.f2769a.getFloat(obj, j5);
    }

    @Override // com.google.protobuf.i2
    public final void m(Object obj, long j5, boolean z10) {
        this.f2769a.putBoolean(obj, j5, z10);
    }

    @Override // com.google.protobuf.i2
    public final void n(Object obj, long j5, byte b10) {
        this.f2769a.putByte(obj, j5, b10);
    }

    @Override // com.google.protobuf.i2
    public final void o(Object obj, long j5, double d10) {
        this.f2769a.putDouble(obj, j5, d10);
    }

    @Override // com.google.protobuf.i2
    public final void p(Object obj, long j5, float f10) {
        this.f2769a.putFloat(obj, j5, f10);
    }

    @Override // com.google.protobuf.i2
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f2769a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            j2.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.i2
    public final boolean u() {
        Unsafe unsafe = this.f2769a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (j2.e() != null) {
                    try {
                        Class<?> cls3 = this.f2769a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        j2.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                j2.a(th2);
            }
        }
        return false;
    }
}
