package gb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import nb.p0;
import nb.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f6207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f6209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t8.o f6210e;

    public t(o oVar, r0 r0Var) {
        i9.l.e(oVar, "workerScope");
        i9.l.e(r0Var, "givenSubstitutor");
        this.f6207b = oVar;
        t8.a.d(new aa.e(10, r0Var));
        p0 p0VarF = r0Var.f();
        i9.l.d(p0VarF, "getSubstitution(...)");
        this.f6208c = new r0(i2.c.T(p0VarF));
        this.f6210e = t8.a.d(new aa.e(11, this));
    }

    @Override // gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        x9.h hVarA = this.f6207b.a(eVar, bVar);
        if (hVarA != null) {
            return (x9.h) i(hVarA);
        }
        return null;
    }

    @Override // gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return h(this.f6207b.b(eVar, bVar));
    }

    @Override // gb.o
    public final Set c() {
        return this.f6207b.c();
    }

    @Override // gb.q
    public final Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return (Collection) this.f6210e.getValue();
    }

    @Override // gb.o
    public final Set e() {
        return this.f6207b.e();
    }

    @Override // gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return h(this.f6207b.f(eVar, bVar));
    }

    @Override // gb.o
    public final Set g() {
        return this.f6207b.g();
    }

    public final Collection h(Collection collection) {
        if (this.f6208c.f9029a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((x9.k) it.next()));
        }
        return linkedHashSet;
    }

    public final x9.k i(x9.k kVar) {
        r0 r0Var = this.f6208c;
        if (r0Var.f9029a.e()) {
            return kVar;
        }
        if (this.f6209d == null) {
            this.f6209d = new HashMap();
        }
        HashMap map = this.f6209d;
        i9.l.b(map);
        Object objE = map.get(kVar);
        if (objE == null) {
            if (!(kVar instanceof x9.p0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + kVar).toString());
            }
            objE = ((x9.p0) kVar).e(r0Var);
            if (objE == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + kVar + " substitution fails");
            }
            map.put(kVar, objE);
        }
        return (x9.k) objE;
    }
}
