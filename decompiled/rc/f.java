package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e6.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12321d;

    public f(j.g gVar, boolean z10) {
        super(gVar);
        this.f12321d = z10;
    }

    @Override // e6.h
    public final void c(byte b10) {
        if (this.f12321d) {
            i(String.valueOf(b10 & 255));
        } else {
            g(String.valueOf(b10 & 255));
        }
    }

    @Override // e6.h
    public final void e(int i7) {
        if (this.f12321d) {
            i(Long.toString(4294967295L & ((long) i7), 10));
        } else {
            g(Long.toString(4294967295L & ((long) i7), 10));
        }
    }

    @Override // e6.h
    public final void f(long j5) {
        int i7 = 63;
        String str = "0";
        if (this.f12321d) {
            if (j5 != 0) {
                if (j5 > 0) {
                    str = Long.toString(j5, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j5 >>> 1) / ((long) 5);
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j5 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
            }
            i(str);
            return;
        }
        if (j5 != 0) {
            if (j5 > 0) {
                str = Long.toString(j5, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j5 >>> 1) / ((long) 5);
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j5 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i7--;
                    cArr2[i7] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i7, 64 - i7);
            }
        }
        g(str);
    }

    @Override // e6.h
    public final void h(short s2) {
        if (this.f12321d) {
            i(String.valueOf(s2 & 65535));
        } else {
            g(String.valueOf(s2 & 65535));
        }
    }
}
