package ia;

import aa.m;
import aa.z;
import java.util.ArrayList;
import nb.w;
import t8.j;
import x9.k;
import x9.n0;
import x9.t;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements a {
    public Boolean E;
    public Boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x9.e eVar, b bVar, h hVar, boolean z10, int i7, n0 n0Var) {
        super(eVar, bVar, hVar, z10, i7, n0Var);
        if (eVar == null) {
            D(0);
            throw null;
        }
        if (hVar == null) {
            D(1);
            throw null;
        }
        if (i7 == 0) {
            D(2);
            throw null;
        }
        if (n0Var == null) {
            D(3);
            throw null;
        }
        this.E = null;
        this.F = null;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 11 || i7 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 11 || i7 == 18) ? 2 : 3];
        switch (i7) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b T0(x9.e eVar, h hVar, boolean z10, ca.g gVar) {
        if (eVar != null) {
            return new b(eVar, null, hVar, z10, 1, gVar);
        }
        D(4);
        throw null;
    }

    @Override // aa.z, x9.b
    public final boolean C() {
        return this.F.booleanValue();
    }

    @Override // aa.m, aa.z
    public final /* bridge */ /* synthetic */ z E0(int i7, wa.e eVar, k kVar, t tVar, n0 n0Var, h hVar) {
        return U0(kVar, tVar, i7, hVar, n0Var);
    }

    @Override // aa.z
    public final void K0(boolean z10) {
        this.E = Boolean.valueOf(z10);
    }

    @Override // ia.a
    public final a L(w wVar, ArrayList arrayList, w wVar2, j jVar) {
        b bVarU0 = U0(l(), null, f(), getAnnotations(), getSource());
        bVarU0.H0(wVar == null ? null : za.k.k(bVarU0, wVar, y9.g.f15129a), this.f481j, u8.w.f13122a, getTypeParameters(), k9.a.p(arrayList, X(), bVarU0), wVar2, i(), d());
        if (jVar != null) {
            bVarU0.J0((x9.a) jVar.f12830a, jVar.f12831b);
        }
        return bVarU0;
    }

    @Override // aa.z
    public final void L0(boolean z10) {
        this.F = Boolean.valueOf(z10);
    }

    @Override // aa.m
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ m E0(int i7, wa.e eVar, k kVar, t tVar, n0 n0Var, h hVar) {
        return U0(kVar, tVar, i7, hVar, n0Var);
    }

    public final b U0(k kVar, t tVar, int i7, h hVar, n0 n0Var) {
        if (kVar == null) {
            D(7);
            throw null;
        }
        if (i7 == 0) {
            D(8);
            throw null;
        }
        if (hVar == null) {
            D(9);
            throw null;
        }
        if (n0Var == null) {
            D(10);
            throw null;
        }
        if (i7 != 1 && i7 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + ob.a.D(i7));
        }
        x9.e eVar = (x9.e) kVar;
        b bVar = (b) tVar;
        if (i7 == 0) {
            D(13);
            throw null;
        }
        b bVar2 = new b(eVar, bVar, hVar, this.D, i7, n0Var);
        Boolean bool = this.E;
        bool.getClass();
        bVar2.E = bool;
        Boolean bool2 = this.F;
        bool2.getClass();
        bVar2.F = bool2;
        return bVar2;
    }
}
