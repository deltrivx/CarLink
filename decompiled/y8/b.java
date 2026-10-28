package y8;

import h9.n;
import i9.l;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f15105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15106b;

    public b(f fVar, h hVar) {
        l.e(hVar, "left");
        l.e(fVar, "element");
        this.f15105a = hVar;
        this.f15106b = fVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i7 = 2;
            b bVar2 = bVar;
            int i10 = 2;
            while (true) {
                h hVar = bVar2.f15105a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i10++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f15105a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i10 == i7) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f15106b;
                    if (!l.a(bVar.l(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f15105a;
                    if (!(hVar3 instanceof b)) {
                        l.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = l.a(bVar.l(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y8.h
    public final h h(g gVar) {
        l.e(gVar, "key");
        f fVar = this.f15106b;
        f fVarL = fVar.l(gVar);
        h hVar = this.f15105a;
        if (fVarL != null) {
            return hVar;
        }
        h hVarH = hVar.h(gVar);
        if (hVarH == hVar) {
            return this;
        }
        return hVarH == i.f15108a ? fVar : new b(fVar, hVarH);
    }

    public final int hashCode() {
        return this.f15106b.hashCode() + this.f15105a.hashCode();
    }

    @Override // y8.h
    public final f l(g gVar) {
        l.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarL = bVar.f15106b.l(gVar);
            if (fVarL != null) {
                return fVarL;
            }
            h hVar = bVar.f15105a;
            if (!(hVar instanceof b)) {
                return hVar.l(gVar);
            }
            bVar = (b) hVar;
        }
    }

    @Override // y8.h
    public final Object q(n nVar, Object obj) {
        return nVar.invoke(this.f15105a.q(nVar, obj), this.f15106b);
    }

    @Override // y8.h
    public final h s(h hVar) {
        l.e(hVar, "context");
        return hVar == i.f15108a ? this : (h) hVar.q(new g0.g(16), this);
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("["), (String) q(new g0.g(15), ""), ']');
    }
}
