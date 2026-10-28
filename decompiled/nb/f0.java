package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8989a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8991c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(w wVar) {
        this(wVar, x0.INVARIANT);
        if (wVar != null) {
        } else {
            e(2);
            throw null;
        }
    }

    public f0(w wVar, x0 x0Var) {
        if (x0Var == null) {
            e(0);
            throw null;
        }
        if (wVar == null) {
            e(1);
            throw null;
        }
        this.f8990b = x0Var;
        this.f8991c = wVar;
    }

    public f0(x9.r0 r0Var) {
        i9.l.e(r0Var, "typeParameter");
        this.f8990b = r0Var;
        this.f8991c = t8.a.c(t8.i.f12827a, new aa.e(20, this));
    }

    public static /* synthetic */ void e(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i7 == 3) {
            objArr[2] = "replaceType";
        } else if (i7 != 4 && i7 != 5) {
            if (i7 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // nb.n0
    public final x0 a() {
        switch (this.f8989a) {
            case 0:
                return x0.OUT_VARIANCE;
            default:
                x0 x0Var = (x0) this.f8990b;
                if (x0Var != null) {
                    return x0Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t8.h] */
    @Override // nb.n0
    public final w b() {
        switch (this.f8989a) {
            case 0:
                return (w) this.f8991c.getValue();
            default:
                w wVar = (w) this.f8991c;
                if (wVar != null) {
                    return wVar;
                }
                e(5);
                throw null;
        }
    }

    @Override // nb.n0
    public final boolean c() {
        switch (this.f8989a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // nb.n0
    public final n0 d(ob.g gVar) {
        switch (this.f8989a) {
            case 0:
                i9.l.e(gVar, "kotlinTypeRefiner");
                return this;
            default:
                if (gVar == null) {
                    e(6);
                    throw null;
                }
                x0 x0Var = (x0) this.f8990b;
                w wVar = (w) this.f8991c;
                gVar.getClass();
                i9.l.e(wVar, "type");
                return new f0(wVar, x0Var);
        }
    }
}
