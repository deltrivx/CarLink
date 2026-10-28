package nb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.e0 f8999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f9001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(aa.e0 e0Var, List list, Collection collection, mb.n nVar) {
        super(nVar);
        if (list == null) {
            h(1);
            throw null;
        }
        if (collection == null) {
            h(2);
            throw null;
        }
        if (nVar == null) {
            h(3);
            throw null;
        }
        this.f8999c = e0Var;
        this.f9000d = Collections.unmodifiableList(new ArrayList(list));
        this.f9001e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void h(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getParameters";
        } else if (i7 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i7 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // nb.f
    public final Collection b() {
        Collection collection = this.f9001e;
        if (collection != null) {
            return collection;
        }
        h(6);
        throw null;
    }

    @Override // nb.f
    public final x9.o0 d() {
        return x9.o0.f14732c;
    }

    @Override // nb.b
    /* JADX INFO: renamed from: i */
    public final x9.e l() {
        aa.e0 e0Var = this.f8999c;
        if (e0Var != null) {
            return e0Var;
        }
        h(5);
        throw null;
    }

    @Override // nb.k0
    public final List n() {
        List list = this.f9000d;
        if (list != null) {
            return list;
        }
        h(4);
        throw null;
    }

    @Override // nb.k0
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return za.d.g(this.f8999c).f14243a;
    }
}
