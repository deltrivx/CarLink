package f7;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5453c;

    public t(byte[] bArr) {
        this.f5451a = bArr;
    }

    public t(byte[] bArr, int i7, int i10) {
        this.f5451a = bArr;
        this.f5452b = i7;
        this.f5453c = i10;
    }

    public int a() {
        return ((this.f5451a.length - this.f5452b) * 8) - this.f5453c;
    }

    public int b(int i7) {
        if (i7 <= 0 || i7 > 32 || i7 > a()) {
            throw new IllegalArgumentException(String.valueOf(i7));
        }
        int i10 = this.f5453c;
        int i11 = 0;
        byte[] bArr = this.f5451a;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int iMin = Math.min(i7, i12);
            int i13 = i12 - iMin;
            int i14 = this.f5452b;
            int i15 = (((255 >> (8 - iMin)) << i13) & bArr[i14]) >> i13;
            i7 -= iMin;
            int i16 = this.f5453c + iMin;
            this.f5453c = i16;
            if (i16 == 8) {
                this.f5453c = 0;
                this.f5452b = i14 + 1;
            }
            i11 = i15;
        }
        if (i7 > 0) {
            while (i7 >= 8) {
                int i17 = i11 << 8;
                int i18 = this.f5452b;
                int i19 = i17 | (bArr[i18] & 255);
                this.f5452b = i18 + 1;
                i7 -= 8;
                i11 = i19;
            }
            if (i7 > 0) {
                int i20 = 8 - i7;
                int i21 = ((bArr[this.f5452b] & ((255 >> i20) << i20)) >> i20) | (i11 << i7);
                this.f5453c += i7;
                return i21;
            }
        }
        return i11;
    }
}
