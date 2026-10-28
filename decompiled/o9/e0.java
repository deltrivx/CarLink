package o9;

import a8.k0;
import a8.u0;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.FillElement;
import b3.i0;
import c1.u2;
import c1.y2;
import c1.z2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import d0.h0;
import e4.l0;
import f1.b1;
import f1.q1;
import f1.w0;
import f1.w1;
import f1.w2;
import h0.o0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import nb.s0;
import o2.m0;
import o9.e0;
import p.n2;
import r2.j1;
import r9.n1;
import ra.g0;
import t8.z;
import x.d1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f9553a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f9554b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9555c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f9556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f9557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f9558f;

    public static Set A() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Type B(x xVar) {
        y yVar = xVar.f9568a;
        if (yVar == null) {
            return f0.f9559c;
        }
        i9.m mVar = xVar.f9569b;
        i9.l.b(mVar);
        int iOrdinal = yVar.ordinal();
        if (iOrdinal == 0) {
            return n(mVar, true);
        }
        if (iOrdinal == 1) {
            return new f0(null, n(mVar, true));
        }
        if (iOrdinal == 2) {
            return new f0(n(mVar, true), null);
        }
        throw new cc.s();
    }

    public static final ViewParent C(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final j4.a D(View view) {
        j4.a aVar = (j4.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        j4.a aVar2 = new j4.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0266 A[EDGE_INSN: B:145:0x0266->B:172:0x02c2 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282]] */
    public static final int E(c3.n nVar, Layout layout, b3.r rVar, int i7, RectF rectF, d3.d dVar, b3.a aVar, boolean z10) {
        c3.g[] gVarArr;
        int i10;
        int i11;
        c3.g[] gVarArr2;
        int i12;
        int iY;
        int i13;
        int i14;
        int iX;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i7);
        int lineBottom = layout.getLineBottom(i7);
        int lineStart = layout.getLineStart(i7);
        int lineEnd = layout.getLineEnd(i7);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i15 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i15];
        Layout layout2 = nVar.f2408f;
        int lineStart2 = layout2.getLineStart(i7);
        int iF = nVar.f(i7);
        if (i15 < (iF - lineStart2) * 2) {
            h3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        c3.e eVar = new c3.e(nVar);
        boolean z11 = false;
        boolean z12 = layout2.getParagraphDirection(i7) == 1;
        int i16 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z12 && !zIsRtlCharAt) {
                fA = eVar.a(lineStart2, z11, z11, true);
                fA3 = eVar.a(lineStart2 + 1, true, true, true);
            } else if (z12 && zIsRtlCharAt) {
                fA3 = eVar.a(lineStart2, false, false, false);
                fA = eVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = eVar.a(lineStart2, false, false, true);
                    fA = eVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = eVar.a(lineStart2, false, false, false);
                    fA2 = eVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i16] = fA;
            fArr[i16 + 1] = fA3;
            i16 += 2;
            lineStart2++;
            z12 = z12;
            z11 = false;
        }
        Layout layout3 = (Layout) rVar.f1433b;
        int lineStart3 = layout3.getLineStart(i7);
        int lineEnd2 = layout3.getLineEnd(i7);
        int iL = rVar.l(lineStart3, false);
        int iN = rVar.n(iL);
        int i17 = lineStart3 - iN;
        int i18 = lineEnd2 - iN;
        Bidi bidiH = rVar.h(iL);
        if (bidiH == null || (bidiCreateLineBidi = bidiH.createLineBidi(i17, i18)) == null) {
            i10 = 0;
            gVarArr = new c3.g[]{new c3.g(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            gVarArr = new c3.g[runCount];
            int i19 = 0;
            while (i19 < runCount) {
                int i20 = runCount;
                gVarArr[i19] = new c3.g(bidiCreateLineBidi.getRunStart(i19) + lineStart3, bidiCreateLineBidi.getRunLimit(i19) + lineStart3, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1);
                i19++;
                runCount = i20;
            }
            i10 = 0;
        }
        n9.b dVar2 = z10 ? new n9.d(i10, gVarArr.length - 1, 1) : new n9.b(gVarArr.length - 1, i10, -1);
        int i21 = dVar2.f8965a;
        int i22 = dVar2.f8966b;
        int i23 = dVar2.f8967c;
        if ((i23 <= 0 || i21 > i22) && (i23 >= 0 || i22 > i21)) {
            return -1;
        }
        while (true) {
            c3.g gVar = gVarArr[i21];
            boolean z13 = gVar.f2376c;
            int iJ = gVar.f2374a;
            int iK = gVar.f2375b;
            float f10 = z13 ? fArr[((iK - 1) - lineStart) * 2] : fArr[(iJ - lineStart) * 2];
            float fW = z13 ? w(iJ, lineStart, fArr) : w(iK - 1, lineStart, fArr);
            if (z10) {
                float f11 = rectF.left;
                if (fW >= f11) {
                    i11 = i23;
                    float f12 = rectF.right;
                    if (f10 <= f12) {
                        if ((z13 || f11 > f10) && (!z13 || f12 < fW)) {
                            int i24 = iK;
                            int i25 = iJ;
                            while (true) {
                                i13 = i24;
                                if (i24 - i25 <= 1) {
                                    break;
                                }
                                int i26 = (i13 + i25) / 2;
                                float f13 = fArr[(i26 - lineStart) * 2];
                                if ((z13 || f13 <= rectF.left) && (!z13 || f13 >= rectF.right)) {
                                    i24 = i13;
                                    i25 = i26;
                                } else {
                                    i24 = i26;
                                }
                            }
                            i14 = z13 ? i13 : i25;
                        } else {
                            i14 = iJ;
                        }
                        int iY2 = dVar.Y(i14);
                        if (iY2 != -1 && (iX = dVar.X(iY2)) < iK) {
                            if (iX >= iJ) {
                                iJ = iX;
                            }
                            if (iY2 > iK) {
                                iY2 = iK;
                            }
                            gVarArr2 = gVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iY3 = iY2;
                            while (true) {
                                rectF2.left = z13 ? fArr[((iY3 - 1) - lineStart) * 2] : fArr[(iJ - lineStart) * 2];
                                rectF2.right = z13 ? w(iJ, lineStart, fArr) : w(iY3 - 1, lineStart, fArr);
                                if (((Boolean) aVar.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iJ = dVar.J(iJ);
                                if (iJ != -1 && iJ < iK) {
                                    iY3 = dVar.Y(iJ);
                                    if (iY3 > iK) {
                                        iY3 = iK;
                                    }
                                }
                            }
                        }
                        iJ = -1;
                        break;
                    }
                } else {
                    i11 = i23;
                }
                gVarArr2 = gVarArr;
                iJ = -1;
                break;
            } else {
                i11 = i23;
                gVarArr2 = gVarArr;
                float f14 = rectF.left;
                if (fW < f14) {
                    iK = -1;
                    break;
                }
                float f15 = rectF.right;
                if (f10 <= f15) {
                    if ((z13 || f15 < fW) && (!z13 || f14 > f10)) {
                        int i27 = iK;
                        int i28 = iJ;
                        while (i27 - i28 > 1) {
                            int i29 = (i27 + i28) / 2;
                            float f16 = fArr[(i29 - lineStart) * 2];
                            int i30 = i27;
                            if ((z13 || f16 <= rectF.right) && (!z13 || f16 >= rectF.left)) {
                                i27 = i30;
                                i28 = i29;
                            } else {
                                i27 = i29;
                            }
                        }
                        i12 = z13 ? i27 : i28;
                    } else {
                        i12 = iK - 1;
                    }
                    int iX2 = dVar.X(i12 + 1);
                    if (iX2 == -1 || (iY = dVar.Y(iX2)) <= iJ) {
                        iK = -1;
                        break;
                    }
                    if (iX2 < iJ) {
                        iX2 = iJ;
                    }
                    if (iY <= iK) {
                        iK = iY;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iX3 = iX2;
                    while (true) {
                        rectF3.left = z13 ? fArr[((iK - 1) - lineStart) * 2] : fArr[(iX3 - lineStart) * 2];
                        rectF3.right = z13 ? w(iX3, lineStart, fArr) : w(iK - 1, lineStart, fArr);
                        if (((Boolean) aVar.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iK = dVar.K(iK);
                        if (iK == -1 || iK <= iJ) {
                            iK = -1;
                            break;
                        }
                        iX3 = dVar.X(iK);
                        if (iX3 < iJ) {
                            iX3 = iJ;
                        }
                    }
                } else {
                    iK = -1;
                    break;
                }
                iJ = iK;
            }
            if (iJ >= 0) {
                return iJ;
            }
            if (i21 == i22) {
                return -1;
            }
            i21 += i11;
            i23 = i11;
            gVarArr = gVarArr2;
        }
    }

    public static t8.j F(double d10, double d11, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i7 = calendar.get(6);
        int i10 = (calendar.get(16) + calendar.get(15)) / 3600000;
        double d12 = d11 / 15.0d;
        double d13 = i7;
        return new t8.j(I(G(d10, d12, i10, ((((double) 6) - d12) / 24.0d) + d13, true), "06:00"), I(G(d10, d12, i10, ((((double) 18) - d12) / 24.0d) + d13, false), "18:00"));
    }

    public static final double G(double d10, double d11, int i7, double d12, boolean z10) {
        double d13 = (0.9856d * d12) - 3.289d;
        double d14 = 360;
        double dSin = ((((Math.sin(Math.toRadians(d13) * ((double) 2)) * 0.02d) + ((Math.sin(Math.toRadians(d13)) * 1.916d) + d13)) + 282.634d) + d14) % d14;
        double degrees = (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(dSin)) * 0.91764d)) + d14) % d14;
        double d15 = 90;
        double dFloor = ((degrees + (Math.floor(dSin / 90.0d) * d15)) - (Math.floor(degrees / 90.0d) * d15)) / 15.0d;
        double dSin2 = Math.sin(Math.toRadians(dSin)) * 0.39782d;
        double dCos = (Math.cos(Math.toRadians(90.833d)) - (Math.sin(Math.toRadians(d10)) * dSin2)) / (Math.cos(Math.toRadians(d10)) * Math.cos(Math.asin(dSin2)));
        if (dCos > 1.0d || dCos < -1.0d) {
            return Double.NaN;
        }
        double d16 = 24;
        return ((((((((z10 ? d14 - Math.toDegrees(Math.acos(dCos)) : Math.toDegrees(Math.acos(dCos))) / 15.0d) + dFloor) - (0.06571d * d12)) - 6.622d) - d11) + d16) % d16) + ((double) i7);
    }

    public static final t8.j H(double d10, double d11, LocalDate localDate) {
        t8.j jVarF = F(d10, d11, new Date());
        String str = (String) jVarF.f12830a;
        String str2 = (String) jVarF.f12831b;
        t8.o oVar = n8.d.f8898a;
        n8.d.g("TASKER_SUN_CYCLE", localDate + "|" + str + "|" + str2);
        return new t8.j(str, str2);
    }

    public static final String I(double d10, String str) {
        if (Double.isNaN(d10)) {
            return str;
        }
        double d11 = 24;
        double d12 = (d10 + d11) % d11;
        int iFloor = (int) Math.floor(d12);
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iFloor), Integer.valueOf((int) Math.floor((d12 - ((double) iFloor)) * ((double) 60)))}, 2));
    }

    public static boolean J() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e5.a.a();
        }
        try {
            if (f9558f == null) {
                f9557e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9558f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9558f.invoke(null, Long.valueOf(f9557e))).booleanValue();
        } catch (Exception e7) {
            if (!(e7 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
                return false;
            }
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean K(byte b10) {
        return b10 > -65;
    }

    public static final int L(String str) {
        List listJ0 = zb.j.J0(str, new String[]{":"}, 6);
        ArrayList arrayList = new ArrayList(u8.q.a0(listJ0, 10));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return (((Number) arrayList.get(0)).intValue() * 60) + ((Number) arrayList.get(1)).intValue();
    }

    public static float M(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return i4.d.c(edgeEffect, f10, f11);
        }
        i4.c.a(edgeEffect, f10, f11);
        return f10;
    }

    public static final long N(long j5, long j10) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final long O(long j5) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j5 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final Object Q(hc.p pVar, hc.p pVar2, h9.n nVar) {
        Object rVar;
        Object objS;
        try {
            i9.b0.d(2, nVar);
            rVar = nVar.invoke(pVar2, pVar);
        } catch (Throwable th) {
            rVar = new cc.r(th, false);
        }
        z8.a aVar = z8.a.f15774a;
        if (rVar == aVar || (objS = pVar.S(rVar)) == cc.b0.f2594e) {
            return aVar;
        }
        if (objS instanceof cc.r) {
            throw ((cc.r) objS).f2662a;
        }
        return cc.b0.y(objS);
    }

    public static la.a R(s0 s0Var, boolean z10, ka.f0 f0Var, int i7) {
        boolean z11 = (i7 & 1) != 0 ? false : z10;
        boolean z12 = (i7 & 2) == 0;
        if ((i7 & 4) != 0) {
            f0Var = null;
        }
        return new la.a(s0Var, z12, z11, f0Var != null ? n3.r.W(f0Var) : null, 34);
    }

    public static String S(int i7) {
        if (i7 == 0) {
            return "Unspecified";
        }
        if (i7 == 1) {
            return "Text";
        }
        if (i7 == 2) {
            return "Ascii";
        }
        if (i7 == 3) {
            return "Number";
        }
        if (i7 == 4) {
            return "Phone";
        }
        if (i7 == 5) {
            return "Uri";
        }
        if (i7 == 6) {
            return "Email";
        }
        if (i7 == 7) {
            return "Password";
        }
        if (i7 == 8) {
            return "NumberPassword";
        }
        return i7 == 9 ? "Decimal" : "Invalid";
    }

    public static final Class T(ClassLoader classLoader, String str) {
        i9.l.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void U() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void V(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static final void a(r1.p pVar, m5.l lVar, boolean z10, h9.k kVar, f1.s sVar, int i7) {
        int i10;
        h9.k kVar2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        i9.l.e(pVar, "modifier");
        i9.l.e(lVar, "controller");
        sVar.Y(-108190900);
        if ((i7 & 14) == 0) {
            i10 = i7 | (sVar.f(pVar) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 112) == 0) {
            i10 |= sVar.f(lVar) ? 32 : 16;
        }
        int i13 = i10 | 3200;
        if ((i7 & 57344) == 0) {
            i13 = i10 | 11392;
        }
        if ((i7 & 458752) == 0) {
            kVar2 = kVar;
            i13 |= sVar.h(kVar2) ? 131072 : 65536;
        } else {
            kVar2 = kVar;
        }
        int i14 = i13 | 1572864;
        if ((2995931 & i14) == 599186 && sVar.z()) {
            sVar.Q();
            z12 = z10;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                i11 = i14 & (-57345);
                z11 = true;
            } else {
                sVar.Q();
                i11 = i14 & (-57345);
                z11 = z10;
            }
            sVar.q();
            sVar.X(1187531648);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(new n3.m(0L));
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            sVar.X(1187533503);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                long j5 = ((n3.m) b1Var.getValue()).f8746a;
                objK2 = f1.b.s(Float.valueOf(Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L)) * 0.5f));
                sVar.h0(objK2);
            }
            b1 b1Var2 = (b1) objK2;
            sVar.p(false);
            sVar.X(1187535327);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = f1.b.s(new x1.b(k9.a.u(((n3.m) b1Var.getValue()).f8746a)));
                sVar.h0(objK3);
            }
            b1 b1Var3 = (b1) objK3;
            sVar.p(false);
            r1.p pVarA = pVar.a(androidx.compose.foundation.layout.c.f822c);
            sVar.X(1187545700);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                i12 = 458752;
                objK4 = new e8.l(4, b1Var, b1Var2, b1Var3);
                sVar.h0(objK4);
            } else {
                i12 = 458752;
            }
            h9.k kVar3 = (h9.k) objK4;
            sVar.p(false);
            sVar.X(1187549276);
            int i15 = i11 & 112;
            boolean z13 = ((3670016 & i11) == 1048576) | (i15 == 32);
            Object objK5 = sVar.K();
            if (z13 || objK5 == w0Var) {
                objK5 = new u0(lVar, b1Var3, b1Var2, 5);
                sVar.h0(objK5);
            }
            h9.k kVar4 = (h9.k) objK5;
            sVar.p(false);
            sVar.X(1187572710);
            boolean z14 = i15 == 32;
            Object objK6 = sVar.K();
            if (z14 || objK6 == w0Var) {
                objK6 = new m5.p(lVar, 1);
                sVar.h0(objK6);
            }
            sVar.p(false);
            boolean z15 = z11;
            i2.c.f(pVarA, lVar, z15, kVar2, kVar3, kVar4, (h9.n) objK6, sVar, 1573376 | i15 | (i11 & 7168) | (i11 & i12));
            z12 = z15;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.i(pVar, lVar, z12, kVar, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void b(int i7, int i10, d0.g gVar, h0 h0Var, f0.u uVar, f1.s sVar, h9.k kVar, r1.f fVar, r1.p pVar, x.h hVar, z.h hVar2, boolean z10) {
        r1.p pVar2;
        int i11;
        f0.u uVarA;
        int i12;
        int i13;
        h0 h0Var2;
        int i14;
        int i15;
        d0.g gVar2;
        int i16;
        boolean z11;
        r1.f fVar2;
        x.h hVar3;
        r1.p pVar3;
        f0.u uVar2;
        h0 h0Var3;
        d0.g gVar3;
        z.h hVar4;
        boolean z12;
        w1 w1VarR;
        r1.p pVar4;
        h0 h0Var4;
        r1.p pVar5;
        r1.f fVar3;
        int i17;
        h0 h0Var5;
        z.h hVarI0;
        x.h hVarA;
        boolean z13;
        int i18;
        int i19;
        sVar.Y(53695811);
        int i20 = i10 & 1;
        if (i20 != 0) {
            i11 = i7 | 6;
            pVar2 = pVar;
        } else if ((i7 & 6) == 0) {
            pVar2 = pVar;
            i11 = (sVar.f(pVar2) ? 4 : 2) | i7;
        } else {
            pVar2 = pVar;
            i11 = i7;
        }
        if ((i10 & 2) == 0) {
            uVarA = uVar;
            int i21 = sVar.f(uVarA) ? 32 : 16;
            i12 = i11 | i21;
            i13 = i10 & 4;
            if (i13 != 0) {
                if ((i7 & 384) == 0) {
                    h0Var2 = h0Var;
                    if (sVar.f(h0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 3072;
                if ((i7 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        gVar2 = gVar;
                        if (sVar.f(gVar2)) {
                            i19 = 16384;
                        }
                        i15 |= i19;
                    } else {
                        gVar2 = gVar;
                    }
                    i19 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    i15 |= i19;
                } else {
                    gVar2 = gVar;
                }
                i16 = i15 | 46858240;
                if ((805306368 & i7) == 0) {
                    if (sVar.h(kVar)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((306783379 & i16) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.N(i16 & 1, z11)) {
                    sVar.S();
                    if ((i7 & 1) != 0 || sVar.x()) {
                        if (i20 != 0) {
                            pVar4 = r1.m.f11116a;
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i16 &= -113;
                            uVarA = f0.w.a(sVar);
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            h0Var4 = new h0(f10, f10, f10, f10);
                        } else {
                            h0Var4 = h0Var2;
                        }
                        if ((i10 & 16) != 0) {
                            i16 &= -57345;
                            gVar2 = d0.h.f3568c;
                        }
                        pVar5 = pVar4;
                        fVar3 = r1.c.f11103m;
                        i17 = i16 & (-238551041);
                        h0Var5 = h0Var4;
                        hVarI0 = n3.n.i0(sVar);
                        hVarA = d1.a(sVar);
                        z13 = true;
                    } else {
                        sVar.Q();
                        if ((i10 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i10 & 16) != 0) {
                            i16 &= -57345;
                        }
                        i17 = i16 & (-238551041);
                        fVar3 = fVar;
                        hVarA = hVar;
                        hVarI0 = hVar2;
                        z13 = z10;
                        pVar5 = pVar2;
                        h0Var5 = h0Var2;
                    }
                    f0.u uVar3 = uVarA;
                    d0.g gVar4 = gVar2;
                    sVar.q();
                    a.a.g((i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 806882304, ((i17 >> 12) & 14) | ((i17 >> 18) & 7168), gVar4, h0Var5, uVar3, sVar, kVar, fVar3, pVar5, hVarA, hVarI0, z13);
                    gVar3 = gVar4;
                    h0Var3 = h0Var5;
                    uVar2 = uVar3;
                    fVar2 = fVar3;
                    pVar3 = pVar5;
                    hVar3 = hVarA;
                    hVar4 = hVarI0;
                    z12 = z13;
                } else {
                    sVar.Q();
                    fVar2 = fVar;
                    hVar3 = hVar;
                    pVar3 = pVar2;
                    uVar2 = uVarA;
                    h0Var3 = h0Var2;
                    gVar3 = gVar2;
                    hVar4 = hVar2;
                    z12 = z10;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new f0.b(pVar3, uVar2, h0Var3, gVar3, fVar2, hVar4, z12, hVar3, kVar, i7, i10);
                }
            }
            i12 |= 384;
            h0Var2 = h0Var;
            i15 = i12 | 3072;
            if ((i7 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                        i19 = 16384;
                    }
                    i15 |= i19;
                } else {
                    gVar2 = gVar;
                }
                i19 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                i15 |= i19;
            } else {
                gVar2 = gVar;
            }
            i16 = i15 | 46858240;
            if ((805306368 & i7) == 0) {
                if (sVar.h(kVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((306783379 & i16) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.N(i16 & 1, z11)) {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if (i20 != 0) {
                        pVar4 = r1.m.f11116a;
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i16 &= -113;
                        uVarA = f0.w.a(sVar);
                    }
                    if (i13 != 0) {
                        float f11 = 0;
                        h0Var4 = new h0(f11, f11, f11, f11);
                    } else {
                        h0Var4 = h0Var2;
                    }
                    if ((i10 & 16) != 0) {
                        i16 &= -57345;
                        gVar2 = d0.h.f3568c;
                    }
                    pVar5 = pVar4;
                    fVar3 = r1.c.f11103m;
                    i17 = i16 & (-238551041);
                    h0Var5 = h0Var4;
                    hVarI0 = n3.n.i0(sVar);
                    hVarA = d1.a(sVar);
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        pVar4 = r1.m.f11116a;
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i16 &= -113;
                        uVarA = f0.w.a(sVar);
                    }
                    if (i13 != 0) {
                        float f12 = 0;
                        h0Var4 = new h0(f12, f12, f12, f12);
                    } else {
                        h0Var4 = h0Var2;
                    }
                    if ((i10 & 16) != 0) {
                        i16 &= -57345;
                        gVar2 = d0.h.f3568c;
                    }
                    pVar5 = pVar4;
                    fVar3 = r1.c.f11103m;
                    i17 = i16 & (-238551041);
                    h0Var5 = h0Var4;
                    hVarI0 = n3.n.i0(sVar);
                    hVarA = d1.a(sVar);
                    z13 = true;
                }
                f0.u uVar4 = uVarA;
                d0.g gVar5 = gVar2;
                sVar.q();
                a.a.g((i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 806882304, ((i17 >> 12) & 14) | ((i17 >> 18) & 7168), gVar5, h0Var5, uVar4, sVar, kVar, fVar3, pVar5, hVarA, hVarI0, z13);
                gVar3 = gVar5;
                h0Var3 = h0Var5;
                uVar2 = uVar4;
                fVar2 = fVar3;
                pVar3 = pVar5;
                hVar3 = hVarA;
                hVar4 = hVarI0;
                z12 = z13;
            } else {
                sVar.Q();
                fVar2 = fVar;
                hVar3 = hVar;
                pVar3 = pVar2;
                uVar2 = uVarA;
                h0Var3 = h0Var2;
                gVar3 = gVar2;
                hVar4 = hVar2;
                z12 = z10;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new f0.b(pVar3, uVar2, h0Var3, gVar3, fVar2, hVar4, z12, hVar3, kVar, i7, i10);
            }
        }
        uVarA = uVar;
        i12 = i11 | i21;
        i13 = i10 & 4;
        if (i13 != 0) {
            if ((i7 & 384) == 0) {
                h0Var2 = h0Var;
                if (sVar.f(h0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i12 | 3072;
            if ((i7 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                        i19 = 16384;
                    }
                    i15 |= i19;
                } else {
                    gVar2 = gVar;
                }
                i19 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                i15 |= i19;
            } else {
                gVar2 = gVar;
            }
            i16 = i15 | 46858240;
            if ((805306368 & i7) == 0) {
                if (sVar.h(kVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((306783379 & i16) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.N(i16 & 1, z11)) {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if (i20 != 0) {
                        pVar4 = r1.m.f11116a;
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i16 &= -113;
                        uVarA = f0.w.a(sVar);
                    }
                    if (i13 != 0) {
                        float f13 = 0;
                        h0Var4 = new h0(f13, f13, f13, f13);
                    } else {
                        h0Var4 = h0Var2;
                    }
                    if ((i10 & 16) != 0) {
                        i16 &= -57345;
                        gVar2 = d0.h.f3568c;
                    }
                    pVar5 = pVar4;
                    fVar3 = r1.c.f11103m;
                    i17 = i16 & (-238551041);
                    h0Var5 = h0Var4;
                    hVarI0 = n3.n.i0(sVar);
                    hVarA = d1.a(sVar);
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        pVar4 = r1.m.f11116a;
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i16 &= -113;
                        uVarA = f0.w.a(sVar);
                    }
                    if (i13 != 0) {
                        float f14 = 0;
                        h0Var4 = new h0(f14, f14, f14, f14);
                    } else {
                        h0Var4 = h0Var2;
                    }
                    if ((i10 & 16) != 0) {
                        i16 &= -57345;
                        gVar2 = d0.h.f3568c;
                    }
                    pVar5 = pVar4;
                    fVar3 = r1.c.f11103m;
                    i17 = i16 & (-238551041);
                    h0Var5 = h0Var4;
                    hVarI0 = n3.n.i0(sVar);
                    hVarA = d1.a(sVar);
                    z13 = true;
                }
                f0.u uVar5 = uVarA;
                d0.g gVar6 = gVar2;
                sVar.q();
                a.a.g((i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 806882304, ((i17 >> 12) & 14) | ((i17 >> 18) & 7168), gVar6, h0Var5, uVar5, sVar, kVar, fVar3, pVar5, hVarA, hVarI0, z13);
                gVar3 = gVar6;
                h0Var3 = h0Var5;
                uVar2 = uVar5;
                fVar2 = fVar3;
                pVar3 = pVar5;
                hVar3 = hVarA;
                hVar4 = hVarI0;
                z12 = z13;
            } else {
                sVar.Q();
                fVar2 = fVar;
                hVar3 = hVar;
                pVar3 = pVar2;
                uVar2 = uVarA;
                h0Var3 = h0Var2;
                gVar3 = gVar2;
                hVar4 = hVar2;
                z12 = z10;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new f0.b(pVar3, uVar2, h0Var3, gVar3, fVar2, hVar4, z12, hVar3, kVar, i7, i10);
            }
        }
        i12 |= 384;
        h0Var2 = h0Var;
        i15 = i12 | 3072;
        if ((i7 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                gVar2 = gVar;
                if (sVar.f(gVar2)) {
                    i19 = 16384;
                }
                i15 |= i19;
            } else {
                gVar2 = gVar;
            }
            i19 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            i15 |= i19;
        } else {
            gVar2 = gVar;
        }
        i16 = i15 | 46858240;
        if ((805306368 & i7) == 0) {
            if (sVar.h(kVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i16 |= i18;
        }
        if ((306783379 & i16) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.N(i16 & 1, z11)) {
            sVar.S();
            if ((i7 & 1) != 0) {
                if (i20 != 0) {
                    pVar4 = r1.m.f11116a;
                } else {
                    pVar4 = pVar2;
                }
                if ((i10 & 2) != 0) {
                    i16 &= -113;
                    uVarA = f0.w.a(sVar);
                }
                if (i13 != 0) {
                    float f15 = 0;
                    h0Var4 = new h0(f15, f15, f15, f15);
                } else {
                    h0Var4 = h0Var2;
                }
                if ((i10 & 16) != 0) {
                    i16 &= -57345;
                    gVar2 = d0.h.f3568c;
                }
                pVar5 = pVar4;
                fVar3 = r1.c.f11103m;
                i17 = i16 & (-238551041);
                h0Var5 = h0Var4;
                hVarI0 = n3.n.i0(sVar);
                hVarA = d1.a(sVar);
                z13 = true;
            } else {
                if (i20 != 0) {
                    pVar4 = r1.m.f11116a;
                } else {
                    pVar4 = pVar2;
                }
                if ((i10 & 2) != 0) {
                    i16 &= -113;
                    uVarA = f0.w.a(sVar);
                }
                if (i13 != 0) {
                    float f16 = 0;
                    h0Var4 = new h0(f16, f16, f16, f16);
                } else {
                    h0Var4 = h0Var2;
                }
                if ((i10 & 16) != 0) {
                    i16 &= -57345;
                    gVar2 = d0.h.f3568c;
                }
                pVar5 = pVar4;
                fVar3 = r1.c.f11103m;
                i17 = i16 & (-238551041);
                h0Var5 = h0Var4;
                hVarI0 = n3.n.i0(sVar);
                hVarA = d1.a(sVar);
                z13 = true;
            }
            f0.u uVar6 = uVarA;
            d0.g gVar7 = gVar2;
            sVar.q();
            a.a.g((i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 806882304, ((i17 >> 12) & 14) | ((i17 >> 18) & 7168), gVar7, h0Var5, uVar6, sVar, kVar, fVar3, pVar5, hVarA, hVarI0, z13);
            gVar3 = gVar7;
            h0Var3 = h0Var5;
            uVar2 = uVar6;
            fVar2 = fVar3;
            pVar3 = pVar5;
            hVar3 = hVarA;
            hVar4 = hVarI0;
            z12 = z13;
        } else {
            sVar.Q();
            fVar2 = fVar;
            hVar3 = hVar;
            pVar3 = pVar2;
            uVar2 = uVarA;
            h0Var3 = h0Var2;
            gVar3 = gVar2;
            hVar4 = hVar2;
            z12 = z10;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.b(pVar3, uVar2, h0Var3, gVar3, fVar2, hVar4, z12, hVar3, kVar, i7, i10);
        }
    }

    public static final void c(final g0.a aVar, final r1.p pVar, g0.v vVar, h0 h0Var, final d0.g gVar, final d0.e eVar, z.h hVar, boolean z10, x.h hVar2, final h9.k kVar, f1.s sVar, final int i7) {
        r1.p pVar2;
        final g0.v vVar2;
        final h0 h0Var2;
        final z.h hVar3;
        final boolean z11;
        final x.h hVar4;
        g0.v vVar3;
        h0 h0Var3;
        z.h hVarI0;
        x.h hVarA;
        int i10;
        boolean z12;
        sVar.Y(-2072102870);
        int i11 = i7 | (sVar.f(aVar) ? 4 : 2);
        if ((i7 & 48) == 0) {
            pVar2 = pVar;
            i11 |= sVar.f(pVar2) ? 32 : 16;
        } else {
            pVar2 = pVar;
        }
        int i12 = i11 | 27776 | (sVar.f(gVar) ? 131072 : 65536) | (sVar.f(eVar) ? 1048576 : 524288) | 373293056;
        int i13 = sVar.h(kVar) ? 4 : 2;
        if (sVar.N(i12 & 1, ((306783379 & i12) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            sVar.S();
            int i14 = i7 & 1;
            w0 w0Var = f1.n.f5051a;
            if (i14 == 0 || sVar.x()) {
                g0.n nVar = g0.x.f5759a;
                Object[] objArr = new Object[0];
                u0.k kVar2 = g0.v.f5737w;
                boolean zD = sVar.d(0) | sVar.d(0);
                Object objK = sVar.K();
                if (zD || objK == w0Var) {
                    objK = new i0(12);
                    sVar.h0(objK);
                }
                vVar3 = (g0.v) o1.k.d(objArr, kVar2, (h9.a) objK, sVar, 0);
                float f10 = 0;
                h0Var3 = new h0(f10, f10, f10, f10);
                hVarI0 = n3.n.i0(sVar);
                hVarA = d1.a(sVar);
                i10 = i12 & (-1908409217);
                z12 = true;
            } else {
                sVar.Q();
                i10 = i12 & (-1908409217);
                vVar3 = vVar;
                h0Var3 = h0Var;
                hVarI0 = hVar;
                hVarA = hVar2;
                z12 = z10;
            }
            sVar.q();
            int i15 = (i10 & 14) | ((i10 >> 15) & 112);
            boolean z13 = ((((i15 & 14) ^ 6) > 4 && sVar.f(aVar)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && sVar.f(eVar)) || (i15 & 48) == 32);
            Object objK2 = sVar.K();
            if (z13 || objK2 == w0Var) {
                objK2 = new g0.c(new a8.m(7, aVar, eVar));
                sVar.h0(objK2);
            }
            z.h hVar5 = hVarI0;
            vVar2 = vVar3;
            h0 h0Var4 = h0Var3;
            x.h hVar6 = hVarA;
            a.a.f(pVar2, vVar2, (g0.c) objK2, h0Var4, hVar5, z12, hVar6, gVar, eVar, kVar, sVar, ((i10 >> 3) & 14) | 12807168 | ((i10 << 12) & 1879048192), ((i10 >> 18) & 14) | ((i13 << 3) & 112));
            h0Var2 = h0Var4;
            hVar4 = hVar6;
            z11 = z12;
            hVar3 = hVar5;
        } else {
            sVar.Q();
            vVar2 = vVar;
            h0Var2 = h0Var;
            hVar3 = hVar;
            z11 = z10;
            hVar4 = hVar2;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: g0.e
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e0.c(aVar, pVar, vVar2, h0Var2, gVar, eVar, hVar3, z11, hVar4, kVar, (f1.s) obj, f1.b.y(i7 | 1));
                    return z.f12851a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0210  */
    /* JADX WARN: Code duplicated, block: B:59:0x023a  */
    public static final void d(String str, n9.d dVar, int i7, h9.k kVar, f1.s sVar, int i10) {
        Object d0Var;
        f0.u uVar;
        f0.u uVar2;
        w2 w2Var;
        int i11;
        boolean zH;
        Object objK;
        n9.d dVar2 = dVar;
        h9.k kVar2 = kVar;
        f1.s sVar2 = sVar;
        i9.l.e(kVar2, "onSelectedChange");
        sVar2.Y(1662978753);
        int i12 = i10 | (sVar2.h(dVar2) ? 32 : 16) | (sVar2.d(i7) ? 256 : 128);
        if ((i12 & 1171) == 1170 && sVar2.z()) {
            sVar2.Q();
        } else {
            float f10 = 50;
            int iA0 = ((n3.c) sVar2.j(j1.f11276h)).a0(f10);
            f0.u uVarA = f0.w.a(sVar2);
            sVar2.W(1849434622);
            Object objK2 = sVar2.K();
            w0 w0Var = f1.n.f5051a;
            if (objK2 == w0Var) {
                objK2 = f1.b.o(new l8.u(iA0, 0, uVarA));
                sVar2.h0(objK2);
            }
            w2 w2Var2 = (w2) objK2;
            sVar2.p(false);
            Integer numValueOf = Integer.valueOf(i7);
            sVar2.W(-1633490746);
            boolean zF = ((i12 & 896) == 256) | sVar2.f(uVarA);
            Object objK3 = sVar2.K();
            if (zF || objK3 == w0Var) {
                objK3 = new o0(uVarA, i7, null, 2);
                sVar2.h0(objK3);
            }
            sVar2.p(false);
            f1.b.f(sVar2, (h9.n) objK3, numValueOf);
            Boolean boolValueOf = Boolean.valueOf(uVarA.f4860i.a());
            sVar2.W(-1224400529);
            boolean zF2 = sVar2.f(uVarA) | sVar2.h(dVar2);
            Object objK4 = sVar2.K();
            if (zF2 || objK4 == w0Var) {
                uVar = uVarA;
                d0Var = new l0.d0(uVar, kVar, dVar2, w2Var2, null);
                dVar2 = dVar2;
                w2Var2 = w2Var2;
                sVar2.h0(d0Var);
            } else {
                d0Var = objK4;
                uVar = uVarA;
            }
            sVar2.p(false);
            f1.b.f(sVar2, (h9.n) d0Var, boolValueOf);
            d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11104n, sVar2, 48);
            long j5 = sVar2.T;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar2.l();
            r1.m mVar = r1.m.f11116a;
            r1.p pVarC = r1.a.c(sVar2, mVar);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar = q2.i.f10708e;
            f1.b.w(sVar2, hVar, sVarA);
            q2.h hVar2 = q2.i.f10707d;
            f1.b.w(sVar2, hVar2, q1VarL);
            q2.h hVar3 = q2.i.f10709f;
            if (sVar2.S) {
                uVar2 = uVar;
            } else {
                uVar2 = uVar;
                if (!i9.l.a(sVar2.K(), Integer.valueOf(i13))) {
                }
                q2.h hVar4 = q2.i.f10706c;
                f1.b.w(sVar2, hVar4, pVarC);
                w2Var = w2Var2;
                u2.b(str, androidx.compose.foundation.layout.a.j(mVar, 0.0f, 20, 1), 0L, n3.r.D(26), null, 0L, null, 0L, 0, false, 0, 0, ((y2) sVar2.j(z2.f2365a)).f2353g, sVar, 3126, 0, 65524);
                sVar2 = sVar;
                float f11 = 12;
                r1.p pVarB = androidx.compose.foundation.a.b(n4.h.o(androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.b(mVar, 5 * f10), 0.0f, 0.0f, 0.0f, f11, 7), k0.e.a(f11)), ((c1.w) sVar2.j(c1.y.f2319a)).F, y1.h0.f14898a);
                m0 m0VarD = d0.m.d(r1.c.f11092a, false);
                long j10 = sVar2.T;
                i11 = (int) (j10 ^ (j10 >>> 32));
                q1 q1VarL2 = sVar2.l();
                r1.p pVarC2 = r1.a.c(sVar2, pVarB);
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, hVar, m0VarD);
                f1.b.w(sVar2, hVar2, q1VarL2);
                if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar2, i11, hVar3);
                }
                f1.b.w(sVar2, hVar4, pVarC2);
                FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
                h0 h0VarA = androidx.compose.foundation.layout.a.a(95, 1);
                d0.d dVar3 = d0.h.f3569d;
                sVar2.W(-1224400529);
                zH = sVar2.h(dVar2);
                objK = sVar2.K();
                if (!zH || objK == w0Var) {
                    kVar2 = kVar;
                    objK = new l8.v(dVar2, f10, kVar2, w2Var);
                    sVar2.h0(objK);
                } else {
                    kVar2 = kVar;
                }
                sVar2.p(false);
                b(24966, 488, dVar3, h0VarA, uVar2, sVar2, (h9.k) objK, null, fillElement, null, null, false);
                sVar2.p(true);
                sVar2.p(true);
            }
            ob.a.w(i13, sVar2, i13, hVar3);
            q2.h hVar5 = q2.i.f10706c;
            f1.b.w(sVar2, hVar5, pVarC);
            w2Var = w2Var2;
            u2.b(str, androidx.compose.foundation.layout.a.j(mVar, 0.0f, 20, 1), 0L, n3.r.D(26), null, 0L, null, 0L, 0, false, 0, 0, ((y2) sVar2.j(z2.f2365a)).f2353g, sVar, 3126, 0, 65524);
            sVar2 = sVar;
            float f12 = 12;
            r1.p pVarB2 = androidx.compose.foundation.a.b(n4.h.o(androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.b(mVar, 5 * f10), 0.0f, 0.0f, 0.0f, f12, 7), k0.e.a(f12)), ((c1.w) sVar2.j(c1.y.f2319a)).F, y1.h0.f14898a);
            m0 m0VarD2 = d0.m.d(r1.c.f11092a, false);
            long j11 = sVar2.T;
            i11 = (int) (j11 ^ (j11 >>> 32));
            q1 q1VarL3 = sVar2.l();
            r1.p pVarC3 = r1.a.c(sVar2, pVarB2);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar, m0VarD2);
            f1.b.w(sVar2, hVar2, q1VarL3);
            if (sVar2.S) {
                ob.a.w(i11, sVar2, i11, hVar3);
            } else {
                ob.a.w(i11, sVar2, i11, hVar3);
            }
            f1.b.w(sVar2, hVar5, pVarC3);
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f822c;
            h0 h0VarA2 = androidx.compose.foundation.layout.a.a(95, 1);
            d0.d dVar4 = d0.h.f3569d;
            sVar2.W(-1224400529);
            zH = sVar2.h(dVar2);
            objK = sVar2.K();
            if (zH) {
                kVar2 = kVar;
                objK = new l8.v(dVar2, f10, kVar2, w2Var);
                sVar2.h0(objK);
            } else {
                kVar2 = kVar;
                objK = new l8.v(dVar2, f10, kVar2, w2Var);
                sVar2.h0(objK);
            }
            sVar2.p(false);
            b(24966, 488, dVar4, h0VarA2, uVar2, sVar2, (h9.k) objK, null, fillElement2, null, null, false);
            sVar2.p(true);
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0.u(str, dVar2, i7, kVar2, i10, 2);
        }
    }

    public static final void e(List list, String str, boolean z10, h9.k kVar, f1.s sVar, int i7) {
        boolean z11;
        i9.l.e(str, "defaultValue");
        sVar.Y(-1044493676);
        if (((i7 | (sVar.f(str) ? 32 : 16) | 384) & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            z11 = z10;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            List listJ0 = zb.j.J0(str, new String[]{":"}, 2);
            n1.c cVarE = n1.h.e(-406421699, new a8.y(14, list), sVar);
            n1.c cVarE2 = n1.h.e(-262012004, new c8.u(1, str), sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 16);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, true, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 17);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(-1465200643, new k0(16, kVar, listJ0), sVar), sVar, 48, 1020);
            z11 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(list, str, z11, kVar, i7);
        }
    }

    public static Object f(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void g(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i7) throws com.google.protobuf.w0 {
        if (!K(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !K(b12) && !K(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw com.google.protobuf.w0.b();
    }

    public static void h(byte b10, byte b11, char[] cArr, int i7) throws com.google.protobuf.w0 {
        if (b10 < -62 || K(b11)) {
            throw com.google.protobuf.w0.b();
        }
        cArr[i7] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void i(byte b10, byte b11, byte b12, char[] cArr, int i7) throws com.google.protobuf.w0 {
        if (K(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || K(b12)))) {
            throw com.google.protobuf.w0.b();
        }
        cArr[i7] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static final String j(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        yb.j jVarR = yb.l.R(type, d0.f9552i);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = jVarR.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb2.append(((Class) next).getName());
        sb2.append(zb.q.l0(yb.l.N(jVarR), "[]"));
        return sb2.toString();
    }

    public static final f7.q l(float f10, long j5, long j10) {
        int i7 = ((int) f10) * 2;
        y1.f fVarF = y1.h0.f(i7, i7, 0);
        y1.b bVarA = y1.h0.a(fVarF);
        f7.q qVarH = y1.h0.h();
        qVarH.r(0);
        ((Paint) qVarH.f5447c).setAntiAlias(true);
        qVarH.k(j5);
        bVarA.d(0.0f, 0.0f, f10, f10, qVarH);
        float f11 = 0.0f + f10;
        float f12 = f10 + f10;
        bVarA.d(f11, f11, f12, f12, qVarH);
        qVarH.k(j10);
        bVarA.d(0.0f, f11, f11, f12, qVarH);
        bVarA.d(f11, 0.0f, f12, f11, qVarH);
        f7.q qVarH2 = y1.h0.h();
        ((Paint) qVarH2.f5447c).setAntiAlias(true);
        qVarH2.n(new BitmapShader(y1.h0.j(fVarF), y1.h0.B(1), y1.h0.B(1)));
        return qVarH2;
    }

    public static void m(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final Type n(i9.m mVar, boolean z10) {
        n1 n1Var = (n1) mVar;
        d dVarC = n1Var.c();
        if (dVarC instanceof v) {
            return new b0((v) dVarC);
        }
        if (!(dVarC instanceof c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + n1Var);
        }
        c cVar = (c) dVarC;
        Class clsM = z10 ? g5.a.M(cVar) : g5.a.L(cVar);
        List listB = n1Var.b();
        if (listB.isEmpty()) {
            return clsM;
        }
        if (!clsM.isArray()) {
            return r(clsM, listB);
        }
        if (clsM.getComponentType().isPrimitive()) {
            return clsM;
        }
        x xVar = (x) u8.p.C0(listB);
        if (xVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + n1Var);
        }
        y yVar = xVar.f9568a;
        i9.m mVar2 = xVar.f9569b;
        int i7 = yVar == null ? -1 : c0.f9551a[yVar.ordinal()];
        if (i7 == -1 || i7 == 1) {
            return clsM;
        }
        if (i7 != 2 && i7 != 3) {
            throw new cc.s();
        }
        i9.l.b(mVar2);
        Type typeN = n(mVar2, false);
        return typeN instanceof Class ? clsM : new a(typeN);
    }

    public static gb.o o(String str, List list) {
        gb.n nVar;
        i9.l.e(str, "debugName");
        wb.g gVar = new wb.g();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nVar = gb.n.f6198b;
            if (!zHasNext) {
                break;
            }
            gb.o oVar = (gb.o) it.next();
            if (oVar != nVar) {
                if (oVar instanceof gb.a) {
                    gb.o[] oVarArr = ((gb.a) oVar).f6158c;
                    i9.l.e(oVarArr, "elements");
                    gVar.addAll(u8.l.j0(oVarArr));
                } else {
                    gVar.add(oVar);
                }
            }
        }
        int i7 = gVar.f14291a;
        if (i7 != 0) {
            return i7 != 1 ? new gb.a(str, (gb.o[]) gVar.toArray(new gb.o[0])) : (gb.o) gVar.get(0);
        }
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static kb.c p(wa.c cVar, mb.k kVar, x9.y yVar, InputStream inputStream) throws IOException {
        g0 g0Var;
        xa.a aVar;
        i9.l.e(cVar, "fqName");
        i9.l.e(yVar, "module");
        try {
            sa.a aVar2 = sa.a.f12700f;
            sa.a aVarL = n3.r.L(inputStream);
            sa.a aVar3 = sa.a.f12700f;
            int i7 = aVarL.f12856c;
            i9.l.e(aVar3, "ourVersion");
            int i10 = aVar3.f12856c;
            int i11 = aVar3.f12855b;
            int i12 = aVarL.f12855b;
            if (i12 == 0) {
                if (i11 == 0 && i7 == i10) {
                    xa.g gVar = new xa.g();
                    sa.b.a(gVar);
                    ra.a aVar4 = g0.k;
                    aVar4.getClass();
                    xa.e eVar = new xa.e(inputStream);
                    aVar = (xa.a) aVar4.a(eVar, gVar);
                    try {
                        eVar.a(0);
                        xa.b.b(aVar);
                        g0Var = (g0) aVar;
                    } catch (xa.q e7) {
                        e7.f14823a = aVar;
                        throw e7;
                    }
                } else {
                    g0Var = null;
                }
            } else if (i12 != i11 || i7 > i10) {
                g0Var = null;
            } else {
                xa.g gVar2 = new xa.g();
                sa.b.a(gVar2);
                ra.a aVar5 = g0.k;
                aVar5.getClass();
                xa.e eVar2 = new xa.e(inputStream);
                aVar = (xa.a) aVar5.a(eVar2, gVar2);
                eVar2.a(0);
                xa.b.b(aVar);
                g0Var = (g0) aVar;
            }
            g0 g0Var2 = g0Var;
            inputStream.close();
            if (g0Var2 != null) {
                return new kb.c(cVar, kVar, yVar, g0Var2, aVarL);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar3 + ", actual " + aVarL + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                g5.a.m(inputStream, th);
                throw th2;
            }
        }
    }

    public static Handler q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a4.b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final a0 r(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B((x) it.next()));
            }
            return new a0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(B((x) it2.next()));
            }
            return new a0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        a0 a0VarR = r(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(u8.q.a0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(B((x) it3.next()));
        }
        return new a0(cls, a0VarR, arrayList3);
    }

    public static boolean s(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = l0.f4369a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = e4.k0.f4365d;
        e4.k0 k0Var = (e4.k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (k0Var == null) {
            k0Var = new e4.k0();
            k0Var.f4366a = null;
            k0Var.f4367b = null;
            k0Var.f4368c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        WeakReference weakReference2 = k0Var.f4368c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        k0Var.f4368c = new WeakReference(keyEvent);
        if (k0Var.f4367b == null) {
            k0Var.f4367b = new SparseArray();
        }
        SparseArray sparseArray = k0Var.f4367b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean t(e4.j jVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return jVar.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f9553a) {
                            try {
                                f9554b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f9553a = true;
                        }
                        Method method = f9554b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (l0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f9555c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f9556d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f9555c = true;
                }
                Field field = f9556d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (l0.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && l0.c(view, keyEvent)) || jVar.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final mc.a u(mc.d dVar, oc.a aVar, String str) {
        mc.a aVar2;
        i9.l.e(dVar, "<this>");
        c cVar = dVar.f8634a;
        mc.a aVar3 = (mc.a) dVar.f8638e.get(str);
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else {
            aVar.j().getClass();
            i9.l.e(cVar, "baseClass");
            i9.b0.f(1, null);
            aVar2 = null;
        }
        if (aVar2 != null) {
            return aVar2;
        }
        pc.m0.f(str, cVar);
        throw null;
    }

    public static final mc.a v(mc.d dVar, rc.s sVar, Object obj) {
        mc.a aVar;
        i9.l.e(dVar, "<this>");
        c cVar = dVar.f8634a;
        i9.l.e(obj, "value");
        Map map = dVar.f8637d;
        Class<?> cls = obj.getClass();
        i9.z zVar = i9.y.f6689a;
        mc.a aVar2 = (mc.a) map.get(zVar.b(cls));
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            sVar.f12362e.getClass();
            i9.l.e(cVar, "baseClass");
            if (cVar.m(obj)) {
                i9.b0.f(1, null);
            }
            aVar = null;
        }
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        c cVarB = zVar.b(obj.getClass());
        i9.l.e(cVar, "baseClass");
        String strL = cVarB.l();
        if (strL == null) {
            strL = String.valueOf(cVarB);
        }
        pc.m0.f(strL, cVar);
        throw null;
    }

    public static final float w(int i7, int i10, float[] fArr) {
        return fArr[((i7 - i10) * 2) + 1];
    }

    public static ColorStateList x(Context context, int i7) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        w3.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        w3.j jVar = new w3.j(resources, theme);
        synchronized (w3.l.f14124c) {
            try {
                SparseArray sparseArray = (SparseArray) w3.l.f14123b.get(jVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (iVar = (w3.i) sparseArray.get(i7)) == null) {
                    colorStateList = null;
                } else {
                    if (iVar.f14118b.equals(resources.getConfiguration())) {
                        if (theme != null || iVar.f14119c != 0) {
                            if (theme == null || iVar.f14119c != theme.hashCode()) {
                            }
                        }
                        colorStateList = iVar.f14117a;
                    }
                    sparseArray.remove(i7);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = w3.l.f14122a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i7, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateListA = w3.c.a(resources, resources.getXml(i7), theme);
            } catch (Exception e7) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? w3.h.a(resources, i7, theme) : resources.getColorStateList(i7);
        }
        w3.l.a(jVar, i7, colorStateListA, theme);
        return colorStateListA;
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return i4.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable z(Context context, int i7) {
        return n2.d().f(context, i7);
    }

    public abstract void P(c.o0 o0Var, c.o0 o0Var2, Window window, View view, boolean z10, boolean z11);

    public void k(Window window) {
    }
}
