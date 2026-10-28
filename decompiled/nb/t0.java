package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9038b;

    public t0(String str) {
        this.f9038b = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static /* synthetic */ void P0(int i7) {
        String str = (i7 == 1 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i7 == 2) {
            objArr[0] = "delegate";
        } else if (i7 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i7 == 1) {
            objArr[1] = "toString";
        } else if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i7 != 1) {
            if (i7 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i7 == 3) {
                objArr[2] = "refine";
            } else if (i7 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // nb.m, nb.w
    /* JADX INFO: renamed from: F0 */
    public final w I0(ob.g gVar) {
        if (gVar != null) {
            return this;
        }
        P0(3);
        throw null;
    }

    @Override // nb.a0, nb.w0
    public final /* bridge */ /* synthetic */ w0 H0(boolean z10) {
        H0(z10);
        throw null;
    }

    @Override // nb.m, nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        if (gVar != null) {
            return this;
        }
        P0(3);
        throw null;
    }

    @Override // nb.a0, nb.w0
    public final /* bridge */ /* synthetic */ w0 J0(h0 h0Var) {
        J0(h0Var);
        throw null;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        throw new IllegalStateException(this.f9038b);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        if (h0Var != null) {
            throw new IllegalStateException(this.f9038b);
        }
        P0(0);
        throw null;
    }

    @Override // nb.m
    public final a0 M0() {
        throw new IllegalStateException(this.f9038b);
    }

    @Override // nb.m
    /* JADX INFO: renamed from: N0 */
    public final a0 F0(ob.g gVar) {
        if (gVar != null) {
            return this;
        }
        P0(3);
        throw null;
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        throw new IllegalStateException(this.f9038b);
    }

    @Override // nb.a0
    public final String toString() {
        String str = this.f9038b;
        if (str != null) {
            return str;
        }
        P0(1);
        throw null;
    }
}
