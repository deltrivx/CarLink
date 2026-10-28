package aa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends r implements x9.r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.x0 f370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.i f373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.i f374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.k f375j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mb.n nVar, x9.k kVar, y9.h hVar, wa.e eVar, nb.x0 x0Var, boolean z10, int i7, x9.o0 o0Var) {
        super(kVar, hVar, eVar, x9.n0.f14716e0);
        if (nVar == null) {
            D(0);
            throw null;
        }
        if (kVar == null) {
            D(1);
            throw null;
        }
        if (hVar == null) {
            D(2);
            throw null;
        }
        if (eVar == null) {
            D(3);
            throw null;
        }
        if (x0Var == null) {
            D(4);
            throw null;
        }
        if (o0Var == null) {
            D(6);
            throw null;
        }
        this.f370e = x0Var;
        this.f371f = z10;
        this.f372g = i7;
        i iVar = new i(this, nVar, o0Var);
        mb.k kVar2 = (mb.k) nVar;
        this.f373h = new mb.i(kVar2, iVar);
        this.f374i = new mb.i(kVar2, new j(this, eVar, 0));
        this.f375j = kVar2;
    }

    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i7) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x9.r0
    public final boolean B() {
        return this.f371f;
    }

    @Override // aa.r
    /* JADX INFO: renamed from: B0 */
    public final x9.l a() {
        return this;
    }

    public List C0(List list) {
        return list;
    }

    public abstract List D0();

    @Override // x9.r0
    public final nb.x0 I() {
        nb.x0 x0Var = this.f370e;
        if (x0Var != null) {
            return x0Var;
        }
        D(7);
        throw null;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.w(this, obj);
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.h a() {
        return this;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.k a() {
        return this;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.r0 a() {
        return this;
    }

    @Override // x9.r0
    public final mb.n c0() {
        mb.k kVar = this.f375j;
        if (kVar != null) {
            return kVar;
        }
        D(14);
        throw null;
    }

    @Override // x9.r0
    public final boolean g0() {
        return false;
    }

    @Override // x9.r0
    public final int getIndex() {
        return this.f372g;
    }

    @Override // x9.r0
    public final List getUpperBounds() {
        List listM = ((k) t()).m();
        if (listM != null) {
            return listM;
        }
        D(8);
        throw null;
    }

    @Override // x9.h
    public final nb.a0 n() {
        nb.a0 a0Var = (nb.a0) this.f374i.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        D(10);
        throw null;
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.k0 k0Var = (nb.k0) this.f373h.invoke();
        if (k0Var != null) {
            return k0Var;
        }
        D(9);
        throw null;
    }
}
