package ia;

import aa.a0;
import aa.s0;
import aa.y;
import aa.z;
import ga.o;
import i9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import nb.r0;
import nb.w;
import t8.j;
import tb.i;
import tb.r;
import x9.k;
import x9.n0;
import x9.t;
import x9.x;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s0 implements a {
    public static final cb.b F = new cb.b();
    public static final cb.b G = new cb.b();
    public int D;
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, s0 s0Var, h hVar, wa.e eVar, int i7, n0 n0Var, boolean z10) {
        super(kVar, s0Var, hVar, eVar, i7, n0Var);
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
        if (i7 == 0) {
            D(3);
            throw null;
        }
        this.D = 0;
        this.E = z10;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 21) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 13) {
            objArr[1] = "initialize";
        } else if (i7 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e R0(k kVar, ja.c cVar, wa.e eVar, ca.g gVar, boolean z10) {
        if (kVar == null) {
            D(5);
            throw null;
        }
        if (eVar != null) {
            return new e(kVar, null, cVar, eVar, 1, gVar, z10);
        }
        D(7);
        throw null;
    }

    @Override // aa.z, x9.b
    public final boolean C() {
        return a2.f.z(this.D);
    }

    @Override // aa.s0, aa.z
    public final z E0(int i7, wa.e eVar, k kVar, t tVar, n0 n0Var, h hVar) {
        if (kVar == null) {
            D(14);
            throw null;
        }
        if (i7 == 0) {
            D(15);
            throw null;
        }
        if (hVar == null) {
            D(16);
            throw null;
        }
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
        }
        e eVar2 = new e(kVar, s0Var, hVar, eVar, i7, n0Var, this.E);
        int i10 = this.D;
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = true;
            } else if (i10 != 3) {
                if (i10 != 4) {
                    throw null;
                }
                z10 = true;
            }
        }
        eVar2.S0(z10, a2.f.z(i10));
        return eVar2;
    }

    @Override // ia.a
    public final a L(w wVar, ArrayList arrayList, w wVar2, j jVar) {
        ArrayList arrayListP = k9.a.p(arrayList, X(), this);
        a0 a0VarK = wVar == null ? null : za.k.k(this, wVar, y9.g.f15129a);
        y yVarI0 = I0(r0.f9028b);
        yVarI0.f454g = arrayListP;
        yVarI0.k = wVar2;
        yVarI0.f456i = a0VarK;
        yVarI0.f462p = true;
        yVarI0.f461o = true;
        e eVar = (e) yVarI0.f470x.F0(yVarI0);
        if (jVar != null) {
            eVar.J0((x9.a) jVar.f12830a, jVar.f12831b);
        }
        if (eVar != null) {
            return eVar;
        }
        D(21);
        throw null;
    }

    @Override // aa.s0
    public final s0 Q0(a0 a0Var, a0 a0Var2, List list, List list2, List list3, w wVar, x xVar, o oVar, Map map) {
        tb.f fVar;
        if (list == null) {
            D(9);
            throw null;
        }
        if (list2 == null) {
            D(10);
            throw null;
        }
        if (list3 == null) {
            D(11);
            throw null;
        }
        if (oVar == null) {
            D(12);
            throw null;
        }
        super.Q0(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar, map);
        for (i iVar : r.f12925d) {
            zb.i iVar2 = iVar.f12908b;
            wa.e eVar = iVar.f12907a;
            if (eVar == null || l.a(getName(), eVar)) {
                if (iVar2 != null) {
                    String strB = getName().b();
                    l.d(strB, "asString(...)");
                    if (!iVar2.a(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.f12909c;
                if (collection == null || collection.contains(getName())) {
                    for (tb.e eVar2 : iVar.f12911e) {
                        if (eVar2.c(this) != null) {
                            fVar = new tb.f(false);
                            this.f483m = fVar.f12896a;
                            return this;
                        }
                    }
                    fVar = ((String) iVar.f12910d.invoke(this)) != null ? new tb.f(false) : tb.f.f12895c;
                    this.f483m = fVar.f12896a;
                    return this;
                }
            }
        }
        fVar = tb.f.f12894b;
        this.f483m = fVar.f12896a;
        return this;
    }

    public final void S0(boolean z10, boolean z11) {
        int i7;
        if (z10) {
            i7 = z11 ? 4 : 2;
        } else {
            i7 = z11 ? 3 : 1;
        }
        this.D = i7;
    }
}
