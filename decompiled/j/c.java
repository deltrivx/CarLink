package j;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6747b;

    public c(d dVar, f fVar) {
        this.f6747b = dVar;
        this.f6746a = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j5) {
        d dVar = this.f6747b;
        DialogInterface.OnClickListener onClickListener = dVar.f6756h;
        f fVar = this.f6746a;
        onClickListener.onClick(fVar.f6772b, i7);
        if (dVar.f6757i) {
            return;
        }
        fVar.f6772b.dismiss();
    }
}
