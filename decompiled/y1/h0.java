package y1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f14898a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f14899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f14900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f14901d;

    public static final RectF A(x1.c cVar) {
        return new RectF(cVar.f14523a, cVar.f14524b, cVar.f14525c, cVar.f14526d);
    }

    public static final Shader.TileMode B(int i7) {
        if (i7 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i7 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i7 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i7 == 3 && Build.VERSION.SDK_INT >= 31) {
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int C(long j5) {
        float[] fArr = z1.d.f15621a;
        return (int) (q.a(j5, z1.d.f15625e) >>> 32);
    }

    public static final Bitmap.Config D(int i7) {
        if (i7 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i7 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i7 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || i7 != 3) {
            return (i10 < 26 || i7 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final x1.c E(Rect rect) {
        return new x1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final x1.c F(RectF rectF) {
        return new x1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode G(int i7) {
        if (i7 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i7 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i7 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i7 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i7 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i7 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i7 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i7 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i7 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i7 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i7 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i7 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i7 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String H(int i7) {
        if (i7 == 0) {
            return "Clear";
        }
        if (i7 == 1) {
            return "Src";
        }
        if (i7 == 2) {
            return "Dst";
        }
        if (i7 == 3) {
            return "SrcOver";
        }
        if (i7 == 4) {
            return "DstOver";
        }
        if (i7 == 5) {
            return "SrcIn";
        }
        if (i7 == 6) {
            return "DstIn";
        }
        if (i7 == 7) {
            return "SrcOut";
        }
        if (i7 == 8) {
            return "DstOut";
        }
        if (i7 == 9) {
            return "SrcAtop";
        }
        if (i7 == 10) {
            return "DstAtop";
        }
        if (i7 == 11) {
            return "Xor";
        }
        if (i7 == 12) {
            return "Plus";
        }
        if (i7 == 13) {
            return "Modulate";
        }
        if (i7 == 14) {
            return "Screen";
        }
        if (i7 == 15) {
            return "Overlay";
        }
        if (i7 == 16) {
            return "Darken";
        }
        if (i7 == 17) {
            return "Lighten";
        }
        if (i7 == 18) {
            return "ColorDodge";
        }
        if (i7 == 19) {
            return "ColorBurn";
        }
        if (i7 == 20) {
            return "HardLight";
        }
        if (i7 == 21) {
            return "Softlight";
        }
        if (i7 == 22) {
            return "Difference";
        }
        if (i7 == 23) {
            return "Exclusion";
        }
        if (i7 == 24) {
            return "Multiply";
        }
        if (i7 == 25) {
            return "Hue";
        }
        if (i7 == 26) {
            return "Saturation";
        }
        if (i7 == 27) {
            return "Color";
        }
        return i7 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void I(ArrayList arrayList, List list) {
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int J(float f10, float[] fArr, int i7) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i7] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final b a(f fVar) {
        Canvas canvas = c.f14879a;
        b bVar = new b();
        bVar.f14875a = new Canvas(j(fVar));
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x017b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0181  */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x018d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019b  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    public static final long b(float f10, float f11, float f12, float f13, z1.c cVar) {
        int i7;
        int i10;
        int i11;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f14;
        if (cVar.c()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i28 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i29 = i28 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i30 = i29 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            long j5 = ((long) (i30 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i31 = q.f14959n;
            return j5;
        }
        long j10 = cVar.f15619b;
        int i32 = z1.b.f15617e;
        if (((int) (j10 >> 32)) != 3) {
            y.a("Color only works with ColorSpaces with 3 components");
        }
        int i33 = cVar.f15620c;
        if (i33 == -1) {
            y.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i34 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f10 >= fB3) {
            fB3 = f10;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i35 = iFloatToRawIntBits3 >>> 31;
        int i36 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i37 = iFloatToRawIntBits3 & 8388607;
        if (i36 == 255) {
            i10 = i37 != 0 ? 512 : 0;
            i7 = 31;
        } else {
            i7 = i36 - 112;
            if (i7 >= 31) {
                i10 = 0;
                i7 = 49;
            } else {
                if (i7 > 0) {
                    int i38 = i37 >> 13;
                    if ((iFloatToRawIntBits3 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i11 = (((i7 << 10) | i38) + 1) | (i35 << 15);
                    } else {
                        i10 = i38;
                    }
                    short s2 = (short) i11;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f11 >= fB) {
                        fB = f11;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i15 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                }
                                short s5 = (short) i18;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f12 >= fB2) {
                                    fB2 = f12;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i20 = iFloatToRawIntBits2 >>> 31;
                                i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i22 = 8388607 & iFloatToRawIntBits2;
                                if (i21 == 255) {
                                    i25 = i22 != 0 ? 512 : 0;
                                    i34 = 31;
                                } else {
                                    i23 = i21 - 112;
                                    if (i23 >= 31) {
                                        i25 = 0;
                                        i34 = 49;
                                    } else {
                                        if (i23 <= 0) {
                                            i24 = i22 >> 13;
                                            if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                                i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                            } else {
                                                i25 = i24;
                                                i34 = i23;
                                            }
                                            short s10 = (short) i26;
                                            f14 = f13 >= 0.0f ? f13 : 0.0f;
                                            long j11 = (((long) i33) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i39 = q.f14959n;
                                            return j11;
                                        }
                                        if (i23 >= -10) {
                                            i27 = (i22 | 8388608) >> (1 - i23);
                                            if ((i27 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                                i27 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                            }
                                            i25 = i27 >> 13;
                                        } else {
                                            i25 = 0;
                                        }
                                    }
                                }
                                i26 = i25 | (i20 << 15) | (i34 << 10);
                                short s11 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j12 = (((long) i33) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i310 = q.f14959n;
                                return j12;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i19 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i15 = 0;
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s12 = (short) i18;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 != 0 ? 512 : 0;
                        i34 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i25 = 0;
                            i34 = 49;
                        } else {
                            if (i23 <= 0) {
                                i24 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                } else {
                                    i25 = i24;
                                    i34 = i23;
                                }
                                short s13 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j13 = (((long) i33) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i311 = q.f14959n;
                                return j13;
                            }
                            if (i23 >= -10) {
                                i27 = (i22 | 8388608) >> (1 - i23);
                                if ((i27 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i27 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                }
                                i25 = i27 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i20 << 15) | (i34 << 10);
                    short s14 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j14 = (((long) i33) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i312 = q.f14959n;
                    return j14;
                }
                if (i7 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i7);
                    if ((i40 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i40 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i10 = i40 >> 13;
                } else {
                    i10 = 0;
                }
                i7 = 0;
            }
        }
        i11 = i10 | (i35 << 15) | (i7 << 10);
        short s15 = (short) i11;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f11 >= fB) {
            fB = f11;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i12 = iFloatToRawIntBits >>> 31;
        i13 = (iFloatToRawIntBits >>> 23) & 255;
        i14 = iFloatToRawIntBits & 8388607;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = 512;
            } else {
                i17 = 0;
            }
            i15 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i15 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s16 = (short) i18;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 != 0 ? 512 : 0;
                        i34 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i25 = 0;
                            i34 = 49;
                        } else {
                            if (i23 <= 0) {
                                i24 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                } else {
                                    i25 = i24;
                                    i34 = i23;
                                }
                                short s17 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j15 = (((long) i33) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((65535 & ((long) s17)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i313 = q.f14959n;
                                return j15;
                            }
                            if (i23 >= -10) {
                                i27 = (i22 | 8388608) >> (1 - i23);
                                if ((i27 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i27 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                }
                                i25 = i27 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i20 << 15) | (i34 << 10);
                    short s18 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j16 = (((long) i33) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((65535 & ((long) s18)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i314 = q.f14959n;
                    return j16;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i19 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
                i15 = 0;
            }
        }
        i18 = i17 | (i12 << 15) | (i15 << 10);
        short s19 = (short) i18;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f12 >= fB2) {
            fB2 = f12;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i20 = iFloatToRawIntBits2 >>> 31;
        i21 = (iFloatToRawIntBits2 >>> 23) & 255;
        i22 = 8388607 & iFloatToRawIntBits2;
        if (i21 == 255) {
            i25 = i22 != 0 ? 512 : 0;
            i34 = 31;
        } else {
            i23 = i21 - 112;
            if (i23 >= 31) {
                i25 = 0;
                i34 = 49;
            } else {
                if (i23 <= 0) {
                    i24 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                    } else {
                        i25 = i24;
                        i34 = i23;
                    }
                    short s110 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j17 = (((long) i33) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i315 = q.f14959n;
                    return j17;
                }
                if (i23 >= -10) {
                    i27 = (i22 | 8388608) >> (1 - i23);
                    if ((i27 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i27 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i25 = i27 >> 13;
                } else {
                    i25 = 0;
                }
            }
        }
        i26 = i25 | (i20 << 15) | (i34 << 10);
        short s111 = (short) i26;
        if (f13 >= 0.0f) {
        }
        long j18 = (((long) i33) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((65535 & ((long) s111)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i316 = q.f14959n;
        return j18;
    }

    public static final long c(int i7) {
        long j5 = ((long) i7) << 32;
        int i10 = q.f14959n;
        return j5;
    }

    public static final long d(long j5) {
        long j10 = j5 << 32;
        int i7 = q.f14959n;
        return j10;
    }

    public static long e(int i7, int i10, int i11) {
        return c(((i7 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static f f(int i7, int i10, int i11) {
        Bitmap bitmapCreateBitmap;
        z1.q qVar = z1.d.f15625e;
        Bitmap.Config configD = D(i11);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i10, D(i11), true, t.a(qVar));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i10, configD);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new f(bitmapCreateBitmap);
    }

    public static final LinearGradient g(long j5, long j10, List list) {
        I(null, list);
        int iL = l(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), s(iL, list), t(null, list, iL), B(0));
    }

    public static final f7.q h() {
        return new f7.q(new Paint(7));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    public static final long i(float f10, float f11, float f12, float f13, z1.c cVar) {
        int i7;
        int i10;
        int i11;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if (cVar.c()) {
            long j5 = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i26 = q.f14959n;
            return j5;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        int i30 = 49;
        int i31 = 0;
        if (i28 == 255) {
            i10 = i29 != 0 ? 512 : 0;
            i7 = 31;
        } else {
            i7 = i28 - 112;
            if (i7 >= 31) {
                i10 = 0;
                i7 = 49;
            } else {
                if (i7 > 0) {
                    int i32 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i11 = (((i7 << 10) | i32) + 1) | (i27 << 15);
                    } else {
                        i10 = i32;
                    }
                    short s2 = (short) i11;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i15 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                }
                                short s5 = (short) i18;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i20 = iFloatToRawIntBits2 >>> 31;
                                i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i22 = 8388607 & iFloatToRawIntBits2;
                                if (i21 == 255) {
                                    i23 = i21 - 112;
                                    if (i23 < 31) {
                                        if (i23 <= 0) {
                                            if (i23 >= -10) {
                                                i25 = (i22 | 8388608) >> (1 - i23);
                                                if ((i25 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                                    i25 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                                }
                                                i31 = i25 >> 13;
                                            }
                                            i30 = 0;
                                        } else {
                                            i31 = i22 >> 13;
                                            if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                                i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                            } else {
                                                i30 = i23;
                                            }
                                        }
                                    }
                                    long jMax = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                                    int i33 = q.f14959n;
                                    return jMax;
                                }
                                i31 = i22 == 0 ? 0 : 512;
                                i30 = 31;
                                i24 = (i20 << 15) | (i30 << 10) | i31;
                                long jMax2 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                                int i34 = q.f14959n;
                                return jMax2;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i19 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i15 = 0;
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s10 = (short) i18;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i23 = i21 - 112;
                        if (i23 < 31) {
                            if (i23 <= 0) {
                                if (i23 >= -10) {
                                    i25 = (i22 | 8388608) >> (1 - i23);
                                    if ((i25 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                        i25 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                    }
                                    i31 = i25 >> 13;
                                }
                                i30 = 0;
                            } else {
                                i31 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                } else {
                                    i30 = i23;
                                }
                            }
                        }
                        long jMax3 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                        int i35 = q.f14959n;
                        return jMax3;
                    }
                    i31 = i22 == 0 ? 0 : 512;
                    i30 = 31;
                    i24 = (i20 << 15) | (i30 << 10) | i31;
                    long jMax4 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                    int i36 = q.f14959n;
                    return jMax4;
                }
                if (i7 >= -10) {
                    int i37 = (i29 | 8388608) >> (1 - i7);
                    if ((i37 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i37 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i10 = i37 >> 13;
                } else {
                    i10 = 0;
                }
                i7 = 0;
            }
        }
        i11 = i10 | (i27 << 15) | (i7 << 10);
        short s11 = (short) i11;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i12 = iFloatToRawIntBits >>> 31;
        i13 = (iFloatToRawIntBits >>> 23) & 255;
        i14 = iFloatToRawIntBits & 8388607;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = 512;
            } else {
                i17 = 0;
            }
            i15 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i15 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s12 = (short) i18;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i23 = i21 - 112;
                        if (i23 < 31) {
                            if (i23 <= 0) {
                                if (i23 >= -10) {
                                    i25 = (i22 | 8388608) >> (1 - i23);
                                    if ((i25 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                        i25 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                                    }
                                    i31 = i25 >> 13;
                                }
                                i30 = 0;
                            } else {
                                i31 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                    i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                } else {
                                    i30 = i23;
                                }
                            }
                        }
                        long jMax5 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s11) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                        int i38 = q.f14959n;
                        return jMax5;
                    }
                    i31 = i22 == 0 ? 0 : 512;
                    i30 = 31;
                    i24 = (i20 << 15) | (i30 << 10) | i31;
                    long jMax6 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s11) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
                    int i39 = q.f14959n;
                    return jMax6;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i19 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
                i15 = 0;
            }
        }
        i18 = i17 | (i12 << 15) | (i15 << 10);
        short s13 = (short) i18;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i20 = iFloatToRawIntBits2 >>> 31;
        i21 = (iFloatToRawIntBits2 >>> 23) & 255;
        i22 = 8388607 & iFloatToRawIntBits2;
        if (i21 == 255) {
            i23 = i21 - 112;
            if (i23 < 31) {
                if (i23 <= 0) {
                    if (i23 >= -10) {
                        i25 = (i22 | 8388608) >> (1 - i23);
                        if ((i25 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                            i25 += ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                        }
                        i31 = i25 >> 13;
                    }
                    i30 = 0;
                } else {
                    i31 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                        i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                    } else {
                        i30 = i23;
                    }
                }
            }
            long jMax7 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s11) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
            int i310 = q.f14959n;
            return jMax7;
        }
        i31 = i22 == 0 ? 0 : 512;
        i30 = 31;
        i24 = (i20 << 15) | (i30 << 10) | i31;
        long jMax8 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s11) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f15620c) & 63);
        int i311 = q.f14959n;
        return jMax8;
    }

    public static final Bitmap j(f fVar) {
        if (fVar instanceof f) {
            return fVar.f14890a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j5, long j10) {
        float f10;
        float f11;
        long jA = q.a(j5, q.f(j10));
        float fD = q.d(j10);
        float fD2 = q.d(jA);
        float f12 = 1.0f - fD2;
        float f13 = (fD * f12) + fD2;
        float fH = q.h(jA);
        float fH2 = q.h(j10);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fD) * f12) + (fH * fD2)) / f13;
        }
        float fG = q.g(jA);
        float fG2 = q.g(j10);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fD) * f12) + (fG * fD2)) / f13;
        }
        float fE = q.e(jA);
        float fE2 = q.e(j10);
        if (f13 != 0.0f) {
            f14 = (((fE2 * fD) * f12) + (fE * fD2)) / f13;
        }
        return i(f10, f11, f14, f13, q.f(j10));
    }

    public static final int l(List list) {
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iA = n3.l.A(list);
        for (int i10 = 1; i10 < iA; i10++) {
            if (q.d(((q) list.get(i10)).f14960a) == 0.0f) {
                i7++;
            }
        }
        return i7;
    }

    public static void m(a2.g gVar, h0 h0Var, long j5) {
        if (h0Var instanceof c0) {
            x1.c cVar = ((c0) h0Var).f14880e;
            float f10 = cVar.f14523a;
            gVar.Z(j5, (4294967295L & ((long) Float.floatToRawIntBits(cVar.f14524b))) | (Float.floatToRawIntBits(f10) << 32), w(cVar), 3);
            return;
        }
        boolean z10 = h0Var instanceof d0;
        a2.j jVar = a2.j.f23a;
        if (!z10) {
            if (!(h0Var instanceof b0)) {
                throw new cc.s();
            }
            gVar.V(((b0) h0Var).f14878e, j5, jVar);
            return;
        }
        d0 d0Var = (d0) h0Var;
        h hVar = d0Var.f14883f;
        if (hVar != null) {
            gVar.V(hVar, j5, jVar);
            return;
        }
        x1.d dVar = d0Var.f14882e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f14534h >> 32));
        float f11 = dVar.f14527a;
        float f12 = dVar.f14528b;
        gVar.i0(j5, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (((long) Float.floatToRawIntBits(dVar.b())) << 32) | (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), jVar);
    }

    public static void n(Canvas canvas, boolean z10) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f14901d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f14899b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f14900c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f14899b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f14900c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f14899b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f14900c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f14901d = true;
        }
        if (z10) {
            try {
                Method method4 = f14899b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f14900c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean p(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long q(float f10, long j5, long j10) {
        z1.l lVar = z1.d.f15643x;
        long jA = q.a(j5, lVar);
        long jA2 = q.a(j10, lVar);
        float fD = q.d(jA);
        float fH = q.h(jA);
        float fG = q.g(jA);
        float fE = q.e(jA);
        float fD2 = q.d(jA2);
        float fH2 = q.h(jA2);
        float fG2 = q.g(jA2);
        float fE2 = q.e(jA2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return q.a(i(n3.r.E(fH, fH2, f10), n3.r.E(fG, fG2, f10), n3.r.E(fE, fE2, f10), n3.r.E(fD, fD2, f10), lVar), q.f(j10));
    }

    public static final float r(long j5) {
        z1.c cVarF = q.f(j5);
        if (!z1.b.a(cVarF.f15619b, z1.b.f15613a)) {
            y.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) z1.b.b(cVarF.f15619b)));
        }
        z1.m mVar = ((z1.q) cVarF).f15683p;
        double dB = mVar.b(q.h(j5));
        float fB = (float) ((mVar.b(q.e(j5)) * 0.0722d) + (mVar.b(q.g(j5)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final int[] s(int i7, List list) {
        int i10;
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = C(((q) list.get(i11)).f14960a);
                i11++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i7];
        int iA = n3.l.A(list);
        int size2 = list.size();
        int i12 = 0;
        while (i11 < size2) {
            long j5 = ((q) list.get(i11)).f14960a;
            if (q.d(j5) == 0.0f) {
                if (i11 == 0) {
                    i10 = i12 + 1;
                    iArr2[i12] = C(q.b(0.0f, ((q) list.get(1)).f14960a));
                } else if (i11 == iA) {
                    i10 = i12 + 1;
                    iArr2[i12] = C(q.b(0.0f, ((q) list.get(i11 - 1)).f14960a));
                } else {
                    int i13 = i12 + 1;
                    iArr2[i12] = C(q.b(0.0f, ((q) list.get(i11 - 1)).f14960a));
                    i12 += 2;
                    iArr2[i13] = C(q.b(0.0f, ((q) list.get(i11 + 1)).f14960a));
                }
                i12 = i10;
            } else {
                iArr2[i12] = C(j5);
                i12++;
            }
            i11++;
        }
        return iArr2;
    }

    public static final float[] t(ArrayList arrayList, List list, int i7) {
        int i10 = 0;
        if (i7 == 0) {
            if (arrayList == null) {
                return null;
            }
            float[] fArr = new float[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fArr[i10] = ((Number) it.next()).floatValue();
                i10++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list.size() + i7];
        fArr2[0] = arrayList != null ? ((Number) arrayList.get(0)).floatValue() : 0.0f;
        int iA = n3.l.A(list);
        int i11 = 1;
        for (int i12 = 1; i12 < iA; i12++) {
            long j5 = ((q) list.get(i12)).f14960a;
            float fFloatValue = arrayList != null ? ((Number) arrayList.get(i12)).floatValue() : i12 / n3.l.A(list);
            int i13 = i11 + 1;
            fArr2[i11] = fFloatValue;
            if (q.d(j5) == 0.0f) {
                i11 += 2;
                fArr2[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr2[i11] = arrayList != null ? ((Number) arrayList.get(n3.l.A(list))).floatValue() : 1.0f;
        return fArr2;
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final long w(x1.c cVar) {
        float f10 = cVar.f14525c - cVar.f14523a;
        return (((long) Float.floatToRawIntBits(cVar.f14526d - cVar.f14524b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final BlendMode x(int i7) {
        if (i7 == 0) {
            return BlendMode.CLEAR;
        }
        if (i7 == 1) {
            return BlendMode.SRC;
        }
        if (i7 == 2) {
            return BlendMode.DST;
        }
        if (i7 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i7 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i7 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i7 == 6) {
            return BlendMode.DST_IN;
        }
        if (i7 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i7 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i7 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i7 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i7 == 11) {
            return BlendMode.XOR;
        }
        if (i7 == 12) {
            return BlendMode.PLUS;
        }
        if (i7 == 13) {
            return BlendMode.MODULATE;
        }
        if (i7 == 14) {
            return BlendMode.SCREEN;
        }
        if (i7 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i7 == 16) {
            return BlendMode.DARKEN;
        }
        if (i7 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i7 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i7 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i7 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i7 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i7 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i7 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i7 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i7 == 25) {
            return BlendMode.HUE;
        }
        if (i7 == 26) {
            return BlendMode.SATURATION;
        }
        if (i7 == 27) {
            return BlendMode.COLOR;
        }
        return i7 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect y(n3.k kVar) {
        return new Rect(kVar.f8741a, kVar.f8742b, kVar.f8743c, kVar.f8744d);
    }

    public static final Rect z(x1.c cVar) {
        return new Rect((int) cVar.f14523a, (int) cVar.f14524b, (int) cVar.f14525c, (int) cVar.f14526d);
    }

    public abstract x1.c o();
}
