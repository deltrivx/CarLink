package ec;

import cc.z1;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends hc.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f4734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4735f;

    public p(long j5, p pVar, h hVar, int i7) {
        super(j5, pVar, i7);
        this.f4734e = hVar;
        this.f4735f = new AtomicReferenceArray(j.f4712b * 2);
    }

    @Override // hc.q
    public final int g() {
        return j.f4712b;
    }

    @Override // hc.q
    public final void h(int i7, y8.h hVar) {
        h hVar2;
        int i10 = j.f4712b;
        boolean z10 = i7 >= i10;
        if (z10) {
            i7 -= i10;
        }
        this.f4735f.get(i7 * 2);
        while (true) {
            Object objL = l(i7);
            boolean z11 = objL instanceof z1;
            hVar2 = this.f4734e;
            if (z11 || (objL instanceof y)) {
                if (k(i7, objL, z10 ? j.f4720j : j.k)) {
                    n(i7, null);
                    m(i7, !z10);
                    if (z10) {
                        i9.l.b(hVar2);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == j.f4720j || objL == j.k) {
                    break;
                }
                if (objL != j.f4717g && objL != j.f4716f) {
                    if (objL == j.f4719i || objL == j.f4714d || objL == j.f4721l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i7, null);
        if (z10) {
            i9.l.b(hVar2);
        }
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f4735f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f4735f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z10) {
        if (z10) {
            h hVar = this.f4734e;
            i9.l.b(hVar);
            hVar.J((this.f6535c * ((long) j.f4712b)) + ((long) i7));
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f4735f.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f4735f.set((i7 * 2) + 1, obj);
    }
}
