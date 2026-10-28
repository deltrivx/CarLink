package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9109j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.j jVar, p.j jVar2) {
        super(jVar2);
        this.k = jVar;
    }

    @Override // p.v1
    public final c0 b() {
        p.g gVar;
        switch (this.f9109j) {
            case 0:
                c cVar = ((ActionMenuItemView) this.k).f612m;
                if (cVar == null || (gVar = ((p.h) cVar).f9748a.f9816t) == null) {
                    return null;
                }
                return gVar.a();
            default:
                p.g gVar2 = ((p.j) this.k).f9792d.f9815s;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // p.v1
    public final boolean c() {
        c0 c0VarB;
        switch (this.f9109j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                l lVar = actionMenuItemView.k;
                return lVar != null && lVar.b(actionMenuItemView.f608h) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((p.j) this.k).f9792d.l();
                return true;
        }
    }

    @Override // p.v1
    public boolean d() {
        switch (this.f9109j) {
            case 1:
                p.k kVar = ((p.j) this.k).f9792d;
                if (kVar.f9817u != null) {
                    return false;
                }
                kVar.f();
                return true;
            default:
                return super.d();
        }
    }
}
