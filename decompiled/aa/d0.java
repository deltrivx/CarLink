package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb.r0 f328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nb.r0 f329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.i f332f;

    public d0(e0 e0Var, nb.r0 r0Var) {
        this.f327a = e0Var;
        this.f328b = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10 || i7 == 13 || i7 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10 || i7 == 13 || i7 == 23) ? 3 : 2];
        if (i7 == 2) {
            objArr[0] = "typeArguments";
        } else if (i7 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i7 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 == 8) {
            objArr[0] = "typeArguments";
        } else if (i7 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i7 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[1] = "getModality";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[1] = "getVisibility";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i7 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i7 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6 && i7 != 8 && i7 != 10 && i7 != 13 && i7 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // x9.e
    public final a0 A0() {
        throw new UnsupportedOperationException();
    }

    @Override // aa.e0
    public final gb.o D(nb.p0 p0Var, ob.g gVar) {
        gb.o oVarD = this.f327a.D(p0Var, gVar);
        if (!this.f328b.f9029a.e()) {
            return new gb.t(oVarD, w0());
        }
        if (oVarD != null) {
            return oVarD;
        }
        v0(7);
        throw null;
    }

    @Override // x9.e
    public final Collection E() {
        Collection collectionE = this.f327a.E();
        if (collectionE != null) {
            return collectionE;
        }
        v0(31);
        throw null;
    }

    @Override // x9.w
    public final boolean G() {
        return this.f327a.G();
    }

    @Override // x9.i
    public final boolean H() {
        return this.f327a.H();
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.y(this, obj);
    }

    @Override // x9.e
    public final m P() {
        return this.f327a.P();
    }

    @Override // x9.e
    public final gb.o Q() {
        gb.o oVarQ = this.f327a.Q();
        if (oVarQ != null) {
            return oVarQ;
        }
        v0(15);
        throw null;
    }

    @Override // x9.e
    public final gb.o S(nb.p0 p0Var) {
        db.e.i(za.d.d(this));
        return D(p0Var, ob.g.f9640a);
    }

    @Override // aa.e0, x9.e, x9.k, x9.b
    public final x9.e a() {
        x9.e eVarA = this.f327a.a();
        if (eVarA != null) {
            return eVarA;
        }
        v0(21);
        throw null;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        ga.o oVarD = this.f327a.d();
        if (oVarD != null) {
            return oVarD;
        }
        v0(27);
        throw null;
    }

    @Override // x9.p0
    public final x9.l e(nb.r0 r0Var) {
        if (r0Var != null) {
            return r0Var.f9029a.e() ? this : new d0(this, nb.r0.e(r0Var.f(), w0().f()));
        }
        v0(23);
        throw null;
    }

    @Override // x9.e
    public final x9.f f() {
        x9.f fVarF = this.f327a.f();
        if (fVarF != null) {
            return fVarF;
        }
        v0(25);
        throw null;
    }

    @Override // x9.e
    public final boolean g() {
        return this.f327a.g();
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        y9.h annotations = this.f327a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        v0(19);
        throw null;
    }

    @Override // x9.k
    public final wa.e getName() {
        wa.e name = this.f327a.getName();
        if (name != null) {
            return name;
        }
        v0(20);
        throw null;
    }

    @Override // x9.l
    public final x9.n0 getSource() {
        return x9.n0.f14716e0;
    }

    @Override // x9.e, x9.w
    public final x9.x i() {
        x9.x xVarI = this.f327a.i();
        if (xVarI != null) {
            return xVarI;
        }
        v0(26);
        throw null;
    }

    @Override // x9.e
    public final boolean j() {
        return this.f327a.j();
    }

    @Override // x9.k
    public final x9.k l() {
        x9.k kVarL = this.f327a.l();
        if (kVarL != null) {
            return kVarL;
        }
        v0(22);
        throw null;
    }

    @Override // x9.e, x9.h
    public final nb.a0 n() {
        nb.h0 h0VarB0;
        List listD = nb.u0.d(t().n());
        y9.h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            nb.h0.f8997b.getClass();
            h0VarB0 = nb.h0.f8998c;
        } else {
            u0.k kVar = nb.h0.f8997b;
            List listI = n3.l.I(new nb.g(annotations));
            kVar.getClass();
            h0VarB0 = u0.k.B0(listI);
        }
        return nb.c.u(t0(), listD, h0VarB0, t(), false);
    }

    @Override // x9.e
    public final gb.o n0() {
        gb.o oVarN0 = this.f327a.n0();
        if (oVarN0 != null) {
            return oVarN0;
        }
        v0(28);
        throw null;
    }

    @Override // x9.e
    public final x9.s0 o0() {
        x9.s0 s0VarO0 = this.f327a.o0();
        if (s0VarO0 == null) {
            return null;
        }
        boolean z10 = s0VarO0 instanceof x9.u;
        nb.x0 x0Var = nb.x0.INVARIANT;
        nb.r0 r0Var = this.f328b;
        if (z10) {
            x9.u uVar = (x9.u) s0VarO0;
            wa.e eVar = uVar.f14741a;
            nb.a0 a0Var = (nb.a0) uVar.f14742b;
            if (a0Var != null && !r0Var.f9029a.e()) {
                a0Var = (nb.a0) w0().i(a0Var, x0Var);
            }
            return new x9.u(eVar, a0Var);
        }
        if (!(s0VarO0 instanceof x9.z)) {
            throw new cc.s();
        }
        ArrayList<t8.j> arrayList = ((x9.z) s0VarO0).f14754a;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        for (t8.j jVar : arrayList) {
            wa.e eVar2 = (wa.e) jVar.f12830a;
            nb.a0 a0Var2 = (nb.a0) ((qb.e) jVar.f12831b);
            if (a0Var2 != null && !r0Var.f9029a.e()) {
                a0Var2 = (nb.a0) w0().i(a0Var2, x0Var);
            }
            arrayList2.add(new t8.j(eVar2, a0Var2));
        }
        return new x9.z(arrayList2);
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        gb.o oVarP0 = this.f327a.p0(gVar);
        if (!this.f328b.f9029a.e()) {
            return new gb.t(oVarP0, w0());
        }
        if (oVarP0 != null) {
            return oVarP0;
        }
        v0(14);
        throw null;
    }

    @Override // x9.e, x9.i
    public final List q() {
        w0();
        ArrayList arrayList = this.f331e;
        if (arrayList != null) {
            return arrayList;
        }
        v0(30);
        throw null;
    }

    @Override // x9.w
    public final boolean s() {
        return this.f327a.s();
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.k0 k0VarT = this.f327a.t();
        if (this.f328b.f9029a.e()) {
            if (k0VarT != null) {
                return k0VarT;
            }
            v0(0);
            throw null;
        }
        if (this.f332f == null) {
            nb.r0 r0VarW0 = w0();
            Collection collectionM = k0VarT.m();
            ArrayList arrayList = new ArrayList(collectionM.size());
            Iterator it = collectionM.iterator();
            while (it.hasNext()) {
                arrayList.add(r0VarW0.i((nb.w) it.next(), nb.x0.INVARIANT));
            }
            this.f332f = new nb.i(this, this.f330d, arrayList, mb.k.f8627e);
        }
        nb.i iVar = this.f332f;
        if (iVar != null) {
            return iVar;
        }
        v0(1);
        throw null;
    }

    @Override // x9.e
    public final gb.o t0() {
        db.e.i(za.d.d(this.f327a));
        return p0(ob.g.f9640a);
    }

    @Override // x9.e
    public final boolean u() {
        return this.f327a.u();
    }

    @Override // x9.w
    public final boolean u0() {
        return this.f327a.u0();
    }

    @Override // x9.e
    public final Collection w() {
        Collection<m> collectionW = this.f327a.w();
        ArrayList arrayList = new ArrayList(collectionW.size());
        for (m mVar : collectionW) {
            m mVar2 = mVar;
            mVar2.getClass();
            y yVarI0 = mVar2.I0(nb.r0.f9028b);
            yVarI0.f452e = mVar.B0();
            yVarI0.i(mVar2.i());
            yVarI0.m(mVar2.d());
            yVarI0.k(mVar2.f());
            yVarI0.f459m = false;
            arrayList.add(((m) yVarI0.f470x.F0(yVarI0)).e(w0()));
        }
        return arrayList;
    }

    public final nb.r0 w0() {
        if (this.f329c == null) {
            nb.r0 r0Var = this.f328b;
            if (r0Var.f9029a.e()) {
                this.f329c = r0Var;
            } else {
                List listN = this.f327a.t().n();
                this.f330d = new ArrayList(listN.size());
                this.f329c = nb.c.z(listN, r0Var.f(), this, this.f330d);
                ArrayList arrayList = this.f330d;
                i9.l.e(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((x9.r0) obj).g0()) {
                        arrayList2.add(obj);
                    }
                }
                this.f331e = arrayList2;
            }
        }
        return this.f329c;
    }

    @Override // x9.e
    public final List x0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(17);
        throw null;
    }

    @Override // x9.e
    public final boolean z() {
        return this.f327a.z();
    }

    @Override // x9.e
    public final boolean z0() {
        return this.f327a.z0();
    }
}
