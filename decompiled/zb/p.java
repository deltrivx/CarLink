package zb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    /* JADX WARN: Code duplicated, block: B:105:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    public static final boolean h0(String str) {
        boolean z10;
        boolean z11;
        int i7;
        String str2;
        boolean z12;
        int length = str.length() - 1;
        int i10 = 0;
        while (i10 <= length && str.charAt(i10) <= ' ') {
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        while (length > i10 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        if (str.charAt(i10) != '0') {
            z10 = true;
            z11 = false;
        } else {
            int i11 = i10 + 1;
            if (i11 > length) {
                return true;
            }
            if ((str.charAt(i11) | ' ') == 120) {
                int i12 = i10 + 2;
                int i13 = i12;
                while (true) {
                    if (i13 > length) {
                        z10 = true;
                        break;
                    }
                    char cCharAt = str.charAt(i13);
                    z10 = true;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i13++;
                }
                boolean z13 = i12 != i13;
                if (i13 > length) {
                    i10 = -1;
                } else {
                    if (str.charAt(i13) == '.') {
                        int i14 = i13 + 1;
                        int i15 = i14;
                        while (i15 <= length) {
                            char cCharAt2 = str.charAt(i15);
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i15++;
                        }
                        z12 = i14 != i15;
                        i13 = i15;
                    } else {
                        z12 = false;
                    }
                    i10 = (z13 || z12) ? i13 : -1;
                }
                if (i10 == -1 || i10 > length) {
                    return false;
                }
                z11 = true;
            } else {
                z10 = true;
                z11 = false;
            }
        }
        if (!z11) {
            int i16 = i10;
            while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                i16++;
            }
            boolean z14 = i10 != i16;
            if (i16 > length) {
                i10 = i16;
            } else {
                if (str.charAt(i16) == '.') {
                    int i17 = i16 + 1;
                    i7 = i17;
                    while (i7 <= length && ((str.charAt(i7) - '0') & 65535) < 10) {
                        i7++;
                    }
                    boolean z15 = i17 != i7;
                    if (!z14 || z15) {
                        i10 = i7;
                    } else {
                        if (length == i7 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i7 + 7 ? "Infinity" : null;
                        }
                        i10 = (str2 != null && j.x0(str, str2, i7, false) == i7) ? length + 1 : -1;
                    }
                } else {
                    i7 = i16;
                }
                if (z14) {
                    i10 = i7;
                } else {
                    i10 = i7;
                }
            }
            if (i10 == -1) {
                return false;
            }
            if (i10 > length) {
                return z10;
            }
        }
        int i18 = i10 + 1;
        int iCharAt = str.charAt(i10) | ' ';
        if (iCharAt != (z11 ? 112 : 101)) {
            if (z11 || (!(iCharAt == 102 || iCharAt == 100) || i18 <= length)) {
                return false;
            }
            return z10;
        }
        if (i18 > length) {
            return false;
        }
        if ((str.charAt(i18) == '+' || str.charAt(i18) == '-') && (i18 = i10 + 2) > length) {
            return false;
        }
        while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
            i18++;
        }
        if (i18 > length) {
            return z10;
        }
        if (i18 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i18) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z10;
        }
        return false;
    }
}
