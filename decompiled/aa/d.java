package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mb.n nVar, x9.k kVar, y9.h hVar, wa.e eVar, nb.x0 x0Var, boolean z10, int i7, x9.o0 o0Var) {
        super(nVar, kVar, hVar, eVar, x0Var, z10, i7, o0Var);
        if (nVar == null) {
            D(0);
            throw null;
        }
        if (kVar == null) {
            D(1);
            throw null;
        }
        if (o0Var != null) {
        } else {
            D(6);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i7) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // aa.q
    public final String toString() {
        String str = "";
        String str2 = this.f371f ? "reified " : "";
        if (I() != nb.x0.INVARIANT) {
            str = I() + " ";
        }
        return str2 + str + getName();
    }
}
