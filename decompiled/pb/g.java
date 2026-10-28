package pb;

import gb.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import n3.r;
import u8.w;
import u8.y;
import x9.n0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class g implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10372b;

    public g(h hVar, String... strArr) {
        i9.l.e(strArr, "formatParams");
        String str = hVar.f10379a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f10372b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // gb.q
    public x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return new a(wa.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{eVar}, 1))));
    }

    @Override // gb.o
    public Set c() {
        return y.f13124a;
    }

    @Override // gb.q
    public Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return w.f13122a;
    }

    @Override // gb.o
    public Set e() {
        return y.f13124a;
    }

    @Override // gb.o
    public Set g() {
        return y.f13124a;
    }

    @Override // gb.o
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        a aVar = l.f10417c;
        i9.l.e(aVar, "containingDeclaration");
        c cVar = new c(aVar, null, y9.g.f15129a, wa.e.g("<Error function>"), 1, n0.f14716e0);
        i iVarC = l.c(k.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        x xVar = x.f14749d;
        ga.o oVar = x9.o.f14721e;
        w wVar = w.f13122a;
        cVar.H0(null, null, wVar, wVar, wVar, iVarC, xVar, oVar);
        return r.W(cVar);
    }

    @Override // gb.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return l.f10420f;
    }

    public String toString() {
        return a2.f.I(new StringBuilder("ErrorScope{"), this.f10372b, '}');
    }
}
