package e4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class e1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4341c;

    public e1() {
        this.f4341c = b2.g.c();
    }

    public e1(s1 s1Var) {
        super(s1Var);
        WindowInsets windowInsetsB = s1Var.b();
        this.f4341c = windowInsetsB != null ? b2.g.d(windowInsetsB) : b2.g.c();
    }

    @Override // e4.h1
    public s1 b() {
        a();
        s1 s1VarC = s1.c(null, this.f4341c.build());
        s1VarC.f4398a.r(this.f4352b);
        return s1VarC;
    }

    @Override // e4.h1
    public void d(x3.b bVar) {
        this.f4341c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // e4.h1
    public void e(x3.b bVar) {
        this.f4341c.setStableInsets(bVar.d());
    }

    @Override // e4.h1
    public void f(x3.b bVar) {
        this.f4341c.setSystemGestureInsets(bVar.d());
    }

    @Override // e4.h1
    public void g(x3.b bVar) {
        this.f4341c.setSystemWindowInsets(bVar.d());
    }

    @Override // e4.h1
    public void h(x3.b bVar) {
        this.f4341c.setTappableElementInsets(bVar.d());
    }
}
