package e4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class l1 extends k1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x3.b f4374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x3.b f4375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x3.b f4376q;

    public l1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
        this.f4374o = null;
        this.f4375p = null;
        this.f4376q = null;
    }

    public l1(s1 s1Var, l1 l1Var) {
        super(s1Var, l1Var);
        this.f4374o = null;
        this.f4375p = null;
        this.f4376q = null;
    }

    @Override // e4.o1
    public x3.b i() {
        if (this.f4375p == null) {
            this.f4375p = x3.b.c(this.f4358c.getMandatorySystemGestureInsets());
        }
        return this.f4375p;
    }

    @Override // e4.o1
    public x3.b k() {
        if (this.f4374o == null) {
            this.f4374o = x3.b.c(this.f4358c.getSystemGestureInsets());
        }
        return this.f4374o;
    }

    @Override // e4.o1
    public x3.b m() {
        if (this.f4376q == null) {
            this.f4376q = x3.b.c(this.f4358c.getTappableElementInsets());
        }
        return this.f4376q;
    }

    @Override // e4.i1, e4.o1
    public s1 n(int i7, int i10, int i11, int i12) {
        return s1.c(null, this.f4358c.inset(i7, i10, i11, i12));
    }

    @Override // e4.j1, e4.o1
    public void u(x3.b bVar) {
    }
}
