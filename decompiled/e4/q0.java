package e4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4394c;

    public /* synthetic */ q0(Object obj, View view, int i7) {
        this.f4392a = i7;
        this.f4394c = obj;
        this.f4393b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4392a) {
            case 0:
                ((s0) this.f4394c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4392a) {
            case 0:
                ((s0) this.f4394c).c();
                break;
            default:
                b1 b1Var = (b1) this.f4394c;
                b1Var.f4321a.e(1.0f);
                x0.f(this.f4393b, b1Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4392a) {
            case 0:
                ((s0) this.f4394c).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
