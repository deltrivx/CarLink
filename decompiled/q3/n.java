package q3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import r2.u;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f10940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i7) {
        super(1);
        this.f10939a = i7;
        this.f10940b = oVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f10939a) {
            case 0:
                w1.a aVar = (w1.a) obj;
                o oVar = this.f10940b;
                View viewC = j.c(oVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    if (!w1.f.y(viewC, w1.f.C(aVar.f14026a), j.b(((u) q2.f.w(oVar)).getFocusOwner(), q2.f.x(oVar), viewC))) {
                        aVar.f14027b = true;
                    }
                }
                return z.f12851a;
            default:
                w1.a aVar2 = (w1.a) obj;
                o oVar2 = this.f10940b;
                View viewC2 = j.c(oVar2);
                if (viewC2.hasFocus()) {
                    w1.i focusOwner = ((u) q2.f.w(oVar2)).getFocusOwner();
                    View viewX = q2.f.x(oVar2);
                    if (viewC2 instanceof ViewGroup) {
                        Rect rectB = j.b(focusOwner, viewX, viewC2);
                        Integer numC = w1.f.C(aVar2.f14026a);
                        int iIntValue = numC != null ? numC.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oVar2.f10941o;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewX, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewX, rectB, iIntValue);
                        if (viewFindNextFocus != null && j.a(viewC2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectB);
                            aVar2.f14027b = true;
                        } else if (!viewX.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewX.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return z.f12851a;
        }
    }
}
