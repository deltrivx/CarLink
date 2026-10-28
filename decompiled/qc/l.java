package qc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11043a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nc.f f11044b = n3.u.m("kotlinx.serialization.json.JsonElement", nc.b.f9068c, new nc.e[0], new o7.q(9));

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        j jVar = (j) obj;
        i9.l.e(jVar, "value");
        n3.u.h(sVar);
        if (jVar instanceof y) {
            sVar.p(z.f11058a, jVar);
        } else if (jVar instanceof u) {
            sVar.p(w.f11056a, jVar);
        } else {
            if (!(jVar instanceof d)) {
                throw new cc.s();
            }
            sVar.p(f.f11040a, jVar);
        }
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return n3.u.k(bVar).g();
    }

    @Override // mc.a
    public final nc.e d() {
        return f11044b;
    }
}
