package mc;

import h9.k;
import i9.l;
import java.util.List;
import java.util.Map;
import n3.u;
import nc.g;
import pc.x0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8633b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f8632a = i7;
        this.f8633b = dVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        nc.a aVar = (nc.a) obj;
        switch (this.f8632a) {
            case 0:
                l.e(aVar, "$this$buildSerialDescriptor");
                nc.a.a(aVar, "type", x0.f10519b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                d dVar = this.f8633b;
                sb2.append(dVar.f8634a.l());
                sb2.append('>');
                c cVar = new c(dVar, 1);
                nc.a.a(aVar, "value", u.m(sb2.toString(), g.f9088c, new nc.e[0], cVar));
                List list = dVar.f8635b;
                l.e(list, "<set-?>");
                aVar.f9062b = list;
                break;
            default:
                l.e(aVar, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f8633b.f8638e.entrySet()) {
                    nc.a.a(aVar, (String) entry.getKey(), ((a) entry.getValue()).d());
                }
                break;
        }
        return z.f12851a;
    }
}
