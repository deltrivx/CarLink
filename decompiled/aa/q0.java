package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends n0 implements x9.j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public nb.w f425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0 f426n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(x9.k0 k0Var, y9.h hVar, x9.x xVar, ga.o oVar, boolean z10, boolean z11, boolean z12, int i7, q0 q0Var, x9.n0 n0Var) {
        super(xVar, oVar, k0Var, hVar, wa.e.g("<get-" + k0Var.getName() + ">"), z10, z11, z12, i7, n0Var);
        if (hVar == null) {
            D(1);
            throw null;
        }
        if (xVar == null) {
            D(2);
            throw null;
        }
        if (oVar == null) {
            D(3);
            throw null;
        }
        if (i7 == 0) {
            D(4);
            throw null;
        }
        if (n0Var == null) {
            D(5);
            throw null;
        }
        this.f426n = q0Var != null ? q0Var : this;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 6 || i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 6 || i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i7 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final q0 a() {
        q0 q0Var = this.f426n;
        if (q0Var != null) {
            return q0Var;
        }
        D(8);
        throw null;
    }

    public final void F0(nb.w wVar) {
        if (wVar == null) {
            wVar = C0().getType();
        }
        this.f425m = wVar;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.I(this, obj);
    }

    @Override // x9.b
    public final List X() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(7);
        throw null;
    }

    @Override // x9.c, x9.b
    public final Collection m() {
        return D0(true);
    }

    @Override // x9.b
    public final nb.w p() {
        return this.f425m;
    }
}
