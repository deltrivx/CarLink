package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class s0 extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x9.k kVar, s0 s0Var, y9.h hVar, wa.e eVar, int i7, x9.n0 n0Var) {
        super(i7, eVar, kVar, s0Var, n0Var, hVar);
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
        if (n0Var != null) {
        } else {
            D(4);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i7 == 13 || i7 == 18 || i7 == 23) {
            objArr[1] = "initialize";
        } else if (i7 == 24) {
            objArr[1] = "getOriginal";
        } else if (i7 == 29) {
            objArr[1] = "copy";
        } else if (i7 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
                break;
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 23 && i7 != 24 && i7 != 29 && i7 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static s0 N0(c cVar, wa.e eVar, int i7, x9.n0 n0Var) {
        if (cVar == null) {
            D(5);
            throw null;
        }
        if (eVar == null) {
            D(7);
            throw null;
        }
        if (i7 == 0) {
            D(8);
            throw null;
        }
        if (n0Var != null) {
            return new s0(cVar, null, y9.g.f15129a, eVar, i7, n0Var);
        }
        D(9);
        throw null;
    }

    @Override // aa.z
    public z E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, x9.n0 n0Var, y9.h hVar) {
        if (kVar == null) {
            D(25);
            throw null;
        }
        if (i7 == 0) {
            D(26);
            throw null;
        }
        if (hVar == null) {
            D(27);
            throw null;
        }
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
        }
        return new s0(kVar, s0Var, hVar, eVar, i7, n0Var);
    }

    @Override // aa.z, aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final s0 a() {
        s0 s0Var = (s0) super.a();
        if (s0Var != null) {
            return s0Var;
        }
        D(24);
        throw null;
    }

    @Override // aa.z
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final s0 H0(a0 a0Var, a0 a0Var2, List list, List list2, List list3, nb.w wVar, x9.x xVar, ga.o oVar) {
        if (list == null) {
            D(14);
            throw null;
        }
        if (list2 == null) {
            D(15);
            throw null;
        }
        if (list3 == null) {
            D(16);
            throw null;
        }
        if (oVar != null) {
            return Q0(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar, null);
        }
        D(17);
        throw null;
    }

    public s0 Q0(a0 a0Var, a0 a0Var2, List list, List list2, List list3, nb.w wVar, x9.x xVar, ga.o oVar, Map map) {
        if (list == null) {
            D(19);
            throw null;
        }
        if (list2 == null) {
            D(20);
            throw null;
        }
        if (list3 == null) {
            D(21);
            throw null;
        }
        if (oVar == null) {
            D(22);
            throw null;
        }
        super.H0(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar);
        if (map != null && !map.isEmpty()) {
            this.C = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // aa.z, x9.t
    public x9.s s0() {
        return I0(nb.r0.f9028b);
    }
}
