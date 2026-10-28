package aa;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends r implements x9.u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nb.w f497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x9.k kVar, y9.h hVar, wa.e eVar, nb.w wVar, x9.n0 n0Var) {
        super(kVar, hVar, eVar, n0Var);
        if (kVar == null) {
            D(0);
            throw null;
        }
        if (hVar == null) {
            D(1);
            throw null;
        }
        if (eVar == null) {
            D(2);
            throw null;
        }
        if (n0Var == null) {
            D(3);
            throw null;
        }
        this.f497e = wVar;
    }

    public static /* synthetic */ void D(int i7) {
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
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x9.b
    public boolean C() {
        return false;
    }

    @Override // x9.b
    public final List X() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(6);
        throw null;
    }

    public a0 b0() {
        return null;
    }

    public a0 e0() {
        return null;
    }

    @Override // h0.a0, hb.d, x9.t0
    public final nb.w getType() {
        nb.w wVar = this.f497e;
        if (wVar != null) {
            return wVar;
        }
        D(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(8);
        throw null;
    }

    public nb.w p() {
        nb.w type = getType();
        if (type != null) {
            return type;
        }
        D(10);
        throw null;
    }
}
