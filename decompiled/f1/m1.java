package f1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5049c;

    public m1(Choreographer choreographer, r2.s0 s0Var) {
        this.f5047a = 1;
        this.f5048b = choreographer;
        this.f5049c = s0Var;
    }

    public m1(x0 x0Var) {
        this.f5047a = 0;
        this.f5048b = x0Var;
        this.f5049c = new t0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(h9.k kVar, y8.c cVar) {
        l1 l1Var;
        Object objO;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i7 = l1Var.f5017d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                l1Var.f5017d = i7 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object obj = l1Var.f5015b;
        z8.a aVar = z8.a.f15774a;
        int i10 = l1Var.f5017d;
        if (i10 == 0) {
            t8.a.e(obj);
            t0 t0Var = (t0) this.f5049c;
            l1Var.f5014a = kVar;
            l1Var.f5017d = 1;
            if (t0Var.b()) {
                objO = t8.z.f12851a;
            } else {
                cc.l lVar = new cc.l(1, n4.h.L(l1Var));
                lVar.p();
                synchronized (t0Var.f5149b) {
                    ((ArrayList) t0Var.f5150c).add(lVar);
                }
                lVar.r(new c8.y(1, t0Var, lVar));
                objO = lVar.o();
                if (objO != aVar) {
                    objO = t8.z.f12851a;
                }
            }
            if (objO != aVar) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
            return obj;
        }
        kVar = l1Var.f5014a;
        t8.a.e(obj);
        x0 x0Var = (x0) this.f5048b;
        l1Var.f5014a = null;
        l1Var.f5017d = 2;
        Object objM = x0Var.m(kVar, l1Var);
        return objM == aVar ? aVar : objM;
    }

    @Override // y8.f
    public final y8.g getKey() {
        switch (this.f5047a) {
            case 0:
                break;
        }
        return w0.f5183b;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        switch (this.f5047a) {
            case 0:
                break;
        }
        return n3.u.F(this, gVar);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        switch (this.f5047a) {
            case 0:
                break;
        }
        return n3.u.A(this, gVar);
    }

    @Override // f1.x0
    public final Object m(h9.k kVar, y8.c cVar) {
        switch (this.f5047a) {
            case 0:
                return c(kVar, cVar);
            default:
                r2.s0 s0Var = (r2.s0) this.f5049c;
                cc.l lVar = new cc.l(1, n4.h.L(cVar));
                lVar.p();
                r2.t0 t0Var = new r2.t0(lVar, this, kVar);
                if (i9.l.a(s0Var.f11391c, (Choreographer) this.f5048b)) {
                    synchronized (s0Var.f11393e) {
                        s0Var.f11395g.add(t0Var);
                        if (!s0Var.f11398j) {
                            s0Var.f11398j = true;
                            s0Var.f11391c.postFrameCallback(s0Var.k);
                        }
                        break;
                    }
                    lVar.r(new c1.a1(10, s0Var, t0Var));
                } else {
                    ((Choreographer) this.f5048b).postFrameCallback(t0Var);
                    lVar.r(new c1.a1(11, this, t0Var));
                }
                return lVar.o();
        }
    }

    @Override // y8.h
    public final Object q(h9.n nVar, Object obj) {
        switch (this.f5047a) {
            case 0:
                break;
        }
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        switch (this.f5047a) {
            case 0:
                break;
        }
        return n3.u.G(this, hVar);
    }
}
