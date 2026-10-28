package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class c1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a1 a1Var) {
        super(true);
        boolean z10 = true;
        P(a1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h1.f2629b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z10 = false;
            break;
        }
        h1 h1VarJ = pVar.j();
        while (!h1VarJ.K()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(h1VarJ);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z10 = false;
                break;
            }
            h1VarJ = pVar2.j();
        }
        this.f2606c = z10;
    }

    @Override // cc.h1
    public final boolean K() {
        return this.f2606c;
    }

    @Override // cc.h1
    public final boolean L() {
        return true;
    }
}
