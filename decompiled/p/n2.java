package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.baidu.carlifevehicle.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static n2 f9842i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f9844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.q0 f9845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.r0 f9846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f9847d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f9848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f9850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f9841h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l2 f9843j = new l2(6);

    public static synchronized n2 d() {
        try {
            if (f9842i == null) {
                n2 n2Var = new n2();
                f9842i = n2Var;
                j(n2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9842i;
    }

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        l2 l2Var = f9843j;
        l2Var.getClass();
        int i10 = (31 + i7) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(n2 n2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n2Var.a("vector", new m2(3));
            n2Var.a("animated-vector", new m2(2));
            n2Var.a("animated-selector", new m2(1));
            n2Var.a("drawable", new m2(0));
        }
    }

    public final void a(String str, m2 m2Var) {
        if (this.f9845b == null) {
            this.f9845b = new s.q0(0);
        }
        this.f9845b.put(str, m2Var);
    }

    public final synchronized void b(Context context, long j5, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                s.q qVar = (s.q) this.f9847d.get(context);
                if (qVar == null) {
                    qVar = new s.q((Object) null);
                    this.f9847d.put(context, qVar);
                }
                qVar.f(j5, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i7) {
        if (this.f9848e == null) {
            this.f9848e = new TypedValue();
        }
        TypedValue typedValue = this.f9848e;
        context.getResources().getValue(i7, typedValue, true);
        long j5 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j5);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableR = null;
        if (this.f9850g != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawableR = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawableR = t.r(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableR = t.r(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableR = t.r(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableR != null) {
            layerDrawableR.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j5, layerDrawableR);
        }
        return layerDrawableR;
    }

    public final synchronized Drawable e(Context context, long j5) {
        Object obj;
        s.q qVar = (s.q) this.f9847d.get(context);
        if (qVar == null) {
            return null;
        }
        int iB = t.a.b(qVar.f12480b, qVar.f12482d, j5);
        if (iB < 0 || (obj = qVar.f12481c[iB]) == s.r.f12486a) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            qVar.g(j5);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i7) {
        return g(context, i7, false);
    }

    public final synchronized Drawable g(Context context, int i7, boolean z10) {
        Drawable drawableK;
        try {
            if (!this.f9849f) {
                this.f9849f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof f5.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f9849f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i7);
            if (drawableK == null) {
                drawableK = c(context, i7);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i7);
            }
            if (drawableK != null) {
                drawableK = n(context, i7, z10, drawableK);
            }
            if (drawableK != null) {
                m1.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        s.r0 r0Var;
        WeakHashMap weakHashMap = this.f9844a;
        ColorStateList colorStateListS = null;
        colorStateList = (weakHashMap == null || (r0Var = (s.r0) weakHashMap.get(context)) == null) ? null : (ColorStateList) r0Var.d(i7);
        if (colorStateList == null) {
            t tVar = this.f9850g;
            if (tVar != null) {
                colorStateListS = tVar.s(context, i7);
            }
            if (colorStateListS != null) {
                if (this.f9844a == null) {
                    this.f9844a = new WeakHashMap();
                }
                s.r0 r0Var2 = (s.r0) this.f9844a.get(context);
                if (r0Var2 == null) {
                    r0Var2 = new s.r0(0);
                    this.f9844a.put(context, r0Var2);
                }
                r0Var2.a(i7, colorStateListS);
            }
            colorStateList = colorStateListS;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i7) {
        int next;
        s.q0 q0Var = this.f9845b;
        if (q0Var == null || q0Var.isEmpty()) {
            return null;
        }
        s.r0 r0Var = this.f9846c;
        if (r0Var != null) {
            String str = (String) r0Var.d(i7);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f9845b.get(str) == null) {
                return null;
            }
        } else {
            this.f9846c = new s.r0(0);
        }
        if (this.f9848e == null) {
            this.f9848e = new TypedValue();
        }
        TypedValue typedValue = this.f9848e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long j5 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j5);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f9846c.a(i7, name);
                m2 m2Var = (m2) this.f9845b.get(name);
                if (m2Var != null) {
                    drawableE = m2Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j5, drawableE);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (drawableE == null) {
            this.f9846c.a(i7, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        s.q qVar = (s.q) this.f9847d.get(context);
        if (qVar != null) {
            qVar.b();
        }
    }

    public final synchronized void m(t tVar) {
        this.f9850g = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Drawable n(Context context, int i7, boolean z10, Drawable drawable) {
        int i10;
        int iRound;
        boolean z11;
        Drawable drawableMutate;
        int iC;
        ColorStateList colorStateListI = i(context, i7);
        PorterDuff.Mode mode = null;
        if (colorStateListI != null) {
            Drawable drawableF0 = n3.r.f0(drawable.mutate());
            drawableF0.setTintList(colorStateListI);
            if (this.f9850g != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableF0.setTintMode(mode);
            }
            return drawableF0;
        }
        if (this.f9850g != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC2 = s2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = u.f9926b;
                t.y(drawableFindDrawableByLayerId, iC2, mode2);
                t.y(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), s2.c(context, R.attr.colorControlNormal), mode2);
                t.y(layerDrawable.findDrawableByLayerId(android.R.id.progress), s2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = s2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = u.f9926b;
                t.y(drawableFindDrawableByLayerId2, iB, mode3);
                t.y(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), s2.c(context, R.attr.colorControlActivated), mode3);
                t.y(layerDrawable2.findDrawableByLayerId(android.R.id.progress), s2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        t tVar = this.f9850g;
        boolean z12 = false;
        if (tVar != null) {
            PorterDuff.Mode mode4 = u.f9926b;
            if (t.j((int[]) tVar.f9915a, i7)) {
                i10 = R.attr.colorControlNormal;
            } else if (t.j((int[]) tVar.f9917c, i7)) {
                i10 = R.attr.colorControlActivated;
            } else {
                if (t.j((int[]) tVar.f9918d, i7)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i7 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i10 = android.R.attr.colorForeground;
                        z11 = true;
                    } else if (i7 != R.drawable.abc_dialog_material_background) {
                        i10 = 0;
                        iRound = -1;
                        z11 = false;
                    }
                    if (z11) {
                        drawableMutate = drawable.mutate();
                        iC = s2.c(context, i10);
                        synchronized (u.class) {
                            PorterDuffColorFilter porterDuffColorFilterH = h(iC, mode4);
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilterH);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z12 = true;
                    }
                }
                i10 = android.R.attr.colorBackground;
            }
            iRound = -1;
            z11 = true;
            if (z11) {
                drawableMutate = drawable.mutate();
                iC = s2.c(context, i10);
                synchronized (u.class) {
                    PorterDuffColorFilter porterDuffColorFilterH2 = h(iC, mode4);
                    drawableMutate.setColorFilter(porterDuffColorFilterH2);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z12 = true;
                }
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
