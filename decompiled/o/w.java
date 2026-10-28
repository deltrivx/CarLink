package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f9239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f9242e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f9245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f9246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f9247j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9243f = 8388611;
    public final v k = new v(this);

    public w(Context context, m mVar, View view, boolean z10, int i7, int i10) {
        this.f9238a = context;
        this.f9239b = mVar;
        this.f9242e = view;
        this.f9240c = z10;
        this.f9241d = i7;
    }

    public final u a() {
        u d0Var;
        if (this.f9246i == null) {
            Context context = this.f9238a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(context, this.f9242e, this.f9241d, this.f9240c);
            } else {
                d0Var = new d0(this.f9238a, this.f9239b, this.f9242e, this.f9241d, this.f9240c);
            }
            d0Var.l(this.f9239b);
            d0Var.r(this.k);
            d0Var.n(this.f9242e);
            d0Var.j(this.f9245h);
            d0Var.o(this.f9244g);
            d0Var.p(this.f9243f);
            this.f9246i = d0Var;
        }
        return this.f9246i;
    }

    public final boolean b() {
        u uVar = this.f9246i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.f9246i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9247j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        u uVarA = a();
        uVarA.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f9243f, this.f9242e.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f9242e.getWidth();
            }
            uVarA.q(i7);
            uVarA.t(i10);
            int i11 = (int) ((this.f9238a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uVarA.f9236a = new Rect(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        }
        uVarA.f();
    }
}
