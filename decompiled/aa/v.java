package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends gb.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.e f438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.e f439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f441e;

    public v(w wVar, mb.n nVar) {
        if (nVar == null) {
            h(0);
            throw null;
        }
        this.f441e = wVar;
        mb.k kVar = (mb.k) nVar;
        this.f438b = kVar.b(new t(this, 0));
        this.f439c = kVar.b(new t(this, 1));
        this.f440d = new mb.i(kVar, new e(2, this));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i7) {
        String str;
        int i10;
        if (i7 != 3 && i7 != 7 && i7 != 9 && i7 != 12) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 3 && i7 != 7 && i7 != 9 && i7 != 12) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i7 == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i7 == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i7 != 12) {
            switch (i7) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i7) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 7 && i7 != 9 && i7 != 12) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        if (eVar != null) {
            return (Collection) this.f439c.invoke(eVar);
        }
        h(1);
        throw null;
    }

    @Override // gb.p, gb.o
    public final Set c() {
        Set set = (Set) this.f441e.f444i.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // gb.p, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f440d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // gb.p, gb.o
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // gb.p, gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        if (eVar != null) {
            return (Collection) this.f438b.invoke(eVar);
        }
        h(5);
        throw null;
    }

    @Override // gb.p, gb.o
    public final Set g() {
        Set set = (Set) this.f441e.f444i.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final gb.o i() {
        gb.o oVarU = ((nb.w) ((nb.f) this.f441e.t()).m().iterator().next()).U();
        if (oVarU != null) {
            return oVarU;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(wa.e eVar, Collection collection) {
        if (eVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        za.j.f15799c.h(eVar, collection, Collections.EMPTY_SET, this.f441e, new u(linkedHashSet, 0));
        return linkedHashSet;
    }
}
