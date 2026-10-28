package e4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m1 extends l1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s1 f4378r = s1.c(null, WindowInsets.CONSUMED);

    public m1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
    }

    public m1(s1 s1Var, m1 m1Var) {
        super(s1Var, m1Var);
    }

    @Override // e4.i1, e4.o1
    public final void d(View view) {
    }

    @Override // e4.i1, e4.o1
    public x3.b g(int i7) {
        return x3.b.c(this.f4358c.getInsets(q1.a(i7)));
    }

    @Override // e4.i1, e4.o1
    public x3.b h(int i7) {
        return x3.b.c(this.f4358c.getInsetsIgnoringVisibility(q1.a(i7)));
    }

    @Override // e4.i1, e4.o1
    public boolean q(int i7) {
        return this.f4358c.isVisible(q1.a(i7));
    }
}
