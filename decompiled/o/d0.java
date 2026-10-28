package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import p.k2;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f9114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k2 f9119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f9120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f9121j;
    public PopupWindow.OnDismissListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f9122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f9123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f9124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f9125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9129s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9130t;

    public d0(Context context, m mVar, View view, int i7, boolean z10) {
        int i10 = 1;
        this.f9120i = new d(i10, this);
        this.f9121j = new e(i10, this);
        this.f9113b = context;
        this.f9114c = mVar;
        this.f9116e = z10;
        this.f9115d = new j(mVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f9118g = i7;
        Resources resources = context.getResources();
        this.f9117f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9122l = view;
        this.f9119h = new k2(context, null, i7);
        mVar.b(this, context);
    }

    @Override // o.c0
    public final boolean a() {
        return !this.f9126p && this.f9119h.f9742y.isShowing();
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        if (mVar != this.f9114c) {
            return;
        }
        dismiss();
        x xVar = this.f9124n;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    @Override // o.y
    public final boolean d() {
        return false;
    }

    @Override // o.c0
    public final void dismiss() {
        if (a()) {
            this.f9119h.dismiss();
        }
    }

    @Override // o.y
    public final boolean e(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f9113b, e0Var, this.f9123m, this.f9116e, this.f9118g, 0);
            x xVar = this.f9124n;
            wVar.f9245h = xVar;
            u uVar = wVar.f9246i;
            if (uVar != null) {
                uVar.j(xVar);
            }
            int size = e0Var.f9181f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            wVar.f9244g = z10;
            u uVar2 = wVar.f9246i;
            if (uVar2 != null) {
                uVar2.o(z10);
            }
            wVar.f9247j = this.k;
            this.k = null;
            this.f9114c.c(false);
            k2 k2Var = this.f9119h;
            int width = k2Var.f9724f;
            int iN = k2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f9129s, this.f9122l.getLayoutDirection()) & 7) == 5) {
                width += this.f9122l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f9242e != null) {
                    wVar.d(width, iN, true, true);
                }
            }
            x xVar2 = this.f9124n;
            if (xVar2 != null) {
                xVar2.J(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.c0
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.f9126p || (view = this.f9122l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9123m = view;
        k2 k2Var = this.f9119h;
        p.b0 b0Var = k2Var.f9742y;
        p.b0 b0Var2 = k2Var.f9742y;
        b0Var.setOnDismissListener(this);
        k2Var.f9733p = this;
        k2Var.f9741x = true;
        b0Var2.setFocusable(true);
        View view2 = this.f9123m;
        boolean z10 = this.f9125o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9125o = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9120i);
        }
        view2.addOnAttachStateChangeListener(this.f9121j);
        k2Var.f9732o = view2;
        k2Var.f9729l = this.f9129s;
        boolean z11 = this.f9127q;
        Context context = this.f9113b;
        j jVar = this.f9115d;
        if (!z11) {
            this.f9128r = u.m(jVar, context, this.f9117f);
            this.f9127q = true;
        }
        k2Var.q(this.f9128r);
        b0Var2.setInputMethodMode(2);
        Rect rect = this.f9236a;
        k2Var.f9740w = rect != null ? new Rect(rect) : null;
        k2Var.f();
        s1 s1Var = k2Var.f9721c;
        s1Var.setOnKeyListener(this);
        if (this.f9130t) {
            m mVar = this.f9114c;
            if (mVar.f9187m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f9187m);
                }
                frameLayout.setEnabled(false);
                s1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k2Var.o(jVar);
        k2Var.f();
    }

    @Override // o.y
    public final void g() {
        this.f9127q = false;
        j jVar = this.f9115d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final s1 h() {
        return this.f9119h.f9721c;
    }

    @Override // o.y
    public final void j(x xVar) {
        this.f9124n = xVar;
    }

    @Override // o.u
    public final void l(m mVar) {
    }

    @Override // o.u
    public final void n(View view) {
        this.f9122l = view;
    }

    @Override // o.u
    public final void o(boolean z10) {
        this.f9115d.f9171c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9126p = true;
        this.f9114c.c(true);
        ViewTreeObserver viewTreeObserver = this.f9125o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9125o = this.f9123m.getViewTreeObserver();
            }
            this.f9125o.removeGlobalOnLayoutListener(this.f9120i);
            this.f9125o = null;
        }
        this.f9123m.removeOnAttachStateChangeListener(this.f9121j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(int i7) {
        this.f9129s = i7;
    }

    @Override // o.u
    public final void q(int i7) {
        this.f9119h.f9724f = i7;
    }

    @Override // o.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // o.u
    public final void s(boolean z10) {
        this.f9130t = z10;
    }

    @Override // o.u
    public final void t(int i7) {
        this.f9119h.k(i7);
    }
}
