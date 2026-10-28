package r1;

import cc.a1;
import cc.b0;
import cc.c1;
import cc.v;
import cc.y;
import q2.h1;
import q2.m1;
import r2.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements q2.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hc.c f11118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11119c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f11121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f11122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m1 f11123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1 f11124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11126j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k2.d f11128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11129n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f11117a = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11120d = -1;

    public final y m0() {
        hc.c cVar = this.f11118b;
        if (cVar != null) {
            return cVar;
        }
        hc.c cVarA = b0.a(((u) q2.f.w(this)).getCoroutineContext().s(new c1((a1) ((u) q2.f.w(this)).getCoroutineContext().l(v.f2678b))));
        this.f11118b = cVarA;
        return cVarA;
    }

    public boolean n0() {
        return !(this instanceof x.l);
    }

    public void o0() {
        if (this.f11129n) {
            n2.a.b("node attached multiple times");
        }
        if (this.f11124h == null) {
            n2.a.b("attach invoked on a node without a coordinator");
        }
        this.f11129n = true;
        this.k = true;
    }

    public void p0() {
        if (!this.f11129n) {
            n2.a.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            n2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f11127l) {
            n2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f11129n = false;
        hc.c cVar = this.f11118b;
        if (cVar != null) {
            b0.e(cVar, new k2.y(2, "The Modifier.Node was detached"));
            this.f11118b = null;
        }
    }

    public void q0() {
    }

    public /* synthetic */ void r0() {
    }

    public void s0() {
    }

    public /* synthetic */ void t0() {
    }

    public void u0() {
    }

    public void v0() {
        if (!this.f11129n) {
            n2.a.b("reset() called on an unattached node");
        }
        u0();
    }

    public void w0() {
        if (!this.f11129n) {
            n2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            n2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        q0();
        this.f11127l = true;
    }

    public void x0() {
        if (!this.f11129n) {
            n2.a.b("node detached multiple times");
        }
        if (this.f11124h == null) {
            n2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f11127l) {
            n2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f11127l = false;
        k2.d dVar = this.f11128m;
        if (dVar != null) {
            dVar.invoke();
        }
        s0();
    }

    public void y0(o oVar) {
        this.f11117a = oVar;
    }

    public void z0(h1 h1Var) {
        this.f11124h = h1Var;
    }
}
