package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f9163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f9164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f9165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f9166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f9167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f9168f;

    public i(ContextWrapper contextWrapper) {
        this.f9163a = contextWrapper;
        this.f9164b = LayoutInflater.from(contextWrapper);
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        x xVar = this.f9167e;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    @Override // o.y
    public final void c(Context context, m mVar) {
        if (this.f9163a != null) {
            this.f9163a = context;
            if (this.f9164b == null) {
                this.f9164b = LayoutInflater.from(context);
            }
        }
        this.f9165c = mVar;
        h hVar = this.f9168f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean d() {
        return false;
    }

    @Override // o.y
    public final boolean e(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f9176a;
        if (!zHasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f9199a = e0Var;
        j.g gVar = new j.g(context);
        j.d dVar = (j.d) gVar.f6795c;
        i iVar = new i(dVar.f6749a);
        nVar.f9201c = iVar;
        iVar.f9167e = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f9201c;
        if (iVar2.f9168f == null) {
            iVar2.f9168f = new h(iVar2);
        }
        dVar.f6755g = iVar2.f9168f;
        dVar.f6756h = nVar;
        View view = e0Var.f9189o;
        if (view != null) {
            dVar.f6753e = view;
        } else {
            dVar.f6751c = e0Var.f9188n;
            dVar.f6752d = e0Var.f9187m;
        }
        dVar.f6754f = nVar;
        j.h hVarD = gVar.d();
        nVar.f9200b = hVarD;
        hVarD.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f9200b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f9200b.show();
        x xVar = this.f9167e;
        if (xVar == null) {
            return true;
        }
        xVar.J(e0Var);
        return true;
    }

    @Override // o.y
    public final void g() {
        h hVar = this.f9168f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // o.y
    public final void j(x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j5) {
        this.f9165c.q(this.f9168f.getItem(i7), this, 0);
    }
}
