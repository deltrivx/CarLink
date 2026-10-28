package cc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2601h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f2602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f2603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f2604g;

    public c(e eVar, l lVar) {
        this.f2604g = eVar;
        this.f2602e = lVar;
    }

    @Override // cc.e1
    public final boolean k() {
        return false;
    }

    @Override // cc.e1
    public final void l(Throwable th) throws Throwable {
        l lVar = this.f2602e;
        if (th != null) {
            lVar.getClass();
            hc.s sVarB = lVar.B(new r(th, false), null);
            if (sVarB != null) {
                lVar.z(sVarB);
                d dVar = (d) f2601h.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f2610b;
        e eVar = this.f2604g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f2611a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                f0 f0Var = (f0) e0Var;
                f0Var.getClass();
                Object obj = h1.f2628a.get(f0Var);
                if (obj instanceof x0) {
                    throw new IllegalStateException("This job has not completed yet");
                }
                if (obj instanceof r) {
                    throw ((r) obj).f2662a;
                }
                arrayList.add(b0.y(obj));
            }
            lVar.resumeWith(arrayList);
        }
    }
}
