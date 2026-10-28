package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f9939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f9940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1 f9941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f9944i = new int[2];

    public v1(View view) {
        this.f9939d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9936a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9937b = tapTimeout;
        this.f9938c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u1 u1Var = this.f9941f;
        View view = this.f9939d;
        if (u1Var != null) {
            view.removeCallbacks(u1Var);
        }
        u1 u1Var2 = this.f9940e;
        if (u1Var2 != null) {
            view.removeCallbacks(u1Var2);
        }
    }

    public abstract o.c0 b();

    public abstract boolean c();

    public boolean d() {
        o.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.a()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        s1 s1VarH;
        boolean z11 = this.f9942g;
        View view2 = this.f9939d;
        if (z11) {
            o.c0 c0VarB = b();
            if (c0VarB != null && c0VarB.a() && (s1VarH = c0VarB.h()) != null && s1VarH.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f9944i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                s1VarH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = s1VarH.b(motionEventObtainNoHistory, this.f9943h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f9943h = motionEvent.getPointerId(0);
                    if (this.f9940e == null) {
                        this.f9940e = new u1(this, 0);
                    }
                    view2.postDelayed(this.f9940e, this.f9937b);
                    if (this.f9941f == null) {
                        this.f9941f = new u1(this, 1);
                    }
                    view2.postDelayed(this.f9941f, this.f9938c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f9943h);
                    if (iFindPointerIndex >= 0) {
                        float x8 = motionEvent.getX(iFindPointerIndex);
                        float y5 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f9936a;
                        float f11 = -f10;
                        if (x8 < f11 || y5 < f11 || x8 >= (view2.getRight() - view2.getLeft()) + f10 || y5 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z10 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f9942g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9942g = false;
        this.f9943h = -1;
        u1 u1Var = this.f9940e;
        if (u1Var != null) {
            this.f9939d.removeCallbacks(u1Var);
        }
    }
}
