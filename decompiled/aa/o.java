package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x9.x f387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x9.f f388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nb.i f389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gb.o f390j;
    public Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x9.k kVar, wa.e eVar, x9.x xVar, x9.f fVar, List list, mb.n nVar) {
        super(nVar, kVar, eVar, x9.n0.f14716e0);
        if (kVar == null) {
            v0(0);
            throw null;
        }
        if (eVar == null) {
            v0(1);
            throw null;
        }
        if (nVar == null) {
            v0(6);
            throw null;
        }
        this.f387g = xVar;
        this.f388h = fVar;
        this.f389i = new nb.i(this, Collections.EMPTY_LIST, list, nVar);
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 12:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final void B0(gb.o oVar, Set set, m mVar) {
        this.f390j = oVar;
        this.k = set;
        this.f391l = mVar;
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
        return this.f391l;
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
        v0(17);
        throw null;
    }

    @Override // x9.e
    public final x9.f f() {
        x9.f fVar = this.f388h;
        if (fVar != null) {
            return fVar;
        }
        v0(15);
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
        x9.x xVar = this.f387g;
        if (xVar != null) {
            return xVar;
        }
        v0(16);
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
        gb.o oVar = this.f390j;
        if (oVar != null) {
            return oVar;
        }
        v0(13);
        throw null;
    }

    @Override // x9.e, x9.i
    public final List q() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(18);
        throw null;
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.i iVar = this.f389i;
        if (iVar != null) {
            return iVar;
        }
        v0(10);
        throw null;
    }

    public String toString() {
        return "class " + getName();
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
        Set set = this.k;
        if (set != null) {
            return set;
        }
        v0(11);
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
