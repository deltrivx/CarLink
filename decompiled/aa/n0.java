package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends r implements x9.j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x9.x f382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x9.k0 f383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f385j;
    public ga.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x9.t f386l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x9.x xVar, ga.o oVar, x9.k0 k0Var, y9.h hVar, wa.e eVar, boolean z10, boolean z11, boolean z12, int i7, x9.n0 n0Var) {
        super(k0Var.l(), hVar, eVar, n0Var);
        if (xVar == null) {
            D(0);
            throw null;
        }
        if (oVar == null) {
            D(1);
            throw null;
        }
        if (hVar == null) {
            D(3);
            throw null;
        }
        if (n0Var == null) {
            D(5);
            throw null;
        }
        this.f386l = null;
        this.f382g = xVar;
        this.k = oVar;
        this.f383h = k0Var;
        this.f380e = z10;
        this.f381f = z11;
        this.f384i = z12;
        this.f385j = i7;
    }

    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = 2;
                break;
            case 7:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i7) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x9.b
    public final boolean C() {
        return false;
    }

    public final x9.k0 C0() {
        x9.k0 k0Var = this.f383h;
        if (k0Var != null) {
            return k0Var;
        }
        D(13);
        throw null;
    }

    public final ArrayList D0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (x9.k0 k0Var : C0().m()) {
            hb.d dVarB = z10 ? k0Var.b() : k0Var.c();
            if (dVarB != null) {
                arrayList.add(dVarB);
            }
        }
        return arrayList;
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.b
    public final Object K(x9.a aVar) {
        return null;
    }

    @Override // x9.t
    public final boolean N() {
        return false;
    }

    @Override // x9.t
    public final boolean O() {
        return false;
    }

    @Override // x9.c
    public final x9.c W(x9.e eVar, x9.x xVar, ga.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // x9.t
    public final x9.t a0() {
        return this.f386l;
    }

    @Override // x9.b
    public final a0 b0() {
        return C0().b0();
    }

    @Override // x9.n
    public final ga.o d() {
        ga.o oVar = this.k;
        if (oVar != null) {
            return oVar;
        }
        D(11);
        throw null;
    }

    @Override // x9.p0
    public final /* bridge */ /* synthetic */ x9.l e(nb.r0 r0Var) {
        e(r0Var);
        return this;
    }

    @Override // x9.t, x9.p0
    public final x9.t e(nb.r0 r0Var) {
        if (r0Var != null) {
            return this;
        }
        D(7);
        throw null;
    }

    @Override // x9.b
    public final a0 e0() {
        return C0().e0();
    }

    @Override // x9.c
    public final int f() {
        int i7 = this.f385j;
        if (i7 != 0) {
            return i7;
        }
        D(6);
        throw null;
    }

    @Override // x9.t
    public final boolean g() {
        return this.f384i;
    }

    @Override // x9.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(9);
        throw null;
    }

    @Override // x9.w
    public final x9.x i() {
        x9.x xVar = this.f382g;
        if (xVar != null) {
            return xVar;
        }
        D(10);
        throw null;
    }

    @Override // x9.b
    public final List i0() {
        List listI0 = C0().i0();
        if (listI0 != null) {
            return listI0;
        }
        D(14);
        throw null;
    }

    @Override // x9.t
    public final boolean l0() {
        return false;
    }

    @Override // x9.c
    public final void m0(Collection collection) {
        if (collection != null) {
            return;
        }
        D(16);
        throw null;
    }

    @Override // x9.t
    public final boolean o() {
        return false;
    }

    @Override // x9.t
    public final boolean q0() {
        return false;
    }

    @Override // x9.w
    public final boolean s() {
        return this.f381f;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.t
    public final boolean y0() {
        return false;
    }
}
