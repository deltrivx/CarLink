package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends nb.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.o0 f366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, mb.n nVar, x9.o0 o0Var) {
        super(nVar);
        if (nVar == null) {
            h(0);
            throw null;
        }
        this.f367d = lVar;
        this.f366c = o0Var;
    }

    public static /* synthetic */ void h(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i7 == 2) {
            objArr[1] = "getParameters";
        } else if (i7 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i7 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // nb.f
    public final Collection b() {
        List listD0 = this.f367d.D0();
        if (listD0 != null) {
            return listD0;
        }
        h(1);
        throw null;
    }

    @Override // nb.f
    public final nb.w c() {
        return pb.l.c(pb.k.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // nb.f
    public final x9.o0 d() {
        x9.o0 o0Var = this.f366c;
        if (o0Var != null) {
            return o0Var;
        }
        h(5);
        throw null;
    }

    @Override // nb.f
    public final boolean f(x9.h hVar) {
        if (!(hVar instanceof x9.r0)) {
            return false;
        }
        return za.b.f15790a.d(this.f367d, (x9.r0) hVar, true, za.a.f15789a);
    }

    @Override // nb.f
    public final List g(List list) {
        List listC0 = this.f367d.C0(list);
        if (listC0 != null) {
            return listC0;
        }
        h(8);
        throw null;
    }

    @Override // nb.k0
    public final u9.i k() {
        u9.i iVarE = db.e.e(this.f367d);
        if (iVarE != null) {
            return iVarE;
        }
        h(4);
        throw null;
    }

    @Override // nb.k0
    public final x9.h l() {
        l lVar = this.f367d;
        if (lVar != null) {
            return lVar;
        }
        h(3);
        throw null;
    }

    @Override // nb.k0
    public final List n() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        h(2);
        throw null;
    }

    @Override // nb.k0
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return this.f367d.getName().f14247a;
    }
}
