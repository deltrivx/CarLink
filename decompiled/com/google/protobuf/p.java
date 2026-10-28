package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f2829b;

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    public static m f(byte[] bArr, int i7, int i10, boolean z10) {
        m mVar = new m(bArr, i7, i10, z10);
        try {
            mVar.i(i10);
            return mVar;
        } catch (w0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static p g(InputStream inputStream) {
        if (inputStream != null) {
            return new n(inputStream);
        }
        byte[] bArr = u0.f2862b;
        return f(bArr, 0, bArr.length, false);
    }

    public static int s(int i7, InputStream inputStream) throws IOException {
        if ((i7 & 128) == 0) {
            return i7;
        }
        int i10 = i7 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw w0.g();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw w0.g();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw w0.d();
    }

    public abstract int A();

    public abstract long B();

    public abstract void a(int i7);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i7);

    public abstract int i(int i7);

    public abstract boolean j();

    public abstract k k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
