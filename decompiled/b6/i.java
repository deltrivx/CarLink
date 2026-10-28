package b6;

import java.util.EnumMap;
import n5.m;
import n5.n;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1545c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f1547b;

    public i(int i7) {
        switch (i7) {
            case 1:
                this.f1546a = new int[4];
                this.f1547b = new StringBuilder();
                break;
            default:
                this.f1546a = new int[4];
                this.f1547b = new StringBuilder();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    public m a(int i7, t5.a aVar, int[] iArr) throws n5.i {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb2 = this.f1547b;
        sb2.setLength(0);
        int[] iArr2 = this.f1546a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i10 = aVar.f12760b;
        int iF = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && iF < i10; i12++) {
            int iH = k.h(aVar, iArr2, iF, k.f1554g);
            sb2.append((char) ((iH % 10) + 48));
            for (int i13 : iArr2) {
                iF += i13;
            }
            if (iH >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                iF = aVar.f(aVar.e(iF));
            }
        }
        if (sb2.length() != 5) {
            throw n5.i.f8833c;
        }
        for (int i14 = 0; i14 < 10; i14++) {
            if (i11 == f1545c[i14]) {
                String string = sb2.toString();
                int length = string.length();
                int iCharAt = 0;
                for (int i15 = length - 2; i15 >= 0; i15 -= 2) {
                    iCharAt += string.charAt(i15) - '0';
                }
                int iCharAt2 = iCharAt * 3;
                for (int i16 = length - 1; i16 >= 0; i16 -= 2) {
                    iCharAt2 += string.charAt(i16) - '0';
                }
                if ((iCharAt2 * 3) % 10 != i14) {
                    throw n5.i.f8833c;
                }
                String string2 = sb2.toString();
                if (string2.length() == 5) {
                    char cCharAt = string2.charAt(0);
                    if (cCharAt == '0') {
                        str = "£";
                    } else if (cCharAt != '5') {
                        str = "";
                        if (cCharAt == '9') {
                            switch (string2) {
                                case "90000":
                                    str2 = null;
                                    break;
                                case "99990":
                                    str2 = "Used";
                                    break;
                                case "99991":
                                    str2 = "0.00";
                                    break;
                            }
                        }
                        if (str2 == null) {
                            enumMap = null;
                        } else {
                            enumMap = new EnumMap(n.class);
                            enumMap.put(n.f8848e, str2);
                        }
                    } else {
                        str = "$";
                    }
                    int i17 = Integer.parseInt(string2.substring(1));
                    String strValueOf = String.valueOf(i17 / 100);
                    int i18 = i17 % 100;
                    str2 = str + strValueOf + '.' + (i18 < 10 ? "0".concat(String.valueOf(i18)) : String.valueOf(i18));
                    if (str2 == null) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(n.class);
                        enumMap.put(n.f8848e, str2);
                    }
                } else {
                    enumMap = null;
                }
                float f10 = i7;
                m mVar = new m(string2, null, new o[]{new o((iArr[0] + iArr[1]) / 2.0f, f10), new o(iF, f10)}, n5.a.f8805q);
                if (enumMap != null) {
                    mVar.a(enumMap);
                }
                return mVar;
            }
        }
        throw n5.i.f8833c;
    }
}
