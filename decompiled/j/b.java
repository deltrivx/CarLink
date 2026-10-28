package j;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6719b;

    public b(View view, View view2) {
        this.f6718a = view;
        this.f6719b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
        f.a(absListView, this.f6718a, this.f6719b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
    }
}
