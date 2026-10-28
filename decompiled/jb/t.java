package jb;

import aa.f0;
import aa.j0;
import aa.q0;
import aa.r0;
import aa.y0;
import java.util.ArrayList;
import java.util.List;
import p.i3;
import ra.a1;
import ra.g1;
import ra.i0;
import ra.s0;
import x9.n0;
import x9.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0.k f7077b;

    public t(k kVar) {
        this.f7076a = kVar;
        i iVar = kVar.f7043a;
        this.f7077b = new u0.k(iVar.f7019b, iVar.f7028l);
    }

    public final w a(x9.k kVar) {
        if (kVar instanceof x9.d0) {
            wa.c cVar = ((j0) ((x9.d0) kVar)).f364e;
            k kVar2 = this.f7076a;
            return new v(cVar, kVar2.f7044b, kVar2.f7046d, kVar2.f7049g);
        }
        if (kVar instanceof lb.h) {
            return ((lb.h) kVar).f8331v;
        }
        return null;
    }

    public final y9.h b(xa.k kVar, int i7, int i10) {
        return !ta.d.f12862c.i(i7).booleanValue() ? y9.g.f15129a : new lb.u(this.f7076a.f7043a.f7018a, new q(this, kVar, i10, 0));
    }

    public final y9.h c(i0 i0Var, boolean z10) {
        return !ta.d.f12862c.i(i0Var.f12009d).booleanValue() ? y9.g.f15129a : new lb.u(this.f7076a.f7043a.f7018a, new r(this, z10, i0Var));
    }

    public final lb.c d(ra.n nVar, boolean z10) {
        k kVar = this.f7076a;
        x9.k kVar2 = kVar.f7045c;
        i9.l.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        x9.e eVar = (x9.e) kVar2;
        lb.c cVar = new lb.c(eVar, null, b(nVar, nVar.f12097d, 1), z10, 1, nVar, kVar.f7044b, kVar.f7046d, kVar.f7047e, kVar.f7049g, null);
        t tVar = kVar.a(cVar, u8.w.f13122a, kVar.f7044b, kVar.f7046d, kVar.f7047e, kVar.f7048f).f7051i;
        List list = nVar.f12098e;
        i9.l.d(list, "getValueParameterList(...)");
        cVar.Q0(tVar.g(list, nVar, 1), k9.a.r((g1) ta.d.f12863d.i(nVar.f12097d)));
        cVar.M0(eVar.n());
        cVar.f488r = eVar.G();
        cVar.f492v = !ta.d.f12873o.i(nVar.f12097d).booleanValue();
        return cVar;
    }

    public final lb.r e(ra.a0 a0Var) {
        int i7;
        nb.w wVarL;
        k kVar = this.f7076a;
        ta.f fVar = kVar.f7044b;
        f0 f0Var = kVar.f7046d;
        i9.l.e(a0Var, "proto");
        int i10 = 1;
        if ((a0Var.f11804c & 1) == 1) {
            i7 = a0Var.f11805d;
        } else {
            int i11 = a0Var.f11806e;
            i7 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i7;
        y9.h hVarB = b(a0Var, i12, 1);
        int i13 = a0Var.f11804c;
        int i14 = i13 & 32;
        y9.f fVar2 = y9.g.f15129a;
        y9.h aVar = (i14 == 32 || (i13 & 64) == 64) ? new lb.a(kVar.f7043a.f7018a, new q(this, a0Var, i10, 1)) : fVar2;
        lb.r rVar = new lb.r(kVar.f7045c, null, hVarB, i2.c.G(fVar, a0Var.f11807f), k9.a.E((ra.b0) ta.d.f12874p.i(i12)), a0Var, kVar.f7044b, f0Var, db.e.g(kVar.f7045c).a(i2.c.G(fVar, a0Var.f11807f)).equals(z.f7091a) ? ta.g.f12888a : kVar.f7047e, kVar.f7049g, null);
        List list = a0Var.f11810i;
        i9.l.d(list, "getTypeParameterList(...)");
        k kVarA = kVar.a(rVar, list, kVar.f7044b, kVar.f7046d, kVar.f7047e, kVar.f7048f);
        i3 i3Var = kVarA.f7050h;
        s0 s0VarM = n3.r.M(a0Var, f0Var);
        aa.a0 a0VarK = (s0VarM == null || (wVarL = i3Var.l(s0VarM)) == null) ? null : za.k.k(rVar, wVarL, aVar);
        x9.k kVar2 = kVar.f7045c;
        x9.e eVar = kVar2 instanceof x9.e ? (x9.e) kVar2 : null;
        aa.a0 a0VarA0 = eVar != null ? eVar.A0() : null;
        List list2 = a0Var.f11812l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = a0Var.f11813m;
            i9.l.d(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(list3, 10));
            for (Integer num : list3) {
                i9.l.b(num);
                arrayList.add(f0Var.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                n3.l.Y();
                throw null;
            }
            aa.a0 a0VarE = za.k.e(rVar, i3Var.l((s0) obj), null, fVar2, i15);
            if (a0VarE != null) {
                arrayList2.add(a0VarE);
            }
            i15 = i16;
        }
        List listC = i3Var.c();
        t tVar = kVarA.f7051i;
        List list4 = a0Var.f11815o;
        i9.l.d(list4, "getValueParameterList(...)");
        rVar.Q0(a0VarK, a0VarA0, arrayList2, listC, tVar.g(list4, a0Var, 1), i3Var.l(n3.r.R(a0Var, f0Var)), j.e((ra.c0) ta.d.f12864e.i(i12)), k9.a.r((g1) ta.d.f12863d.i(i12)), u8.x.f13123a);
        rVar.f483m = ta.d.f12875q.i(i12).booleanValue();
        rVar.f484n = ta.d.f12876r.i(i12).booleanValue();
        rVar.f485o = ta.d.f12879u.i(i12).booleanValue();
        rVar.f486p = ta.d.f12877s.i(i12).booleanValue();
        rVar.f487q = ta.d.f12878t.i(i12).booleanValue();
        rVar.f491u = ta.d.f12880v.i(i12).booleanValue();
        rVar.f488r = ta.d.f12881w.i(i12).booleanValue();
        rVar.f492v = !ta.d.f12882x.i(i12).booleanValue();
        kVar.f7043a.f7029m.getClass();
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0103  */
    public final lb.q f(i0 i0Var) {
        int i7;
        y9.h aVar;
        ta.b bVar;
        ta.b bVar2;
        int i10;
        q0 q0Var;
        t tVar;
        r0 r0VarG;
        q0 q0VarF;
        nb.w wVarL;
        k kVar = this.f7076a;
        f0 f0Var = kVar.f7046d;
        i9.l.e(i0Var, "proto");
        if ((i0Var.f12008c & 1) == 1) {
            i7 = i0Var.f12009d;
        } else {
            int i11 = i0Var.f12010e;
            i7 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i7;
        k kVar2 = kVar;
        lb.q qVar = new lb.q(kVar.f7045c, null, b(i0Var, i7, 2), j.e((ra.c0) ta.d.f12864e.i(i7)), k9.a.r((g1) ta.d.f12863d.i(i7)), ta.d.f12883y.i(i7).booleanValue(), i2.c.G(kVar.f7044b, i0Var.f12011f), k9.a.E((ra.b0) ta.d.f12874p.i(i7)), ta.d.C.i(i7).booleanValue(), ta.d.B.i(i7).booleanValue(), ta.d.E.i(i7).booleanValue(), ta.d.F.i(i7).booleanValue(), ta.d.G.i(i7).booleanValue(), i0Var, kVar.f7044b, f0Var, kVar.f7047e, kVar.f7049g);
        List list = i0Var.f12014i;
        i9.l.d(list, "getTypeParameterList(...)");
        k kVarA = kVar2.a(qVar, list, kVar2.f7044b, kVar2.f7046d, kVar2.f7047e, kVar2.f7048f);
        i3 i3Var = kVarA.f7050h;
        boolean zBooleanValue = ta.d.f12884z.i(i12).booleanValue();
        y9.f fVar = y9.g.f15129a;
        int i13 = 3;
        if (zBooleanValue) {
            int i14 = i0Var.f12008c;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                aVar = new lb.a(kVar2.f7043a.f7018a, new q(this, i0Var, i13, 1));
            } else {
                aVar = fVar;
            }
        } else {
            aVar = fVar;
        }
        nb.w wVarL2 = i3Var.l(n3.r.S(i0Var, f0Var));
        List listC = i3Var.c();
        x9.k kVar3 = kVar2.f7045c;
        x9.e eVar = kVar3 instanceof x9.e ? (x9.e) kVar3 : null;
        aa.a0 a0VarA0 = eVar != null ? eVar.A0() : null;
        int i15 = i0Var.f12008c;
        s0 s0VarA = (i15 & 32) == 32 ? i0Var.f12015j : (i15 & 64) == 64 ? f0Var.a(i0Var.k) : null;
        aa.a0 a0VarK = (s0VarA == null || (wVarL = i3Var.l(s0VarA)) == null) ? null : za.k.k(qVar, wVarL, aVar);
        List list2 = i0Var.f12016l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = i0Var.f12017m;
            i9.l.d(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(list3, 10));
            for (Integer num : list3) {
                i9.l.b(num);
                arrayList.add(f0Var.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                n3.l.Y();
                throw null;
            }
            arrayList2.add(za.k.e(qVar, i3Var.l((s0) obj), null, fVar, i16));
            i16 = i17;
        }
        qVar.J0(wVarL2, listC, a0VarA0, a0VarK, arrayList2);
        ta.b bVar3 = ta.d.f12862c;
        boolean zBooleanValue2 = bVar3.i(i12).booleanValue();
        ta.c cVar = ta.d.f12863d;
        g1 g1Var = (g1) cVar.i(i12);
        ta.c cVar2 = ta.d.f12864e;
        ra.c0 c0Var = (ra.c0) cVar2.i(i12);
        if (g1Var == null) {
            ta.d.a(10);
            throw null;
        }
        if (c0Var == null) {
            ta.d.a(11);
            throw null;
        }
        int number = (zBooleanValue2 ? 1 << bVar3.f5792b : 0) | (c0Var.getNumber() << cVar2.f5792b) | (g1Var.getNumber() << cVar.f5792b);
        ta.b bVar4 = ta.d.K;
        bVar4.getClass();
        ta.b bVar5 = ta.d.L;
        bVar5.getClass();
        ta.b bVar6 = ta.d.M;
        bVar6.getClass();
        o0 o0Var = n0.f14716e0;
        if (zBooleanValue) {
            int i18 = (i0Var.f12008c & 256) == 256 ? i0Var.f12020p : number;
            boolean zBooleanValue3 = bVar4.i(i18).booleanValue();
            boolean zBooleanValue4 = bVar5.i(i18).booleanValue();
            boolean zBooleanValue5 = bVar6.i(i18).booleanValue();
            y9.h hVarB = b(i0Var, i18, 3);
            if (zBooleanValue3) {
                bVar = bVar4;
                bVar2 = bVar6;
                i10 = i12;
                q0VarF = new q0(qVar, hVarB, j.e((ra.c0) cVar2.i(i18)), k9.a.r((g1) cVar.i(i18)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, qVar.f(), null, o0Var);
            } else {
                bVar = bVar4;
                bVar2 = bVar6;
                i10 = i12;
                q0VarF = za.k.f(qVar, hVarB);
            }
            q0Var = q0VarF;
            q0Var.F0(qVar.p());
        } else {
            kVar2 = kVar2;
            kVarA = kVarA;
            bVar = bVar4;
            cVar = cVar;
            bVar5 = bVar5;
            cVar2 = cVar2;
            bVar2 = bVar6;
            i10 = i12;
            q0Var = null;
        }
        if (ta.d.A.i(i10).booleanValue()) {
            int i19 = (i0Var.f12008c & 512) == 512 ? i0Var.f12021q : number;
            boolean zBooleanValue6 = bVar.i(i19).booleanValue();
            boolean zBooleanValue7 = bVar5.i(i19).booleanValue();
            boolean zBooleanValue8 = bVar2.i(i19).booleanValue();
            tVar = this;
            y9.h hVarB2 = tVar.b(i0Var, i19, 4);
            if (zBooleanValue6) {
                r0 r0Var = new r0(qVar, hVarB2, j.e((ra.c0) cVar2.i(i19)), k9.a.r((g1) cVar.i(i19)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, qVar.f(), null, o0Var);
                k kVar4 = kVarA;
                y0 y0Var = (y0) u8.p.A0(kVar4.a(r0Var, u8.w.f13122a, kVar4.f7044b, kVar4.f7046d, kVar4.f7047e, kVar4.f7048f).f7051i.g(n3.l.I(i0Var.f12019o), i0Var, 4));
                if (y0Var == null) {
                    r0.D(6);
                    throw null;
                }
                r0Var.f429m = y0Var;
                r0VarG = r0Var;
            } else {
                r0VarG = za.k.g(qVar, hVarB2);
            }
        } else {
            tVar = this;
            r0VarG = null;
        }
        if (ta.d.D.i(i10).booleanValue()) {
            qVar.H0(null, new p(tVar, i0Var, qVar, 0));
        }
        x9.k kVar5 = kVar2.f7045c;
        x9.e eVar2 = kVar5 instanceof x9.e ? (x9.e) kVar5 : null;
        if ((eVar2 != null ? eVar2.f() : null) == x9.f.f14705e) {
            qVar.H0(null, new p(tVar, i0Var, qVar, 1));
        }
        qVar.G0(q0Var, r0VarG, new aa.x(tVar.c(i0Var, false)), new aa.x(tVar.c(i0Var, true)));
        return qVar;
    }

    public final List g(List list, xa.k kVar, int i7) {
        int i10;
        y9.h uVar;
        t tVar = this;
        k kVar2 = tVar.f7076a;
        f0 f0Var = kVar2.f7046d;
        i3 i3Var = kVar2.f7050h;
        x9.k kVar3 = kVar2.f7045c;
        i9.l.c(kVar3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        x9.b bVar = (x9.b) kVar3;
        x9.k kVarL = bVar.l();
        i9.l.d(kVarL, "getContainingDeclaration(...)");
        w wVarA = tVar.a(kVarL);
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            nb.w wVarL = null;
            if (i11 < 0) {
                n3.l.Y();
                throw null;
            }
            a1 a1Var = (a1) obj;
            int i13 = (a1Var.f11825c & 1) == 1 ? a1Var.f11826d : 0;
            if (wVarA == null || !ta.d.f12862c.i(i13).booleanValue()) {
                i10 = i11;
                uVar = y9.g.f15129a;
            } else {
                i10 = i11;
                uVar = new lb.u(kVar2.f7043a.f7018a, new s(tVar, wVarA, kVar, i7, i10, a1Var));
            }
            wa.e eVarG = i2.c.G(kVar2.f7044b, a1Var.f11827e);
            nb.w wVarL2 = i3Var.l(n3.r.c0(a1Var, f0Var));
            boolean zBooleanValue = ta.d.H.i(i13).booleanValue();
            boolean zBooleanValue2 = ta.d.I.i(i13).booleanValue();
            boolean zBooleanValue3 = ta.d.J.i(i13).booleanValue();
            int i14 = a1Var.f11825c;
            s0 s0VarA = (i14 & 16) == 16 ? a1Var.f11830h : (i14 & 32) == 32 ? f0Var.a(a1Var.f11831i) : null;
            if (s0VarA != null) {
                wVarL = i3Var.l(s0VarA);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new y0(bVar, null, i10, uVar, eVarG, wVarL2, zBooleanValue, zBooleanValue2, zBooleanValue3, wVarL, n0.f14716e0));
            arrayList = arrayList2;
            i11 = i12;
            tVar = this;
        }
        return u8.p.J0(arrayList);
    }
}
