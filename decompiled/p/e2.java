package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f9703a;

    public e2(f2 f2Var) {
        this.f9703a = f2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f2 f2Var = this.f9703a;
        b2 b2Var = f2Var.f9734q;
        Handler handler = f2Var.f9738u;
        b0 b0Var = f2Var.f9742y;
        int action = motionEvent.getAction();
        int x8 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (action == 0 && b0Var != null && b0Var.isShowing() && x8 >= 0 && x8 < b0Var.getWidth() && y5 >= 0 && y5 < b0Var.getHeight()) {
            handler.postDelayed(b2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(b2Var);
        return false;
    }
}
