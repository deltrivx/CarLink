package zb;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends q {
    public static /* synthetic */ int A0(CharSequence charSequence, String str, int i7, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return x0(charSequence, str, i7, z10);
    }

    public static boolean B0(String str) {
        i9.l.e(str, "<this>");
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (!n3.l.H(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static char C0(CharSequence charSequence) {
        i9.l.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(w0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int D0(char c10, String str) {
        int iW0 = w0(str);
        i9.l.e(str, "<this>");
        return str.lastIndexOf(c10, iW0);
    }

    public static int E0(int i7, int i10, String str, String str2) {
        if ((i10 & 2) != 0) {
            i7 = w0(str);
        }
        i9.l.e(str, "<this>");
        i9.l.e(str2, "string");
        return str.lastIndexOf(str2, i7);
    }

    public static String F0(int i7, String str) {
        CharSequence charSequenceSubSequence;
        i9.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Desired length ", " is less than zero.", i7));
        }
        if (i7 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i7);
            int length = i7 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean G0(CharSequence charSequence, int i7, CharSequence charSequence2, int i10, int i11, boolean z10) {
        i9.l.e(charSequence, "<this>");
        i9.l.e(charSequence2, "other");
        if (i10 < 0 || i7 < 0 || i7 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!n3.l.t(charSequence.charAt(i7 + i12), charSequence2.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String H0(String str, String str2) {
        i9.l.e(str, "<this>");
        if (!q.o0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String I0(String str, String str2) {
        i9.l.e(str, "<this>");
        if (!v0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List J0(String str, String[] strArr, int i7) {
        int i10 = (i7 & 4) != 0 ? 0 : 2;
        i9.l.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iX0 = x0(str, str2, 0, false);
                if (iX0 == -1 || i10 == 1) {
                    return n3.l.I(str.toString());
                }
                boolean z10 = i10 > 0;
                ArrayList arrayList = new ArrayList(z10 ? i10 : 10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iX0).toString());
                    length = str2.length() + iX0;
                    if (z10 && arrayList.size() == i10 - 1) {
                        break;
                    }
                    iX0 = x0(str, str2, length, false);
                } while (iX0 != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        c<n9.d> cVar = new c(str, i10, new y7.a(5, u8.l.j0(strArr)));
        ArrayList arrayList2 = new ArrayList(u8.q.a0(new u8.n(2, cVar), 10));
        for (n9.d dVar : cVar) {
            i9.l.e(dVar, "range");
            arrayList2.add(str.subSequence(dVar.f8965a, dVar.f8966b + 1).toString());
        }
        return arrayList2;
    }

    public static boolean K0(char c10, String str) {
        return str.length() > 0 && n3.l.t(str.charAt(0), c10, false);
    }

    public static String L0(String str, char c10, String str2) {
        int iZ0 = z0(str, c10, 0, 6);
        if (iZ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iZ0 + 1, str.length());
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String M0(String str, String str2) {
        i9.l.e(str2, "delimiter");
        int iA0 = A0(str, str2, 0, false, 6);
        if (iA0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iA0, str.length());
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N0(String str, char c10, String str2) {
        i9.l.e(str, "<this>");
        i9.l.e(str2, "missingDelimiterValue");
        int iD0 = D0(c10, str);
        if (iD0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iD0 + 1, str.length());
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O0(char c10, String str) {
        i9.l.e(str, "<this>");
        i9.l.e(str, "missingDelimiterValue");
        int iZ0 = z0(str, c10, 0, 6);
        if (iZ0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iZ0);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String str, String str2) {
        i9.l.e(str, "<this>");
        i9.l.e(str, "missingDelimiterValue");
        int iA0 = A0(str, str2, 0, false, 6);
        if (iA0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iA0);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(String str, String str2) {
        i9.l.e(str, "<this>");
        i9.l.e(str2, "missingDelimiterValue");
        int iE0 = E0(0, 6, str, ".");
        if (iE0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iE0);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(int i7, String str) {
        i9.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested character count ", " is less than zero.", i7).toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(0, i7);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean r0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        i9.l.e(charSequence, "<this>");
        i9.l.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (A0(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (y0(charSequence, charSequence2, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean s0(CharSequence charSequence, char c10) {
        i9.l.e(charSequence, "<this>");
        return z0(charSequence, c10, 0, 2) >= 0;
    }

    public static String t0(int i7, String str) {
        i9.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested character count ", " is less than zero.", i7).toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(i7);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean u0(char c10, String str) {
        i9.l.e(str, "<this>");
        return str.length() > 0 && n3.l.t(str.charAt(w0(str)), c10, false);
    }

    public static boolean v0(CharSequence charSequence, String str) {
        i9.l.e(charSequence, "<this>");
        return charSequence instanceof String ? q.i0((String) charSequence, str) : G0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int w0(CharSequence charSequence) {
        i9.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int x0(CharSequence charSequence, String str, int i7, boolean z10) {
        i9.l.e(charSequence, "<this>");
        i9.l.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? y0(charSequence, str, i7, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i7);
    }

    public static final int y0(CharSequence charSequence, CharSequence charSequence2, int i7, int i10, boolean z10, boolean z11) {
        n9.b bVar;
        if (z11) {
            int iW0 = w0(charSequence);
            if (i7 > iW0) {
                i7 = iW0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            bVar = new n9.b(i7, i10, -1);
        } else {
            if (i7 < 0) {
                i7 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            bVar = new n9.d(i7, i10, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = bVar.f8967c;
        int i12 = bVar.f8966b;
        int i13 = bVar.f8965a;
        if (!z12 || !(charSequence2 instanceof String)) {
            boolean z13 = z10;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (G0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                        return i13;
                    }
                    if (i13 != i12) {
                        i13 += i11;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            int i14 = i13;
            while (true) {
                String str = (String) charSequence2;
                boolean z15 = z10;
                if (q.k0(0, i14, str.length(), str, (String) charSequence, z15)) {
                    return i14;
                }
                if (i14 != i12) {
                    i14 += i11;
                    z10 = z15;
                }
            }
        }
        return -1;
    }

    public static int z0(CharSequence charSequence, char c10, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        i9.l.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c10, i7);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i7);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int iW0 = w0(charSequence);
        if (i7 > iW0) {
            return -1;
        }
        while (!n3.l.t(cArr[0], charSequence.charAt(i7), false)) {
            if (i7 == iW0) {
                return -1;
            }
            i7++;
        }
        return i7;
    }
}
