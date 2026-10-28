package q0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f10571a;

    public n(d dVar) {
        this.f10571a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f10571a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f10571a.a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f10571a.f10537a.close();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f10571a.a(menu);
    }
}
