package u9;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import nb.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13136b;

    public /* synthetic */ f(i iVar, int i7) {
        this.f13135a = i7;
        this.f13136b = iVar;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f13135a;
        i iVar = this.f13136b;
        switch (i7) {
            case 0:
                return Arrays.asList(iVar.l().F(o.k), iVar.l().F(o.f13208m), iVar.l().F(o.f13209n), iVar.l().F(o.f13207l));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strB = kVar.f13157a.b();
                    if (strB == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarN = iVar.k(strB).n();
                    if (a0VarN == null) {
                        i.a(48);
                        throw null;
                    }
                    String strB2 = kVar.f13158b.b();
                    if (strB2 == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarN2 = iVar.k(strB2).n();
                    if (a0VarN2 == null) {
                        i.a(48);
                        throw null;
                    }
                    enumMap.put(kVar, a0VarN2);
                    map.put(a0VarN, a0VarN2);
                    map2.put(a0VarN2, a0VarN);
                }
                return new h(enumMap, map, map2);
        }
    }
}
