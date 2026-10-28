package aa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f338b;

    public /* synthetic */ g0(h0 h0Var, int i7) {
        this.f337a = i7;
        this.f338b = h0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f337a) {
            case 0:
                h0 h0Var = this.f338b;
                f0 f0Var = h0Var.f347g;
                if (f0Var == null) {
                    StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                    String str = h0Var.getName().f14247a;
                    i9.l.d(str, "toString(...)");
                    sb2.append(str);
                    sb2.append(" were not set before querying module content");
                    throw new AssertionError(sb2.toString());
                }
                List list = f0Var.f335a;
                h0Var.B0();
                list.contains(h0Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    x9.g0 g0Var = ((h0) it2.next()).f348h;
                    i9.l.b(g0Var);
                    arrayList.add(g0Var);
                }
                return new p(arrayList, "CompositeProvider@ModuleDescriptor for " + h0Var.getName());
            case 1:
                return ((c0) this.f338b.F(u9.o.f13205i)).f326g;
            default:
                return new w9.h(this.f338b);
        }
    }
}
