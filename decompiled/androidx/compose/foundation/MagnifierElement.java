package androidx.compose.foundation;

import android.view.View;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import x.f1;
import x.t0;
import x.u0;
import y2.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lq2/z0;", "Lx/t0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MagnifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f766c;

    public MagnifierElement(k kVar, k kVar2, f1 f1Var) {
        this.f764a = kVar;
        this.f765b = kVar2;
        this.f766c = f1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        int i7 = (int) 9205357638345293824L;
        return this.f766c.hashCode() + ((this.f765b.hashCode() + ((((Float.floatToIntBits(Float.NaN) + ob.a.j(Float.NaN, (i7 + ((((Float.floatToIntBits(Float.NaN) + (this.f764a.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // q2.z0
    public final o i() {
        return new t0(this.f764a, this.f765b, this.f766c);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        t0 t0Var = (t0) oVar;
        t0Var.getClass();
        f1 f1Var = t0Var.f14479q;
        View view = t0Var.f14480r;
        n3.c cVar = t0Var.f14481s;
        t0Var.f14477o = this.f764a;
        t0Var.f14478p = this.f765b;
        f1 f1Var2 = this.f766c;
        t0Var.f14479q = f1Var2;
        View viewX = f.x(t0Var);
        n3.c cVar2 = f.v(t0Var).f10689x;
        if (t0Var.f14482t != null) {
            u uVar = u0.f14488a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !f1Var2.b()) || !n3.f.a(Float.NaN, Float.NaN) || !n3.f.a(Float.NaN, Float.NaN) || !f1Var2.equals(f1Var) || !viewX.equals(view) || !l.a(cVar2, cVar)) {
                t0Var.B0();
            }
        }
        t0Var.C0();
    }
}
