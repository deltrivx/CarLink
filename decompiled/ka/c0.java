package ka;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends wb.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x9.e f7402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f7403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f7404d;

    public c0(x9.e eVar, Set set, h9.k kVar) {
        this.f7402b = eVar;
        this.f7403c = set;
        this.f7404d = kVar;
    }

    @Override // wb.l
    public final boolean c(Object obj) {
        x9.e eVar = (x9.e) obj;
        i9.l.e(eVar, "current");
        if (eVar == this.f7402b) {
            return true;
        }
        gb.o oVarQ = eVar.Q();
        i9.l.d(oVarQ, "getStaticScope(...)");
        if (!(oVarQ instanceof e0)) {
            return true;
        }
        this.f7403c.addAll((Collection) this.f7404d.invoke(oVarQ));
        return false;
    }

    @Override // wb.l
    public final /* bridge */ /* synthetic */ Object j() {
        return t8.z.f12851a;
    }
}
