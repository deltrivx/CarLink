package r2;

import android.view.View;
import com.baidu.carlifevehicle.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g3 f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.n f11233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(g3 g3Var, h9.n nVar, int i7) {
        super(2);
        this.f11231a = i7;
        this.f11232b = g3Var;
        this.f11233c = nVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11231a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0.a(this.f11232b.f11242a, this.f11233c, sVar, 0);
                } else {
                    sVar.Q();
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g3 g3Var = this.f11232b;
                    u uVar = g3Var.f11242a;
                    Object tag = uVar.getTag(R.id.inspection_slot_table_set);
                    y8.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof j9.a) && !(tag instanceof j9.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = uVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof j9.a) && !(tag2 instanceof j9.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        f1.x xVar = sVar2.U;
                        if (xVar == null) {
                            xVar = new f1.x(sVar2.f5113h);
                            sVar2.U = xVar;
                        }
                        set.add(xVar);
                        sVar2.f5121q = true;
                        sVar2.C = true;
                        sVar2.f5108c.d();
                        sVar2.H.d();
                        f1.l2 l2Var = sVar2.I;
                        f1.i2 i2Var = l2Var.f5018a;
                        l2Var.f5022e = i2Var.f4994j;
                        l2Var.f5023f = i2Var.k;
                    }
                    boolean zH = sVar2.h(g3Var);
                    Object objK = sVar2.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (zH || objK == w0Var) {
                        objK = new e3(g3Var, cVar, 0);
                        sVar2.h0(objK);
                    }
                    f1.b.f(sVar2, (h9.n) objK, uVar);
                    boolean zH2 = sVar2.h(g3Var);
                    Object objK2 = sVar2.K();
                    if (zH2 || objK2 == w0Var) {
                        objK2 = new e3(g3Var, cVar, 1);
                        sVar2.h0(objK2);
                    }
                    f1.b.f(sVar2, (h9.n) objK2, uVar);
                    f1.b.a(q1.f.f10583a.a(set), n1.h.e(-280240369, new f3(g3Var, this.f11233c, 0), sVar2), sVar2, 56);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
