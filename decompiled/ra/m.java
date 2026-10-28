package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f12086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12087h;

    public static m f() {
        m mVar = new m();
        mVar.f12084e = 6;
        List list = Collections.EMPTY_LIST;
        mVar.f12085f = list;
        mVar.f12086g = list;
        mVar.f12087h = list;
        return mVar;
    }

    @Override // xa.i
    public final xa.a a() {
        n nVarE = e();
        if (nVarE.isInitialized()) {
            return nVarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        n nVar = null;
        try {
            try {
                n.k.getClass();
                g(new n(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                n nVar2 = (n) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    nVar = nVar2;
                    if (nVar != null) {
                        g(nVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (nVar != null) {
                g(nVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((n) nVar);
        return this;
    }

    public final Object clone() {
        m mVarF = f();
        mVarF.g(e());
        return mVarF;
    }

    public final n e() {
        n nVar = new n(this);
        int i7 = this.f12083d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        nVar.f12097d = this.f12084e;
        if ((i7 & 2) == 2) {
            this.f12085f = Collections.unmodifiableList(this.f12085f);
            this.f12083d &= -3;
        }
        nVar.f12098e = this.f12085f;
        if ((this.f12083d & 4) == 4) {
            this.f12086g = Collections.unmodifiableList(this.f12086g);
            this.f12083d &= -5;
        }
        nVar.f12099f = this.f12086g;
        if ((this.f12083d & 8) == 8) {
            this.f12087h = Collections.unmodifiableList(this.f12087h);
            this.f12083d &= -9;
        }
        nVar.f12100g = this.f12087h;
        nVar.f12096c = i10;
        return nVar;
    }

    public final void g(n nVar) {
        if (nVar == n.f12094j) {
            return;
        }
        if ((nVar.f12096c & 1) == 1) {
            int i7 = nVar.f12097d;
            this.f12083d = 1 | this.f12083d;
            this.f12084e = i7;
        }
        if (!nVar.f12098e.isEmpty()) {
            if (this.f12085f.isEmpty()) {
                this.f12085f = nVar.f12098e;
                this.f12083d &= -3;
            } else {
                if ((this.f12083d & 2) != 2) {
                    this.f12085f = new ArrayList(this.f12085f);
                    this.f12083d |= 2;
                }
                this.f12085f.addAll(nVar.f12098e);
            }
        }
        if (!nVar.f12099f.isEmpty()) {
            if (this.f12086g.isEmpty()) {
                this.f12086g = nVar.f12099f;
                this.f12083d &= -5;
            } else {
                if ((this.f12083d & 4) != 4) {
                    this.f12086g = new ArrayList(this.f12086g);
                    this.f12083d |= 4;
                }
                this.f12086g.addAll(nVar.f12099f);
            }
        }
        if (!nVar.f12100g.isEmpty()) {
            if (this.f12087h.isEmpty()) {
                this.f12087h = nVar.f12100g;
                this.f12083d &= -9;
            } else {
                if ((this.f12083d & 8) != 8) {
                    this.f12087h = new ArrayList(this.f12087h);
                    this.f12083d |= 8;
                }
                this.f12087h.addAll(nVar.f12100g);
            }
        }
        d(nVar);
        this.f14792a = this.f14792a.d(nVar.f12095b);
    }
}
