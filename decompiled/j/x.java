package j;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.baidu.carlifevehicle.R;
import e4.l0;
import e4.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f6854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f6858e;

    public x(b0 b0Var, Window.Callback callback) {
        this.f6858e = b0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6854a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6855b = true;
            callback.onContentChanged();
        } finally {
            this.f6855b = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f6854a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f6854a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        n.l.a(this.f6854a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6854a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f6856c;
        Window.Callback callback = this.f6854a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f6858e.s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        a0 a0Var;
        boolean z10;
        o.m mVar;
        boolean zPerformShortcut;
        if (!this.f6854a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            b0 b0Var = this.f6858e;
            b0Var.z();
            k0 k0Var = b0Var.f6734o;
            if (k0Var == null) {
                a0Var = b0Var.M;
                if (a0Var == null && b0Var.E(a0Var, keyEvent.getKeyCode(), keyEvent)) {
                    a0 a0Var2 = b0Var.M;
                    if (a0Var2 != null) {
                        a0Var2.f6713l = true;
                    }
                } else {
                    if (b0Var.M == null) {
                        a0 a0VarY = b0Var.y(0);
                        b0Var.F(a0VarY, keyEvent);
                        boolean zE = b0Var.E(a0VarY, keyEvent.getKeyCode(), keyEvent);
                        a0VarY.k = false;
                        if (zE) {
                        }
                    }
                }
            } else {
                j0 j0Var = k0Var.f6820n;
                if (j0Var == null || (mVar = j0Var.f6809e) == null) {
                    zPerformShortcut = false;
                } else {
                    mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    a0Var = b0Var.M;
                    if (a0Var == null) {
                        if (b0Var.M == null) {
                            a0 a0VarY2 = b0Var.y(0);
                            b0Var.F(a0VarY2, keyEvent);
                            boolean zE2 = b0Var.E(a0VarY2, keyEvent.getKeyCode(), keyEvent);
                            a0VarY2.k = false;
                            z10 = zE2;
                        }
                    } else {
                        if (b0Var.M == null) {
                            a0 a0VarY3 = b0Var.y(0);
                            b0Var.F(a0VarY3, keyEvent);
                            boolean zE3 = b0Var.E(a0VarY3, keyEvent.getKeyCode(), keyEvent);
                            a0VarY3.k = false;
                            if (zE3) {
                            }
                        }
                    }
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6854a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6854a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6854a.dispatchTrackballEvent(motionEvent);
    }

    public final n.e e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        b0 b0Var = this.f6858e;
        Context context = b0Var.k;
        da.a aVar = new da.a(context, callback);
        n.a aVar2 = b0Var.f6740u;
        if (aVar2 != null) {
            aVar2.b();
        }
        u0.k kVar = new u0.k(12, b0Var, aVar, false);
        b0Var.z();
        k0 k0Var = b0Var.f6734o;
        int i7 = 1;
        if (k0Var != null) {
            j0 j0Var = k0Var.f6820n;
            if (j0Var != null) {
                j0Var.b();
            }
            k0Var.f6815h.setHideOnContentScrollEnabled(false);
            k0Var.k.e();
            j0 j0Var2 = new j0(k0Var, k0Var.k.getContext(), kVar);
            o.m mVar = j0Var2.f6809e;
            mVar.w();
            try {
                boolean zE = ((da.a) j0Var2.f6810f.f12990b).E(j0Var2, mVar);
                mVar.v();
                if (zE) {
                    k0Var.f6820n = j0Var2;
                    j0Var2.i();
                    k0Var.k.c(j0Var2);
                    k0Var.W(true);
                } else {
                    j0Var2 = null;
                }
                b0Var.f6740u = j0Var2;
            } catch (Throwable th) {
                mVar.v();
                throw th;
            }
        }
        if (b0Var.f6740u == null) {
            r0 r0Var = b0Var.f6744y;
            if (r0Var != null) {
                r0Var.b();
            }
            n.a aVar3 = b0Var.f6740u;
            if (aVar3 != null) {
                aVar3.b();
            }
            if (b0Var.f6741v == null) {
                if (b0Var.I) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        n.c cVar = new n.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    b0Var.f6741v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    b0Var.f6742w = popupWindow;
                    a.a.T(popupWindow, 2);
                    b0Var.f6742w.setContentView(b0Var.f6741v);
                    b0Var.f6742w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    b0Var.f6741v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    b0Var.f6742w.setHeight(-2);
                    b0Var.f6743x = new r(b0Var, i7);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) b0Var.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        b0Var.z();
                        k0 k0Var2 = b0Var.f6734o;
                        Context contextX = k0Var2 != null ? k0Var2.X() : null;
                        if (contextX != null) {
                            context = contextX;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        b0Var.f6741v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (b0Var.f6741v != null) {
                r0 r0Var2 = b0Var.f6744y;
                if (r0Var2 != null) {
                    r0Var2.b();
                }
                b0Var.f6741v.e();
                Context context2 = b0Var.f6741v.getContext();
                ActionBarContextView actionBarContextView = b0Var.f6741v;
                n.d dVar = new n.d();
                dVar.f8648d = context2;
                dVar.f8649e = actionBarContextView;
                dVar.f8650f = kVar;
                o.m mVar2 = new o.m(actionBarContextView.getContext());
                mVar2.f9186l = 1;
                dVar.f8653i = mVar2;
                mVar2.f9180e = dVar;
                if (((da.a) kVar.f12990b).E(dVar, mVar2)) {
                    dVar.i();
                    b0Var.f6741v.c(dVar);
                    b0Var.f6740u = dVar;
                    if (b0Var.f6745z && (viewGroup = b0Var.A) != null && viewGroup.isLaidOut()) {
                        b0Var.f6741v.setAlpha(0.0f);
                        r0 r0VarA = l0.a(b0Var.f6741v);
                        r0VarA.a(1.0f);
                        b0Var.f6744y = r0VarA;
                        r0VarA.d(new t(i7, b0Var));
                    } else {
                        b0Var.f6741v.setAlpha(1.0f);
                        b0Var.f6741v.setVisibility(0);
                        if (b0Var.f6741v.getParent() instanceof View) {
                            View view = (View) b0Var.f6741v.getParent();
                            WeakHashMap weakHashMap = l0.f4369a;
                            e4.c0.c(view);
                        }
                    }
                    if (b0Var.f6742w != null) {
                        b0Var.f6730l.getDecorView().post(b0Var.f6743x);
                    }
                } else {
                    b0Var.f6740u = null;
                }
            }
            b0Var.H();
            b0Var.f6740u = b0Var.f6740u;
        }
        b0Var.H();
        n.a aVar4 = b0Var.f6740u;
        if (aVar4 != null) {
            return aVar.t(aVar4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6854a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6854a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6854a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6855b) {
            this.f6854a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof o.m)) {
            return this.f6854a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.f6854a.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6854a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f6854a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        if (i7 == 108) {
            b0 b0Var = this.f6858e;
            b0Var.z();
            k0 k0Var = b0Var.f6734o;
            if (k0Var != null) {
                ArrayList arrayList = k0Var.f6824r;
                if (true != k0Var.f6823q) {
                    k0Var.f6823q = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f6857d) {
            this.f6854a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        b0 b0Var = this.f6858e;
        if (i7 != 108) {
            if (i7 == 0) {
                a0 a0VarY = b0Var.y(i7);
                if (a0VarY.f6714m) {
                    b0Var.p(a0VarY, false);
                    return;
                }
                return;
            }
            return;
        }
        b0Var.z();
        k0 k0Var = b0Var.f6734o;
        if (k0Var != null) {
            ArrayList arrayList = k0Var.f6824r;
            if (k0Var.f6823q) {
                k0Var.f6823q = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        n.m.a(this.f6854a, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        o.m mVar = menu instanceof o.m ? (o.m) menu : null;
        if (i7 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f9198x = true;
        }
        boolean zOnPreparePanel = this.f6854a.onPreparePanel(i7, view, menu);
        if (mVar != null) {
            mVar.f9198x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        o.m mVar = this.f6858e.y(0).f6710h;
        if (mVar != null) {
            d(list, mVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6854a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f6854a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6854a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f6854a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return e(callback);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        return i7 != 0 ? n.k.b(this.f6854a, callback, i7) : e(callback);
    }
}
