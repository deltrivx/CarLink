package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements o.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o.m f9989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o.o f9990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9991c;

    public z2(Toolbar toolbar) {
        this.f9991c = toolbar;
    }

    @Override // o.y
    public final void b(o.m mVar, boolean z10) {
    }

    @Override // o.y
    public final void c(Context context, o.m mVar) {
        o.o oVar;
        o.m mVar2 = this.f9989a;
        if (mVar2 != null && (oVar = this.f9990b) != null) {
            mVar2.d(oVar);
        }
        this.f9989a = mVar;
    }

    @Override // o.y
    public final boolean d() {
        return false;
    }

    @Override // o.y
    public final boolean e(o.e0 e0Var) {
        return false;
    }

    @Override // o.y
    public final void g() {
        if (this.f9990b != null) {
            o.m mVar = this.f9989a;
            if (mVar != null) {
                int size = mVar.f9181f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f9989a.getItem(i7) == this.f9990b) {
                        return;
                    }
                }
            }
            k(this.f9990b);
        }
    }

    @Override // o.y
    public final boolean i(o.o oVar) {
        Toolbar toolbar = this.f9991c;
        toolbar.c();
        ViewParent parent = toolbar.f722h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f722h);
            }
            toolbar.addView(toolbar.f722h);
        }
        View actionView = oVar.getActionView();
        toolbar.f723i = actionView;
        this.f9990b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f723i);
            }
            a3 a3VarH = Toolbar.h();
            a3VarH.f9673a = (toolbar.f727n & 112) | 8388611;
            a3VarH.f9674b = 2;
            toolbar.f723i.setLayoutParams(a3VarH);
            toolbar.addView(toolbar.f723i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((a3) childAt.getLayoutParams()).f9674b != 2 && childAt != toolbar.f715a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f9214n.p(false);
        KeyEvent.Callback callback = toolbar.f723i;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f9229a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // o.y
    public final boolean k(o.o oVar) {
        Toolbar toolbar = this.f9991c;
        KeyEvent.Callback callback = toolbar.f723i;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f9229a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f723i);
        toolbar.removeView(toolbar.f722h);
        toolbar.f723i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f9990b = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f9214n.p(false);
        toolbar.t();
        return true;
    }
}
