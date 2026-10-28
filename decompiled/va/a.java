package va;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        "true".equals(property);
    }

    public static byte[] a(String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i7 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i10 = 0;
                    while (i10 < length2) {
                        bArr[i7] = (byte) str2.charAt(i10);
                        i10++;
                        i7++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i11 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i12 = 0;
            while (i12 < length4) {
                bArr2[i11] = (byte) str4.charAt(i12);
                i12++;
                i11++;
            }
        }
        for (int i13 = 0; i13 < length3; i13++) {
            bArr2[i13] = (byte) ((bArr2[i13] + 127) & 127);
        }
        int i14 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i14];
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = i15 + 1;
            int i19 = i16 + 1;
            bArr3[i17] = (byte) (((bArr2[i15] & 255) >>> i16) + ((bArr2[i18] & ((1 << i19) - 1)) << (7 - i16)));
            if (i16 == 6) {
                i15 += 2;
                i16 = 0;
            } else {
                i15 = i18;
                i16 = i19;
            }
        }
        return bArr3;
    }
}
