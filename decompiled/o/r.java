package o;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f9230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f9231b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9231b = tVar;
        this.f9230a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f9230a.onMenuItemActionCollapse(this.f9231b.i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f9230a.onMenuItemActionExpand(this.f9231b.i(menuItem));
    }
}
