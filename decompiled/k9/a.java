package k9;

import a8.w;
import aa.y0;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.util.Size;
import android.util.SizeF;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import da.d;
import db.e;
import f1.b1;
import f1.k1;
import f1.s;
import f1.w0;
import f1.w1;
import g1.l0;
import ga.f;
import ga.o;
import h9.k;
import i9.b;
import i9.l;
import i9.x;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb.y;
import ka.d0;
import l8.j0;
import l8.k0;
import l8.m0;
import l8.n0;
import l8.r;
import l8.t;
import n1.h;
import n3.u;
import o9.e0;
import pa.m;
import pa.n;
import r2.j1;
import ra.b0;
import ra.g1;
import s.h0;
import s.i0;
import s.o0;
import t8.j;
import t8.z;
import u8.p;
import u9.i;
import x9.c;
import y1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7382b;

    public static boolean A(c cVar) {
        l.e(cVar, "callableMemberDescriptor");
        if (!f.f6074d.contains(cVar.getName())) {
            return false;
        }
        if (p.g0(f.f6073c, e.c(cVar)) && cVar.X().isEmpty()) {
            return true;
        }
        if (!i.A(cVar)) {
            return false;
        }
        Collection collectionM = cVar.m();
        l.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<c> collection = collectionM;
        if (collection.isEmpty()) {
            return false;
        }
        for (c cVar2 : collection) {
            l.b(cVar2);
            if (A(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final int D(int i7, int i10) {
        return (i7 >> i10) & 31;
    }

    public static final int E(b0 b0Var) {
        int i7 = b0Var == null ? -1 : y.f7089a[b0Var.ordinal()];
        if (i7 != 1) {
            int i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    i10 = 4;
                    if (i7 != 4) {
                    }
                }
            }
            return i10;
        }
        return 1;
    }

    public static void I(n nVar, Annotation annotation) throws InvocationTargetException {
        Class clsL = g5.a.L(g5.a.G(annotation));
        pa.l lVarL = nVar.l(d.a(clsL), new ca.a(annotation));
        if (lVarL != null) {
            J(lVarL, annotation, clsL);
        }
    }

    public static void J(pa.l lVar, Annotation annotation, Class cls) throws InvocationTargetException {
        b bVarH = l.h(cls.getDeclaredMethods());
        while (bVarH.hasNext()) {
            Method method = (Method) bVarH.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                l.b(objInvoke);
                wa.e eVarE = wa.e.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    lVar.e(eVarE, m((Class) objInvoke));
                } else if (ca.d.f2578a.contains(enclosingClass)) {
                    lVar.g(eVarE, objInvoke);
                } else {
                    List list = d.f3860a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        l.b(enclosingClass);
                        lVar.f(eVarE, d.a(enclosingClass), wa.e.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        l.d(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) u8.l.H0(interfaces);
                        l.b(cls2);
                        pa.l lVarI = lVar.i(d.a(cls2), eVarE);
                        if (lVarI != null) {
                            J(lVarI, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        m mVarM = lVar.m(eVarE);
                        if (mVarM != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            int i7 = 0;
                            if (componentType.isEnum()) {
                                wa.b bVarA = d.a(componentType);
                                Object[] objArr = (Object[]) objInvoke;
                                int length = objArr.length;
                                while (i7 < length) {
                                    Object obj = objArr[i7];
                                    l.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    mVarM.k(bVarA, wa.e.e(((Enum) obj).name()));
                                    i7++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) objInvoke;
                                int length2 = objArr2.length;
                                while (i7 < length2) {
                                    Object obj2 = objArr2[i7];
                                    l.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    mVarM.c(m((Class) obj2));
                                    i7++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) objInvoke;
                                int length3 = objArr3.length;
                                while (i7 < length3) {
                                    Object obj3 = objArr3[i7];
                                    pa.l lVarD = mVarM.d(d.a(componentType));
                                    if (lVarD != null) {
                                        l.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        J(lVarD, (Annotation) obj3, componentType);
                                    }
                                    i7++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) objInvoke;
                                int length4 = objArr4.length;
                                while (i7 < length4) {
                                    mVarM.h(objArr4[i7]);
                                    i7++;
                                }
                            }
                            mVarM.b();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.b();
    }

    public static final boolean K(h0 h0Var, Object obj, Object obj2) {
        Object objG = h0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof i0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            h0Var.k(obj);
            return true;
        }
        i0 i0Var = (i0) objG;
        boolean zL = i0Var.l(obj2);
        if (zL && i0Var.g()) {
            h0Var.k(obj);
        }
        return zL;
    }

    public static final void L(h0 h0Var, Object obj) {
        boolean zG;
        long[] jArr = h0Var.f12437a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj2 = h0Var.f12438b[i12];
                        Object obj3 = h0Var.f12439c[i12];
                        if (obj3 instanceof i0) {
                            i0 i0Var = (i0) obj3;
                            i0Var.l(obj);
                            zG = i0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            h0Var.l(i12);
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public static int M(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long N(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static final void Q(l0 l0Var, int i7, Object obj) {
        l0Var.k[(l0Var.f5800l - l0Var.f5796g[l0Var.f5797h - 1].f5793c) + i7] = obj;
    }

    public static final void R(l0 l0Var, int i7, Object obj, int i10, Object obj2) {
        int i11 = l0Var.f5800l - l0Var.f5796g[l0Var.f5797h - 1].f5793c;
        Object[] objArr = l0Var.k;
        objArr[i7 + i11] = obj;
        objArr[i11 + i10] = obj2;
    }

    public static final o U(n.a aVar) {
        l.e(aVar, "<this>");
        o oVar = (o) ga.p.f6106d.get(aVar);
        return oVar == null ? x9.o.f(aVar) : oVar;
    }

    public static final void a(final r1.p pVar, final m5.l lVar, long j5, long j10, long j11, float f10, s sVar, final int i7) {
        int i10;
        final long j12;
        final long j13;
        final long j14;
        final float f11;
        k1 k1Var;
        l.e(pVar, "modifier");
        sVar.Y(-141149738);
        if ((i7 & 14) == 0) {
            i10 = i7 | (sVar.f(pVar) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 112) == 0) {
            i10 |= sVar.f(lVar) ? 32 : 16;
        }
        if (((i10 | 224640) & 374491) == 74898 && sVar.z()) {
            sVar.Q();
            j12 = j5;
            j13 = j10;
            j14 = j11;
            f11 = f10;
        } else {
            j12 = q.f14957l;
            j13 = m5.q.f8517a;
            j14 = m5.q.f8518b;
            f11 = 12;
            n3.c cVar = (n3.c) sVar.j(j1.f11276h);
            final x xVar = new x();
            final f7.q qVarH = y1.h0.h();
            qVarH.k((lVar == null || (k1Var = lVar.f8487f) == null) ? j12 : ((q) k1Var.getValue()).f14960a);
            final f7.q qVarL = e0.l(cVar.R(f11), j13, j14);
            final int i11 = 0;
            final int i12 = 1;
            u.a(0, sVar, new k() { // from class: m5.f
                @Override // h9.k
                public final Object invoke(Object obj) {
                    int i13 = i12;
                    z zVar = z.f12851a;
                    f7.q qVar = qVarH;
                    x xVar2 = xVar;
                    switch (i13) {
                        case 0:
                            long j15 = ((n3.m) obj).f8746a;
                            if (((int) (j15 >> 32)) != 0 && ((int) (j15 & 4294967295L)) != 0) {
                                y1.f fVarF = y1.h0.f((int) (j15 >> 32), (int) (4294967295L & j15), 0);
                                j.a(y1.h0.a(fVarF), j15, qVar);
                                xVar2.f6688a = fVarF;
                            }
                            break;
                        default:
                            a2.g gVar = (a2.g) obj;
                            i9.l.e(gVar, "$this$Canvas");
                            y1.o oVarZ = gVar.W().z();
                            y1.f fVar = (y1.f) xVar2.f6688a;
                            if (fVar != null) {
                                f7.q qVar2 = j.f8478a;
                                i9.l.e(oVarZ, "$this$drawImage");
                                oVarZ.f(fVar, 0L, j.f8478a);
                                j.a(oVarZ, a.a.G(fVar), qVar);
                            }
                            break;
                    }
                    return zVar;
                }
            }, androidx.compose.ui.layout.a.e(pVar.a(androidx.compose.foundation.layout.c.f822c), new k() { // from class: m5.f
                @Override // h9.k
                public final Object invoke(Object obj) {
                    int i13 = i11;
                    z zVar = z.f12851a;
                    f7.q qVar = qVarL;
                    x xVar2 = xVar;
                    switch (i13) {
                        case 0:
                            long j15 = ((n3.m) obj).f8746a;
                            if (((int) (j15 >> 32)) != 0 && ((int) (j15 & 4294967295L)) != 0) {
                                y1.f fVarF = y1.h0.f((int) (j15 >> 32), (int) (4294967295L & j15), 0);
                                j.a(y1.h0.a(fVarF), j15, qVar);
                                xVar2.f6688a = fVarF;
                            }
                            break;
                        default:
                            a2.g gVar = (a2.g) obj;
                            i9.l.e(gVar, "$this$Canvas");
                            y1.o oVarZ = gVar.W().z();
                            y1.f fVar = (y1.f) xVar2.f6688a;
                            if (fVar != null) {
                                f7.q qVar2 = j.f8478a;
                                i9.l.e(oVarZ, "$this$drawImage");
                                oVarZ.f(fVar, 0L, j.f8478a);
                                j.a(oVarZ, a.a.G(fVar), qVar);
                            }
                            break;
                    }
                    return zVar;
                }
            }));
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: m5.g
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r1.p pVar2 = pVar;
                    i9.l.e(pVar2, "$modifier");
                    k9.a.a(pVar2, lVar, j12, j13, j14, f11, (f1.s) obj, f1.b.y(i7 | 1));
                    return z.f12851a;
                }
            };
        }
    }

    public static final long b(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void c(List list, List list2, String str, boolean z10, boolean z11, k kVar, s sVar, int i7, int i10) {
        int i11;
        int i12;
        k kVar2;
        boolean z12;
        k kVar3;
        boolean z13;
        boolean z14;
        w1 w1VarR;
        sVar.Y(635126572);
        if ((i7 & 6) == 0) {
            i11 = i7 | (sVar.h(list) ? 4 : 2);
        } else {
            i11 = i7;
        }
        int i13 = i11 | (sVar.h(list2) ? 32 : 16);
        int i14 = i13 | 3072;
        int i15 = i10 & 16;
        if (i15 != 0) {
            i12 = i13 | 27648;
        } else {
            i12 = i14 | (sVar.g(z11) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        }
        int i16 = i10 & 32;
        if (i16 == 0) {
            if ((i7 & 196608) == 0) {
                kVar2 = kVar;
                i12 |= sVar.h(kVar2) ? 131072 : 65536;
            }
            if ((74899 & i12) == 74898 || !sVar.z()) {
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    kVar2 = null;
                }
                k kVar4 = kVar2;
                e(list, list2, null, true, z12, str, kVar4, sVar, (i12 & 14) | 384 | (i12 & 112) | 3072 | (57344 & i12) | 196608 | ((i12 << 3) & 3670016), 0);
                kVar3 = kVar4;
                z13 = true;
                z14 = z12;
            } else {
                sVar.Q();
                z13 = z10;
                z14 = z11;
                kVar3 = kVar2;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new l8.o(list, list2, str, z13, z14, kVar3, i7, i10, 0);
            }
        }
        i12 |= 196608;
        kVar2 = kVar;
        if ((74899 & i12) == 74898) {
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i16 != 0) {
                kVar2 = null;
            }
            k kVar5 = kVar2;
            e(list, list2, null, true, z12, str, kVar5, sVar, (i12 & 14) | 384 | (i12 & 112) | 3072 | (57344 & i12) | 196608 | ((i12 << 3) & 3670016), 0);
            kVar3 = kVar5;
            z13 = true;
            z14 = z12;
        } else {
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i16 != 0) {
                kVar2 = null;
            }
            k kVar6 = kVar2;
            e(list, list2, null, true, z12, str, kVar6, sVar, (i12 & 14) | 384 | (i12 & 112) | 3072 | (57344 & i12) | 196608 | ((i12 << 3) & 3670016), 0);
            kVar3 = kVar6;
            z13 = true;
            z14 = z12;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.o(list, list2, str, z13, z14, kVar3, i7, i10, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0096, please report this as an issue */
    public static final void d(final List list, final List list2, j0 j0Var, int i7, boolean z10, final k kVar, s sVar, final int i10, final int i11) {
        int i12;
        j0 j0Var2;
        int i13;
        boolean z11;
        int i14;
        final int i15;
        int i16;
        Object objK;
        w0 w0Var;
        b1 b1Var;
        Object objC;
        b1 b1Var2;
        Object objK2;
        Object objK3;
        boolean z12;
        Object objK4;
        final j0 j0Var3;
        final boolean z13;
        j0 j0Var4;
        w1 w1VarR;
        int i17;
        s sVar2 = sVar;
        sVar2.Y(1710888080);
        if ((i10 & 6) == 0) {
            i12 = (sVar2.h(list) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar2.h(list2) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                j0Var2 = j0Var;
                i12 |= sVar2.h(j0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (sVar2.g(z11)) {
                        i14 = 16384;
                    } else {
                        i14 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    }
                    i12 |= i14;
                }
                if ((196608 & i10) == 0) {
                    if (sVar2.h(kVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898 || !sVar2.z()) {
                    sVar2.S();
                    if ((i10 & 1) != 0 || sVar2.x()) {
                        if (i18 != 0) {
                            j0Var2 = null;
                        }
                        if (list2.size() > 6) {
                            i15 = 3;
                        } else {
                            i15 = 1;
                        }
                        i16 = i12 & (-7169);
                        if (i13 != 0) {
                            z11 = true;
                        }
                    } else {
                        sVar2.Q();
                        i16 = i12 & (-7169);
                        i15 = i7;
                    }
                    boolean z14 = z11;
                    sVar2.q();
                    sVar2.W(1849434622);
                    objK = sVar2.K();
                    w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = f1.b.s(Boolean.FALSE);
                        sVar2.h0(objK);
                    }
                    b1Var = (b1) objK;
                    objC = a2.f.C(sVar2, false, 1849434622);
                    if (objC == w0Var) {
                        if (j0Var2 == null) {
                            j0Var4 = (j0) p.k0(list2);
                        } else {
                            j0Var4 = j0Var2;
                        }
                        objC = f1.b.s(j0Var4);
                        sVar2.h0(objC);
                    }
                    b1Var2 = (b1) objC;
                    sVar2.p(false);
                    n1.c cVarE = h.e(-853372025, new a8.y(13, list), sVar2);
                    n1.c cVarE2 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
                    sVar2.W(5004770);
                    objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new f0.k(b1Var, 14);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    a.a.h(cVarE, cVarE2, z14, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    sVar2.W(5004770);
                    objK3 = sVar2.K();
                    if (objK3 == w0Var) {
                        objK3 = new f0.k(b1Var, 15);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
                    sVar2 = sVar;
                    j0 j0Var5 = (j0) b1Var2.getValue();
                    sVar2.W(-1633490746);
                    z12 = (i16 & 458752) == 131072;
                    objK4 = sVar2.K();
                    if (z12 || objK4 == w0Var) {
                        objK4 = new t(kVar, b1Var2, null, 0);
                        sVar2.h0(objK4);
                    }
                    sVar2.p(false);
                    f1.b.f(sVar2, (h9.n) objK4, j0Var5);
                    j0Var3 = j0Var2;
                    z13 = z14;
                } else {
                    sVar2.Q();
                    i15 = i7;
                    j0Var3 = j0Var2;
                    z13 = z11;
                }
                w1VarR = sVar2.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new h9.n() { // from class: l8.p
                        @Override // h9.n
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k9.a.d(list, list2, j0Var3, i15, z13, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                            return t8.z.f12851a;
                        }
                    };
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((196608 & i10) == 0) {
                if (sVar2.h(kVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                sVar2.S();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                boolean z15 = z11;
                sVar2.q();
                sVar2.W(1849434622);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = f1.b.s(Boolean.FALSE);
                    sVar2.h0(objK);
                }
                b1Var = (b1) objK;
                objC = a2.f.C(sVar2, false, 1849434622);
                if (objC == w0Var) {
                    if (j0Var2 == null) {
                        j0Var4 = (j0) p.k0(list2);
                    } else {
                        j0Var4 = j0Var2;
                    }
                    objC = f1.b.s(j0Var4);
                    sVar2.h0(objC);
                }
                b1Var2 = (b1) objC;
                sVar2.p(false);
                n1.c cVarE3 = h.e(-853372025, new a8.y(13, list), sVar2);
                n1.c cVarE4 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
                sVar2.W(5004770);
                objK2 = sVar2.K();
                if (objK2 == w0Var) {
                    objK2 = new f0.k(b1Var, 14);
                    sVar2.h0(objK2);
                }
                sVar2.p(false);
                a.a.h(cVarE3, cVarE4, z15, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
                boolean zBooleanValue2 = ((Boolean) b1Var.getValue()).booleanValue();
                sVar2.W(5004770);
                objK3 = sVar2.K();
                if (objK3 == w0Var) {
                    objK3 = new f0.k(b1Var, 15);
                    sVar2.h0(objK3);
                }
                sVar2.p(false);
                l8.n.a(zBooleanValue2, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
                sVar2 = sVar;
                j0 j0Var6 = (j0) b1Var2.getValue();
                sVar2.W(-1633490746);
                if ((i16 & 458752) == 131072) {
                }
                objK4 = sVar2.K();
                if (z12) {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                } else {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                }
                sVar2.p(false);
                f1.b.f(sVar2, (h9.n) objK4, j0Var6);
                j0Var3 = j0Var2;
                z13 = z15;
            } else {
                sVar2.S();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                boolean z16 = z11;
                sVar2.q();
                sVar2.W(1849434622);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = f1.b.s(Boolean.FALSE);
                    sVar2.h0(objK);
                }
                b1Var = (b1) objK;
                objC = a2.f.C(sVar2, false, 1849434622);
                if (objC == w0Var) {
                    if (j0Var2 == null) {
                        j0Var4 = (j0) p.k0(list2);
                    } else {
                        j0Var4 = j0Var2;
                    }
                    objC = f1.b.s(j0Var4);
                    sVar2.h0(objC);
                }
                b1Var2 = (b1) objC;
                sVar2.p(false);
                n1.c cVarE5 = h.e(-853372025, new a8.y(13, list), sVar2);
                n1.c cVarE6 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
                sVar2.W(5004770);
                objK2 = sVar2.K();
                if (objK2 == w0Var) {
                    objK2 = new f0.k(b1Var, 14);
                    sVar2.h0(objK2);
                }
                sVar2.p(false);
                a.a.h(cVarE5, cVarE6, z16, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
                boolean zBooleanValue3 = ((Boolean) b1Var.getValue()).booleanValue();
                sVar2.W(5004770);
                objK3 = sVar2.K();
                if (objK3 == w0Var) {
                    objK3 = new f0.k(b1Var, 15);
                    sVar2.h0(objK3);
                }
                sVar2.p(false);
                l8.n.a(zBooleanValue3, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
                sVar2 = sVar;
                j0 j0Var7 = (j0) b1Var2.getValue();
                sVar2.W(-1633490746);
                if ((i16 & 458752) == 131072) {
                }
                objK4 = sVar2.K();
                if (z12) {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                } else {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                }
                sVar2.p(false);
                f1.b.f(sVar2, (h9.n) objK4, j0Var7);
                j0Var3 = j0Var2;
                z13 = z16;
            }
            w1VarR = sVar2.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.p
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k9.a.d(list, list2, j0Var3, i15, z13, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i12 |= 384;
        j0Var2 = j0Var;
        if ((i10 & 3072) == 0) {
            i12 |= 1024;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (sVar2.g(z11)) {
                    i14 = 16384;
                } else {
                    i14 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if (sVar2.h(kVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                sVar2.S();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                boolean z17 = z11;
                sVar2.q();
                sVar2.W(1849434622);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = f1.b.s(Boolean.FALSE);
                    sVar2.h0(objK);
                }
                b1Var = (b1) objK;
                objC = a2.f.C(sVar2, false, 1849434622);
                if (objC == w0Var) {
                    if (j0Var2 == null) {
                        j0Var4 = (j0) p.k0(list2);
                    } else {
                        j0Var4 = j0Var2;
                    }
                    objC = f1.b.s(j0Var4);
                    sVar2.h0(objC);
                }
                b1Var2 = (b1) objC;
                sVar2.p(false);
                n1.c cVarE7 = h.e(-853372025, new a8.y(13, list), sVar2);
                n1.c cVarE8 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
                sVar2.W(5004770);
                objK2 = sVar2.K();
                if (objK2 == w0Var) {
                    objK2 = new f0.k(b1Var, 14);
                    sVar2.h0(objK2);
                }
                sVar2.p(false);
                a.a.h(cVarE7, cVarE8, z17, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
                boolean zBooleanValue4 = ((Boolean) b1Var.getValue()).booleanValue();
                sVar2.W(5004770);
                objK3 = sVar2.K();
                if (objK3 == w0Var) {
                    objK3 = new f0.k(b1Var, 15);
                    sVar2.h0(objK3);
                }
                sVar2.p(false);
                l8.n.a(zBooleanValue4, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
                sVar2 = sVar;
                j0 j0Var8 = (j0) b1Var2.getValue();
                sVar2.W(-1633490746);
                if ((i16 & 458752) == 131072) {
                }
                objK4 = sVar2.K();
                if (z12) {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                } else {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                }
                sVar2.p(false);
                f1.b.f(sVar2, (h9.n) objK4, j0Var8);
                j0Var3 = j0Var2;
                z13 = z17;
            } else {
                sVar2.S();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i18 != 0) {
                        j0Var2 = null;
                    }
                    if (list2.size() > 6) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i16 = i12 & (-7169);
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                boolean z18 = z11;
                sVar2.q();
                sVar2.W(1849434622);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = f1.b.s(Boolean.FALSE);
                    sVar2.h0(objK);
                }
                b1Var = (b1) objK;
                objC = a2.f.C(sVar2, false, 1849434622);
                if (objC == w0Var) {
                    if (j0Var2 == null) {
                        j0Var4 = (j0) p.k0(list2);
                    } else {
                        j0Var4 = j0Var2;
                    }
                    objC = f1.b.s(j0Var4);
                    sVar2.h0(objC);
                }
                b1Var2 = (b1) objC;
                sVar2.p(false);
                n1.c cVarE9 = h.e(-853372025, new a8.y(13, list), sVar2);
                n1.c cVarE10 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
                sVar2.W(5004770);
                objK2 = sVar2.K();
                if (objK2 == w0Var) {
                    objK2 = new f0.k(b1Var, 14);
                    sVar2.h0(objK2);
                }
                sVar2.p(false);
                a.a.h(cVarE9, cVarE10, z18, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
                boolean zBooleanValue5 = ((Boolean) b1Var.getValue()).booleanValue();
                sVar2.W(5004770);
                objK3 = sVar2.K();
                if (objK3 == w0Var) {
                    objK3 = new f0.k(b1Var, 15);
                    sVar2.h0(objK3);
                }
                sVar2.p(false);
                l8.n.a(zBooleanValue5, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
                sVar2 = sVar;
                j0 j0Var9 = (j0) b1Var2.getValue();
                sVar2.W(-1633490746);
                if ((i16 & 458752) == 131072) {
                }
                objK4 = sVar2.K();
                if (z12) {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                } else {
                    objK4 = new t(kVar, b1Var2, null, 0);
                    sVar2.h0(objK4);
                }
                sVar2.p(false);
                f1.b.f(sVar2, (h9.n) objK4, j0Var9);
                j0Var3 = j0Var2;
                z13 = z18;
            }
            w1VarR = sVar2.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.p
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k9.a.d(list, list2, j0Var3, i15, z13, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((196608 & i10) == 0) {
            if (sVar2.h(kVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((74899 & i12) == 74898) {
            sVar2.S();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    j0Var2 = null;
                }
                if (list2.size() > 6) {
                    i15 = 3;
                } else {
                    i15 = 1;
                }
                i16 = i12 & (-7169);
                if (i13 != 0) {
                    z11 = true;
                }
            } else {
                if (i18 != 0) {
                    j0Var2 = null;
                }
                if (list2.size() > 6) {
                    i15 = 3;
                } else {
                    i15 = 1;
                }
                i16 = i12 & (-7169);
                if (i13 != 0) {
                    z11 = true;
                }
            }
            boolean z19 = z11;
            sVar2.q();
            sVar2.W(1849434622);
            objK = sVar2.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar2.h0(objK);
            }
            b1Var = (b1) objK;
            objC = a2.f.C(sVar2, false, 1849434622);
            if (objC == w0Var) {
                if (j0Var2 == null) {
                    j0Var4 = (j0) p.k0(list2);
                } else {
                    j0Var4 = j0Var2;
                }
                objC = f1.b.s(j0Var4);
                sVar2.h0(objC);
            }
            b1Var2 = (b1) objC;
            sVar2.p(false);
            n1.c cVarE11 = h.e(-853372025, new a8.y(13, list), sVar2);
            n1.c cVarE12 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
            sVar2.W(5004770);
            objK2 = sVar2.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 14);
                sVar2.h0(objK2);
            }
            sVar2.p(false);
            a.a.h(cVarE11, cVarE12, z19, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
            boolean zBooleanValue6 = ((Boolean) b1Var.getValue()).booleanValue();
            sVar2.W(5004770);
            objK3 = sVar2.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 15);
                sVar2.h0(objK3);
            }
            sVar2.p(false);
            l8.n.a(zBooleanValue6, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
            sVar2 = sVar;
            j0 j0Var10 = (j0) b1Var2.getValue();
            sVar2.W(-1633490746);
            if ((i16 & 458752) == 131072) {
            }
            objK4 = sVar2.K();
            if (z12) {
                objK4 = new t(kVar, b1Var2, null, 0);
                sVar2.h0(objK4);
            } else {
                objK4 = new t(kVar, b1Var2, null, 0);
                sVar2.h0(objK4);
            }
            sVar2.p(false);
            f1.b.f(sVar2, (h9.n) objK4, j0Var10);
            j0Var3 = j0Var2;
            z13 = z19;
        } else {
            sVar2.S();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    j0Var2 = null;
                }
                if (list2.size() > 6) {
                    i15 = 3;
                } else {
                    i15 = 1;
                }
                i16 = i12 & (-7169);
                if (i13 != 0) {
                    z11 = true;
                }
            } else {
                if (i18 != 0) {
                    j0Var2 = null;
                }
                if (list2.size() > 6) {
                    i15 = 3;
                } else {
                    i15 = 1;
                }
                i16 = i12 & (-7169);
                if (i13 != 0) {
                    z11 = true;
                }
            }
            boolean z110 = z11;
            sVar2.q();
            sVar2.W(1849434622);
            objK = sVar2.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar2.h0(objK);
            }
            b1Var = (b1) objK;
            objC = a2.f.C(sVar2, false, 1849434622);
            if (objC == w0Var) {
                if (j0Var2 == null) {
                    j0Var4 = (j0) p.k0(list2);
                } else {
                    j0Var4 = j0Var2;
                }
                objC = f1.b.s(j0Var4);
                sVar2.h0(objC);
            }
            b1Var2 = (b1) objC;
            sVar2.p(false);
            n1.c cVarE13 = h.e(-853372025, new a8.y(13, list), sVar2);
            n1.c cVarE14 = h.e(-1555967864, new w(b1Var2, 29), sVar2);
            sVar2.W(5004770);
            objK2 = sVar2.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 14);
                sVar2.h0(objK2);
            }
            sVar2.p(false);
            a.a.h(cVarE13, cVarE14, z110, (h9.a) objK2, sVar2, ((i16 >> 6) & 896) | 3126, 0);
            boolean zBooleanValue7 = ((Boolean) b1Var.getValue()).booleanValue();
            sVar2.W(5004770);
            objK3 = sVar2.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 15);
                sVar2.h0(objK3);
            }
            sVar2.p(false);
            l8.n.a(zBooleanValue7, (h9.a) objK3, 0L, false, 0, null, null, null, null, h.e(-245613881, new l8.s(list2, i15, b1Var2, b1Var), sVar2), sVar, 48, 1020);
            sVar2 = sVar;
            j0 j0Var11 = (j0) b1Var2.getValue();
            sVar2.W(-1633490746);
            if ((i16 & 458752) == 131072) {
            }
            objK4 = sVar2.K();
            if (z12) {
                objK4 = new t(kVar, b1Var2, null, 0);
                sVar2.h0(objK4);
            } else {
                objK4 = new t(kVar, b1Var2, null, 0);
                sVar2.h0(objK4);
            }
            sVar2.p(false);
            f1.b.f(sVar2, (h9.n) objK4, j0Var11);
            j0Var3 = j0Var2;
            z13 = z110;
        }
        w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.p
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k9.a.d(list, list2, j0Var3, i15, z13, kVar, (f1.s) obj, f1.b.y(i10 | 1), i11);
                    return t8.z.f12851a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x015c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:108:0x0172  */
    /* JADX WARN: Code duplicated, block: B:111:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x017b  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x019e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01de  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0220  */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:0: B:132:0x01d8->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x014c  */
    public static final void e(final List list, final List list2, n0 n0Var, final boolean z10, final boolean z11, String str, final k kVar, s sVar, final int i7, final int i10) {
        final List list3;
        int i11;
        List list4;
        String str2;
        Object obj;
        n0 n0Var2;
        x xVar;
        Object objK0;
        int i12;
        n0 n0Var3;
        boolean z12;
        int i13;
        boolean zC;
        Object objK;
        n0 l0Var;
        int iA;
        boolean z13;
        Object objK2;
        String strB;
        Object objK3;
        s sVar2;
        final n0 n0Var4;
        Object obj2;
        w1 w1VarR;
        final String str3;
        w1 w1VarR2;
        int i14;
        n0 n0Var5 = n0Var;
        sVar.Y(-719258768);
        int i15 = 2;
        if ((i7 & 6) == 0) {
            list3 = list;
            i11 = (sVar.h(list3) ? 4 : 2) | i7;
        } else {
            list3 = list;
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            list4 = list2;
            i11 |= sVar.h(list4) ? 32 : 16;
        } else {
            list4 = list2;
        }
        int i16 = i10 & 4;
        if (i16 != 0) {
            i11 |= 384;
        } else if ((i7 & 384) == 0) {
            i11 |= (i7 & 512) == 0 ? sVar.f(n0Var5) : sVar.h(n0Var5) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i11 |= sVar.g(z10) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= sVar.g(z11) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        int i17 = i10 & 32;
        if (i17 == 0) {
            if ((196608 & i7) == 0) {
                str2 = str;
                i11 |= sVar.f(str2) ? 131072 : 65536;
            }
            if ((1572864 & i7) == 0) {
                if (sVar.h(kVar)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i11 |= i14;
            }
            if ((599187 & i11) == 599186 || !sVar.z()) {
                obj = null;
                if (i16 != 0) {
                    n0Var5 = null;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                if (!z10) {
                    w1VarR = sVar.r();
                    if (w1VarR != null) {
                        final n0 n0Var6 = n0Var5;
                        final int i18 = 0;
                        final List list5 = list4;
                        final String str4 = str2;
                        w1VarR.f5192d = new h9.n() { // from class: l8.q
                            @Override // h9.n
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i18) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        k9.a.e(list3, list5, n0Var6, z10, z11, str4, kVar, (f1.s) obj3, f1.b.y(i7 | 1), i10);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        k9.a.e(list3, list5, n0Var6, z10, z11, str4, kVar, (f1.s) obj3, f1.b.y(i7 | 1), i10);
                                        break;
                                }
                                return t8.z.f12851a;
                            }
                        };
                        return;
                    }
                    return;
                }
                n0Var2 = n0Var5;
                xVar = new x();
                objK0 = p.k0(list2);
                sVar.W(282074204);
                i12 = 0;
                if (str2 == null) {
                    l0Var = n0Var2;
                } else {
                    n0Var3 = ((j0) objK0).f8197b;
                    z12 = n0Var3 instanceof m0;
                    w0 w0Var = f1.n.f5051a;
                    i13 = 1;
                    if (z12) {
                        sVar.W(667549054);
                        t8.o oVar = n8.d.f8898a;
                        if (n0Var2 != null) {
                            strB = n0Var2.b();
                        } else {
                            strB = "";
                        }
                        l0Var = new m0(n8.d.d(str2, strB));
                        sVar.W(5004770);
                        i13 = (i11 & 458752) != 131072 ? 0 : 1;
                        objK3 = sVar.K();
                        if (i13 == 0 || objK3 == w0Var) {
                            objK3 = new r(i12, str2);
                            sVar.h0(objK3);
                        }
                        sVar.p(false);
                        xVar.f6688a = (k) objK3;
                        sVar.p(false);
                    } else if (n0Var3 instanceof l8.l0) {
                        sVar.W(667798542);
                        t8.o oVar2 = n8.d.f8898a;
                        if (n0Var2 != null) {
                            iA = n0Var2.a();
                        } else {
                            iA = 0;
                        }
                        l0Var = new l8.l0(n8.d.b(iA, str2));
                        sVar.W(5004770);
                        if ((i11 & 458752) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objK2 = sVar.K();
                        if (z13 || objK2 == w0Var) {
                            objK2 = new r(i13, str2);
                            sVar.h0(objK2);
                        }
                        sVar.p(false);
                        xVar.f6688a = (k) objK2;
                        sVar.p(false);
                    } else {
                        if (!(n0Var3 instanceof k0)) {
                            sVar.W(-394109878);
                            sVar.p(false);
                            throw new cc.s();
                        }
                        sVar.W(668037366);
                        t8.o oVar3 = n8.d.f8898a;
                        if (n0Var2 != null) {
                            zC = n0Var2.c();
                        } else {
                            zC = false;
                        }
                        k0 k0Var = new k0(n8.d.a(str2, zC));
                        sVar.W(5004770);
                        i13 = (i11 & 458752) != 131072 ? 0 : 1;
                        objK = sVar.K();
                        if (i13 == 0 || objK == w0Var) {
                            objK = new r(i15, str2);
                            sVar.h0(objK);
                        }
                        sVar.p(false);
                        xVar.f6688a = (k) objK;
                        sVar.p(false);
                        l0Var = k0Var;
                    }
                }
                sVar.p(false);
                if (l0Var != null) {
                    for (Object obj3 : list2) {
                        if (l.a(((j0) obj3).f8197b, l0Var)) {
                            obj = obj3;
                            break;
                        }
                    }
                    obj2 = (j0) obj;
                    if (obj2 == null) {
                        objK0 = (j0) p.k0(list2);
                    } else {
                        objK0 = obj2;
                    }
                }
                d(list, list2, (j0) objK0, 0, z11, new c8.p(14, kVar, xVar), sVar, i11 & 57470, 8);
                sVar2 = sVar;
                n0Var4 = n0Var2;
            } else {
                sVar.Q();
                n0Var4 = n0Var5;
                sVar2 = sVar;
            }
            str3 = str2;
            w1VarR2 = sVar2.r();
            if (w1VarR2 != null) {
                final int i19 = 1;
                w1VarR2.f5192d = new h9.n() { // from class: l8.q
                    @Override // h9.n
                    public final Object invoke(Object obj4, Object obj5) {
                        switch (i19) {
                            case 0:
                                ((Integer) obj5).getClass();
                                k9.a.e(list, list2, n0Var4, z10, z11, str3, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                break;
                            default:
                                ((Integer) obj5).getClass();
                                k9.a.e(list, list2, n0Var4, z10, z11, str3, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                break;
                        }
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i11 |= 196608;
        str2 = str;
        if ((1572864 & i7) == 0) {
            if (sVar.h(kVar)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((599187 & i11) == 599186) {
            obj = null;
            if (i16 != 0) {
                n0Var5 = null;
            }
            if (i17 != 0) {
                str2 = null;
            }
            if (!z10) {
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    final n0 n0Var7 = n0Var5;
                    final int i110 = 0;
                    final List list6 = list4;
                    final String str5 = str2;
                    w1VarR.f5192d = new h9.n() { // from class: l8.q
                        @Override // h9.n
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i110) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    k9.a.e(list3, list6, n0Var7, z10, z11, str5, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    k9.a.e(list3, list6, n0Var7, z10, z11, str5, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                    break;
                            }
                            return t8.z.f12851a;
                        }
                    };
                    return;
                }
                return;
            }
            n0Var2 = n0Var5;
            xVar = new x();
            objK0 = p.k0(list2);
            sVar.W(282074204);
            i12 = 0;
            if (str2 == null) {
                l0Var = n0Var2;
            } else {
                n0Var3 = ((j0) objK0).f8197b;
                z12 = n0Var3 instanceof m0;
                w0 w0Var2 = f1.n.f5051a;
                i13 = 1;
                if (z12) {
                    sVar.W(667549054);
                    t8.o oVar4 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        strB = n0Var2.b();
                    } else {
                        strB = "";
                    }
                    l0Var = new m0(n8.d.d(str2, strB));
                    sVar.W(5004770);
                    if ((i11 & 458752) != 131072) {
                    }
                    objK3 = sVar.K();
                    if (i13 == 0) {
                        objK3 = new r(i12, str2);
                        sVar.h0(objK3);
                    } else {
                        objK3 = new r(i12, str2);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK3;
                    sVar.p(false);
                } else if (n0Var3 instanceof l8.l0) {
                    sVar.W(667798542);
                    t8.o oVar5 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        iA = n0Var2.a();
                    } else {
                        iA = 0;
                    }
                    l0Var = new l8.l0(n8.d.b(iA, str2));
                    sVar.W(5004770);
                    if ((i11 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objK2 = sVar.K();
                    if (z13) {
                        objK2 = new r(i13, str2);
                        sVar.h0(objK2);
                    } else {
                        objK2 = new r(i13, str2);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK2;
                    sVar.p(false);
                } else {
                    if (!(n0Var3 instanceof k0)) {
                        sVar.W(-394109878);
                        sVar.p(false);
                        throw new cc.s();
                    }
                    sVar.W(668037366);
                    t8.o oVar6 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        zC = n0Var2.c();
                    } else {
                        zC = false;
                    }
                    k0 k0Var2 = new k0(n8.d.a(str2, zC));
                    sVar.W(5004770);
                    if ((i11 & 458752) != 131072) {
                    }
                    objK = sVar.K();
                    if (i13 == 0) {
                        objK = new r(i15, str2);
                        sVar.h0(objK);
                    } else {
                        objK = new r(i15, str2);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK;
                    sVar.p(false);
                    l0Var = k0Var2;
                }
            }
            sVar.p(false);
            if (l0Var != null) {
                while (r1.hasNext()) {
                    if (l.a(((j0) obj3).f8197b, l0Var)) {
                        obj = obj3;
                        break;
                    }
                }
                obj2 = (j0) obj;
                if (obj2 == null) {
                    objK0 = (j0) p.k0(list2);
                } else {
                    objK0 = obj2;
                }
            }
            d(list, list2, (j0) objK0, 0, z11, new c8.p(14, kVar, xVar), sVar, i11 & 57470, 8);
            sVar2 = sVar;
            n0Var4 = n0Var2;
        } else {
            obj = null;
            if (i16 != 0) {
                n0Var5 = null;
            }
            if (i17 != 0) {
                str2 = null;
            }
            if (!z10) {
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    final n0 n0Var8 = n0Var5;
                    final int i111 = 0;
                    final List list7 = list4;
                    final String str6 = str2;
                    w1VarR.f5192d = new h9.n() { // from class: l8.q
                        @Override // h9.n
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i111) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    k9.a.e(list3, list7, n0Var8, z10, z11, str6, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    k9.a.e(list3, list7, n0Var8, z10, z11, str6, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                                    break;
                            }
                            return t8.z.f12851a;
                        }
                    };
                    return;
                }
                return;
            }
            n0Var2 = n0Var5;
            xVar = new x();
            objK0 = p.k0(list2);
            sVar.W(282074204);
            i12 = 0;
            if (str2 == null) {
                l0Var = n0Var2;
            } else {
                n0Var3 = ((j0) objK0).f8197b;
                z12 = n0Var3 instanceof m0;
                w0 w0Var3 = f1.n.f5051a;
                i13 = 1;
                if (z12) {
                    sVar.W(667549054);
                    t8.o oVar7 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        strB = n0Var2.b();
                    } else {
                        strB = "";
                    }
                    l0Var = new m0(n8.d.d(str2, strB));
                    sVar.W(5004770);
                    if ((i11 & 458752) != 131072) {
                    }
                    objK3 = sVar.K();
                    if (i13 == 0) {
                        objK3 = new r(i12, str2);
                        sVar.h0(objK3);
                    } else {
                        objK3 = new r(i12, str2);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK3;
                    sVar.p(false);
                } else if (n0Var3 instanceof l8.l0) {
                    sVar.W(667798542);
                    t8.o oVar8 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        iA = n0Var2.a();
                    } else {
                        iA = 0;
                    }
                    l0Var = new l8.l0(n8.d.b(iA, str2));
                    sVar.W(5004770);
                    if ((i11 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objK2 = sVar.K();
                    if (z13) {
                        objK2 = new r(i13, str2);
                        sVar.h0(objK2);
                    } else {
                        objK2 = new r(i13, str2);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK2;
                    sVar.p(false);
                } else {
                    if (!(n0Var3 instanceof k0)) {
                        sVar.W(-394109878);
                        sVar.p(false);
                        throw new cc.s();
                    }
                    sVar.W(668037366);
                    t8.o oVar9 = n8.d.f8898a;
                    if (n0Var2 != null) {
                        zC = n0Var2.c();
                    } else {
                        zC = false;
                    }
                    k0 k0Var3 = new k0(n8.d.a(str2, zC));
                    sVar.W(5004770);
                    if ((i11 & 458752) != 131072) {
                    }
                    objK = sVar.K();
                    if (i13 == 0) {
                        objK = new r(i15, str2);
                        sVar.h0(objK);
                    } else {
                        objK = new r(i15, str2);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    xVar.f6688a = (k) objK;
                    sVar.p(false);
                    l0Var = k0Var3;
                }
            }
            sVar.p(false);
            if (l0Var != null) {
                while (r1.hasNext()) {
                    if (l.a(((j0) obj3).f8197b, l0Var)) {
                        obj = obj3;
                        break;
                    }
                }
                obj2 = (j0) obj;
                if (obj2 == null) {
                    objK0 = (j0) p.k0(list2);
                } else {
                    objK0 = obj2;
                }
            }
            d(list, list2, (j0) objK0, 0, z11, new c8.p(14, kVar, xVar), sVar, i11 & 57470, 8);
            sVar2 = sVar;
            n0Var4 = n0Var2;
        }
        str3 = str2;
        w1VarR2 = sVar2.r();
        if (w1VarR2 != null) {
            final int i112 = 1;
            w1VarR2.f5192d = new h9.n() { // from class: l8.q
                @Override // h9.n
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i112) {
                        case 0:
                            ((Integer) obj5).getClass();
                            k9.a.e(list, list2, n0Var4, z10, z11, str3, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            k9.a.e(list, list2, n0Var4, z10, z11, str3, kVar, (f1.s) obj4, f1.b.y(i7 | 1), i10);
                            break;
                    }
                    return t8.z.f12851a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0097, please report this as an issue */
    public static final void f(List list, List list2, j jVar, boolean z10, boolean z11, k kVar, s sVar, int i7, int i10) {
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        k kVar2;
        int i14;
        k kVar3;
        boolean z14;
        k kVar4;
        w1 w1VarR;
        sVar.Y(1028895875);
        if ((i7 & 6) == 0) {
            i11 = (sVar.h(list) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        int i15 = i11 | (sVar.h(list2) ? 32 : 16) | (sVar.f(jVar) ? 256 : 128);
        int i16 = i10 & 8;
        if (i16 != 0) {
            i12 = i15 | 3072;
            z12 = z10;
        } else {
            z12 = z10;
            i12 = i15 | (sVar.g(z12) ? 2048 : 1024);
        }
        int i17 = i10 & 16;
        if (i17 == 0) {
            if ((i7 & 24576) == 0) {
                z13 = z11;
                i12 |= sVar.g(z13) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            }
            i13 = i10 & 32;
            if (i13 != 0) {
                if ((196608 & i7) == 0) {
                    kVar2 = kVar;
                    if (sVar.h(kVar2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((74899 & i12) == 74898 || !sVar.z()) {
                    if (i16 != 0) {
                        z12 = true;
                    }
                    boolean z15 = i17 == 0 ? z13 : true;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    boolean z16 = z12;
                    boolean z17 = z15;
                    e(list, list2, (n0) jVar.f12831b, z16, z17, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
                    z12 = z16;
                    z14 = z17;
                    kVar4 = kVar3;
                } else {
                    sVar.Q();
                    z14 = z13;
                    kVar4 = kVar2;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new l8.o(list, list2, jVar, z12, z14, kVar4, i7, i10, 1);
                }
            }
            i12 |= 196608;
            kVar2 = kVar;
            if ((74899 & i12) == 74898) {
                if (i16 != 0) {
                    z12 = true;
                }
                if (i17 == 0) {
                }
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                boolean z18 = z12;
                boolean z19 = z15;
                e(list, list2, (n0) jVar.f12831b, z18, z19, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
                z12 = z18;
                z14 = z19;
                kVar4 = kVar3;
            } else {
                if (i16 != 0) {
                    z12 = true;
                }
                if (i17 == 0) {
                }
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                boolean z110 = z12;
                boolean z111 = z15;
                e(list, list2, (n0) jVar.f12831b, z110, z111, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
                z12 = z110;
                z14 = z111;
                kVar4 = kVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new l8.o(list, list2, jVar, z12, z14, kVar4, i7, i10, 1);
            }
        }
        i12 |= 24576;
        z13 = z11;
        i13 = i10 & 32;
        if (i13 != 0) {
            if ((196608 & i7) == 0) {
                kVar2 = kVar;
                if (sVar.h(kVar2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((74899 & i12) == 74898) {
                if (i16 != 0) {
                    z12 = true;
                }
                if (i17 == 0) {
                }
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                boolean z112 = z12;
                boolean z113 = z15;
                e(list, list2, (n0) jVar.f12831b, z112, z113, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
                z12 = z112;
                z14 = z113;
                kVar4 = kVar3;
            } else {
                if (i16 != 0) {
                    z12 = true;
                }
                if (i17 == 0) {
                }
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                boolean z114 = z12;
                boolean z115 = z15;
                e(list, list2, (n0) jVar.f12831b, z114, z115, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
                z12 = z114;
                z14 = z115;
                kVar4 = kVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new l8.o(list, list2, jVar, z12, z14, kVar4, i7, i10, 1);
            }
        }
        i12 |= 196608;
        kVar2 = kVar;
        if ((74899 & i12) == 74898) {
            if (i16 != 0) {
                z12 = true;
            }
            if (i17 == 0) {
            }
            if (i13 != 0) {
                kVar3 = null;
            } else {
                kVar3 = kVar2;
            }
            boolean z116 = z12;
            boolean z117 = z15;
            e(list, list2, (n0) jVar.f12831b, z116, z117, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
            z12 = z116;
            z14 = z117;
            kVar4 = kVar3;
        } else {
            if (i16 != 0) {
                z12 = true;
            }
            if (i17 == 0) {
            }
            if (i13 != 0) {
                kVar3 = null;
            } else {
                kVar3 = kVar2;
            }
            boolean z118 = z12;
            boolean z119 = z15;
            e(list, list2, (n0) jVar.f12831b, z118, z119, (String) jVar.f12830a, kVar3, sVar, (64638 & i12) | ((i12 << 3) & 3670016), 0);
            z12 = z118;
            z14 = z119;
            kVar4 = kVar3;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.o(list, list2, jVar, z12, z14, kVar4, i7, i10, 1);
        }
    }

    public static Object g(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void h(h0 h0Var, Object obj, Object obj2) {
        int iF = h0Var.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : h0Var.f12439c[iF];
        if (obj3 != null) {
            if (obj3 instanceof i0) {
                ((i0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                i0 i0Var = new i0();
                i0Var.a(obj3);
                i0Var.a(obj2);
                obj2 = i0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            h0Var.f12439c[iF] = obj2;
            return;
        }
        int i7 = ~iF;
        h0Var.f12438b[i7] = obj;
        h0Var.f12439c[i7] = obj2;
    }

    public static String i(n0 n0Var) {
        String str;
        m0 m0Var = n0Var instanceof m0 ? (m0) n0Var : null;
        return (m0Var == null || (str = m0Var.f8219a) == null) ? "" : str;
    }

    public static final Bundle j(j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (j jVar : jVarArr) {
            String str = (String) jVar.f12830a;
            Object obj = jVar.f12831b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                l.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void k(int i7, String str) {
        if (str.charAt(i7) == '-') {
            return;
        }
        StringBuilder sbT = ob.a.t("Expected '-' (hyphen) at index ", ", but was '", i7);
        sbT.append(str.charAt(i7));
        sbT.append('\'');
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, t8.h] */
    public static bb.f m(Class cls) {
        int i7 = 0;
        while (cls.isArray()) {
            i7++;
            cls = cls.getComponentType();
            l.d(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            wa.b bVarA = d.a(cls);
            String str = w9.d.f14177a;
            wa.c cVarA = bVarA.a();
            l.e(cVarA, "fqName");
            wa.b bVar = (wa.b) w9.d.f14184h.get(cVarA.f14240a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new bb.f(bVarA, i7);
        }
        if (cls.equals(Void.TYPE)) {
            wa.c cVarG = u9.n.f13171d.g();
            return new bb.f(new wa.b(cVarG.b(), cVarG.f14240a.f()), i7);
        }
        u9.k kVarD = eb.c.b(cls.getName()).d();
        l.d(kVarD, "getPrimitiveType(...)");
        if (i7 > 0) {
            wa.c cVar = (wa.c) kVarD.f13160d.getValue();
            l.e(cVar, "topLevelFqName");
            return new bb.f(new wa.b(cVar.b(), cVar.f14240a.f()), i7 - 1);
        }
        wa.c cVar2 = (wa.c) kVarD.f13159c.getValue();
        l.e(cVar2, "topLevelFqName");
        return new bb.f(new wa.b(cVar2.b(), cVar2.f14240a.f()), i7);
    }

    public static void n(ec.h hVar) {
        hVar.h(null, false);
    }

    public static h0 o() {
        long[] jArr = o0.f12476a;
        return new h0();
    }

    public static final ArrayList p(ArrayList arrayList, List list, x9.t tVar) {
        l.e(list, "oldValueParameters");
        arrayList.size();
        list.size();
        ArrayList<j> arrayListO0 = p.O0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayListO0, 10));
        for (j jVar : arrayListO0) {
            nb.w wVar = (nb.w) jVar.f12830a;
            y0 y0Var = (y0) jVar.f12831b;
            int i7 = y0Var.f471f;
            y9.h annotations = y0Var.getAnnotations();
            wa.e name = y0Var.getName();
            l.d(name, "getName(...)");
            boolean zD0 = y0Var.D0();
            boolean z10 = y0Var.f473h;
            boolean z11 = y0Var.f474i;
            nb.w wVarF = y0Var.f475j != null ? e.j(tVar).k().f(wVar) : null;
            x9.n0 source = y0Var.getSource();
            l.d(source, "getSource(...)");
            arrayList2.add(new y0(tVar, null, i7, annotations, name, wVar, zD0, z10, z11, wVarF, source));
        }
        return arrayList2;
    }

    public static final o r(g1 g1Var) {
        switch (g1Var == null ? -1 : y.f7090b[g1Var.ordinal()]) {
            case 1:
                o oVar = x9.o.f14720d;
                l.d(oVar, "INTERNAL");
                return oVar;
            case 2:
                o oVar2 = x9.o.f14717a;
                l.d(oVar2, "PRIVATE");
                return oVar2;
            case 3:
                o oVar3 = x9.o.f14718b;
                l.d(oVar3, "PRIVATE_TO_THIS");
                return oVar3;
            case 4:
                o oVar4 = x9.o.f14719c;
                l.d(oVar4, "PROTECTED");
                return oVar4;
            case 5:
                o oVar5 = x9.o.f14721e;
                l.d(oVar5, "PUBLIC");
                return oVar5;
            case 6:
                o oVar6 = x9.o.f14722f;
                l.d(oVar6, "LOCAL");
                return oVar6;
            default:
                o oVar7 = x9.o.f14717a;
                l.d(oVar7, "PRIVATE");
                return oVar7;
        }
    }

    public static String s(com.google.protobuf.l lVar) {
        StringBuilder sb2 = new StringBuilder(lVar.size());
        for (int i7 = 0; i7 < lVar.size(); i7++) {
            byte bC = lVar.c(i7);
            if (bC == 34) {
                sb2.append("\\\"");
            } else if (bC == 39) {
                sb2.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bC >>> 6) & 3) + 48));
                            sb2.append((char) (((bC >>> 3) & 7) + 48));
                            sb2.append((char) ((bC & 7) + 48));
                        } else {
                            sb2.append((char) bC);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final void t(long j5, byte[] bArr, int i7, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = zb.d.f15814a[(int) ((j5 >> (i12 << 3)) & 255)];
            int i15 = i7 + 1;
            bArr[i7] = (byte) (i14 >> 8);
            i7 += 2;
            bArr[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static final long u(long j5) {
        return n3.r.a(((int) (j5 >> 32)) * 0.5f, ((int) (j5 & 4294967295L)) * 0.5f);
    }

    public static final float v(Layout layout, int i7, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        c3.m mVar = c3.o.f2419a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment == null ? -1 : e3.d.f4283a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float w(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        c3.m mVar = c3.o.f2419a;
        if (layout.getEllipsisCount(i7) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i7) != -1 || layout.getWidth() >= layout.getLineRight(i7)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment != null ? e3.d.f4283a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final d0 x(x9.e eVar) {
        x9.e eVar2;
        l.e(eVar, "<this>");
        int i7 = e.f3900a;
        Iterator it = eVar.n().D0().m().iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            nb.w wVar = (nb.w) it.next();
            if (!i.y(wVar)) {
                x9.h hVarL = wVar.D0().l();
                if (za.d.n(hVarL, x9.f.f14701a) || za.d.n(hVarL, x9.f.f14703c)) {
                    l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar2 = (x9.e) hVarL;
                    break;
                }
            }
        }
        if (eVar2 == null) {
            return null;
        }
        gb.o oVarQ = eVar2.Q();
        d0 d0Var = oVarQ instanceof d0 ? (d0) oVarQ : null;
        return d0Var == null ? x(eVar2) : d0Var;
    }

    public static final Object z(mb.l lVar, o9.u uVar) {
        l.e(lVar, "<this>");
        l.e(uVar, "p");
        return lVar.invoke();
    }

    public abstract void C(int i7);

    public abstract void F(Throwable th);

    public abstract void G(da.a aVar);

    public abstract Object H(Intent intent, int i7);

    public void O(boolean z10) {
    }

    public void P(boolean z10) {
    }

    public abstract void S();

    public abstract void T(int i7);

    public abstract Intent q(p4.l lVar, Object obj);

    public f4.e y(p4.l lVar, Object obj) {
        return null;
    }
}
