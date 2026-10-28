package e4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f4418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f4419b;

    public w0(View view, t0 t0Var) {
        s1 s1VarB;
        this.f4418a = t0Var;
        s1 s1VarF = l0.f(view);
        if (s1VarF != null) {
            int i7 = Build.VERSION.SDK_INT;
            s1VarB = (i7 >= 34 ? new g1(s1VarF) : i7 >= 30 ? new f1(s1VarF) : i7 >= 29 ? new e1(s1VarF) : new d1(s1VarF)).b();
        } else {
            s1VarB = null;
        }
        this.f4419b = s1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f4419b = s1.c(view, windowInsets);
            return x0.j(view, windowInsets);
        }
        s1 s1VarC = s1.c(view, windowInsets);
        o1 o1Var = s1VarC.f4398a;
        if (this.f4419b == null) {
            this.f4419b = l0.f(view);
        }
        if (this.f4419b == null) {
            this.f4419b = s1VarC;
            return x0.j(view, windowInsets);
        }
        t0 t0VarK = x0.k(view);
        if (t0VarK != null && Objects.equals((s1) t0VarK.f4401b, s1VarC)) {
            return x0.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        s1 s1Var = this.f4419b;
        int i7 = 1;
        while (i7 <= 512) {
            x3.b bVarG = o1Var.g(i7);
            x3.b bVarG2 = s1Var.f4398a.g(i7);
            int i10 = bVarG.f14563a;
            int i11 = bVarG.f14566d;
            int i12 = bVarG.f14565c;
            int i13 = bVarG.f14564b;
            int i14 = bVarG2.f14563a;
            int i15 = bVarG2.f14566d;
            int i16 = bVarG2.f14565c;
            int i17 = bVarG2.f14564b;
            boolean z10 = i10 > i14 || i13 > i17 || i12 > i16 || i11 > i15;
            if (z10 != (i10 < i14 || i13 < i17 || i12 < i16 || i11 < i15)) {
                if (z10) {
                    iArr[0] = iArr[0] | i7;
                } else {
                    iArr2[0] = iArr2[0] | i7;
                }
            }
            i7 <<= 1;
            iArr = iArr;
        }
        int i18 = iArr[0];
        int i19 = iArr2[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f4419b = s1VarC;
            return x0.j(view, windowInsets);
        }
        s1 s1Var2 = this.f4419b;
        if ((i18 & 8) != 0) {
            interpolator = x0.f4425e;
        } else if ((i19 & 8) != 0) {
            interpolator = x0.f4426f;
        } else if ((i18 & 519) != 0) {
            interpolator = x0.f4427g;
        } else {
            interpolator = (i19 & 519) != 0 ? x0.f4428h : null;
        }
        b1 b1Var = new b1(i20, interpolator, (i20 & 8) != 0 ? 160L : 250L);
        b1Var.f4321a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(b1Var.f4321a.b());
        x3.b bVarG3 = o1Var.g(i20);
        x3.b bVarG4 = s1Var2.f4398a.g(i20);
        int iMin = Math.min(bVarG3.f14563a, bVarG4.f14563a);
        int i21 = bVarG3.f14564b;
        int i22 = bVarG4.f14564b;
        int iMin2 = Math.min(i21, i22);
        int i23 = bVarG3.f14565c;
        int i24 = bVarG4.f14565c;
        int iMin3 = Math.min(i23, i24);
        int i25 = bVarG3.f14566d;
        int i26 = bVarG4.f14566d;
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(5, x3.b.b(iMin, iMin2, iMin3, Math.min(i25, i26)), x3.b.b(Math.max(bVarG3.f14563a, bVarG4.f14563a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        x0.g(view, b1Var, s1VarC, false);
        duration.addUpdateListener(new u0(b1Var, s1VarC, s1Var2, i20, view));
        duration.addListener(new q0(b1Var, view, 1));
        v0 v0Var = new v0(view, b1Var, rVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        q qVar = new q(view, v0Var);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        this.f4419b = s1VarC;
        return x0.j(view, windowInsets);
    }
}
