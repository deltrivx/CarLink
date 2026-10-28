package gb;

import aa.s0;
import i9.y;
import i9.z;
import java.util.Collection;
import java.util.List;
import o9.u;
import x9.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f6202f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb.h f6203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f6205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.i f6206e;

    static {
        i9.r rVar = new i9.r(s.class, "functions", "getFunctions()Ljava/util/List;", 0);
        z zVar = y.f6689a;
        f6202f = new u[]{zVar.g(rVar), ob.a.v(s.class, "properties", "getProperties()Ljava/util/List;", 0, zVar)};
    }

    public s(mb.k kVar, lb.h hVar, boolean z10) {
        i9.l.e(kVar, "storageManager");
        this.f6203b = hVar;
        this.f6204c = z10;
        this.f6205d = new mb.i(kVar, new r(this, 0));
        this.f6206e = new mb.i(kVar, new r(this, 1));
    }

    @Override // gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return null;
    }

    @Override // gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        List list = (List) k9.a.z(this.f6206e, f6202f[1]);
        wb.g gVar = new wb.g();
        for (Object obj : list) {
            if (i9.l.a(((k0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // gb.p, gb.q
    public final Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        u[] uVarArr = f6202f;
        return u8.p.x0((List) k9.a.z(this.f6206e, uVarArr[1]), (List) k9.a.z(this.f6205d, uVarArr[0]));
    }

    @Override // gb.p, gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        List list = (List) k9.a.z(this.f6205d, f6202f[0]);
        wb.g gVar = new wb.g();
        for (Object obj : list) {
            if (i9.l.a(((s0) obj).getName(), eVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }
}
