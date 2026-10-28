package k2;

import java.util.ArrayList;
import java.util.List;
import q2.h1;
import q2.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.o f7238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j.g f7239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.q f7240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h1 f7241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f7242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7245j;

    public l(r1.o oVar) {
        this.f7238c = oVar;
        j.g gVar = new j.g(3);
        gVar.f6795c = new long[2];
        this.f7239d = gVar;
        this.f7240e = new s.q(2);
        this.f7244i = true;
        this.f7245j = true;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x030b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // k2.m
    public final boolean a(s.q qVar, o2.w wVar, i iVar, boolean z10) {
        s.q qVar2;
        j.g gVar;
        Object obj;
        boolean z11;
        n nVar;
        int i7;
        int i10;
        boolean zA = super.a(qVar, wVar, iVar, z10);
        ?? F = this.f7238c;
        if (F.f11129n) {
            ?? eVar = 0;
            while (F != 0) {
                if (F instanceof v1) {
                    this.f7241f = q2.f.t((v1) F, 16);
                } else if ((F.f11119c & 16) != 0 && (F instanceof q2.m)) {
                    r1.o oVar = ((q2.m) F).f10746p;
                    int i11 = 0;
                    while (oVar != null) {
                        if ((oVar.f11119c & 16) != 0) {
                            i11++;
                            if (i11 == 1) {
                                F = F;
                                eVar = eVar;
                                eVar = eVar;
                                F = oVar;
                            } else {
                                if (eVar == 0) {
                                    eVar = new h1.e(new r1.o[16]);
                                }
                                if (F != 0) {
                                    eVar.b(F);
                                    F = 0;
                                }
                                eVar.b(oVar);
                            }
                        } else {
                            F = F;
                            eVar = eVar;
                        }
                        oVar = oVar.f11122f;
                        F = F;
                        eVar = eVar;
                    }
                    if (i11 == 1) {
                        F = F;
                        eVar = eVar;
                    } else {
                        F = F;
                        eVar = eVar;
                    }
                }
                F = q2.f.f(eVar);
            }
            if (this.f7241f != null) {
                int iH = qVar.h();
                int i12 = 0;
                while (true) {
                    qVar2 = this.f7240e;
                    gVar = this.f7239d;
                    if (i12 >= iH) {
                        break;
                    }
                    long jE = qVar.e(i12);
                    v vVar = (v) qVar.i(i12);
                    if (gVar.c(jE)) {
                        long j5 = vVar.f7284g;
                        List list = vVar.k;
                        long j10 = vVar.f7280c;
                        if ((((j5 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            u8.w wVar2 = u8.w.f13122a;
                            zA = zA;
                            ArrayList arrayList = new ArrayList((list == null ? wVar2 : list).size());
                            if (list == null) {
                                list = wVar2;
                            }
                            int size = list.size();
                            iH = iH;
                            int i13 = 0;
                            while (i13 < size) {
                                int i14 = size;
                                c cVar = (c) list.get(i13);
                                long j11 = jE;
                                List list2 = list;
                                long j12 = cVar.f7191b;
                                if ((((j12 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j13 = cVar.f7190a;
                                    h1 h1Var = this.f7241f;
                                    i9.l.b(h1Var);
                                    arrayList.add(new c(j13, h1Var.P0(wVar, j12), cVar.f7192c));
                                }
                                i13++;
                                vVar = vVar;
                                size = i14;
                                list = list2;
                                jE = j11;
                            }
                            long j14 = jE;
                            h1 h1Var2 = this.f7241f;
                            i9.l.b(h1Var2);
                            long jP0 = h1Var2.P0(wVar, j5);
                            h1 h1Var3 = this.f7241f;
                            i9.l.b(h1Var3);
                            v vVar2 = new v(vVar.f7278a, vVar.f7279b, h1Var3.P0(wVar, j10), vVar.f7281d, vVar.f7282e, vVar.f7283f, jP0, vVar.f7285h, vVar.f7286i, arrayList, vVar.f7287j, vVar.f7288l);
                            v vVar3 = vVar.f7291o;
                            if (vVar3 == null) {
                                vVar3 = vVar;
                            }
                            vVar2.f7291o = vVar3;
                            v vVar4 = vVar.f7291o;
                            if (vVar4 != null) {
                                vVar = vVar4;
                            }
                            vVar2.f7291o = vVar;
                            qVar2.f(j14, vVar2);
                        }
                        i12++;
                        iH = iH;
                        zA = zA;
                    }
                    i12++;
                    iH = iH;
                    zA = zA;
                }
                boolean z12 = zA;
                if (qVar2.h() == 0) {
                    gVar.f6794b = 0;
                    this.f7252a.h();
                    return true;
                }
                int i15 = gVar.f6794b;
                while (true) {
                    i15--;
                    if (-1 >= i15) {
                        break;
                    }
                    long j15 = ((long[]) gVar.f6795c)[i15];
                    if (qVar.f12479a) {
                        int i16 = qVar.f12482d;
                        long[] jArr = qVar.f12480b;
                        Object[] objArr = qVar.f12481c;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            Object obj2 = objArr[i18];
                            if (obj2 != s.r.f12486a) {
                                if (i18 != i17) {
                                    jArr[i17] = jArr[i18];
                                    objArr[i17] = obj2;
                                    objArr[i18] = null;
                                }
                                i17++;
                            }
                        }
                        qVar.f12479a = false;
                        qVar.f12482d = i17;
                    }
                    if (t.a.b(qVar.f12480b, qVar.f12482d, j15) < 0 && i15 < (i10 = gVar.f6794b)) {
                        int i19 = i10 - 1;
                        int i20 = i15;
                        while (i20 < i19) {
                            long[] jArr2 = (long[]) gVar.f6795c;
                            int i21 = i20 + 1;
                            jArr2[i20] = jArr2[i21];
                            i20 = i21;
                        }
                        gVar.f6794b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.h());
                int iH2 = qVar2.h();
                for (int i22 = 0; i22 < iH2; i22++) {
                    arrayList2.add(qVar2.i(i22));
                }
                n nVar2 = new n(arrayList2, iVar);
                int size2 = arrayList2.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i23);
                    if (iVar.e(((v) obj).f7278a)) {
                        break;
                    }
                    i23++;
                }
                v vVar5 = (v) obj;
                if (vVar5 != null) {
                    boolean z13 = vVar5.f7281d;
                    if (!z10) {
                        this.f7244i = false;
                    } else if (!this.f7244i && (z13 || vVar5.f7285h)) {
                        h1 h1Var4 = this.f7241f;
                        i9.l.b(h1Var4);
                        long j16 = h1Var4.f9437c;
                        long j17 = vVar5.f7280c;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                        this.f7244i = !((fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j16 >> 32)))) | (fIntBitsToFloat2 > ((float) ((int) (j16 & 4294967295L)))));
                    }
                    boolean z14 = this.f7244i;
                    boolean z15 = this.f7243h;
                    if (z14 == z15 || !((i7 = nVar2.f7268e) == 3 || i7 == 4 || i7 == 5)) {
                        int i24 = nVar2.f7268e;
                        if (i24 == 4 && z15 && !this.f7245j) {
                            nVar2.f7268e = 3;
                        } else if (i24 == 5 && z14 && z13) {
                            nVar2.f7268e = 3;
                        }
                    } else {
                        nVar2.f7268e = z14 ? 4 : 5;
                    }
                }
                if (!z12 && nVar2.f7268e == 3 && (nVar = this.f7242g) != null) {
                    ?? r8 = nVar.f7264a;
                    int size3 = r8.size();
                    ?? r10 = nVar2.f7264a;
                    if (size3 != r10.size()) {
                        z11 = true;
                        break;
                    }
                    int size4 = r10.size();
                    int i25 = 0;
                    while (true) {
                        if (i25 >= size4) {
                            z11 = false;
                            break;
                        }
                        if (!x1.b.b(((v) r8.get(i25)).f7280c, ((v) r10.get(i25)).f7280c)) {
                            z11 = true;
                            break;
                        }
                        i25++;
                    }
                } else {
                    z11 = true;
                    break;
                }
                this.f7242g = nVar2;
                return z11;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // k2.m
    public final void b(i iVar) {
        super.b(iVar);
        n nVar = this.f7242g;
        if (nVar == null) {
            return;
        }
        this.f7243h = this.f7244i;
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            v vVar = (v) r8.get(i7);
            boolean z10 = vVar.f7281d;
            long j5 = vVar.f7278a;
            boolean zE = iVar.e(j5);
            boolean z11 = this.f7244i;
            if ((!z10 && !zE) || (!z10 && !z11)) {
                this.f7239d.j(j5);
            }
        }
        this.f7244i = false;
        this.f7245j = nVar.f7268e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        h1.e eVar = this.f7252a;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((l) objArr[i10]).c();
        }
        ?? F = this.f7238c;
        ?? eVar2 = 0;
        while (F != 0) {
            if (F instanceof v1) {
                ((v1) F).z();
            } else if ((F.f11119c & 16) != 0 && (F instanceof q2.m)) {
                r1.o oVar = ((q2.m) F).f10746p;
                int i11 = 0;
                F = F;
                eVar2 = eVar2;
                while (oVar != null) {
                    if ((oVar.f11119c & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            eVar2 = eVar2;
                            F = oVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new h1.e(new r1.o[16]);
                            }
                            if (F != 0) {
                                eVar2.b(F);
                                F = 0;
                            }
                            eVar2.b(oVar);
                        }
                    }
                    oVar = oVar.f11122f;
                    F = F;
                    eVar2 = eVar2;
                }
                if (i11 == 1) {
                }
            }
            F = q2.f.f(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(i iVar) {
        s.q qVar = this.f7240e;
        boolean z10 = false;
        z10 = false;
        if (qVar.h() != 0) {
            r1.o oVar = this.f7238c;
            if (oVar.f11129n) {
                n nVar = this.f7242g;
                i9.l.b(nVar);
                h1 h1Var = this.f7241f;
                i9.l.b(h1Var);
                long j5 = h1Var.f9437c;
                ?? F = oVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof v1) {
                        ((v1) F).l0(nVar, o.f7271c, j5);
                    } else if ((F.f11119c & 16) != 0 && (F instanceof q2.m)) {
                        r1.o oVar2 = ((q2.m) F).f10746p;
                        int i7 = 0;
                        while (oVar2 != null) {
                            if ((oVar2.f11119c & 16) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    F = F;
                                    eVar = eVar;
                                    eVar = eVar;
                                    F = oVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h1.e(new r1.o[16]);
                                    }
                                    if (F != 0) {
                                        eVar.b(F);
                                        F = 0;
                                    }
                                    eVar.b(oVar2);
                                }
                            } else {
                                F = F;
                                eVar = eVar;
                            }
                            oVar2 = oVar2.f11122f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                            F = F;
                            eVar = eVar;
                        } else {
                            F = F;
                            eVar = eVar;
                        }
                    }
                    F = q2.f.f(eVar);
                }
                if (oVar.f11129n) {
                    h1.e eVar2 = this.f7252a;
                    Object[] objArr = eVar2.f6421a;
                    int i10 = eVar2.f6423c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((l) objArr[i11]).d(iVar);
                    }
                }
                z10 = true;
            }
        }
        b(iVar);
        qVar.b();
        this.f7241f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(i iVar, boolean z10) {
        if (this.f7240e.h() == 0) {
            return false;
        }
        ?? F = this.f7238c;
        if (!F.f11129n) {
            return false;
        }
        n nVar = this.f7242g;
        i9.l.b(nVar);
        h1 h1Var = this.f7241f;
        i9.l.b(h1Var);
        long j5 = h1Var.f9437c;
        ?? F2 = F;
        ?? eVar = 0;
        while (F2 != 0) {
            if (F2 instanceof v1) {
                ((v1) F2).l0(nVar, o.f7269a, j5);
            } else if ((F2.f11119c & 16) != 0 && (F2 instanceof q2.m)) {
                r1.o oVar = ((q2.m) F2).f10746p;
                int i7 = 0;
                while (oVar != null) {
                    if ((oVar.f11119c & 16) != 0) {
                        i7++;
                        if (i7 == 1) {
                            F2 = F2;
                            eVar = eVar;
                            eVar = eVar;
                            F2 = oVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new h1.e(new r1.o[16]);
                            }
                            if (F2 != 0) {
                                eVar.b(F2);
                                F2 = 0;
                            }
                            eVar.b(oVar);
                        }
                    } else {
                        F2 = F2;
                        eVar = eVar;
                    }
                    oVar = oVar.f11122f;
                    F2 = F2;
                    eVar = eVar;
                }
                if (i7 == 1) {
                    F2 = F2;
                    eVar = eVar;
                } else {
                    F2 = F2;
                    eVar = eVar;
                }
            }
            F2 = q2.f.f(eVar);
        }
        if (F.f11129n) {
            h1.e eVar2 = this.f7252a;
            Object[] objArr = eVar2.f6421a;
            int i10 = eVar2.f6423c;
            for (int i11 = 0; i11 < i10; i11++) {
                l lVar = (l) objArr[i11];
                i9.l.b(this.f7241f);
                lVar.e(iVar, z10);
            }
        }
        if (F.f11129n) {
            ?? eVar3 = 0;
            while (F != 0) {
                if (F instanceof v1) {
                    ((v1) F).l0(nVar, o.f7270b, j5);
                } else if ((F.f11119c & 16) != 0 && (F instanceof q2.m)) {
                    r1.o oVar2 = ((q2.m) F).f10746p;
                    int i12 = 0;
                    while (oVar2 != null) {
                        if ((oVar2.f11119c & 16) != 0) {
                            i12++;
                            if (i12 == 1) {
                                F = F;
                                eVar3 = eVar3;
                                eVar3 = eVar3;
                                F = oVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new h1.e(new r1.o[16]);
                                }
                                if (F != 0) {
                                    eVar3.b(F);
                                    F = 0;
                                }
                                eVar3.b(oVar2);
                            }
                        } else {
                            F = F;
                            eVar3 = eVar3;
                        }
                        oVar2 = oVar2.f11122f;
                        F = F;
                        eVar3 = eVar3;
                    }
                    if (i12 == 1) {
                        F = F;
                        eVar3 = eVar3;
                    } else {
                        F = F;
                        eVar3 = eVar3;
                    }
                }
                F = q2.f.f(eVar3);
            }
        }
        return true;
    }

    public final void f(long j5, s.d0 d0Var) {
        j.g gVar = this.f7239d;
        if (gVar.c(j5) && d0Var.f(this) < 0) {
            gVar.j(j5);
            this.f7240e.g(j5);
        }
        h1.e eVar = this.f7252a;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((l) objArr[i10]).f(j5, d0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f7238c + ", children=" + this.f7252a + ", pointerIds=" + this.f7239d + ')';
    }
}
