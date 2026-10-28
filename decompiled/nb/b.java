package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mb.n nVar) {
        super(nVar);
        if (nVar != null) {
        } else {
            h(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void h(int i7) {
        String str = (i7 == 1 || i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i7 == 2) {
            objArr[0] = "classifier";
        } else if (i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i7 == 3 || i7 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i7 != 1) {
            if (i7 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i7 != 3 && i7 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // nb.f
    public final w c() {
        x9.e eVarL = l();
        if (eVarL == null) {
            u9.i.a(107);
            throw null;
        }
        wa.e eVar = u9.i.f13141e;
        if (u9.i.b(eVarL, u9.n.f13166a) || u9.i.b(eVarL, u9.n.f13167b)) {
            return null;
        }
        return k().e();
    }

    @Override // nb.f
    public final boolean f(x9.h hVar) {
        boolean z10;
        if (hVar instanceof x9.e) {
            x9.e eVarL = l();
            i9.l.e(eVarL, "first");
            if (!i9.l.a(eVarL.getName(), hVar.getName())) {
                z10 = false;
                break;
            }
            x9.k kVarL = eVarL.l();
            x9.k kVarL2 = hVar.l();
            while (true) {
                if (kVarL != null && kVarL2 != null) {
                    if (!(kVarL instanceof x9.y)) {
                        if (!(kVarL2 instanceof x9.y)) {
                            if (kVarL instanceof x9.d0) {
                                if (!(kVarL2 instanceof x9.d0) || !i9.l.a(((aa.j0) ((x9.d0) kVarL)).f364e, ((aa.j0) ((x9.d0) kVarL2)).f364e)) {
                                    break;
                                }
                            } else if (!(kVarL2 instanceof x9.d0) && i9.l.a(kVarL.getName(), kVarL2.getName())) {
                                kVarL = kVarL.l();
                                kVarL2 = kVarL2.l();
                            }
                        }
                        z10 = false;
                        break;
                    }
                    z10 = kVarL2 instanceof x9.y;
                    break;
                }
                z10 = true;
                break;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // nb.k0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract x9.e l();

    @Override // nb.k0
    public final u9.i k() {
        u9.i iVarE = db.e.e(l());
        if (iVarE != null) {
            return iVarE;
        }
        h(1);
        throw null;
    }
}
