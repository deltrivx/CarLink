package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f12239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f12240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12243i;

    public static w e() {
        w wVar = new w();
        wVar.f12239e = x.TRUE;
        wVar.f12240f = s0.f12166t;
        List list = Collections.EMPTY_LIST;
        wVar.f12242h = list;
        wVar.f12243i = list;
        return wVar;
    }

    @Override // xa.i
    public final xa.a a() {
        y yVarD = d();
        if (yVarD.isInitialized()) {
            return yVarD;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        y yVar = null;
        try {
            try {
                y.f12267m.getClass();
                f(new y(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                y yVar2 = (y) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        f(yVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (yVar != null) {
                f(yVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((y) nVar);
        return this;
    }

    public final Object clone() {
        w wVarE = e();
        wVarE.f(d());
        return wVarE;
    }

    public final y d() {
        y yVar = new y(this);
        int i7 = this.f12236b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        yVar.f12270c = this.f12237c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        yVar.f12271d = this.f12238d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        yVar.f12272e = this.f12239e;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        yVar.f12273f = this.f12240f;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        yVar.f12274g = this.f12241g;
        if ((i7 & 32) == 32) {
            this.f12242h = Collections.unmodifiableList(this.f12242h);
            this.f12236b &= -33;
        }
        yVar.f12275h = this.f12242h;
        if ((this.f12236b & 64) == 64) {
            this.f12243i = Collections.unmodifiableList(this.f12243i);
            this.f12236b &= -65;
        }
        yVar.f12276i = this.f12243i;
        yVar.f12269b = i10;
        return yVar;
    }

    public final void f(y yVar) {
        s0 s0Var;
        if (yVar == y.f12266l) {
            return;
        }
        int i7 = yVar.f12269b;
        if ((i7 & 1) == 1) {
            int i10 = yVar.f12270c;
            this.f12236b = 1 | this.f12236b;
            this.f12237c = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = yVar.f12271d;
            this.f12236b = 2 | this.f12236b;
            this.f12238d = i11;
        }
        if ((i7 & 4) == 4) {
            x xVar = yVar.f12272e;
            xVar.getClass();
            this.f12236b = 4 | this.f12236b;
            this.f12239e = xVar;
        }
        if ((yVar.f12269b & 8) == 8) {
            s0 s0Var2 = yVar.f12273f;
            if ((this.f12236b & 8) != 8 || (s0Var = this.f12240f) == s0.f12166t) {
                this.f12240f = s0Var2;
            } else {
                r0 r0VarO = s0.o(s0Var);
                r0VarO.g(s0Var2);
                this.f12240f = r0VarO.e();
            }
            this.f12236b |= 8;
        }
        if ((yVar.f12269b & 16) == 16) {
            int i12 = yVar.f12274g;
            this.f12236b = 16 | this.f12236b;
            this.f12241g = i12;
        }
        if (!yVar.f12275h.isEmpty()) {
            if (this.f12242h.isEmpty()) {
                this.f12242h = yVar.f12275h;
                this.f12236b &= -33;
            } else {
                if ((this.f12236b & 32) != 32) {
                    this.f12242h = new ArrayList(this.f12242h);
                    this.f12236b |= 32;
                }
                this.f12242h.addAll(yVar.f12275h);
            }
        }
        if (!yVar.f12276i.isEmpty()) {
            if (this.f12243i.isEmpty()) {
                this.f12243i = yVar.f12276i;
                this.f12236b &= -65;
            } else {
                if ((this.f12236b & 64) != 64) {
                    this.f12243i = new ArrayList(this.f12243i);
                    this.f12236b |= 64;
                }
                this.f12243i.addAll(yVar.f12276i);
            }
        }
        this.f14792a = this.f14792a.d(yVar.f12268a);
    }
}
