package qa;

import pa.l;
import pa.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11009b;

    public /* synthetic */ d(f fVar, int i7) {
        this.f11008a = i7;
        this.f11009b = fVar;
    }

    private final void a(wa.e eVar, Object obj) {
    }

    private final void c(wa.e eVar, bb.f fVar) {
    }

    private final void d(wa.e eVar, bb.f fVar) {
    }

    private final void h(wa.e eVar, bb.f fVar) {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void n(wa.e eVar, wa.b bVar, wa.e eVar2) {
    }

    private final void o(wa.e eVar, wa.b bVar, wa.e eVar2) {
    }

    private final void p(wa.e eVar, wa.b bVar, wa.e eVar2) {
    }

    @Override // pa.l
    public final void b() {
        int i7 = this.f11008a;
    }

    @Override // pa.l
    public final void e(wa.e eVar, bb.f fVar) {
        int i7 = this.f11008a;
    }

    @Override // pa.l
    public final void f(wa.e eVar, wa.b bVar, wa.e eVar2) {
        int i7 = this.f11008a;
    }

    @Override // pa.l
    public final void g(wa.e eVar, Object obj) {
        switch (this.f11008a) {
            case 0:
                String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                f fVar = this.f11009b;
                if (!zEquals) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                "pn".equals(strB);
                            } else if (obj instanceof Integer) {
                                fVar.f11016c = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                fVar.f11015b = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        fVar.f11014a = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    a.f10989b.getClass();
                    a aVar = (a) a.f10990c.get((Integer) obj);
                    if (aVar == null) {
                        aVar = a.UNKNOWN;
                    }
                    fVar.f11020g = aVar;
                }
                break;
            case 1:
                break;
            default:
                String strB2 = eVar.b();
                boolean zEquals2 = "version".equals(strB2);
                f fVar2 = this.f11009b;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        fVar2.f11015b = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    fVar2.f11014a = (int[]) obj;
                }
                break;
        }
    }

    @Override // pa.l
    public final l i(wa.b bVar, wa.e eVar) {
        switch (this.f11008a) {
        }
        return null;
    }

    @Override // pa.l
    public final m m(wa.e eVar) {
        switch (this.f11008a) {
            case 0:
                String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new c(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new c(this, 1);
                }
                return null;
            case 1:
                if ("b".equals(eVar.b())) {
                    return new c(this, 2);
                }
                return null;
            default:
                String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new e(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new e(this, 1);
                }
                return null;
        }
    }
}
