package gb;

import aa.s0;
import i9.y;
import java.util.Collection;
import java.util.List;
import o9.u;
import u8.w;
import x9.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f6184d = {y.f6689a.g(new i9.r(h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa.c f6185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.i f6186c;

    public h(mb.k kVar, aa.c cVar) {
        i9.l.e(kVar, "storageManager");
        this.f6185b = cVar;
        this.f6186c = new mb.i(kVar, new aa.e(9, this));
    }

    @Override // gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        List list = (List) k9.a.z(this.f6186c, f6184d[0]);
        if (list.isEmpty()) {
            return w.f13122a;
        }
        wb.g gVar = new wb.g();
        for (Object obj : list) {
            if ((obj instanceof k0) && i9.l.a(((k0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // gb.p, gb.q
    public final Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        if (!fVar.a(f.f6174n.f6181b)) {
            return w.f13122a;
        }
        return (List) k9.a.z(this.f6186c, f6184d[0]);
    }

    @Override // gb.p, gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        List list = (List) k9.a.z(this.f6186c, f6184d[0]);
        if (list.isEmpty()) {
            return w.f13122a;
        }
        wb.g gVar = new wb.g();
        for (Object obj : list) {
            if ((obj instanceof s0) && i9.l.a(((s0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public abstract List h();
}
