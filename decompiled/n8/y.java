package n8;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.i0;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlifevehicle.R;
import r2.i1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Presentation implements androidx.lifecycle.t, a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceView f8958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager.LayoutParams f8959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.n f8960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.v f8961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t8.o f8962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Display display, SurfaceView surfaceView, WindowManager.LayoutParams layoutParams, n1.c cVar, int i7) {
        super(a.b().createDisplayContext(display), display);
        surfaceView = (i7 & 2) != 0 ? null : surfaceView;
        cVar = (i7 & 8) != 0 ? null : cVar;
        i9.l.e(display, "display");
        this.f8958a = surfaceView;
        this.f8959b = layoutParams;
        this.f8960c = cVar;
        this.f8961d = new androidx.lifecycle.v(this, true);
        this.f8962e = t8.a.d(new a5.e(15, this));
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return ((a5.f) this.f8962e.getValue()).f46b;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f8961d.g(androidx.lifecycle.o.f1056a);
        super.dismiss();
        Logger.INSTANCE.d("CarLife_Vehicle", "【普通副屏】Presentation 关闭");
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        return this.f8961d;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        t8.o oVar = this.f8962e;
        ((a5.f) oVar.getValue()).f45a.a();
        ((a5.f) oVar.getValue()).a(bundle);
        androidx.lifecycle.v vVar = this.f8961d;
        vVar.c("setCurrentState");
        vVar.e(androidx.lifecycle.o.f1058c);
        int i7 = 1;
        View view = this.f8958a;
        if (view != null) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【普通副屏】加载 SurfaceView");
            setContentView(view);
        }
        h9.n nVar = this.f8960c;
        if (nVar != null) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【普通副屏】加载 ComposeView");
            Context context = getContext();
            i9.l.d(context, "getContext(...)");
            i1 i1Var = new i1(context);
            i0.h(i1Var, this);
            i1Var.setTag(R.id.view_tree_saved_state_registry_owner, this);
            i1Var.setContent(new n1.c(new x(i7, nVar), 2001322895, true));
            setContentView(i1Var);
        }
        WindowManager.LayoutParams layoutParams = this.f8959b;
        if (layoutParams == null || (window = getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = layoutParams.width;
        attributes.height = layoutParams.height;
        attributes.x = layoutParams.x;
        attributes.y = layoutParams.y;
        window.setAttributes(attributes);
    }

    @Override // android.app.Presentation
    public final void onDisplayRemoved() {
        super.onDisplayRemoved();
        this.f8961d.g(androidx.lifecycle.o.f1056a);
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1059d;
        androidx.lifecycle.v vVar = this.f8961d;
        vVar.g(oVar);
        vVar.g(androidx.lifecycle.o.f1060e);
        Logger.INSTANCE.d("CarLife_Vehicle", "【普通副屏】Presentation 启动");
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStop() {
        super.onStop();
    }
}
