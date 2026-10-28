package p;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f9699a;

    public d2(f2 f2Var) {
        this.f9699a = f2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        f2 f2Var = this.f9699a;
        b2 b2Var = f2Var.f9734q;
        b0 b0Var = f2Var.f9742y;
        if (i7 != 1 || b0Var.getInputMethodMode() == 2 || b0Var.getContentView() == null) {
            return;
        }
        f2Var.f9738u.removeCallbacks(b2Var);
        b2Var.run();
    }
}
