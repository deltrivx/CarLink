package e4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class j1 extends i1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x3.b f4364n;

    public j1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
        this.f4364n = null;
    }

    public j1(s1 s1Var, j1 j1Var) {
        super(s1Var, j1Var);
        this.f4364n = null;
        this.f4364n = j1Var.f4364n;
    }

    @Override // e4.o1
    public s1 b() {
        return s1.c(null, this.f4358c.consumeStableInsets());
    }

    @Override // e4.o1
    public s1 c() {
        return s1.c(null, this.f4358c.consumeSystemWindowInsets());
    }

    @Override // e4.o1
    public final x3.b j() {
        if (this.f4364n == null) {
            WindowInsets windowInsets = this.f4358c;
            this.f4364n = x3.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4364n;
    }

    @Override // e4.o1
    public boolean o() {
        return this.f4358c.isConsumed();
    }

    @Override // e4.o1
    public void u(x3.b bVar) {
        this.f4364n = bVar;
    }
}
