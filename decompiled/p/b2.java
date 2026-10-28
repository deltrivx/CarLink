package p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f9678b;

    public /* synthetic */ b2(f2 f2Var, int i7) {
        this.f9677a = i7;
        this.f9678b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9677a) {
            case 0:
                s1 s1Var = this.f9678b.f9721c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                }
                break;
            default:
                f2 f2Var = this.f9678b;
                s1 s1Var2 = f2Var.f9721c;
                if (s1Var2 != null && s1Var2.isAttachedToWindow() && f2Var.f9721c.getCount() > f2Var.f9721c.getChildCount() && f2Var.f9721c.getChildCount() <= f2Var.f9730m) {
                    f2Var.f9742y.setInputMethodMode(2);
                    f2Var.f();
                    break;
                }
                break;
        }
    }
}
