package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends q implements x9.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f310c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.k f311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hb.d f312e;

    public a0(x9.e eVar) {
        super(y9.g.f15129a, wa.g.f14254d);
        this.f311d = eVar;
        this.f312e = new hb.c(eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(x9.k kVar, h0.a0 a0Var, y9.h hVar) {
        this(kVar, a0Var, hVar, wa.g.f14254d);
        if (kVar == null) {
            p0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            p0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x9.k kVar, h0.a0 a0Var, y9.h hVar, wa.e eVar) {
        super(hVar, eVar);
        if (kVar == null) {
            p0(3);
            throw null;
        }
        if (hVar == null) {
            p0(5);
            throw null;
        }
        if (eVar == null) {
            p0(6);
            throw null;
        }
        this.f311d = kVar;
        this.f312e = a0Var;
    }

    public static /* synthetic */ void B0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i7) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i7 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i7 == 1) {
            objArr[1] = "getValue";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void p0(int i7) {
        String str = (i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i7 == 7) {
            objArr[1] = "getValue";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i7) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x9.b
    public final boolean C() {
        return false;
    }

    public final hb.d C0() {
        switch (this.f310c) {
            case 0:
                hb.c cVar = (hb.c) this.f312e;
                if (cVar != null) {
                    return cVar;
                }
                D(1);
                throw null;
            default:
                h0.a0 a0Var = (h0.a0) this.f312e;
                if (a0Var != null) {
                    return a0Var;
                }
                p0(7);
                throw null;
        }
    }

    @Override // x9.p0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final a0 e(nb.r0 r0Var) {
        if (r0Var == null) {
            B0(3);
            throw null;
        }
        if (!r0Var.f9029a.e()) {
            nb.w wVarI = l() instanceof x9.e ? r0Var.i(getType(), nb.x0.OUT_VARIANCE) : r0Var.i(getType(), nb.x0.INVARIANT);
            if (wVarI == null) {
                return null;
            }
            if (wVarI != getType()) {
                return new a0(l(), new hb.e(wVarI), getAnnotations());
            }
        }
        return this;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.p(this, obj);
    }

    @Override // x9.b
    public final List X() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B0(7);
        throw null;
    }

    @Override // aa.q, x9.k, x9.b
    public final x9.b a() {
        return this;
    }

    @Override // aa.q, x9.k, x9.b
    public final x9.k a() {
        return this;
    }

    @Override // x9.b
    public final a0 b0() {
        return null;
    }

    @Override // x9.n
    public final ga.o d() {
        ga.o oVar = x9.o.f14722f;
        if (oVar != null) {
            return oVar;
        }
        B0(9);
        throw null;
    }

    @Override // x9.b
    public final a0 e0() {
        return null;
    }

    @Override // x9.l
    public final x9.n0 getSource() {
        return x9.n0.f14716e0;
    }

    @Override // h0.a0, hb.d, x9.t0
    public final nb.w getType() {
        nb.w type = C0().getType();
        if (type != null) {
            return type;
        }
        B0(6);
        throw null;
    }

    @Override // x9.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B0(5);
        throw null;
    }

    @Override // x9.k
    public final x9.k l() {
        switch (this.f310c) {
            case 0:
                x9.e eVar = (x9.e) this.f311d;
                if (eVar != null) {
                    return eVar;
                }
                D(2);
                throw null;
            default:
                x9.k kVar = this.f311d;
                if (kVar != null) {
                    return kVar;
                }
                p0(8);
                throw null;
        }
    }

    @Override // x9.b
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        B0(8);
        throw null;
    }

    @Override // x9.b
    public final nb.w p() {
        return getType();
    }

    @Override // aa.q
    public String toString() {
        switch (this.f310c) {
            case 0:
                return "class " + ((x9.e) this.f311d).getName() + "::this";
            default:
                return super.toString();
        }
    }
}
