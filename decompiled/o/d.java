package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.k2;
import p.o0;
import p.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9112b;

    public /* synthetic */ d(int i7, Object obj) {
        this.f9111a = i7;
        this.f9112b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9111a) {
            case 0:
                g gVar = (g) this.f9112b;
                ArrayList arrayList = gVar.f9143h;
                if (gVar.a() && arrayList.size() > 0 && !((f) arrayList.get(0)).f9134a.f9741x) {
                    View view = gVar.f9149o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).f9134a.f();
                        }
                    } else {
                        gVar.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                d0 d0Var = (d0) this.f9112b;
                k2 k2Var = d0Var.f9119h;
                if (d0Var.a() && !k2Var.f9741x) {
                    View view2 = d0Var.f9123m;
                    if (view2 != null && view2.isShown()) {
                        k2Var.f();
                    } else {
                        d0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                r0 r0Var = (r0) this.f9112b;
                if (!r0Var.getInternalPopup().a()) {
                    r0Var.f9889f.m(r0Var.getTextDirection(), r0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                o0 o0Var = (o0) this.f9112b;
                r0 r0Var2 = o0Var.G;
                o0Var.getClass();
                if (r0Var2.isAttachedToWindow() && r0Var2.getGlobalVisibleRect(o0Var.E)) {
                    o0Var.r();
                    o0Var.f();
                } else {
                    o0Var.dismiss();
                }
                break;
        }
    }
}
