package ec;

import cc.z1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends h {
    public final a k;

    public s(int i7, a aVar) {
        super(i7);
        this.k = aVar;
        if (aVar != a.f4685a) {
            if (i7 < 1) {
                throw new IllegalArgumentException(a2.f.F("Buffered channel capacity must be at least 1, but ", " was specified", i7).toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + i9.y.f6689a.b(h.class).l() + " instead").toString());
        }
    }

    public final Object K(Object obj, boolean z10) {
        a aVar = this.k;
        a aVar2 = a.f4687c;
        z zVar = z.f12851a;
        if (aVar == aVar2) {
            Object objX = super.x(obj);
            return (!(objX instanceof n) || (objX instanceof m)) ? objX : zVar;
        }
        l4.o oVar = j.f4714d;
        p pVar = (p) h.f4704f.get(this);
        while (true) {
            long andIncrement = h.f4700b.getAndIncrement(this);
            long j5 = 1152921504606846975L & andIncrement;
            boolean zU = u(andIncrement, false);
            int i7 = j.f4712b;
            long j10 = i7;
            long j11 = j5 / j10;
            int i10 = (int) (j5 % j10);
            if (pVar.f6535c != j11) {
                p pVarB = h.b(this, j11, pVar);
                if (pVarB != null) {
                    pVar = pVarB;
                } else if (zU) {
                    return new m(r());
                }
            }
            int iE = h.e(this, pVar, i10, obj, j5, oVar, zU);
            if (iE == 0) {
                pVar.a();
                return zVar;
            }
            if (iE != 1) {
                if (iE != 2) {
                    if (iE == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE == 4) {
                        if (j5 < h.f4701c.get(this)) {
                            pVar.a();
                        }
                        return new m(r());
                    }
                    if (iE == 5) {
                        pVar.a();
                    }
                } else {
                    if (zU) {
                        pVar.i();
                        return new m(r());
                    }
                    z1 z1Var = oVar instanceof z1 ? (z1) oVar : null;
                    if (z1Var != null) {
                        z1Var.a(pVar, i10 + i7);
                    }
                    m((pVar.f6535c * j10) + ((long) i10));
                }
            }
            return zVar;
        }
    }

    @Override // ec.h, ec.x
    public final Object g(Object obj, y8.c cVar) throws Throwable {
        if (K(obj, true) instanceof m) {
            throw r();
        }
        return z.f12851a;
    }

    @Override // ec.h, ec.x
    public final Object x(Object obj) {
        return K(obj, false);
    }

    @Override // ec.h
    public final boolean y() {
        return this.k == a.f4686b;
    }
}
