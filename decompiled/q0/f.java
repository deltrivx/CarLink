package q0;

import android.view.ActionMode;
import android.view.View;
import cc.b0;
import p1.u;
import r2.a3;
import t8.z;
import x.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements s0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f10543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.a f10544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f10545d = new z0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f10546e = new u(new a(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f10547f = new a(this, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f10548g = new a(this, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMode f10549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l4.l f10550i;

    public f(View view, h9.k kVar, h9.a aVar) {
        this.f10542a = view;
        this.f10543b = kVar;
        this.f10544c = aVar;
    }

    @Override // s0.f
    public final Object a(s0.e eVar, a9.i iVar) {
        fc.h hVar = new fc.h(this, eVar, null, 1);
        z0 z0Var = this.f10545d;
        z0Var.getClass();
        Object objG = b0.g(new a3(z0Var, hVar, (y8.c) null), iVar);
        return objG == z8.a.f15774a ? objG : z.f12851a;
    }
}
