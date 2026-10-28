package r2;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f11268a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(y2.m mVar) {
        return !mVar.k().f15011a.c(y2.r.f15058i);
    }

    public static final View b(View view, View view2, int i7) {
        int nextFocusForwardId;
        if (i7 != 1) {
            if (i7 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                r rVar = new r(nextFocusForwardId, 1);
                View view3 = null;
                while (true) {
                    View viewJ = j(view, rVar, view3);
                    if (viewJ != null || view == view2) {
                        return viewJ;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return null;
            }
        } else if (view.getId() != -1) {
            c1.a1 a1Var = new c1.a1(12, view2, view);
            View view5 = null;
            while (true) {
                View viewJ2 = j(view, a1Var, view5);
                if (viewJ2 != null || view == view2) {
                    return viewJ2;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final boolean c(y2.m mVar, Resources resources) {
        Object objG = mVar.f15020d.f15011a.g(y2.r.f15050a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !y2.p.e(mVar) && (mVar.f15020d.f15013c || (mVar.o() && ((list != null ? (String) u8.p.m0(list) : null) != null || m(mVar) != null || l(mVar, resources) != null || k(mVar))));
    }

    public static final void d(View view, ArrayList arrayList, boolean z10) {
        boolean z11 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z11) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z12 = viewGroup.getDescendantFocusability() == 131072;
        if (z11 && z12) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i7 = 0; i7 < childCount; i7++) {
                viewArr[i7] = viewGroup.getChildAt(i7);
            }
            s.d0 d0Var = r1.f11381a;
            boolean z13 = viewGroup.getLayoutDirection() == 1;
            b4.c cVar = r1.f11386f;
            s.d0 d0Var2 = r1.f11381a;
            s.h0 h0Var = r1.f11384d;
            if (childCount >= 2) {
                int i10 = childCount - d0Var2.f12408b;
                for (int i11 = 0; i11 < i10; i11++) {
                    d0Var2.a(new Rect());
                }
                for (int i12 = 0; i12 < childCount; i12++) {
                    View view2 = viewArr[i12];
                    int i13 = r1.f11382b;
                    r1.f11382b = i13 + 1;
                    Rect rect = (Rect) d0Var2.e(i13);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    h0Var.m(view2, rect);
                }
                u8.l.I0(viewArr, r1.f11385e);
                Object objG = h0Var.g(viewArr[0]);
                i9.l.b(objG);
                int iMax = ((Rect) objG).bottom;
                r1.f11383c = z13 ? -1 : 1;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    Object objG2 = h0Var.g(viewArr[i15]);
                    i9.l.b(objG2);
                    Rect rect2 = (Rect) objG2;
                    if (rect2.top >= iMax) {
                        if (i15 - i14 > 1) {
                            u8.l.J0(viewArr, cVar, i14, i15);
                        }
                        iMax = rect2.bottom;
                        i14 = i15;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                }
                if (childCount - i14 > 1) {
                    u8.l.J0(viewArr, cVar, i14, childCount);
                }
                r1.f11382b = 0;
                h0Var.a();
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                d(viewArr[i16], arrayList, z10);
            }
        }
        if (z11 && !z12 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void e(f4.f fVar, y2.m mVar) {
        y2.j jVar = mVar.f15020d;
        s.h0 h0Var = jVar.f15011a;
        Object objG = jVar.f15011a.g(y2.r.f15072x);
        if (objG == null) {
            objG = null;
        }
        y2.g gVar = (y2.g) objG;
        if (a(mVar)) {
            if (gVar != null && gVar.f14983a == 8) {
                return;
            }
            Object objG2 = h0Var.g(y2.i.f15008x);
            if (objG2 == null) {
                objG2 = null;
            }
            y2.a aVar = (y2.a) objG2;
            if (aVar != null) {
                fVar.a(new f4.d(null, R.id.accessibilityActionPageUp, aVar.f14969a, null));
            }
            Object objG3 = h0Var.g(y2.i.f15010z);
            if (objG3 == null) {
                objG3 = null;
            }
            y2.a aVar2 = (y2.a) objG3;
            if (aVar2 != null) {
                fVar.a(new f4.d(null, R.id.accessibilityActionPageDown, aVar2.f14969a, null));
            }
            Object objG4 = h0Var.g(y2.i.f15009y);
            if (objG4 == null) {
                objG4 = null;
            }
            y2.a aVar3 = (y2.a) objG4;
            if (aVar3 != null) {
                fVar.a(new f4.d(null, R.id.accessibilityActionPageLeft, aVar3.f14969a, null));
            }
            Object objG5 = h0Var.g(y2.i.A);
            if (objG5 == null) {
                objG5 = null;
            }
            y2.a aVar4 = (y2.a) objG5;
            if (aVar4 != null) {
                fVar.a(new f4.d(null, R.id.accessibilityActionPageRight, aVar4.f14969a, null));
            }
        }
    }

    public static final void f(f4.f fVar, y2.m mVar) {
        if (a(mVar)) {
            Object objG = mVar.f15020d.f15011a.g(y2.i.f14993h);
            if (objG == null) {
                objG = null;
            }
            y2.a aVar = (y2.a) objG;
            if (aVar != null) {
                fVar.a(new f4.d(null, R.id.accessibilityActionSetProgress, aVar.f14969a, null));
            }
        }
    }

    public static final boolean g(Object obj) {
        if (obj instanceof p1.n) {
            p1.n nVar = (p1.n) obj;
            if (nVar.a() == f1.w0.f5184c || nVar.a() == f1.w0.f5187f || nVar.a() == f1.w0.f5185d) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return g(value);
            }
        } else {
            if ((obj instanceof t8.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i7 = 0; i7 < 7; i7++) {
                if (f11268a[i7].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int h(float f10) {
        return ((int) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    public static final float i(float[] fArr, int i7, float[] fArr2, int i10) {
        int i11 = i7 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final View j(View view, h9.k kVar, View view2) {
        View viewJ;
        if (((Boolean) kVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != view2 && (viewJ = j(childAt, kVar, view2)) != null) {
                return viewJ;
            }
        }
        return null;
    }

    public static final boolean k(y2.m mVar) {
        Object objG = mVar.f15020d.f15011a.g(y2.r.I);
        if (objG == null) {
            objG = null;
        }
        a3.a aVar = (a3.a) objG;
        s.h0 h0Var = mVar.f15020d.f15011a;
        Object objG2 = h0Var.g(y2.r.f15072x);
        if (objG2 == null) {
            objG2 = null;
        }
        y2.g gVar = (y2.g) objG2;
        boolean z10 = aVar != null;
        Object objG3 = h0Var.g(y2.r.H);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (gVar != null && gVar.f14983a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String l(y2.m mVar, Resources resources) {
        int iM;
        y2.j jVar = mVar.f15020d;
        y2.j jVar2 = mVar.f15020d;
        Object objG = jVar.f15011a.g(y2.r.f15051b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        s.h0 h0Var = jVar2.f15011a;
        Object objG2 = h0Var.g(y2.r.I);
        if (objG2 == null) {
            objG2 = null;
        }
        a3.a aVar = (a3.a) objG2;
        Object objG3 = h0Var.g(y2.r.f15072x);
        if (objG3 == null) {
            objG3 = null;
        }
        y2.g gVar = (y2.g) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new cc.s();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.baidu.carlifevehicle.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f14983a == 2 && objG == null) {
                    objG = resources.getString(com.baidu.carlifevehicle.R.string.state_off);
                }
            } else if (gVar != null && gVar.f14983a == 2 && objG == null) {
                objG = resources.getString(com.baidu.carlifevehicle.R.string.state_on);
            }
        }
        Object objG4 = h0Var.g(y2.r.H);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f14983a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.baidu.carlifevehicle.R.string.selected) : resources.getString(com.baidu.carlifevehicle.R.string.not_selected);
            }
        }
        Object objG5 = h0Var.g(y2.r.f15052c);
        if (objG5 == null) {
            objG5 = null;
        }
        y2.f fVar = (y2.f) objG5;
        if (fVar != null) {
            if (fVar != y2.f.f14979d) {
                if (objG == null) {
                    n9.a aVar2 = fVar.f14981b;
                    float f10 = aVar2.f8964b;
                    float f11 = aVar2.f8963a;
                    float f12 = f10 - f11 == 0.0f ? 0.0f : (fVar.f14980a - f11) / (f10 - f11);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f12 == 0.0f) {
                        iM = 0;
                    } else {
                        iM = 100;
                        if (f12 != 1.0f) {
                            iM = n3.r.m(Math.round(f12 * 100), 1, 99);
                        }
                    }
                    objG = resources.getString(com.baidu.carlifevehicle.R.string.template_percent, Integer.valueOf(iM));
                }
            } else if (objG == null) {
                objG = resources.getString(com.baidu.carlifevehicle.R.string.in_progress);
            }
        }
        y2.u uVar = y2.r.E;
        if (h0Var.c(uVar)) {
            s.h0 h0Var2 = new y2.m(mVar.f15017a, true, mVar.f15019c, jVar2).k().f15011a;
            Object objG6 = h0Var2.g(y2.r.f15050a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = h0Var2.g(y2.r.A);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = h0Var2.g(uVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.baidu.carlifevehicle.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final b3.h m(y2.m mVar) {
        y2.j jVar = mVar.f15020d;
        y2.u uVar = y2.r.f15050a;
        b3.h hVar = (b3.h) y2.p.d(jVar, y2.r.E);
        List list = (List) y2.p.d(mVar.f15020d, y2.r.A);
        return hVar == null ? list != null ? (b3.h) u8.p.m0(list) : null : hVar;
    }

    public static boolean n() {
        try {
            if (u.O0 == null) {
                u.O0 = Class.forName("android.os.SystemProperties");
            }
            if (u.P0 == null) {
                Class cls = u.O0;
                u.P0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = u.P0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return i9.l.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final b3.o0 o(y2.j jVar) {
        h9.k kVar;
        ArrayList arrayList = new ArrayList();
        Object objG = jVar.f15011a.g(y2.i.f14986a);
        if (objG == null) {
            objG = null;
        }
        y2.a aVar = (y2.a) objG;
        if (aVar == null || (kVar = (h9.k) aVar.f14970b) == null || !((Boolean) kVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (b3.o0) arrayList.get(0);
    }

    public static final boolean p(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final boolean q(y1.h0 h0Var, float f10, float f11) {
        if (h0Var instanceof y1.c0) {
            x1.c cVar = ((y1.c0) h0Var).f14880e;
            return cVar.f14523a <= f10 && f10 < cVar.f14525c && cVar.f14524b <= f11 && f11 < cVar.f14526d;
        }
        if (!(h0Var instanceof y1.d0)) {
            if (h0Var instanceof y1.b0) {
                return r(((y1.b0) h0Var).f14878e, f10, f11);
            }
            throw new cc.s();
        }
        x1.d dVar = ((y1.d0) h0Var).f14882e;
        float f12 = dVar.f14527a;
        long j5 = dVar.f14532f;
        long j10 = dVar.f14534h;
        long j11 = dVar.f14533g;
        float f13 = dVar.f14530d;
        float f14 = dVar.f14528b;
        float f15 = dVar.f14529c;
        long j12 = dVar.f14531e;
        if (f10 < f12 || f10 >= f15 || f11 < f14 || f11 >= f13) {
            return false;
        }
        int i7 = (int) (j12 >> 32);
        int i10 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i10) + Float.intBitsToFloat(i7) <= dVar.b()) {
            int i11 = (int) (j10 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i11);
            int i12 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i12) + fIntBitsToFloat <= dVar.b()) {
                int i13 = (int) (j12 & 4294967295L);
                int i14 = (int) (j10 & 4294967295L);
                if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= dVar.a()) {
                    int i15 = (int) (j5 & 4294967295L);
                    int i16 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= dVar.a()) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) + f12;
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i13) + f14;
                        float fIntBitsToFloat4 = f15 - Float.intBitsToFloat(i10);
                        float fIntBitsToFloat5 = Float.intBitsToFloat(i15) + f14;
                        float fIntBitsToFloat6 = f15 - Float.intBitsToFloat(i12);
                        float fIntBitsToFloat7 = f13 - Float.intBitsToFloat(i16);
                        float fIntBitsToFloat8 = f13 - Float.intBitsToFloat(i14);
                        float fIntBitsToFloat9 = Float.intBitsToFloat(i11) + f12;
                        if (f10 < fIntBitsToFloat2 && f11 < fIntBitsToFloat3) {
                            return s(f10, f11, fIntBitsToFloat2, fIntBitsToFloat3, dVar.f14531e);
                        }
                        if (f10 < fIntBitsToFloat9 && f11 > fIntBitsToFloat8) {
                            return s(f10, f11, fIntBitsToFloat9, fIntBitsToFloat8, dVar.f14534h);
                        }
                        if (f10 > fIntBitsToFloat4 && f11 < fIntBitsToFloat5) {
                            return s(f10, f11, fIntBitsToFloat4, fIntBitsToFloat5, dVar.f14532f);
                        }
                        if (f10 <= fIntBitsToFloat6 || f11 <= fIntBitsToFloat7) {
                            return true;
                        }
                        return s(f10, f11, fIntBitsToFloat6, fIntBitsToFloat7, dVar.f14533g);
                    }
                }
            }
        }
        y1.h hVarA = y1.j.a();
        ob.a.i(hVarA, dVar);
        return r(hVarA, f10, f11);
    }

    public static final boolean r(y1.e0 e0Var, float f10, float f11) {
        float f12 = f10 - 0.005f;
        float f13 = f11 - 0.005f;
        float f14 = f10 + 0.005f;
        float f15 = f11 + 0.005f;
        y1.h hVarA = y1.j.a();
        if (Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15)) {
            y1.j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (hVarA.f14896b == null) {
            hVarA.f14896b = new RectF();
        }
        RectF rectF = hVarA.f14896b;
        i9.l.b(rectF);
        rectF.set(f12, f13, f14, f15);
        Path path = hVarA.f14895a;
        RectF rectF2 = hVarA.f14896b;
        i9.l.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        y1.h hVarA2 = y1.j.a();
        hVarA2.b(e0Var, hVarA, 1);
        boolean zIsEmpty = hVarA2.f14895a.isEmpty();
        hVarA2.c();
        hVarA.c();
        return !zIsEmpty;
    }

    public static final boolean s(float f10, float f11, float f12, float f13, long j5) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void t(float[] fArr, float[] fArr2) {
        float fI = i(fArr2, 0, fArr, 0);
        float fI2 = i(fArr2, 0, fArr, 1);
        float fI3 = i(fArr2, 0, fArr, 2);
        float fI4 = i(fArr2, 0, fArr, 3);
        float fI5 = i(fArr2, 1, fArr, 0);
        float fI6 = i(fArr2, 1, fArr, 1);
        float fI7 = i(fArr2, 1, fArr, 2);
        float fI8 = i(fArr2, 1, fArr, 3);
        float fI9 = i(fArr2, 2, fArr, 0);
        float fI10 = i(fArr2, 2, fArr, 1);
        float fI11 = i(fArr2, 2, fArr, 2);
        float fI12 = i(fArr2, 2, fArr, 3);
        float fI13 = i(fArr2, 3, fArr, 0);
        float fI14 = i(fArr2, 3, fArr, 1);
        float fI15 = i(fArr2, 3, fArr, 2);
        float fI16 = i(fArr2, 3, fArr, 3);
        fArr[0] = fI;
        fArr[1] = fI2;
        fArr[2] = fI3;
        fArr[3] = fI4;
        fArr[4] = fI5;
        fArr[5] = fI6;
        fArr[6] = fI7;
        fArr[7] = fI8;
        fArr[8] = fI9;
        fArr[9] = fI10;
        fArr[10] = fI11;
        fArr[11] = fI12;
        fArr[12] = fI13;
        fArr[13] = fI14;
        fArr[14] = fI15;
        fArr[15] = fI16;
    }

    public static final q3.i u(w0 w0Var, int i7) {
        Object next;
        Iterator<T> it = w0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((q2.h0) ((Map.Entry) next).getKey()).f10668b != i7);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (q3.i) entry.getValue();
        }
        return null;
    }

    public static final String v(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String w(int i7) {
        if (i7 == 0) {
            return "android.widget.Button";
        }
        if (i7 == 1) {
            return "android.widget.CheckBox";
        }
        if (i7 == 3) {
            return "android.widget.RadioButton";
        }
        if (i7 == 5) {
            return "android.widget.ImageView";
        }
        if (i7 == 6) {
            return "android.widget.Spinner";
        }
        if (i7 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void x(View view) {
        try {
            if (!s2.f11405u) {
                s2.f11405u = true;
                if (Build.VERSION.SDK_INT < 28) {
                    s2.f11403s = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    s2.f11404t = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    s2.f11403s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    s2.f11404t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = s2.f11403s;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = s2.f11404t;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = s2.f11404t;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = s2.f11403s;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            s2.f11406v = true;
        }
    }
}
