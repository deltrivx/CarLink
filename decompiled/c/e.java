package c;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1711b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f1710a = i7;
        this.f1711b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        Window window;
        View viewPeekDecorView;
        switch (this.f1710a) {
            case 0:
                p4.l lVar = (p4.l) this.f1711b;
                if (nVar == androidx.lifecycle.n.ON_STOP && (window = lVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                p4.l lVar2 = (p4.l) this.f1711b;
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    lVar2.f1772b.f3909b = null;
                    if (!lVar2.isChangingConfigurations()) {
                        lVar2.b().a();
                    }
                    j jVar = lVar2.f1776f;
                    p4.l lVar3 = jVar.f1737d;
                    lVar3.getWindow().getDecorView().removeCallbacks(jVar);
                    lVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                }
                break;
            default:
                c5.a aVar = (c5.a) this.f1711b;
                if (nVar == androidx.lifecycle.n.ON_START) {
                    aVar.f2432h = true;
                } else if (nVar == androidx.lifecycle.n.ON_STOP) {
                    aVar.f2432h = false;
                }
                break;
        }
    }
}
