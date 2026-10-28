package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends r implements x9.t {
    public final int A;
    public x9.t B;
    public Map C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nb.w f478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f481j;
    public x9.x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ga.o f482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile j f495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x9.t f496z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i7, wa.e eVar, x9.k kVar, x9.t tVar, x9.n0 n0Var, y9.h hVar) {
        super(kVar, hVar, eVar, n0Var);
        if (kVar == null) {
            D(0);
            throw null;
        }
        if (hVar == null) {
            D(1);
            throw null;
        }
        if (eVar == null) {
            D(2);
            throw null;
        }
        if (i7 == 0) {
            D(3);
            throw null;
        }
        if (n0Var == null) {
            D(4);
            throw null;
        }
        this.f482l = x9.o.f14725i;
        this.f483m = false;
        this.f484n = false;
        this.f485o = false;
        this.f486p = false;
        this.f487q = false;
        this.f488r = false;
        this.f489s = false;
        this.f490t = false;
        this.f491u = false;
        this.f492v = true;
        this.f493w = false;
        this.f494x = null;
        this.f495y = null;
        this.B = null;
        this.C = null;
        this.f496z = tVar == null ? this : tVar;
        this.A = i7;
    }

    public static /* synthetic */ void D(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                i10 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[1] = "copy";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ArrayList G0(x9.t tVar, List list, nb.r0 r0Var, boolean z10, boolean z11, boolean[] zArr) {
        e eVar;
        hb.d x0Var;
        if (list == null) {
            D(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            y0 y0Var2 = y0Var;
            nb.w type = y0Var2.getType();
            nb.x0 x0Var2 = nb.x0.IN_VARIANCE;
            nb.w wVarI = r0Var.i(type, x0Var2);
            nb.w wVar = y0Var.f475j;
            nb.w wVarI2 = wVar == null ? null : r0Var.i(wVar, x0Var2);
            if (wVarI == null) {
                return null;
            }
            if ((wVarI != y0Var2.getType() || wVar != wVarI2) && zArr != null) {
                zArr[0] = true;
            }
            if (y0Var instanceof x0) {
                eVar = new e(3, (List) ((x0) y0Var).f447l.getValue());
            } else {
                eVar = null;
            }
            y0 y0Var3 = z10 ? null : y0Var;
            int i7 = y0Var.f471f;
            y9.h annotations = y0Var.getAnnotations();
            wa.e name = y0Var.getName();
            boolean zD0 = y0Var.D0();
            boolean z12 = y0Var.f473h;
            boolean z13 = y0Var.f474i;
            x9.n0 source = z11 ? y0Var.getSource() : x9.n0.f14716e0;
            i9.l.e(annotations, "annotations");
            i9.l.e(name, "name");
            i9.l.e(source, "source");
            if (eVar == null) {
                x0Var = new y0(tVar, y0Var3, i7, annotations, name, wVarI, zD0, z12, z13, wVarI2, source);
            } else {
                x0Var = new x0(tVar, y0Var3, i7, annotations, name, wVarI, zD0, z12, z13, wVarI2, source, eVar);
            }
            arrayList.add(x0Var);
        }
        return arrayList;
    }

    @Override // x9.b
    public boolean C() {
        return this.f493w;
    }

    @Override // x9.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public s0 W(x9.k kVar, x9.x xVar, ga.o oVar) {
        return (s0) D0(kVar, xVar, oVar);
    }

    public final x9.t D0(x9.k kVar, x9.x xVar, ga.o oVar) {
        x9.t tVarBuild = s0().j(kVar).i(xVar).m(oVar).k(2).v().build();
        if (tVarBuild != null) {
            return tVarBuild;
        }
        D(26);
        throw null;
    }

    public abstract z E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, x9.n0 n0Var, y9.h hVar);

    public z F0(y yVar) {
        a0 a0Var;
        z zVar;
        a0 a0Var2;
        nb.w wVarI;
        nb.x0 x0Var = nb.x0.IN_VARIANCE;
        boolean[] zArr = new boolean[1];
        y9.h hVarR = yVar.f465s != null ? n3.l.r(getAnnotations(), yVar.f465s) : getAnnotations();
        x9.k kVar = yVar.f449b;
        x9.t tVar = yVar.f452e;
        int i7 = yVar.f453f;
        wa.e eVar = yVar.f458l;
        x9.n0 source = yVar.f461o ? ((r) (tVar != null ? tVar : a())).getSource() : x9.n0.f14716e0;
        if (source == null) {
            D(27);
            throw null;
        }
        z zVarE0 = E0(i7, eVar, kVar, tVar, source, hVarR);
        List typeParameters = yVar.f464r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        nb.r0 r0VarA = nb.c.A(typeParameters, yVar.f448a, zVarE0, arrayList, zArr);
        if (r0VarA != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!yVar.f455h.isEmpty()) {
                int i10 = 0;
                for (a0 a0Var3 : yVar.f455h) {
                    nb.w wVarI2 = r0VarA.i(a0Var3.getType(), x0Var);
                    if (wVarI2 != null) {
                        int i11 = i10 + 1;
                        arrayList2.add(za.k.e(zVarE0, wVarI2, ((hb.a) a0Var3.C0()).w0(), a0Var3.getAnnotations(), i10));
                        zArr[0] = zArr[0] | (wVarI2 != a0Var3.getType());
                        i10 = i11;
                    }
                }
            }
            a0 a0Var4 = yVar.f456i;
            if (a0Var4 != null) {
                nb.w wVarI3 = r0VarA.i(a0Var4.getType(), x0Var);
                if (wVarI3 != null) {
                    yVar.f456i.C0();
                    a0 a0Var5 = new a0(zVarE0, new hb.b(zVarE0, wVarI3), yVar.f456i.getAnnotations());
                    zArr[0] = (wVarI3 != yVar.f456i.getType()) | zArr[0];
                    a0Var = a0Var5;
                }
                return null;
            }
            a0Var = null;
            a0 a0Var6 = yVar.f457j;
            if (a0Var6 != null) {
                a0 a0VarE = a0Var6.e(r0VarA);
                if (a0VarE != null) {
                    zArr[0] = zArr[0] | (a0VarE != yVar.f457j);
                    zVar = null;
                    a0Var2 = a0VarE;
                }
                return null;
            }
            zVar = null;
            a0Var2 = null;
            ArrayList arrayListG0 = G0(zVarE0, yVar.f454g, r0VarA, yVar.f462p, yVar.f461o, zArr);
            if (arrayListG0 == null || (wVarI = r0VarA.i(yVar.k, nb.x0.OUT_VARIANCE)) == null) {
                return zVar;
            }
            boolean z10 = zArr[0] | (wVarI != yVar.k);
            zArr[0] = z10;
            if (!z10 && yVar.f469w) {
                return this;
            }
            zVarE0.H0(a0Var, a0Var2, arrayList2, arrayList, arrayListG0, wVarI, yVar.f450c, yVar.f451d);
            zVarE0.f483m = this.f483m;
            zVarE0.f484n = this.f484n;
            zVarE0.f485o = this.f485o;
            zVarE0.f486p = this.f486p;
            zVarE0.f487q = this.f487q;
            zVarE0.f491u = this.f491u;
            zVarE0.f488r = this.f488r;
            zVarE0.K0(this.f492v);
            zVarE0.f489s = yVar.f463q;
            zVarE0.f490t = yVar.f466t;
            Boolean bool = yVar.f468v;
            zVarE0.L0(bool != null ? bool.booleanValue() : this.f493w);
            if (!yVar.f467u.isEmpty() || this.C != null) {
                LinkedHashMap linkedHashMap = yVar.f467u;
                Map map = this.C;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    zVarE0.C = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    zVarE0.C = linkedHashMap;
                }
            }
            if (yVar.f460n || this.B != null) {
                x9.t tVar2 = this.B;
                if (tVar2 == null) {
                    tVar2 = this;
                }
                zVarE0.B = tVar2.e(r0VarA);
            }
            if (yVar.f459m && !a().m().isEmpty()) {
                if (yVar.f448a.e()) {
                    j jVar = this.f495y;
                    if (jVar != null) {
                        zVarE0.f495y = jVar;
                        return zVarE0;
                    }
                    zVarE0.m0(m());
                    return zVarE0;
                }
                zVarE0.f495y = new j(this, r0VarA, 1);
            }
            return zVarE0;
        }
        return null;
    }

    @Override // x9.w
    public final boolean G() {
        return this.f488r;
    }

    public void H0(a0 a0Var, a0 a0Var2, List list, List list2, List list3, nb.w wVar, x9.x xVar, ga.o oVar) {
        if (list == null) {
            D(5);
            throw null;
        }
        if (list2 == null) {
            D(6);
            throw null;
        }
        if (list3 == null) {
            D(7);
            throw null;
        }
        if (oVar == null) {
            D(8);
            throw null;
        }
        this.f476e = u8.p.J0(list2);
        this.f477f = u8.p.J0(list3);
        this.f478g = wVar;
        this.k = xVar;
        this.f482l = oVar;
        this.f480i = a0Var;
        this.f481j = a0Var2;
        this.f479h = list;
        for (int i7 = 0; i7 < list2.size(); i7++) {
            x9.r0 r0Var = (x9.r0) list2.get(i7);
            if (r0Var.getIndex() != i7) {
                throw new IllegalStateException(r0Var + " index is " + r0Var.getIndex() + " but position is " + i7);
            }
        }
        for (int i10 = 0; i10 < list3.size(); i10++) {
            y0 y0Var = (y0) list3.get(i10);
            if (y0Var.f471f != i10) {
                throw new IllegalStateException(y0Var + "index is " + y0Var.f471f + " but position is " + i10);
            }
        }
    }

    public final y I0(nb.r0 r0Var) {
        if (r0Var != null) {
            return new y(this, r0Var.f(), l(), i(), d(), f(), X(), i0(), this.f480i, p());
        }
        D(24);
        throw null;
    }

    public Object J(x9.m mVar, Object obj) {
        return mVar.l(this, obj);
    }

    public final void J0(x9.a aVar, Object obj) {
        if (this.C == null) {
            this.C = new LinkedHashMap();
        }
        this.C.put(aVar, obj);
    }

    @Override // x9.b
    public Object K(x9.a aVar) {
        Map map = this.C;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void K0(boolean z10) {
        this.f492v = z10;
    }

    public void L0(boolean z10) {
        this.f493w = z10;
    }

    public final void M0(nb.a0 a0Var) {
        if (a0Var != null) {
            this.f478g = a0Var;
        } else {
            D(11);
            throw null;
        }
    }

    @Override // x9.t
    public boolean N() {
        return this.f487q;
    }

    @Override // x9.t
    public final boolean O() {
        if (this.f483m) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((x9.t) it.next()).O()) {
                return true;
            }
        }
        return false;
    }

    @Override // x9.b
    public final List X() {
        List list = this.f477f;
        if (list != null) {
            return list;
        }
        D(19);
        throw null;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public x9.t a() {
        x9.t tVar = this.f496z;
        x9.t tVarA = tVar == this ? this : tVar.a();
        if (tVarA != null) {
            return tVarA;
        }
        D(20);
        throw null;
    }

    @Override // x9.t
    public final x9.t a0() {
        return this.B;
    }

    @Override // x9.b
    public final a0 b0() {
        return this.f481j;
    }

    @Override // x9.n
    public final ga.o d() {
        ga.o oVar = this.f482l;
        if (oVar != null) {
            return oVar;
        }
        D(16);
        throw null;
    }

    @Override // x9.p0
    public x9.t e(nb.r0 r0Var) {
        if (r0Var == null) {
            D(22);
            throw null;
        }
        if (r0Var.f9029a.e()) {
            return this;
        }
        y yVarI0 = I0(r0Var);
        yVarI0.f452e = a();
        yVarI0.f461o = true;
        yVarI0.f469w = true;
        return yVarI0.f470x.F0(yVarI0);
    }

    @Override // x9.b
    public final a0 e0() {
        return this.f480i;
    }

    @Override // x9.c
    public final int f() {
        int i7 = this.A;
        if (i7 != 0) {
            return i7;
        }
        D(21);
        throw null;
    }

    @Override // x9.t
    public boolean g() {
        return this.f486p;
    }

    @Override // x9.b
    public final List getTypeParameters() {
        List list = this.f476e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // x9.w
    public final x9.x i() {
        x9.x xVar = this.k;
        if (xVar != null) {
            return xVar;
        }
        D(15);
        throw null;
    }

    @Override // x9.b
    public final List i0() {
        List list = this.f479h;
        if (list != null) {
            return list;
        }
        D(13);
        throw null;
    }

    @Override // x9.t
    public final boolean l0() {
        return this.f489s;
    }

    public Collection m() {
        j jVar = this.f495y;
        if (jVar != null) {
            this.f494x = (Collection) jVar.invoke();
            this.f495y = null;
        }
        Collection collection = this.f494x;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D(14);
        throw null;
    }

    public void m0(Collection collection) {
        if (collection == null) {
            D(17);
            throw null;
        }
        this.f494x = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((x9.t) it.next()).q0()) {
                this.f490t = true;
                return;
            }
        }
    }

    @Override // x9.t
    public boolean o() {
        return this.f491u;
    }

    public nb.w p() {
        return this.f478g;
    }

    @Override // x9.t
    public final boolean q0() {
        return this.f490t;
    }

    @Override // x9.w
    public boolean s() {
        return this.f485o;
    }

    public x9.s s0() {
        return I0(nb.r0.f9028b);
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.t
    public final boolean y0() {
        if (this.f484n) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((x9.t) it.next()).y0()) {
                return true;
            }
        }
        return false;
    }
}
