package aa;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.e f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.i f318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.i f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f320d;

    public c(mb.n nVar, wa.e eVar) {
        if (nVar == null) {
            v0(0);
            throw null;
        }
        if (eVar == null) {
            v0(1);
            throw null;
        }
        this.f317a = eVar;
        mb.k kVar = (mb.k) nVar;
        this.f318b = new mb.i(kVar, new b(this, 0));
        this.f319c = new mb.i(kVar, new b(this, 1));
        this.f320d = new mb.i(kVar, new b(this, 2));
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i7 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i7 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i7 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i7 == 19) {
            objArr[1] = "substitute";
        } else if (i7 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i7) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 9 && i7 != 12 && i7 != 14 && i7 != 16 && i7 != 17 && i7 != 19 && i7 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x9.e
    public final a0 A0() {
        a0 a0Var = (a0) this.f320d.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        v0(5);
        throw null;
    }

    @Override // aa.e0
    public gb.o D(nb.p0 p0Var, ob.g gVar) {
        if (!p0Var.e()) {
            return new gb.t(p0(gVar), new nb.r0(p0Var));
        }
        gb.o oVarP0 = p0(gVar);
        if (oVarP0 != null) {
            return oVarP0;
        }
        v0(12);
        throw null;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.y(this, obj);
    }

    @Override // x9.e
    public final gb.o S(nb.p0 p0Var) {
        db.e.i(za.d.d(this));
        gb.o oVarD = D(p0Var, ob.g.f9640a);
        if (oVarD != null) {
            return oVarD;
        }
        v0(16);
        throw null;
    }

    @Override // aa.e0, x9.e, x9.k, x9.b
    public final x9.e a() {
        return this;
    }

    @Override // aa.e0, x9.e, x9.k, x9.b
    public final x9.h a() {
        return this;
    }

    @Override // aa.e0, x9.k, x9.b
    public final x9.k a() {
        return this;
    }

    @Override // x9.k
    public final wa.e getName() {
        wa.e eVar = this.f317a;
        if (eVar != null) {
            return eVar;
        }
        v0(2);
        throw null;
    }

    @Override // x9.e, x9.h
    public final nb.a0 n() {
        nb.a0 a0Var = (nb.a0) this.f318b.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        v0(20);
        throw null;
    }

    @Override // x9.e
    public gb.o n0() {
        gb.o oVar = (gb.o) this.f319c.invoke();
        if (oVar != null) {
            return oVar;
        }
        v0(4);
        throw null;
    }

    @Override // x9.e
    public gb.o t0() {
        db.e.i(za.d.d(this));
        gb.o oVarP0 = p0(ob.g.f9640a);
        if (oVarP0 != null) {
            return oVarP0;
        }
        v0(17);
        throw null;
    }

    @Override // x9.p0
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public x9.e e(nb.r0 r0Var) {
        if (r0Var != null) {
            return r0Var.f9029a.e() ? this : new d0(this, r0Var);
        }
        v0(18);
        throw null;
    }

    @Override // x9.e
    public List x0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(6);
        throw null;
    }
}
