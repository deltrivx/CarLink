package cc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f2647f;

    public /* synthetic */ n(l lVar, int i7) {
        this.f2646e = i7;
        this.f2647f = lVar;
    }

    @Override // cc.e1
    public final boolean k() {
        switch (this.f2646e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // cc.e1
    public final void l(Throwable th) {
        switch (this.f2646e) {
            case 0:
                CancellationException cancellationExceptionJ = j().j();
                l lVar = this.f2647f;
                if (lVar.t()) {
                    hc.f fVar = (hc.f) lVar.f2640d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.f.f6507h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        hc.s sVar = hc.a.f6497c;
                        if (i9.l.a(obj, sVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, cancellationExceptionJ)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != sVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                lVar.w(cancellationExceptionJ);
                if (!lVar.t()) {
                    lVar.m();
                }
                break;
            default:
                this.f2647f.resumeWith(t8.z.f12851a);
                break;
        }
    }
}
