package a9;

import cc.u;
import i9.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final y8.h _context;
    private transient y8.c intercepted;

    public c(y8.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    public c(y8.c cVar, y8.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // y8.c
    public y8.h getContext() {
        y8.h hVar = this._context;
        l.b(hVar);
        return hVar;
    }

    public final y8.c intercepted() {
        y8.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        y8.e eVar = (y8.e) getContext().l(y8.d.f15107a);
        y8.c fVar = eVar != null ? new hc.f((u) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // a9.a
    public void releaseIntercepted() {
        y8.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            y8.f fVarL = getContext().l(y8.d.f15107a);
            l.b(fVarL);
            hc.f fVar = (hc.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.f.f6507h;
            while (atomicReferenceFieldUpdater.get(fVar) == hc.a.f6497c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            cc.l lVar = obj instanceof cc.l ? (cc.l) obj : null;
            if (lVar != null) {
                lVar.m();
            }
        }
        this.intercepted = b.f304a;
    }
}
