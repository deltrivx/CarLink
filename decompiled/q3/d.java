package q3;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import o2.m0;
import o2.n0;
import o2.o0;
import o2.r;
import q2.h0;
import r3.v;
import u8.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10881c;

    public /* synthetic */ d(ViewGroup viewGroup, Object obj, int i7) {
        this.f10879a = i7;
        this.f10880b = viewGroup;
        this.f10881c = obj;
    }

    @Override // o2.m0
    public final int a(r rVar, List list, int i7) {
        switch (this.f10879a) {
            case 0:
                q qVar = (q) this.f10880b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                i9.l.b(layoutParams);
                qVar.measure(iMakeMeasureSpec, i.k(qVar, 0, i7, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return a2.f.i(this, rVar, list, i7);
        }
    }

    @Override // o2.m0
    public final n0 c(o0 o0Var, List list, long j5) {
        switch (this.f10879a) {
            case 0:
                q qVar = (q) this.f10880b;
                int childCount = qVar.getChildCount();
                x xVar = x.f13123a;
                if (childCount == 0) {
                    return o0Var.i(n3.a.j(j5), n3.a.i(j5), xVar, b.f10872c);
                }
                if (n3.a.j(j5) != 0) {
                    qVar.getChildAt(0).setMinimumWidth(n3.a.j(j5));
                }
                if (n3.a.i(j5) != 0) {
                    qVar.getChildAt(0).setMinimumHeight(n3.a.i(j5));
                }
                int iJ = n3.a.j(j5);
                int iH = n3.a.h(j5);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                i9.l.b(layoutParams);
                int iK = i.k(qVar, iJ, iH, layoutParams.width);
                int i7 = n3.a.i(j5);
                int iG = n3.a.g(j5);
                ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
                i9.l.b(layoutParams2);
                qVar.measure(iK, i.k(qVar, i7, iG, layoutParams2.height));
                return o0Var.i(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), xVar, new c(qVar, (h0) this.f10881c, 1));
            default:
                ((v) this.f10880b).setParentLayoutDirection((n3.o) this.f10881c);
                return o0Var.i(0, 0, x.f13123a, r3.d.f11541d);
        }
    }

    @Override // o2.m0
    public final int f(r rVar, List list, int i7) {
        switch (this.f10879a) {
            case 0:
                q qVar = (q) this.f10880b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                i9.l.b(layoutParams);
                qVar.measure(iMakeMeasureSpec, i.k(qVar, 0, i7, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return a2.f.d(this, rVar, list, i7);
        }
    }

    @Override // o2.m0
    public final int h(r rVar, List list, int i7) {
        switch (this.f10879a) {
            case 0:
                q qVar = (q) this.f10880b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                i9.l.b(layoutParams);
                qVar.measure(i.k(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return a2.f.b(this, rVar, list, i7);
        }
    }

    @Override // o2.m0
    public final int j(r rVar, List list, int i7) {
        switch (this.f10879a) {
            case 0:
                q qVar = (q) this.f10880b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                i9.l.b(layoutParams);
                qVar.measure(i.k(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return a2.f.g(this, rVar, list, i7);
        }
    }
}
