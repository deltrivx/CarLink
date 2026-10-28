package a2;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import cc.p1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e2.a0;
import e2.b0;
import e2.m;
import e2.o;
import e2.p;
import e2.r;
import e2.s;
import e2.t;
import e2.u;
import e2.w;
import e2.x;
import e2.y;
import e2.z;
import e4.v;
import f1.k1;
import f1.w2;
import h0.i0;
import h9.n;
import i9.l;
import java.util.ArrayList;
import java.util.List;
import o9.e0;
import s.q;
import x9.d0;
import x9.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class d implements c7.a, e4.c, e4.e, fc.d, jb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20b;

    public d(int i7) {
        this.f19a = i7;
        switch (i7) {
            case 13:
                this.f20b = Build.VERSION.SDK_INT >= 28 ? new kb.d(17) : new kb.d(18);
                break;
            case 14:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f20b = new f4.g(this);
                } else {
                    this.f20b = new f4.h(this);
                }
                break;
            case 23:
                this.f20b = h6.a.f6437e;
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                this.f20b = new q((Object) null);
                break;
            default:
                this.f20b = new Bundle();
                break;
        }
    }

    public /* synthetic */ d(int i7, Object obj) {
        this.f19a = i7;
        this.f20b = obj;
    }

    public d(ClipData clipData, int i7) {
        this.f19a = 5;
        this.f20b = c3.c.e(clipData, i7);
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f19a = 21;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f20b = new g4.h(uri, clipDescription, uri2);
        } else {
            this.f20b = new b(uri, clipDescription, uri2, 8);
        }
    }

    public d(ContentInfo contentInfo) {
        this.f19a = 6;
        contentInfo.getClass();
        this.f20b = c3.c.g(contentInfo);
    }

    public d(View view) {
        this.f19a = 8;
        if (Build.VERSION.SDK_INT < 30) {
            this.f20b = new d(7, view);
            return;
        }
        v vVar = new v(7, view);
        vVar.f4411c = view;
        this.f20b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(n nVar) {
        this.f19a = 18;
        this.f20b = (a9.i) nVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0210  */
    /* JADX WARN: Code duplicated, block: B:132:0x0220  */
    /* JADX WARN: Code duplicated, block: B:135:0x0226  */
    /* JADX WARN: Code duplicated, block: B:136:0x022b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0235  */
    /* JADX WARN: Code duplicated, block: B:142:0x0243  */
    /* JADX WARN: Code duplicated, block: B:144:0x024d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0269  */
    /* JADX WARN: Code duplicated, block: B:152:0x0270  */
    /* JADX WARN: Code duplicated, block: B:154:0x0277  */
    /* JADX WARN: Code duplicated, block: B:156:0x0281  */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03de  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:221:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:327:0x040f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bf  */
    public static ArrayList s(d dVar, String str) {
        int i7;
        int i10;
        char cCharAt;
        char c10;
        int i11;
        char c11;
        char cCharAt2;
        int i12;
        int i13;
        int i14;
        char c12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j5;
        boolean z10;
        long j10;
        int iFloatToRawIntBits;
        float f10;
        char cCharAt3;
        int i21;
        char cCharAt4;
        long j11;
        int i22;
        char cCharAt5;
        int i23;
        int i24;
        char c13;
        char c14;
        int i25;
        char cCharAt6;
        boolean z11;
        char cCharAt7;
        int i26;
        int i27;
        int i28;
        char cCharAt8;
        long jFloatToRawIntBits;
        int i29;
        long jFloatToRawIntBits2;
        float fIntBitsToFloat;
        float[] fArr;
        int i30;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i31 = 0;
        while (true) {
            i7 = 32;
            if (i31 >= length || l.f(str.charAt(i31), 32) > 0) {
                break;
            }
            i31++;
        }
        while (length > i31 && l.f(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i32 = 0;
        while (i31 < length) {
            while (true) {
                i10 = i31 + 1;
                cCharAt = str.charAt(i31);
                int i33 = cCharAt | ' ';
                if ((i33 - 122) * (i33 - 97) > 0 || i33 == 101) {
                    if (i10 >= length) {
                        cCharAt = 0;
                    } else {
                        i31 = i10;
                    }
                }
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i32 = 0;
                    while (true) {
                        if (i10 >= length || l.f(str.charAt(i10), i7) > 0) {
                            long j12 = 4294967295L;
                            if (i10 == length) {
                                i11 = i32;
                                jFloatToRawIntBits2 = (((long) i10) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                c11 = ' ';
                            } else {
                                i11 = i32;
                                char cCharAt9 = str.charAt(i10);
                                boolean z12 = cCharAt9 == '-';
                                c11 = ' ';
                                if (z12) {
                                    i12 = i10 + 1;
                                    if (i12 == length) {
                                        jFloatToRawIntBits2 = (((long) i12) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                    } else {
                                        c10 = 1;
                                        cCharAt2 = str.charAt(i12);
                                        j12 = 4294967295L;
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j10 = ((long) i12) << 32;
                                            jFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        jFloatToRawIntBits2 = j10 | (jFloatToRawIntBits & j12);
                                        i10 = (int) (jFloatToRawIntBits2 >>> c11);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            i32 = i11;
                                        } else {
                                            fArr = (float[]) dVar.f20b;
                                            i30 = i11 + 1;
                                            fArr[i11] = fIntBitsToFloat;
                                            if (i30 >= fArr.length) {
                                                float[] fArr2 = new float[i30 * 2];
                                                dVar.f20b = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                            i32 = i30;
                                        }
                                        while (i10 < length && str.charAt(i10) == ',') {
                                            i10++;
                                        }
                                        if (i10 >= length && !Float.isNaN(fIntBitsToFloat)) {
                                            i7 = 32;
                                        }
                                    }
                                } else {
                                    j12 = 4294967295L;
                                    c10 = 1;
                                    cCharAt2 = cCharAt9;
                                    i12 = i10;
                                }
                                int length2 = str.length();
                                int i34 = i12;
                                long j13 = 0;
                                while (i34 != length) {
                                    int i35 = cCharAt2 - '0';
                                    if (((char) i35) < '\n') {
                                        int i36 = i10;
                                        j13 = (j13 * 10) + ((long) i35);
                                        i34++;
                                        cCharAt2 = i34 < length2 ? str.charAt(i34) : (char) 0;
                                        i10 = i36;
                                    } else {
                                        i13 = i10;
                                        i14 = i34 - i12;
                                        if (i34 == length && cCharAt2 == '.') {
                                            int i37 = i34 + 1;
                                            i15 = i37;
                                            c12 = 16;
                                            while (true) {
                                                if (length - i15 >= 4) {
                                                    i29 = i37;
                                                    long jCharAt = ((long) str.charAt(i15)) | (((long) str.charAt(i15 + 1)) << 16) | (((long) str.charAt(i15 + 2)) << 32) | (((long) str.charAt(i15 + 3)) << 48);
                                                    long j14 = jCharAt - 13511005043687472L;
                                                    int i38 = (((jCharAt + 19703549022044230L) | j14) & (-35747867511423104L)) != 0 ? -1 : (int) ((j14 * 281475406208040961L) >>> 48);
                                                    if (i38 >= 0) {
                                                        j13 = (j13 * 10000) + ((long) i38);
                                                        i15 += 4;
                                                        i37 = i29;
                                                    }
                                                } else {
                                                    i29 = i37;
                                                }
                                            }
                                            char cCharAt10 = i15 < length2 ? str.charAt(i15) : (char) 0;
                                            while (true) {
                                                cCharAt2 = cCharAt10;
                                                while (true) {
                                                    if (i15 != length) {
                                                        int i39 = cCharAt2 - '0';
                                                        if (((char) i39) < '\n') {
                                                            j13 = (j13 * 10) + ((long) i39);
                                                            i15++;
                                                            if (i15 < length2) {
                                                                cCharAt10 = str.charAt(i15);
                                                            } else {
                                                                cCharAt2 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int i40 = i29 - i15;
                                            i14 -= i40;
                                            i17 = i40;
                                            i16 = i29;
                                        } else {
                                            c12 = 16;
                                            i15 = i34;
                                            i16 = i15;
                                            i17 = 0;
                                        }
                                        if (i14 == 0) {
                                            j10 = ((long) i15) << 32;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                        } else {
                                            if ((cCharAt2 | ' ') == 101) {
                                                i18 = i15 + 1;
                                                if (i18 < length2) {
                                                    cCharAt6 = str.charAt(i18);
                                                } else {
                                                    cCharAt6 = 0;
                                                }
                                                if (cCharAt6 == '-') {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11 || cCharAt6 == '+') {
                                                    i18 = i15 + 2;
                                                }
                                                cCharAt7 = str.charAt(i18);
                                                i26 = 0;
                                                while (true) {
                                                    if (i18 != length) {
                                                        i28 = cCharAt7 - '0';
                                                        i27 = i17;
                                                        if (((char) i28) < '\n') {
                                                            if (i26 < 1024) {
                                                                i26 = (i26 * 10) + i28;
                                                            }
                                                            i18++;
                                                            if (i18 < length2) {
                                                                cCharAt8 = str.charAt(i18);
                                                            } else {
                                                                cCharAt8 = 0;
                                                            }
                                                            cCharAt7 = cCharAt8;
                                                            i17 = i27;
                                                        }
                                                    } else {
                                                        i27 = i17;
                                                    }
                                                }
                                                if (z11) {
                                                    i19 = -i26;
                                                } else {
                                                    i19 = i26;
                                                }
                                                i17 = i27 + i19;
                                            } else {
                                                i18 = i15;
                                                i19 = 0;
                                            }
                                            i20 = 19;
                                            if (i14 > 19) {
                                                cCharAt3 = str.charAt(i12);
                                                i21 = i12;
                                                while (i18 != length) {
                                                    if (cCharAt3 != '0' || cCharAt3 == '.') {
                                                        if (cCharAt3 == '0') {
                                                            i14--;
                                                        }
                                                        i25 = i21 + 1;
                                                        if (i25 < length2) {
                                                            cCharAt3 = str.charAt(i25);
                                                        } else {
                                                            cCharAt3 = 0;
                                                        }
                                                        i21 = i25;
                                                        i20 = 19;
                                                    } else {
                                                        i20 = 19;
                                                        if (i14 > i20) {
                                                            cCharAt4 = str.charAt(i12);
                                                            j11 = 0;
                                                            while (true) {
                                                                i22 = i12;
                                                                if (i12 != i34) {
                                                                    c14 = cCharAt4;
                                                                    if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                        j11 = (j11 * 10) + ((long) (c14 - '0'));
                                                                        i12 = i22 + 1;
                                                                        cCharAt4 = i12 < length2 ? str.charAt(i12) : (char) 0;
                                                                    }
                                                                }
                                                            }
                                                            if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                                i17 = (i34 - i22) + i19;
                                                            } else {
                                                                cCharAt5 = str.charAt(i16);
                                                                i23 = i16;
                                                                while (true) {
                                                                    if (i23 != i15) {
                                                                        c13 = cCharAt5;
                                                                        i24 = i23;
                                                                        if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                            j11 = (j11 * 10) + ((long) (c13 - '0'));
                                                                            i23 = i24 + 1;
                                                                            cCharAt5 = i23 < length2 ? str.charAt(i23) : (char) 0;
                                                                        }
                                                                    } else {
                                                                        i24 = i23;
                                                                    }
                                                                }
                                                                i17 = (i16 - i24) + i19;
                                                            }
                                                            j5 = j11;
                                                            z10 = true;
                                                        } else {
                                                            j5 = j13;
                                                            z10 = false;
                                                        }
                                                    }
                                                }
                                                if (i14 > i20) {
                                                    cCharAt4 = str.charAt(i12);
                                                    j11 = 0;
                                                    while (true) {
                                                        i22 = i12;
                                                        if (i12 != i34) {
                                                            c14 = cCharAt4;
                                                            if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j11 = (j11 * 10) + ((long) (c14 - '0'));
                                                                i12 = i22 + 1;
                                                                if (i12 < length2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i17 = (i34 - i22) + i19;
                                                    } else {
                                                        cCharAt5 = str.charAt(i16);
                                                        i23 = i16;
                                                        while (true) {
                                                            if (i23 != i15) {
                                                                c13 = cCharAt5;
                                                                i24 = i23;
                                                                if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j11 = (j11 * 10) + ((long) (c13 - '0'));
                                                                    i23 = i24 + 1;
                                                                    if (i23 < length2) {
                                                                    }
                                                                }
                                                            } else {
                                                                i24 = i23;
                                                            }
                                                        }
                                                        i17 = (i16 - i24) + i19;
                                                    }
                                                    j5 = j11;
                                                    z10 = true;
                                                } else {
                                                    j5 = j13;
                                                    z10 = false;
                                                }
                                            } else {
                                                j5 = j13;
                                                z10 = false;
                                            }
                                            if (-10 > i17 && i17 < 11 && !z10 && Long.compare(j5 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                float f11 = j5;
                                                float[] fArr3 = e2.b.f4101a;
                                                float f12 = i17 < 0 ? f11 / fArr3[-i17] : f11 * fArr3[i17];
                                                if (z12) {
                                                    f12 = -f12;
                                                }
                                                j10 = ((long) i18) << 32;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(f12);
                                            } else if (j5 == 0) {
                                                if (z12) {
                                                    f10 = -0.0f;
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                j10 = ((long) i18) << 32;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                                            } else if (-126 <= i17 || i17 >= 128) {
                                                String strSubstring = str.substring(i13, i18);
                                                l.d(strSubstring, "substring(...)");
                                                j10 = ((long) i18) << 32;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring));
                                            } else {
                                                long j15 = e2.b.f4102b[i17 + 325];
                                                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j5);
                                                long j16 = j5 << iNumberOfLeadingZeros;
                                                long j17 = j16 & j12;
                                                long j18 = j16 >>> 32;
                                                long j19 = j15 & j12;
                                                long j20 = j15 >>> 32;
                                                long j21 = j18 * j20;
                                                long j22 = j20 * j17;
                                                long j23 = j21 + ((((j18 * j19) + ((j17 * j19) >>> 32)) + (j22 & j12)) >>> 32) + (j22 >>> 32);
                                                int i41 = (int) (j23 >>> 63);
                                                long j24 = j23 >>> (i41 + 9);
                                                int i42 = iNumberOfLeadingZeros + (i41 ^ 1);
                                                long j25 = j23 & 511;
                                                if (j25 == 511 || (j25 == 0 && (j24 & 3) == 1)) {
                                                    String strSubstring2 = str.substring(i13, i18);
                                                    l.d(strSubstring2, "substring(...)");
                                                    j10 = ((long) i18) << 32;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring2));
                                                } else {
                                                    long j26 = (j24 + 1) >>> c10;
                                                    if (j26 >= 9007199254740992L) {
                                                        i42--;
                                                        j26 = 4503599627370496L;
                                                    }
                                                    long j27 = j26 & (-4503599627370497L);
                                                    long j28 = ((((((long) i17) * 217706) >> c12) + ((long) 1024)) + ((long) 63)) - ((long) i42);
                                                    if (j28 < 1 || j28 > 2046) {
                                                        String strSubstring3 = str.substring(i13, i18);
                                                        l.d(strSubstring3, "substring(...)");
                                                        j10 = ((long) i18) << 32;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                                    } else {
                                                        j10 = ((long) i18) << 32;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j28 << 52) | j27 | (z12 ? Long.MIN_VALUE : 0L)));
                                                    }
                                                }
                                            }
                                        }
                                        jFloatToRawIntBits = iFloatToRawIntBits;
                                        jFloatToRawIntBits2 = j10 | (jFloatToRawIntBits & j12);
                                        i10 = (int) (jFloatToRawIntBits2 >>> c11);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            fArr = (float[]) dVar.f20b;
                                            i30 = i11 + 1;
                                            fArr[i11] = fIntBitsToFloat;
                                            if (i30 >= fArr.length) {
                                                float[] fArr4 = new float[i30 * 2];
                                                dVar.f20b = fArr4;
                                                System.arraycopy(fArr, 0, fArr4, 0, fArr.length);
                                            }
                                            i32 = i30;
                                        } else {
                                            i32 = i11;
                                        }
                                        while (i10 < length) {
                                            i10++;
                                        }
                                        if (i10 >= length) {
                                        }
                                    }
                                }
                                i13 = i10;
                                i14 = i34 - i12;
                                if (i34 == length) {
                                    c12 = 16;
                                    i15 = i34;
                                    i16 = i15;
                                    i17 = 0;
                                } else {
                                    c12 = 16;
                                    i15 = i34;
                                    i16 = i15;
                                    i17 = 0;
                                }
                                if (i14 == 0) {
                                    j10 = ((long) i15) << 32;
                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                } else {
                                    if ((cCharAt2 | ' ') == 101) {
                                        i18 = i15 + 1;
                                        if (i18 < length2) {
                                            cCharAt6 = str.charAt(i18);
                                        } else {
                                            cCharAt6 = 0;
                                        }
                                        if (cCharAt6 == '-') {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i18 = i15 + 2;
                                        } else {
                                            i18 = i15 + 2;
                                        }
                                        cCharAt7 = str.charAt(i18);
                                        i26 = 0;
                                        while (true) {
                                            if (i18 != length) {
                                                i28 = cCharAt7 - '0';
                                                i27 = i17;
                                                if (((char) i28) < '\n') {
                                                    if (i26 < 1024) {
                                                        i26 = (i26 * 10) + i28;
                                                    }
                                                    i18++;
                                                    if (i18 < length2) {
                                                        cCharAt8 = str.charAt(i18);
                                                    } else {
                                                        cCharAt8 = 0;
                                                    }
                                                    cCharAt7 = cCharAt8;
                                                    i17 = i27;
                                                }
                                            } else {
                                                i27 = i17;
                                            }
                                        }
                                        if (z11) {
                                            i19 = -i26;
                                        } else {
                                            i19 = i26;
                                        }
                                        i17 = i27 + i19;
                                    } else {
                                        i18 = i15;
                                        i19 = 0;
                                    }
                                    i20 = 19;
                                    if (i14 > 19) {
                                        cCharAt3 = str.charAt(i12);
                                        i21 = i12;
                                        while (i18 != length) {
                                            if (cCharAt3 != '0') {
                                            }
                                            if (cCharAt3 == '0') {
                                                i14--;
                                            }
                                            i25 = i21 + 1;
                                            if (i25 < length2) {
                                                cCharAt3 = str.charAt(i25);
                                            } else {
                                                cCharAt3 = 0;
                                            }
                                            i21 = i25;
                                            i20 = 19;
                                        }
                                        if (i14 > i20) {
                                            cCharAt4 = str.charAt(i12);
                                            j11 = 0;
                                            while (true) {
                                                i22 = i12;
                                                if (i12 != i34) {
                                                    c14 = cCharAt4;
                                                    if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                        j11 = (j11 * 10) + ((long) (c14 - '0'));
                                                        i12 = i22 + 1;
                                                        if (i12 < length2) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i17 = (i34 - i22) + i19;
                                            } else {
                                                cCharAt5 = str.charAt(i16);
                                                i23 = i16;
                                                while (true) {
                                                    if (i23 != i15) {
                                                        c13 = cCharAt5;
                                                        i24 = i23;
                                                        if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                            j11 = (j11 * 10) + ((long) (c13 - '0'));
                                                            i23 = i24 + 1;
                                                            if (i23 < length2) {
                                                            }
                                                        }
                                                    } else {
                                                        i24 = i23;
                                                    }
                                                }
                                                i17 = (i16 - i24) + i19;
                                            }
                                            j5 = j11;
                                            z10 = true;
                                        } else {
                                            j5 = j13;
                                            z10 = false;
                                        }
                                    } else {
                                        j5 = j13;
                                        z10 = false;
                                    }
                                    if (-10 > i17) {
                                        if (j5 == 0) {
                                            if (z12) {
                                                f10 = -0.0f;
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            j10 = ((long) i18) << 32;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                                        } else if (-126 <= i17) {
                                            String strSubstring4 = str.substring(i13, i18);
                                            l.d(strSubstring4, "substring(...)");
                                            j10 = ((long) i18) << 32;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring4));
                                        } else {
                                            String strSubstring5 = str.substring(i13, i18);
                                            l.d(strSubstring5, "substring(...)");
                                            j10 = ((long) i18) << 32;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring5));
                                        }
                                    } else if (j5 == 0) {
                                        if (z12) {
                                            f10 = -0.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        j10 = ((long) i18) << 32;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                                    } else if (-126 <= i17) {
                                        String strSubstring6 = str.substring(i13, i18);
                                        l.d(strSubstring6, "substring(...)");
                                        j10 = ((long) i18) << 32;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring6));
                                    } else {
                                        String strSubstring7 = str.substring(i13, i18);
                                        l.d(strSubstring7, "substring(...)");
                                        j10 = ((long) i18) << 32;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring7));
                                    }
                                }
                                jFloatToRawIntBits = iFloatToRawIntBits;
                                jFloatToRawIntBits2 = j10 | (jFloatToRawIntBits & j12);
                                i10 = (int) (jFloatToRawIntBits2 >>> c11);
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    fArr = (float[]) dVar.f20b;
                                    i30 = i11 + 1;
                                    fArr[i11] = fIntBitsToFloat;
                                    if (i30 >= fArr.length) {
                                        float[] fArr5 = new float[i30 * 2];
                                        dVar.f20b = fArr5;
                                        System.arraycopy(fArr, 0, fArr5, 0, fArr.length);
                                    }
                                    i32 = i30;
                                } else {
                                    i32 = i11;
                                }
                                while (i10 < length) {
                                    i10++;
                                }
                                if (i10 >= length) {
                                }
                            }
                            c10 = 1;
                            i10 = (int) (jFloatToRawIntBits2 >>> c11);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                            if (Float.isNaN(fIntBitsToFloat)) {
                                fArr = (float[]) dVar.f20b;
                                i30 = i11 + 1;
                                fArr[i11] = fIntBitsToFloat;
                                if (i30 >= fArr.length) {
                                    float[] fArr6 = new float[i30 * 2];
                                    dVar.f20b = fArr6;
                                    System.arraycopy(fArr, 0, fArr6, 0, fArr.length);
                                }
                                i32 = i30;
                            } else {
                                i32 = i11;
                            }
                            while (i10 < length) {
                                i10++;
                            }
                            if (i10 >= length) {
                            }
                        } else {
                            i10++;
                        }
                    }
                } else {
                    c10 = 1;
                }
                float[] fArr7 = (float[]) dVar.f20b;
                int i43 = 2;
                switch (cCharAt) {
                    case 'A':
                        int i44 = i32 - 7;
                        for (int i45 = 0; i45 <= i44; i45 += 7) {
                            arrayList.add(new e2.j(fArr7[i45], fArr7[i45 + 1], fArr7[i45 + 2], Float.compare(fArr7[i45 + 3], 0.0f) != 0, Float.compare(fArr7[i45 + 4], 0.0f) != 0, fArr7[i45 + 5], fArr7[i45 + 6]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'C':
                        int i46 = i32 - 6;
                        for (int i47 = 0; i47 <= i46; i47 += 6) {
                            arrayList.add(new e2.l(fArr7[i47], fArr7[i47 + 1], fArr7[i47 + 2], fArr7[i47 + 3], fArr7[i47 + 4], fArr7[i47 + 5]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'H':
                        int i48 = i32 - 1;
                        for (int i49 = 0; i49 <= i48; i49++) {
                            arrayList.add(new m(fArr7[i49]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'L':
                        int i50 = i32 - 2;
                        for (int i51 = 0; i51 <= i50; i51 += 2) {
                            arrayList.add(new e2.n(fArr7[i51], fArr7[i51 + 1]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'M':
                        int i52 = i32 - 2;
                        if (i52 >= 0) {
                            arrayList.add(new o(fArr7[0], fArr7[c10]));
                            while (i43 <= i52) {
                                arrayList.add(new e2.n(fArr7[i43], fArr7[i43 + 1]));
                                i43 += 2;
                            }
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'Q':
                        int i53 = i32 - 4;
                        for (int i54 = 0; i54 <= i53; i54 += 4) {
                            arrayList.add(new p(fArr7[i54], fArr7[i54 + 1], fArr7[i54 + 2], fArr7[i54 + 3]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'S':
                        int i55 = i32 - 4;
                        for (int i56 = 0; i56 <= i55; i56 += 4) {
                            arrayList.add(new e2.q(fArr7[i56], fArr7[i56 + 1], fArr7[i56 + 2], fArr7[i56 + 3]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'T':
                        int i57 = i32 - 2;
                        for (int i58 = 0; i58 <= i57; i58 += 2) {
                            arrayList.add(new r(fArr7[i58], fArr7[i58 + 1]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'V':
                        int i59 = i32 - 1;
                        for (int i60 = 0; i60 <= i59; i60++) {
                            arrayList.add(new b0(fArr7[i60]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(e2.k.f4210c);
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'a':
                        int i61 = i32 - 7;
                        for (int i62 = 0; i62 <= i61; i62 += 7) {
                            arrayList.add(new s(fArr7[i62], fArr7[i62 + 1], fArr7[i62 + 2], Float.compare(fArr7[i62 + 3], 0.0f) != 0, Float.compare(fArr7[i62 + 4], 0.0f) != 0, fArr7[i62 + 5], fArr7[i62 + 6]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'c':
                        int i63 = i32 - 6;
                        for (int i64 = 0; i64 <= i63; i64 += 6) {
                            arrayList.add(new t(fArr7[i64], fArr7[i64 + 1], fArr7[i64 + 2], fArr7[i64 + 3], fArr7[i64 + 4], fArr7[i64 + 5]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'h':
                        int i65 = i32 - 1;
                        for (int i66 = 0; i66 <= i65; i66++) {
                            arrayList.add(new u(fArr7[i66]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'l':
                        int i67 = i32 - 2;
                        for (int i68 = 0; i68 <= i67; i68 += 2) {
                            arrayList.add(new e2.v(fArr7[i68], fArr7[i68 + 1]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'm':
                        int i69 = i32 - 2;
                        if (i69 >= 0) {
                            arrayList.add(new w(fArr7[0], fArr7[c10]));
                            while (i43 <= i69) {
                                arrayList.add(new e2.v(fArr7[i43], fArr7[i43 + 1]));
                                i43 += 2;
                            }
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'q':
                        int i70 = i32 - 4;
                        for (int i71 = 0; i71 <= i70; i71 += 4) {
                            arrayList.add(new x(fArr7[i71], fArr7[i71 + 1], fArr7[i71 + 2], fArr7[i71 + 3]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 's':
                        int i72 = i32 - 4;
                        for (int i73 = 0; i73 <= i72; i73 += 4) {
                            arrayList.add(new y(fArr7[i73], fArr7[i73 + 1], fArr7[i73 + 2], fArr7[i73 + 3]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 't':
                        int i74 = i32 - 2;
                        for (int i75 = 0; i75 <= i74; i75 += 2) {
                            arrayList.add(new z(fArr7[i75], fArr7[i75 + 1]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    case 'v':
                        int i76 = i32 - 1;
                        for (int i77 = 0; i77 <= i76; i77++) {
                            arrayList.add(new a0(fArr7[i77]));
                        }
                        i31 = i10;
                        i7 = 32;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + cCharAt);
                }
            } else {
                i31 = i10;
            }
        }
        return arrayList;
    }

    public void A() {
        View viewFindViewById;
        View view = (View) this.f20b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new androidx.lifecycle.z(7, viewFindViewById));
    }

    public void B(float f10, float f11) {
        ((b) this.f20b).z().n(f10, f11);
    }

    @Override // e4.e
    public int a() {
        return ((ContentInfo) this.f20b).getFlags();
    }

    @Override // e4.e
    public ClipData b() {
        return ((ContentInfo) this.f20b).getClip();
    }

    @Override // e4.c
    public e4.f build() {
        return new e4.f(new d(((ContentInfo.Builder) this.f20b).build()));
    }

    @Override // e4.c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f20b).setLinkUri(uri);
    }

    @Override // e4.c
    public void d(int i7) {
        ((ContentInfo.Builder) this.f20b).setFlags(i7);
    }

    @Override // e4.e
    public int getSource() {
        return ((ContentInfo) this.f20b).getSource();
    }

    @Override // e4.e
    public ContentInfo h() {
        return (ContentInfo) this.f20b;
    }

    public void i(int i7, f4.f fVar, String str, Bundle bundle) {
    }

    @Override // jb.e
    public jb.d j(wa.b bVar) {
        jb.d dVarJ;
        l.e(bVar, "classId");
        for (d0 d0Var : x9.v.i((g0) this.f20b, bVar.f14236a)) {
            if ((d0Var instanceof kb.c) && (dVarJ = ((kb.c) d0Var).f7498i.j(bVar)) != null) {
                return dVarJ;
            }
        }
        return null;
    }

    public f4.f k(int i7) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Type inference failed for: r6v4, types: [a9.i, h9.n] */
    @Override // fc.d
    public Object l(fc.e eVar, y8.c cVar) throws Throwable {
        fc.a aVar;
        Throwable th;
        gc.u uVar;
        switch (this.f19a) {
            case 18:
                if (cVar instanceof fc.a) {
                    aVar = (fc.a) cVar;
                    int i7 = aVar.f5514d;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        aVar.f5514d = i7 - Integer.MIN_VALUE;
                    } else {
                        aVar = new fc.a(this, cVar);
                    }
                } else {
                    aVar = new fc.a(this, cVar);
                }
                Object obj = aVar.f5512b;
                int i10 = aVar.f5514d;
                t8.z zVar = t8.z.f12851a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = aVar.f5511a;
                    try {
                        t8.a.e(obj);
                        uVar.releaseIntercepted();
                        return zVar;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar.releaseIntercepted();
                        throw th;
                    }
                }
                t8.a.e(obj);
                gc.u uVar2 = new gc.u(eVar, aVar.getContext());
                try {
                    aVar.f5511a = uVar2;
                    aVar.f5514d = 1;
                    Object objInvoke = ((a9.i) this.f20b).invoke(uVar2, aVar);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objInvoke != aVar2) {
                        objInvoke = zVar;
                    }
                    if (objInvoke == aVar2) {
                        return aVar2;
                    }
                    uVar = uVar2;
                    uVar.releaseIntercepted();
                    return zVar;
                } catch (Throwable th3) {
                    th = th3;
                    uVar = uVar2;
                    uVar.releaseIntercepted();
                    throw th;
                }
            default:
                b1.f fVar = new b1.f((fc.k) this.f20b, eVar, (y8.c) null, 4);
                p1 p1Var = new p1(cVar.getContext(), cVar, 1);
                Object objQ = e0.Q(p1Var, p1Var, fVar);
                return objQ == z8.a.f15774a ? objQ : t8.z.f12851a;
        }
    }

    public void m() {
        ((f1.v) this.f20b).getClass();
    }

    public f4.f n(int i7) {
        return null;
    }

    public w2 o() {
        l4.j jVarA = l4.j.a();
        if (jVarA.c() == 1) {
            return new j3.l(true);
        }
        k1 k1VarS = f1.b.s(Boolean.FALSE);
        jVarA.h(new j3.h(k1VarS, this));
        return k1VarS;
    }

    public void p() {
        View view = (View) this.f20b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void q(float f10, float f11, float f12, float f13) {
        b bVar = (b) this.f20b;
        y1.o oVarZ = bVar.z();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.J() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.J() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            y1.y.a("Width and height must be greater than or equal to zero");
        }
        bVar.b0(jFloatToRawIntBits);
        oVarZ.n(f10, f11);
    }

    public void r() {
        synchronized (((f7.o) this.f20b).f5441h) {
            try {
                f7.o oVar = (f7.o) this.f20b;
                if (oVar.f5440g) {
                    oVar.f5436c.obtainMessage(com.baidu.carlifevehicle.R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e4.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20b).setExtras(bundle);
    }

    @Override // c7.a
    public void startActivity(Intent intent) {
        ((Activity) this.f20b).startActivity(intent);
    }

    @Override // c7.a
    public void startActivityForResult(Intent intent, int i7) {
        ((Activity) this.f20b).startActivityForResult(intent, i7);
    }

    public boolean t(int i7, int i10, Bundle bundle) {
        return false;
    }

    public String toString() {
        switch (this.f19a) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f20b) + "}";
            default:
                return super.toString();
        }
    }

    public k2.i u(android.support.v4.media.session.r rVar, r2.u uVar) {
        Object obj;
        long jL;
        long j5;
        boolean z10;
        q qVar = (q) this.f20b;
        List list = (List) rVar.f604b;
        q qVar2 = new q(list.size());
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            k2.x xVar = (k2.x) list.get(i7);
            long j10 = xVar.f7295a;
            int iB = t.a.b(qVar.f12480b, qVar.f12482d, j10);
            if (iB < 0 || (obj = qVar.f12481c[iB]) == s.r.f12486a) {
                obj = null;
            }
            k2.w wVar = (k2.w) obj;
            if (wVar == null) {
                j5 = xVar.f7296b;
                jL = xVar.f7298d;
                z10 = false;
            } else {
                long j11 = wVar.f7292a;
                boolean z11 = wVar.f7294c;
                jL = uVar.L(wVar.f7293b);
                j5 = j11;
                z10 = z11;
            }
            long j12 = xVar.f7295a;
            List list2 = list;
            int i10 = size;
            qVar2.f(j12, new k2.v(j12, xVar.f7296b, xVar.f7298d, xVar.f7299e, xVar.f7300f, j5, jL, z10, xVar.f7301g, xVar.f7303i, xVar.f7304j, xVar.k));
            boolean z12 = xVar.f7299e;
            if (z12) {
                qVar.f(j10, new k2.w(xVar.f7296b, xVar.f7297c, z12));
            } else {
                qVar.g(j10);
            }
            i7++;
            list = list2;
            size = i10;
        }
        return new k2.i(qVar2, rVar);
    }

    public void v(String str, long j5) {
        s.f fVar = MediaMetadataCompat.f542c;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(f.G("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f20b).putLong(str, j5);
    }

    public void w(String str, String str2) {
        s.f fVar = MediaMetadataCompat.f542c;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(f.G("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f20b).putCharSequence(str, str2);
    }

    public x9.e x(da.o oVar) {
        ka.q qVar;
        l.e(oVar, "javaClass");
        wa.c cVarC = oVar.c();
        Class<?> declaringClass = oVar.f3881a.getDeclaringClass();
        da.o oVar2 = declaringClass != null ? new da.o(declaringClass) : null;
        if (oVar2 != null) {
            x9.e eVarX = x(oVar2);
            gb.o oVarN0 = eVarX != null ? eVarX.n0() : null;
            x9.h hVarA = oVarN0 != null ? oVarN0.a(oVar.e(), fa.b.f5509h) : null;
            if (hVarA instanceof x9.e) {
                return (x9.e) hVarA;
            }
        } else if (cVarC != null && (qVar = (ka.q) u8.p.m0(n3.l.I(((ja.d) this.f20b).c(cVarC.b())))) != null) {
            ka.v vVar = qVar.f7472j.f7408d;
            vVar.getClass();
            return vVar.v(oVar.e(), oVar);
        }
        return null;
    }

    public void y(float f10, float f11, long j5) {
        y1.o oVarZ = ((b) this.f20b).z();
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        oVarZ.n(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10));
        oVarZ.b(f10, f11);
        oVarZ.n(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i10));
    }

    public ArrayList z(int i7) {
        ArrayList arrayList = new ArrayList();
        g0.v vVar = (g0.v) this.f20b;
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            g0.n nVar = vVar.f5739b ? vVar.f5740c : (g0.n) vVar.f5742e.getValue();
            if (nVar != null) {
                i9.v vVar2 = new i9.v();
                vVar2.f6686a = 1;
                List list = (List) nVar.k.invoke(Integer.valueOf(i7));
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t8.j jVar = (t8.j) list.get(i10);
                    i0 i0Var = vVar.f5751o;
                    int iIntValue = ((Number) jVar.f12830a).intValue();
                    long j5 = ((n3.a) jVar.f12831b).f8730a;
                    u0.k kVar = g0.v.f5737w;
                    vVar2 = vVar2;
                    arrayList.add(i0Var.a(iIntValue, j5, false, new a8.z((ArrayList) null, vVar2, list, i7, nVar)));
                }
            }
            return arrayList;
        } finally {
            n4.e.r(fVarH, fVarK, kVarE);
        }
    }
}
