package e4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f4406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f4408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4410e;

    public u0(b1 b1Var, s1 s1Var, s1 s1Var2, int i7, View view) {
        this.f4406a = b1Var;
        this.f4407b = s1Var;
        this.f4408c = s1Var2;
        this.f4409d = i7;
        this.f4410e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h1 e1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        b1 b1Var = this.f4406a;
        a1 a1Var = b1Var.f4321a;
        a1Var.e(animatedFraction);
        s1 s1Var = this.f4407b;
        o1 o1Var = s1Var.f4398a;
        float fC = a1Var.c();
        PathInterpolator pathInterpolator = x0.f4425e;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            e1Var = new g1(s1Var);
        } else if (i7 >= 30) {
            e1Var = new f1(s1Var);
        } else {
            e1Var = i7 >= 29 ? new e1(s1Var) : new d1(s1Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f4409d & i10) == 0) {
                e1Var.c(i10, o1Var.g(i10));
            } else {
                x3.b bVarG = o1Var.g(i10);
                x3.b bVarG2 = this.f4408c.f4398a.g(i10);
                float f10 = 1.0f - fC;
                e1Var.c(i10, s1.a(bVarG, (int) (((double) ((bVarG.f14563a - bVarG2.f14563a) * f10)) + 0.5d), (int) (((double) ((bVarG.f14564b - bVarG2.f14564b) * f10)) + 0.5d), (int) (((double) ((bVarG.f14565c - bVarG2.f14565c) * f10)) + 0.5d), (int) (((double) ((bVarG.f14566d - bVarG2.f14566d) * f10)) + 0.5d)));
            }
        }
        x0.h(this.f4410e, e1Var.b(), Collections.singletonList(b1Var));
    }
}
