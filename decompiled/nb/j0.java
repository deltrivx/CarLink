package nb;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.c f9008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.f f9009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ob.g f9010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayDeque f9012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wb.i f9013h;

    public j0(boolean z10, boolean z11, ob.c cVar, ob.f fVar, ob.g gVar) {
        i9.l.e(cVar, "typeSystemContext");
        i9.l.e(fVar, "kotlinTypePreparator");
        i9.l.e(gVar, "kotlinTypeRefiner");
        this.f9006a = z10;
        this.f9007b = z11;
        this.f9008c = cVar;
        this.f9009d = fVar;
        this.f9010e = gVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f9012g;
        i9.l.b(arrayDeque);
        arrayDeque.clear();
        wb.i iVar = this.f9013h;
        i9.l.b(iVar);
        iVar.clear();
    }

    public boolean b(qb.d dVar, qb.d dVar2) {
        return true;
    }

    public final void c() {
        if (this.f9012g == null) {
            this.f9012g = new ArrayDeque(4);
        }
        if (this.f9013h == null) {
            int i7 = wb.i.f14296c;
            this.f9013h = wb.l.e();
        }
    }

    public final w0 d(qb.d dVar) {
        i9.l.e(dVar, "type");
        return this.f9009d.J(dVar);
    }

    public final w e(qb.d dVar) {
        i9.l.e(dVar, "type");
        this.f9010e.getClass();
        return (w) dVar;
    }
}
