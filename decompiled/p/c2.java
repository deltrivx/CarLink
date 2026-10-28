package p;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f9692a;

    public c2(f2 f2Var) {
        this.f9692a = f2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        f2 f2Var = this.f9692a;
        if (f2Var.f9742y.isShowing()) {
            f2Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f9692a.dismiss();
    }
}
