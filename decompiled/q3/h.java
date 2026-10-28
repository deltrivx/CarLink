package q3;

import android.os.Parcelable;
import android.util.SparseArray;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q qVar, int i7) {
        super(0);
        this.f10894a = i7;
        this.f10895b = qVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f10894a) {
            case 0:
                this.f10895b.getLayoutNode().C();
                return z.f12851a;
            case 1:
                q qVar = this.f10895b;
                if (qVar.f10900e && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    qVar.getSnapshotObserver().a(qVar, b.f10871b, qVar.getUpdate());
                }
                return z.f12851a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f10895b.f10945z.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                q qVar2 = this.f10895b;
                qVar2.getReleaseBlock().invoke(qVar2.f10945z);
                q.n(qVar2);
                return z.f12851a;
            case 4:
                q qVar3 = this.f10895b;
                qVar3.getResetBlock().invoke(qVar3.f10945z);
                return z.f12851a;
            default:
                q qVar4 = this.f10895b;
                qVar4.getUpdateBlock().invoke(qVar4.f10945z);
                return z.f12851a;
        }
    }
}
