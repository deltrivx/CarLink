package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f2772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f2773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i2 f2774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f2776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f2778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f2779h;

    static {
        Unsafe unsafeJ = j();
        f2772a = unsafeJ;
        f2773b = e.f2736a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        i2 h2Var = null;
        if (unsafeJ != null) {
            if (!e.a()) {
                h2Var = new h2(unsafeJ);
            } else if (zF) {
                h2Var = new g2(unsafeJ, 1);
            } else if (zF2) {
                h2Var = new g2(unsafeJ, 0);
            }
        }
        f2774c = h2Var;
        f2775d = h2Var == null ? false : h2Var.u();
        f2776e = h2Var == null ? false : h2Var.t();
        f2777f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        f2778g = (fieldE == null || h2Var == null) ? -1L : h2Var.l(fieldE);
        f2779h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(j2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f2772a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f2776e) {
            return f2774c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f2776e) {
            f2774c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (e.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!e.a()) {
            return false;
        }
        try {
            Class cls2 = f2773b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j5) {
        return f2774c.f(f2777f + j5, bArr);
    }

    public static byte h(long j5, Object obj) {
        return (byte) ((f2774c.i((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    public static byte i(long j5, Object obj) {
        return (byte) ((f2774c.i((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j5, byte b10) {
        f2774c.n(bArr, f2777f + j5, b10);
    }

    public static void l(Object obj, long j5, byte b10) {
        long j10 = (-4) & j5;
        int i7 = f2774c.i(j10, obj);
        int i10 = ((~((int) j5)) & 3) << 3;
        n(((255 & b10) << i10) | (i7 & (~(255 << i10))), j10, obj);
    }

    public static void m(Object obj, long j5, byte b10) {
        long j10 = (-4) & j5;
        int i7 = (((int) j5) & 3) << 3;
        n(((255 & b10) << i7) | (f2774c.i(j10, obj) & (~(255 << i7))), j10, obj);
    }

    public static void n(int i7, long j5, Object obj) {
        f2774c.q(i7, j5, obj);
    }

    public static void o(Object obj, long j5, long j10) {
        f2774c.r(obj, j5, j10);
    }

    public static void p(long j5, Object obj, Object obj2) {
        f2774c.s(j5, obj, obj2);
    }
}
