package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nb.i f442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.l f444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y9.h f445j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(mb.n nVar, x9.e eVar, nb.a0 a0Var, wa.e eVar2, mb.l lVar, y9.h hVar, x9.n0 n0Var) {
        super(nVar, eVar, eVar2, n0Var);
        if (nVar == null) {
            v0(6);
            throw null;
        }
        if (eVar == null) {
            v0(7);
            throw null;
        }
        if (a0Var == null) {
            v0(8);
            throw null;
        }
        if (eVar2 == null) {
            v0(9);
            throw null;
        }
        if (lVar == null) {
            v0(10);
            throw null;
        }
        this.f445j = hVar;
        this.f442g = new nb.i(this, Collections.EMPTY_LIST, Collections.singleton(a0Var), nVar);
        this.f443h = new v(this, nVar);
        this.f444i = lVar;
    }

    public static w B0(mb.n nVar, x9.e eVar, wa.e eVar2, mb.i iVar, y9.h hVar, x9.n0 n0Var) {
        if (nVar == null) {
            v0(0);
            throw null;
        }
        if (eVar == null) {
            v0(1);
            throw null;
        }
        if (eVar2 == null) {
            v0(2);
            throw null;
        }
        if (iVar != null) {
            return new w(nVar, eVar, eVar.n(), eVar2, iVar, hVar, n0Var);
        }
        v0(3);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x9.e
    public final Collection E() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(23);
        throw null;
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.i
    public final boolean H() {
        return false;
    }

    @Override // x9.e
    public final m P() {
        return null;
    }

    @Override // x9.e
    public final gb.o Q() {
        return gb.n.f6198b;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        ga.o oVar = x9.o.f14721e;
        if (oVar != null) {
            return oVar;
        }
        v0(20);
        throw null;
    }

    @Override // x9.e
    public final x9.f f() {
        return x9.f.f14704d;
    }

    @Override // x9.e
    public final boolean g() {
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        y9.h hVar = this.f445j;
        if (hVar != null) {
            return hVar;
        }
        v0(21);
        throw null;
    }

    @Override // x9.e, x9.w
    public final x9.x i() {
        return x9.x.f14747b;
    }

    @Override // x9.e
    public final boolean j() {
        return false;
    }

    @Override // x9.e
    public final x9.s0 o0() {
        return null;
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        v vVar = this.f443h;
        if (vVar != null) {
            return vVar;
        }
        v0(14);
        throw null;
    }

    @Override // x9.e, x9.i
    public final List q() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(22);
        throw null;
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.i iVar = this.f442g;
        if (iVar != null) {
            return iVar;
        }
        v0(17);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // x9.e
    public final boolean u() {
        return false;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.e
    public final Collection w() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(16);
        throw null;
    }

    @Override // x9.e
    public final boolean z() {
        return false;
    }

    @Override // x9.e
    public final boolean z0() {
        return false;
    }
}
