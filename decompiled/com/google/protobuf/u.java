package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends i2.c {
    public static final Logger k = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f2859l = j2.f2776e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f2860j;

    public static int V(int i7, l lVar) {
        return W(lVar) + c0(i7);
    }

    public static int W(l lVar) {
        int size = lVar.size();
        return e0(size) + size;
    }

    public static int X(int i7) {
        return c0(i7) + 4;
    }

    public static int Y(int i7) {
        return c0(i7) + 8;
    }

    public static int Z(int i7, l1 l1Var, x1 x1Var) {
        return ((c) l1Var).getSerializedSize(x1Var) + (c0(i7) * 2);
    }

    public static int a0(int i7) {
        if (i7 >= 0) {
            return e0(i7);
        }
        return 10;
    }

    public static int b0(String str) {
        int length;
        try {
            length = m2.b(str);
        } catch (l2 unused) {
            length = str.getBytes(u0.f2861a).length;
        }
        return e0(length) + length;
    }

    public static int c0(int i7) {
        return e0(i7 << 3);
    }

    public static int d0(int i7, int i10) {
        return e0(i10) + c0(i7);
    }

    public static int e0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int f0(long j5) {
        int i7;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j5) != 0) {
            i7 += 2;
            j5 >>>= 14;
        }
        return (j5 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public final void g0(String str, l2 l2Var) throws s {
        k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) l2Var);
        byte[] bytes = str.getBytes(u0.f2861a);
        try {
            u0(bytes.length);
            U(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new s(e7);
        }
    }

    public abstract void h0(byte b10);

    public abstract void i0(int i7, boolean z10);

    public abstract void j0(int i7, l lVar);

    public abstract void k0(int i7, int i10);

    public abstract void l0(int i7);

    public abstract void m0(int i7, long j5);

    public abstract void n0(long j5);

    public abstract void o0(int i7, int i10);

    public abstract void p0(int i7);

    public abstract void q0(int i7, l1 l1Var, x1 x1Var);

    public abstract void r0(int i7, String str);

    public abstract void s0(int i7, int i10);

    public abstract void t0(int i7, int i10);

    public abstract void u0(int i7);

    public abstract void v0(int i7, long j5);

    public abstract void w0(long j5);
}
