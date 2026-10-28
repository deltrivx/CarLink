package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends n0 implements x9.j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y0 f429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f430n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x9.k0 k0Var, y9.h hVar, x9.x xVar, ga.o oVar, boolean z10, boolean z11, boolean z12, int i7, r0 r0Var, x9.n0 n0Var) {
        super(xVar, oVar, k0Var, hVar, wa.e.g("<set-" + k0Var.getName() + ">"), z10, z11, z12, i7, n0Var);
        if (hVar == null) {
            D(1);
            throw null;
        }
        if (xVar == null) {
            D(2);
            throw null;
        }
        if (oVar == null) {
            D(3);
            throw null;
        }
        if (i7 == 0) {
            D(4);
            throw null;
        }
        if (n0Var == null) {
            D(5);
            throw null;
        }
        this.f430n = r0Var != null ? r0Var : this;
    }

    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i7) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i7) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static y0 E0(r0 r0Var, nb.w wVar, y9.h hVar) {
        if (wVar == null) {
            D(8);
            throw null;
        }
        if (hVar != null) {
            return new y0(r0Var, null, 0, hVar, wa.g.f14257g, wVar, false, false, false, null, x9.n0.f14716e0);
        }
        D(9);
        throw null;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final r0 a() {
        r0 r0Var = this.f430n;
        if (r0Var != null) {
            return r0Var;
        }
        D(13);
        throw null;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.G(this, obj);
    }

    @Override // x9.b
    public final List X() {
        y0 y0Var = this.f429m;
        if (y0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(y0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        D(11);
        throw null;
    }

    @Override // x9.c, x9.b
    public final Collection m() {
        return D0(false);
    }

    @Override // x9.b
    public final nb.w p() {
        return db.e.e(this).x();
    }
}
