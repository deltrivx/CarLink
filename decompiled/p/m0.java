package p;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f9832a;

    public m0(o0 o0Var) {
        this.f9832a = o0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j5) {
        o0 o0Var = this.f9832a;
        r0 r0Var = o0Var.G;
        r0Var.setSelection(i7);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(view, i7, o0Var.D.getItemId(i7));
        }
        o0Var.dismiss();
    }
}
