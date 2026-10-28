package ua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xa.n;
import xa.q;
import xa.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xa.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f13271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f13272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f13273h;

    public static g e() {
        g gVar = new g();
        gVar.f13268c = 1;
        gVar.f13270e = "";
        gVar.f13271f = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.f13272g = list;
        gVar.f13273h = list;
        return gVar;
    }

    @Override // xa.i
    public final xa.a a() {
        i iVarD = d();
        iVarD.isInitialized();
        return iVarD;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        i iVar = null;
        try {
            try {
                i.f13280n.getClass();
                f(new i(eVar));
                return this;
            } catch (q e7) {
                i iVar2 = (i) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        f(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
                f(iVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(n nVar) {
        f((i) nVar);
        return this;
    }

    public final Object clone() {
        g gVarE = e();
        gVarE.f(d());
        return gVarE;
    }

    public final i d() {
        i iVar = new i(this);
        int i7 = this.f13267b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        iVar.f13283c = this.f13268c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        iVar.f13284d = this.f13269d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        iVar.f13285e = this.f13270e;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        iVar.f13286f = this.f13271f;
        if ((i7 & 16) == 16) {
            this.f13272g = Collections.unmodifiableList(this.f13272g);
            this.f13267b &= -17;
        }
        iVar.f13287g = this.f13272g;
        if ((this.f13267b & 32) == 32) {
            this.f13273h = Collections.unmodifiableList(this.f13273h);
            this.f13267b &= -33;
        }
        iVar.f13289i = this.f13273h;
        iVar.f13282b = i10;
        return iVar;
    }

    public final void f(i iVar) {
        if (iVar == i.f13279m) {
            return;
        }
        int i7 = iVar.f13282b;
        if ((i7 & 1) == 1) {
            int i10 = iVar.f13283c;
            this.f13267b = 1 | this.f13267b;
            this.f13268c = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = iVar.f13284d;
            this.f13267b = 2 | this.f13267b;
            this.f13269d = i11;
        }
        if ((i7 & 4) == 4) {
            this.f13267b |= 4;
            this.f13270e = iVar.f13285e;
        }
        if ((i7 & 8) == 8) {
            h hVar = iVar.f13286f;
            hVar.getClass();
            this.f13267b = 8 | this.f13267b;
            this.f13271f = hVar;
        }
        if (!iVar.f13287g.isEmpty()) {
            if (this.f13272g.isEmpty()) {
                this.f13272g = iVar.f13287g;
                this.f13267b &= -17;
            } else {
                if ((this.f13267b & 16) != 16) {
                    this.f13272g = new ArrayList(this.f13272g);
                    this.f13267b |= 16;
                }
                this.f13272g.addAll(iVar.f13287g);
            }
        }
        if (!iVar.f13289i.isEmpty()) {
            if (this.f13273h.isEmpty()) {
                this.f13273h = iVar.f13289i;
                this.f13267b &= -33;
            } else {
                if ((this.f13267b & 32) != 32) {
                    this.f13273h = new ArrayList(this.f13273h);
                    this.f13267b |= 32;
                }
                this.f13273h.addAll(iVar.f13289i);
            }
        }
        this.f14792a = this.f14792a.d(iVar.f13281a);
    }
}
