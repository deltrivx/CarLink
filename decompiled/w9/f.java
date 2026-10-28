package w9;

import aa.c0;
import java.util.ArrayList;
import java.util.List;
import u8.p;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14191b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14192a = 0;

    public /* synthetic */ f() {
    }

    public f(l lVar) {
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean z10 = false;
        switch (this.f14192a) {
            case 0:
                y yVar = (y) obj;
                e eVar = g.f14193d;
                i9.l.e(yVar, "module");
                List list = (List) k9.a.z(((c0) yVar.F(g.f14195f)).f324e, c0.f321h[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof kb.c) {
                        arrayList.add(obj2);
                    }
                }
                return (kb.c) p.k0(arrayList);
            default:
                x9.c cVar = (x9.c) obj;
                if (cVar.f() == 1) {
                    x9.k kVarL = cVar.l();
                    i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.f14177a;
                    if (d.f14186j.containsKey(za.d.g((x9.e) kVarL))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
