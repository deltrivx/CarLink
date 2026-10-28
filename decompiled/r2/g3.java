package r2;

import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements f1.u, androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.y f11243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.v f11245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h9.n f11246e = h1.f11249a;

    public g3(u uVar, f1.y yVar) {
        this.f11242a = uVar;
        this.f11243b = yVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            f();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.f11244c) {
                return;
            }
            i(this.f11246e);
        }
    }

    public final void f() {
        if (!this.f11244c) {
            this.f11244c = true;
            this.f11242a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.v vVar = this.f11245d;
            if (vVar != null) {
                vVar.f(this);
            }
        }
        this.f11243b.m();
    }

    public final void i(h9.n nVar) {
        this.f11242a.setOnViewTreeOwnersAvailable(new c1.a1(13, this, nVar));
    }
}
