package ac;

import com.tencent.bugly.BuglyStrategy;
import i9.l;
import java.util.concurrent.TimeUnit;
import n3.r;
import u0.k;
import zb.j;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f523a = {1, 10, 100, 1000, 10000, BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f524b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f525c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f526d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        c cVar;
        long jE;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i7 = a.f508d;
        char cCharAt2 = str.charAt(0);
        int i10 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = i10 > 0 && j.K0('-', str);
        if (length <= i10) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i10) != 'P') {
            throw new IllegalArgumentException();
        }
        int i11 = i10 + 1;
        if (i11 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long jE2 = 0;
        boolean z11 = false;
        while (i11 < length) {
            if (str.charAt(i11) != 'T') {
                int i12 = i11;
                while (i12 < str.length() && (('0' <= (cCharAt = str.charAt(i12)) && cCharAt < ':') || j.s0("+-.", cCharAt))) {
                    i12++;
                }
                String strSubstring = str.substring(i11, i12);
                l.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i11;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i13 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        cVar = c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iZ0 = j.z0(strSubstring, '.', 0, 6);
                if (cVar != c.SECONDS || iZ0 <= 0) {
                    jE2 = a.e(jE2, k(j(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iZ0);
                    l.d(strSubstring2, "substring(...)");
                    long jE3 = a.e(jE2, k(j(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iZ0);
                    l.d(strSubstring3, "substring(...)");
                    double d10 = Double.parseDouble(strSubstring3);
                    double dB = b(d10, cVar, c.NANOSECONDS);
                    if (Double.isNaN(dB)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jN = k9.a.N(dB);
                    if (-4611686018426999999L > jN || jN >= 4611686018427000000L) {
                        jE = e(k9.a.N(b(d10, cVar, c.MILLISECONDS)));
                    } else {
                        jE = jN << 1;
                        int i14 = a.f508d;
                        int i15 = b.f510a;
                    }
                    jE2 = a.e(jE3, jE);
                }
                cVar2 = cVar;
                i11 = i13;
            } else {
                if (z11 || (i11 = i11 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? a.g(jE2) : jE2;
    }

    public static final double b(double d10, c cVar, c cVar2) {
        l.e(cVar2, "targetUnit");
        TimeUnit timeUnit = cVar2.f518a;
        TimeUnit timeUnit2 = cVar.f518a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d10 * jConvert : d10 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long c(long j5, c cVar, c cVar2) {
        l.e(cVar, "sourceUnit");
        l.e(cVar2, "targetUnit");
        return cVar2.f518a.convert(j5, cVar.f518a);
    }

    public static final long d(long j5) {
        long j10 = (j5 << 1) + 1;
        int i7 = a.f508d;
        int i10 = b.f510a;
        return j10;
    }

    public static final long e(long j5) {
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return d(r.n(j5));
        }
        long j10 = (j5 * ((long) 1000000)) << 1;
        int i7 = a.f508d;
        int i10 = b.f510a;
        return j10;
    }

    public static final void f(StringBuilder sb2, StringBuilder sb3, int i7) {
        if (i7 < 10) {
            sb2.append('0');
        }
        sb3.append(i7);
    }

    public static final k g(String str, String str2, int i7, h9.k kVar) {
        char cCharAt = str.charAt(i7);
        if (((Boolean) kVar.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return h(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i7);
    }

    public static final k h(String str, String str2) {
        return new k(str2 + " when parsing an Instant from \"" + l(64, str) + '\"', str);
    }

    public static final int i(int i7, String str) {
        return (str.charAt(i7 + 1) - '0') + ((str.charAt(i7) - '0') * 10);
    }

    public static final long j(String str) {
        char cCharAt;
        int length = str.length();
        int i7 = (length <= 0 || !j.s0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            int i10 = i7;
            while (true) {
                if (i7 >= length) {
                    if (length - i10 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 == '0') {
                    if (i10 == i7) {
                        i10++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i7++;
            }
        }
        return (!q.o0(str, "+") || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(j.t0(1, str));
    }

    public static final long k(long j5, c cVar) {
        l.e(cVar, "unit");
        c cVar2 = c.NANOSECONDS;
        l.e(cVar2, "sourceUnit");
        TimeUnit timeUnit = cVar.f518a;
        TimeUnit timeUnit2 = cVar2.f518a;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j5 || j5 > jConvert) {
            return d(r.n(c(j5, cVar, c.MILLISECONDS)));
        }
        long jConvert2 = timeUnit2.convert(j5, timeUnit) << 1;
        int i7 = a.f508d;
        int i10 = b.f510a;
        return jConvert2;
    }

    public static final String l(int i7, String str) {
        if (str.length() <= i7) {
            return str.toString();
        }
        return str.subSequence(0, i7).toString() + "...";
    }
}
