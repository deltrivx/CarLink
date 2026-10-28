package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9161a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9162b;

    public h(i iVar) {
        this.f9162b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f9162b.f9165c;
        o oVar = mVar.f9196v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f9185j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((o) arrayList.get(i7)) == oVar) {
                    this.f9161a = i7;
                    return;
                }
            }
        }
        this.f9161a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i7) {
        i iVar = this.f9162b;
        m mVar = iVar.f9165c;
        mVar.i();
        ArrayList arrayList = mVar.f9185j;
        iVar.getClass();
        int i10 = this.f9161a;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (o) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f9162b;
        m mVar = iVar.f9165c;
        mVar.i();
        int size = mVar.f9185j.size();
        iVar.getClass();
        return this.f9161a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9162b.f9164b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
