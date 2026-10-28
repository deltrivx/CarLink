package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends z0 implements x9.k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mb.h f405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h9.a f406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x9.x f407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ga.o f408j;
    public Collection k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x9.k0 f409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a0 f418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x f423z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x9.k kVar, x9.k0 k0Var, y9.h hVar, x9.x xVar, ga.o oVar, boolean z10, wa.e eVar, int i7, x9.n0 n0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(kVar, hVar, eVar, null, n0Var);
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
        if (i7 == 0) {
            D(5);
            throw null;
        }
        if (n0Var == null) {
            D(6);
            throw null;
        }
        this.f404f = z10;
        this.k = null;
        this.f416s = Collections.EMPTY_LIST;
        this.f407i = xVar;
        this.f408j = oVar;
        this.f409l = k0Var == null ? this : k0Var;
        this.f410m = i7;
        this.f411n = z11;
        this.f412o = z12;
        this.f413p = z13;
        this.f414q = z14;
        this.f415r = z15;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "originalSubstitutor";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[0] = "newModality";
                break;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[0] = "newVisibility";
                break;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                objArr[0] = "newName";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i7 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i7 == 38) {
            objArr[1] = "getOriginal";
        } else if (i7 == 39) {
            objArr[1] = "getKind";
        } else if (i7 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 != 42) {
            switch (i7) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[2] = "substitute";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static p0 D0(x9.k kVar, x9.x xVar, ga.o oVar, boolean z10, wa.e eVar, int i7, x9.n0 n0Var) {
        if (kVar == null) {
            D(7);
            throw null;
        }
        if (oVar == null) {
            D(10);
            throw null;
        }
        if (eVar == null) {
            D(11);
            throw null;
        }
        if (i7 == 0) {
            D(12);
            throw null;
        }
        if (n0Var != null) {
            return new p0(kVar, null, y9.g.f15129a, xVar, oVar, z10, eVar, i7, n0Var, false, false, false, false, false);
        }
        D(13);
        throw null;
    }

    public static x9.t F0(nb.r0 r0Var, x9.j0 j0Var) {
        if (j0Var == null) {
            D(31);
            throw null;
        }
        x9.t tVar = ((n0) j0Var).f386l;
        if (tVar != null) {
            return tVar.e(r0Var);
        }
        return null;
    }

    @Override // x9.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final p0 W(x9.k kVar, x9.x xVar, ga.o oVar) {
        o0 o0Var = new o0(this);
        if (kVar == null) {
            o0.a(0);
            throw null;
        }
        o0Var.f392a = kVar;
        o0Var.f395d = null;
        o0Var.f393b = xVar;
        if (oVar == null) {
            o0.a(8);
            throw null;
        }
        o0Var.f394c = oVar;
        o0Var.f396e = 2;
        o0Var.f398g = false;
        p0 p0VarB = o0Var.b();
        if (p0VarB != null) {
            return p0VarB;
        }
        D(42);
        throw null;
    }

    public p0 E0(x9.k kVar, x9.x xVar, ga.o oVar, x9.k0 k0Var, int i7, wa.e eVar) {
        if (kVar == null) {
            D(32);
            throw null;
        }
        if (xVar == null) {
            D(33);
            throw null;
        }
        if (oVar == null) {
            D(34);
            throw null;
        }
        if (i7 == 0) {
            D(35);
            throw null;
        }
        if (eVar == null) {
            D(36);
            throw null;
        }
        return new p0(kVar, k0Var, getAnnotations(), xVar, oVar, this.f404f, eVar, i7, x9.n0.f14716e0, this.f411n, v(), this.f413p, s(), this.f415r);
    }

    @Override // x9.w
    public final boolean G() {
        return this.f413p;
    }

    public final void G0(q0 q0Var, r0 r0Var, x xVar, x xVar2) {
        this.f420w = q0Var;
        this.f421x = r0Var;
        this.f422y = xVar;
        this.f423z = xVar2;
    }

    public final void H0(mb.h hVar, h9.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f406h = aVar;
        if (hVar == null) {
            hVar = (mb.h) aVar.invoke();
        }
        this.f405g = hVar;
    }

    public void I0(nb.w wVar) {
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.M(this, obj);
    }

    public final void J0(nb.w wVar, List list, a0 a0Var, a0 a0Var2, List list2) {
        if (wVar == null) {
            D(17);
            throw null;
        }
        if (list == null) {
            D(18);
            throw null;
        }
        if (list2 == null) {
            D(19);
            throw null;
        }
        this.f497e = wVar;
        this.f419v = new ArrayList(list);
        this.f418u = a0Var2;
        this.f417t = a0Var;
        this.f416s = list2;
    }

    @Override // x9.b
    public Object K(x9.a aVar) {
        return null;
    }

    @Override // x9.k0
    public final boolean M() {
        return this.f415r;
    }

    @Override // x9.u0
    public final bb.g T() {
        mb.h hVar = this.f405g;
        if (hVar != null) {
            return (bb.g) hVar.invoke();
        }
        return null;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.k0 a() {
        x9.k0 k0Var = this.f409l;
        x9.k0 k0VarA = k0Var == this ? this : k0Var.a();
        if (k0VarA != null) {
            return k0VarA;
        }
        D(38);
        throw null;
    }

    @Override // x9.k0
    public final q0 b() {
        return this.f420w;
    }

    @Override // aa.z0, x9.b
    public final a0 b0() {
        return this.f417t;
    }

    @Override // x9.k0
    public final r0 c() {
        return this.f421x;
    }

    @Override // x9.n
    public final ga.o d() {
        ga.o oVar = this.f408j;
        if (oVar != null) {
            return oVar;
        }
        D(25);
        throw null;
    }

    @Override // x9.u0
    public final boolean d0() {
        return this.f404f;
    }

    @Override // x9.p0
    public final x9.k0 e(nb.r0 r0Var) {
        if (r0Var == null) {
            D(27);
            throw null;
        }
        if (r0Var.f9029a.e()) {
            return this;
        }
        o0 o0Var = new o0(this);
        nb.p0 p0VarF = r0Var.f();
        if (p0VarF == null) {
            o0.a(15);
            throw null;
        }
        o0Var.f397f = p0VarF;
        o0Var.f395d = a();
        return o0Var.b();
    }

    @Override // aa.z0, x9.b
    public final a0 e0() {
        return this.f418u;
    }

    @Override // x9.c
    public final int f() {
        int i7 = this.f410m;
        if (i7 != 0) {
            return i7;
        }
        D(39);
        throw null;
    }

    @Override // x9.k0
    public final x f0() {
        return this.f423z;
    }

    @Override // aa.z0, x9.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f419v;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // x9.k0
    public final x h0() {
        return this.f422y;
    }

    @Override // x9.w
    public final x9.x i() {
        x9.x xVar = this.f407i;
        if (xVar != null) {
            return xVar;
        }
        D(24);
        throw null;
    }

    @Override // x9.b
    public final List i0() {
        List list = this.f416s;
        if (list != null) {
            return list;
        }
        D(22);
        throw null;
    }

    @Override // x9.u0
    public final boolean j0() {
        return this.f411n;
    }

    @Override // x9.b
    public final Collection m() {
        Collection collection = this.k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D(41);
        throw null;
    }

    @Override // x9.c
    public final void m0(Collection collection) {
        if (collection != null) {
            this.k = collection;
        } else {
            D(40);
            throw null;
        }
    }

    @Override // aa.z0, x9.b
    public final nb.w p() {
        nb.w type = getType();
        if (type != null) {
            return type;
        }
        D(23);
        throw null;
    }

    @Override // x9.k0
    public final ArrayList r() {
        ArrayList arrayList = new ArrayList(2);
        q0 q0Var = this.f420w;
        if (q0Var != null) {
            arrayList.add(q0Var);
        }
        r0 r0Var = this.f421x;
        if (r0Var != null) {
            arrayList.add(r0Var);
        }
        return arrayList;
    }

    @Override // x9.w
    public boolean s() {
        return this.f414q;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.u0
    public boolean v() {
        return this.f412o;
    }
}
