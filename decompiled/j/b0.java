package j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e4.l0;
import e4.r0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import p.c1;
import p.e3;
import p.i1;
import p.j3;
import p.k1;
import p.l1;
import p.m3;
import p.z2;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends q implements o.k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final q0 f6720m0 = new q0(0);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int[] f6721n0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final boolean f6722o0 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public a0[] L;
    public a0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public y W;
    public y X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6724g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Rect f6725h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Rect f6726i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6727j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public e0 f6728j0;
    public final Context k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnBackInvokedDispatcher f6729k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f6730l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public OnBackInvokedCallback f6731l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f6732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f6733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k0 f6734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n.h f6735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f6736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k1 f6737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f6738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f6739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n.a f6740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f6741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f6742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r f6743x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6745z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f6744y = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final r f6723f0 = new r(this, 0);

    public b0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.S = -100;
        this.k = context;
        this.f6733n = kVar;
        this.f6727j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof j)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    jVar = (j) context;
                    break;
                }
            }
            if (jVar != null) {
                this.S = ((b0) jVar.l()).S;
            }
        }
        if (this.S == -100) {
            String name = this.f6727j.getClass().getName();
            q0 q0Var = f6720m0;
            Integer num = (Integer) q0Var.get(name);
            if (num != null) {
                this.S = num.intValue();
                q0Var.remove(this.f6727j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        p.u.c();
    }

    public static a4.e m(Context context) {
        a4.e eVar;
        a4.e eVarB;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || (eVar = q.f6841c) == null) {
            return null;
        }
        a4.g gVar = eVar.f33a;
        a4.e eVarX = x(context.getApplicationContext().getResources().getConfiguration());
        int i10 = 0;
        if (i7 < 24) {
            eVarB = gVar.isEmpty() ? a4.e.f32b : a4.e.b(u.b(gVar.get(0)));
        } else if (gVar.isEmpty()) {
            eVarB = a4.e.f32b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i10 < eVarX.f33a.size() + gVar.size()) {
                Locale locale = i10 < gVar.size() ? gVar.get(i10) : eVarX.f33a.get(i10 - gVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            eVarB = a4.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return eVarB.f33a.isEmpty() ? eVarX : eVarB;
    }

    public static Configuration r(Context context, int i7, a4.e eVar, Configuration configuration, boolean z10) {
        int i10;
        if (i7 == 1) {
            i10 = 16;
        } else if (i7 != 2) {
            i10 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i10 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            a4.g gVar = eVar.f33a;
            if (Build.VERSION.SDK_INT >= 24) {
                v.d(configuration2, eVar);
                return configuration2;
            }
            configuration2.setLocale(gVar.get(0));
            configuration2.setLayoutDirection(gVar.get(0));
        }
        return configuration2;
    }

    public static a4.e x(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? v.b(configuration) : a4.e.b(u.b(configuration.locale));
    }

    public final void A(int i7) {
        this.Z = (1 << i7) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.f6730l.getDecorView();
        WeakHashMap weakHashMap = l0.f4369a;
        decorView.postOnAnimation(this.f6723f0);
        this.Y = true;
    }

    public final int B(Context context, int i7) {
        if (i7 != -100) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.X == null) {
                            this.X = new y(this, context);
                        }
                        return this.X.h();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).h();
                }
            }
            return i7;
        }
        return -1;
    }

    public final boolean C() {
        l1 l1Var;
        z2 z2Var;
        boolean z10 = this.N;
        this.N = false;
        a0 a0VarY = y(0);
        if (!a0VarY.f6714m) {
            n.a aVar = this.f6740u;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            z();
            k0 k0Var = this.f6734o;
            if (k0Var == null || (l1Var = k0Var.f6817j) == null || (z2Var = ((e3) l1Var).f9704a.L) == null || z2Var.f9990b == null) {
                return false;
            }
            z2 z2Var2 = ((e3) l1Var).f9704a.L;
            o.o oVar = z2Var2 == null ? null : z2Var2.f9990b;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z10) {
            p(a0VarY, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f9168f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(j.a0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b0.D(j.a0, android.view.KeyEvent):void");
    }

    public final boolean E(a0 a0Var, int i7, KeyEvent keyEvent) {
        o.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((a0Var.k || F(a0Var, keyEvent)) && (mVar = a0Var.f6710h) != null) {
            return mVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    public final boolean F(a0 a0Var, KeyEvent keyEvent) {
        o.m mVar;
        k1 k1Var;
        k1 k1Var2;
        Resources.Theme themeNewTheme;
        k1 k1Var3;
        k1 k1Var4;
        if (!this.Q) {
            boolean z10 = a0Var.k;
            int i7 = a0Var.f6703a;
            if (z10) {
                return true;
            }
            a0 a0Var2 = this.M;
            if (a0Var2 != null && a0Var2 != a0Var) {
                p(a0Var2, false);
            }
            Window.Callback callback = this.f6730l.getCallback();
            if (callback != null) {
                a0Var.f6709g = callback.onCreatePanelView(i7);
            }
            boolean z11 = i7 == 0 || i7 == 108;
            if (z11 && (k1Var4 = this.f6737r) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var4;
                actionBarOverlayLayout.k();
                ((e3) actionBarOverlayLayout.f668e).f9714l = true;
            }
            if (a0Var.f6709g == null) {
                o.m mVar2 = a0Var.f6710h;
                if (mVar2 == null || a0Var.f6716o) {
                    if (mVar2 == null) {
                        Context context = this.k;
                        if ((i7 == 0 || i7 == 108) && this.f6737r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.baidu.carlifevehicle.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.baidu.carlifevehicle.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.baidu.carlifevehicle.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                n.c cVar = new n.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        o.m mVar3 = new o.m(context);
                        mVar3.f9180e = this;
                        o.m mVar4 = a0Var.f6710h;
                        if (mVar3 != mVar4) {
                            if (mVar4 != null) {
                                mVar4.r(a0Var.f6711i);
                            }
                            a0Var.f6710h = mVar3;
                            o.i iVar = a0Var.f6711i;
                            if (iVar != null) {
                                mVar3.b(iVar, mVar3.f9176a);
                            }
                        }
                        if (a0Var.f6710h != null) {
                            if (z11 && (k1Var2 = this.f6737r) != null) {
                                if (this.f6738s == null) {
                                    this.f6738s = new s(this, 2);
                                }
                                ((ActionBarOverlayLayout) k1Var2).l(a0Var.f6710h, this.f6738s);
                            }
                            a0Var.f6710h.w();
                            if (callback.onCreatePanelMenu(i7, a0Var.f6710h)) {
                                a0Var.f6716o = false;
                            } else {
                                mVar = a0Var.f6710h;
                                if (mVar != null) {
                                    if (mVar != null) {
                                        mVar.r(a0Var.f6711i);
                                    }
                                    a0Var.f6710h = null;
                                }
                                if (z11 && (k1Var = this.f6737r) != null) {
                                    ((ActionBarOverlayLayout) k1Var).l(null, this.f6738s);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.f6738s == null) {
                                this.f6738s = new s(this, 2);
                            }
                            ((ActionBarOverlayLayout) k1Var2).l(a0Var.f6710h, this.f6738s);
                        }
                        a0Var.f6710h.w();
                        if (callback.onCreatePanelMenu(i7, a0Var.f6710h)) {
                            mVar = a0Var.f6710h;
                            if (mVar != null) {
                                if (mVar != null) {
                                    mVar.r(a0Var.f6711i);
                                }
                                a0Var.f6710h = null;
                            }
                            if (z11) {
                                ((ActionBarOverlayLayout) k1Var).l(null, this.f6738s);
                            }
                        } else {
                            a0Var.f6716o = false;
                        }
                    }
                }
                a0Var.f6710h.w();
                Bundle bundle = a0Var.f6717p;
                if (bundle != null) {
                    a0Var.f6710h.s(bundle);
                    a0Var.f6717p = null;
                }
                if (!callback.onPreparePanel(0, a0Var.f6709g, a0Var.f6710h)) {
                    if (z11 && (k1Var3 = this.f6737r) != null) {
                        ((ActionBarOverlayLayout) k1Var3).l(null, this.f6738s);
                    }
                    a0Var.f6710h.v();
                    return false;
                }
                a0Var.f6710h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                a0Var.f6710h.v();
            }
            a0Var.k = true;
            a0Var.f6713l = false;
            this.M = a0Var;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.f6745z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f6729k0 != null && (y(0).f6714m || this.f6740u != null)) {
                z10 = true;
            }
            if (z10 && this.f6731l0 == null) {
                this.f6731l0 = w.b(this.f6729k0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f6731l0) == null) {
                    return;
                }
                w.c(this.f6729k0, onBackInvokedCallback);
                this.f6731l0 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(o.m r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b0.R(o.m):void");
    }

    @Override // j.q
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof b0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // j.q
    public final void c() throws IllegalAccessException {
        String strD;
        this.O = true;
        k(false, true);
        v();
        Object obj = this.f6727j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = u3.f.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                k0 k0Var = this.f6734o;
                if (k0Var == null) {
                    this.f6724g0 = true;
                } else {
                    k0Var.Z(true);
                }
            }
            synchronized (q.f6846h) {
                q.e(this);
                q.f6845g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // j.q
    public final void d() {
        if (this.f6727j instanceof Activity) {
            synchronized (q.f6846h) {
                q.e(this);
            }
        }
        if (this.Y) {
            this.f6730l.getDecorView().removeCallbacks(this.f6723f0);
        }
        this.Q = true;
        if (this.S != -100) {
            Object obj = this.f6727j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f6720m0.put(this.f6727j.getClass().getName(), Integer.valueOf(this.S));
            } else {
                f6720m0.remove(this.f6727j.getClass().getName());
            }
        } else {
            f6720m0.remove(this.f6727j.getClass().getName());
        }
        y yVar = this.W;
        if (yVar != null) {
            yVar.c();
        }
        y yVar2 = this.X;
        if (yVar2 != null) {
            yVar2.c();
        }
    }

    @Override // j.q
    public final boolean f(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.J && i7 == 108) {
            return false;
        }
        if (this.F && i7 == 1) {
            this.F = false;
        }
        if (i7 == 1) {
            G();
            this.J = true;
            return true;
        }
        if (i7 == 2) {
            G();
            this.D = true;
            return true;
        }
        if (i7 == 5) {
            G();
            this.E = true;
            return true;
        }
        if (i7 == 10) {
            G();
            this.H = true;
            return true;
        }
        if (i7 == 108) {
            G();
            this.F = true;
            return true;
        }
        if (i7 != 109) {
            return this.f6730l.requestFeature(i7);
        }
        G();
        this.G = true;
        return true;
    }

    @Override // j.q
    public final void g(int i7) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i7, viewGroup);
        this.f6732m.a(this.f6730l.getCallback());
    }

    @Override // j.q
    public final void h(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6732m.a(this.f6730l.getCallback());
    }

    @Override // j.q
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6732m.a(this.f6730l.getCallback());
    }

    @Override // j.q
    public final void j(CharSequence charSequence) {
        this.f6736q = charSequence;
        k1 k1Var = this.f6737r;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        k0 k0Var = this.f6734o;
        if (k0Var == null) {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        e3 e3Var = (e3) k0Var.f6817j;
        if (e3Var.f9710g) {
            return;
        }
        Toolbar toolbar = e3Var.f9704a;
        e3Var.f9711h = charSequence;
        if ((e3Var.f9705b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (e3Var.f9710g) {
                l0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(boolean z10, boolean z11) throws IllegalAccessException {
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        Map map;
        boolean z15;
        Object obj;
        Object obj2;
        int i10;
        if (this.Q) {
            return false;
        }
        int i11 = this.S;
        if (i11 == -100) {
            i11 = q.f6840b;
        }
        Context context = this.k;
        int iB = B(context, i11);
        int i12 = Build.VERSION.SDK_INT;
        Object obj3 = null;
        a4.e eVarM = i12 < 33 ? m(context) : null;
        if (!z11 && eVarM != null) {
            eVarM = x(context.getResources().getConfiguration());
        }
        Configuration configurationR = r(context, iB, eVarM, null, false);
        boolean z16 = this.V;
        Object obj4 = this.f6727j;
        if (z16 || !(obj4 instanceof Activity)) {
            this.V = true;
            i7 = this.U;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
            } else {
                if (i12 >= 29) {
                    i10 = 269221888;
                } else {
                    i10 = i12 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i10);
                    if (activityInfo != null) {
                        this.U = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e7);
                    this.U = 0;
                }
                this.V = true;
                i7 = this.U;
            }
        }
        Configuration configuration = this.R;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationR.uiMode & 48;
        a4.e eVarX = x(configuration);
        a4.e eVarX2 = eVarM == null ? null : x(configurationR);
        int i15 = i13 != i14 ? 512 : 0;
        if (eVarX2 != null && !eVarX.equals(eVarX2)) {
            i15 |= 8196;
        }
        if (((~i7) & i15) != 0 && z10 && this.O && ((f6722o0 || this.P) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z12 = false;
            } else {
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && (i15 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationR.getLayoutDirection());
                }
                if (i16 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new p6.d(activity, 1));
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i15 == 0) {
            z13 = z12;
        } else {
            boolean z17 = (i7 & i15) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (eVarX2 != null) {
                a4.g gVar = eVarX2.f33a;
                if (Build.VERSION.SDK_INT >= 24) {
                    v.d(configuration2, eVarX2);
                } else {
                    configuration2.setLocale(gVar.get(0));
                    configuration2.setLayoutDirection(gVar.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 < 26 && i17 < 28) {
                if (i17 >= 24) {
                    if (!i2.c.f6609i) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            i2.c.f6608h = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        i2.c.f6609i = true;
                    }
                    Field field = i2.c.f6608h;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!i2.c.f6603c) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    i2.c.f6602b = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                i2.c.f6603c = true;
                            }
                            Field field2 = i2.c.f6602b;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj3 != null) {
                                i2.c.y(obj3);
                            }
                        }
                    }
                } else if (i17 >= 23) {
                    if (!i2.c.f6603c) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            i2.c.f6602b = declaredField3;
                            z15 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException e14) {
                                e = e14;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e15) {
                            e = e15;
                            z15 = true;
                        }
                        i2.c.f6603c = z15;
                    }
                    Field field3 = i2.c.f6602b;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e16);
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        i2.c.y(obj);
                    }
                } else {
                    if (!i2.c.f6603c) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            i2.c.f6602b = declaredField4;
                            z14 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e17) {
                                e = e17;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e18) {
                            e = e18;
                            z14 = true;
                        }
                        i2.c.f6603c = z14;
                    }
                    Field field4 = i2.c.f6602b;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e19) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e19);
                            map = null;
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i18 = this.T;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.T, true);
                }
            }
            if (z17 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof androidx.lifecycle.t) {
                    if (((androidx.lifecycle.t) activity2).g().f1072c.compareTo(androidx.lifecycle.o.f1058c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.P && !this.Q) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z13 = true;
        }
        if (eVarX2 != null) {
            a4.e eVarX3 = x(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                v.c(eVarX3);
            } else {
                Locale.setDefault(eVarX3.f33a.get(0));
            }
        }
        if (i11 == 0) {
            w(context).o();
        } else {
            y yVar = this.W;
            if (yVar != null) {
                yVar.c();
            }
        }
        if (i11 == 3) {
            if (this.X == null) {
                this.X = new y(this, context);
            }
            this.X.o();
        } else {
            y yVar2 = this.X;
            if (yVar2 != null) {
                yVar2.c();
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void l(Window window) {
        Drawable drawableG;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6730l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f6732m = xVar;
        window.setCallback(xVar);
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6721n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableG = null;
        } else {
            p.u uVarA = p.u.a();
            synchronized (uVarA) {
                drawableG = uVarA.f9928a.g(context, resourceId, true);
            }
        }
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f6730l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f6729k0) != null) {
            return;
        }
        Object obj = this.f6727j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6731l0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6731l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f6729k0 = w.a(activity);
            } else {
                this.f6729k0 = null;
            }
        } else {
            this.f6729k0 = null;
        }
        H();
    }

    public final void n(int i7, a0 a0Var, o.m mVar) {
        if (mVar == null) {
            if (a0Var == null && i7 >= 0) {
                a0[] a0VarArr = this.L;
                if (i7 < a0VarArr.length) {
                    a0Var = a0VarArr[i7];
                }
            }
            if (a0Var != null) {
                mVar = a0Var.f6710h;
            }
        }
        if ((a0Var == null || a0Var.f6714m) && !this.Q) {
            x xVar = this.f6732m;
            Window.Callback callback = this.f6730l.getCallback();
            xVar.getClass();
            try {
                xVar.f6857d = true;
                callback.onPanelClosed(i7, mVar);
            } finally {
                xVar.f6857d = false;
            }
        }
    }

    public final void o(o.m mVar) {
        p.k kVar;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6737r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e3) actionBarOverlayLayout.f668e).f9704a.f715a;
        if (actionMenuView != null && (kVar = actionMenuView.f693t) != null) {
            kVar.f();
            p.g gVar = kVar.f9816t;
            if (gVar != null && gVar.b()) {
                gVar.f9246i.dismiss();
            }
        }
        Window.Callback callback = this.f6730l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, mVar);
        }
        this.K = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View e0Var;
        View view2 = null;
        if (this.f6728j0 == null) {
            int[] iArr = i.a.f6553j;
            Context context2 = this.k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f6728j0 = new e0();
            } else {
                try {
                    this.f6728j0 = (e0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f6728j0 = new e0();
                }
            }
        }
        e0 e0Var2 = this.f6728j0;
        int i7 = j3.f9797a;
        e0Var2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f6566x, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof n.c) && ((n.c) context).f8643a == resourceId)) ? context : new n.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                e0Var = new p.e0(cVar, attributeSet);
                break;
            case 1:
                e0Var = new p.s(cVar, attributeSet);
                break;
            case 2:
                e0Var = new p.a0(cVar, attributeSet);
                break;
            case 3:
                e0Var = new c1(cVar, attributeSet);
                break;
            case 4:
                e0Var = new p.y(cVar, attributeSet, com.baidu.carlifevehicle.R.attr.imageButtonStyle);
                break;
            case 5:
                e0Var = new p.g0(cVar, attributeSet);
                break;
            case 6:
                e0Var = new p.r0(cVar, attributeSet);
                break;
            case 7:
                e0Var = new p.d0(cVar, attributeSet);
                break;
            case 8:
                e0Var = new i1(cVar, attributeSet);
                break;
            case 9:
                e0Var = new p.z(cVar, attributeSet, 0);
                break;
            case 10:
                e0Var = new p.o(cVar, attributeSet);
                break;
            case 11:
                e0Var = new p.r(cVar, attributeSet);
                break;
            case 12:
                e0Var = new p.w(cVar, attributeSet);
                break;
            case 13:
                e0Var = new p.q(cVar, attributeSet);
                break;
            default:
                e0Var = null;
                break;
        }
        if (e0Var != null || context == cVar) {
            view2 = e0Var;
        } else {
            Object[] objArr = e0Var2.f6770a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = e0.f6768g;
                        if (i10 < 3) {
                            View viewA = e0Var2.a(cVar, str, strArr[i10]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i10++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = e0Var2.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, e0.f6764c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new d0(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, e0.f6765d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = l0.f4369a;
                    new e4.z(com.baidu.carlifevehicle.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(view2, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, e0.f6766e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    l0.k(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, e0.f6767f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = l0.f4369a;
                    new e4.z(com.baidu.carlifevehicle.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(a0 a0Var, boolean z10) {
        z zVar;
        k1 k1Var;
        p.k kVar;
        if (z10 && a0Var.f6703a == 0 && (k1Var = this.f6737r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((e3) actionBarOverlayLayout.f668e).f9704a.f715a;
            if (actionMenuView != null && (kVar = actionMenuView.f693t) != null && kVar.h()) {
                o(a0Var.f6710h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && a0Var.f6714m && (zVar = a0Var.f6707e) != null) {
            windowManager.removeView(zVar);
            if (z10) {
                n(a0Var.f6703a, a0Var, null);
            }
        }
        a0Var.k = false;
        a0Var.f6713l = false;
        a0Var.f6714m = false;
        a0Var.f6708f = null;
        a0Var.f6715n = true;
        if (this.M == a0Var) {
            this.M = null;
        }
        if (a0Var.f6703a == 0) {
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // o.k
    public final boolean q(o.m mVar, MenuItem menuItem) {
        a0 a0Var;
        Window.Callback callback = this.f6730l.getCallback();
        if (callback != null && !this.Q) {
            o.m mVarK = mVar.k();
            a0[] a0VarArr = this.L;
            int length = a0VarArr != null ? a0VarArr.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                a0Var = a0VarArr[i7];
                if (a0Var != null && a0Var.f6710h == mVarK) {
                    if (a0Var != null) {
                        return callback.onMenuItemSelected(a0Var.f6703a, menuItem);
                    }
                }
            }
            a0Var = null;
            if (a0Var != null) {
                return callback.onMenuItemSelected(a0Var.f6703a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    public final boolean s(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        a0 a0VarY;
        k1 k1Var;
        Context context;
        boolean z10;
        boolean z11;
        boolean zF;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        p.k kVar;
        p.k kVar2;
        p.k kVar3;
        a0 a0VarY2;
        Object obj = this.f6727j;
        if ((!(obj instanceof e4.j) && !(obj instanceof h)) || (decorView = this.f6730l.getDecorView()) == null || !o9.e0.s(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.f6732m;
                Window.Callback callback = this.f6730l.getCallback();
                xVar.getClass();
                try {
                    xVar.f6856c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    xVar.f6856c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.N = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    a0VarY2 = y(0);
                                    if (!a0VarY2.f6714m) {
                                        F(a0VarY2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f6740u == null) {
                                    a0VarY = y(0);
                                    k1Var = this.f6737r;
                                    context = this.k;
                                    if (k1Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((e3) actionBarOverlayLayout.f668e).f9704a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f715a) == null || !actionMenuView.f692s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z10 = a0VarY.f6714m;
                                            if (!z10 || a0VarY.f6713l) {
                                                p(a0VarY, true);
                                                z11 = z10;
                                            } else {
                                                if (a0VarY.k) {
                                                    if (a0VarY.f6716o) {
                                                        a0VarY.k = false;
                                                        zF = F(a0VarY, keyEvent);
                                                    } else {
                                                        zF = true;
                                                    }
                                                    if (zF) {
                                                        D(a0VarY, keyEvent);
                                                        z11 = true;
                                                    }
                                                }
                                                z11 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f6737r;
                                            actionBarOverlayLayout2.k();
                                            ActionMenuView actionMenuView2 = ((e3) actionBarOverlayLayout2.f668e).f9704a.f715a;
                                            if (actionMenuView2 == null || (kVar2 = actionMenuView2.f693t) == null || !kVar2.h()) {
                                                if (!this.Q && F(a0VarY, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f6737r;
                                                    actionBarOverlayLayout3.k();
                                                    ActionMenuView actionMenuView3 = ((e3) actionBarOverlayLayout3.f668e).f9704a.f715a;
                                                    if (actionMenuView3 != null && (kVar = actionMenuView3.f693t) != null && kVar.l()) {
                                                        z11 = true;
                                                    }
                                                }
                                                z11 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f6737r;
                                                actionBarOverlayLayout4.k();
                                                ActionMenuView actionMenuView4 = ((e3) actionBarOverlayLayout4.f668e).f9704a.f715a;
                                                if (actionMenuView4 == null || (kVar3 = actionMenuView4.f693t) == null || !kVar3.f()) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z10 = a0VarY.f6714m;
                                        if (z10) {
                                        }
                                        p(a0VarY, true);
                                        z11 = z10;
                                    }
                                    if (z11) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (C()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    xVar.f6856c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.N = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            a0VarY2 = y(0);
                            if (!a0VarY2.f6714m) {
                                F(a0VarY2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f6740u == null) {
                            a0VarY = y(0);
                            k1Var = this.f6737r;
                            context = this.k;
                            if (k1Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) k1Var;
                                actionBarOverlayLayout5.k();
                                toolbar = ((e3) actionBarOverlayLayout5.f668e).f9704a;
                                if (toolbar.getVisibility() == 0) {
                                    z10 = a0VarY.f6714m;
                                    if (z10) {
                                    }
                                    p(a0VarY, true);
                                    z11 = z10;
                                } else {
                                    z10 = a0VarY.f6714m;
                                    if (z10) {
                                    }
                                    p(a0VarY, true);
                                    z11 = z10;
                                }
                            } else {
                                z10 = a0VarY.f6714m;
                                if (z10) {
                                }
                                p(a0VarY, true);
                                z11 = z10;
                            }
                            if (z11) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (C()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void t(int i7) {
        a0 a0VarY = y(i7);
        if (a0VarY.f6710h != null) {
            Bundle bundle = new Bundle();
            a0VarY.f6710h.t(bundle);
            if (bundle.size() > 0) {
                a0VarY.f6717p = bundle;
            }
            a0VarY.f6710h.w();
            a0VarY.f6710h.clear();
        }
        a0VarY.f6716o = true;
        a0VarY.f6715n = true;
        if ((i7 == 108 || i7 == 0) && this.f6737r != null) {
            a0 a0VarY2 = y(0);
            a0VarY2.k = false;
            F(a0VarY2, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        if (this.f6745z) {
            return;
        }
        Context context = this.k;
        int[] iArr = i.a.f6553j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i7 = 0;
        int i10 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        v();
        this.f6730l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(com.baidu.carlifevehicle.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.baidu.carlifevehicle.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.baidu.carlifevehicle.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.baidu.carlifevehicle.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.c(context, typedValue.resourceId) : context).inflate(com.baidu.carlifevehicle.R.layout.abc_screen_toolbar, (ViewGroup) null);
            k1 k1Var = (k1) viewGroup.findViewById(com.baidu.carlifevehicle.R.id.decor_content_parent);
            this.f6737r = k1Var;
            k1Var.setWindowCallback(this.f6730l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f6737r).j(109);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f6737r).j(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f6737r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
        }
        s sVar = new s(this, i7);
        WeakHashMap weakHashMap = l0.f4369a;
        e4.e0.i(viewGroup, sVar);
        if (this.f6737r == null) {
            this.B = (TextView) viewGroup.findViewById(com.baidu.carlifevehicle.R.id.title);
        }
        boolean z10 = m3.f9836a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.baidu.carlifevehicle.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6730l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6730l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s(this, i10));
        this.A = viewGroup;
        Object obj = this.f6727j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6736q;
        if (!TextUtils.isEmpty(title)) {
            k1 k1Var2 = this.f6737r;
            if (k1Var2 != null) {
                k1Var2.setWindowTitle(title);
            } else {
                k0 k0Var = this.f6734o;
                if (k0Var != null) {
                    e3 e3Var = (e3) k0Var.f6817j;
                    if (!e3Var.f9710g) {
                        Toolbar toolbar = e3Var.f9704a;
                        e3Var.f9711h = title;
                        if ((e3Var.f9705b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (e3Var.f9710g) {
                                l0.k(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.f6730l.getDecorView();
        contentFrameLayout2.f710g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6745z = true;
        a0 a0VarY = y(0);
        if (this.Q || a0VarY.f6710h != null) {
            return;
        }
        A(108);
    }

    public final void v() {
        if (this.f6730l == null) {
            Object obj = this.f6727j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f6730l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final e6.f w(Context context) {
        if (this.W == null) {
            if (a2.b.f10e == null) {
                Context applicationContext = context.getApplicationContext();
                a2.b.f10e = new a2.b(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new y(this, a2.b.f10e);
        }
        return this.W;
    }

    public final a0 y(int i7) {
        a0[] a0VarArr = this.L;
        if (a0VarArr == null || a0VarArr.length <= i7) {
            a0[] a0VarArr2 = new a0[i7 + 1];
            if (a0VarArr != null) {
                System.arraycopy(a0VarArr, 0, a0VarArr2, 0, a0VarArr.length);
            }
            this.L = a0VarArr2;
            a0VarArr = a0VarArr2;
        }
        a0 a0Var = a0VarArr[i7];
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        a0Var2.f6703a = i7;
        a0Var2.f6715n = false;
        a0VarArr[i7] = a0Var2;
        return a0Var2;
    }

    public final void z() {
        u();
        if (this.F && this.f6734o == null) {
            Object obj = this.f6727j;
            if (obj instanceof Activity) {
                this.f6734o = new k0((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f6734o = new k0((Dialog) obj);
            }
            k0 k0Var = this.f6734o;
            if (k0Var != null) {
                k0Var.Z(this.f6724g0);
            }
        }
    }
}
