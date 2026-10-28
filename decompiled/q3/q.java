package q3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import q2.q1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends i {
    public final j2.d A;
    public o1.e B;
    public h9.k C;
    public h9.k D;
    public h9.k E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f10945z;

    public q(Context context, h9.k kVar, f1.q qVar, o1.f fVar, int i7, q1 q1Var) {
        View view = (View) kVar.invoke(context);
        j2.d dVar = new j2.d();
        super(context, qVar, i7, dVar, view, q1Var);
        this.f10945z = view;
        this.A = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i7);
        Object objC = fVar != null ? fVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.e(strValueOf, new h(this, 2)));
        }
        b bVar = b.f10874e;
        this.C = bVar;
        this.D = bVar;
        this.E = bVar;
    }

    public static final void n(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(o1.e eVar) {
        o1.e eVar2 = this.B;
        if (eVar2 != null) {
            ((a2.b) eVar2).e0();
        }
        this.B = eVar;
    }

    public final j2.d getDispatcher() {
        return this.A;
    }

    public final h9.k getReleaseBlock() {
        return this.E;
    }

    public final h9.k getResetBlock() {
        return this.D;
    }

    public /* bridge */ /* synthetic */ r2.a getSubCompositionView() {
        return null;
    }

    public final h9.k getUpdateBlock() {
        return this.C;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(h9.k kVar) {
        this.E = kVar;
        setRelease(new h(this, 3));
    }

    public final void setResetBlock(h9.k kVar) {
        this.D = kVar;
        setReset(new h(this, 4));
    }

    public final void setUpdateBlock(h9.k kVar) {
        this.C = kVar;
        setUpdate(new h(this, 5));
    }
}
