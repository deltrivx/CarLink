package s3;

import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {
    @Override // n3.n
    public final void F0(f fVar, f fVar2) {
        fVar.f12569b = fVar2;
    }

    @Override // n3.n
    public final void G0(f fVar, Thread thread) {
        fVar.f12568a = thread;
    }

    @Override // n3.n
    public final boolean T(g gVar, c cVar) {
        c cVar2 = c.f12560b;
        synchronized (gVar) {
            try {
                if (gVar.f12575b != cVar) {
                    return false;
                }
                gVar.f12575b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n3.n
    public final boolean U(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f12574a != obj) {
                    return false;
                }
                gVar.f12574a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n3.n
    public final boolean V(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f12576c != fVar) {
                    return false;
                }
                gVar.f12576c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
