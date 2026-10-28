package r2;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, int i7) {
        super(1);
        this.f11357a = i7;
        this.f11358b = uVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        w1.d dVar;
        switch (this.f11357a) {
            case 0:
                KeyEvent keyEvent = ((i2.b) obj).f6600a;
                long jF = i2.c.F(keyEvent);
                if (i2.a.a(jF, i2.a.f6586b)) {
                    dVar = new w1.d(2);
                } else if (i2.a.a(jF, i2.a.f6587c)) {
                    dVar = new w1.d(1);
                } else if (i2.a.a(jF, i2.a.f6593i)) {
                    dVar = new w1.d(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (i2.a.a(jF, i2.a.f6591g)) {
                    dVar = new w1.d(4);
                } else if (i2.a.a(jF, i2.a.f6590f)) {
                    dVar = new w1.d(3);
                } else if (i2.a.a(jF, i2.a.f6588d) || i2.a.a(jF, i2.a.f6596m)) {
                    dVar = new w1.d(5);
                } else if (i2.a.a(jF, i2.a.f6589e) || i2.a.a(jF, i2.a.f6597n)) {
                    dVar = new w1.d(6);
                } else if (i2.a.a(jF, i2.a.f6592h) || i2.a.a(jF, i2.a.k) || i2.a.a(jF, i2.a.f6598o)) {
                    dVar = new w1.d(7);
                } else {
                    dVar = (i2.a.a(jF, i2.a.f6585a) || i2.a.a(jF, i2.a.f6595l)) ? new w1.d(8) : null;
                }
                if (dVar != null) {
                    int i7 = dVar.f14034a;
                    if (i2.c.K(keyEvent) == 2) {
                        Integer numC = w1.f.C(i7);
                        u uVar = this.f11358b;
                        x1.c embeddedViewFocusRect = uVar.getEmbeddedViewFocusRect();
                        Boolean boolE = ((w1.j) uVar.getFocusOwner()).e(i7, embeddedViewFocusRect, new o(dVar, 1));
                        if (boolE != null ? boolE.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i7 == 1 || i7 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numC != null) {
                            int iIntValue = numC.intValue();
                            Object obj2 = q1.f11372f.get();
                            i9.l.b(obj2);
                            q1 q1Var = (q1) obj2;
                            View viewB = uVar;
                            while (true) {
                                if (viewB != null) {
                                    View rootView = uVar.getRootView();
                                    i9.l.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewB = q1Var.b(iIntValue, viewB, (ViewGroup) rootView);
                                    if (viewB != null) {
                                        if (!viewB.equals(uVar)) {
                                            ViewParent parent = viewB.getParent();
                                            while (true) {
                                                if (parent != null) {
                                                    if (parent != uVar) {
                                                        parent = parent.getParent();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    viewB = null;
                                }
                            }
                            if (i9.l.a(viewB, uVar)) {
                                viewB = null;
                            }
                            if (viewB != null) {
                                Rect rectZ = embeddedViewFocusRect != null ? y1.h0.z(embeddedViewFocusRect) : null;
                                if (rectZ == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = uVar.getRootView();
                                i9.l.c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(uVar, rectZ);
                                viewGroup.offsetRectIntoDescendantCoords(viewB, rectZ);
                                if (w1.f.y(viewB, numC, rectZ)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((w1.j) uVar.getFocusOwner()).b(i7, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolE2 = ((w1.j) uVar.getFocusOwner()).e(i7, null, new o(dVar, 0));
                        return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                h9.a aVar = (h9.a) obj;
                u uVar2 = this.f11358b;
                Handler handler = uVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = uVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new com.baidu.carlife.sdk.internal.a(aVar, 6));
                    }
                }
                return t8.z.f12851a;
            default:
                u uVar3 = this.f11358b;
                return new p0(uVar3, uVar3.getTextInputService(), (cc.y) obj);
        }
    }
}
