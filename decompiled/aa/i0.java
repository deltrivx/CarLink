package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x9.f f355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x9.x f356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ga.o f357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nb.i f358j;
    public ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mb.n f360m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s sVar, wa.e eVar, mb.n nVar) {
        super(nVar, sVar, eVar, x9.n0.f14716e0);
        if (nVar == null) {
            v0(4);
            throw null;
        }
        this.f359l = new ArrayList();
        this.f360m = nVar;
        this.f355g = x9.f.f14702b;
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        v0(19);
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
        ga.o oVar = this.f357i;
        if (oVar != null) {
            return oVar;
        }
        v0(10);
        throw null;
    }

    @Override // x9.e
    public final x9.f f() {
        x9.f fVar = this.f355g;
        if (fVar != null) {
            return fVar;
        }
        v0(8);
        throw null;
    }

    @Override // x9.e
    public final boolean g() {
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return y9.g.f15129a;
    }

    @Override // x9.e, x9.w
    public final x9.x i() {
        x9.x xVar = this.f356h;
        if (xVar != null) {
            return xVar;
        }
        v0(7);
        throw null;
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
        return gb.n.f6198b;
    }

    @Override // x9.e, x9.i
    public final List q() {
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            return arrayList;
        }
        v0(15);
        throw null;
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.i iVar = this.f358j;
        if (iVar != null) {
            return iVar;
        }
        v0(11);
        throw null;
    }

    public final String toString() {
        return q.w0(this);
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
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        v0(13);
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
