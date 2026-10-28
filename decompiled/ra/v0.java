package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w0 f12233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f12235j;

    public static v0 f() {
        v0 v0Var = new v0();
        v0Var.f12233h = w0.INV;
        List list = Collections.EMPTY_LIST;
        v0Var.f12234i = list;
        v0Var.f12235j = list;
        return v0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        x0 x0VarE = e();
        if (x0VarE.isInitialized()) {
            return x0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        x0 x0Var = null;
        try {
            try {
                x0.f12255n.getClass();
                g(new x0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                x0 x0Var2 = (x0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    x0Var = x0Var2;
                    if (x0Var != null) {
                        g(x0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (x0Var != null) {
                g(x0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((x0) nVar);
        return this;
    }

    public final Object clone() {
        v0 v0VarF = f();
        v0VarF.g(e());
        return v0VarF;
    }

    public final x0 e() {
        x0 x0Var = new x0(this);
        int i7 = this.f12229d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        x0Var.f12258d = this.f12230e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        x0Var.f12259e = this.f12231f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        x0Var.f12260f = this.f12232g;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        x0Var.f12261g = this.f12233h;
        if ((i7 & 16) == 16) {
            this.f12234i = Collections.unmodifiableList(this.f12234i);
            this.f12229d &= -17;
        }
        x0Var.f12262h = this.f12234i;
        if ((this.f12229d & 32) == 32) {
            this.f12235j = Collections.unmodifiableList(this.f12235j);
            this.f12229d &= -33;
        }
        x0Var.f12263i = this.f12235j;
        x0Var.f12257c = i10;
        return x0Var;
    }

    public final void g(x0 x0Var) {
        if (x0Var == x0.f12254m) {
            return;
        }
        int i7 = x0Var.f12257c;
        if ((i7 & 1) == 1) {
            int i10 = x0Var.f12258d;
            this.f12229d = 1 | this.f12229d;
            this.f12230e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = x0Var.f12259e;
            this.f12229d = 2 | this.f12229d;
            this.f12231f = i11;
        }
        if ((i7 & 4) == 4) {
            boolean z10 = x0Var.f12260f;
            this.f12229d = 4 | this.f12229d;
            this.f12232g = z10;
        }
        if ((i7 & 8) == 8) {
            w0 w0Var = x0Var.f12261g;
            w0Var.getClass();
            this.f12229d = 8 | this.f12229d;
            this.f12233h = w0Var;
        }
        if (!x0Var.f12262h.isEmpty()) {
            if (this.f12234i.isEmpty()) {
                this.f12234i = x0Var.f12262h;
                this.f12229d &= -17;
            } else {
                if ((this.f12229d & 16) != 16) {
                    this.f12234i = new ArrayList(this.f12234i);
                    this.f12229d |= 16;
                }
                this.f12234i.addAll(x0Var.f12262h);
            }
        }
        if (!x0Var.f12263i.isEmpty()) {
            if (this.f12235j.isEmpty()) {
                this.f12235j = x0Var.f12263i;
                this.f12229d &= -33;
            } else {
                if ((this.f12229d & 32) != 32) {
                    this.f12235j = new ArrayList(this.f12235j);
                    this.f12229d |= 32;
                }
                this.f12235j.addAll(x0Var.f12263i);
            }
        }
        d(x0Var);
        this.f14792a = this.f14792a.d(x0Var.f12256b);
    }
}
