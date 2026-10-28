package ga;

import aa.j0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f6104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f6105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f6106d;

    static {
        ba.a aVar = ba.a.f1676d;
        o oVar = new o(aVar, 0);
        f6103a = oVar;
        ba.c cVar = ba.c.f1678d;
        o oVar2 = new o(cVar, 1);
        f6104b = oVar2;
        ba.b bVar = ba.b.f1677d;
        o oVar3 = new o(bVar, 2);
        f6105c = oVar3;
        HashMap map = new HashMap();
        f6106d = map;
        map.put(aVar, oVar);
        map.put(cVar, oVar2);
        map.put(bVar, oVar3);
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i7 == 5 || i7 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i7 == 2 || i7 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i7 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i7 != 5 && i7 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(hb.d dVar, x9.n nVar, x9.k kVar) {
        x9.n nVarT;
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (nVar instanceof x9.c) {
            nVarT = za.d.t((x9.c) nVar);
        } else {
            int i7 = za.d.f15791a;
            nVarT = nVar;
        }
        if (c(nVarT, kVar)) {
            return true;
        }
        return x9.o.f14719c.a(dVar, nVar, kVar);
    }

    public static boolean c(x9.n nVar, x9.k kVar) {
        if (nVar == null) {
            a(2);
            throw null;
        }
        if (kVar == null) {
            a(3);
            throw null;
        }
        x9.d0 d0Var = (x9.d0) za.d.i(nVar, x9.d0.class, false);
        x9.d0 d0Var2 = (x9.d0) za.d.i(kVar, x9.d0.class, false);
        return (d0Var2 == null || d0Var == null || !((j0) d0Var).f364e.equals(((j0) d0Var2).f364e)) ? false : true;
    }
}
