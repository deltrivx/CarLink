package e4;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4416e;

    public v0(View view, b1 b1Var, android.support.v4.media.session.r rVar, ValueAnimator valueAnimator) {
        this.f4413b = view;
        this.f4414c = b1Var;
        this.f4415d = rVar;
        this.f4416e = valueAnimator;
    }

    public v0(l0.o0 o0Var, o.f fVar, o.o oVar, o.m mVar) {
        this.f4416e = o0Var;
        this.f4413b = fVar;
        this.f4414c = oVar;
        this.f4415d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4412a) {
            case 0:
                x0.i((View) this.f4413b, (b1) this.f4414c, (android.support.v4.media.session.r) this.f4415d);
                ((ValueAnimator) this.f4416e).start();
                break;
            default:
                o.g gVar = (o.g) ((l0.o0) this.f4416e).f7772b;
                o.o oVar = (o.o) this.f4414c;
                o.f fVar = (o.f) this.f4413b;
                if (fVar != null) {
                    gVar.f9160z = true;
                    fVar.f9135b.c(false);
                    gVar.f9160z = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((o.m) this.f4415d).q(oVar, null, 4);
                    break;
                }
                break;
        }
    }
}
