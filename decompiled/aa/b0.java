package aa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f316b;

    public /* synthetic */ b0(c0 c0Var, int i7) {
        this.f315a = i7;
        this.f316b = c0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f315a) {
            case 0:
                c0 c0Var = this.f316b;
                h0 h0Var = c0Var.f322c;
                h0Var.B0();
                return x9.v.i((p) h0Var.k.getValue(), c0Var.f323d);
            case 1:
                c0 c0Var2 = this.f316b;
                h0 h0Var2 = c0Var2.f322c;
                h0Var2.B0();
                return Boolean.valueOf(x9.v.h((p) h0Var2.k.getValue(), c0Var2.f323d));
            default:
                c0 c0Var3 = this.f316b;
                mb.i iVar = c0Var3.f325f;
                o9.u[] uVarArr = c0.f321h;
                boolean zBooleanValue = ((Boolean) k9.a.z(iVar, uVarArr[1])).booleanValue();
                wa.c cVar = c0Var3.f323d;
                h0 h0Var3 = c0Var3.f322c;
                if (zBooleanValue) {
                    return gb.n.f6198b;
                }
                List list = (List) k9.a.z(c0Var3.f324e, uVarArr[0]);
                ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x9.d0) it.next()).U());
                }
                return o9.e0.o("package view scope for " + cVar + " in " + h0Var3.getName(), u8.p.y0(arrayList, new t0(h0Var3, cVar)));
        }
    }
}
