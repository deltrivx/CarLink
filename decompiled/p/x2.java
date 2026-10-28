package p;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements n, o.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9969a;

    public /* synthetic */ x2(Toolbar toolbar) {
        this.f9969a = toolbar;
    }

    @Override // o.k
    public void R(o.m mVar) {
        Toolbar toolbar = this.f9969a;
        k kVar = toolbar.f715a.f693t;
        if (kVar == null || !kVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.f13c).iterator();
            while (it.hasNext()) {
                ((p4.q) it.next()).f10222a.s();
            }
        }
    }

    @Override // o.k
    public boolean q(o.m mVar, MenuItem menuItem) {
        this.f9969a.getClass();
        return false;
    }
}
