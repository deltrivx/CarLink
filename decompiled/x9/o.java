package x9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ga.o f14717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ga.o f14718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ga.o f14719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ga.o f14720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ga.o f14721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ga.o f14722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ga.o f14723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ga.o f14724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ga.o f14725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ga.o f14726j;
    public static final o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o0 f14727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o0 f14728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final tb.o f14729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f14730o;

    static {
        z0 z0Var = z0.f14756d;
        ga.o oVar = new ga.o(z0Var, 3);
        f14717a = oVar;
        a1 a1Var = a1.f14686d;
        ga.o oVar2 = new ga.o(a1Var, 4);
        f14718b = oVar2;
        b1 b1Var = b1.f14689d;
        ga.o oVar3 = new ga.o(b1Var, 5);
        f14719c = oVar3;
        w0 w0Var = w0.f14745d;
        ga.o oVar4 = new ga.o(w0Var, 6);
        f14720d = oVar4;
        c1 c1Var = c1.f14693d;
        ga.o oVar5 = new ga.o(c1Var, 7);
        f14721e = oVar5;
        y0 y0Var = y0.f14753d;
        ga.o oVar6 = new ga.o(y0Var, 8);
        f14722f = oVar6;
        v0 v0Var = v0.f14744d;
        ga.o oVar7 = new ga.o(v0Var, 9);
        f14723g = oVar7;
        x0 x0Var = x0.f14752d;
        ga.o oVar8 = new ga.o(x0Var, 10);
        f14724h = oVar8;
        d1 d1Var = d1.f14697d;
        ga.o oVar9 = new ga.o(d1Var, 11);
        f14725i = oVar9;
        Collections.unmodifiableSet(u8.l.M0(new ga.o[]{oVar, oVar2, oVar4, oVar6}));
        HashMap map = new HashMap(6);
        map.put(oVar2, 0);
        map.put(oVar, 0);
        map.put(oVar4, 1);
        map.put(oVar3, 1);
        map.put(oVar5, 2);
        Collections.unmodifiableMap(map);
        f14726j = oVar5;
        k = new o0(2);
        f14727l = new o0(3);
        f14728m = new o0(4);
        try {
            Iterator it = Arrays.asList(new tb.o[0]).iterator();
            f14729n = it.hasNext() ? (tb.o) it.next() : tb.o.f12921a;
            HashMap map2 = new HashMap();
            f14730o = map2;
            map2.put(z0Var, oVar);
            map2.put(a1Var, oVar2);
            map2.put(b1Var, oVar3);
            map2.put(w0Var, oVar4);
            map2.put(c1Var, oVar5);
            map2.put(y0Var, oVar6);
            map2.put(v0Var, oVar7);
            map2.put(x0Var, oVar8);
            map2.put(d1Var, oVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i7) {
        String str = i7 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 16 ? 3 : 2];
        if (i7 != 1 && i7 != 3 && i7 != 5 && i7 != 7) {
            switch (i7) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i7 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i7) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(ga.o oVar, ga.o oVar2) {
        if (oVar == null) {
            a(12);
            throw null;
        }
        n.a aVar = oVar.f6101a;
        if (oVar2 == null) {
            a(13);
            throw null;
        }
        n.a aVar2 = oVar2.f6101a;
        Integer numA = aVar.a(aVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = aVar2.a(aVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static n c(hb.d dVar, n nVar, k kVar) {
        n nVarC;
        if (nVar == null) {
            a(8);
            throw null;
        }
        if (kVar == null) {
            a(9);
            throw null;
        }
        for (n nVar2 = (n) nVar.a(); nVar2 != null && nVar2.d() != f14722f; nVar2 = (n) za.d.i(nVar2, n.class, true)) {
            if (!nVar2.d().a(dVar, nVar2, kVar)) {
                return nVar2;
            }
        }
        if (!(nVar instanceof aa.u0) || (nVarC = c(dVar, ((aa.v0) ((aa.u0) nVar)).F, kVar)) == null) {
            return null;
        }
        return nVarC;
    }

    public static boolean d(n nVar, k kVar) {
        if (kVar == null) {
            a(7);
            throw null;
        }
        o0 o0VarF = za.d.f(kVar);
        if (o0VarF != o0.f14731b) {
            return o0VarF.equals(za.d.f(nVar));
        }
        return false;
    }

    public static boolean e(ga.o oVar) {
        if (oVar != null) {
            return oVar == f14717a || oVar == f14718b;
        }
        a(14);
        throw null;
    }

    public static ga.o f(n.a aVar) {
        if (aVar == null) {
            a(15);
            throw null;
        }
        ga.o oVar = (ga.o) f14730o.get(aVar);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + aVar);
    }
}
