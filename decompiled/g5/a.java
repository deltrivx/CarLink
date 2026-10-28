package g5;

import a5.g;
import aa.m;
import aa.y0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b3.q0;
import c1.g1;
import cc.s;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import com.google.protobuf.a2;
import com.google.protobuf.k0;
import com.google.protobuf.m2;
import com.google.protobuf.o1;
import com.google.protobuf.u0;
import com.google.protobuf.w0;
import com.google.protobuf.x1;
import e2.f;
import f1.b1;
import f1.q1;
import f1.w1;
import f3.k;
import gb.o;
import gb.q;
import i4.h;
import i9.l;
import i9.x;
import i9.y;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import k2.g0;
import l0.t0;
import l8.d0;
import l8.f0;
import l8.j0;
import l8.v;
import n3.n;
import n3.r;
import n3.u;
import nb.w;
import o9.e0;
import p.c1;
import q2.a0;
import q2.i;
import r1.p;
import r2.j1;
import t8.z;
import wa.e;
import x9.r0;
import y1.h0;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d3.d, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f5917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static da.a f5918b;

    public static int A(byte[] bArr, int i7, com.google.protobuf.f fVar) {
        int i10 = i7 + 1;
        long j5 = bArr[i7];
        if (j5 >= 0) {
            fVar.f2741b = j5;
            return i10;
        }
        int i11 = i7 + 2;
        byte b10 = bArr[i10];
        long j10 = (j5 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b11 & 127)) << i12;
            b10 = b11;
            i11 = i13;
        }
        fVar.f2741b = j10;
        return i11;
    }

    public static final float B(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f10 += fArr[i7] * fArr2[i7];
        }
        return f10;
    }

    public static long C(int i7, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i11, 262142);
        int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    n3.b.l(i14);
                    throw new s();
                }
                i13 = 8190;
            }
        }
        return n3.b.a(Math.min(i13, i7), i10 != Integer.MAX_VALUE ? Math.min(i13, i10) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long D(int i7, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i7, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    n3.b.l(i14);
                    throw new s();
                }
                i13 = 8190;
            }
        }
        return n3.b.a(iMin, iMin2, Math.min(i13, i11), i12 != Integer.MAX_VALUE ? Math.min(i13, i12) : Integer.MAX_VALUE);
    }

    public static final g E(View view) {
        l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            g gVar = tag instanceof g ? (g) tag : null;
            if (gVar != null) {
                return gVar;
            }
            Object objC = e0.C(view);
            view = objC instanceof View ? (View) objC : null;
        }
        return null;
    }

    public static final int F(k kVar, int i7) {
        boolean z10 = l.f(kVar.f5261a, k.f5257b.f5261a) >= 0;
        boolean z11 = i7 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final o9.c G(Annotation annotation) {
        l.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        l.d(clsAnnotationType, "annotationType(...)");
        return O(clsAnnotationType);
    }

    public static y0 H(e eVar, x9.e eVar2) {
        if (eVar == null) {
            a(19);
            throw null;
        }
        if (eVar2 == null) {
            a(20);
            throw null;
        }
        Collection collectionW = eVar2.w();
        if (collectionW.size() != 1) {
            return null;
        }
        for (y0 y0Var : ((m) collectionW.iterator().next()).X()) {
            if (y0Var.getName().equals(eVar)) {
                return y0Var;
            }
        }
        return null;
    }

    public static /* synthetic */ Collection I(q qVar, gb.f fVar, int i7) {
        if ((i7 & 1) != 0) {
            fVar = gb.f.f6173m;
        }
        o.f6199a.getClass();
        return qVar.d(fVar, gb.l.f6192b);
    }

    public static final Class L(o9.c cVar) {
        l.e(cVar, "<this>");
        Class clsA = ((i9.e) cVar).a();
        l.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class M(o9.c cVar) {
        l.e(cVar, "<this>");
        Class clsA = ((i9.e) cVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class N(o9.c cVar) {
        l.e(cVar, "<this>");
        Class clsA = ((i9.e) cVar).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final o9.c O(Class cls) {
        l.e(cls, "<this>");
        return y.f6689a.b(cls);
    }

    public static final int P(Layout layout, int i7, boolean z10) {
        if (i7 <= 0) {
            return 0;
        }
        if (i7 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i7);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i7 || lineEnd == i7) {
            if (lineStart == i7) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static c4.a Q(c1 c1Var) {
        int iA;
        int iE;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new c4.a(a4.b.j(c1Var));
        }
        TextPaint textPaint = new TextPaint(c1Var.getPaint());
        if (i7 >= 23) {
            iA = 1;
            iE = 1;
        } else {
            iA = 0;
            iE = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i7 >= 23) {
            iA = i4.b.a(c1Var);
            iE = i4.b.e(c1Var);
        }
        if (c1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i7 < 28 || (c1Var.getInputType() & 15) != 3) {
            boolean z10 = c1Var.getLayoutDirection() == 1;
            switch (c1Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(a4.b.c(a4.d.b(c1Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new c4.a(textPaint, textDirectionHeuristic, iA, iE);
    }

    public static int R(Object obj, x1 x1Var, byte[] bArr, int i7, int i10, int i11, com.google.protobuf.f fVar) {
        int iJ = ((o1) x1Var).J(obj, bArr, i7, i10, i11, fVar);
        fVar.f2742c = obj;
        return iJ;
    }

    public static int S(Object obj, x1 x1Var, byte[] bArr, int i7, int i10, com.google.protobuf.f fVar) throws w0 {
        int iX = i7 + 1;
        int i11 = bArr[i7];
        if (i11 < 0) {
            iX = x(i11, bArr, iX, fVar);
            i11 = fVar.f2740a;
        }
        int i12 = iX;
        if (i11 < 0 || i11 > i10 - i12) {
            throw w0.g();
        }
        int i13 = i12 + i11;
        x1Var.f(obj, bArr, i12, i13, fVar);
        fVar.f2742c = obj;
        return i13;
    }

    public static final long T(float f10, long j5) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j5 : y1.q.b(y1.q.d(j5) * f10, j5);
    }

    public static final void V(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        if (i7 == 0) {
            n2.a.a("At least one point must be provided");
        }
        int i10 = 2 >= i7 ? i7 - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i7];
        }
        for (int i13 = 0; i13 < i7; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11][];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i7];
        }
        float[][] fArr6 = new float[i11][];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        int i17 = 0;
        while (i17 < i11) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            l.e(fArr8, "<this>");
            l.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i7);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr9 = fArr5[i18];
                float fB = B(fArr7, fArr9);
                for (int i19 = 0; i19 < i7; i19++) {
                    fArr7[i19] = fArr7[i19] - (fArr9[i19] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(B(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i20 = 0; i20 < i7; i20++) {
                fArr7[i20] = fArr7[i20] * f10;
            }
            float[] fArr10 = fArr6[i17];
            int i21 = 0;
            while (i21 < i11) {
                fArr10[i21] = i21 < i17 ? 0.0f : B(fArr7, fArr4[i21]);
                i21++;
            }
            i17++;
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float fB2 = B(fArr5[i22], fArr2);
            float[] fArr11 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    fB2 -= fArr11[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = fB2 / fArr11[i22];
        }
    }

    public static e Z(e eVar, String str, String str2, int i7) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z10 = (i7 & 4) != 0;
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f14248b) {
            String strC = eVar.c();
            if (zb.q.o0(strC, str) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return e.e(str2.concat(j.H0(strC, str)));
                }
                if (!z10) {
                    return eVar;
                }
                String strH0 = j.H0(strC, str);
                if (strH0.length() != 0 && n3.l.G(0, strH0)) {
                    if (strH0.length() != 1 && n3.l.G(1, strH0)) {
                        Iterator it = new n9.d(0, strH0.length() - 1, 1).iterator();
                        do {
                            n9.c cVar = (n9.c) it;
                            if (!cVar.f8970c) {
                                next = null;
                                break;
                            }
                            next = cVar.next();
                        } while (n3.l.G(((Number) next).intValue(), strH0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strH0.substring(0, iIntValue);
                            l.d(strSubstring, "substring(...)");
                            String strZ = n3.l.Z(strSubstring);
                            String strSubstring2 = strH0.substring(iIntValue);
                            l.d(strSubstring2, "substring(...)");
                            strH0 = strZ.concat(strSubstring2);
                        } else {
                            strH0 = n3.l.Z(strH0);
                        }
                    } else if (strH0.length() != 0 && 'A' <= (cCharAt2 = strH0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strH0.substring(1);
                        l.d(strSubstring3, "substring(...)");
                        strH0 = lowerCase + strSubstring3;
                    }
                }
                if (e.f(strH0)) {
                    return e.e(strH0);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 18 ? 3 : 2];
        switch (i7) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final boolean a0(w wVar) {
        x9.h hVarL = wVar.D0().l();
        if (hVarL != null && ((za.f.b(hVarL) && za.f.f(hVarL) && !db.e.g((x9.e) hVarL).equals(u9.o.f13204h)) || za.f.h(wVar))) {
            return true;
        }
        x9.h hVarL2 = wVar.D0().l();
        r0 r0Var = hVarL2 instanceof r0 ? (r0) hVarL2 : null;
        return r0Var != null && a0(n.y0(r0Var));
    }

    public static final void b(String str, h9.n nVar, f1.s sVar, int i7, int i10) {
        int i11;
        f1.s sVar2;
        l.e(nVar, "content");
        sVar.Y(1245296559);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i11 = (sVar.f(str) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i11 & 19) == 18 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
        } else {
            String str2 = null;
            if (i12 != 0) {
                str = null;
            }
            if (str != null && !j.B0(str)) {
                str2 = str;
            }
            sVar.W(-1565878384);
            if (str2 != null) {
                i2.c.q(str2, sVar, 0);
            }
            sVar.p(false);
            sVar2 = sVar;
            g1.b(androidx.compose.foundation.layout.c.f820a, k0.e.a(n(12, sVar)), null, null, n1.h.e(-2133565571, new e8.r0(2, nVar), sVar), sVar2, ServiceTypes.MSG_MEDIA_DATA, 28);
        }
        String str3 = str;
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.a(str3, nVar, i7, i10, 0);
        }
    }

    public static final ja.c b0(da.a aVar, na.b bVar) {
        l.e(aVar, "<this>");
        l.e(bVar, "annotationsOwner");
        return new ja.c(aVar, bVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x0212  */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x022d  */
    /* JADX WARN: Code duplicated, block: B:120:0x022f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0237  */
    /* JADX WARN: Code duplicated, block: B:124:0x0239  */
    /* JADX WARN: Code duplicated, block: B:127:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x024c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0285  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x015c  */
    public static final void c(final List list, j0 j0Var, int i7, h9.o oVar, float f10, float f11, final h9.k kVar, f1.s sVar, final int i10, final int i11) {
        int i12;
        j0 j0Var2;
        int i13;
        int i14;
        h9.o oVar2;
        float f12;
        int i15;
        int i16;
        y8.c cVar;
        int i17;
        float fN;
        int i18;
        int i19;
        float fN2;
        float f13;
        j0 j0Var3;
        h9.o oVar3;
        int iIndexOf;
        float f14;
        float f15;
        float f16;
        float fG0;
        x.o1 o1VarN;
        boolean zF;
        Object objK;
        x.o1 o1Var;
        int i20;
        a0 a0Var;
        q2.h hVar;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objK2;
        final int i21;
        final j0 j0Var4;
        final float f17;
        final float f18;
        final h9.o oVar4;
        w1 w1VarR;
        int i22;
        l.e(list, "options");
        l.e(kVar, "onValueChanged");
        sVar.Y(-1163931029);
        if ((i10 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 != 0) {
            i13 = i12 | 48;
            j0Var2 = j0Var;
        } else {
            j0Var2 = j0Var;
            i13 = i12 | (sVar.h(j0Var2) ? 32 : 16);
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                i14 = i7;
                int i24 = sVar.d(i14) ? 256 : 128;
                i13 |= i24;
            } else {
                i14 = i7;
            }
            i13 |= i24;
        } else {
            i14 = i7;
        }
        int i25 = i11 & 8;
        if (i25 == 0) {
            if ((i10 & 3072) == 0) {
                oVar2 = oVar;
                i13 |= sVar.h(oVar2) ? 2048 : 1024;
            }
            if ((i11 & 16) == 0) {
                f12 = f10;
                if (sVar.c(f12)) {
                    i15 = 16384;
                }
                i16 = i13 | i15 | 65536;
                if ((1572864 & i10) == 0) {
                    if (sVar.h(kVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) == 599186 || !sVar.z()) {
                    sVar.S();
                    cVar = null;
                    if ((i10 & 1) != 0 || sVar.x()) {
                        if (i23 != 0) {
                            j0Var2 = null;
                        }
                        if ((i11 & 4) != 0) {
                            if (list.size() > 6) {
                                i17 = 3;
                            } else {
                                i17 = 1;
                            }
                            i16 &= -897;
                        } else {
                            i17 = i7;
                        }
                        if (i25 != 0) {
                            oVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            fN = n(64, sVar);
                            i16 &= -57345;
                        } else {
                            fN = f12;
                        }
                        i18 = i16 & (-458753);
                        i19 = i17;
                        fN2 = n(16, sVar);
                        f13 = fN;
                    } else {
                        sVar.Q();
                        if ((i11 & 4) != 0) {
                            i16 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i16 &= -57345;
                        }
                        i18 = i16 & (-458753);
                        fN2 = f11;
                        f13 = f12;
                        i19 = i7;
                    }
                    j0Var3 = j0Var2;
                    oVar3 = oVar2;
                    sVar.q();
                    iIndexOf = list.indexOf(j0Var3) / i19;
                    f14 = iIndexOf;
                    float f19 = f14 * f13;
                    if (iIndexOf > 0) {
                        f15 = f14 * fN2;
                    } else {
                        f15 = 0.0f;
                    }
                    f16 = f19 + f15;
                    fG0 = g0(sVar);
                    o1VarN = r.N(sVar);
                    sVar.W(-1746271574);
                    zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
                    objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (!zF || objK == w0Var) {
                        objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                        o1Var = o1VarN;
                        sVar.h0(objK);
                    } else {
                        o1Var = o1VarN;
                    }
                    sVar.p(false);
                    f1.b.f(sVar, (h9.n) objK, j0Var3);
                    float f20 = f13 + fN2;
                    p pVarU = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f20) + fN2, 1), o1Var, true);
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                    long j5 = sVar.T;
                    i20 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar.l();
                    p pVarC = r1.a.c(sVar, pVarU);
                    q2.j.f10719d0.getClass();
                    a0Var = i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, i.f10708e, sVarA);
                    f1.b.w(sVar, i.f10707d, q1VarL);
                    hVar = i.f10709f;
                    if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i20))) {
                        ob.a.w(i20, sVar, i20, hVar);
                    }
                    f1.b.w(sVar, i.f10706c, pVarC);
                    p pVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f20, 1);
                    d0.f fVarG = d0.h.g(fN2);
                    d0.f fVarG2 = d0.h.g(fN2);
                    g0.a aVar = new g0.a(i19);
                    sVar.W(-1224400529);
                    boolean zH = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
                    if ((3670016 & i18) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z13 = zH | z10;
                    if ((i18 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z13 | z11;
                    objK2 = sVar.K();
                    if (z12 || objK2 == w0Var) {
                        l8.b bVar = new l8.b(list, f13, j0Var3, kVar, oVar3);
                        sVar.h0(bVar);
                        objK2 = bVar;
                    }
                    sVar.p(false);
                    e0.c(aVar, pVarD, null, null, fVarG2, fVarG, null, false, null, (h9.k) objK2, sVar, 0);
                    sVar.p(true);
                    i21 = i19;
                    j0Var4 = j0Var3;
                    f17 = f13;
                    f18 = fN2;
                    oVar4 = oVar3;
                } else {
                    sVar.Q();
                    j0Var4 = j0Var2;
                    i21 = i14;
                    oVar4 = oVar2;
                    f17 = f12;
                    f18 = f11;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new h9.n() { // from class: l8.c
                        @Override // h9.n
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g5.a.c(list, j0Var4, i21, oVar4, f17, f18, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                            return t8.z.f12851a;
                        }
                    };
                }
            }
            f12 = f10;
            i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            i16 = i13 | i15 | 65536;
            if ((1572864 & i10) == 0) {
                if (sVar.h(kVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) == 599186) {
                sVar.S();
                cVar = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                } else {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                }
                j0Var3 = j0Var2;
                oVar3 = oVar2;
                sVar.q();
                iIndexOf = list.indexOf(j0Var3) / i19;
                f14 = iIndexOf;
                float f110 = f14 * f13;
                if (iIndexOf > 0) {
                    f15 = f14 * fN2;
                } else {
                    f15 = 0.0f;
                }
                f16 = f110 + f15;
                fG0 = g0(sVar);
                o1VarN = r.N(sVar);
                sVar.W(-1746271574);
                zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
                objK = sVar.K();
                f1.w0 w0Var2 = f1.n.f5051a;
                if (zF) {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                } else {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                }
                sVar.p(false);
                f1.b.f(sVar, (h9.n) objK, j0Var3);
                float f21 = f13 + fN2;
                p pVarU2 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f21) + fN2, 1), o1Var, true);
                d0.s sVarA2 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j10 = sVar.T;
                i20 = (int) (j10 ^ (j10 >>> 32));
                q1 q1VarL2 = sVar.l();
                p pVarC2 = r1.a.c(sVar, pVarU2);
                q2.j.f10719d0.getClass();
                a0Var = i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, i.f10708e, sVarA2);
                f1.b.w(sVar, i.f10707d, q1VarL2);
                hVar = i.f10709f;
                if (sVar.S) {
                    ob.a.w(i20, sVar, i20, hVar);
                } else {
                    ob.a.w(i20, sVar, i20, hVar);
                }
                f1.b.w(sVar, i.f10706c, pVarC2);
                p pVarD2 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f21, 1);
                d0.f fVarG3 = d0.h.g(fN2);
                d0.f fVarG4 = d0.h.g(fN2);
                g0.a aVar2 = new g0.a(i19);
                sVar.W(-1224400529);
                boolean zH2 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
                if ((3670016 & i18) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z14 = zH2 | z10;
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z14 | z11;
                objK2 = sVar.K();
                if (z12) {
                    l8.b bVar2 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar2);
                    objK2 = bVar2;
                } else {
                    l8.b bVar3 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar3);
                    objK2 = bVar3;
                }
                sVar.p(false);
                e0.c(aVar2, pVarD2, null, null, fVarG4, fVarG3, null, false, null, (h9.k) objK2, sVar, 0);
                sVar.p(true);
                i21 = i19;
                j0Var4 = j0Var3;
                f17 = f13;
                f18 = fN2;
                oVar4 = oVar3;
            } else {
                sVar.S();
                cVar = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                } else {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                }
                j0Var3 = j0Var2;
                oVar3 = oVar2;
                sVar.q();
                iIndexOf = list.indexOf(j0Var3) / i19;
                f14 = iIndexOf;
                float f111 = f14 * f13;
                if (iIndexOf > 0) {
                    f15 = f14 * fN2;
                } else {
                    f15 = 0.0f;
                }
                f16 = f111 + f15;
                fG0 = g0(sVar);
                o1VarN = r.N(sVar);
                sVar.W(-1746271574);
                zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
                objK = sVar.K();
                f1.w0 w0Var3 = f1.n.f5051a;
                if (zF) {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                } else {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                }
                sVar.p(false);
                f1.b.f(sVar, (h9.n) objK, j0Var3);
                float f22 = f13 + fN2;
                p pVarU3 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f22) + fN2, 1), o1Var, true);
                d0.s sVarA3 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j11 = sVar.T;
                i20 = (int) (j11 ^ (j11 >>> 32));
                q1 q1VarL3 = sVar.l();
                p pVarC3 = r1.a.c(sVar, pVarU3);
                q2.j.f10719d0.getClass();
                a0Var = i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, i.f10708e, sVarA3);
                f1.b.w(sVar, i.f10707d, q1VarL3);
                hVar = i.f10709f;
                if (sVar.S) {
                    ob.a.w(i20, sVar, i20, hVar);
                } else {
                    ob.a.w(i20, sVar, i20, hVar);
                }
                f1.b.w(sVar, i.f10706c, pVarC3);
                p pVarD3 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f22, 1);
                d0.f fVarG5 = d0.h.g(fN2);
                d0.f fVarG6 = d0.h.g(fN2);
                g0.a aVar3 = new g0.a(i19);
                sVar.W(-1224400529);
                boolean zH3 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
                if ((3670016 & i18) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z15 = zH3 | z10;
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z15 | z11;
                objK2 = sVar.K();
                if (z12) {
                    l8.b bVar4 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar4);
                    objK2 = bVar4;
                } else {
                    l8.b bVar5 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar5);
                    objK2 = bVar5;
                }
                sVar.p(false);
                e0.c(aVar3, pVarD3, null, null, fVarG6, fVarG5, null, false, null, (h9.k) objK2, sVar, 0);
                sVar.p(true);
                i21 = i19;
                j0Var4 = j0Var3;
                f17 = f13;
                f18 = fN2;
                oVar4 = oVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.c
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g5.a.c(list, j0Var4, i21, oVar4, f17, f18, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i13 |= 3072;
        oVar2 = oVar;
        if ((i11 & 16) == 0) {
            f12 = f10;
            if (sVar.c(f12)) {
                i15 = 16384;
            }
            i16 = i13 | i15 | 65536;
            if ((1572864 & i10) == 0) {
                if (sVar.h(kVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) == 599186) {
                sVar.S();
                cVar = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                } else {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                }
                j0Var3 = j0Var2;
                oVar3 = oVar2;
                sVar.q();
                iIndexOf = list.indexOf(j0Var3) / i19;
                f14 = iIndexOf;
                float f112 = f14 * f13;
                if (iIndexOf > 0) {
                    f15 = f14 * fN2;
                } else {
                    f15 = 0.0f;
                }
                f16 = f112 + f15;
                fG0 = g0(sVar);
                o1VarN = r.N(sVar);
                sVar.W(-1746271574);
                zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
                objK = sVar.K();
                f1.w0 w0Var4 = f1.n.f5051a;
                if (zF) {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                } else {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                }
                sVar.p(false);
                f1.b.f(sVar, (h9.n) objK, j0Var3);
                float f23 = f13 + fN2;
                p pVarU4 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f23) + fN2, 1), o1Var, true);
                d0.s sVarA4 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j12 = sVar.T;
                i20 = (int) (j12 ^ (j12 >>> 32));
                q1 q1VarL4 = sVar.l();
                p pVarC4 = r1.a.c(sVar, pVarU4);
                q2.j.f10719d0.getClass();
                a0Var = i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, i.f10708e, sVarA4);
                f1.b.w(sVar, i.f10707d, q1VarL4);
                hVar = i.f10709f;
                if (sVar.S) {
                    ob.a.w(i20, sVar, i20, hVar);
                } else {
                    ob.a.w(i20, sVar, i20, hVar);
                }
                f1.b.w(sVar, i.f10706c, pVarC4);
                p pVarD4 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f23, 1);
                d0.f fVarG7 = d0.h.g(fN2);
                d0.f fVarG8 = d0.h.g(fN2);
                g0.a aVar4 = new g0.a(i19);
                sVar.W(-1224400529);
                boolean zH4 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
                if ((3670016 & i18) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z16 = zH4 | z10;
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z16 | z11;
                objK2 = sVar.K();
                if (z12) {
                    l8.b bVar6 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar6);
                    objK2 = bVar6;
                } else {
                    l8.b bVar7 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar7);
                    objK2 = bVar7;
                }
                sVar.p(false);
                e0.c(aVar4, pVarD4, null, null, fVarG8, fVarG7, null, false, null, (h9.k) objK2, sVar, 0);
                sVar.p(true);
                i21 = i19;
                j0Var4 = j0Var3;
                f17 = f13;
                f18 = fN2;
                oVar4 = oVar3;
            } else {
                sVar.S();
                cVar = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                } else {
                    if (i23 != 0) {
                        j0Var2 = null;
                    }
                    if ((i11 & 4) != 0) {
                        if (list.size() > 6) {
                            i17 = 3;
                        } else {
                            i17 = 1;
                        }
                        i16 &= -897;
                    } else {
                        i17 = i7;
                    }
                    if (i25 != 0) {
                        oVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        fN = n(64, sVar);
                        i16 &= -57345;
                    } else {
                        fN = f12;
                    }
                    i18 = i16 & (-458753);
                    i19 = i17;
                    fN2 = n(16, sVar);
                    f13 = fN;
                }
                j0Var3 = j0Var2;
                oVar3 = oVar2;
                sVar.q();
                iIndexOf = list.indexOf(j0Var3) / i19;
                f14 = iIndexOf;
                float f113 = f14 * f13;
                if (iIndexOf > 0) {
                    f15 = f14 * fN2;
                } else {
                    f15 = 0.0f;
                }
                f16 = f113 + f15;
                fG0 = g0(sVar);
                o1VarN = r.N(sVar);
                sVar.W(-1746271574);
                zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
                objK = sVar.K();
                f1.w0 w0Var5 = f1.n.f5051a;
                if (zF) {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                } else {
                    objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                    o1Var = o1VarN;
                    sVar.h0(objK);
                }
                sVar.p(false);
                f1.b.f(sVar, (h9.n) objK, j0Var3);
                float f24 = f13 + fN2;
                p pVarU5 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f24) + fN2, 1), o1Var, true);
                d0.s sVarA5 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j13 = sVar.T;
                i20 = (int) (j13 ^ (j13 >>> 32));
                q1 q1VarL5 = sVar.l();
                p pVarC5 = r1.a.c(sVar, pVarU5);
                q2.j.f10719d0.getClass();
                a0Var = i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, i.f10708e, sVarA5);
                f1.b.w(sVar, i.f10707d, q1VarL5);
                hVar = i.f10709f;
                if (sVar.S) {
                    ob.a.w(i20, sVar, i20, hVar);
                } else {
                    ob.a.w(i20, sVar, i20, hVar);
                }
                f1.b.w(sVar, i.f10706c, pVarC5);
                p pVarD5 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f24, 1);
                d0.f fVarG9 = d0.h.g(fN2);
                d0.f fVarG10 = d0.h.g(fN2);
                g0.a aVar5 = new g0.a(i19);
                sVar.W(-1224400529);
                boolean zH5 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
                if ((3670016 & i18) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z17 = zH5 | z10;
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z17 | z11;
                objK2 = sVar.K();
                if (z12) {
                    l8.b bVar8 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar8);
                    objK2 = bVar8;
                } else {
                    l8.b bVar9 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                    sVar.h0(bVar9);
                    objK2 = bVar9;
                }
                sVar.p(false);
                e0.c(aVar5, pVarD5, null, null, fVarG10, fVarG9, null, false, null, (h9.k) objK2, sVar, 0);
                sVar.p(true);
                i21 = i19;
                j0Var4 = j0Var3;
                f17 = f13;
                f18 = fN2;
                oVar4 = oVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.c
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g5.a.c(list, j0Var4, i21, oVar4, f17, f18, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        f12 = f10;
        i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        i16 = i13 | i15 | 65536;
        if ((1572864 & i10) == 0) {
            if (sVar.h(kVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i16 |= i22;
        }
        if ((599187 & i16) == 599186) {
            sVar.S();
            cVar = null;
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    j0Var2 = null;
                }
                if ((i11 & 4) != 0) {
                    if (list.size() > 6) {
                        i17 = 3;
                    } else {
                        i17 = 1;
                    }
                    i16 &= -897;
                } else {
                    i17 = i7;
                }
                if (i25 != 0) {
                    oVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    fN = n(64, sVar);
                    i16 &= -57345;
                } else {
                    fN = f12;
                }
                i18 = i16 & (-458753);
                i19 = i17;
                fN2 = n(16, sVar);
                f13 = fN;
            } else {
                if (i23 != 0) {
                    j0Var2 = null;
                }
                if ((i11 & 4) != 0) {
                    if (list.size() > 6) {
                        i17 = 3;
                    } else {
                        i17 = 1;
                    }
                    i16 &= -897;
                } else {
                    i17 = i7;
                }
                if (i25 != 0) {
                    oVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    fN = n(64, sVar);
                    i16 &= -57345;
                } else {
                    fN = f12;
                }
                i18 = i16 & (-458753);
                i19 = i17;
                fN2 = n(16, sVar);
                f13 = fN;
            }
            j0Var3 = j0Var2;
            oVar3 = oVar2;
            sVar.q();
            iIndexOf = list.indexOf(j0Var3) / i19;
            f14 = iIndexOf;
            float f114 = f14 * f13;
            if (iIndexOf > 0) {
                f15 = f14 * fN2;
            } else {
                f15 = 0.0f;
            }
            f16 = f114 + f15;
            fG0 = g0(sVar);
            o1VarN = r.N(sVar);
            sVar.W(-1746271574);
            zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
            objK = sVar.K();
            f1.w0 w0Var6 = f1.n.f5051a;
            if (zF) {
                objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                o1Var = o1VarN;
                sVar.h0(objK);
            } else {
                objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                o1Var = o1VarN;
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK, j0Var3);
            float f25 = f13 + fN2;
            p pVarU6 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f25) + fN2, 1), o1Var, true);
            d0.s sVarA6 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j14 = sVar.T;
            i20 = (int) (j14 ^ (j14 >>> 32));
            q1 q1VarL6 = sVar.l();
            p pVarC6 = r1.a.c(sVar, pVarU6);
            q2.j.f10719d0.getClass();
            a0Var = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, i.f10708e, sVarA6);
            f1.b.w(sVar, i.f10707d, q1VarL6);
            hVar = i.f10709f;
            if (sVar.S) {
                ob.a.w(i20, sVar, i20, hVar);
            } else {
                ob.a.w(i20, sVar, i20, hVar);
            }
            f1.b.w(sVar, i.f10706c, pVarC6);
            p pVarD6 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f25, 1);
            d0.f fVarG11 = d0.h.g(fN2);
            d0.f fVarG12 = d0.h.g(fN2);
            g0.a aVar6 = new g0.a(i19);
            sVar.W(-1224400529);
            boolean zH6 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
            if ((3670016 & i18) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z18 = zH6 | z10;
            if ((i18 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z18 | z11;
            objK2 = sVar.K();
            if (z12) {
                l8.b bVar10 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                sVar.h0(bVar10);
                objK2 = bVar10;
            } else {
                l8.b bVar11 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                sVar.h0(bVar11);
                objK2 = bVar11;
            }
            sVar.p(false);
            e0.c(aVar6, pVarD6, null, null, fVarG12, fVarG11, null, false, null, (h9.k) objK2, sVar, 0);
            sVar.p(true);
            i21 = i19;
            j0Var4 = j0Var3;
            f17 = f13;
            f18 = fN2;
            oVar4 = oVar3;
        } else {
            sVar.S();
            cVar = null;
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    j0Var2 = null;
                }
                if ((i11 & 4) != 0) {
                    if (list.size() > 6) {
                        i17 = 3;
                    } else {
                        i17 = 1;
                    }
                    i16 &= -897;
                } else {
                    i17 = i7;
                }
                if (i25 != 0) {
                    oVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    fN = n(64, sVar);
                    i16 &= -57345;
                } else {
                    fN = f12;
                }
                i18 = i16 & (-458753);
                i19 = i17;
                fN2 = n(16, sVar);
                f13 = fN;
            } else {
                if (i23 != 0) {
                    j0Var2 = null;
                }
                if ((i11 & 4) != 0) {
                    if (list.size() > 6) {
                        i17 = 3;
                    } else {
                        i17 = 1;
                    }
                    i16 &= -897;
                } else {
                    i17 = i7;
                }
                if (i25 != 0) {
                    oVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    fN = n(64, sVar);
                    i16 &= -57345;
                } else {
                    fN = f12;
                }
                i18 = i16 & (-458753);
                i19 = i17;
                fN2 = n(16, sVar);
                f13 = fN;
            }
            j0Var3 = j0Var2;
            oVar3 = oVar2;
            sVar.q();
            iIndexOf = list.indexOf(j0Var3) / i19;
            f14 = iIndexOf;
            float f115 = f14 * f13;
            if (iIndexOf > 0) {
                f15 = f14 * fN2;
            } else {
                f15 = 0.0f;
            }
            f16 = f115 + f15;
            fG0 = g0(sVar);
            o1VarN = r.N(sVar);
            sVar.W(-1746271574);
            zF = sVar.f(o1VarN) | sVar.c(f16) | sVar.c(fG0);
            objK = sVar.K();
            f1.w0 w0Var7 = f1.n.f5051a;
            if (zF) {
                objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                o1Var = o1VarN;
                sVar.h0(objK);
            } else {
                objK = new l8.d(o1VarN, f16, fG0, cVar, 0);
                o1Var = o1VarN;
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK, j0Var3);
            float f26 = f13 + fN2;
            p pVarU7 = r.U(androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, (6 * f26) + fN2, 1), o1Var, true);
            d0.s sVarA7 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j15 = sVar.T;
            i20 = (int) (j15 ^ (j15 >>> 32));
            q1 q1VarL7 = sVar.l();
            p pVarC7 = r1.a.c(sVar, pVarU7);
            q2.j.f10719d0.getClass();
            a0Var = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, i.f10708e, sVarA7);
            f1.b.w(sVar, i.f10707d, q1VarL7);
            hVar = i.f10709f;
            if (sVar.S) {
                ob.a.w(i20, sVar, i20, hVar);
            } else {
                ob.a.w(i20, sVar, i20, hVar);
            }
            f1.b.w(sVar, i.f10706c, pVarC7);
            p pVarD7 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, 0.0f, list.size() * f26, 1);
            d0.f fVarG13 = d0.h.g(fN2);
            d0.f fVarG14 = d0.h.g(fN2);
            g0.a aVar7 = new g0.a(i19);
            sVar.W(-1224400529);
            boolean zH7 = sVar.h(list) | ((((i18 & 57344) ^ 24576) <= 16384 && sVar.c(f13)) || (i18 & 24576) == 16384) | sVar.h(j0Var3);
            if ((3670016 & i18) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z19 = zH7 | z10;
            if ((i18 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z19 | z11;
            objK2 = sVar.K();
            if (z12) {
                l8.b bVar12 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                sVar.h0(bVar12);
                objK2 = bVar12;
            } else {
                l8.b bVar13 = new l8.b(list, f13, j0Var3, kVar, oVar3);
                sVar.h0(bVar13);
                objK2 = bVar13;
            }
            sVar.p(false);
            e0.c(aVar7, pVarD7, null, null, fVarG14, fVarG13, null, false, null, (h9.k) objK2, sVar, 0);
            sVar.p(true);
            i21 = i19;
            j0Var4 = j0Var3;
            f17 = f13;
            f18 = fN2;
            oVar4 = oVar3;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.c
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g5.a.c(list, j0Var4, i21, oVar4, f17, f18, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final float c0(long j5, float f10, n3.c cVar) {
        float fC;
        long jB = n3.q.b(j5);
        if (n3.s.a(jB, 4294967296L)) {
            if (cVar.O() <= 1.05d) {
                return cVar.h0(j5);
            }
            fC = n3.q.c(j5) / n3.q.c(cVar.F(f10));
        } else {
            if (!n3.s.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = n3.q.c(j5);
        }
        return fC * f10;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void d(final p pVar, final m5.l lVar, final float f10, final float f11, final long j5, final float f12, final long j10, final float f13, final f7.q qVar, h9.n nVar, final h9.k kVar, final h9.o oVar, final h9.k kVar2, final h9.k kVar3, f1.s sVar, final int i7, final int i10, final int i11) {
        h9.n gVar;
        Object objK;
        final h9.n nVar2;
        w1 w1VarR;
        l.e(lVar, "controller");
        sVar.Y(-505733824);
        if ((i7 & 14) == 0) {
            sVar.f(pVar);
        }
        if ((i7 & 112) == 0) {
            sVar.f(lVar);
        }
        if ((i7 & 896) == 0) {
            sVar.c(f10);
        }
        if ((i7 & 7168) == 0) {
            sVar.c(f11);
        }
        if ((i7 & 57344) == 0) {
            sVar.e(j5);
        }
        if ((3670016 & i7) == 0) {
            sVar.c(f12);
        }
        if ((29360128 & i7) == 0) {
            sVar.e(j10);
        }
        if ((234881024 & i7) == 0) {
            sVar.c(f13);
        }
        if ((i10 & 14) == 0) {
            sVar.f(null);
        }
        int i12 = i11 & 2048;
        if (i12 == 0 && (i10 & 112) == 0) {
            sVar.h(nVar);
        }
        if ((i10 & 896) == 0) {
            sVar.h(kVar);
        }
        if ((i10 & 7168) == 0) {
            sVar.h(oVar);
        }
        if ((i10 & 57344) == 0) {
            sVar.h(kVar2);
        }
        if ((i10 & 458752) == 0) {
            sVar.h(kVar3);
        }
        sVar.S();
        if ((i7 & 1) == 0 || sVar.x()) {
            if (i12 != 0) {
                gVar = new g0.g(10);
            }
            sVar.q();
            n3.c cVar = (n3.c) sVar.j(j1.f11276h);
            final x xVar = new x();
            f7.q qVarH = h0.h();
            qVarH.r(1);
            qVarH.q(cVar.R(f11));
            qVarH.k(j5);
            final f7.q qVarH2 = h0.h();
            qVarH2.k(((y1.q) lVar.f8488g.getValue()).f14960a);
            final float fR = cVar.R(f12);
            sVar.X(-388990188);
            objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            final b1 b1Var = (b1) objK;
            sVar.p(false);
            nVar2 = gVar;
            u.a(0, sVar, new h9.k(oVar, lVar, kVar2, qVarH2, kVar3, f10, kVar, fR, j10, f13, qVar, b1Var) { // from class: m5.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f8524b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f7.q f8525c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h9.k f8526d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f8527e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ h9.k f8528f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f8529g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ f7.q f8530h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ b1 f8531i;

                {
                    this.f8524b = lVar;
                    this.f8525c = qVarH2;
                    this.f8526d = kVar3;
                    this.f8527e = f10;
                    this.f8528f = kVar;
                    this.f8529g = fR;
                    this.f8530h = qVar;
                    this.f8531i = b1Var;
                }

                @Override // h9.k
                public final Object invoke(Object obj) {
                    a2.g gVar2 = (a2.g) obj;
                    l lVar2 = this.f8524b;
                    i9.l.e(lVar2, "$controller");
                    i9.l.e(this.f8531i, "$isInitialized$delegate");
                    i9.l.e(gVar2, "$this$Canvas");
                    y1.o oVarZ = gVar2.W().z();
                    y1.f fVar = (y1.f) this.f8523a.f6688a;
                    if (fVar != null) {
                        long jG = a.a.G(fVar);
                        int i13 = (int) (jG >> 32);
                        int i14 = (int) (jG & 4294967295L);
                        f7.q qVar2 = j.f8478a;
                        i9.l.e(oVarZ, "$this$drawImage");
                        oVarZ.f(fVar, 0L, j.f8478a);
                        float f14 = i14 * 0.5f;
                        float f15 = i13;
                        LinearGradient linearGradientG = h0.g(n3.r.a(0.0f, f14), n3.r.a(f15, f14), (List) this.f8526d.invoke(lVar2));
                        f7.q qVar3 = this.f8525c;
                        qVar3.n(linearGradientG);
                        j.b(oVarZ, a.a.G(fVar), this.f8527e, qVar3);
                        oVarZ.g(this.f8529g, n3.r.a(n3.r.l(((Number) this.f8528f.invoke(lVar2)).floatValue(), 0.0f, 1.0f) * f15, f14), this.f8530h);
                    }
                    return z.f12851a;
                }
            }, androidx.compose.ui.layout.a.e(n4.h.o(pVar.a(androidx.compose.foundation.layout.c.f820a), k0.e.a(f10)), new v(xVar, gVar, f10, qVarH)).a(new SuspendPointerInputElement(z.f12851a, null, new g0(new m5.u(xVar, oVar, lVar, null, 0)), 6)).a(new SuspendPointerInputElement(z.f12851a, null, new g0(new m5.u(xVar, oVar, lVar, null, 1)), 6)));
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n(lVar, f10, f11, j5, f12, j10, f13, qVar, nVar2, kVar, oVar, kVar2, kVar3, i7, i10, i11) { // from class: m5.t

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ l f8533b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f8534c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ float f8535d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ long f8536e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ float f8537f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ long f8538g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ float f8539h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ f7.q f8540i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ h9.n f8541j;
                    public final /* synthetic */ h9.k k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ i9.j f8542l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ h9.k f8543m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ h9.k f8544n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ int f8545o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f8546p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ int f8547q;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f8542l = (i9.j) oVar;
                        this.f8543m = kVar2;
                        this.f8544n = kVar3;
                        this.f8545o = i7;
                        this.f8546p = i10;
                        this.f8547q = i11;
                    }

                    /* JADX WARN: Type inference failed for: r14v0, types: [h9.o, i9.j] */
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l lVar2 = this.f8533b;
                        i9.l.e(lVar2, "$controller");
                        int iY = f1.b.y(this.f8545o | 1);
                        int iY2 = f1.b.y(this.f8546p);
                        g5.a.d(this.f8532a, lVar2, this.f8534c, this.f8535d, this.f8536e, this.f8537f, this.f8538g, this.f8539h, this.f8540i, this.f8541j, this.k, this.f8542l, this.f8543m, this.f8544n, (f1.s) obj, iY, iY2, this.f8547q);
                        return z.f12851a;
                    }
                };
            }
        }
        sVar.Q();
        gVar = nVar;
        sVar.q();
        n3.c cVar2 = (n3.c) sVar.j(j1.f11276h);
        final x xVar2 = new x();
        f7.q qVarH3 = h0.h();
        qVarH3.r(1);
        qVarH3.q(cVar2.R(f11));
        qVarH3.k(j5);
        final f7.q qVarH4 = h0.h();
        qVarH4.k(((y1.q) lVar.f8488g.getValue()).f14960a);
        final float fR2 = cVar2.R(f12);
        sVar.X(-388990188);
        objK = sVar.K();
        if (objK == f1.n.f5051a) {
            objK = f1.b.s(Boolean.FALSE);
            sVar.h0(objK);
        }
        final b1 b1Var2 = (b1) objK;
        sVar.p(false);
        nVar2 = gVar;
        u.a(0, sVar, new h9.k(oVar, lVar, kVar2, qVarH4, kVar3, f10, kVar, fR2, j10, f13, qVar, b1Var2) { // from class: m5.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f8524b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f7.q f8525c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h9.k f8526d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ float f8527e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ h9.k f8528f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f8529g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ f7.q f8530h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ b1 f8531i;

            {
                this.f8524b = lVar;
                this.f8525c = qVarH4;
                this.f8526d = kVar3;
                this.f8527e = f10;
                this.f8528f = kVar;
                this.f8529g = fR2;
                this.f8530h = qVar;
                this.f8531i = b1Var2;
            }

            @Override // h9.k
            public final Object invoke(Object obj) {
                a2.g gVar2 = (a2.g) obj;
                l lVar2 = this.f8524b;
                i9.l.e(lVar2, "$controller");
                i9.l.e(this.f8531i, "$isInitialized$delegate");
                i9.l.e(gVar2, "$this$Canvas");
                y1.o oVarZ = gVar2.W().z();
                y1.f fVar = (y1.f) this.f8523a.f6688a;
                if (fVar != null) {
                    long jG = a.a.G(fVar);
                    int i13 = (int) (jG >> 32);
                    int i14 = (int) (jG & 4294967295L);
                    f7.q qVar2 = j.f8478a;
                    i9.l.e(oVarZ, "$this$drawImage");
                    oVarZ.f(fVar, 0L, j.f8478a);
                    float f14 = i14 * 0.5f;
                    float f15 = i13;
                    LinearGradient linearGradientG = h0.g(n3.r.a(0.0f, f14), n3.r.a(f15, f14), (List) this.f8526d.invoke(lVar2));
                    f7.q qVar3 = this.f8525c;
                    qVar3.n(linearGradientG);
                    j.b(oVarZ, a.a.G(fVar), this.f8527e, qVar3);
                    oVarZ.g(this.f8529g, n3.r.a(n3.r.l(((Number) this.f8528f.invoke(lVar2)).floatValue(), 0.0f, 1.0f) * f15, f14), this.f8530h);
                }
                return z.f12851a;
            }
        }, androidx.compose.ui.layout.a.e(n4.h.o(pVar.a(androidx.compose.foundation.layout.c.f820a), k0.e.a(f10)), new v(xVar2, gVar, f10, qVarH3)).a(new SuspendPointerInputElement(z.f12851a, null, new g0(new m5.u(xVar2, oVar, lVar, null, 0)), 6)).a(new SuspendPointerInputElement(z.f12851a, null, new g0(new m5.u(xVar2, oVar, lVar, null, 1)), 6)));
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(lVar, f10, f11, j5, f12, j10, f13, qVar, nVar2, kVar, oVar, kVar2, kVar3, i7, i10, i11) { // from class: m5.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f8533b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f8534c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f8535d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f8536e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f8537f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f8538g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f8539h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ f7.q f8540i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ h9.n f8541j;
                public final /* synthetic */ h9.k k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ i9.j f8542l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ h9.k f8543m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ h9.k f8544n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f8545o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f8546p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ int f8547q;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f8542l = (i9.j) oVar;
                    this.f8543m = kVar2;
                    this.f8544n = kVar3;
                    this.f8545o = i7;
                    this.f8546p = i10;
                    this.f8547q = i11;
                }

                /* JADX WARN: Type inference failed for: r14v0, types: [h9.o, i9.j] */
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l lVar2 = this.f8533b;
                    i9.l.e(lVar2, "$controller");
                    int iY = f1.b.y(this.f8545o | 1);
                    int iY2 = f1.b.y(this.f8546p);
                    g5.a.d(this.f8532a, lVar2, this.f8534c, this.f8535d, this.f8536e, this.f8537f, this.f8538g, this.f8539h, this.f8540i, this.f8541j, this.k, this.f8542l, this.f8543m, this.f8544n, (f1.s) obj, iY, iY2, this.f8547q);
                    return z.f12851a;
                }
            };
        }
    }

    public static LinkedHashSet d0(e eVar, Collection collection, Collection collection2, x9.e eVar2, jb.m mVar, za.j jVar, boolean z10) {
        if (eVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (eVar2 == null) {
            a(15);
            throw null;
        }
        if (mVar == null) {
            a(16);
            throw null;
        }
        if (jVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jVar.h(eVar, collection, collection2, eVar2, new ha.a(mVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static final void e(List list, String str, boolean z10, int i7, h9.k kVar, f1.s sVar, int i10) {
        int i11;
        boolean z11;
        l.e(str, "key");
        sVar.Y(2042863473);
        if ((i10 & 6) == 0) {
            i11 = (sVar.h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 16;
        if ((i10 & 48) == 0) {
            i11 |= sVar.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= sVar.g(z11) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= sVar.d(i7) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= sVar.h(kVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((i11 & 9363) == 9362 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            int i13 = 1;
            if (objK == w0Var) {
                t8.o oVar = n8.d.f8898a;
                objK = f1.b.s(Boolean.valueOf(n8.d.b(i7, str) == 1));
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE = n1.h.e(1105155994, new a8.y(i12, list), sVar);
            n1.c cVarE2 = n1.h.e(-833383303, new f0(b1Var, i13), sVar);
            sVar.W(-1746271574);
            boolean z12 = ((i11 & 112) == 32) | ((57344 & i11) == 16384);
            Object objK2 = sVar.K();
            if (z12 || objK2 == w0Var) {
                objK2 = new d0(kVar, str, b1Var, i13);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, z11, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.z(list, str, z10, i7, kVar, i10);
        }
    }

    public static LinkedHashSet e0(e eVar, AbstractCollection abstractCollection, Collection collection, x9.e eVar2, jb.m mVar, za.j jVar) {
        if (eVar == null) {
            a(0);
            throw null;
        }
        if (eVar2 == null) {
            a(3);
            throw null;
        }
        if (mVar == null) {
            a(4);
            throw null;
        }
        if (jVar != null) {
            return d0(eVar, abstractCollection, collection, eVar2, mVar, jVar, false);
        }
        a(5);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void f(final List list, final String str, boolean z10, boolean z11, final h9.k kVar, f1.s sVar, final int i7, final int i10) {
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        Object objK;
        f1.w0 w0Var;
        b1 b1Var;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objK2;
        final boolean z18;
        final boolean z19;
        w1 w1VarR;
        int i15;
        l.e(str, "key");
        sVar.Y(-2105113640);
        if ((i7 & 6) == 0) {
            i11 = (sVar.h(list) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.f(str) ? 32 : 16;
        }
        int i16 = i10 & 4;
        if (i16 == 0) {
            if ((i7 & 384) == 0) {
                z12 = z10;
                i11 |= sVar.g(z12) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i7 & 3072) == 0) {
                    z13 = z11;
                    if (sVar.g(z13)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i7 & 24576) == 0) {
                    if (sVar.h(kVar)) {
                        i15 = 16384;
                    } else {
                        i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i11 |= i15;
                }
                if ((i11 & 9363) == 9362 || !sVar.z()) {
                    if (i16 != 0) {
                        z12 = true;
                    }
                    i14 = 0;
                    if (i12 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    sVar.W(1849434622);
                    objK = sVar.K();
                    w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        t8.o oVar = n8.d.f8898a;
                        objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                        sVar.h0(objK);
                    }
                    b1Var = (b1) objK;
                    sVar.p(false);
                    n1.c cVarE = n1.h.e(-397934719, new a8.y(15, list), sVar);
                    n1.c cVarE2 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
                    sVar.W(-1746271574);
                    if ((57344 & i11) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i11 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objK2 = sVar.K();
                    if (z17 || objK2 == w0Var) {
                        objK2 = new d0(kVar, str, b1Var, i14);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    boolean z20 = z12;
                    a.a.h(cVarE, cVarE2, z20, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
                    z18 = z20;
                    z19 = z14;
                } else {
                    sVar.Q();
                    z18 = z12;
                    z19 = z13;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new h9.n() { // from class: l8.e0
                        @Override // h9.n
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g5.a.f(list, str, z18, z19, kVar, (f1.s) obj, f1.b.y(i7 | 1), i10);
                            return t8.z.f12851a;
                        }
                    };
                }
            }
            i11 |= 3072;
            z13 = z11;
            if ((i7 & 24576) == 0) {
                if (sVar.h(kVar)) {
                    i15 = 16384;
                } else {
                    i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                }
                i11 |= i15;
            }
            if ((i11 & 9363) == 9362) {
                if (i16 != 0) {
                    z12 = true;
                }
                i14 = 0;
                if (i12 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                sVar.W(1849434622);
                objK = sVar.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    t8.o oVar2 = n8.d.f8898a;
                    objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                    sVar.h0(objK);
                }
                b1Var = (b1) objK;
                sVar.p(false);
                n1.c cVarE3 = n1.h.e(-397934719, new a8.y(15, list), sVar);
                n1.c cVarE4 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
                sVar.W(-1746271574);
                if ((57344 & i11) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i11 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objK2 = sVar.K();
                if (z17) {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                } else {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                boolean z21 = z12;
                a.a.h(cVarE3, cVarE4, z21, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
                z18 = z21;
                z19 = z14;
            } else {
                if (i16 != 0) {
                    z12 = true;
                }
                i14 = 0;
                if (i12 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                sVar.W(1849434622);
                objK = sVar.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    t8.o oVar3 = n8.d.f8898a;
                    objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                    sVar.h0(objK);
                }
                b1Var = (b1) objK;
                sVar.p(false);
                n1.c cVarE5 = n1.h.e(-397934719, new a8.y(15, list), sVar);
                n1.c cVarE6 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
                sVar.W(-1746271574);
                if ((57344 & i11) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i11 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objK2 = sVar.K();
                if (z17) {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                } else {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                boolean z22 = z12;
                a.a.h(cVarE5, cVarE6, z22, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
                z18 = z22;
                z19 = z14;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.e0
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g5.a.f(list, str, z18, z19, kVar, (f1.s) obj, f1.b.y(i7 | 1), i10);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i11 |= 384;
        z12 = z10;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i7 & 3072) == 0) {
                z13 = z11;
                if (sVar.g(z13)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i7 & 24576) == 0) {
                if (sVar.h(kVar)) {
                    i15 = 16384;
                } else {
                    i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                }
                i11 |= i15;
            }
            if ((i11 & 9363) == 9362) {
                if (i16 != 0) {
                    z12 = true;
                }
                i14 = 0;
                if (i12 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                sVar.W(1849434622);
                objK = sVar.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    t8.o oVar4 = n8.d.f8898a;
                    objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                    sVar.h0(objK);
                }
                b1Var = (b1) objK;
                sVar.p(false);
                n1.c cVarE7 = n1.h.e(-397934719, new a8.y(15, list), sVar);
                n1.c cVarE8 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
                sVar.W(-1746271574);
                if ((57344 & i11) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i11 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objK2 = sVar.K();
                if (z17) {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                } else {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                boolean z23 = z12;
                a.a.h(cVarE7, cVarE8, z23, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
                z18 = z23;
                z19 = z14;
            } else {
                if (i16 != 0) {
                    z12 = true;
                }
                i14 = 0;
                if (i12 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                sVar.W(1849434622);
                objK = sVar.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    t8.o oVar5 = n8.d.f8898a;
                    objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                    sVar.h0(objK);
                }
                b1Var = (b1) objK;
                sVar.p(false);
                n1.c cVarE9 = n1.h.e(-397934719, new a8.y(15, list), sVar);
                n1.c cVarE10 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
                sVar.W(-1746271574);
                if ((57344 & i11) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i11 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objK2 = sVar.K();
                if (z17) {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                } else {
                    objK2 = new d0(kVar, str, b1Var, i14);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                boolean z24 = z12;
                a.a.h(cVarE9, cVarE10, z24, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
                z18 = z24;
                z19 = z14;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.e0
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g5.a.f(list, str, z18, z19, kVar, (f1.s) obj, f1.b.y(i7 | 1), i10);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i11 |= 3072;
        z13 = z11;
        if ((i7 & 24576) == 0) {
            if (sVar.h(kVar)) {
                i15 = 16384;
            } else {
                i15 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            }
            i11 |= i15;
        }
        if ((i11 & 9363) == 9362) {
            if (i16 != 0) {
                z12 = true;
            }
            i14 = 0;
            if (i12 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            sVar.W(1849434622);
            objK = sVar.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                t8.o oVar6 = n8.d.f8898a;
                objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                sVar.h0(objK);
            }
            b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE11 = n1.h.e(-397934719, new a8.y(15, list), sVar);
            n1.c cVarE12 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
            sVar.W(-1746271574);
            if ((57344 & i11) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i11 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objK2 = sVar.K();
            if (z17) {
                objK2 = new d0(kVar, str, b1Var, i14);
                sVar.h0(objK2);
            } else {
                objK2 = new d0(kVar, str, b1Var, i14);
                sVar.h0(objK2);
            }
            sVar.p(false);
            boolean z25 = z12;
            a.a.h(cVarE11, cVarE12, z25, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
            z18 = z25;
            z19 = z14;
        } else {
            if (i16 != 0) {
                z12 = true;
            }
            i14 = 0;
            if (i12 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            sVar.W(1849434622);
            objK = sVar.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                t8.o oVar7 = n8.d.f8898a;
                objK = f1.b.s(Boolean.valueOf(n8.d.a(str, z14)));
                sVar.h0(objK);
            }
            b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE13 = n1.h.e(-397934719, new a8.y(15, list), sVar);
            n1.c cVarE14 = n1.h.e(1954854112, new f0(b1Var, i14), sVar);
            sVar.W(-1746271574);
            if ((57344 & i11) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i11 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objK2 = sVar.K();
            if (z17) {
                objK2 = new d0(kVar, str, b1Var, i14);
                sVar.h0(objK2);
            } else {
                objK2 = new d0(kVar, str, b1Var, i14);
                sVar.h0(objK2);
            }
            sVar.p(false);
            boolean z26 = z12;
            a.a.h(cVarE13, cVarE14, z26, (h9.a) objK2, sVar, (i11 & 896) | 54, 0);
            z18 = z26;
            z19 = z14;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.e0
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g5.a.f(list, str, z18, z19, kVar, (f1.s) obj, f1.b.y(i7 | 1), i10);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static LinkedHashSet f0(e eVar, Collection collection, AbstractCollection abstractCollection, ka.j jVar, jb.m mVar, za.j jVar2) {
        if (eVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (jVar == null) {
            a(9);
            throw null;
        }
        if (mVar == null) {
            a(10);
            throw null;
        }
        if (jVar2 != null) {
            return d0(eVar, collection, abstractCollection, jVar, mVar, jVar2, true);
        }
        a(11);
        throw null;
    }

    public static final void g(List list, t8.j jVar, boolean z10, h9.k kVar, f1.s sVar, int i7, int i10) {
        int i11;
        h9.k kVar2;
        boolean z11;
        Object obj = jVar.f12830a;
        sVar.Y(-76676725);
        if ((i7 & 6) == 0) {
            i11 = (sVar.h(list) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.h(jVar) ? 32 : 16;
        }
        int i12 = i10 & 4;
        if (i12 != 0) {
            i11 |= 384;
        } else if ((i7 & 384) == 0) {
            i11 |= sVar.g(z10) ? 256 : 128;
        }
        int i13 = i10 & 8;
        if (i13 != 0) {
            i11 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i11 |= sVar.h(kVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            z11 = z10;
            kVar2 = kVar;
        } else {
            boolean z12 = i12 != 0 ? true : z10;
            if (i13 != 0) {
                sVar.W(1849434622);
                Object objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = new t0(9);
                    sVar.h0(objK);
                }
                kVar = (h9.k) objK;
                sVar.p(false);
            }
            kVar2 = kVar;
            Object obj2 = jVar.f12831b;
            if (obj2 instanceof Boolean) {
                sVar.W(646524769);
                f(list, (String) obj, z12, ((Boolean) obj2).booleanValue(), kVar2, sVar, (i11 & 910) | ((i11 << 3) & 57344), 0);
                sVar.p(false);
            } else {
                if (!(obj2 instanceof Integer)) {
                    sVar.W(-671868288);
                    sVar.p(false);
                    throw new IllegalStateException(("Unsupported type: " + y.f6689a.b(obj2.getClass()).l()).toString());
                }
                sVar.W(646725153);
                e(list, (String) obj, z12, ((Number) obj2).intValue(), kVar2, sVar, (i11 & 910) | ((i11 << 3) & 57344));
                sVar.p(false);
            }
            z11 = z12;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.g(list, jVar, z11, kVar2, i7, i10, 1);
        }
    }

    public static final float g0(f1.s sVar) {
        sVar.W(-1522546943);
        float fA = ((n3.c) sVar.j(j1.f11276h)).a();
        sVar.W(1849434622);
        Object objK = sVar.K();
        if (objK == f1.n.f5051a) {
            objK = Float.valueOf(1.0f / ((float) Math.pow(fA, 0.2f)));
            sVar.h0(objK);
        }
        float fFloatValue = ((Number) objK).floatValue();
        sVar.p(false);
        sVar.p(false);
        return fFloatValue;
    }

    public static final void h(x xVar, h9.o oVar, m5.l lVar, float f10) {
        y1.f fVar = (y1.f) xVar.f6688a;
        oVar.invoke(lVar, Float.valueOf(r.l(fVar != null ? f10 / fVar.f14890a.getWidth() : 0.0f, 0.0f, 1.0f)), Boolean.TRUE);
    }

    public static final void h0(Spannable spannable, long j5, int i7, int i10) {
        if (j5 != 16) {
            spannable.setSpan(new ForegroundColorSpan(h0.C(j5)), i7, i10, 33);
        }
    }

    public static final b1.i i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof b1.i) {
                return (b1.i) childAt;
            }
        }
        b1.i iVar = new b1.i(viewGroup.getContext());
        viewGroup.addView(iVar);
        return iVar;
    }

    public static void i0(Window window, boolean z10) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            e4.h.d(window, z10);
        } else {
            if (i7 >= 30) {
                e4.h.c(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final ViewGroup j(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static void j0(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            a4.b.k(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final String k(int i7) {
        n3.l.q(16);
        String string = Integer.toString(i7, 16);
        l.d(string, "toString(...)");
        return j.F0(2, string);
    }

    public static final void k0(Spannable spannable, long j5, n3.c cVar, int i7, int i10) {
        long jB = n3.q.b(j5);
        if (n3.s.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(k9.a.M(cVar.h0(j5)), false), i7, i10, 33);
        } else if (n3.s.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n3.q.c(j5)), i7, i10, 33);
        }
    }

    public static final void l(l2.d dVar, k2.v vVar, long j5) {
        l2.c cVar = dVar.f7989b;
        l2.c cVar2 = dVar.f7988a;
        boolean zA = k2.u.a(vVar);
        long j10 = vVar.f7279b;
        if (zA) {
            l2.a[] aVarArr = cVar2.f7983d;
            u8.l.t0(0, aVarArr.length, null, aVarArr);
            cVar2.f7984e = 0;
            l2.a[] aVarArr2 = cVar.f7983d;
            u8.l.t0(0, aVarArr2.length, null, aVarArr2);
            cVar.f7984e = 0;
            dVar.f7990c = 0L;
        }
        if (!k2.u.c(vVar)) {
            List list = vVar.k;
            if (list == null) {
                list = u8.w.f13122a;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                k2.c cVar3 = (k2.c) list.get(i7);
                long j11 = cVar3.f7190a;
                long jH = x1.b.h(cVar3.f7192c, j5);
                cVar2.a(Float.intBitsToFloat((int) (jH >> 32)), j11);
                cVar.a(Float.intBitsToFloat((int) (jH & 4294967295L)), j11);
            }
            long jH2 = x1.b.h(vVar.f7288l, j5);
            cVar2.a(Float.intBitsToFloat((int) (jH2 >> 32)), j10);
            cVar.a(Float.intBitsToFloat((int) (jH2 & 4294967295L)), j10);
        }
        if (k2.u.c(vVar) && j10 - dVar.f7990c > 40) {
            l2.a[] aVarArr3 = cVar2.f7983d;
            u8.l.t0(0, aVarArr3.length, null, aVarArr3);
            cVar2.f7984e = 0;
            l2.a[] aVarArr4 = cVar.f7983d;
            u8.l.t0(0, aVarArr4.length, null, aVarArr4);
            cVar.f7984e = 0;
            dVar.f7990c = 0L;
        }
        dVar.f7990c = j10;
    }

    public static void l0(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i10);
        }
    }

    public static final void m(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                t8.a.a(th, th2);
            }
        }
    }

    public static void m0(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i7 != fontMetricsInt) {
            textView.setLineSpacing(i7 - fontMetricsInt, 1.0f);
        }
    }

    public static final float n(int i7, f1.s sVar) {
        sVar.W(-130035291);
        sVar.W(-745930286);
        float fG0 = g0(sVar) * i7;
        sVar.p(false);
        sVar.p(false);
        return fG0;
    }

    public static final void n0(Spannable spannable, i3.b bVar, int i7, int i10) {
        LocaleSpan localeSpan;
        if (bVar != null) {
            List list = bVar.f6614a;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i3.a) it.next()).f6612a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = a4.h.h(r2.g0.c((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? i3.d.f6616a.n().c() : bVar.c()).f6612a);
            }
            spannable.setSpan(localeSpan, i7, i10, 33);
        }
    }

    public static int o(byte[] bArr, int i7, com.google.protobuf.f fVar) throws w0 {
        int iY = y(bArr, i7, fVar);
        int i10 = fVar.f2740a;
        if (i10 < 0) {
            throw w0.e();
        }
        if (i10 > bArr.length - iY) {
            throw w0.g();
        }
        if (i10 == 0) {
            fVar.f2742c = com.google.protobuf.l.f2785b;
            return iY;
        }
        fVar.f2742c = com.google.protobuf.l.k(bArr, iY, i10);
        return iY + i10;
    }

    public static void o0(Activity activity, c7.a aVar, List list, int i7, androidx.lifecycle.z zVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!d7.a.a(activity, (Intent) it.next())) {
                it.remove();
            }
        }
        if (list.isEmpty()) {
            list.add(d7.a.h());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Intent intent = (Intent) it2.next();
            if (intent != null) {
                try {
                    aVar.startActivityForResult(intent, i7);
                    return;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    if (it2.hasNext() && zVar != null) {
                        zVar.run();
                    }
                }
            }
        }
    }

    public static int p(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static final t8.p p0(long j5) {
        float fH;
        float f10;
        float fG;
        float f11;
        float fMax = Math.max(y1.q.h(j5), Math.max(y1.q.g(j5), y1.q.e(j5)));
        float fMin = fMax - Math.min(y1.q.h(j5), Math.min(y1.q.g(j5), y1.q.e(j5)));
        if (fMin == 0.0f) {
            f11 = 0.0f;
        } else {
            if (fMax == y1.q.h(j5)) {
                fG = (((y1.q.g(j5) - y1.q.e(j5)) / fMin) * 60) + 360.0f;
            } else {
                if (fMax == y1.q.g(j5)) {
                    fH = ((y1.q.e(j5) - y1.q.h(j5)) / fMin) * 60;
                    f10 = 120.0f;
                } else {
                    fH = ((y1.q.h(j5) - y1.q.g(j5)) / fMin) * 60;
                    f10 = 240.0f;
                }
                fG = fH + f10;
            }
            f11 = fG % 360.0f;
        }
        return new t8.p(Float.valueOf(f11), Float.valueOf(fMax != 0.0f ? fMin / fMax : 0.0f), Float.valueOf(fMax));
    }

    public static long q(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public static ActionMode.Callback q0(ActionMode.Callback callback) {
        return (!(callback instanceof i4.k) || Build.VERSION.SDK_INT < 26) ? callback : ((i4.k) callback).f6644a;
    }

    public static int r(x1 x1Var, byte[] bArr, int i7, int i10, int i11, com.google.protobuf.f fVar) {
        Object objJ = x1Var.j();
        int iR = R(objJ, x1Var, bArr, i7, i10, i11, fVar);
        x1Var.d(objJ);
        fVar.f2742c = objJ;
        return iR;
    }

    public static final long r0(long j5, long j10) {
        int iD;
        int iF = q0.f(j5);
        int iE = q0.e(j5);
        if ((q0.f(j10) < q0.e(j5)) && (q0.f(j5) < q0.e(j10))) {
            if ((q0.f(j10) <= q0.f(j5)) && (q0.e(j5) <= q0.e(j10))) {
                iF = q0.f(j10);
                iE = iF;
            } else {
                if ((q0.f(j5) <= q0.f(j10)) && (q0.e(j10) <= q0.e(j5))) {
                    iD = q0.d(j10);
                } else {
                    int iF2 = q0.f(j10);
                    if (iF >= q0.e(j10) || iF2 > iF) {
                        iE = q0.f(j10);
                    } else {
                        iF = q0.f(j10);
                        iD = q0.d(j10);
                    }
                }
                iE -= iD;
            }
        } else if (iE > q0.f(j10)) {
            iF -= q0.d(j10);
            iD = q0.d(j10);
            iE -= iD;
        }
        return b3.g0.b(iF, iE);
    }

    public static int s(x1 x1Var, byte[] bArr, int i7, int i10, com.google.protobuf.f fVar) throws w0 {
        Object objJ = x1Var.j();
        int iS = S(objJ, x1Var, bArr, i7, i10, fVar);
        x1Var.d(objJ);
        fVar.f2742c = objJ;
        return iS;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int s0(boolean z10, g0.n nVar, int i7) {
        return z10 ? ((g0.o) nVar.f5686m.get(i7)).f5707p : ((g0.o) nVar.f5686m.get(i7)).f5708q;
    }

    public static int t(x1 x1Var, int i7, byte[] bArr, int i10, int i11, com.google.protobuf.t0 t0Var, com.google.protobuf.f fVar) throws w0 {
        int iS = s(x1Var, bArr, i10, i11, fVar);
        t0Var.add(fVar.f2742c);
        while (iS < i11) {
            int iY = y(bArr, iS, fVar);
            if (i7 != fVar.f2740a) {
                break;
            }
            iS = s(x1Var, bArr, iY, i11, fVar);
            t0Var.add(fVar.f2742c);
        }
        return iS;
    }

    public static ActionMode.Callback t0(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof i4.k) || callback == null) ? callback : new i4.k(callback, textView);
    }

    public static int u(byte[] bArr, int i7, com.google.protobuf.f fVar) throws w0 {
        int iY = y(bArr, i7, fVar);
        int i10 = fVar.f2740a;
        if (i10 < 0) {
            throw w0.e();
        }
        if (i10 == 0) {
            fVar.f2742c = "";
            return iY;
        }
        fVar.f2742c = new String(bArr, iY, i10, u0.f2861a);
        return iY + i10;
    }

    public static int v(byte[] bArr, int i7, com.google.protobuf.f fVar) throws w0 {
        int iY = y(bArr, i7, fVar);
        int i10 = fVar.f2740a;
        if (i10 < 0) {
            throw w0.e();
        }
        if (i10 == 0) {
            fVar.f2742c = "";
            return iY;
        }
        fVar.f2742c = m2.f2795a.x(bArr, iY, i10);
        return iY + i10;
    }

    public static int w(int i7, byte[] bArr, int i10, int i11, a2 a2Var, com.google.protobuf.f fVar) throws w0 {
        if ((i7 >>> 3) == 0) {
            throw w0.a();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int iA = A(bArr, i10, fVar);
            a2Var.f(i7, Long.valueOf(fVar.f2741b));
            return iA;
        }
        if (i12 == 1) {
            a2Var.f(i7, Long.valueOf(q(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iY = y(bArr, i10, fVar);
            int i13 = fVar.f2740a;
            if (i13 < 0) {
                throw w0.e();
            }
            if (i13 > bArr.length - iY) {
                throw w0.g();
            }
            if (i13 == 0) {
                a2Var.f(i7, com.google.protobuf.l.f2785b);
            } else {
                a2Var.f(i7, com.google.protobuf.l.k(bArr, iY, i13));
            }
            return iY + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw w0.a();
            }
            a2Var.f(i7, Integer.valueOf(p(bArr, i10)));
            return i10 + 4;
        }
        a2 a2Var2 = new a2();
        int i14 = (i7 & (-8)) | 4;
        int i15 = 0;
        while (i10 < i11) {
            int iY2 = y(bArr, i10, fVar);
            i15 = fVar.f2740a;
            if (i15 == i14) {
                i10 = iY2;
                break;
            }
            i10 = w(i15, bArr, iY2, i11, a2Var2, fVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw w0.f();
        }
        a2Var.f(i7, a2Var2);
        return i10;
    }

    public static int x(int i7, byte[] bArr, int i10, com.google.protobuf.f fVar) {
        int i11 = i7 & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            fVar.f2740a = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            fVar.f2740a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            fVar.f2740a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            fVar.f2740a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                fVar.f2740a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int y(byte[] bArr, int i7, com.google.protobuf.f fVar) {
        int i10 = i7 + 1;
        byte b10 = bArr[i7];
        if (b10 < 0) {
            return x(b10, bArr, i10, fVar);
        }
        fVar.f2740a = b10;
        return i10;
    }

    public static int z(int i7, byte[] bArr, int i10, int i11, com.google.protobuf.t0 t0Var, com.google.protobuf.f fVar) {
        k0 k0Var = (k0) t0Var;
        int iY = y(bArr, i10, fVar);
        k0Var.d(fVar.f2740a);
        while (iY < i11) {
            int iY2 = y(bArr, iY, fVar);
            if (i7 != fVar.f2740a) {
                break;
            }
            iY = y(bArr, iY2, fVar);
            k0Var.d(fVar.f2740a);
        }
        return iY;
    }

    @Override // d3.d
    public int J(int i7) {
        int iU = U(i7);
        if (iU == -1 || U(iU) == -1) {
            return -1;
        }
        return iU;
    }

    @Override // d3.d
    public int K(int i7) {
        int iW = W(i7);
        if (iW == -1 || W(iW) == -1) {
            return -1;
        }
        return iW;
    }

    public abstract int U(int i7);

    public abstract int W(int i7);

    @Override // d3.d
    public int X(int i7) {
        return W(i7);
    }

    @Override // d3.d
    public int Y(int i7) {
        return U(i7);
    }
}
