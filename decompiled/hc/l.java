package hc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6524e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6525f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f6526g = new s(0, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f6530d;

    public l(int i7, boolean z10) {
        this.f6527a = i7;
        this.f6528b = z10;
        int i10 = i7 - 1;
        this.f6529c = i10;
        this.f6530d = new AtomicReferenceArray(i7);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6525f;
            long j5 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j5) != 0) {
                return (2305843009213693952L & j5) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j5);
            int i10 = (int) ((1152921503533105152L & j5) >> 30);
            int i11 = this.f6529c;
            if (((i10 + 2) & i11) == (i7 & i11)) {
                return 1;
            }
            boolean z10 = this.f6528b;
            AtomicReferenceArray atomicReferenceArray = this.f6530d;
            if (z10 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f6525f.compareAndSet(this, j5, ((-1152921503533105153L) & j5) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    l lVarC = this;
                    while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                        lVarC = lVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = lVarC.f6530d;
                        int i12 = lVarC.f6529c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof k) && ((k) obj2).f6523a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            lVarC = null;
                        }
                        if (lVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f6527a;
                if (i13 < 1024 || ((i10 - i7) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        do {
            atomicLongFieldUpdater = f6525f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, 2305843009213693952L | j5));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f6525f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j5;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j5, j10)) {
                j5 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6524e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f6527a * 2, lVar.f6528b);
            int i7 = (int) (1073741823 & j5);
            int i10 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i11 = lVar.f6529c;
                int i12 = i7 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object kVar = lVar.f6530d.get(i12);
                if (kVar == null) {
                    kVar = new k(i7);
                }
                lVar3.f6530d.set(lVar3.f6529c & i7, kVar);
                i7++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        l lVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6525f;
            long j5 = atomicLongFieldUpdater.get(lVarC);
            if ((j5 & 1152921504606846976L) != 0) {
                return f6526g;
            }
            int i7 = (int) (j5 & 1073741823);
            int i10 = (int) ((1152921503533105152L & j5) >> 30);
            int i11 = lVarC.f6529c;
            int i12 = i7 & i11;
            if ((i10 & i11) != i12) {
                AtomicReferenceArray atomicReferenceArray = lVarC.f6530d;
                Object obj = atomicReferenceArray.get(i12);
                boolean z10 = lVarC.f6528b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (!(obj instanceof k)) {
                    long j10 = (i7 + 1) & 1073741823;
                    if (f6525f.compareAndSet(lVarC, j5, (j5 & (-1073741824)) | j10)) {
                        atomicReferenceArray.set(i12, null);
                        return obj;
                    }
                    lVarC = this;
                    if (z10) {
                        while (true) {
                            long j11 = atomicLongFieldUpdater.get(lVarC);
                            int i13 = (int) (j11 & 1073741823);
                            if ((j11 & 1152921504606846976L) != 0) {
                                lVarC = lVarC.c();
                            } else {
                                l lVar = lVarC;
                                if (f6525f.compareAndSet(lVar, j11, (j11 & (-1073741824)) | j10)) {
                                    lVar.f6530d.set(i13 & lVar.f6529c, null);
                                    lVarC = null;
                                } else {
                                    lVarC = lVar;
                                }
                            }
                            if (lVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
