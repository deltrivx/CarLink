package j;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import e4.l0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f6806g;

    public /* synthetic */ i0(k0 k0Var, int i7) {
        this.f6805f = i7;
        this.f6806g = k0Var;
    }

    @Override // e4.s0
    public final void c() {
        View view;
        int i7 = this.f6805f;
        k0 k0Var = this.f6806g;
        switch (i7) {
            case 0:
                if (k0Var.f6826t && (view = k0Var.f6818l) != null) {
                    view.setTranslationY(0.0f);
                    k0Var.f6816i.setTranslationY(0.0f);
                }
                k0Var.f6816i.setVisibility(8);
                k0Var.f6816i.setTransitioning(false);
                k0Var.f6830x = null;
                u0.k kVar = k0Var.f6822p;
                if (kVar != null) {
                    kVar.a1(k0Var.f6821o);
                    k0Var.f6821o = null;
                    k0Var.f6822p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k0Var.f6815h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = l0.f4369a;
                    e4.c0.c(actionBarOverlayLayout);
                }
                break;
            default:
                k0Var.f6830x = null;
                k0Var.f6816i.requestLayout();
                break;
        }
    }
}
