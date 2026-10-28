package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends r1.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10745o = i1.e(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r1.o f10746p;

    public final l A0(l lVar) {
        r1.o oVar = ((r1.o) lVar).f11117a;
        if (oVar != lVar) {
            r1.o oVar2 = lVar instanceof r1.o ? (r1.o) lVar : null;
            r1.o oVar3 = oVar2 != null ? oVar2.f11121e : null;
            if (oVar != this.f11117a || !i9.l.a(oVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (oVar.f11129n) {
                n2.a.b("Cannot delegate to an already attached node");
            }
            oVar.y0(this.f11117a);
            int i7 = this.f11119c;
            int iF = i1.f(oVar);
            oVar.f11119c = iF;
            int i10 = this.f11119c;
            int i11 = iF & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof x)) {
                n2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + oVar);
            }
            oVar.f11122f = this.f10746p;
            this.f10746p = oVar;
            oVar.f11121e = this;
            C0(iF | this.f11119c, false);
            if (this.f11129n) {
                if (i11 == 0 || (i7 & 2) != 0) {
                    z0(this.f11124h);
                } else {
                    d1 d1Var = f.v(this).E;
                    this.f11117a.z0(null);
                    d1Var.g();
                }
                oVar.o0();
                oVar.w0();
                if (!oVar.f11129n) {
                    n2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                i1.a(oVar, -1, 1);
            }
        }
        return lVar;
    }

    public final void B0(l lVar) {
        r1.o oVar = null;
        for (r1.o oVar2 = this.f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
            if (oVar2 == lVar) {
                boolean z10 = oVar2.f11129n;
                if (z10) {
                    s.c0 c0Var = i1.f10718a;
                    if (!z10) {
                        n2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    i1.a(oVar2, -1, 2);
                    oVar2.x0();
                    oVar2.p0();
                }
                oVar2.y0(oVar2);
                oVar2.f11120d = 0;
                if (oVar == null) {
                    this.f10746p = oVar2.f11122f;
                } else {
                    oVar.f11122f = oVar2.f11122f;
                }
                oVar2.f11122f = null;
                oVar2.f11121e = null;
                int i7 = this.f11119c;
                int iF = i1.f(this);
                C0(iF, true);
                if (this.f11129n && (i7 & 2) != 0 && (iF & 2) == 0) {
                    d1 d1Var = f.v(this).E;
                    this.f11117a.z0(null);
                    d1Var.g();
                    return;
                }
                return;
            }
            oVar = oVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + lVar).toString());
    }

    public final void C0(int i7, boolean z10) {
        r1.o oVar;
        int i10 = this.f11119c;
        this.f11119c = i7;
        if (i10 != i7) {
            r1.o oVar2 = this.f11117a;
            if (oVar2 == this) {
                this.f11120d = i7;
            }
            if (this.f11129n) {
                r1.o oVar3 = this;
                while (oVar3 != null) {
                    i7 |= oVar3.f11119c;
                    oVar3.f11119c = i7;
                    if (oVar3 == oVar2) {
                        break;
                    } else {
                        oVar3 = oVar3.f11121e;
                    }
                }
                if (z10 && oVar3 == oVar2) {
                    i7 = i1.f(oVar2);
                    oVar2.f11119c = i7;
                }
                int i11 = i7 | ((oVar3 == null || (oVar = oVar3.f11122f) == null) ? 0 : oVar.f11120d);
                while (oVar3 != null) {
                    i11 |= oVar3.f11119c;
                    oVar3.f11120d = i11;
                    oVar3 = oVar3.f11121e;
                }
            }
        }
    }

    @Override // r1.o
    public final void o0() {
        super.o0();
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.z0(this.f11124h);
            if (!oVar.f11129n) {
                oVar.o0();
            }
        }
    }

    @Override // r1.o
    public final void p0() {
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.p0();
        }
        super.p0();
    }

    @Override // r1.o
    public final void v0() {
        super.v0();
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.v0();
        }
    }

    @Override // r1.o
    public final void w0() {
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.w0();
        }
        super.w0();
    }

    @Override // r1.o
    public final void x0() {
        super.x0();
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.x0();
        }
    }

    @Override // r1.o
    public final void y0(r1.o oVar) {
        this.f11117a = oVar;
        for (r1.o oVar2 = this.f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
            oVar2.y0(oVar);
        }
    }

    @Override // r1.o
    public final void z0(h1 h1Var) {
        this.f11124h = h1Var;
        for (r1.o oVar = this.f10746p; oVar != null; oVar = oVar.f11122f) {
            oVar.z0(h1Var);
        }
    }
}
