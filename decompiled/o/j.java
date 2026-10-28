package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9170b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9174f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z10, int i7) {
        this.f9172d = z10;
        this.f9173e = layoutInflater;
        this.f9169a = mVar;
        this.f9174f = i7;
        a();
    }

    public final void a() {
        m mVar = this.f9169a;
        o oVar = mVar.f9196v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f9185j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((o) arrayList.get(i7)) == oVar) {
                    this.f9170b = i7;
                    return;
                }
            }
        }
        this.f9170b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i7) {
        ArrayList arrayListL;
        boolean z10 = this.f9172d;
        m mVar = this.f9169a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.f9185j;
        } else {
            arrayListL = mVar.l();
        }
        int i10 = this.f9170b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (o) arrayListL.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.f9172d;
        m mVar = this.f9169a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.f9185j;
        } else {
            arrayListL = mVar.l();
        }
        return this.f9170b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f9173e.inflate(this.f9174f, viewGroup, false);
        }
        int i10 = getItem(i7).f9203b;
        int i11 = i7 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f9203b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9169a.m() && i10 != i12) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.f9171c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
