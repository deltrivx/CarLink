package e4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends m1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s1 f4383s = s1.c(null, WindowInsets.CONSUMED);

    public n1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
    }

    public n1(s1 s1Var, n1 n1Var) {
        super(s1Var, n1Var);
    }

    @Override // e4.m1, e4.i1, e4.o1
    public x3.b g(int i7) {
        return x3.b.c(this.f4358c.getInsets(r1.a(i7)));
    }

    @Override // e4.m1, e4.i1, e4.o1
    public x3.b h(int i7) {
        return x3.b.c(this.f4358c.getInsetsIgnoringVisibility(r1.a(i7)));
    }

    @Override // e4.m1, e4.i1, e4.o1
    public boolean q(int i7) {
        return this.f4358c.isVisible(r1.a(i7));
    }
}
