package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends q implements x9.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.k f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.n0 f428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x9.k kVar, y9.h hVar, wa.e eVar, x9.n0 n0Var) {
        super(hVar, eVar);
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
        if (n0Var == null) {
            D(3);
            throw null;
        }
        this.f427c = kVar;
        this.f428d = n0Var;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: B0 */
    public x9.l a() {
        return this;
    }

    public x9.n0 getSource() {
        x9.n0 n0Var = this.f428d;
        if (n0Var != null) {
            return n0Var;
        }
        D(6);
        throw null;
    }

    public x9.k l() {
        x9.k kVar = this.f427c;
        if (kVar != null) {
            return kVar;
        }
        D(5);
        throw null;
    }
}
