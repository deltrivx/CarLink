package j;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ContentFrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f6862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, n.c cVar) {
        super(cVar, null);
        this.f6862i = b0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6862i.s(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (x8 < -5 || y5 < -5 || x8 > getWidth() + 5 || y5 > getHeight() + 5) {
                b0 b0Var = this.f6862i;
                b0Var.p(b0Var.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(o9.e0.z(getContext(), i7));
    }
}
