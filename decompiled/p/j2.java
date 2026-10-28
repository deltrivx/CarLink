package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends s1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g2 f9795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o.o f9796p;

    public j2(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f9793m = 21;
            this.f9794n = 22;
        } else {
            this.f9793m = 22;
            this.f9794n = 21;
        }
    }

    @Override // p.s1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.j jVar;
        int headersCount;
        int iPointToPosition;
        int i7;
        if (this.f9795o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jVar = (o.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (o.j) adapter;
                headersCount = 0;
            }
            o.o oVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= jVar.getCount()) ? null : jVar.getItem(i7);
            o.o oVar = this.f9796p;
            if (oVar != oVarB) {
                o.m mVar = jVar.f9169a;
                if (oVar != null) {
                    this.f9795o.d(mVar, oVar);
                }
                this.f9796p = oVarB;
                if (oVarB != null) {
                    this.f9795o.z(mVar, oVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f9793m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.f9794n) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.j) adapter).f9169a.c(false);
        return true;
    }

    public void setHoverListener(g2 g2Var) {
        this.f9795o = g2Var;
    }

    @Override // p.s1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
