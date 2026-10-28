package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12111d;

    public /* synthetic */ o(int i7) {
        this.f12109b = i7;
    }

    @Override // xa.i
    public final xa.a a() {
        switch (this.f12109b) {
            case 0:
                p pVarD = d();
                if (pVarD.isInitialized()) {
                    return pVarD;
                }
                throw new cc.s();
            case 1:
                m0 m0VarE = e();
                if (m0VarE.isInitialized()) {
                    return m0VarE;
                }
                throw new cc.s();
            case 2:
                f1 f1VarG = g();
                f1VarG.isInitialized();
                return f1VarG;
            default:
                n0 n0VarF = f();
                n0VarF.isInitialized();
                return n0VarF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        switch (this.f12109b) {
            case 0:
                p pVar = null;
                try {
                    try {
                        p.f12117f.getClass();
                        h(new p(eVar, gVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (pVar != null) {
                            h(pVar);
                        }
                        throw th;
                    }
                } catch (xa.q e7) {
                    p pVar2 = (p) e7.f14823a;
                    try {
                        throw e7;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                        if (pVar != null) {
                            h(pVar);
                        }
                        throw th;
                    }
                }
            case 1:
                m0 m0Var = null;
                try {
                    try {
                        m0.f12089f.getClass();
                        i(new m0(eVar, gVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (m0Var != null) {
                            i(m0Var);
                        }
                        throw th;
                    }
                } catch (xa.q e10) {
                    m0 m0Var2 = (m0) e10.f14823a;
                    try {
                        throw e10;
                    } catch (Throwable th4) {
                        th = th4;
                        m0Var = m0Var2;
                        if (m0Var != null) {
                            i(m0Var);
                        }
                        throw th;
                    }
                }
            case 2:
                f1 f1Var = null;
                try {
                    try {
                        f1.f11940f.getClass();
                        k(new f1(eVar, gVar));
                        return this;
                    } catch (Throwable th5) {
                        th = th5;
                        if (f1Var != null) {
                            k(f1Var);
                        }
                        throw th;
                    }
                } catch (xa.q e11) {
                    f1 f1Var2 = (f1) e11.f14823a;
                    try {
                        throw e11;
                    } catch (Throwable th6) {
                        th = th6;
                        f1Var = f1Var2;
                        if (f1Var != null) {
                            k(f1Var);
                        }
                        throw th;
                    }
                }
            default:
                n0 n0Var = null;
                try {
                    try {
                        n0.f12104f.getClass();
                        j(new n0(eVar));
                        return this;
                    } catch (Throwable th7) {
                        th = th7;
                        if (n0Var != null) {
                            j(n0Var);
                        }
                        throw th;
                    }
                } catch (xa.q e12) {
                    n0 n0Var2 = (n0) e12.f14823a;
                    try {
                        throw e12;
                    } catch (Throwable th8) {
                        th = th8;
                        n0Var = n0Var2;
                        if (n0Var != null) {
                            j(n0Var);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        switch (this.f12109b) {
            case 0:
                h((p) nVar);
                break;
            case 1:
                i((m0) nVar);
                break;
            case 2:
                k((f1) nVar);
                break;
            default:
                j((n0) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f12109b) {
            case 0:
                o oVar = new o(0);
                oVar.f12111d = Collections.EMPTY_LIST;
                oVar.h(d());
                return oVar;
            case 1:
                o oVar2 = new o(1);
                oVar2.f12111d = Collections.EMPTY_LIST;
                oVar2.i(e());
                return oVar2;
            case 2:
                o oVar3 = new o(2);
                oVar3.f12111d = Collections.EMPTY_LIST;
                oVar3.k(g());
                return oVar3;
            default:
                o oVar4 = new o(3);
                oVar4.f12111d = xa.r.f14824b;
                oVar4.j(f());
                return oVar4;
        }
    }

    public p d() {
        p pVar = new p(this);
        if ((this.f12110c & 1) == 1) {
            this.f12111d = Collections.unmodifiableList(this.f12111d);
            this.f12110c &= -2;
        }
        pVar.f12119b = this.f12111d;
        return pVar;
    }

    public m0 e() {
        m0 m0Var = new m0(this);
        if ((this.f12110c & 1) == 1) {
            this.f12111d = Collections.unmodifiableList(this.f12111d);
            this.f12110c &= -2;
        }
        m0Var.f12091b = this.f12111d;
        return m0Var;
    }

    public n0 f() {
        n0 n0Var = new n0(this);
        if ((this.f12110c & 1) == 1) {
            this.f12111d = ((xa.s) this.f12111d).b();
            this.f12110c &= -2;
        }
        n0Var.f12106b = (xa.s) this.f12111d;
        return n0Var;
    }

    public f1 g() {
        f1 f1Var = new f1(this);
        if ((this.f12110c & 1) == 1) {
            this.f12111d = Collections.unmodifiableList(this.f12111d);
            this.f12110c &= -2;
        }
        f1Var.f11942b = this.f12111d;
        return f1Var;
    }

    public void h(p pVar) {
        if (pVar == p.f12116e) {
            return;
        }
        if (!pVar.f12119b.isEmpty()) {
            if (this.f12111d.isEmpty()) {
                this.f12111d = pVar.f12119b;
                this.f12110c &= -2;
            } else {
                if ((this.f12110c & 1) != 1) {
                    this.f12111d = new ArrayList(this.f12111d);
                    this.f12110c |= 1;
                }
                this.f12111d.addAll(pVar.f12119b);
            }
        }
        this.f14792a = this.f14792a.d(pVar.f12118a);
    }

    public void i(m0 m0Var) {
        if (m0Var == m0.f12088e) {
            return;
        }
        if (!m0Var.f12091b.isEmpty()) {
            if (this.f12111d.isEmpty()) {
                this.f12111d = m0Var.f12091b;
                this.f12110c &= -2;
            } else {
                if ((this.f12110c & 1) != 1) {
                    this.f12111d = new ArrayList(this.f12111d);
                    this.f12110c |= 1;
                }
                this.f12111d.addAll(m0Var.f12091b);
            }
        }
        this.f14792a = this.f14792a.d(m0Var.f12090a);
    }

    public void j(n0 n0Var) {
        if (n0Var == n0.f12103e) {
            return;
        }
        if (!n0Var.f12106b.isEmpty()) {
            if (((xa.s) this.f12111d).isEmpty()) {
                this.f12111d = n0Var.f12106b;
                this.f12110c &= -2;
            } else {
                if ((this.f12110c & 1) != 1) {
                    this.f12111d = new xa.r((xa.s) this.f12111d);
                    this.f12110c |= 1;
                }
                ((xa.s) this.f12111d).addAll(n0Var.f12106b);
            }
        }
        this.f14792a = this.f14792a.d(n0Var.f12105a);
    }

    public void k(f1 f1Var) {
        if (f1Var == f1.f11939e) {
            return;
        }
        if (!f1Var.f11942b.isEmpty()) {
            if (this.f12111d.isEmpty()) {
                this.f12111d = f1Var.f11942b;
                this.f12110c &= -2;
            } else {
                if ((this.f12110c & 1) != 1) {
                    this.f12111d = new ArrayList(this.f12111d);
                    this.f12110c |= 1;
                }
                this.f12111d.addAll(f1Var.f11942b);
            }
        }
        this.f14792a = this.f14792a.d(f1Var.f11941a);
    }
}
