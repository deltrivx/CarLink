package zb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    public static boolean i0(String str, String str2) {
        i9.l.e(str, "<this>");
        i9.l.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static final void j0(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean k0(int i7, int i10, int i11, String str, String str2, boolean z10) {
        i9.l.e(str, "<this>");
        i9.l.e(str2, "other");
        return !z10 ? str.regionMatches(i7, str2, i10, i11) : str.regionMatches(z10, i7, str2, i10, i11);
    }

    public static String l0(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i10 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i11 = 0; i11 < i7; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        i9.l.b(string);
        return string;
    }

    public static String m0(String str, char c10, char c11) {
        i9.l.e(str, "<this>");
        String strReplace = str.replace(c10, c11);
        i9.l.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String n0(String str, String str2, String str3) {
        i9.l.e(str, "<this>");
        i9.l.e(str3, "newValue");
        int iX0 = j.x0(str, str2, 0, false);
        if (iX0 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iX0);
            sb2.append(str3);
            i10 = iX0 + length;
            if (iX0 >= str.length()) {
                break;
            }
            iX0 = j.x0(str, str2, iX0 + i7, false);
        } while (iX0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }

    public static boolean o0(String str, String str2) {
        i9.l.e(str, "<this>");
        i9.l.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static Integer p0(String str) {
        boolean z10;
        int i7;
        int i10;
        i9.l.e(str, "<this>");
        n3.l.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (i9.l.f(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i7 = 0;
        }
        int i13 = -59652323;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i7++;
        }
        return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long q0(String str) {
        boolean z10;
        i9.l.e(str, "<this>");
        n3.l.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (i9.l.f(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i7 = 1;
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j5 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z10 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j5 / ((long) 10);
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * ((long) 10);
            long j13 = iDigit;
            if (j12 < j5 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i7++;
        }
        return z10 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
