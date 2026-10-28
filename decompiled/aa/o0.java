package aa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x9.k f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x9.x f393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ga.o f394c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f396e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wa.e f400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb.w f401j;
    public final /* synthetic */ p0 k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x9.k0 f395d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.p0 f397f = nb.p0.f9025a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f398g = true;

    public o0(p0 p0Var) {
        this.k = p0Var;
        this.f392a = p0Var.l();
        this.f393b = p0Var.i();
        this.f394c = p0Var.d();
        this.f396e = p0Var.f();
        this.f399h = p0Var.f417t;
        this.f400i = p0Var.getName();
        this.f401j = p0Var.getType();
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "setOwner";
        } else if (i7 == 2) {
            objArr[1] = "setOriginal";
        } else if (i7 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i7 == 5) {
            objArr[1] = "setReturnType";
        } else if (i7 == 7) {
            objArr[1] = "setModality";
        } else if (i7 == 9) {
            objArr[1] = "setVisibility";
        } else if (i7 == 11) {
            objArr[1] = "setKind";
        } else if (i7 == 19) {
            objArr[1] = "setName";
        } else if (i7 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i7 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i7 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i7 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 5 && i7 != 7 && i7 != 9 && i7 != 11 && i7 != 19 && i7 != 13 && i7 != 14 && i7 != 16 && i7 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [aa.n0, aa.r0, x9.t] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [aa.q0] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [aa.r0] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [aa.n0, aa.q0] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v13, types: [aa.x] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [nb.w] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r6v12, types: [aa.x] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r9v0, types: [aa.p0, x9.b, x9.k, x9.k0] */
    public final p0 b() {
        a0 a0Var;
        a0 a0Var2;
        ?? q0Var;
        ?? r0Var;
        nb.r0 r0Var2;
        h9.a aVar;
        a0 a0Var3;
        a0 a0Var4;
        nb.w wVarI;
        x9.k kVar = this.f392a;
        x9.x xVar = this.f393b;
        ga.o oVar = this.f394c;
        x9.k0 k0Var = this.f395d;
        int i7 = this.f396e;
        wa.e eVar = this.f400i;
        p0 p0Var = this.k;
        ?? E0 = p0Var.E0(kVar, xVar, oVar, k0Var, i7, eVar);
        List typeParameters = p0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        nb.r0 r0VarZ = nb.c.z(typeParameters, this.f397f, E0, arrayList);
        nb.w wVar = this.f401j;
        nb.x0 x0Var = nb.x0.OUT_VARIANCE;
        nb.w wVarI2 = r0VarZ.i(wVar, x0Var);
        a0 a0Var5 = null;
        if (wVarI2 != null) {
            nb.x0 x0Var2 = nb.x0.IN_VARIANCE;
            nb.w wVarI3 = r0VarZ.i(wVar, x0Var2);
            if (wVarI3 != null) {
                E0.I0(wVarI3);
            }
            a0 a0Var6 = this.f399h;
            if (a0Var6 != null) {
                a0 a0VarE = a0Var6.e(r0VarZ);
                if (a0VarE != null) {
                    a0Var = a0VarE;
                }
            } else {
                a0Var = null;
            }
            a0 a0Var7 = p0Var.f418u;
            if (a0Var7 == null || (wVarI = r0VarZ.i(a0Var7.getType(), x0Var2)) == null) {
                a0Var2 = null;
            } else {
                a0Var7.C0();
                a0Var2 = new a0(E0, new hb.b(E0, wVarI), a0Var7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = p0Var.f416s.iterator();
            while (it.hasNext()) {
                a0 a0Var8 = (a0) it.next();
                nb.w wVarI4 = r0VarZ.i(a0Var8.getType(), x0Var2);
                if (wVarI4 == null) {
                    a0Var3 = a0Var5;
                    a0Var4 = a0Var3;
                } else {
                    a0Var4 = a0Var5;
                    wa.e eVarW0 = ((hb.a) a0Var8.C0()).w0();
                    a0Var8.C0();
                    a0Var3 = new a0(E0, new hb.a((x9.b) E0, wVarI4, eVarW0), a0Var8.getAnnotations());
                }
                if (a0Var3 != null) {
                    arrayList2.add(a0Var3);
                }
                it = it;
                a0Var5 = a0Var4;
            }
            ?? r19 = a0Var5;
            E0.J0(wVarI2, arrayList, a0Var, a0Var2, arrayList2);
            q0 q0Var2 = p0Var.f420w;
            x9.o0 o0Var = x9.n0.f14716e0;
            if (q0Var2 == null) {
                q0Var = r19;
            } else {
                y9.h annotations = q0Var2.getAnnotations();
                x9.x xVar2 = this.f393b;
                ga.o oVarD = p0Var.f420w.d();
                if (this.f396e == 2 && x9.o.e(x9.o.f(oVarD.f6101a.k()))) {
                    oVarD = x9.o.f14724h;
                }
                ga.o oVar2 = oVarD;
                q0 q0Var3 = p0Var.f420w;
                boolean z10 = q0Var3.f380e;
                boolean z11 = q0Var3.f381f;
                boolean z12 = q0Var3.f384i;
                int i10 = this.f396e;
                x9.k0 k0Var2 = this.f395d;
                q0Var = new q0(E0, annotations, xVar2, oVar2, z10, z11, z12, i10, k0Var2 == null ? r19 : k0Var2.b(), o0Var);
            }
            if (q0Var != 0) {
                q0 q0Var4 = p0Var.f420w;
                nb.w wVar2 = q0Var4.f425m;
                q0Var.f386l = p0.F0(r0VarZ, q0Var4);
                q0Var.F0(wVar2 != null ? r0VarZ.i(wVar2, x0Var) : r19);
            }
            r0 r0Var3 = p0Var.f421x;
            if (r0Var3 == null) {
                r0Var = r19;
            } else {
                y9.h annotations2 = r0Var3.getAnnotations();
                x9.x xVar3 = this.f393b;
                ga.o oVarD2 = p0Var.f421x.d();
                if (this.f396e == 2 && x9.o.e(x9.o.f(oVarD2.f6101a.k()))) {
                    oVarD2 = x9.o.f14724h;
                }
                ga.o oVar3 = oVarD2;
                r0 r0Var4 = p0Var.f421x;
                boolean z13 = r0Var4.f380e;
                boolean z14 = r0Var4.f381f;
                boolean z15 = r0Var4.f384i;
                int i11 = this.f396e;
                x9.k0 k0Var3 = this.f395d;
                r0Var = new r0(E0, annotations2, xVar3, oVar3, z13, z14, z15, i11, k0Var3 == null ? r19 : k0Var3.c(), o0Var);
            }
            if (r0Var != 0) {
                r0Var2 = r0VarZ;
                List listG0 = z.G0(r0Var, p0Var.f421x.X(), r0Var2, false, false, null);
                if (listG0 == null) {
                    listG0 = Collections.singletonList(r0.E0(r0Var, db.e.e(this.f392a).o(), ((y0) p0Var.f421x.X().get(0)).getAnnotations()));
                }
                if (listG0.size() != 1) {
                    throw new IllegalStateException();
                }
                r0Var.f386l = p0.F0(r0Var2, p0Var.f421x);
                y0 y0Var = (y0) listG0.get(0);
                if (y0Var == null) {
                    r0.D(6);
                    throw r19;
                }
                r0Var.f429m = y0Var;
            } else {
                r0Var2 = r0VarZ;
            }
            x xVar4 = p0Var.f422y;
            ?? xVar5 = xVar4 == null ? r19 : new x(xVar4.getAnnotations(), E0);
            x xVar6 = p0Var.f423z;
            E0.G0(q0Var, r0Var, xVar5, xVar6 == null ? r19 : new x(xVar6.getAnnotations(), E0));
            if (this.f398g) {
                int i12 = wb.i.f14296c;
                wb.i iVarE = wb.l.e();
                Iterator it2 = p0Var.m().iterator();
                while (it2.hasNext()) {
                    iVarE.add(((x9.k0) it2.next()).e(r0Var2));
                }
                E0.k = iVarE;
            }
            if (p0Var.v() && (aVar = p0Var.f406h) != null) {
                E0.H0(p0Var.f405g, aVar);
            }
            return E0;
        }
        return null;
    }
}
