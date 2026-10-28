package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends h0.a0 implements x9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.e f424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y9.h hVar, wa.e eVar) {
        super(hVar);
        if (hVar == null) {
            D(0);
            throw null;
        }
        if (eVar == null) {
            D(1);
            throw null;
        }
        this.f424b = eVar;
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5 || i7 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4) {
                objArr[2] = "toString";
            } else if (i7 != 5 && i7 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String w0(x9.k kVar) {
        try {
            String str = ya.g.f15195e.u(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
            if (str != null) {
                return str;
            }
            D(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
            if (str2 != null) {
                return str2;
            }
            D(6);
            throw null;
        }
    }

    public x9.k a() {
        return this;
    }

    @Override // x9.k
    public final wa.e getName() {
        wa.e eVar = this.f424b;
        if (eVar != null) {
            return eVar;
        }
        D(2);
        throw null;
    }

    public String toString() {
        return w0(this);
    }
}
