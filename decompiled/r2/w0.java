package r2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11503b;

    public w0(Context context) {
        super(context);
        setClipChildren(false);
        this.f11502a = new HashMap();
        this.f11503b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<q3.i, q2.h0> getHolderToLayoutNode() {
        return this.f11502a;
    }

    public final HashMap<q2.h0, q3.i> getLayoutNodeToHolder() {
        return this.f11503b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (q3.i iVar : this.f11502a.keySet()) {
            iVar.layout(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            n2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            n2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        for (q3.i iVar : this.f11502a.keySet()) {
            int i12 = iVar.f10915u;
            if (i12 != Integer.MIN_VALUE && (i11 = iVar.f10916v) != Integer.MIN_VALUE) {
                iVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            q2.h0 h0Var = (q2.h0) this.f11502a.get(childAt);
            if (childAt.isLayoutRequested() && h0Var != null) {
                q2.h0.V(h0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
