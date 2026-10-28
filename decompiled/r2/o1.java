package r2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11356a;

    public o1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(y1.o oVar, s2 s2Var, long j5) {
        super.drawChild(y1.c.a(oVar), s2Var, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            i9.l.c(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((s2) childAt).f11414h) {
                this.f11356a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f11356a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f11356a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
