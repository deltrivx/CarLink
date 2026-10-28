package r3;

import android.content.Context;
import android.view.View;
import android.view.Window;
import e4.e0;
import e4.l0;
import e4.s1;
import f1.k1;
import f1.w1;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends r2.a implements e4.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f11579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f11580j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11583n;

    public r(Context context, Window window) {
        super(context);
        this.f11579i = window;
        this.f11580j = f1.b.s(p.f11577a);
        WeakHashMap weakHashMap = l0.f4369a;
        e0.i(this, this);
        l0.l(this, new q3.a(this, 1));
    }

    @Override // r2.a
    public final void a(int i7, f1.s sVar) {
        sVar.Y(1735448596);
        int i10 = (sVar.h(this) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 3) != 2)) {
            ((h9.n) this.f11580j.getValue()).invoke(sVar, 0);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c1.n(this, i7, 5);
        }
    }

    @Override // e4.o
    public final s1 d(View view, s1 s1Var) {
        if (!this.f11581l) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return s1Var.f4398a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return s1Var;
    }

    @Override // r2.a
    public final void e(boolean z10, int i7, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i13 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i14 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // r2.a
    public final void f(int i7, int i10) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i7, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        Window window = this.f11579i;
        int i11 = (mode != Integer.MIN_VALUE || this.k || this.f11581l || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i12 = size - paddingRight;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = i11 - paddingBottom;
        int i14 = i13 >= 0 ? i13 : 0;
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        childAt.measure(i7, i10);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f11581l || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.k) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // r2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11583n;
    }
}
