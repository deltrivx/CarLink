package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import e4.l0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6853g;

    public /* synthetic */ t(int i7, Object obj) {
        this.f6852f = i7;
        this.f6853g = obj;
    }

    @Override // a.a, e4.s0
    public void b() {
        int i7 = this.f6852f;
        Object obj = this.f6853g;
        switch (i7) {
            case 0:
                ((r) obj).f6849b.f6741v.setVisibility(0);
                break;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.f6741v.setVisibility(0);
                if (b0Var.f6741v.getParent() instanceof View) {
                    View view = (View) b0Var.f6741v.getParent();
                    WeakHashMap weakHashMap = l0.f4369a;
                    e4.c0.c(view);
                }
                break;
        }
    }

    @Override // e4.s0
    public final void c() {
        int i7 = this.f6852f;
        Object obj = this.f6853g;
        switch (i7) {
            case 0:
                b0 b0Var = ((r) obj).f6849b;
                b0Var.f6741v.setAlpha(1.0f);
                b0Var.f6744y.d(null);
                b0Var.f6744y = null;
                break;
            case 1:
                b0 b0Var2 = (b0) obj;
                b0Var2.f6741v.setAlpha(1.0f);
                b0Var2.f6744y.d(null);
                b0Var2.f6744y = null;
                break;
            default:
                b0 b0Var3 = (b0) ((u0.k) obj).f12991c;
                b0Var3.f6741v.setVisibility(8);
                PopupWindow popupWindow = b0Var3.f6742w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b0Var3.f6741v.getParent() instanceof View) {
                    View view = (View) b0Var3.f6741v.getParent();
                    WeakHashMap weakHashMap = l0.f4369a;
                    e4.c0.c(view);
                }
                b0Var3.f6741v.e();
                b0Var3.f6744y.d(null);
                b0Var3.f6744y = null;
                ViewGroup viewGroup = b0Var3.A;
                WeakHashMap weakHashMap2 = l0.f4369a;
                e4.c0.c(viewGroup);
                break;
        }
    }
}
