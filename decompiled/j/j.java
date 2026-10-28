package j;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Objects;
import p.e3;
import p.j3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p4.l implements k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b0 f6807x;

    public j() {
        this.f1774d.f46b.H("androidx:appcompat", new a5.a(this));
        h(new i(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        b0 b0Var = (b0) l();
        b0Var.u();
        ((ViewGroup) b0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.f6732m.a(b0Var.f6730l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01df  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x020e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        n.c cVar;
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        b0 b0Var = (b0) l();
        b0Var.O = true;
        int i46 = b0Var.S;
        if (i46 == -100) {
            i46 = q.f6840b;
        }
        int iB = b0Var.B(context, i46);
        if (q.b(context) && q.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (q.f6847i) {
                    try {
                        a4.e eVar = q.f6841c;
                        if (eVar == null) {
                            if (q.f6842d == null) {
                                q.f6842d = a4.e.b(u3.f.f(context));
                            }
                            if (!q.f6842d.f33a.isEmpty()) {
                                q.f6841c = q.f6842d;
                            }
                        } else if (!eVar.equals(q.f6842d)) {
                            a4.e eVar2 = q.f6841c;
                            q.f6842d = eVar2;
                            u3.f.e(context, eVar2.f33a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!q.f6844f) {
                q.f6839a.execute(new l(context, 0));
            }
        }
        a4.e eVarM = b0.m(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(b0.r(context, iB, eVarM, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof n.c) {
                    try {
                        ((n.c) context).a(b0.r(context, iB, eVarM, null, false));
                    } catch (IllegalStateException unused2) {
                        if (b0.f6722o0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i7 = configuration.mcc;
                                    i10 = configuration2.mcc;
                                    if (i7 != i10) {
                                        configuration3.mcc = i10;
                                    }
                                    i11 = configuration.mnc;
                                    i12 = configuration2.mnc;
                                    if (i11 != i12) {
                                        configuration3.mnc = i12;
                                    }
                                    i13 = Build.VERSION.SDK_INT;
                                    if (i13 >= 24) {
                                        v.a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i14 = configuration.touchscreen;
                                    i15 = configuration2.touchscreen;
                                    if (i14 != i15) {
                                        configuration3.touchscreen = i15;
                                    }
                                    i16 = configuration.keyboard;
                                    i17 = configuration2.keyboard;
                                    if (i16 != i17) {
                                        configuration3.keyboard = i17;
                                    }
                                    i18 = configuration.keyboardHidden;
                                    i19 = configuration2.keyboardHidden;
                                    if (i18 != i19) {
                                        configuration3.keyboardHidden = i19;
                                    }
                                    i20 = configuration.navigation;
                                    i21 = configuration2.navigation;
                                    if (i20 != i21) {
                                        configuration3.navigation = i21;
                                    }
                                    i22 = configuration.navigationHidden;
                                    i23 = configuration2.navigationHidden;
                                    if (i22 != i23) {
                                        configuration3.navigationHidden = i23;
                                    }
                                    i24 = configuration.orientation;
                                    i25 = configuration2.orientation;
                                    if (i24 != i25) {
                                        configuration3.orientation = i25;
                                    }
                                    i26 = configuration.screenLayout & 15;
                                    i27 = configuration2.screenLayout & 15;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    i28 = configuration.screenLayout & 192;
                                    i29 = configuration2.screenLayout & 192;
                                    if (i28 != i29) {
                                        configuration3.screenLayout |= i29;
                                    }
                                    i30 = configuration.screenLayout & 48;
                                    i31 = configuration2.screenLayout & 48;
                                    if (i30 != i31) {
                                        configuration3.screenLayout |= i31;
                                    }
                                    i32 = configuration.screenLayout & 768;
                                    i33 = configuration2.screenLayout & 768;
                                    if (i32 != i33) {
                                        configuration3.screenLayout |= i33;
                                    }
                                    if (i13 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i34 = configuration.uiMode & 15;
                                    i35 = configuration2.uiMode & 15;
                                    if (i34 != i35) {
                                        configuration3.uiMode |= i35;
                                    }
                                    i36 = configuration.uiMode & 48;
                                    i37 = configuration2.uiMode & 48;
                                    if (i36 != i37) {
                                        configuration3.uiMode |= i37;
                                    }
                                    i38 = configuration.screenWidthDp;
                                    i39 = configuration2.screenWidthDp;
                                    if (i38 != i39) {
                                        configuration3.screenWidthDp = i39;
                                    }
                                    i40 = configuration.screenHeightDp;
                                    i41 = configuration2.screenHeightDp;
                                    if (i40 != i41) {
                                        configuration3.screenHeightDp = i41;
                                    }
                                    i42 = configuration.smallestScreenWidthDp;
                                    i43 = configuration2.smallestScreenWidthDp;
                                    if (i42 != i43) {
                                        configuration3.smallestScreenWidthDp = i43;
                                    }
                                    i44 = configuration.densityDpi;
                                    i45 = configuration2.densityDpi;
                                    if (i44 != i45) {
                                        configuration3.densityDpi = i45;
                                    }
                                }
                            }
                            Configuration configurationR = b0.r(context, iB, eVarM, configuration3, true);
                            cVar = new n.c(context, com.baidu.carlifevehicle.R.style.Theme_AppCompat_Empty);
                            cVar.a(configurationR);
                            try {
                                if (context.getTheme() != null) {
                                    w3.b.j(cVar.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = cVar;
                        }
                    }
                } else if (b0.f6722o0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i7 = configuration.mcc;
                            i10 = configuration2.mcc;
                            if (i7 != i10) {
                                configuration3.mcc = i10;
                            }
                            i11 = configuration.mnc;
                            i12 = configuration2.mnc;
                            if (i11 != i12) {
                                configuration3.mnc = i12;
                            }
                            i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 24) {
                                v.a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 192;
                            i29 = configuration2.screenLayout & 192;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & 768;
                            i33 = configuration2.screenLayout & 768;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            if (i13 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i34 = configuration.uiMode & 15;
                            i35 = configuration2.uiMode & 15;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.uiMode & 48;
                            i37 = configuration2.uiMode & 48;
                            if (i36 != i37) {
                                configuration3.uiMode |= i37;
                            }
                            i38 = configuration.screenWidthDp;
                            i39 = configuration2.screenWidthDp;
                            if (i38 != i39) {
                                configuration3.screenWidthDp = i39;
                            }
                            i40 = configuration.screenHeightDp;
                            i41 = configuration2.screenHeightDp;
                            if (i40 != i41) {
                                configuration3.screenHeightDp = i41;
                            }
                            i42 = configuration.smallestScreenWidthDp;
                            i43 = configuration2.smallestScreenWidthDp;
                            if (i42 != i43) {
                                configuration3.smallestScreenWidthDp = i43;
                            }
                            i44 = configuration.densityDpi;
                            i45 = configuration2.densityDpi;
                            if (i44 != i45) {
                                configuration3.densityDpi = i45;
                            }
                        }
                    }
                    Configuration configurationR2 = b0.r(context, iB, eVarM, configuration3, true);
                    cVar = new n.c(context, com.baidu.carlifevehicle.R.style.Theme_AppCompat_Empty);
                    cVar.a(configurationR2);
                    if (context.getTheme() != null) {
                        w3.b.j(cVar.getTheme());
                    }
                    context = cVar;
                }
            }
        } else if (context instanceof n.c) {
            ((n.c) context).a(b0.r(context, iB, eVarM, null, false));
        } else if (b0.f6722o0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i7 = configuration.mcc;
                    i10 = configuration2.mcc;
                    if (i7 != i10) {
                        configuration3.mcc = i10;
                    }
                    i11 = configuration.mnc;
                    i12 = configuration2.mnc;
                    if (i11 != i12) {
                        configuration3.mnc = i12;
                    }
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 24) {
                        v.a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i14 = configuration.touchscreen;
                    i15 = configuration2.touchscreen;
                    if (i14 != i15) {
                        configuration3.touchscreen = i15;
                    }
                    i16 = configuration.keyboard;
                    i17 = configuration2.keyboard;
                    if (i16 != i17) {
                        configuration3.keyboard = i17;
                    }
                    i18 = configuration.keyboardHidden;
                    i19 = configuration2.keyboardHidden;
                    if (i18 != i19) {
                        configuration3.keyboardHidden = i19;
                    }
                    i20 = configuration.navigation;
                    i21 = configuration2.navigation;
                    if (i20 != i21) {
                        configuration3.navigation = i21;
                    }
                    i22 = configuration.navigationHidden;
                    i23 = configuration2.navigationHidden;
                    if (i22 != i23) {
                        configuration3.navigationHidden = i23;
                    }
                    i24 = configuration.orientation;
                    i25 = configuration2.orientation;
                    if (i24 != i25) {
                        configuration3.orientation = i25;
                    }
                    i26 = configuration.screenLayout & 15;
                    i27 = configuration2.screenLayout & 15;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & 192;
                    i29 = configuration2.screenLayout & 192;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 48;
                    i31 = configuration2.screenLayout & 48;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    i32 = configuration.screenLayout & 768;
                    i33 = configuration2.screenLayout & 768;
                    if (i32 != i33) {
                        configuration3.screenLayout |= i33;
                    }
                    if (i13 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i34 = configuration.uiMode & 15;
                    i35 = configuration2.uiMode & 15;
                    if (i34 != i35) {
                        configuration3.uiMode |= i35;
                    }
                    i36 = configuration.uiMode & 48;
                    i37 = configuration2.uiMode & 48;
                    if (i36 != i37) {
                        configuration3.uiMode |= i37;
                    }
                    i38 = configuration.screenWidthDp;
                    i39 = configuration2.screenWidthDp;
                    if (i38 != i39) {
                        configuration3.screenWidthDp = i39;
                    }
                    i40 = configuration.screenHeightDp;
                    i41 = configuration2.screenHeightDp;
                    if (i40 != i41) {
                        configuration3.screenHeightDp = i41;
                    }
                    i42 = configuration.smallestScreenWidthDp;
                    i43 = configuration2.smallestScreenWidthDp;
                    if (i42 != i43) {
                        configuration3.smallestScreenWidthDp = i43;
                    }
                    i44 = configuration.densityDpi;
                    i45 = configuration2.densityDpi;
                    if (i44 != i45) {
                        configuration3.densityDpi = i45;
                    }
                }
            }
            Configuration configurationR3 = b0.r(context, iB, eVarM, configuration3, true);
            cVar = new n.c(context, com.baidu.carlifevehicle.R.style.Theme_AppCompat_Empty);
            cVar.a(configurationR3);
            if (context.getTheme() != null) {
                w3.b.j(cVar.getTheme());
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((b0) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // u3.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((b0) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i7) {
        b0 b0Var = (b0) l();
        b0Var.u();
        return b0Var.f6730l.findViewById(i7);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        b0 b0Var = (b0) l();
        if (b0Var.f6735p == null) {
            b0Var.z();
            k0 k0Var = b0Var.f6734o;
            b0Var.f6735p = new n.h(k0Var != null ? k0Var.X() : b0Var.k);
        }
        return b0Var.f6735p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i7 = j3.f9797a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        b0 b0Var = (b0) l();
        if (b0Var.f6734o != null) {
            b0Var.z();
            b0Var.f6734o.getClass();
            b0Var.A(0);
        }
    }

    public final q l() {
        if (this.f6807x == null) {
            o oVar = q.f6839a;
            this.f6807x = new b0(this, null, this, this);
        }
        return this.f6807x;
    }

    @Override // c.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        b0 b0Var = (b0) l();
        if (b0Var.F && b0Var.f6745z) {
            b0Var.z();
            k0 k0Var = b0Var.f6734o;
            if (k0Var != null) {
                k0Var.a0(k0Var.f6813f.getResources().getBoolean(com.baidu.carlifevehicle.R.bool.abc_action_bar_embed_tabs));
            }
        }
        p.u uVarA = p.u.a();
        Context context = b0Var.k;
        synchronized (uVarA) {
            uVarA.f9928a.l(context);
        }
        b0Var.R = new Configuration(b0Var.k.getResources().getConfiguration());
        b0Var.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p4.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // p4.l, c.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        Intent intentB;
        if (!super.onMenuItemSelected(i7, menuItem)) {
            b0 b0Var = (b0) l();
            b0Var.z();
            k0 k0Var = b0Var.f6734o;
            if (menuItem.getItemId() != 16908332 || k0Var == null || (((e3) k0Var.f6817j).f9705b & 4) == 0 || (intentB = u3.f.b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentB2 = u3.f.b(this);
            if (intentB2 == null) {
                intentB2 = u3.f.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentC = u3.f.c(this, component);
                    while (intentC != null) {
                        arrayList.add(size, intentC);
                        intentC = u3.f.c(this, intentC.getComponent());
                    }
                    arrayList.add(intentB2);
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e7);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((b0) l()).u();
    }

    @Override // p4.l, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        b0 b0Var = (b0) l();
        b0Var.z();
        k0 k0Var = b0Var.f6734o;
        if (k0Var != null) {
            k0Var.f6831y = true;
        }
    }

    @Override // p4.l, android.app.Activity
    public void onStart() throws IllegalAccessException {
        super.onStart();
        ((b0) l()).k(true, false);
    }

    @Override // p4.l, android.app.Activity
    public void onStop() {
        super.onStop();
        b0 b0Var = (b0) l();
        b0Var.z();
        k0 k0Var = b0Var.f6734o;
        if (k0Var != null) {
            k0Var.f6831y = false;
            n.j jVar = k0Var.f6830x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        l().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((b0) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        j();
        l().g(i7);
    }

    @Override // c.o, android.app.Activity
    public void setContentView(View view) {
        j();
        l().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        l().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        super.setTheme(i7);
        ((b0) l()).T = i7;
    }
}
