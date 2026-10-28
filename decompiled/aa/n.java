package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x9.k f378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x9.n0 f379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(mb.n nVar, x9.k kVar, wa.e eVar, x9.n0 n0Var) {
        super(nVar, eVar);
        if (nVar == null) {
            v0(0);
            throw null;
        }
        if (kVar == null) {
            v0(1);
            throw null;
        }
        if (eVar == null) {
            v0(2);
            throw null;
        }
        this.f378e = kVar;
        this.f379f = n0Var;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i7 == 2) {
            objArr[0] = "name";
        } else if (i7 == 3) {
            objArr[0] = "source";
        } else if (i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x9.l
    public final x9.n0 getSource() {
        x9.n0 n0Var = this.f379f;
        if (n0Var != null) {
            return n0Var;
        }
        v0(5);
        throw null;
    }

    @Override // x9.k
    public final x9.k l() {
        x9.k kVar = this.f378e;
        if (kVar != null) {
            return kVar;
        }
        v0(4);
        throw null;
    }

    @Override // x9.w
    public boolean s() {
        return false;
    }
}
