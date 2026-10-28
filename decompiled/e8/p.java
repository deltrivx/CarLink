package e8;

import android.view.ActionMode;
import r2.g3;
import r2.m1;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements f1.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4599b;

    public /* synthetic */ p(int i7, Object obj) {
        this.f4598a = i7;
        this.f4599b = obj;
    }

    @Override // f1.h0
    public final void a() {
        switch (this.f4598a) {
            case 0:
                n8.a.b().unregisterReceiver((q) this.f4599b);
                break;
            case 1:
                n8.a.b().unregisterReceiver((z0) this.f4599b);
                break;
            case 2:
                ((h0.s) this.f4599b).f6371d = null;
                break;
            case 3:
                h0.i0 i0Var = (h0.i0) this.f4599b;
                f1.t0 t0Var = i0Var.f6325c;
                if (t0Var != null) {
                    t0Var.f5148a = false;
                }
                i0Var.f6325c = null;
                break;
            case 4:
                ((h0.d0) this.f4599b).f6305f = true;
                break;
            case 5:
                ((t1) this.f4599b).n();
                break;
            case 6:
                m5.l lVar = (m5.l) this.f4599b;
                lVar.getClass();
                lVar.f8491j.i(null);
                break;
            case 7:
                q0.f fVar = (q0.f) this.f4599b;
                p1.u uVar = fVar.f10546e;
                g4.e eVar = uVar.f10095h;
                if (eVar != null) {
                    eVar.a();
                }
                uVar.a();
                ActionMode actionMode = fVar.f10549h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                fVar.f10549h = null;
                break;
            case 8:
                ((m1) this.f4599b).f11333b.invoke();
                break;
            case 9:
                r3.t tVar = (r3.t) this.f4599b;
                tVar.dismiss();
                r3.r rVar = tVar.f11593g;
                g3 g3Var = rVar.f11134c;
                if (g3Var != null) {
                    g3Var.f();
                }
                rVar.f11134c = null;
                rVar.requestLayout();
                break;
            case 10:
                r3.v vVar = (r3.v) this.f4599b;
                g3 g3Var2 = vVar.f11134c;
                if (g3Var2 != null) {
                    g3Var2.f();
                }
                vVar.f11134c = null;
                vVar.requestLayout();
                androidx.lifecycle.i0.h(vVar, null);
                vVar.f11604n.removeViewImmediate(vVar);
                break;
            case 11:
                s0.b bVar = (s0.b) ((s0.c) this.f4599b).f12531c.getValue();
                if (bVar != null) {
                    bVar.close();
                }
                break;
            case 12:
                v.s0 s0Var = (v.s0) this.f4599b;
                s0Var.g();
                s0Var.f13450a.getClass();
                break;
            default:
                w0.w0 w0Var = (w0.w0) this.f4599b;
                w0Var.j();
                w0Var.f13987i.setValue(Boolean.FALSE);
                break;
        }
    }
}
