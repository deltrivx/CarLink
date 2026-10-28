package ja;

import cc.s;
import da.c0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ka.f0;
import mb.k;
import x9.l;
import x9.r0;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6995a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f6999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7000f;

    public e(da.a aVar, l lVar, na.e eVar, int i7) {
        i9.l.e(aVar, "c");
        i9.l.e(eVar, "typeParameterOwner");
        this.f6997c = aVar;
        this.f6998d = lVar;
        this.f6996b = i7;
        ArrayList typeParameters = eVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        this.f6999e = linkedHashMap;
        this.f7000f = ((k) ((a) ((da.a) this.f6997c).f3847b).f6964a).c(new aa.a(11, this));
    }

    public e(String str) {
        i9.l.e(str, "source");
        g7.l lVar = new g7.l(4);
        lVar.f5999c = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        lVar.f6000d = iArr;
        lVar.f5998b = -1;
        this.f6997c = lVar;
        this.f6999e = new StringBuilder();
        this.f7000f = str;
    }

    public static /* synthetic */ void n(e eVar, String str, int i7, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i7 = eVar.f6996b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        eVar.m(str, str2, i7);
        throw null;
    }

    @Override // ja.f
    public r0 a(c0 c0Var) {
        i9.l.e(c0Var, "javaTypeParameter");
        f0 f0Var = (f0) ((f1.e) this.f7000f).invoke(c0Var);
        return f0Var != null ? f0Var : ((f) ((da.a) this.f6997c).f3848c).a(c0Var);
    }

    public int b(CharSequence charSequence, int i7) {
        int i10 = i7 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f6999e).append((char) (o(charSequence, i7 + 3) + (o(charSequence, i7) << 12) + (o(charSequence, i7 + 1) << 8) + (o(charSequence, i7 + 2) << 4)));
            return i10;
        }
        this.f6996b = i7;
        if (i10 < charSequence.length()) {
            return b(charSequence, this.f6996b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean c() {
        int i7 = this.f6996b;
        if (i7 == -1) {
            return false;
        }
        String str = (String) this.f7000f;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6996b = i7;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i7++;
        }
        this.f6996b = i7;
        return false;
    }

    public void d(int i7, String str) {
        String str2 = (String) this.f7000f;
        if (str2.length() - i7 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (str2.charAt(i7 + i10) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f6996b = str.length() + i7;
    }

    public String e() {
        StringBuilder sb2 = (StringBuilder) this.f6999e;
        String str = (String) this.f7000f;
        h('\"');
        int i7 = this.f6996b;
        int iZ0 = j.z0(str, '\"', i7, 4);
        if (iZ0 == -1) {
            k();
            int i10 = this.f6996b;
            n(this, a2.f.G("Expected quotation mark '\"', but had '", (i10 == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10)), "' instead"), i10, null, 4);
            throw null;
        }
        int i11 = i7;
        while (i11 < iZ0) {
            if (str.charAt(i11) == '\\') {
                int iS = this.f6996b;
                char cCharAt = str.charAt(i11);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iS, i11);
                        int iS2 = s(i11 + 1);
                        if (iS2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iB = iS2 + 1;
                        char cCharAt2 = str.charAt(iS2);
                        if (cCharAt2 == 'u') {
                            iB = b(str, iB);
                        } else {
                            char c10 = cCharAt2 < 'u' ? rc.d.f12318a[cCharAt2] : (char) 0;
                            if (c10 == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c10);
                        }
                        iS = s(iB);
                        if (iS == -1) {
                            n(this, "Unexpected EOF", iS, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            sb2.append((CharSequence) str, iS, i11);
                            iS = s(i11);
                            if (iS == -1) {
                                n(this, "Unexpected EOF", iS, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i11);
                    }
                    i11 = iS;
                    z10 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z10 ? str.subSequence(iS, i11).toString() : l(iS, i11);
                this.f6996b = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f6996b = iZ0 + 1;
        String strSubstring = str.substring(i7, iZ0);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte f() {
        String str = (String) this.f7000f;
        int i7 = this.f6996b;
        while (i7 != -1 && i7 < str.length()) {
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6996b = i10;
                return rc.j.g(cCharAt);
            }
            i7 = i10;
        }
        this.f6996b = str.length();
        return (byte) 10;
    }

    public byte g(byte b10) {
        String str = (String) this.f7000f;
        byte bF = f();
        if (bF == b10) {
            return bF;
        }
        String strP = rc.j.p(b10);
        int i7 = this.f6996b;
        int i10 = i7 - 1;
        n(this, "Expected " + strP + ", but had '" + ((i7 == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10))) + "' instead", i10, null, 4);
        throw null;
    }

    public void h(char c10) {
        int i7 = this.f6996b;
        if (i7 == -1) {
            v(c10);
            throw null;
        }
        String str = (String) this.f7000f;
        while (i7 < str.length()) {
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6996b = i10;
                if (cCharAt == c10) {
                    return;
                }
                v(c10);
                throw null;
            }
            i7 = i10;
        }
        this.f6996b = -1;
        v(c10);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long i() {
        boolean z10;
        boolean z11;
        long j5;
        double dPow;
        int iS = s(t());
        String str = (String) this.f7000f;
        ?? r8 = 0;
        if (iS >= str.length() || iS == -1) {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iS) == '\"') {
            iS++;
            if (iS == str.length()) {
                n(this, "EOF", 0, null, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = iS;
        long j10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        long j11 = 0;
        while (true) {
            if (i7 == str.length()) {
                z11 = z10;
                break;
            }
            char cCharAt = str.charAt(i7);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z13) {
                if (i7 == iS) {
                    n(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r8, 6);
                    throw r8;
                }
                i7++;
                z12 = true;
                z13 = true;
            } else if (cCharAt == '-' && z13) {
                if (i7 == iS) {
                    n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                    throw null;
                }
                i7++;
                r8 = 0;
                z12 = false;
            } else if (cCharAt != '+' || !z13) {
                z11 = z10;
                if (cCharAt != '-') {
                    if (rc.j.g(cCharAt) != 0) {
                        break;
                    }
                    i7++;
                    int i10 = cCharAt - '0';
                    if (i10 < 0 || i10 >= 10) {
                        n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    if (z13) {
                        j10 = (j10 * ((long) 10)) + ((long) i10);
                    } else {
                        j11 = (j11 * ((long) 10)) - ((long) i10);
                        if (j11 > 0) {
                            n(this, "Numeric value overflow", 0, null, 6);
                            throw null;
                        }
                    }
                    z10 = z11;
                    r8 = 0;
                } else {
                    if (i7 != iS) {
                        n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i7++;
                    z10 = z11;
                    r8 = 0;
                    z14 = true;
                }
            } else {
                if (i7 == iS) {
                    n(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                    throw null;
                }
                i7++;
                r8 = 0;
                z12 = true;
            }
        }
        boolean z15 = i7 != iS;
        if (iS == i7 || (z14 && iS == i7 - 1)) {
            n(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z11) {
            if (!z15) {
                n(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i7) != '\"') {
                n(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i7++;
        }
        this.f6996b = i7;
        long j12 = j11;
        if (z13) {
            double d10 = j12;
            if (!z12) {
                dPow = Math.pow(10.0d, -j10);
            } else {
                if (!z12) {
                    throw new s();
                }
                dPow = Math.pow(10.0d, j10);
            }
            double d11 = d10 * dPow;
            if (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d11) != d11) {
                n(this, "Can't convert " + d11 + " to Long", 0, null, 6);
                throw null;
            }
            j5 = (long) d11;
        } else {
            j5 = j12;
        }
        if (z14) {
            return j5;
        }
        if (j5 != Long.MIN_VALUE) {
            return -j5;
        }
        n(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.f6998d;
        if (str == null) {
            return e();
        }
        i9.l.b(str);
        this.f6998d = null;
        return str;
    }

    public String k() {
        String str = (String) this.f7000f;
        String str2 = (String) this.f6998d;
        if (str2 != null) {
            i9.l.b(str2);
            this.f6998d = null;
            return str2;
        }
        int iT = t();
        if (iT >= str.length() || iT == -1) {
            n(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bG = rc.j.g(str.charAt(iT));
        if (bG == 1) {
            return j();
        }
        if (bG != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (rc.j.g(str.charAt(iT)) == 0) {
            iT++;
            if (iT >= str.length()) {
                ((StringBuilder) this.f6999e).append((CharSequence) str, this.f6996b, iT);
                int iS = s(iT);
                if (iS == -1) {
                    this.f6996b = iT;
                    return l(0, 0);
                }
                iT = iS;
                z10 = true;
            }
        }
        String string = !z10 ? str.subSequence(this.f6996b, iT).toString() : l(this.f6996b, iT);
        this.f6996b = iT;
        return string;
    }

    public String l(int i7, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f6999e;
        sb2.append((CharSequence) this.f7000f, i7, i10);
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void m(String str, String str2, int i7) {
        i9.l.e(str, "message");
        i9.l.e(str2, "hint");
        throw rc.j.e(str + " at path: " + ((g7.l) this.f6997c).e() + (str2.length() == 0 ? "" : "\n".concat(str2)), (String) this.f7000f, i7);
    }

    public int o(CharSequence charSequence, int i7) {
        char cCharAt = charSequence.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String p(String str) {
        i9.l.e(str, "keyToMatch");
        int i7 = this.f6996b;
        try {
            if (f() == 6 && i9.l.a(r(), str)) {
                this.f6998d = null;
                if (f() == 5) {
                    return r();
                }
            }
            return null;
        } finally {
            this.f6996b = i7;
            this.f6998d = null;
        }
    }

    public byte q() {
        String str = (String) this.f7000f;
        int i7 = this.f6996b;
        while (true) {
            int iS = s(i7);
            if (iS == -1) {
                this.f6996b = iS;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iS);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f6996b = iS;
                return rc.j.g(cCharAt);
            }
            i7 = iS + 1;
        }
    }

    public String r() {
        if (q() != 1) {
            return null;
        }
        String strJ = j();
        this.f6998d = strJ;
        return strJ;
    }

    public int s(int i7) {
        if (i7 < ((String) this.f7000f).length()) {
            return i7;
        }
        return -1;
    }

    public int t() {
        char cCharAt;
        int i7 = this.f6996b;
        if (i7 == -1) {
            return i7;
        }
        String str = (String) this.f7000f;
        while (i7 < str.length() && ((cCharAt = str.charAt(i7)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i7++;
        }
        this.f6996b = i7;
        return i7;
    }

    public String toString() {
        switch (this.f6995a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f7000f);
                sb2.append("', currentPosition=");
                return a2.f.H(sb2, this.f6996b, ')');
            default:
                return super.toString();
        }
    }

    public boolean u() {
        int iT = t();
        String str = (String) this.f7000f;
        if (iT >= str.length() || iT == -1 || str.charAt(iT) != ',') {
            return false;
        }
        this.f6996b++;
        return true;
    }

    public void v(char c10) {
        String str = (String) this.f7000f;
        int i7 = this.f6996b;
        if (i7 > 0 && c10 == '\"') {
            try {
                this.f6996b = i7 - 1;
                String strK = k();
                this.f6996b = i7;
                if (i9.l.a(strK, "null")) {
                    m("Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", this.f6996b - 1);
                    throw null;
                }
            } catch (Throwable th) {
                this.f6996b = i7;
                throw th;
            }
        }
        String strP = rc.j.p(rc.j.g(c10));
        int i10 = this.f6996b;
        int i11 = i10 - 1;
        n(this, "Expected " + strP + ", but had '" + ((i10 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11))) + "' instead", i11, null, 4);
        throw null;
    }
}
