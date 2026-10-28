package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends l {
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f446l;

    /* JADX WARN: Illegal instructions before constructor call */
    public w0(x9.k kVar, y9.h hVar, boolean z10, nb.x0 x0Var, wa.e eVar, int i7, mb.n nVar) {
        x9.o0 o0Var = x9.o0.f14732c;
        if (kVar == null) {
            D(19);
            throw null;
        }
        if (hVar == null) {
            D(20);
            throw null;
        }
        if (x0Var == null) {
            D(21);
            throw null;
        }
        if (eVar == null) {
            D(22);
            throw null;
        }
        if (nVar == null) {
            D(25);
            throw null;
        }
        super(nVar, kVar, hVar, eVar, x0Var, z10, i7, o0Var);
        this.k = new ArrayList(1);
        this.f446l = false;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 5 || i7 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 28) ? 2 : 3];
        switch (i7) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[0] = "bound";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "type";
                break;
        }
        if (i7 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i7 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i7) {
            case 5:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static w0 E0(x9.k kVar, y9.h hVar, boolean z10, nb.x0 x0Var, wa.e eVar, int i7, mb.n nVar) {
        if (kVar == null) {
            D(6);
            throw null;
        }
        if (hVar == null) {
            D(7);
            throw null;
        }
        if (x0Var == null) {
            D(8);
            throw null;
        }
        if (eVar == null) {
            D(9);
            throw null;
        }
        if (nVar != null) {
            return new w0(kVar, hVar, z10, x0Var, eVar, i7, nVar);
        }
        D(11);
        throw null;
    }

    public static w0 F0(c cVar, nb.x0 x0Var, wa.e eVar, int i7, mb.n nVar) {
        if (nVar == null) {
            D(4);
            throw null;
        }
        w0 w0VarE0 = E0(cVar, y9.g.f15129a, false, x0Var, eVar, i7, nVar);
        nb.a0 a0VarN = db.e.e(cVar).n();
        if (w0VarE0.f446l) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0VarE0.G0());
        }
        if (!nb.c.j(a0VarN)) {
            w0VarE0.k.add(a0VarN);
        }
        if (!w0VarE0.f446l) {
            w0VarE0.f446l = true;
            return w0VarE0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0VarE0.G0());
    }

    @Override // aa.l
    public final List D0() {
        if (!this.f446l) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + G0());
        }
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            return arrayList;
        }
        D(28);
        throw null;
    }

    public final String G0() {
        return getName() + " declared in " + za.d.g(l());
    }
}
