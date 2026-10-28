package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f2769a;

    public i2(Unsafe unsafe) {
        this.f2769a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2769a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2769a.arrayIndexScale(cls);
    }

    public abstract void c(long j5, byte[] bArr, long j10);

    public abstract boolean d(long j5, Object obj);

    public abstract byte e(long j5);

    public abstract byte f(long j5, Object obj);

    public abstract double g(long j5, Object obj);

    public abstract float h(long j5, Object obj);

    public final int i(long j5, Object obj) {
        return this.f2769a.getInt(obj, j5);
    }

    public final long j(long j5, Object obj) {
        return this.f2769a.getLong(obj, j5);
    }

    public final Object k(long j5, Object obj) {
        return this.f2769a.getObject(obj, j5);
    }

    public final long l(Field field) {
        return this.f2769a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j5, boolean z10);

    public abstract void n(Object obj, long j5, byte b10);

    public abstract void o(Object obj, long j5, double d10);

    public abstract void p(Object obj, long j5, float f10);

    public final void q(int i7, long j5, Object obj) {
        this.f2769a.putInt(obj, j5, i7);
    }

    public final void r(Object obj, long j5, long j10) {
        this.f2769a.putLong(obj, j5, j10);
    }

    public final void s(long j5, Object obj, Object obj2) {
        this.f2769a.putObject(obj, j5, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f2769a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            j2.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
