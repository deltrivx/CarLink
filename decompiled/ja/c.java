package ja;

import i9.l;
import java.util.Iterator;
import mb.k;
import u8.o;
import u8.p;
import u9.n;
import x.n1;
import y9.h;
import yb.g;
import yb.j;
import yb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.a f6989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.b f6990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.e f6992d;

    public c(da.a aVar, na.b bVar, boolean z10) {
        l.e(aVar, "c");
        l.e(bVar, "annotationOwner");
        this.f6989a = aVar;
        this.f6990b = bVar;
        this.f6991c = z10;
        this.f6992d = ((k) ((a) aVar.f3847b).f6964a).c(new aa.a(10, this));
    }

    @Override // y9.h
    public final y9.b g(wa.c cVar) {
        y9.b bVar;
        l.e(cVar, "fqName");
        na.b bVar2 = this.f6990b;
        da.e eVarA = bVar2.a(cVar);
        if (eVarA != null && (bVar = (y9.b) this.f6992d.invoke(eVarA)) != null) {
            return bVar;
        }
        wa.e eVar = ha.c.f6473a;
        return ha.c.a(cVar, bVar2, this.f6989a);
    }

    @Override // y9.h
    public final boolean i(wa.c cVar) {
        return n4.h.K(this, cVar);
    }

    @Override // y9.h
    public final boolean isEmpty() {
        return this.f6990b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        na.b bVar = this.f6990b;
        q qVarS = yb.l.S(p.f0(bVar.getAnnotations()), this.f6992d);
        wa.e eVar = ha.c.f6473a;
        return new g(new yb.h(yb.l.P(u8.l.k0(new j[]{qVarS, new o(3, ha.c.a(n.f13183m, bVar, this.f6989a))})), false, new n1(15)));
    }
}
