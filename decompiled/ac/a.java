package ac;

import i9.l;
import n3.r;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f508d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f509a;

    static {
        int i7 = b.f510a;
        f506b = f.d(4611686018427387903L);
        f507c = f.d(-4611686018427387903L);
    }

    public static final long a(long j5, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j5 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return f.d(r.n(j13));
        }
        long j14 = ((j13 * j11) + (j10 - (j12 * j11))) << 1;
        int i7 = b.f510a;
        return j14;
    }

    public static final void b(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z10) {
        sb2.append(i7);
        if (i10 != 0) {
            sb2.append('.');
            String strF0 = j.F0(i11, String.valueOf(i10));
            int i12 = -1;
            int length = strF0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strF0.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z10 || i14 >= 3) {
                sb2.append((CharSequence) strF0, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strF0, 0, i14);
            }
        }
        sb2.append(str);
    }

    public static final int c(long j5) {
        if (d(j5)) {
            return 0;
        }
        return (int) ((((int) j5) & 1) == 1 ? ((j5 >> 1) % ((long) 1000)) * ((long) 1000000) : (j5 >> 1) % ((long) 1000000000));
    }

    public static final boolean d(long j5) {
        return j5 == f506b || j5 == f507c;
    }

    public static final long e(long j5, long j10) {
        if (d(j5)) {
            if (!d(j10) || (j10 ^ j5) >= 0) {
                return j5;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j10)) {
            return j10;
        }
        int i7 = ((int) j5) & 1;
        if (i7 != (((int) j10) & 1)) {
            return i7 == 1 ? a(j5 >> 1, j10 >> 1) : a(j10 >> 1, j5 >> 1);
        }
        long j11 = (j5 >> 1) + (j10 >> 1);
        if (i7 != 0) {
            return f.e(j11);
        }
        if (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) {
            return f.d(j11 / ((long) 1000000));
        }
        long j12 = j11 << 1;
        int i10 = b.f510a;
        return j12;
    }

    public static final long f(long j5, c cVar) {
        l.e(cVar, "unit");
        if (j5 == f506b) {
            return Long.MAX_VALUE;
        }
        if (j5 == f507c) {
            return Long.MIN_VALUE;
        }
        return f.c(j5 >> 1, (((int) j5) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, cVar);
    }

    public static final long g(long j5) {
        long j10 = ((-(j5 >> 1)) << 1) + ((long) (((int) j5) & 1));
        int i7 = b.f510a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = ((a) obj).f509a;
        long j10 = this.f509a;
        long j11 = j10 ^ j5;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return l.g(j10, j5);
        }
        int i7 = (((int) j10) & 1) - (((int) j5) & 1);
        return j10 < 0 ? -i7 : i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f509a == ((a) obj).f509a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f509a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long jG = this.f509a;
        if (jG == 0) {
            return "0s";
        }
        if (jG == f506b) {
            return "Infinity";
        }
        if (jG == f507c) {
            return "-Infinity";
        }
        int i7 = 0;
        boolean z10 = jG < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, c.DAYS);
        int iF = d(jG) ? 0 : (int) (f(jG, c.HOURS) % ((long) 24));
        int iF2 = d(jG) ? 0 : (int) (f(jG, c.MINUTES) % ((long) 60));
        int iF3 = d(jG) ? 0 : (int) (f(jG, c.SECONDS) % ((long) 60));
        int iC = c(jG);
        boolean z11 = jF != 0;
        boolean z12 = iF != 0;
        boolean z13 = iF2 != 0;
        boolean z14 = (iF3 == 0 && iC == 0) ? false : true;
        if (z11) {
            sb2.append(jF);
            sb2.append('d');
            i7 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iF);
            sb2.append('h');
            i7 = i10;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i11 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iF2);
            sb2.append('m');
            i7 = i11;
        }
        if (z14) {
            int i12 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            if (iF3 != 0 || z11 || z12 || z13) {
                b(sb2, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb2, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb2, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb2.append(iC);
                sb2.append("ns");
            }
            i7 = i12;
        }
        if (z10 && i7 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
