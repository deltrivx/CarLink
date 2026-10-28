package n3;

import a8.x1;
import aa.f0;
import aa.i0;
import aa.j0;
import aa.y0;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.ScrollingLayoutElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.b1;
import f1.k1;
import f1.t1;
import f1.w0;
import f1.w1;
import i9.y;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import nb.a0;
import nb.g0;
import nb.h0;
import nb.k0;
import nb.n0;
import nb.v;
import nb.w;
import nb.x0;
import ra.a1;
import ra.s0;
import u8.b0;
import u8.z;
import w0.e1;
import x.o1;
import x9.d0;
import x9.q0;
import x9.r0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e2.f f8756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f8757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f8759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f8760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e2.f f8761f;

    public static int A(int i7) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("n3.r", "No cameras!");
            return -1;
        }
        boolean z10 = i7 >= 0;
        if (!z10) {
            i7 = 0;
            while (i7 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i7, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i7++;
            }
        }
        if (i7 < numberOfCameras) {
            return i7;
        }
        return z10 ? -1 : 0;
    }

    public static int B(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i4.b.f(drawable);
        }
        if (!f8760e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f8759d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e7);
            }
            f8760e = true;
        }
        Method method = f8759d;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e10) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e10);
            f8759d = null;
            return 0;
        }
    }

    public static final long C(double d10) {
        return K((float) d10, 4294967296L);
    }

    public static final long D(int i7) {
        return K(i7, 4294967296L);
    }

    public static final float E(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int F(float f10, int i7, int i10) {
        return i7 + ((int) Math.round(((double) (i10 - i7)) * ((double) f10)));
    }

    public static final long G(float f10, long j5, long j10) {
        float fE = E(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j10 >> 32)), f10);
        float fE2 = E(Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10);
        return (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0326  */
    /* JADX WARN: Code duplicated, block: B:143:0x0339  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    public static final Object H(w wVar, pa.r rVar, h9.o oVar) {
        x9.e eVar;
        pa.i iVarC;
        w wVar2;
        pa.r rVar2;
        Object objH;
        int iOrdinal;
        List list;
        pa.j jVar;
        boolean z10;
        nb.p pVarG;
        pa.f fVar = pa.f.f10337d;
        i9.l.e(wVar, "kotlinType");
        boolean z11 = rVar.f10357c;
        i9.l.e(oVar, "writeGenericType");
        if (n4.h.Q(wVar)) {
            i0 i0Var = u9.p.f13213a;
            n4.h.Q(wVar);
            u9.i iVarL0 = n.l0(wVar);
            y9.h annotations = wVar.getAnnotations();
            w wVarH = n4.h.H(wVar);
            List listE = n4.h.E(wVar);
            List listJ = n4.h.J(wVar);
            ArrayList arrayList = new ArrayList(u8.q.a0(listJ, 10));
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((n0) it.next()).b());
            }
            h0.f8997b.getClass();
            h0 h0Var = h0.f8998c;
            k0 k0VarT = u9.p.f13213a.t();
            n4.h.O(wVar);
            w wVarB = ((n0) u8.p.s0(wVar.B0())).b();
            i9.l.d(wVarB, "getType(...)");
            ArrayList arrayListY0 = u8.p.y0(arrayList, nb.c.t(l.I(n.Q(wVarB)), h0Var, k0VarT, false));
            a0 a0VarP = n.l0(wVar).p();
            i9.l.d(a0VarP, "getNullableAnyType(...)");
            return H(n4.h.y(iVarL0, annotations, wVarH, listE, arrayListY0, a0VarP, false).H0(wVar.E0()), rVar, oVar);
        }
        a0 a0VarH = ob.h.h(wVar);
        if (a0VarH == null && ((pVarG = ob.h.g(wVar)) == null || (a0VarH = ob.h.N(pVarG)) == null)) {
            a0VarH = ob.h.h(wVar);
            i9.l.b(a0VarH);
        }
        k0 k0VarV = ob.h.V(a0VarH);
        Object objC = null;
        if (ob.h.y(k0VarV)) {
            i9.l.e(k0VarV, "$receiver");
            if (!(k0VarV instanceof k0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(k0VarV);
                sb2.append(", ");
                throw new IllegalArgumentException(ob.a.p(y.f6689a, k0VarV.getClass(), sb2).toString());
            }
            x9.h hVarL = k0VarV.l();
            i9.l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            u9.k kVarU = u9.i.u((x9.e) hVarL);
            if (kVarU != null) {
                switch (kVarU.ordinal()) {
                    case 0:
                        jVar = pa.k.f10344a;
                        break;
                    case 1:
                        jVar = pa.k.f10345b;
                        break;
                    case 2:
                        jVar = pa.k.f10346c;
                        break;
                    case 3:
                        jVar = pa.k.f10347d;
                        break;
                    case 4:
                        jVar = pa.k.f10348e;
                        break;
                    case 5:
                        jVar = pa.k.f10349f;
                        break;
                    case 6:
                        jVar = pa.k.f10350g;
                        break;
                    case 7:
                        jVar = pa.k.f10351h;
                        break;
                    default:
                        throw new cc.s();
                }
                if (ob.h.H(wVar)) {
                    z10 = true;
                } else {
                    wa.c cVar = ga.y.f6140p;
                    i9.l.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (ob.h.u(wVar, cVar)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                objC = f(jVar, z10);
            } else {
                i9.l.e(k0VarV, "$receiver");
                if (!(k0VarV instanceof k0)) {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(k0VarV);
                    sb3.append(", ");
                    throw new IllegalArgumentException(ob.a.p(y.f6689a, k0VarV.getClass(), sb3).toString());
                }
                x9.h hVarL2 = k0VarV.l();
                i9.l.c(hVarL2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                u9.k kVarS = u9.i.s((x9.e) hVarL2);
                if (kVarS != null) {
                    StringBuilder sb4 = new StringBuilder("[");
                    eb.c cVar2 = (eb.c) eb.c.f4673n.get(kVarS);
                    if (cVar2 == null) {
                        eb.c.a(6);
                        throw null;
                    }
                    sb4.append(cVar2.c());
                    objC = pa.f.b(sb4.toString());
                } else {
                    i9.l.e(k0VarV, "$receiver");
                    if (!(k0VarV instanceof k0)) {
                        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb5.append(k0VarV);
                        sb5.append(", ");
                        throw new IllegalArgumentException(ob.a.p(y.f6689a, k0VarV.getClass(), sb5).toString());
                    }
                    x9.h hVarL3 = k0VarV.l();
                    if (hVarL3 != null && u9.i.J(hVarL3)) {
                        i9.l.e(k0VarV, "$receiver");
                        if (!(k0VarV instanceof k0)) {
                            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb6.append(k0VarV);
                            sb6.append(", ");
                            throw new IllegalArgumentException(ob.a.p(y.f6689a, k0VarV.getClass(), sb6).toString());
                        }
                        x9.h hVarL4 = k0VarV.l();
                        i9.l.c(hVarL4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        wa.d dVarH = db.e.h((x9.e) hVarL4);
                        String str = w9.d.f14177a;
                        wa.b bVarF = w9.d.f(dVarH);
                        if (bVarF != null) {
                            if (!rVar.f10361g && ((list = w9.d.f14189n) == null || !list.isEmpty())) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        objC = pa.f.c(eb.b.e(bVarF));
                                        break;
                                    }
                                } while (!((w9.c) it2.next()).f14174a.equals(bVarF));
                            } else {
                                objC = pa.f.c(eb.b.e(bVarF));
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (objC != null) {
            Object objF = f(objC, rVar.f10355a);
            oVar.invoke(wVar, objF, rVar);
            return objF;
        }
        k0 k0VarD0 = wVar.D0();
        if (k0VarD0 instanceof v) {
            v vVar = (v) k0VarD0;
            w wVar3 = vVar.f9045a;
            if (wVar3 != null) {
                return H(n.I0(wVar3), rVar, oVar);
            }
            LinkedHashSet linkedHashSet = vVar.f9046b;
            i9.l.e(linkedHashSet, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + u8.p.q0(linkedHashSet, null, null, null, null, 63));
        }
        x9.h hVarL5 = k0VarD0.l();
        if (hVarL5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + wVar);
        }
        if (pb.l.f(hVarL5)) {
            return pa.f.c("error/NonExistentClass");
        }
        boolean z12 = hVarL5 instanceof x9.e;
        if (z12 && u9.i.z(wVar)) {
            if (wVar.B0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            n0 n0Var = (n0) wVar.B0().get(0);
            w wVarB2 = n0Var.b();
            i9.l.d(wVarB2, "getType(...)");
            if (n0Var.a() == x0.IN_VARIANCE) {
                objH = pa.f.c("java/lang/Object");
            } else {
                x0 x0VarA = n0Var.a();
                i9.l.d(x0VarA, "getProjectionKind(...)");
                if (z11 || ((iOrdinal = x0VarA.ordinal()) == 0 ? (rVar2 = rVar.f10363i) == null : !(iOrdinal == 1 ? (rVar2 = rVar.f10362h) != null : (rVar2 = rVar.f10360f) != null))) {
                    rVar2 = rVar;
                }
                objH = H(wVarB2, rVar2, oVar);
            }
            return pa.f.b("[" + pa.f.h((pa.k) objH));
        }
        if (!z12) {
            if (hVarL5 instanceof r0) {
                w wVarY0 = n.y0((r0) hVarL5);
                if (wVar.E0()) {
                    wVarY0 = n.E0(wVarY0);
                }
                return H(wVarY0, rVar, wb.d.f14286a);
            }
            if ((hVarL5 instanceof q0) && rVar.f10364j) {
                return H(((lb.s) ((q0) hVarL5)).D0(), rVar, oVar);
            }
            throw new UnsupportedOperationException("Unknown type " + wVar);
        }
        if (za.f.b(hVarL5) && !rVar.f10356b && (wVar2 = (w) nb.c.d(wVar, new HashSet())) != null) {
            return H(wVar2, new pa.r(rVar.f10355a, true, rVar.f10357c, rVar.f10358d, rVar.f10359e, rVar.f10360f, rVar.f10361g, rVar.f10362h, rVar.f10363i, 512), oVar);
        }
        if (z11) {
            wa.e eVar2 = u9.i.f13141e;
            if (u9.i.b((x9.e) hVarL5, u9.n.Q)) {
                iVarC = pa.f.c("java/lang/Class");
            } else {
                eVar = (x9.e) hVarL5;
                i9.l.d(eVar.a(), "getOriginal(...)");
                if (eVar.f() == x9.f.f14704d) {
                    x9.k kVarL = eVar.l();
                    i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar = (x9.e) kVarL;
                }
                x9.e eVarA = eVar.a();
                i9.l.d(eVarA, "getOriginal(...)");
                iVarC = pa.f.c(o(eVarA, fVar));
            }
        } else {
            eVar = (x9.e) hVarL5;
            i9.l.d(eVar.a(), "getOriginal(...)");
            if (eVar.f() == x9.f.f14704d) {
                x9.k kVarL2 = eVar.l();
                i9.l.c(kVarL2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                eVar = (x9.e) kVarL2;
            }
            x9.e eVarA2 = eVar.a();
            i9.l.d(eVarA2, "getOriginal(...)");
            iVarC = pa.f.c(o(eVarA2, fVar));
        }
        oVar.invoke(wVar, iVarC, rVar);
        return iVarC;
    }

    public static void I(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final s0 J(s0 s0Var, f0 f0Var) {
        i9.l.e(s0Var, "<this>");
        int i7 = s0Var.f12169c;
        if ((i7 & 256) == 256) {
            return s0Var.f12178m;
        }
        if ((i7 & 512) == 512) {
            return f0Var.a(s0Var.f12179n);
        }
        return null;
    }

    public static final long K(float f10, long j5) {
        long jFloatToRawIntBits = j5 | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
        s[] sVarArr = q.f8753b;
        return jFloatToRawIntBits;
    }

    public static sa.a L(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        n9.d dVar = new n9.d(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(u8.q.a0(dVar, 10));
        Iterator it = dVar.iterator();
        while (true) {
            n9.c cVar = (n9.c) it;
            if (!cVar.f8970c) {
                int[] iArrI0 = u8.p.I0(arrayList);
                return new sa.a(Arrays.copyOf(iArrI0, iArrI0.length));
            }
            cVar.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static final s0 M(ra.a0 a0Var, f0 f0Var) {
        i9.l.e(a0Var, "<this>");
        i9.l.e(f0Var, "typeTable");
        int i7 = a0Var.f11804c;
        if ((i7 & 32) == 32) {
            return a0Var.f11811j;
        }
        if ((i7 & 64) == 64) {
            return f0Var.a(a0Var.k);
        }
        return null;
    }

    public static final o1 N(f1.s sVar) {
        Object[] objArr = new Object[0];
        boolean zD = sVar.d(0);
        Object objK = sVar.K();
        if (zD || objK == f1.n.f5051a) {
            objK = new e1(9);
            sVar.h0(objK);
        }
        return (o1) o1.k.d(objArr, o1.f14444i, (h9.a) objK, sVar, 0);
    }

    public static final String O(wa.e eVar) {
        i9.l.e(eVar, "<this>");
        String strB = eVar.b();
        i9.l.d(strB, "asString(...)");
        if (!ya.m.f15243a.contains(strB)) {
            for (int i7 = 0; i7 < strB.length(); i7++) {
                char cCharAt = strB.charAt(i7);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                String strB2 = eVar.b();
                i9.l.d(strB2, "asString(...)");
                return strB2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String strB3 = eVar.b();
        i9.l.d(strB3, "asString(...)");
        sb2.append("`".concat(strB3));
        sb2.append('`');
        return sb2.toString();
    }

    public static final String P(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wa.e eVar = (wa.e) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(O(eVar));
        }
        return sb2.toString();
    }

    public static final String Q(String str, String str2, String str3, String str4, String str5) {
        i9.l.e(str, "lowerRendered");
        i9.l.e(str2, "lowerPrefix");
        i9.l.e(str3, "upperRendered");
        i9.l.e(str4, "upperPrefix");
        i9.l.e(str5, "foldedPrefix");
        if (!zb.q.o0(str, str2) || !zb.q.o0(str3, str4)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        i9.l.d(strSubstring, "substring(...)");
        String strSubstring2 = str3.substring(str4.length());
        i9.l.d(strSubstring2, "substring(...)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!d0(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final s0 R(ra.a0 a0Var, f0 f0Var) {
        i9.l.e(a0Var, "<this>");
        i9.l.e(f0Var, "typeTable");
        int i7 = a0Var.f11804c;
        if ((i7 & 8) == 8) {
            s0 s0Var = a0Var.f11808g;
            i9.l.d(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i7 & 16) == 16) {
            return f0Var.a(a0Var.f11809h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final s0 S(ra.i0 i0Var, f0 f0Var) {
        i9.l.e(i0Var, "<this>");
        i9.l.e(f0Var, "typeTable");
        int i7 = i0Var.f12008c;
        if ((i7 & 8) == 8) {
            s0 s0Var = i0Var.f12012g;
            i9.l.d(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i7 & 16) == 16) {
            return f0Var.a(i0Var.f12013h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static int T(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    public static r1.p U(r1.p pVar, o1 o1Var, boolean z10) {
        return androidx.compose.foundation.a.i(pVar, o1Var, z10 ? z.x0.f15591a : z.x0.f15592b, true, null, o1Var.f14447c, true, null).a(new ScrollingLayoutElement(o1Var, z10));
    }

    public static boolean V(Drawable drawable, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i4.b.p(drawable, i7);
        }
        if (!f8758c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f8757b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e7);
            }
            f8758c = true;
        }
        Method method = f8757b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i7));
                return true;
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e10);
                f8757b = null;
            }
        }
        return false;
    }

    public static Set W(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        i9.l.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static void X(Drawable drawable, int i7) {
        drawable.setTint(i7);
    }

    public static final long Y(float f10, long j5) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j5 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j5 & 4294967295L)) - f10);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static n9.b Z(n9.d dVar) {
        i9.l.e(dVar, "<this>");
        return new n9.b(dVar.f8965a, dVar.f8966b, dVar.f8967c > 0 ? 2 : -2);
    }

    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static int a0(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        return i7;
    }

    public static final void b(r1.p pVar, t1 t1Var, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        n1.c cVar2 = q0.i.f10558a;
        sVar.Y(-714464401);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(t1Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(cVar2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                Object k1Var = new k1(null, w0.f5184c);
                sVar.h0(k1Var);
                objK = k1Var;
            }
            s0.c cVarE = e(cVar2, sVar, (i10 >> 6) & 14);
            f1.b.a(t1Var.a(cVarE), n1.h.e(274270255, new x1(pVar, (b1) objK, cVar, cVarE), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0.u(pVar, t1Var, cVar, i7);
        }
    }

    public static final boolean b0(Throwable th, h9.a aVar) {
        Collection collectionJ0;
        Object objInvoke;
        i9.l.e(th, "<this>");
        Integer num = d9.a.f3845a;
        q1.e eVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            i9.l.d(suppressed, "getSuppressed(...)");
            collectionJ0 = u8.l.j0(suppressed);
        } else {
            Method method = c9.a.f2573b;
            collectionJ0 = (method == null || (objInvoke = method.invoke(th, null)) == null) ? u8.w.f13122a : u8.l.j0((Throwable[]) objInvoke);
        }
        boolean z10 = false;
        if (!collectionJ0.isEmpty()) {
            Iterator it = collectionJ0.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof q1.e) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.invoke();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            if (!zIsEmpty) {
                eVar = new q1.e(list);
            }
        } catch (Throwable th2) {
            eVar = th2;
        }
        if (eVar != null) {
            t8.a.a(th, eVar);
        }
        return z10;
    }

    public static void c(Appendable appendable, Object obj, h9.k kVar) {
        i9.l.e(appendable, "<this>");
        if (kVar != null) {
            appendable.append((CharSequence) kVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final s0 c0(a1 a1Var, f0 f0Var) {
        i9.l.e(f0Var, "typeTable");
        int i7 = a1Var.f11825c;
        if ((i7 & 4) == 4) {
            s0 s0Var = a1Var.f11828f;
            i9.l.d(s0Var, "getType(...)");
            return s0Var;
        }
        if ((i7 & 8) == 8) {
            return f0Var.a(a1Var.f11829g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final boolean d0(String str, String str2) {
        i9.l.e(str, "lower");
        i9.l.e(str2, "upper");
        if (str.equals(zb.q.n0(str2, "?", ""))) {
            return true;
        }
        if (zb.q.i0(str2, "?") && i9.l.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return i9.l.a(sb2.toString(), str2);
    }

    public static final s0.c e(n1.c cVar, f1.s sVar, int i7) {
        boolean z10 = (((i7 & 14) ^ 6) > 4 && sVar.f(cVar)) || (i7 & 6) == 4;
        Object objK = sVar.K();
        Object obj = f1.n.f5051a;
        if (z10 || objK == obj) {
            objK = new s0.c(cVar);
            sVar.h0(objK);
        }
        s0.c cVar2 = (s0.c) objK;
        boolean zF = sVar.f(cVar2);
        Object objK2 = sVar.K();
        if (zF || objK2 == obj) {
            objK2 = new s0.d(0, cVar2);
            sVar.h0(objK2);
        }
        f1.b.c(cVar2, (h9.k) objK2, sVar);
        return cVar2;
    }

    public static n9.d e0(int i7, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new n9.d(i7, i10 - 1, 1);
        }
        n9.d dVar = n9.d.f8972d;
        return n9.d.f8972d;
    }

    public static final Object f(Object obj, boolean z10) {
        eb.c cVar;
        i9.l.e(obj, "possiblyPrimitiveType");
        if (z10) {
            obj = (pa.k) obj;
            if ((obj instanceof pa.j) && (cVar = ((pa.j) obj).f10343i) != null) {
                wa.c cVar2 = cVar.f4681d;
                if (cVar2 == null) {
                    eb.c.a(15);
                    throw null;
                }
                String strD = eb.b.b(cVar2).d();
                i9.l.d(strD, "getInternalName(...)");
                return pa.f.c(strD);
            }
        }
        return obj;
    }

    public static Drawable f0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof y3.a)) {
            return drawable;
        }
        y3.c cVar = new y3.c();
        cVar.f15088d = cVar.c();
        cVar.h(drawable);
        y3.c.a();
        return cVar;
    }

    public static boolean g(x3.d[] dVarArr, x3.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            x3.d dVar = dVarArr[i7];
            char c10 = dVar.f14568a;
            x3.d dVar2 = dVarArr2[i7];
            if (c10 != dVar2.f14568a || dVar.f14569b.length != dVar2.f14569b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a A[RETURN] */
    public static int h(Context context, String str) {
        int iCheckOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            int i7 = Build.VERSION.SDK_INT;
            String strC = i7 >= 23 ? u3.a.c(str) : null;
            if (strC != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                int iB = 1;
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    if (i7 >= 29) {
                        AppOpsManager appOpsManagerB = u3.g.b(context);
                        iCheckOpNoThrow = appOpsManagerB == null ? 1 : appOpsManagerB.checkOpNoThrow(strC, Binder.getCallingUid(), packageName);
                        if (iCheckOpNoThrow == 0) {
                            String strA = u3.g.a(context);
                            if (appOpsManagerB != null) {
                                iB = appOpsManagerB.checkOpNoThrow(strC, iMyUid, strA);
                            }
                        }
                        if (iCheckOpNoThrow == 0) {
                            return -2;
                        }
                    } else if (i7 >= 23) {
                        iB = u3.a.b((AppOpsManager) u3.a.a(context), strC, packageName);
                    }
                } else if (i7 >= 23) {
                    iB = u3.a.b((AppOpsManager) u3.a.a(context), strC, packageName);
                }
                iCheckOpNoThrow = iB;
                if (iCheckOpNoThrow == 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float i(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static float j(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int m(int i7, int i10, int i11) {
        if (i10 <= i11) {
            if (i7 < i10) {
                return i10;
            }
            return i7 > i11 ? i11 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long n(long j5) {
        if (j5 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j5 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final String o(x9.e eVar, pa.f fVar) {
        i9.l.e(eVar, "klass");
        i9.l.e(fVar, "typeMappingConfiguration");
        x9.k kVarL = eVar.l();
        i9.l.d(kVarL, "getContainingDeclaration(...)");
        wa.e name = eVar.getName();
        if (name != null) {
            wa.e eVar2 = wa.g.f14251a;
            if (name.f14248b) {
                name = wa.g.f14253c;
            }
        } else {
            name = wa.g.f14253c;
        }
        String strC = name.c();
        if (kVarL instanceof d0) {
            wa.c cVar = ((j0) ((d0) kVarL)).f364e;
            if (cVar.f14240a.c()) {
                return strC;
            }
            return zb.q.m0(cVar.f14240a.f14243a, '.', '/') + '/' + strC;
        }
        x9.e eVar3 = kVarL instanceof x9.e ? (x9.e) kVarL : null;
        if (eVar3 == null) {
            throw new IllegalArgumentException("Unexpected container: " + kVarL + " for " + eVar);
        }
        return o(eVar3, fVar) + '$' + strC;
    }

    public static final boolean p(x1.c cVar, float f10, float f11) {
        float f12 = cVar.f14523a;
        if (f10 > cVar.f14525c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f14526d && cVar.f14524b <= f11;
    }

    public static final qb.i q(x0 x0Var) {
        int iOrdinal = x0Var.ordinal();
        if (iOrdinal == 0) {
            return qb.i.INV;
        }
        if (iOrdinal == 1) {
            return qb.i.IN;
        }
        if (iOrdinal == 2) {
            return qb.i.OUT;
        }
        throw new cc.s();
    }

    public static float[] r(float[] fArr, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static v9.f s(v9.c cVar, boolean z10) {
        String lowerCase;
        i9.l.e(cVar, "functionClass");
        List list = cVar.k;
        v9.f fVar = new v9.f(cVar, null, 1, z10);
        aa.a0 a0VarA0 = cVar.A0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r0) obj).I() != x0.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        u8.n nVarN0 = u8.p.N0(arrayList);
        ArrayList arrayList2 = new ArrayList(u8.q.a0(nVarN0, 10));
        Iterator it = nVarN0.iterator();
        while (true) {
            u8.a0 a0Var = (u8.a0) it;
            if (!a0Var.f13099b.hasNext()) {
                a0 a0VarN = ((r0) u8.p.s0(list)).n();
                x xVar = x.f14750e;
                ga.o oVar = x9.o.f14721e;
                u8.w wVar = u8.w.f13122a;
                fVar.H0(null, a0VarA0, wVar, wVar, arrayList2, a0VarN, xVar, oVar);
                v9.f fVar2 = fVar;
                fVar2.f493w = true;
                return fVar2;
            }
            z zVar = (z) a0Var.next();
            int i7 = zVar.f13125a;
            r0 r0Var = (r0) zVar.f13126b;
            String strB = r0Var.getName().b();
            i9.l.d(strB, "asString(...)");
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                i9.l.d(lowerCase, "toLowerCase(...)");
            }
            v9.f fVar3 = fVar;
            wa.e eVarE = wa.e.e(lowerCase);
            a0 a0VarN2 = r0Var.n();
            i9.l.d(a0VarN2, "getDefaultType(...)");
            arrayList2.add(new y0(fVar3, null, i7, y9.g.f15129a, eVarE, a0VarN2, false, false, false, null, x9.n0.f14716e0));
            fVar = fVar3;
        }
    }

    public static final g0 t(x9.e eVar, x9.e eVar2) {
        i9.l.e(eVar, "from");
        i9.l.e(eVar2, "to");
        eVar.q().size();
        eVar2.q().size();
        List listQ = eVar.q();
        i9.l.d(listQ, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(u8.q.a0(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).t());
        }
        List listQ2 = eVar2.q();
        i9.l.d(listQ2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(u8.q.a0(listQ2, 10));
        Iterator it2 = listQ2.iterator();
        while (it2.hasNext()) {
            a0 a0VarN = ((r0) it2.next()).n();
            i9.l.d(a0VarN, "getDefaultType(...)");
            arrayList2.add(n.Q(a0VarN));
        }
        return new g0(1, b0.Z0(u8.p.O0(arrayList, arrayList2)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[SYNTHETIC] */
    public static x3.d[] u(String str) {
        int i7;
        String strTrim;
        float[] fArrR;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char cCharAt = str.charAt(i11);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i11).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i10) != 'z' || strTrim.charAt(i10) == 'Z') {
                                fArrR = new float[i10];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i13 = 1;
                                    int i14 = 0;
                                    while (i13 < length) {
                                        boolean z10 = false;
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        boolean z13 = false;
                                        for (int i15 = i13; i15 < strTrim.length(); i15++) {
                                            char cCharAt2 = strTrim.charAt(i15);
                                            if (cCharAt2 == ' ') {
                                                z10 = false;
                                                z12 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                                                        z10 = false;
                                                        z12 = true;
                                                        break;
                                                    case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                                                        if (i15 == i13 || z10) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                        }
                                                        break;
                                                    case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                                                        if (z11) {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                        } else {
                                                            z10 = false;
                                                            z11 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z10 = false;
                                                        break;
                                                }
                                            } else {
                                                z10 = true;
                                            }
                                            if (z12) {
                                                if (i13 < i15) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i13, i15));
                                                    i14++;
                                                }
                                                if (z13) {
                                                    i13 = i15;
                                                } else {
                                                    i13 = i15 + 1;
                                                }
                                            }
                                        }
                                        if (i13 < i15) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i13, i15));
                                            i14++;
                                        }
                                        if (z13) {
                                            i13 = i15;
                                        } else {
                                            i13 = i15 + 1;
                                        }
                                    }
                                    fArrR = r(fArr, i14);
                                    i10 = 0;
                                } catch (NumberFormatException e7) {
                                    throw new RuntimeException(a2.f.G("error in parsing \"", strTrim, "\""), e7);
                                }
                            }
                            arrayList.add(new x3.d(strTrim.charAt(i10), fArrR));
                        }
                        i12 = i11;
                        i11++;
                        i10 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i11++;
            }
            strTrim = str.substring(i12, i11).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i10) != 'z') {
                    fArrR = new float[i10];
                } else {
                    fArrR = new float[i10];
                }
                arrayList.add(new x3.d(strTrim.charAt(i10), fArrR));
            }
            i12 = i11;
            i11++;
            i10 = 0;
        }
        if (i11 - i12 != 1 || i12 >= str.length()) {
            i7 = 0;
        } else {
            i7 = 0;
            arrayList.add(new x3.d(str.charAt(i12), new float[0]));
        }
        return (x3.d[]) arrayList.toArray(new x3.d[i7]);
    }

    public static x3.d[] v(x3.d[] dVarArr) {
        x3.d[] dVarArr2 = new x3.d[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7] = new x3.d(dVarArr[i7]);
        }
        return dVarArr2;
    }

    public static float w(float f10, float f11, float f12, float f13) {
        double d10 = f10 - f12;
        double d11 = f11 - f13;
        return (float) Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public static float x(int i7, int i10, int i11, int i12) {
        double d10 = i7 - i11;
        double d11 = i10 - i12;
        return (float) Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public static final float y(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static v0.b z(v0.b bVar, o oVar, b3.r0 r0Var, c cVar, f3.d dVar) {
        if (bVar != null && oVar == bVar.f13486a && b3.g0.h(r0Var, oVar).equals(bVar.f13487b) && cVar.a() == bVar.f13488c.f8731a && dVar == bVar.f13489d) {
            return bVar;
        }
        v0.b bVar2 = v0.b.f13485h;
        if (bVar2 != null && oVar == bVar2.f13486a && b3.g0.h(r0Var, oVar).equals(bVar2.f13487b) && cVar.a() == bVar2.f13488c.f8731a && dVar == bVar2.f13489d) {
            return bVar2;
        }
        v0.b bVar3 = new v0.b(oVar, b3.g0.h(r0Var, oVar), new d(cVar.a(), cVar.O()), dVar);
        v0.b.f13485h = bVar3;
        return bVar3;
    }

    public abstract String d();
}
