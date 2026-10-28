package fc;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends gc.b implements t, d, gc.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5550f = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5551e;

    public h0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // gc.b
    public final gc.d b() {
        return new i0();
    }

    @Override // gc.b
    public final gc.d[] c() {
        return new i0[2];
    }

    public final boolean f(Object obj, Object obj2) {
        hc.s sVar = gc.c.f6217b;
        if (obj == null) {
            obj = sVar;
        }
        if (obj2 == null) {
            obj2 = sVar;
        }
        return j(obj, obj2);
    }

    @Override // gc.r
    public final d g(y8.h hVar, int i7, ec.a aVar) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != ec.a.f4686b) && !((i7 == 0 || i7 == -3) && aVar == ec.a.f4685a)) ? new gc.g(this, hVar, i7, aVar) : this;
    }

    @Override // fc.f0
    public final Object getValue() {
        hc.s sVar = gc.c.f6217b;
        Object obj = f5550f.get(this);
        if (obj == sVar) {
            return null;
        }
        return obj;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        i(obj);
        return t8.z.f12851a;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = gc.c.f6217b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i7;
        gc.d[] dVarArr;
        hc.s sVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5550f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !i9.l.a(obj3, obj)) {
                return false;
            }
            if (i9.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f5551e;
            if ((i10 & 1) != 0) {
                this.f5551e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f5551e = i11;
            gc.d[] dVarArr2 = this.f6212a;
            while (true) {
                i0[] i0VarArr = (i0[]) dVarArr2;
                if (i0VarArr != null) {
                    for (i0 i0Var : i0VarArr) {
                        if (i0Var != null) {
                            AtomicReference atomicReference = i0Var.f5558a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (sVar = y.f5618c)) {
                                    break;
                                }
                                hc.s sVar2 = y.f5617b;
                                if (obj4 != sVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, sVar2)) {
                                            ((cc.l) obj4).resumeWith(t8.z.f12851a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, sVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f5551e;
                    if (i7 == i11) {
                        this.f5551e = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f6212a;
                }
                dVarArr2 = dVarArr;
                i11 = i7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e0->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:703)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:706)
        */
    @Override // fc.d
    public final java.lang.Object l(fc.e r18, y8.c r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.h0.l(fc.e, y8.c):java.lang.Object");
    }
}
