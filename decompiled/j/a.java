package j;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p.z2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6702b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f6701a = i7;
        this.f6702b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6701a) {
            case 0:
                f fVar = (f) this.f6702b;
                fVar.f6791v.obtainMessage(1, fVar.f6772b).sendToTarget();
                break;
            case 1:
                ((n.a) this.f6702b).b();
                break;
            default:
                z2 z2Var = ((Toolbar) this.f6702b).L;
                o.o oVar = z2Var == null ? null : z2Var.f9990b;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
        }
    }
}
