package o;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import cc.o1;
import com.baidu.carlifevehicle.R;
import e4.o0;
import java.util.Iterator;
import r2.g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9132b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f9131a = i7;
        this.f9132b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f9131a) {
            case 0:
            case 1:
                break;
            case 2:
                r2.b0 b0Var = (r2.b0) this.f9132b;
                AccessibilityManager accessibilityManager = b0Var.f11172g;
                b0Var.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(b0Var.f11174i);
                accessibilityManager.addTouchExplorationStateChangeListener(b0Var.f11175j);
                break;
            case 3:
            case 4:
                break;
            default:
                y1.e eVar = (y1.e) this.f9132b;
                Context context = view.getContext();
                if (!eVar.f14888d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.f14889e);
                    eVar.f14888d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        switch (this.f9131a) {
            case 0:
                g gVar = (g) this.f9132b;
                ViewTreeObserver viewTreeObserver = gVar.f9158x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f9158x = view.getViewTreeObserver();
                    }
                    gVar.f9158x.removeGlobalOnLayoutListener(gVar.f9144i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                d0 d0Var = (d0) this.f9132b;
                ViewTreeObserver viewTreeObserver2 = d0Var.f9125o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f9125o = view.getViewTreeObserver();
                    }
                    d0Var.f9125o.removeGlobalOnLayoutListener(d0Var.f9120i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                r2.b0 b0Var = (r2.b0) this.f9132b;
                b0Var.f11176l.removeCallbacks(b0Var.N);
                AccessibilityManager accessibilityManager = b0Var.f11172g;
                accessibilityManager.removeAccessibilityStateChangeListener(b0Var.f11174i);
                accessibilityManager.removeTouchExplorationStateChangeListener(b0Var.f11175j);
                break;
            case 3:
                r2.a aVar = (r2.a) this.f9132b;
                Iterator it = yb.l.R(aVar.getParent(), o0.f4384i).iterator();
                while (true) {
                    z10 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            i9.l.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    g3 g3Var = aVar.f11134c;
                    if (g3Var != null) {
                        g3Var.f();
                    }
                    aVar.f11134c = null;
                    aVar.requestLayout();
                }
                break;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                ((o1) this.f9132b).a(null);
                break;
            default:
                y1.e eVar = (y1.e) this.f9132b;
                Context context = view.getContext();
                if (eVar.f14888d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.f14889e);
                    eVar.f14888d = false;
                }
                break;
        }
    }
}
