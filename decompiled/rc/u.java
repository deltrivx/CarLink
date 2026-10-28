package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f12368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12369b;

    static {
        String[] strArr = new String[93];
        for (int i7 = 0; i7 < 32; i7++) {
            strArr[i7] = "\\u" + b(i7 >> 12) + b(i7 >> 8) + b(i7 >> 4) + b(i7);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f12368a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f12369b = bArr;
    }

    public static final void a(String str, StringBuilder sb2) {
        i9.l.e(str, "value");
        sb2.append('\"');
        int length = str.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            String[] strArr = f12368a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) str, i7, i10);
                sb2.append(strArr[cCharAt]);
                i7 = i10 + 1;
            }
        }
        if (i7 != 0) {
            sb2.append((CharSequence) str, i7, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final char b(int i7) {
        int i10 = i7 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
