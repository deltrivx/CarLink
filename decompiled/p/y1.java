package p;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f9985a;

    public y1(f2 f2Var) {
        this.f9985a = f2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j5) {
        s1 s1Var;
        if (i7 == -1 || (s1Var = this.f9985a.f9721c) == null) {
            return;
        }
        s1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
