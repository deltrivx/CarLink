package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f11879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f11880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f11881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y0 f11882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f1 f11883i;

    public static d0 f() {
        d0 d0Var = new d0();
        List list = Collections.EMPTY_LIST;
        d0Var.f11879e = list;
        d0Var.f11880f = list;
        d0Var.f11881g = list;
        d0Var.f11882h = y0.f12278g;
        d0Var.f11883i = f1.f11939e;
        return d0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        e0 e0VarE = e();
        if (e0VarE.isInitialized()) {
            return e0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        e0 e0Var = null;
        try {
            try {
                e0.f11905l.getClass();
                g(new e0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                e0 e0Var2 = (e0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        g(e0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (e0Var != null) {
                g(e0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((e0) nVar);
        return this;
    }

    public final Object clone() {
        d0 d0VarF = f();
        d0VarF.g(e());
        return d0VarF;
    }

    public final e0 e() {
        e0 e0Var = new e0(this);
        int i7 = this.f11878d;
        if ((i7 & 1) == 1) {
            this.f11879e = Collections.unmodifiableList(this.f11879e);
            this.f11878d &= -2;
        }
        e0Var.f11908d = this.f11879e;
        if ((this.f11878d & 2) == 2) {
            this.f11880f = Collections.unmodifiableList(this.f11880f);
            this.f11878d &= -3;
        }
        e0Var.f11909e = this.f11880f;
        if ((this.f11878d & 4) == 4) {
            this.f11881g = Collections.unmodifiableList(this.f11881g);
            this.f11878d &= -5;
        }
        e0Var.f11910f = this.f11881g;
        int i10 = (i7 & 8) != 8 ? 0 : 1;
        e0Var.f11911g = this.f11882h;
        if ((i7 & 16) == 16) {
            i10 |= 2;
        }
        e0Var.f11912h = this.f11883i;
        e0Var.f11907c = i10;
        return e0Var;
    }

    public final void g(e0 e0Var) {
        f1 f1Var;
        y0 y0Var;
        if (e0Var == e0.k) {
            return;
        }
        if (!e0Var.f11908d.isEmpty()) {
            if (this.f11879e.isEmpty()) {
                this.f11879e = e0Var.f11908d;
                this.f11878d &= -2;
            } else {
                if ((this.f11878d & 1) != 1) {
                    this.f11879e = new ArrayList(this.f11879e);
                    this.f11878d |= 1;
                }
                this.f11879e.addAll(e0Var.f11908d);
            }
        }
        if (!e0Var.f11909e.isEmpty()) {
            if (this.f11880f.isEmpty()) {
                this.f11880f = e0Var.f11909e;
                this.f11878d &= -3;
            } else {
                if ((this.f11878d & 2) != 2) {
                    this.f11880f = new ArrayList(this.f11880f);
                    this.f11878d |= 2;
                }
                this.f11880f.addAll(e0Var.f11909e);
            }
        }
        if (!e0Var.f11910f.isEmpty()) {
            if (this.f11881g.isEmpty()) {
                this.f11881g = e0Var.f11910f;
                this.f11878d &= -5;
            } else {
                if ((this.f11878d & 4) != 4) {
                    this.f11881g = new ArrayList(this.f11881g);
                    this.f11878d |= 4;
                }
                this.f11881g.addAll(e0Var.f11910f);
            }
        }
        if ((e0Var.f11907c & 1) == 1) {
            y0 y0Var2 = e0Var.f11911g;
            if ((this.f11878d & 8) != 8 || (y0Var = this.f11882h) == y0.f12278g) {
                this.f11882h = y0Var2;
            } else {
                g gVarG = y0.g(y0Var);
                gVarG.h(y0Var2);
                this.f11882h = gVarG.e();
            }
            this.f11878d |= 8;
        }
        if ((e0Var.f11907c & 2) == 2) {
            f1 f1Var2 = e0Var.f11912h;
            if ((this.f11878d & 16) != 16 || (f1Var = this.f11883i) == f1.f11939e) {
                this.f11883i = f1Var2;
            } else {
                o oVar = new o(2);
                oVar.f12111d = Collections.EMPTY_LIST;
                oVar.k(f1Var);
                oVar.k(f1Var2);
                this.f11883i = oVar.g();
            }
            this.f11878d |= 16;
        }
        d(e0Var);
        this.f14792a = this.f14792a.d(e0Var.f11906b);
    }
}
