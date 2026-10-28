package p;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SpinnerAdapter f9824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f9825b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f9825b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i7, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i7);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i7);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        return getDropDownView(i7, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i7) {
        ListAdapter listAdapter = this.f9825b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i7);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9824a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
