package lb;

import aa.f0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p.i3;
import ra.a0;
import ra.g1;
import ra.i0;
import ra.s0;
import ra.u0;
import u8.w;

/* JADX INFO: loaded from: classes.dex */
public final class l implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f8337b;

    public /* synthetic */ l(n nVar, int i7) {
        this.f8336a = i7;
        this.f8337b = nVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        s0 s0VarA;
        s0 s0VarA2;
        wa.e eVar = (wa.e) obj;
        switch (this.f8336a) {
            case 0:
                i9.l.e(eVar, "it");
                n nVar = this.f8337b;
                LinkedHashMap linkedHashMap = nVar.f8342a;
                ra.a aVar = a0.f11802w;
                i9.l.d(aVar, "PARSER");
                o oVar = nVar.f8350i;
                byte[] bArr = (byte[]) linkedHashMap.get(eVar);
                Collection<a0> collectionU = bArr != null ? yb.l.U(yb.l.Q(new aa.i(aVar, new ByteArrayInputStream(bArr), oVar, 1))) : w.f13122a;
                ArrayList arrayList = new ArrayList(collectionU.size());
                for (a0 a0Var : collectionU) {
                    jb.t tVar = oVar.f8352b.f7051i;
                    i9.l.b(a0Var);
                    r rVarE = tVar.e(a0Var);
                    if (!oVar.r(rVarE)) {
                        rVarE = null;
                    }
                    if (rVarE != null) {
                        arrayList.add(rVarE);
                    }
                }
                oVar.j(arrayList, eVar);
                return wb.l.d(arrayList);
            case 1:
                i9.l.e(eVar, "it");
                n nVar2 = this.f8337b;
                LinkedHashMap linkedHashMap2 = nVar2.f8343b;
                ra.a aVar2 = i0.f12006w;
                i9.l.d(aVar2, "PARSER");
                o oVar2 = nVar2.f8350i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(eVar);
                Collection<i0> collectionU2 = bArr2 != null ? yb.l.U(yb.l.Q(new aa.i(aVar2, new ByteArrayInputStream(bArr2), oVar2, 1))) : w.f13122a;
                ArrayList arrayList2 = new ArrayList(collectionU2.size());
                for (i0 i0Var : collectionU2) {
                    jb.t tVar2 = oVar2.f8352b.f7051i;
                    i9.l.b(i0Var);
                    arrayList2.add(tVar2.f(i0Var));
                }
                oVar2.k(arrayList2, eVar);
                return wb.l.d(arrayList2);
            default:
                i9.l.e(eVar, "it");
                n nVar3 = this.f8337b;
                jb.k kVar = nVar3.f8350i.f8352b;
                byte[] bArr3 = (byte[]) nVar3.f8344c.get(eVar);
                if (bArr3 != null) {
                    u0 u0Var = (u0) u0.f12208q.c(new ByteArrayInputStream(bArr3), kVar.f7043a.f7032p);
                    if (u0Var != null) {
                        jb.t tVar3 = kVar.f7051i;
                        jb.k kVar2 = tVar3.f7076a;
                        ta.f fVar = kVar2.f7044b;
                        f0 f0Var = kVar2.f7046d;
                        List<ra.h> list = u0Var.k;
                        i9.l.d(list, "getAnnotationList(...)");
                        ArrayList arrayList3 = new ArrayList(u8.q.a0(list, 10));
                        for (ra.h hVar : list) {
                            u0.k kVar3 = tVar3.f7077b;
                            i9.l.b(hVar);
                            arrayList3.add(kVar3.C0(hVar, fVar));
                        }
                        s sVar = new s(kVar2.f7043a.f7018a, kVar2.f7045c, arrayList3.isEmpty() ? y9.g.f15129a : new y9.i(0, arrayList3), i2.c.G(fVar, u0Var.f12212e), k9.a.r((g1) ta.d.f12863d.i(u0Var.f12211d)), u0Var, kVar2.f7044b, f0Var, kVar2.f7047e, kVar2.f7049g);
                        List list2 = u0Var.f12213f;
                        i9.l.d(list2, "getTypeParameterList(...)");
                        i3 i3Var = kVar2.a(sVar, list2, kVar2.f7044b, kVar2.f7046d, kVar2.f7047e, kVar2.f7048f).f7050h;
                        List listC = i3Var.c();
                        int i7 = u0Var.f12210c;
                        if ((i7 & 4) == 4) {
                            s0VarA = u0Var.f12214g;
                            i9.l.d(s0VarA, "getUnderlyingType(...)");
                        } else {
                            if ((i7 & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            s0VarA = f0Var.a(u0Var.f12215h);
                        }
                        nb.a0 a0VarH = i3Var.h(s0VarA, false);
                        int i10 = u0Var.f12210c;
                        if ((i10 & 16) == 16) {
                            s0VarA2 = u0Var.f12216i;
                            i9.l.d(s0VarA2, "getExpandedType(...)");
                        } else {
                            if ((i10 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            s0VarA2 = f0Var.a(u0Var.f12217j);
                        }
                        sVar.F0(listC, a0VarH, i3Var.h(s0VarA2, false));
                        return sVar;
                    }
                }
                return null;
        }
    }
}
