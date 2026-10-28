package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import o.o;
import o.p;
import o.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f8659a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8668j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f8669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f8671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f8673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f8683z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8660b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8661c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8662d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8663e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8664f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8665g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f8659a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f8688c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f8688c;
        boolean z10 = false;
        menuItem.setChecked(this.f8676s).setVisible(this.f8677t).setEnabled(this.f8678u).setCheckable(this.f8675r >= 1).setTitleCondensed(this.f8669l).setIcon(this.f8670m);
        int i7 = this.f8679v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f8682y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f8689d == null) {
                hVar.f8689d = h.a(context);
            }
            Object obj = hVar.f8689d;
            String str = this.f8682y;
            f fVar = new f();
            fVar.f8657a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f8658b = cls.getMethod(str, f.f8656c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f8675r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f9224x = (oVar.f9224x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                z3.a aVar = tVar.f9234c;
                try {
                    if (tVar.f9235d == null) {
                        tVar.f9235d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f9235d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f8681x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f8684e, hVar.f8686a));
            z10 = true;
        }
        int i10 = this.f8680w;
        if (i10 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        p pVar = this.f8683z;
        if (pVar != null) {
            if (menuItem instanceof z3.a) {
                ((z3.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof z3.a;
        if (z11) {
            ((z3.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e4.k.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((z3.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e4.k.m(menuItem, charSequence2);
        }
        char c10 = this.f8671n;
        int i11 = this.f8672o;
        if (z11) {
            ((z3.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e4.k.h(menuItem, c10, i11);
        }
        char c11 = this.f8673p;
        int i12 = this.f8674q;
        if (z11) {
            ((z3.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e4.k.l(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((z3.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e4.k.k(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((z3.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e4.k.j(menuItem, colorStateList);
            }
        }
    }
}
