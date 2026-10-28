package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f2785b = new k(u0.f2862b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f2786c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2787a;

    static {
        f2786c = e.a() ? new i(1) : new i(0);
    }

    public static int d(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(a2.f.F("Beginning index: ", " < 0", i7));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a2.f.D(i10, i11, "End index: ", " >= "));
    }

    public static k k(byte[] bArr, int i7, int i10) {
        byte[] bArrCopyOfRange;
        d(i7, i7 + i10, bArr.length);
        switch (f2786c.f2758a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i10);
                break;
        }
        return new k(bArrCopyOfRange);
    }

    public static k m(String str) {
        return new k(str.getBytes(u0.f2861a));
    }

    public abstract byte c(int i7);

    public final int hashCode() {
        int iR = this.f2787a;
        if (iR == 0) {
            int size = size();
            iR = r(size, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f2787a = iR;
        }
        return iR;
    }

    public abstract void n(byte[] bArr, int i7);

    public abstract byte o(int i7);

    public abstract boolean p();

    public abstract p q();

    public abstract int r(int i7, int i10);

    public abstract l s(int i7);

    public abstract int size();

    public abstract String t(Charset charset);

    public final String toString() {
        String strS;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strS = k9.a.s(this);
        } else {
            strS = k9.a.s(s(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return ob.a.s(sb2, strS, "\">");
    }

    public final String u() {
        return size() == 0 ? "" : t(u0.f2861a);
    }

    public abstract void v(u uVar);
}
