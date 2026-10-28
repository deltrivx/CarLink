package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f12129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f12131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f12132f;

    public static q e() {
        q qVar = new q();
        qVar.f12129c = r.RETURNS_CONSTANT;
        qVar.f12130d = Collections.EMPTY_LIST;
        qVar.f12131e = y.f12266l;
        qVar.f12132f = s.AT_MOST_ONCE;
        return qVar;
    }

    @Override // xa.i
    public final xa.a a() {
        t tVarD = d();
        if (tVarD.isInitialized()) {
            return tVarD;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        t tVar = null;
        try {
            try {
                t.f12186j.getClass();
                f(new t(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                t tVar2 = (t) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    tVar = tVar2;
                    if (tVar != null) {
                        f(tVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tVar != null) {
                f(tVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((t) nVar);
        return this;
    }

    public final Object clone() {
        q qVarE = e();
        qVarE.f(d());
        return qVarE;
    }

    public final t d() {
        t tVar = new t(this);
        int i7 = this.f12128b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        tVar.f12189c = this.f12129c;
        if ((i7 & 2) == 2) {
            this.f12130d = Collections.unmodifiableList(this.f12130d);
            this.f12128b &= -3;
        }
        tVar.f12190d = this.f12130d;
        if ((i7 & 4) == 4) {
            i10 |= 2;
        }
        tVar.f12191e = this.f12131e;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        tVar.f12192f = this.f12132f;
        tVar.f12188b = i10;
        return tVar;
    }

    public final void f(t tVar) {
        y yVar;
        if (tVar == t.f12185i) {
            return;
        }
        if ((tVar.f12188b & 1) == 1) {
            r rVar = tVar.f12189c;
            rVar.getClass();
            this.f12128b = 1 | this.f12128b;
            this.f12129c = rVar;
        }
        if (!tVar.f12190d.isEmpty()) {
            if (this.f12130d.isEmpty()) {
                this.f12130d = tVar.f12190d;
                this.f12128b &= -3;
            } else {
                if ((this.f12128b & 2) != 2) {
                    this.f12130d = new ArrayList(this.f12130d);
                    this.f12128b |= 2;
                }
                this.f12130d.addAll(tVar.f12190d);
            }
        }
        if ((tVar.f12188b & 2) == 2) {
            y yVar2 = tVar.f12191e;
            if ((this.f12128b & 4) != 4 || (yVar = this.f12131e) == y.f12266l) {
                this.f12131e = yVar2;
            } else {
                w wVarE = w.e();
                wVarE.f(yVar);
                wVarE.f(yVar2);
                this.f12131e = wVarE.d();
            }
            this.f12128b |= 4;
        }
        if ((tVar.f12188b & 4) == 4) {
            s sVar = tVar.f12192f;
            sVar.getClass();
            this.f12128b |= 8;
            this.f12132f = sVar;
        }
        this.f14792a = this.f14792a.d(tVar.f12187a);
    }
}
