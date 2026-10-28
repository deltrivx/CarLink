package ia;

import aa.p0;
import aa.q0;
import aa.r0;
import aa.y0;
import ga.o;
import ga.y;
import i9.l;
import java.util.ArrayList;
import nb.u0;
import nb.w;
import oa.v;
import t8.j;
import u9.i;
import u9.s;
import x9.k;
import x9.k0;
import x9.n0;
import x9.x;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class f extends p0 implements a {
    public final boolean A;
    public final j B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, h hVar, x xVar, o oVar, boolean z10, wa.e eVar, n0 n0Var, k0 k0Var, int i7, boolean z11, j jVar) {
        super(kVar, k0Var, hVar, xVar, oVar, z10, eVar, i7, n0Var, false, false, false, false, false);
        if (kVar == null) {
            D(0);
            throw null;
        }
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
        if (eVar == null) {
            D(4);
            throw null;
        }
        if (n0Var == null) {
            D(5);
            throw null;
        }
        if (i7 == 0) {
            D(6);
            throw null;
        }
        this.A = z11;
        this.B = jVar;
    }

    public static /* synthetic */ void D(int i7) {
        String str = i7 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 21 ? 3 : 2];
        switch (i7) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f K0(k kVar, ja.c cVar, o oVar, boolean z10, wa.e eVar, ca.g gVar, boolean z11) {
        if (kVar == null) {
            D(7);
            throw null;
        }
        if (eVar != null) {
            return new f(kVar, cVar, x.f14747b, oVar, z10, eVar, gVar, null, 1, z11, null);
        }
        D(11);
        throw null;
    }

    @Override // aa.z0, x9.b
    public final boolean C() {
        return false;
    }

    @Override // aa.p0
    public final p0 E0(k kVar, x xVar, o oVar, k0 k0Var, int i7, wa.e eVar) {
        if (kVar == null) {
            D(13);
            throw null;
        }
        if (xVar == null) {
            D(14);
            throw null;
        }
        if (oVar == null) {
            D(15);
            throw null;
        }
        if (i7 == 0) {
            D(16);
            throw null;
        }
        if (eVar == null) {
            D(17);
            throw null;
        }
        return new f(kVar, getAnnotations(), xVar, oVar, this.f404f, eVar, n0.f14716e0, k0Var, i7, this.A, this.B);
    }

    @Override // aa.p0
    public final void I0(w wVar) {
    }

    @Override // aa.p0, x9.b
    public final Object K(x9.a aVar) {
        j jVar = this.B;
        if (jVar == null || !((x9.a) jVar.f12830a).equals(aVar)) {
            return null;
        }
        return jVar.f12831b;
    }

    @Override // ia.a
    public final a L(w wVar, ArrayList arrayList, w wVar2, j jVar) {
        w wVar3;
        q0 q0Var;
        r0 r0Var;
        k0 k0VarA = a() == this ? null : a();
        f fVar = new f(l(), getAnnotations(), i(), d(), this.f404f, getName(), getSource(), k0VarA, f(), this.A, jVar);
        q0 q0Var2 = this.f420w;
        if (q0Var2 != null) {
            q0 q0Var3 = new q0(fVar, q0Var2.getAnnotations(), q0Var2.i(), q0Var2.d(), q0Var2.f380e, q0Var2.f381f, q0Var2.f384i, f(), k0VarA == null ? null : k0VarA.b(), q0Var2.getSource());
            q0Var3.f386l = q0Var2.f386l;
            wVar3 = wVar2;
            q0Var3.f425m = wVar3;
            q0Var = q0Var3;
        } else {
            wVar3 = wVar2;
            q0Var = null;
        }
        r0 r0Var2 = this.f421x;
        if (r0Var2 != null) {
            r0 r0Var3 = r0Var2;
            r0Var = new r0(fVar, r0Var2.getAnnotations(), r0Var3.i(), r0Var3.d(), r0Var3.f380e, r0Var3.f381f, r0Var3.f384i, f(), k0VarA == null ? null : k0VarA.c(), r0Var2.getSource());
            r0Var.f386l = r0Var.f386l;
            y0 y0Var = (y0) r0Var2.X().get(0);
            if (y0Var == null) {
                r0.D(6);
                throw null;
            }
            r0Var.f429m = y0Var;
        } else {
            r0Var = null;
        }
        fVar.G0(q0Var, r0Var, this.f422y, this.f423z);
        h9.a aVar = this.f406h;
        if (aVar != null) {
            fVar.H0(this.f405g, aVar);
        }
        fVar.m0(m());
        fVar.J0(wVar3, getTypeParameters(), this.f417t, wVar != null ? za.k.k(this, wVar, y9.g.f15129a) : null, u8.w.f13122a);
        return fVar;
    }

    @Override // aa.p0, x9.u0
    public final boolean v() {
        w type = getType();
        if (!this.A) {
            return false;
        }
        l.e(type, "type");
        if (((!i.G(type) && !s.a(type)) || u0.e(type)) && !i.H(type)) {
            return false;
        }
        y9.i iVar = v.f9633a;
        wa.c cVar = y.f6140p;
        l.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return !ob.h.u(type, cVar) || i.H(type);
    }
}
