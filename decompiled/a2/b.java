package a2;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.support.v4.media.session.r;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import da.c0;
import da.z;
import e4.n;
import f1.t;
import f1.w2;
import f3.p;
import hc.s;
import i9.b0;
import i9.l;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import l0.o0;
import l0.r0;
import l4.q;
import l4.w;
import l4.x;
import n3.o;
import nb.a0;
import nb.f0;
import nb.k0;
import nb.n0;
import nb.s0;
import nb.u0;
import nb.w0;
import nb.x0;
import nb.y;
import o2.i0;
import o9.e0;
import org.xmlpull.v1.XmlPullParserException;
import p.u;
import q2.d1;
import q2.q1;
import q2.z1;
import r2.k1;
import r2.n2;
import s.d0;
import s.h0;
import s.v;
import u9.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f1.c, g4.i, i3.c, o1.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f10e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14d;

    public b(int i7) {
        this.f11a = i7;
        switch (i7) {
            case 10:
                this.f14d = new kb.d(21);
                break;
            case 13:
                this.f12b = new WeakHashMap();
                this.f13c = new WeakHashMap();
                this.f14d = new WeakHashMap();
                break;
            case 17:
                this.f12b = new AtomicReference(n1.h.f8714b);
                this.f13c = new Object();
                break;
            case 20:
                this.f12b = new o0(15);
                this.f13c = new o0(15);
                this.f14d = new o0(15);
                break;
            default:
                long[] jArr = s.o0.f12476a;
                this.f12b = new h0();
                break;
        }
    }

    public b(c cVar) {
        this.f11a = 0;
        this.f14d = cVar;
        this.f12b = new d(0, this);
    }

    public b(Context context, TypedArray typedArray) {
        this.f11a = 19;
        this.f12b = context;
        this.f13c = typedArray;
    }

    public b(Context context, LocationManager locationManager) {
        this.f11a = 11;
        this.f14d = new h0.a();
        this.f12b = context;
        this.f13c = locationManager;
    }

    public b(View view) {
        this.f11a = 7;
        this.f12b = view;
        this.f13c = t8.a.c(t8.i.f12828b, new b1.a(5, this));
        this.f14d = new d(view);
    }

    public b(da.a aVar, ja.f fVar) {
        this.f11a = 16;
        l.e(fVar, "typeParameterResolver");
        this.f12b = aVar;
        this.f13c = fVar;
        this.f14d = new r(new la.e());
    }

    public b(da.a aVar, kb.d dVar, l4.d dVar2, Set set) {
        this.f11a = 15;
        this.f12b = dVar;
        this.f13c = aVar;
        this.f14d = dVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            S(str, 0, str.length(), 1, true, new s(1, str));
        }
    }

    public b(p pVar, b bVar) {
        this.f11a = 12;
        this.f12b = pVar;
        this.f13c = bVar;
        this.f14d = pVar.f5270a;
    }

    public b(Object obj) {
        this.f11a = 6;
        this.f12b = new v();
        this.f13c = new d0();
        this.f14d = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7) {
        this.f11a = i7;
        this.f12b = obj;
        this.f13c = obj2;
        this.f14d = obj3;
    }

    public b(Runnable runnable) {
        this.f11a = 3;
        this.f13c = new CopyOnWriteArrayList();
        this.f14d = new HashMap();
        this.f12b = runnable;
    }

    public b(Matcher matcher, CharSequence charSequence) {
        this.f11a = 25;
        l.e(charSequence, "input");
        this.f12b = matcher;
        this.f13c = charSequence;
    }

    public b(n9.d dVar, List[] listArr, Method method) {
        this.f11a = 22;
        l.e(dVar, "argumentRange");
        this.f12b = dVar;
        this.f13c = listArr;
        this.f14d = method;
    }

    public b(pa.e eVar, ca.b bVar) {
        this.f11a = 2;
        this.f12b = eVar;
        this.f13c = bVar;
        this.f14d = new ConcurrentHashMap();
    }

    public b(q2.h0 h0Var) {
        this.f11a = 21;
        this.f12b = h0Var;
        this.f13c = new ArrayList();
        this.f14d = h0Var;
    }

    public b(n2 n2Var) {
        this.f11a = 14;
        this.f12b = n2Var;
    }

    public b(t5.a aVar) {
        this.f11a = 4;
        n nVar = new n(1);
        nVar.f4380b = 0;
        nVar.f4381c = 1;
        this.f13c = nVar;
        this.f14d = new StringBuilder();
        this.f12b = aVar;
    }

    public b(t5.b bVar) throws n5.f {
        int i7;
        int i10;
        this.f11a = 23;
        int i11 = bVar.f12762b;
        if (i11 < 8 || i11 > 144 || (i7 = i11 & 1) != 0) {
            throw n5.f.a();
        }
        int i12 = bVar.f12761a;
        x5.b[] bVarArr = x5.b.f14596h;
        if (i7 != 0 || (i12 & 1) != 0) {
            throw n5.f.a();
        }
        x5.b[] bVarArr2 = x5.b.f14596h;
        for (int i13 = 0; i13 < 30; i13++) {
            x5.b bVar2 = bVarArr2[i13];
            int i14 = bVar2.f14598b;
            if (i14 == i11 && (i10 = bVar2.f14599c) == i12) {
                this.f14d = bVar2;
                if (i11 != i14) {
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
                int i15 = bVar2.f14600d;
                int i16 = bVar2.f14601e;
                int i17 = i14 / i15;
                int i18 = i10 / i16;
                t5.b bVar3 = new t5.b(i18 * i16, i17 * i15);
                for (int i19 = 0; i19 < i17; i19++) {
                    int i20 = i19 * i15;
                    for (int i21 = 0; i21 < i18; i21++) {
                        int i22 = i21 * i16;
                        for (int i23 = 0; i23 < i15; i23++) {
                            int i24 = ((i15 + 2) * i19) + 1 + i23;
                            int i25 = i20 + i23;
                            for (int i26 = 0; i26 < i16; i26++) {
                                if (bVar.b(((i16 + 2) * i21) + 1 + i26, i24)) {
                                    bVar3.f(i22 + i26, i25);
                                }
                            }
                        }
                    }
                }
                this.f12b = bVar3;
                this.f13c = new t5.b(bVar3.f12761a, bVar3.f12762b);
                return;
            }
        }
        throw n5.f.a();
    }

    public b(x9.i iVar, List list, b bVar) {
        this.f11a = 24;
        l.e(iVar, "classifierDescriptor");
        l.e(list, "arguments");
        this.f12b = iVar;
        this.f13c = list;
        this.f14d = bVar;
    }

    public static b P(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new b(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    private final /* synthetic */ void Q() {
    }

    public static boolean w(Editable editable, KeyEvent keyEvent, boolean z10) {
        x[] xVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (x[]) editable.getSpans(selectionStart, selectionEnd, x.class)) != null && xVarArr.length > 0) {
                for (x xVar : xVarArr) {
                    int spanStart = editable.getSpanStart(xVar);
                    int spanEnd = editable.getSpanEnd(xVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int x(int i7, int i10, t5.a aVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (aVar.d(i7 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public ColorStateList A(int i7) {
        int resourceId;
        ColorStateList colorStateListX;
        TypedArray typedArray = (TypedArray) this.f13c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListX = e0.x((Context) this.f12b, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListX;
    }

    public Object B() {
        return this.f14d;
    }

    public n3.c C() {
        return ((c) this.f14d).f15a.f6a;
    }

    public Drawable D(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f13c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : e0.z((Context) this.f12b, resourceId);
    }

    public Drawable E(int i7) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f13c).hasValue(i7) || (resourceId = ((TypedArray) this.f13c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        u uVarA = u.a();
        Context context = (Context) this.f12b;
        synchronized (uVarA) {
            drawableG = uVarA.f9928a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface F(int i7, int i10, d3.e eVar) {
        int resourceId = ((TypedArray) this.f13c).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f14d) == null) {
                this.f14d = new TypedValue();
            }
            Context context = (Context) this.f12b;
            TypedValue typedValue = (TypedValue) this.f14d;
            ThreadLocal threadLocal = w3.l.f14122a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    eVar.a(-3);
                    return null;
                }
                int i11 = typedValue.assetCookie;
                s.s sVar = x3.e.f14571b;
                Typeface typeface = (Typeface) sVar.a(x3.e.b(resources, resourceId, string, i11, i10));
                int i12 = 6;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new c.n(i12, eVar, typeface));
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        w3.d dVarH = w3.b.h(resources.getXml(resourceId), resources);
                        if (dVarH != null) {
                            return x3.e.a(context, dVarH, resources, resourceId, string, typedValue.assetCookie, i10, eVar, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        eVar.a(-3);
                        return null;
                    }
                    int i13 = typedValue.assetCookie;
                    Typeface typefaceV = x3.e.f14570a.v(context, resources, resourceId, string, i10);
                    if (typefaceV != null) {
                        sVar.b(x3.e.b(resources, resourceId, string, i13, i10), typefaceV);
                    }
                    if (typefaceV != null) {
                        new Handler(Looper.getMainLooper()).post(new c.n(i12, eVar, typefaceV));
                    } else {
                        eVar.a(-3);
                    }
                    return typefaceV;
                } catch (IOException e7) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e7);
                    eVar.a(-3);
                    return null;
                } catch (XmlPullParserException e10) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e10);
                    eVar.a(-3);
                    return null;
                }
            }
        }
        return null;
    }

    public r0 G() {
        r0 r0Var = (r0) this.f13c;
        if (r0Var != null) {
            return r0Var;
        }
        l.j("keyboardActions");
        throw null;
    }

    public o H() {
        return ((c) this.f14d).f15a.f7b;
    }

    public n9.d I() {
        Matcher matcher = (Matcher) this.f12b;
        return n3.r.e0(matcher.start(), matcher.end());
    }

    public long J() {
        return ((c) this.f14d).f15a.f9d;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    public boolean K(CharSequence charSequence, int i7, int i10, w wVar) {
        boolean zG;
        if ((wVar.f8050c & 3) == 0) {
            l4.g gVar = (l4.g) this.f14d;
            m4.a aVarB = wVar.b();
            int iA = aVarB.a(8);
            short s2 = iA != 0 ? ((ByteBuffer) aVarB.f4320d).getShort(iA + aVarB.f4317a) : (short) 0;
            l4.d dVar = (l4.d) gVar;
            dVar.getClass();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 || s2 <= i11) {
                ThreadLocal threadLocal = l4.d.f7997b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = (StringBuilder) threadLocal.get();
                sb2.setLength(0);
                while (i7 < i10) {
                    sb2.append(charSequence.charAt(i7));
                    i7++;
                }
                TextPaint textPaint = dVar.f7998a;
                String string = sb2.toString();
                ThreadLocal threadLocal2 = x3.c.f14567a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zG = i4.b.g(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zG = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i12 = 0;
                                    while (i12 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i12)) + i12;
                                        fMeasureText4 += textPaint.measureText(string, i12, iCharCount);
                                        i12 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zG = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zG = true;
                            } else {
                                ThreadLocal threadLocal3 = x3.c.f14567a;
                                d4.b bVar = (d4.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new d4.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    bVar.f3765a.setEmpty();
                                    bVar.f3766b.setEmpty();
                                }
                                Rect rect = bVar.f3766b;
                                Rect rect2 = bVar.f3765a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect2);
                                textPaint.getTextBounds(string, 0, length, rect);
                                zG = !rect2.equals(rect);
                            }
                        } else {
                            zG = false;
                        }
                    }
                }
            } else {
                zG = false;
            }
            int i13 = wVar.f8050c & 4;
            wVar.f8050c = zG ? i13 | 2 : i13 | 1;
        }
        return (wVar.f8050c & 3) == 2;
    }

    public boolean L(int i7) {
        int i10;
        int i11 = i7 + 1;
        t5.a aVar = (t5.a) this.f12b;
        if (i11 > aVar.f12760b) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i10 = i12 + i7) < aVar.f12760b; i12++) {
            if (i12 == 2) {
                if (!aVar.d(i7 + 2)) {
                    return false;
                }
            } else if (aVar.d(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean M() {
        return !(((z1) ((o0) this.f12b).f7772b).isEmpty() && ((z1) ((o0) this.f14d).f7772b).isEmpty() && ((z1) ((o0) this.f13c).f7772b).isEmpty());
    }

    public boolean N() {
        if (((w2) this.f12b).getValue() != this.f14d) {
            return true;
        }
        b bVar = (b) this.f13c;
        return bVar != null && bVar.N();
    }

    public void O(Object obj) {
        c.l lVar = (c.l) this.f12b;
        LinkedHashMap linkedHashMap = lVar.f1746b;
        ArrayList arrayList = lVar.f1748d;
        String str = (String) this.f13c;
        Object obj2 = linkedHashMap.get(str);
        k9.a aVar = (k9.a) this.f14d;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            lVar.b(iIntValue, aVar, obj);
        } catch (Exception e7) {
            arrayList.remove(str);
            throw e7;
        }
    }

    public void R(b bVar, n1.i iVar) {
        Exception exc;
        v vVar = (v) this.f12b;
        int i7 = vVar.f12509b;
        d0 d0Var = (d0) this.f13c;
        d0 d0Var2 = new d0();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i7) {
            int i12 = i10 + 1;
            try {
                try {
                    switch (vVar.b(i10)) {
                        case 0:
                            bVar.k();
                            i10 = i12;
                            break;
                        case 1:
                            int i13 = i11 + 1;
                            bVar.c(d0Var.e(i11));
                            i11 = i13;
                            i10 = i12;
                            break;
                        case 2:
                            int i14 = i10 + 2;
                            i10 += 3;
                            bVar.g(vVar.b(i12), vVar.b(i14));
                            break;
                        case 3:
                            int i15 = i10 + 2;
                            try {
                                int i16 = i10 + 3;
                                try {
                                    i10 += 4;
                                    bVar.f(vVar.b(i12), vVar.b(i15), vVar.b(i16));
                                } catch (Exception e7) {
                                    exc = e7;
                                    i10 = i16;
                                    throw new f1.l(d0Var, d0Var2, vVar, i10, exc);
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                i10 = i15;
                            }
                            break;
                        case 4:
                            bVar.r();
                            i10 = i12;
                            break;
                        case 5:
                            i10 += 2;
                            int i17 = i11 + 1;
                            bVar.b(vVar.b(i12), d0Var.e(i11));
                            i11 = i17;
                            break;
                        case 6:
                            i10 += 2;
                            try {
                                vVar.b(i12);
                                int i18 = i11 + 1;
                                i11 = i18;
                            } catch (Exception e11) {
                                exc = e11;
                                throw new f1.l(d0Var, d0Var2, vVar, i10, exc);
                            }
                            break;
                        case 7:
                            int i19 = i11 + 1;
                            Object objE = d0Var.e(i11);
                            l.c(objE, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            b0.d(2, objE);
                            i11 += 2;
                            ((h9.n) objE).invoke(bVar.B(), d0Var.e(i19));
                            i10 = i12;
                            break;
                        case 8:
                            Object obj = bVar.f14d;
                            if (obj instanceof f1.j) {
                                f1.j jVar = (f1.j) obj;
                                if (iVar.f8720f.k(jVar)) {
                                    jVar.c();
                                }
                            }
                            d0Var2.a(obj);
                            bVar.d();
                            i10 = i12;
                            break;
                        default:
                            i10 = i12;
                            break;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    i10 = i12;
                }
            } catch (Throwable th) {
                bVar.m();
                throw th;
            }
        }
        if (i11 != d0Var.f12408b) {
            t.c("Applier operation size mismatch");
        }
        d0Var.c();
        vVar.f12509b = 0;
        bVar.m();
    }

    public Object S(CharSequence charSequence, int i7, int i10, int i11, boolean z10, l4.o oVar) {
        char c10;
        q qVar = new q((l4.t) ((da.a) this.f13c).f3849d);
        int i12 = i7;
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        int i13 = 0;
        boolean zR = true;
        int iCharCount = i12;
        while (iCharCount < i10 && i13 < i11 && zR) {
            SparseArray sparseArray = qVar.f8025c.f8041a;
            l4.t tVar = sparseArray == null ? null : (l4.t) sparseArray.get(iCodePointAt);
            if (qVar.f8023a == 2) {
                if (tVar != null) {
                    qVar.f8025c = tVar;
                    qVar.f8028f++;
                } else {
                    if (iCodePointAt == 65038) {
                        qVar.a();
                    } else if (iCodePointAt != 65039) {
                        l4.t tVar2 = qVar.f8025c;
                        if (tVar2.f8042b != null) {
                            if (qVar.f8028f != 1) {
                                qVar.f8026d = tVar2;
                                qVar.a();
                            } else if (qVar.b()) {
                                qVar.f8026d = qVar.f8025c;
                                qVar.a();
                            } else {
                                qVar.a();
                            }
                            c10 = 3;
                        } else {
                            qVar.a();
                        }
                    }
                    c10 = 1;
                }
                c10 = 2;
            } else if (tVar == null) {
                qVar.a();
                c10 = 1;
            } else {
                qVar.f8023a = 2;
                qVar.f8025c = tVar;
                qVar.f8028f = 1;
                c10 = 2;
            }
            qVar.f8027e = iCodePointAt;
            if (c10 == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                if (iCharCount < i10) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c10 == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i10) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c10 == 3) {
                if (z10 || !K(charSequence, i12, iCharCount, qVar.f8026d.f8042b)) {
                    zR = oVar.R(charSequence, i12, iCharCount, qVar.f8026d.f8042b);
                    i13++;
                }
            }
            i12 = iCharCount;
        }
        if (qVar.f8023a == 2 && qVar.f8025c.f8042b != null && ((qVar.f8028f > 1 || qVar.b()) && i13 < i11 && zR && (z10 || !K(charSequence, i12, iCharCount, qVar.f8025c.f8042b)))) {
            oVar.R(charSequence, i12, iCharCount, qVar.f8025c.f8042b);
        }
        return oVar.O();
    }

    public boolean T(int i7, int i10, int i11, int i12) {
        if (i7 < 0) {
            i7 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i7 += 4 - ((i12 + 4) & 7);
        }
        ((t5.b) this.f13c).f(i10, i7);
        return ((t5.b) this.f12b).b(i10, i7);
    }

    public int U(int i7, int i10, int i11, int i12) {
        int i13 = i7 - 2;
        int i14 = i10 - 2;
        int i15 = (T(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (T(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i7 - 1;
        if (T(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (T(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (T(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (T(i7, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (T(i7, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return T(i7, i10, i11, i12) ? i23 | 1 : i23;
    }

    public void V() {
        ((TypedArray) this.f13c).recycle();
    }

    public boolean W(int i7) {
        n2 n2Var;
        if (i7 == 7 || i7 == 2 || i7 == 6 || i7 == 5 || i7 == 3 || i7 == 4) {
            G();
        } else if (i7 != 1 && i7 != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (i7 == 6) {
            w1.i iVar = (w1.i) this.f14d;
            if (iVar != null) {
                ((w1.j) iVar).f(1);
                return true;
            }
            l.j("focusManager");
            throw null;
        }
        if (i7 != 5) {
            if (i7 != 7 || (n2Var = (n2) this.f12b) == null) {
                return false;
            }
            ((k1) n2Var).a();
            return true;
        }
        w1.i iVar2 = (w1.i) this.f14d;
        if (iVar2 != null) {
            ((w1.j) iVar2).f(2);
            return true;
        }
        l.j("focusManager");
        throw null;
    }

    public void X(Object obj) {
        long jB = n1.h.b();
        if (jB == n1.k.f8728a) {
            this.f14d = obj;
            return;
        }
        synchronized (this.f13c) {
            n1.j jVar = (n1.j) ((AtomicReference) this.f12b).get();
            int iA = jVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f12b).set(jVar.b(jB, obj));
            } else {
                jVar.f8727c[iA] = obj;
            }
        }
    }

    public void Y(y1.o oVar) {
        ((c) this.f14d).f15a.f8c = oVar;
    }

    public void Z(n3.c cVar) {
        ((c) this.f14d).f15a.f6a = cVar;
    }

    @Override // g4.i
    public ClipDescription a() {
        return (ClipDescription) this.f13c;
    }

    public void a0(o oVar) {
        ((c) this.f14d).f15a.f7b = oVar;
    }

    @Override // f1.c
    public void b(int i7, Object obj) {
        switch (this.f11a) {
            case 6:
                v vVar = (v) this.f12b;
                vVar.a(5);
                vVar.a(i7);
                ((d0) this.f13c).a(obj);
                break;
            default:
                ((q2.h0) this.f14d).B(i7, (q2.h0) obj);
                break;
        }
    }

    public void b0(long j5) {
        ((c) this.f14d).f15a.f9d = j5;
    }

    @Override // f1.c
    public void c(Object obj) {
        switch (this.f11a) {
            case 6:
                ((v) this.f12b).a(1);
                ((d0) this.f13c).a(obj);
                break;
            default:
                ((ArrayList) this.f13c).add(this.f14d);
                this.f14d = obj;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public w0 c0(da.i iVar, la.a aVar, boolean z10) {
        u9.k kVarD;
        da.a aVar2 = (da.a) this.f12b;
        ja.a aVar3 = (ja.a) aVar2.f3847b;
        l.e(iVar, "arrayType");
        boolean z11 = aVar.f8286d;
        da.b0 b0Var = iVar.f3874b;
        z zVar = b0Var instanceof z ? (z) b0Var : null;
        if (zVar != null) {
            Class cls = zVar.f3891a;
            if (l.a(cls, Void.TYPE)) {
                kVarD = null;
            } else {
                kVarD = eb.c.b(cls.getName()).d();
            }
        } else {
            kVarD = null;
        }
        ja.c cVar = new ja.c(aVar2, iVar, true);
        if (kVarD != null) {
            a0 a0VarR = aVar3.f6977o.k().r(kVarD);
            nb.w wVarH0 = n3.n.H0(a0VarR, new y9.i(new y9.h[]{a0VarR.getAnnotations(), cVar}));
            l.c(wVarH0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            a0 a0Var = (a0) wVarH0;
            return z11 ? a0Var : nb.c.e(a0Var, a0Var.H0(true));
        }
        nb.w wVarD0 = d0(b0Var, e0.R(s0.f9034b, z11, null, 6));
        x0 x0Var = x0.INVARIANT;
        x0 x0Var2 = x0.OUT_VARIANCE;
        if (!z11) {
            return nb.c.e(aVar3.f6977o.k().i(x0Var, wVarD0, cVar), aVar3.f6977o.k().i(x0Var2, wVarD0, cVar).H0(true));
        }
        if (z10) {
            x0Var = x0Var2;
        }
        return aVar3.f6977o.k().i(x0Var, wVarD0, cVar);
    }

    @Override // f1.c
    public void d() {
        s1.c cVar;
        switch (this.f11a) {
            case 6:
                ((v) this.f12b).a(8);
                break;
            default:
                q2.h0 h0Var = (q2.h0) this.f14d;
                d1 d1Var = h0Var.E;
                if (!h0Var.I()) {
                    n2.a.a("onReuse is only expected on attached node");
                }
                q3.q qVar = h0Var.f10679n;
                if (qVar != null) {
                    View view = qVar.f10897b;
                    if (view.getParent() != qVar) {
                        qVar.addView(view);
                    } else {
                        qVar.f10901f.invoke();
                    }
                }
                i0 i0Var = h0Var.G;
                if (i0Var != null) {
                    i0Var.f(false);
                }
                h0Var.f10684s = false;
                if (h0Var.P) {
                    h0Var.P = false;
                } else {
                    r1.o oVar = h0Var.E.f10616e;
                    for (r1.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.f11121e) {
                        if (oVar2.f11129n) {
                            oVar2.v0();
                        }
                    }
                    for (r1.o oVar3 = oVar; oVar3 != null; oVar3 = oVar3.f11121e) {
                        if (oVar3.f11129n) {
                            oVar3.x0();
                        }
                    }
                    while (oVar != null) {
                        if (oVar.f11129n) {
                            oVar.p0();
                        }
                        oVar = oVar.f11121e;
                    }
                }
                int i7 = h0Var.f10668b;
                h0Var.f10668b = y2.k.f15015a.addAndGet(1);
                q1 q1Var = h0Var.f10678m;
                if (q1Var != null) {
                    r2.u uVar = (r2.u) q1Var;
                    uVar.getLayoutNodes().g(i7);
                    uVar.getLayoutNodes().h(h0Var.f10668b, h0Var);
                }
                for (r1.o oVar4 = d1Var.f10617f; oVar4 != null; oVar4 = oVar4.f11122f) {
                    oVar4.o0();
                }
                d1Var.e();
                if (d1Var.d(8)) {
                    h0Var.G();
                }
                q2.h0.W(h0Var);
                q1 q1Var2 = h0Var.f10678m;
                if (q1Var2 != null) {
                    r2.u uVar2 = (r2.u) q1Var2;
                    if (r2.u.l() && (cVar = uVar2.F) != null) {
                        r2.u uVar3 = cVar.f12542c;
                        o0 o0Var = cVar.f12540a;
                        s.x xVar = cVar.f12547h;
                        if (xVar.e(i7)) {
                            o0Var.Z(uVar3, i7, false);
                        }
                        y2.j jVarX = h0Var.x();
                        if (jVarX != null && jVarX.f15011a.b(y2.r.f15065q)) {
                            xVar.a(h0Var.f10668b);
                            o0Var.Z(uVar3, h0Var.f10668b, true);
                        }
                    }
                    uVar2.getRectManager().f(h0Var, true);
                }
                break;
        }
    }

    public nb.w d0(na.d dVar, la.a aVar) {
        a0 a0VarS;
        ja.a aVar2 = (ja.a) ((da.a) this.f12b).f3847b;
        if (dVar instanceof z) {
            Class cls = ((z) dVar).f3891a;
            u9.k kVarD = l.a(cls, Void.TYPE) ? null : eb.c.b(cls.getName()).d();
            return kVarD != null ? aVar2.f6977o.k().t(kVarD) : aVar2.f6977o.k().x();
        }
        boolean z10 = false;
        if (!(dVar instanceof da.q)) {
            if (dVar instanceof da.i) {
                return c0((da.i) dVar, aVar, false);
            }
            if (dVar instanceof da.e0) {
                da.b0 b0VarC = ((da.e0) dVar).c();
                return b0VarC != null ? d0(b0VarC, aVar) : aVar2.f6977o.k().n();
            }
            if (dVar == null) {
                return aVar2.f6977o.k().n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        da.q qVar = (da.q) dVar;
        if (!aVar.f8286d && aVar.f8283a != s0.f9033a) {
            z10 = true;
        }
        Type type = qVar.f3883a;
        boolean zD = qVar.d();
        pb.k kVar = pb.k.UNRESOLVED_JAVA_CLASS;
        if (!zD && !z10) {
            a0 a0VarS2 = s(qVar, aVar, null);
            return a0VarS2 != null ? a0VarS2 : pb.l.c(kVar, type.toString());
        }
        a0 a0VarS3 = s(qVar, la.a.a(aVar, la.b.f8291c, false, null, null, 61), null);
        if (a0VarS3 != null && (a0VarS = s(qVar, la.a.a(aVar, la.b.f8290b, false, null, null, 61), a0VarS3)) != null) {
            return zD ? new la.h(a0VarS3, a0VarS) : nb.c.e(a0VarS3, a0VarS);
        }
        return pb.l.c(kVar, type.toString());
    }

    @Override // f1.c
    public void e(h9.n nVar, Object obj) {
        switch (this.f11a) {
            case 6:
                ((v) this.f12b).a(7);
                d0 d0Var = (d0) this.f13c;
                d0Var.a(nVar);
                d0Var.a(obj);
                break;
            default:
                nVar.invoke(B(), obj);
                break;
        }
    }

    public void e0() {
        Object parcelable;
        Integer num;
        switch (this.f11a) {
            case 5:
                c.l lVar = (c.l) this.f12b;
                String str = (String) this.f13c;
                Bundle bundle = lVar.f1751g;
                LinkedHashMap linkedHashMap = lVar.f1750f;
                l.e(str, "key");
                if (!lVar.f1748d.contains(str) && (num = (Integer) lVar.f1746b.remove(str)) != null) {
                    lVar.f1745a.remove(num);
                }
                lVar.f1749e.remove(str);
                if (linkedHashMap.containsKey(str)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                    linkedHashMap.remove(str);
                }
                if (bundle.containsKey(str)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = a4.a.b(str, bundle);
                    } else {
                        parcelable = bundle.getParcelable(str);
                        if (!f.a.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((f.a) parcelable));
                    bundle.remove(str);
                }
                if (lVar.f1747c.get(str) != null) {
                    throw new ClassCastException();
                }
                return;
            default:
                h0 h0Var = (h0) this.f12b;
                String str2 = (String) this.f13c;
                List list = (List) h0Var.k(str2);
                if (list != null) {
                    list.remove((h9.a) this.f14d);
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                h0Var.m(str2, list);
                return;
        }
    }

    @Override // f1.c
    public void f(int i7, int i10, int i11) {
        switch (this.f11a) {
            case 6:
                v vVar = (v) this.f12b;
                vVar.a(3);
                vVar.a(i7);
                vVar.a(i10);
                vVar.a(i11);
                break;
            default:
                ((q2.h0) this.f14d).M(i7, i10, i11);
                break;
        }
    }

    @Override // f1.c
    public void g(int i7, int i10) {
        switch (this.f11a) {
            case 6:
                v vVar = (v) this.f12b;
                vVar.a(2);
                vVar.a(i7);
                vVar.a(i10);
                break;
            default:
                ((q2.h0) this.f14d).Q(i7, i10);
                break;
        }
    }

    @Override // g4.i
    public Uri h() {
        return (Uri) this.f12b;
    }

    @Override // g4.i
    public void i() {
    }

    @Override // g4.i
    public Uri j() {
        return (Uri) this.f14d;
    }

    @Override // f1.c
    public void k() {
        switch (this.f11a) {
            case 6:
                ((v) this.f12b).a(0);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f13c;
                this.f14d = arrayList.remove(arrayList.size() - 1);
                break;
        }
    }

    @Override // f1.c
    public void l(int i7, Object obj) {
        switch (this.f11a) {
            case 6:
                v vVar = (v) this.f12b;
                vVar.a(6);
                vVar.a(i7);
                ((d0) this.f13c).a(obj);
                break;
            default:
                break;
        }
    }

    @Override // f1.c
    public void m() {
        switch (this.f11a) {
            case 6:
                break;
            default:
                q1 q1Var = ((q2.h0) this.f12b).f10678m;
                if (q1Var != null) {
                    ((r2.u) q1Var).B();
                }
                break;
        }
    }

    @Override // i3.c
    public i3.b n() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((kb.d) this.f14d)) {
            try {
                i3.b bVar = (i3.b) this.f13c;
                if (bVar != null && localeList == ((LocaleList) this.f12b)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(new i3.a(localeList.get(i7)));
                }
                i3.b bVar2 = new i3.b(arrayList);
                this.f12b = localeList;
                this.f13c = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g4.i
    public Object o() {
        return null;
    }

    @Override // i3.c
    public Locale p(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (l.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    public void q(q2.h0 h0Var, q2.u uVar) {
        o0 o0Var = (o0) this.f12b;
        o0 o0Var2 = (o0) this.f13c;
        o0 o0Var3 = (o0) this.f14d;
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            o0Var.U(h0Var);
            o0Var3.U(h0Var);
            return;
        }
        if (iOrdinal == 1) {
            o0Var2.U(h0Var);
            o0Var3.U(h0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (h0Var.f10673g != null) {
                o0Var3.U(h0Var);
                return;
            } else {
                o0Var.U(h0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new cc.s();
        }
        if (h0Var.f10673g != null) {
            o0Var3.U(h0Var);
        } else {
            o0Var2.U(h0Var);
        }
    }

    public void r() {
        ((ArrayList) this.f13c).clear();
        this.f14d = this.f12b;
        ((q2.h0) this.f12b).P();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [nb.k0] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, t8.h] */
    public a0 s(da.q qVar, la.a aVar, a0 a0Var) {
        nb.h0 h0VarB;
        a0 a0Var2;
        b bVar;
        k0 k0VarT;
        k0 k0Var;
        Iterator it;
        List list;
        n0 f0Var;
        Object next;
        List listJ0;
        b bVar2;
        k0 k0Var2;
        n0 n0VarA;
        x9.e eVarB;
        x0 x0VarI;
        da.q qVar2 = qVar;
        s0 s0Var = aVar.f8283a;
        la.b bVar3 = aVar.f8284b;
        boolean z10 = aVar.f8286d;
        da.a aVar2 = (da.a) this.f12b;
        ja.a aVar3 = (ja.a) aVar2.f3847b;
        if (a0Var == null || (h0VarB = a0Var.C0()) == null) {
            h0VarB = nb.c.B(new ja.c(aVar2, qVar2, false));
        }
        da.s sVar = qVar2.f3884b;
        if (sVar == null) {
            qVar2.getClass();
            throw new UnsupportedOperationException("Type not found: " + qVar2.f3883a);
        }
        boolean z11 = sVar instanceof da.o;
        x0 x0Var = x0.OUT_VARIANCE;
        s0 s0Var2 = s0.f9033a;
        la.b bVar4 = la.b.f8291c;
        nb.h0 h0Var = h0VarB;
        da.a aVar4 = aVar2;
        if (z11) {
            a0Var2 = null;
            da.o oVar = (da.o) sVar;
            wa.c cVarC = oVar.c();
            if (cVarC == null) {
                throw new AssertionError("Class type should have a FQ name: " + sVar);
            }
            if (z10 && cVarC.equals(la.d.f8298a)) {
                m mVar = aVar3.f6978p;
                u9.l lVar = mVar.f13165c;
                o9.u uVar = m.f13162e[0];
                lVar.getClass();
                l.e(uVar, "property");
                wa.e eVarE = wa.e.e(n3.l.p(uVar.getName()));
                x9.h hVarA = ((gb.o) mVar.f13164b.getValue()).a(eVarE, fa.b.f5503b);
                x9.e eVar = hVarA instanceof x9.e ? (x9.e) hVarA : null;
                eVarB = eVar == null ? mVar.f13163a.w(new wa.b(u9.o.f13205i, eVarE), n3.l.I(1)) : eVar;
            } else {
                eVarB = w9.e.b(cVarC, aVar3.f6977o.k());
                if (eVarB == null) {
                    eVarB = null;
                } else {
                    String str = w9.d.f14177a;
                    wa.d dVarG = za.d.g(eVarB);
                    HashMap map = w9.d.k;
                    if (map.containsKey(dVarG)) {
                        if (bVar3 == bVar4 || s0Var == s0Var2) {
                            eVarB = w9.e.a(eVarB);
                        } else {
                            na.d dVar = (na.d) u8.p.t0(qVar2.c());
                            da.e0 e0Var = dVar instanceof da.e0 ? (da.e0) dVar : null;
                            if (e0Var != null && e0Var.c() != null) {
                                Type[] upperBounds = e0Var.f3869a.getUpperBounds();
                                l.d(upperBounds, "getUpperBounds(...)");
                                if (l.a(u8.l.x0(upperBounds), Object.class)) {
                                    wa.d dVarG2 = za.d.g(eVarB);
                                    String str2 = w9.d.f14177a;
                                    wa.c cVar = (wa.c) map.get(dVarG2);
                                    if (cVar == null) {
                                        throw new IllegalArgumentException("Given class " + eVarB + " is not a read-only collection");
                                    }
                                    List listN = db.e.e(eVarB).j(cVar).t().n();
                                    l.d(listN, "getParameters(...)");
                                    x9.r0 r0Var = (x9.r0) u8.p.t0(listN);
                                    if (r0Var != null && (x0VarI = r0Var.I()) != null && x0VarI != x0Var) {
                                        eVarB = w9.e.a(eVarB);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (eVarB == null) {
                d dVar2 = aVar3.k;
                dVar2.getClass();
                d dVar3 = (d) dVar2.f20b;
                if (dVar3 == null) {
                    l.j("resolver");
                    throw null;
                }
                eVarB = dVar3.x(oVar);
            }
            if (eVarB == null || (k0VarT = eVarB.t()) == null) {
                qVar2.getClass();
                throw new UnsupportedOperationException("Type not found: " + qVar2.f3883a);
            }
            bVar = this;
        } else {
            a0Var2 = null;
            if (!(sVar instanceof c0)) {
                throw new IllegalStateException("Unknown classifier kind: " + sVar);
            }
            bVar = this;
            x9.r0 r0VarA = ((ja.f) bVar.f13c).a((c0) sVar);
            k0VarT = r0VarA != null ? r0VarA.t() : null;
        }
        if (k0VarT == null) {
            return a0Var2;
        }
        boolean z12 = (bVar3 == bVar4 || z10 || s0Var == s0Var2) ? false : true;
        if (l.a(a0Var != null ? a0Var.D0() : a0Var2, k0VarT) && !qVar2.d() && z12) {
            return a0Var.H0(true);
        }
        boolean z13 = true;
        if (!qVar2.d()) {
            if (qVar2.c().isEmpty()) {
                List listN2 = k0VarT.n();
                l.d(listN2, "getParameters(...)");
                if (listN2.isEmpty()) {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
        }
        List<x9.r0> listN3 = k0VarT.n();
        l.d(listN3, "getParameters(...)");
        if (z13) {
            ArrayList arrayList = new ArrayList(u8.q.a0(listN3, 10));
            for (x9.r0 r0Var2 : listN3) {
                if (n3.n.z0(r0Var2, a0Var2, aVar.f8287e)) {
                    n0VarA = u0.k(r0Var2, aVar);
                    k0Var2 = k0VarT;
                    bVar2 = bVar;
                } else {
                    k0 k0Var3 = k0VarT;
                    bVar2 = bVar;
                    k0Var2 = k0Var3;
                    n0VarA = la.e.a(r0Var2, la.a.a(aVar, null, qVar.d(), null, null, 59), (r) bVar2.f14d, new y(aVar3.f6964a, new la.c(bVar, r0Var2, aVar, k0Var3, qVar2)));
                }
                arrayList.add(n0VarA);
                qVar2 = qVar;
                k0VarT = k0Var2;
                bVar = bVar2;
                a0Var2 = null;
            }
            k0Var = k0VarT;
            listJ0 = arrayList;
        } else {
            k0Var = k0VarT;
            b bVar5 = bVar;
            if (listN3.size() != qVar.c().size()) {
                ArrayList arrayList2 = new ArrayList(u8.q.a0(listN3, 10));
                Iterator it2 = listN3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new f0(pb.l.c(pb.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((x9.r0) it2.next()).getName().b())));
                }
                listJ0 = u8.p.J0(arrayList2);
            } else {
                u8.n nVarN0 = u8.p.N0(qVar.c());
                ArrayList arrayList3 = new ArrayList(u8.q.a0(nVarN0, 10));
                Iterator it3 = nVarN0.iterator();
                while (true) {
                    u8.a0 a0Var3 = (u8.a0) it3;
                    if (a0Var3.f13099b.hasNext()) {
                        u8.z zVar = (u8.z) a0Var3.next();
                        int i7 = zVar.f13125a;
                        na.d dVar4 = (na.d) zVar.f13126b;
                        listN3.size();
                        x9.r0 r0Var3 = (x9.r0) listN3.get(i7);
                        s0 s0Var3 = s0.f9034b;
                        la.a aVarR = e0.R(s0Var3, false, null, 7);
                        l.b(r0Var3);
                        boolean z14 = dVar4 instanceof da.e0;
                        x0 x0Var2 = x0.INVARIANT;
                        if (z14) {
                            da.e0 e0Var2 = (da.e0) dVar4;
                            da.b0 b0VarC = e0Var2.c();
                            Type[] upperBounds2 = e0Var2.f3869a.getUpperBounds();
                            l.d(upperBounds2, "getUpperBounds(...)");
                            x0 x0Var3 = !l.a(u8.l.x0(upperBounds2), Object.class) ? x0Var : x0.IN_VARIANCE;
                            it = it3;
                            if (b0VarC == null || !(r0Var3.I() == x0Var2 || x0Var3 == r0Var3.I())) {
                                list = listN3;
                                da.a aVar5 = aVar4;
                                f0Var = u0.k(r0Var3, aVarR);
                                aVar4 = aVar5;
                            } else {
                                if (e0Var2.c() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                da.a aVar6 = aVar4;
                                Iterator it4 = new ja.c(aVar6, e0Var2, false).iterator();
                                while (true) {
                                    yb.g gVar = (yb.g) it4;
                                    if (!gVar.hasNext()) {
                                        list = listN3;
                                        next = null;
                                        break;
                                    }
                                    next = gVar.next();
                                    y9.b bVar6 = (y9.b) next;
                                    Iterator it5 = it4;
                                    wa.c[] cVarArr = ga.r.f6108b;
                                    list = listN3;
                                    int length = cVarArr.length;
                                    int i10 = 0;
                                    while (i10 < length) {
                                        int i11 = i10;
                                        int i12 = length;
                                        if (l.a(bVar6.a(), cVarArr[i11])) {
                                            break;
                                        }
                                        i10 = i11 + 1;
                                        length = i12;
                                    }
                                    it4 = it5;
                                    listN3 = list;
                                }
                                y9.b bVar7 = (y9.b) next;
                                int i13 = 0;
                                nb.w wVarD0 = bVar5.d0(b0VarC, e0.R(s0Var3, false, null, 7));
                                if (bVar7 != null) {
                                    ArrayList arrayListW0 = u8.p.w0(wVarD0.getAnnotations(), bVar7);
                                    wVarD0 = n3.n.H0(wVarD0, arrayListW0.isEmpty() ? y9.g.f15129a : new y9.i(i13, arrayListW0));
                                }
                                f0Var = n3.n.b0(wVarD0, x0Var3, r0Var3);
                                aVar4 = aVar6;
                            }
                        } else {
                            it = it3;
                            list = listN3;
                            f0Var = new f0(bVar5.d0(dVar4, aVarR), x0Var2);
                        }
                        arrayList3.add(f0Var);
                        it3 = it;
                        listN3 = list;
                    } else {
                        listJ0 = u8.p.J0(arrayList3);
                    }
                }
            }
        }
        return nb.c.t(listJ0, h0Var, k0Var, z12);
    }

    public boolean t(q2.h0 h0Var) {
        return !(h0Var.f10673g == null) && (((z1) ((o0) this.f12b).f7772b).contains(h0Var) || ((z1) ((o0) this.f13c).f7772b).contains(h0Var));
    }

    public String u(StringBuilder sb2, int i7) throws n5.f {
        String str = null;
        while (true) {
            e6.j jVarV = v(i7, str);
            String strA = e6.m.a(jVarV.f4445b);
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = jVarV.f4447d ? String.valueOf(jVarV.f4446c) : null;
            int i10 = jVarV.f4450a;
            if (i7 == i10) {
                return sb2.toString();
            }
            i7 = i10;
            str = strValueOf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x022f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0237  */
    /* JADX WARN: Code duplicated, block: B:142:0x023c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0342  */
    /* JADX WARN: Code duplicated, block: B:210:0x0344  */
    /* JADX WARN: Code duplicated, block: B:213:0x0349 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0351  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    public e6.j v(int i7, String str) throws n5.f {
        boolean zD;
        boolean z10;
        e6.h hVar;
        boolean z11;
        e6.k kVar;
        int i10;
        int i11;
        int i12;
        int iX;
        int iX2;
        int iX3;
        char c10;
        e6.i iVar;
        e6.i iVar2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int iX4;
        int iX5;
        char c11;
        e6.i iVar3;
        e6.i iVar4;
        t5.a aVar = (t5.a) this.f12b;
        n nVar = (n) this.f13c;
        StringBuilder sb2 = (StringBuilder) this.f14d;
        sb2.setLength(0);
        if (str != null) {
            sb2.append(str);
        }
        nVar.f4380b = i7;
        do {
            int i17 = nVar.f4380b;
            int i18 = nVar.f4381c;
            int i19 = 16;
            if (i18 != 2) {
                if (i18 == 3) {
                    while (true) {
                        int i20 = nVar.f4380b;
                        if (i20 + 5 <= aVar.f12760b && (((iX = x(i20, 5, aVar)) >= 5 && iX < i19) || (i20 + 7 <= aVar.f12760b && (((iX2 = x(i20, 7, aVar)) >= 64 && iX2 < 116) || (i20 + 8 <= aVar.f12760b && (iX3 = x(i20, 8, aVar)) >= 232 && iX3 < 253))))) {
                            int i21 = nVar.f4380b;
                            int iX6 = x(i21, 5, aVar);
                            if (iX6 == 15) {
                                iVar2 = new e6.i('$', i21 + 5);
                            } else {
                                if (iX6 < 5 || iX6 >= 15) {
                                    int iX7 = x(i21, 7, aVar);
                                    if (iX7 >= 64 && iX7 < 90) {
                                        iVar = new e6.i((char) (iX7 + 1), i21 + 7);
                                    } else if (iX7 < 90 || iX7 >= 116) {
                                        switch (x(i21, 8, aVar)) {
                                            case 232:
                                                c10 = '!';
                                                break;
                                            case 233:
                                                c10 = '\"';
                                                break;
                                            case 234:
                                                c10 = '%';
                                                break;
                                            case 235:
                                                c10 = '&';
                                                break;
                                            case 236:
                                                c10 = '\'';
                                                break;
                                            case 237:
                                                c10 = '(';
                                                break;
                                            case 238:
                                                c10 = ')';
                                                break;
                                            case 239:
                                                c10 = '*';
                                                break;
                                            case 240:
                                                c10 = '+';
                                                break;
                                            case 241:
                                                c10 = ',';
                                                break;
                                            case 242:
                                                c10 = '-';
                                                break;
                                            case 243:
                                                c10 = '.';
                                                break;
                                            case 244:
                                                c10 = '/';
                                                break;
                                            case 245:
                                                c10 = ':';
                                                break;
                                            case 246:
                                                c10 = ';';
                                                break;
                                            case 247:
                                                c10 = '<';
                                                break;
                                            case 248:
                                                c10 = '=';
                                                break;
                                            case 249:
                                                c10 = '>';
                                                break;
                                            case 250:
                                                c10 = '?';
                                                break;
                                            case 251:
                                                c10 = '_';
                                                break;
                                            case 252:
                                                c10 = ' ';
                                                break;
                                            default:
                                                throw n5.f.a();
                                        }
                                        iVar = new e6.i(c10, i21 + 8);
                                    } else {
                                        iVar = new e6.i((char) (iX7 + 7), i21 + 7);
                                    }
                                } else {
                                    iVar = new e6.i((char) (iX6 + 43), i21 + 5);
                                }
                                iVar2 = iVar;
                            }
                            int i22 = iVar2.f4450a;
                            nVar.f4380b = i22;
                            char c12 = iVar2.f4444b;
                            if (c12 == '$') {
                                hVar = new e6.h(new e6.j(i22, sb2.toString()), 0, true);
                            } else {
                                sb2.append(c12);
                                i19 = 16;
                            }
                        } else {
                            int i23 = nVar.f4380b;
                            int i24 = i23 + 3;
                            if (i24 <= aVar.f12760b) {
                                while (true) {
                                    if (i23 >= i24) {
                                        nVar.f4380b += 3;
                                        nVar.f4381c = 1;
                                    } else if (!aVar.d(i23)) {
                                        i23++;
                                    } else if (L(nVar.f4380b)) {
                                        i10 = nVar.f4380b;
                                        i11 = i10 + 5;
                                        i12 = aVar.f12760b;
                                        if (i11 < i12) {
                                            nVar.f4380b = i10 + 5;
                                        } else {
                                            nVar.f4380b = i12;
                                        }
                                        nVar.f4381c = 2;
                                    }
                                }
                            } else if (L(nVar.f4380b)) {
                                i10 = nVar.f4380b;
                                i11 = i10 + 5;
                                i12 = aVar.f12760b;
                                if (i11 < i12) {
                                    nVar.f4380b = i10 + 5;
                                } else {
                                    nVar.f4380b = i12;
                                }
                                nVar.f4381c = 2;
                            }
                            hVar = new e6.h(null, 0, false);
                        }
                    }
                    z11 = hVar.f4442b;
                } else {
                    while (true) {
                        int i25 = nVar.f4380b;
                        int i26 = i25 + 7;
                        int i27 = aVar.f12760b;
                        if (i26 > i27) {
                            zD = i25 + 4 <= i27;
                        } else {
                            int i28 = i25;
                            while (true) {
                                int i29 = i25 + 3;
                                if (i28 >= i29) {
                                    zD = aVar.d(i29);
                                } else if (!aVar.d(i28)) {
                                    i28++;
                                }
                            }
                        }
                        if (zD) {
                            int i30 = nVar.f4380b;
                            int i31 = i30 + 7;
                            if (i31 > aVar.f12760b) {
                                int iX8 = x(i30, 4, aVar);
                                kVar = iX8 == 0 ? new e6.k(aVar.f12760b, 10, 10) : new e6.k(aVar.f12760b, iX8 - 1, 10);
                            } else {
                                int iX9 = x(i30, 7, aVar) - 8;
                                kVar = new e6.k(i31, iX9 / 11, iX9 % 11);
                            }
                            int i32 = kVar.f4450a;
                            nVar.f4380b = i32;
                            int i33 = kVar.f4448b;
                            boolean z13 = i33 == 10;
                            int i34 = kVar.f4449c;
                            if (z13) {
                                hVar = new e6.h(i34 == 10 ? new e6.j(i32, sb2.toString()) : new e6.j(sb2.toString(), i32, i34), 0, true);
                            } else {
                                sb2.append(i33);
                                if (i34 == 10) {
                                    hVar = new e6.h(new e6.j(nVar.f4380b, sb2.toString()), 0, true);
                                } else {
                                    sb2.append(i34);
                                }
                            }
                        } else {
                            int i35 = nVar.f4380b;
                            if (i35 + 1 > aVar.f12760b) {
                                z10 = false;
                            } else {
                                int i36 = 0;
                                while (true) {
                                    if (i36 < 4) {
                                        int i37 = i36 + i35;
                                        if (i37 < aVar.f12760b) {
                                            if (aVar.d(i37)) {
                                                z10 = false;
                                            } else {
                                                i36++;
                                            }
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                nVar.f4381c = 2;
                                nVar.f4380b += 4;
                            }
                            hVar = new e6.h(null, 0, false);
                        }
                    }
                    z11 = hVar.f4442b;
                }
                i13 = nVar.f4380b;
                if (i17 != i13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 || z11) {
                }
                e6.j jVar = (e6.j) hVar.f4443c;
                return (jVar == null && jVar.f4447d) ? new e6.j(sb2.toString(), i13, jVar.f4446c) : new e6.j(i13, sb2.toString());
            }
            while (true) {
                int i38 = nVar.f4380b;
                if (i38 + 5 <= aVar.f12760b && (((iX4 = x(i38, 5, aVar)) >= 5 && iX4 < 16) || (i38 + 6 <= aVar.f12760b && (iX5 = x(i38, 6, aVar)) >= 16 && iX5 < 63))) {
                    int i39 = nVar.f4380b;
                    int iX10 = x(i39, 5, aVar);
                    if (iX10 == 15) {
                        iVar4 = new e6.i('$', i39 + 5);
                    } else {
                        if (iX10 < 5 || iX10 >= 15) {
                            int iX11 = x(i39, 6, aVar);
                            if (iX11 < 32 || iX11 >= 58) {
                                switch (iX11) {
                                    case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                                        c11 = '*';
                                        break;
                                    case 59:
                                        c11 = ',';
                                        break;
                                    case 60:
                                        c11 = '-';
                                        break;
                                    case 61:
                                        c11 = '.';
                                        break;
                                    case 62:
                                        c11 = '/';
                                        break;
                                    default:
                                        throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iX11)));
                                }
                                iVar3 = new e6.i(c11, i39 + 6);
                            } else {
                                iVar3 = new e6.i((char) (iX11 + 33), i39 + 6);
                            }
                        } else {
                            iVar3 = new e6.i((char) (iX10 + 43), i39 + 5);
                        }
                        iVar4 = iVar3;
                    }
                    int i40 = iVar4.f4450a;
                    nVar.f4380b = i40;
                    char c13 = iVar4.f4444b;
                    if (c13 == '$') {
                        hVar = new e6.h(new e6.j(i40, sb2.toString()), 0, true);
                    } else {
                        sb2.append(c13);
                    }
                } else {
                    int i41 = nVar.f4380b;
                    int i42 = i41 + 3;
                    if (i42 <= aVar.f12760b) {
                        while (true) {
                            if (i41 >= i42) {
                                nVar.f4380b += 3;
                                nVar.f4381c = 1;
                            } else if (!aVar.d(i41)) {
                                i41++;
                            } else if (L(nVar.f4380b)) {
                                i14 = nVar.f4380b;
                                i15 = i14 + 5;
                                i16 = aVar.f12760b;
                                if (i15 < i16) {
                                    nVar.f4380b = i14 + 5;
                                } else {
                                    nVar.f4380b = i16;
                                }
                                nVar.f4381c = 3;
                            }
                        }
                    } else if (L(nVar.f4380b)) {
                        i14 = nVar.f4380b;
                        i15 = i14 + 5;
                        i16 = aVar.f12760b;
                        if (i15 < i16) {
                            nVar.f4380b = i14 + 5;
                        } else {
                            nVar.f4380b = i16;
                        }
                        nVar.f4381c = 3;
                    }
                    hVar = new e6.h(null, 0, false);
                }
            }
            z11 = hVar.f4442b;
            i13 = nVar.f4380b;
            if (i17 != i13) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
            }
            e6.j jVar2 = (e6.j) hVar.f4443c;
            if (jVar2 == null) {
            }
        } while (!z11);
        e6.j jVar3 = (e6.j) hVar.f4443c;
        if (jVar3 == null) {
        }
    }

    public Object y() {
        long jB = n1.h.b();
        if (jB == n1.k.f8728a) {
            return this.f14d;
        }
        n1.j jVar = (n1.j) ((AtomicReference) this.f12b).get();
        int iA = jVar.a(jB);
        if (iA >= 0) {
            return jVar.f8727c[iA];
        }
        return null;
    }

    public y1.o z() {
        return ((c) this.f14d).f15a.f8c;
    }
}
