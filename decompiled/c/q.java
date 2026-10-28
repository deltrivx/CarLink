package c;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends Dialog implements androidx.lifecycle.t, a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.f f1790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f1791c;

    public q(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, i7);
        this.f1790b = new a5.f(new c5.a(this, new a5.e(0, this)));
        this.f1791c = new l0(new androidx.lifecycle.z(3, this));
    }

    public static void a(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i9.l.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        i9.l.b(window);
        View decorView = window.getDecorView();
        i9.l.d(decorView, "window!!.decorView");
        androidx.lifecycle.i0.h(decorView, this);
        Window window2 = getWindow();
        i9.l.b(window2);
        View decorView2 = window2.getDecorView();
        i9.l.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        i9.l.b(window3);
        View decorView3 = window3.getDecorView();
        i9.l.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return this.f1790b.f46b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        androidx.lifecycle.v vVar = this.f1789a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this, true);
        this.f1789a = vVar2;
        return vVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1791c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i9.l.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            l0 l0Var = this.f1791c;
            l0Var.f1757e = onBackInvokedDispatcher;
            l0Var.d(l0Var.f1759g);
        }
        this.f1790b.a(bundle);
        androidx.lifecycle.v vVar = this.f1789a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1789a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        i9.l.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f1790b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.f1789a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1789a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.v vVar = this.f1789a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1789a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_DESTROY);
        this.f1789a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        b();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        i9.l.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i9.l.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
