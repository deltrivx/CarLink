package kb;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import c.p;
import com.muyetuge.carlifevehicle.service.BaseService;
import e4.s;
import f3.m;
import i9.l;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import l4.x;
import mb.k;
import n3.u;
import s.h0;
import s.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class d implements q0, s, i3.c, o6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f7500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Constructor f7502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f7503e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7504a;

    public d() {
        this.f7504a = 16;
        new s.s(16);
        long[] jArr = o0.f12476a;
        new h0();
    }

    public /* synthetic */ d(int i7) {
        this.f7504a = i7;
    }

    public d(k kVar) {
        this.f7504a = 19;
        String str = k.f8626d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static Typeface d(String str, f3.k kVar, int i7) {
        if (i7 == 0 && l.a(kVar, f3.k.f5258c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f5261a, i7 == 1);
    }

    public static Typeface e(String str, f3.k kVar, int i7) {
        if (i7 == 0 && l.a(kVar, f3.k.f5258c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iF = g5.a.F(kVar, i7);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iF) : Typeface.create(str, iF);
    }

    public static boolean i(n4.b bVar, Editable editable, int i7, int i10, boolean z10) {
        int iMin;
        if (editable != null && i7 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i7, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i10, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i7, 0);
                    iMin = Math.min(selectionEnd + i10, editable.length());
                }
                x[] xVarArr = (x[]) editable.getSpans(selectionStart, iMin, x.class);
                if (xVarArr != null && xVarArr.length > 0) {
                    for (x xVar : xVarArr) {
                        int spanStart = editable.getSpanStart(xVar);
                        int spanEnd = editable.getSpanEnd(xVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static String k(int i7) {
        Object next;
        b9.b bVar = b8.a.f1561e;
        bVar.getClass();
        i9.b bVar2 = new i9.b(6, bVar);
        do {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
        } while (((b8.a) next).f1563b != i7);
        b8.a aVar = (b8.a) next;
        return aVar != null ? aVar.f1562a : "未知动作";
    }

    public static InputStream l(String str) {
        l.e(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }

    @Override // androidx.lifecycle.q0
    public androidx.lifecycle.o0 a(Class cls) {
        switch (this.f7504a) {
            case 1:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return u.w(cls);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public StaticLayout b(c3.k kVar) {
        char c10;
        Constructor constructor;
        switch (this.f7504a) {
            case 10:
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(kVar.f2386a, 0, kVar.f2387b, kVar.f2388c, kVar.f2389d);
                builderObtain.setTextDirection(kVar.f2390e);
                builderObtain.setAlignment(kVar.f2391f);
                builderObtain.setMaxLines(kVar.f2392g);
                builderObtain.setEllipsize(kVar.f2393h);
                builderObtain.setEllipsizedWidth(kVar.f2394i);
                builderObtain.setLineSpacing(0.0f, 1.0f);
                builderObtain.setIncludePad(kVar.k);
                builderObtain.setBreakStrategy(kVar.f2396l);
                builderObtain.setHyphenationFrequency(kVar.f2399o);
                builderObtain.setIndents(null, null);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 26) {
                    builderObtain.setJustificationMode(kVar.f2395j);
                }
                if (i7 >= 28) {
                    builderObtain.setUseLineSpacingFromFallbacks(true);
                }
                if (i7 >= 33) {
                    builderObtain.setLineBreakConfig(p.b().setLineBreakStyle(kVar.f2397m).setLineBreakWordStyle(kVar.f2398n).build());
                }
                if (i7 >= 35) {
                    builderObtain.setUseBoundsForWidth(false);
                }
                return builderObtain.build();
            default:
                StaticLayout staticLayout = null;
                if (!f7501c) {
                    f7501c = true;
                    c10 = 11;
                    try {
                        Class cls = Integer.TYPE;
                        Class cls2 = Float.TYPE;
                        f7502d = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    } catch (NoSuchMethodException unused) {
                        f7502d = null;
                        Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
                    }
                    constructor = f7502d;
                    break;
                } else {
                    constructor = f7502d;
                    c10 = 11;
                }
                if (constructor != null) {
                    try {
                        CharSequence charSequence = kVar.f2386a;
                        Integer numValueOf = Integer.valueOf(kVar.f2387b);
                        TextPaint textPaint = kVar.f2388c;
                        Integer numValueOf2 = Integer.valueOf(kVar.f2389d);
                        Layout.Alignment alignment = kVar.f2391f;
                        TextDirectionHeuristic textDirectionHeuristic = kVar.f2390e;
                        Float fValueOf = Float.valueOf(1.0f);
                        Float fValueOf2 = Float.valueOf(0.0f);
                        Boolean boolValueOf = Boolean.valueOf(kVar.k);
                        TextUtils.TruncateAt truncateAt = kVar.f2393h;
                        Integer numValueOf3 = Integer.valueOf(kVar.f2394i);
                        Integer numValueOf4 = Integer.valueOf(kVar.f2392g);
                        Object[] objArr = new Object[13];
                        objArr[0] = charSequence;
                        objArr[1] = 0;
                        objArr[2] = numValueOf;
                        objArr[3] = textPaint;
                        objArr[4] = numValueOf2;
                        objArr[5] = alignment;
                        objArr[6] = textDirectionHeuristic;
                        objArr[7] = fValueOf;
                        objArr[8] = fValueOf2;
                        objArr[9] = boolValueOf;
                        objArr[10] = truncateAt;
                        objArr[c10] = numValueOf3;
                        objArr[12] = numValueOf4;
                        staticLayout = (StaticLayout) constructor.newInstance(objArr);
                    } catch (IllegalAccessException unused2) {
                        f7502d = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    } catch (InstantiationException unused3) {
                        f7502d = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    } catch (InvocationTargetException unused4) {
                        f7502d = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    }
                }
                return staticLayout != null ? staticLayout : new StaticLayout(kVar.f2386a, 0, kVar.f2387b, kVar.f2388c, kVar.f2389d, kVar.f2391f, 1.0f, 0.0f, kVar.k, kVar.f2393h, kVar.f2394i);
        }
    }

    @Override // androidx.lifecycle.q0
    public androidx.lifecycle.o0 c(Class cls, u4.c cVar) {
        switch (this.f7504a) {
            case 1:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }

    @Override // androidx.lifecycle.q0
    public androidx.lifecycle.o0 f(o9.c cVar, u4.c cVar2) {
        switch (this.f7504a) {
            case 1:
                return new l0();
            default:
                return c(g5.a.L(cVar), cVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public Typeface g(m mVar, f3.k kVar, int i7) {
        String str;
        switch (this.f7504a) {
            case 17:
                mVar.getClass();
                return d("sans-serif", kVar, i7);
            default:
                mVar.getClass();
                int i10 = kVar.f5261a / 100;
                if (i10 >= 0 && i10 < 2) {
                    str = "sans-serif-thin";
                } else if (2 <= i10 && i10 < 4) {
                    str = "sans-serif-light";
                } else if (i10 == 4) {
                    str = "sans-serif";
                } else if (i10 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) {
                    str = "sans-serif-black";
                } else {
                    str = "sans-serif";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface typefaceE = e(str, kVar, i7);
                    if (!l.a(typefaceE, Typeface.create(Typeface.DEFAULT, g5.a.F(kVar, i7))) && !l.a(typefaceE, e(null, kVar, i7))) {
                        typeface = typefaceE;
                    }
                }
                return typeface == null ? e("sans-serif", kVar, i7) : typeface;
        }
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    @Override // i3.c
    public i3.b n() {
        return new i3.b(n3.l.I(new i3.a(Locale.getDefault())));
    }

    @Override // e4.s
    public void onScrollLimit(int i7, int i10, int i11, boolean z10) {
    }

    @Override // e4.s
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override // i3.c
    public Locale p(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (l.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // o6.a
    public void y0(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList2.isEmpty()) {
            hc.c cVar = n8.c.f8897a;
            n8.c.j(0, "前台服务 权限获取失败");
        } else {
            hc.c cVar2 = n8.c.f8897a;
            n8.c.j(0, "前台服务 权限获取成功");
            z6.a aVar = BaseService.f2920a;
            k8.c.a();
        }
    }
}
