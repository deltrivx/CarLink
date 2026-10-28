package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m extends z implements x9.j {
    public final boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x9.e eVar, x9.j jVar, y9.h hVar, boolean z10, int i7, x9.n0 n0Var) {
        super(i7, wa.g.f14255e, eVar, jVar, n0Var, hVar);
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
        this.D = z10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i7 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // aa.z, x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.O(this, obj);
    }

    @Override // aa.z
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public m E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, x9.n0 n0Var, y9.h hVar) {
        if (kVar == null) {
            D(23);
            throw null;
        }
        if (i7 == 0) {
            D(24);
            throw null;
        }
        if (hVar == null) {
            D(25);
            throw null;
        }
        if (i7 == 1 || i7 == 4) {
            return new m((x9.e) kVar, this, hVar, this.D, 1, n0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + ob.a.D(i7));
    }

    @Override // aa.r, x9.k
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final x9.e l() {
        x9.e eVar = (x9.e) super.l();
        if (eVar != null) {
            return eVar;
        }
        D(17);
        throw null;
    }

    @Override // aa.z, aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final m a() {
        m mVar = (m) super.a();
        if (mVar != null) {
            return mVar;
        }
        D(19);
        throw null;
    }

    public final void Q0(List list, ga.o oVar) {
        if (list == null) {
            D(13);
            throw null;
        }
        if (oVar != null) {
            R0(list, oVar, l().q());
        } else {
            D(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void R0(List list, ga.o oVar, List list2) {
        a0 a0VarA0;
        List listX0;
        if (list == null) {
            D(10);
            throw null;
        }
        if (oVar == null) {
            D(11);
            throw null;
        }
        if (list2 == null) {
            D(12);
            throw null;
        }
        x9.e eVarL = l();
        if (eVarL.H()) {
            x9.k kVarL = eVarL.l();
            if (kVarL instanceof x9.e) {
                a0VarA0 = ((x9.e) kVarL).A0();
            } else {
                a0VarA0 = null;
            }
        } else {
            a0VarA0 = null;
        }
        x9.e eVarL2 = l();
        if (eVarL2.x0().isEmpty()) {
            listX0 = Collections.EMPTY_LIST;
            if (listX0 == null) {
                D(16);
                throw null;
            }
        } else {
            listX0 = eVarL2.x0();
            if (listX0 == null) {
                D(15);
                throw null;
            }
        }
        H0(null, a0VarA0, listX0, list2, list, null, x9.x.f14747b, oVar);
    }

    @Override // aa.z, x9.t, x9.p0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final m e(nb.r0 r0Var) {
        if (r0Var != null) {
            return (m) super.e(r0Var);
        }
        D(20);
        throw null;
    }

    @Override // aa.z, x9.c
    public final x9.c W(x9.e eVar, x9.x xVar, ga.o oVar) {
        return (m) D0(eVar, xVar, oVar);
    }

    @Override // aa.z, x9.c, x9.b
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        D(21);
        throw null;
    }

    @Override // aa.z, x9.c
    public final void m0(Collection collection) {
        if (collection != null) {
            return;
        }
        D(22);
        throw null;
    }

    @Override // x9.j
    public final boolean x() {
        return this.D;
    }

    @Override // x9.j
    public final x9.e y() {
        x9.e eVarL = l();
        if (eVarL != null) {
            return eVarL;
        }
        D(18);
        throw null;
    }
}
