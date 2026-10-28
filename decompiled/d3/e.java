package d3;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.google.protobuf.q;
import com.google.protobuf.s;
import i9.l;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;
import l4.j;
import n8.k;
import p.t0;
import p.x0;
import p.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3764e;

    public /* synthetic */ e() {
        this.f3760a = 1;
    }

    public e(OutputStream outputStream, byte[] bArr) {
        this.f3760a = 3;
        this.f3764e = outputStream;
        this.f3763d = bArr;
        this.f3762c = 0;
        this.f3761b = bArr.length;
    }

    public e(CharSequence charSequence, int i7, Locale locale) {
        this.f3760a = 0;
        this.f3763d = charSequence;
        if (charSequence.length() < 0) {
            h3.a.a("input start index is outside the CharSequence");
        }
        if (i7 < 0 || i7 > charSequence.length()) {
            h3.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f3764e = wordInstance;
        this.f3761b = Math.max(0, -50);
        this.f3762c = Math.min(charSequence.length(), i7 + 50);
        wordInstance.setText(new c3.d(charSequence, i7));
    }

    public e(y0 y0Var, int i7, int i10, WeakReference weakReference) {
        this.f3760a = 2;
        this.f3764e = y0Var;
        this.f3761b = i7;
        this.f3762c = i10;
        this.f3763d = weakReference;
    }

    public static int c(int i7, int i10) {
        return e(i10) + j(i7);
    }

    public static int d(int i7, int i10) {
        return e(i10) + j(i7);
    }

    public static int e(int i7) {
        if (i7 >= 0) {
            return h(i7);
        }
        return 10;
    }

    public static int f(int i7, xa.a aVar) {
        return g(aVar) + j(i7);
    }

    public static int g(xa.a aVar) {
        int iA = aVar.a();
        return h(iA) + iA;
    }

    public static int h(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int i(long j5) {
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (((-16384) & j5) == 0) {
            return 2;
        }
        if (((-2097152) & j5) == 0) {
            return 3;
        }
        if (((-268435456) & j5) == 0) {
            return 4;
        }
        if (((-34359738368L) & j5) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j5) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j5) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j5) == 0) {
            return 8;
        }
        return (j5 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int j(int i7) {
        return h(i7 << 3);
    }

    public static e s(OutputStream outputStream, int i7) {
        return new e(outputStream, new byte[i7]);
    }

    public void A(int i7, int i10) throws IOException {
        L(i7, 0);
        B(i10);
    }

    public void B(int i7) throws IOException {
        if (i7 >= 0) {
            J(i7);
        } else {
            K(i7);
        }
    }

    public void C(int i7, xa.a aVar) throws IOException {
        L(i7, 2);
        D(aVar);
    }

    public void D(xa.a aVar) throws IOException {
        J(aVar.a());
        aVar.d(this);
    }

    public void E(int i7) throws IOException {
        byte b10 = (byte) i7;
        if (this.f3762c == this.f3761b) {
            x();
        }
        byte[] bArr = (byte[]) this.f3763d;
        int i10 = this.f3762c;
        this.f3762c = i10 + 1;
        bArr[i10] = b10;
    }

    public void F(xa.d dVar) throws IOException {
        int size = dVar.size();
        byte[] bArr = (byte[]) this.f3763d;
        int i7 = this.f3761b;
        int i10 = this.f3762c;
        int i11 = i7 - i10;
        if (i11 >= size) {
            dVar.k(0, bArr, i10, size);
            this.f3762c += size;
            return;
        }
        dVar.k(0, bArr, i10, i11);
        int i12 = size - i11;
        this.f3762c = i7;
        x();
        if (i12 <= i7) {
            dVar.k(i11, bArr, 0, i12);
            this.f3762c = i12;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f3764e;
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i11 + i12;
        if (i13 <= dVar.size()) {
            if (i12 > 0) {
                dVar.w(outputStream, i11, i12);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public void G(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f3763d;
        int i7 = this.f3761b;
        int i10 = this.f3762c;
        int i11 = i7 - i10;
        if (i11 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.f3762c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i11);
        int i12 = length - i11;
        this.f3762c = i7;
        x();
        if (i12 > i7) {
            ((OutputStream) this.f3764e).write(bArr, i11, i12);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f3762c = i12;
        }
    }

    public void H(int i7) throws IOException {
        E(i7 & 255);
        E((i7 >> 8) & 255);
        E((i7 >> 16) & 255);
        E((i7 >> 24) & 255);
    }

    public void I(long j5) throws IOException {
        E(((int) j5) & 255);
        E(((int) (j5 >> 8)) & 255);
        E(((int) (j5 >> 16)) & 255);
        E(((int) (j5 >> 24)) & 255);
        E(((int) (j5 >> 32)) & 255);
        E(((int) (j5 >> 40)) & 255);
        E(((int) (j5 >> 48)) & 255);
        E(((int) (j5 >> 56)) & 255);
    }

    public void J(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            E((i7 & 127) | 128);
            i7 >>>= 7;
        }
        E(i7);
    }

    public void K(long j5) throws IOException {
        while (((-128) & j5) != 0) {
            E((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        E((int) j5);
    }

    public void L(int i7, int i10) throws IOException {
        J((i7 << 3) | i10);
    }

    public void a(int i7) {
        new Handler(Looper.getMainLooper()).post(new k(i7, this));
    }

    public void b(int i7) {
        int i10 = this.f3761b;
        int i11 = this.f3762c;
        boolean z10 = false;
        if (i7 <= i11 && i10 <= i7) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        h3.a.a("Invalid offset: " + i7 + ". Valid range is [" + i10 + " , " + i11 + ']');
    }

    public void k() throws IOException {
        if (((OutputStream) this.f3764e) != null) {
            x();
        }
    }

    public int l() {
        q qVar = (q) this.f3764e;
        if (qVar == null) {
            return ((String) this.f3763d).length();
        }
        return (qVar.f2834b - qVar.a()) + (((String) this.f3763d).length() - (this.f3762c - this.f3761b));
    }

    public boolean m(int i7) {
        CharSequence charSequence = (CharSequence) this.f3763d;
        int i10 = this.f3761b + 1;
        if (i7 > this.f3762c || i10 > i7) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i7))) {
            int i11 = i7 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i11))) {
                if (!j.d()) {
                    return false;
                }
                j jVarA = j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i11) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean n(int i7) {
        int i10 = this.f3761b + 1;
        if (i7 > this.f3762c || i10 > i7) {
            return false;
        }
        return i2.c.O(Character.codePointBefore((CharSequence) this.f3763d, i7));
    }

    public boolean o(int i7) {
        b(i7);
        if (!((BreakIterator) this.f3764e).isBoundary(i7)) {
            return false;
        }
        if (q(i7) && q(i7 - 1) && q(i7 + 1)) {
            return false;
        }
        return i7 <= 0 || i7 >= ((CharSequence) this.f3763d).length() - 1 || !(p(i7) || p(i7 + 1));
    }

    public boolean p(int i7) {
        CharSequence charSequence = (CharSequence) this.f3763d;
        int i10 = i7 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (l.a(unicodeBlockOf, unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i7)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return l.a(Character.UnicodeBlock.of(charSequence.charAt(i7)), unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean q(int i7) {
        CharSequence charSequence = (CharSequence) this.f3763d;
        int i10 = this.f3761b;
        if (i7 >= this.f3762c || i10 > i7) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i7)) && !Character.isSurrogate(charSequence.charAt(i7))) {
            if (!j.d()) {
                return false;
            }
            j jVarA = j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i7) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean r(int i7) {
        int i10 = this.f3761b;
        if (i7 >= this.f3762c || i10 > i7) {
            return false;
        }
        return i2.c.O(Character.codePointAt((CharSequence) this.f3763d, i7));
    }

    public int t(int i7) {
        b(i7);
        int iFollowing = ((BreakIterator) this.f3764e).following(i7);
        return (q(iFollowing + (-1)) && q(iFollowing) && !p(iFollowing)) ? t(iFollowing) : iFollowing;
    }

    public String toString() {
        switch (this.f3760a) {
            case 1:
                q qVar = (q) this.f3764e;
                if (qVar == null) {
                    return (String) this.f3763d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f3763d, 0, this.f3761b);
                sb2.append((char[]) qVar.f2837e, 0, qVar.f2835c);
                char[] cArr = (char[]) qVar.f2837e;
                int i7 = qVar.f2836d;
                sb2.append(cArr, i7, qVar.f2834b - i7);
                String str = (String) this.f3763d;
                sb2.append((CharSequence) str, this.f3762c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i7) {
    }

    public void v(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f3761b) != -1) {
            typeface = x0.a(typeface, i7, (this.f3762c & 2) != 0);
        }
        y0 y0Var = (y0) this.f3764e;
        WeakReference weakReference = (WeakReference) this.f3763d;
        if (y0Var.f9984m) {
            y0Var.f9983l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new t0(y0Var.f9982j, 0, textView, typeface));
                } else {
                    textView.setTypeface(typeface, y0Var.f9982j);
                }
            }
        }
    }

    public int w(int i7) {
        b(i7);
        int iPreceding = ((BreakIterator) this.f3764e).preceding(i7);
        return (q(iPreceding) && m(iPreceding) && !p(iPreceding)) ? w(iPreceding) : iPreceding;
    }

    public void x() throws IOException {
        OutputStream outputStream = (OutputStream) this.f3764e;
        if (outputStream == null) {
            throw new s("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f3763d, 0, this.f3762c);
        this.f3762c = 0;
    }

    public void y(String str, int i7, int i10) {
        if (i7 > i10) {
            h3.a.a("start index must be less than or equal to end index: " + i7 + " > " + i10);
        }
        if (i7 < 0) {
            h3.a.a("start must be non-negative, but was " + i7);
        }
        q qVar = (q) this.f3764e;
        if (qVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i7, 64);
            int iMin2 = Math.min(((String) this.f3763d).length() - i10, 64);
            String str2 = (String) this.f3763d;
            int i11 = i7 - iMin;
            l.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i11, i7, cArr, 0);
            String str3 = (String) this.f3763d;
            int i12 = iMax - iMin2;
            int i13 = iMin2 + i10;
            l.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i10, i13, cArr, i12);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            q qVar2 = new q();
            qVar2.f2834b = iMax;
            qVar2.f2837e = cArr;
            qVar2.f2835c = length;
            qVar2.f2836d = i12;
            this.f3764e = qVar2;
            this.f3761b = i11;
            this.f3762c = i13;
            return;
        }
        int i14 = this.f3761b;
        int i15 = i7 - i14;
        int i16 = i10 - i14;
        if (i15 < 0 || i16 > qVar.f2834b - qVar.a()) {
            this.f3763d = toString();
            this.f3764e = null;
            this.f3761b = -1;
            this.f3762c = -1;
            y(str, i7, i10);
            return;
        }
        int length2 = str.length() - (i16 - i15);
        if (length2 > qVar.a()) {
            int iA = length2 - qVar.a();
            int i17 = qVar.f2834b;
            do {
                i17 *= 2;
            } while (i17 - qVar.f2834b < iA);
            char[] cArr2 = new char[i17];
            u8.l.n0((char[]) qVar.f2837e, cArr2, 0, 0, qVar.f2835c);
            int i18 = qVar.f2834b;
            int i19 = qVar.f2836d;
            int i20 = i18 - i19;
            int i21 = i17 - i20;
            u8.l.n0((char[]) qVar.f2837e, cArr2, i21, i19, i20 + i19);
            qVar.f2837e = cArr2;
            qVar.f2834b = i17;
            qVar.f2836d = i21;
        }
        int i22 = qVar.f2835c;
        if (i15 < i22 && i16 <= i22) {
            int i23 = i22 - i16;
            char[] cArr3 = (char[]) qVar.f2837e;
            u8.l.n0(cArr3, cArr3, qVar.f2836d - i23, i16, i22);
            qVar.f2835c = i15;
            qVar.f2836d -= i23;
        } else if (i15 >= i22 || i16 < i22) {
            int iA2 = qVar.a() + i15;
            int iA3 = qVar.a() + i16;
            int i24 = qVar.f2836d;
            char[] cArr4 = (char[]) qVar.f2837e;
            u8.l.n0(cArr4, cArr4, qVar.f2835c, i24, iA2);
            qVar.f2835c += iA2 - i24;
            qVar.f2836d = iA3;
        } else {
            qVar.f2836d = qVar.a() + i16;
            qVar.f2835c = i15;
        }
        str.getChars(0, str.length(), (char[]) qVar.f2837e, qVar.f2835c);
        qVar.f2835c = str.length() + qVar.f2835c;
    }

    public void z(int i7, int i10) throws IOException {
        L(i7, 0);
        B(i10);
    }
}
