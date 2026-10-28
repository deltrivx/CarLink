package ac;

import i9.l;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f519c = new d(0, -31557014167219200L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f520d = new d(999999999, 31556889864403199L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f522b;

    public d(int i7, long j5) {
        this.f521a = j5;
        this.f522b = i7;
        if (-31557014167219200L > j5 || j5 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        l.e(dVar, "other");
        int iG = l.g(this.f521a, dVar.f521a);
        return iG != 0 ? iG : l.f(this.f522b, dVar.f522b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f521a == dVar.f521a && this.f522b == dVar.f522b;
    }

    public final int hashCode() {
        long j5 = this.f521a;
        return (this.f522b * 51) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        long j5;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f521a;
        long j11 = j10 / 86400;
        if ((j10 ^ 86400) < 0 && j11 * 86400 != j10) {
            j11--;
        }
        long j12 = j10 % 86400;
        int i7 = (int) (j12 + (86400 & (((j12 ^ 86400) & ((-j12) | j12)) >> 63)));
        long j13 = (j11 + ((long) 719528)) - ((long) 60);
        if (j13 < 0) {
            long j14 = 146097;
            long j15 = ((j13 + 1) / j14) - 1;
            j5 = ((long) 400) * j15;
            j13 += (-j15) * j14;
        } else {
            j5 = 0;
        }
        long j16 = 400;
        long j17 = ((j16 * j13) + ((long) 591)) / ((long) 146097);
        long j18 = 365;
        long j19 = j18 * j17;
        long j20 = 4;
        long j21 = (j17 / j20) + j19;
        long j22 = 100;
        long j23 = j13 - ((j17 / j16) + (j21 - (j17 / j22)));
        if (j23 < 0) {
            j17--;
            j23 = j13 - ((j17 / j16) + (((j17 / j20) + (j18 * j17)) - (j17 / j22)));
        }
        int i10 = (int) j23;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j17 + j5 + ((long) (i11 / 10)));
        int i15 = i7 / 3600;
        int i16 = i7 - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + 10000);
                l.d(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i14 - 10000);
                l.d(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        f.f(sb2, sb2, i12);
        sb2.append('-');
        f.f(sb2, sb2, i13);
        sb2.append('T');
        f.f(sb2, sb2, i15);
        sb2.append(':');
        f.f(sb2, sb2, i17);
        sb2.append(':');
        f.f(sb2, sb2, i18);
        int i20 = this.f522b;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = f.f523a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String strValueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            l.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            l.d(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
