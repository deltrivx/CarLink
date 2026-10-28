package r9;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class t implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f11763b;

    public /* synthetic */ t(w wVar, int i7) {
        this.f11762a = i7;
        this.f11763b = wVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11762a) {
            case 0:
                w wVar = this.f11763b;
                r1 r1Var = wVar.f11783f;
                o9.u[] uVarArr = w.f11779l;
                o9.u uVar = uVarArr[9];
                Object objInvoke = r1Var.invoke();
                i9.l.d(objInvoke, "getValue(...)");
                r1 r1Var2 = wVar.f11785h;
                o9.u uVar2 = uVarArr[11];
                Object objInvoke2 = r1Var2.invoke();
                i9.l.d(objInvoke2, "getValue(...)");
                return u8.p.x0((Collection) objInvoke2, (Collection) objInvoke);
            case 1:
                w wVar2 = this.f11763b;
                r1 r1Var3 = wVar2.f11784g;
                o9.u[] uVarArr2 = w.f11779l;
                o9.u uVar3 = uVarArr2[10];
                Object objInvoke3 = r1Var3.invoke();
                i9.l.d(objInvoke3, "getValue(...)");
                r1 r1Var4 = wVar2.f11786i;
                o9.u uVar4 = uVarArr2[12];
                Object objInvoke4 = r1Var4.invoke();
                i9.l.d(objInvoke4, "getValue(...)");
                return u8.p.x0((Collection) objInvoke4, (Collection) objInvoke3);
            case 2:
                w wVar3 = this.f11763b;
                r1 r1Var5 = wVar3.f11783f;
                o9.u[] uVarArr3 = w.f11779l;
                o9.u uVar5 = uVarArr3[9];
                Object objInvoke5 = r1Var5.invoke();
                i9.l.d(objInvoke5, "getValue(...)");
                r1 r1Var6 = wVar3.f11784g;
                o9.u uVar6 = uVarArr3[10];
                Object objInvoke6 = r1Var6.invoke();
                i9.l.d(objInvoke6, "getValue(...)");
                return u8.p.x0((Collection) objInvoke6, (Collection) objInvoke5);
            case 3:
                w wVar4 = this.f11763b;
                r1 r1Var7 = wVar4.f11787j;
                o9.u[] uVarArr4 = w.f11779l;
                o9.u uVar7 = uVarArr4[13];
                Object objInvoke7 = r1Var7.invoke();
                i9.l.d(objInvoke7, "getValue(...)");
                r1 r1Var8 = wVar4.k;
                o9.u uVar8 = uVarArr4[14];
                Object objInvoke8 = r1Var8.invoke();
                i9.l.d(objInvoke8, "getValue(...)");
                return u8.p.x0((Collection) objInvoke8, (Collection) objInvoke7);
            case 4:
                return x1.d(this.f11763b.a());
            case 5:
                Collection collectionI = g5.a.I(this.f11763b.a().n0(), null, 3);
                ArrayList<x9.k> arrayList = new ArrayList();
                for (Object obj : collectionI) {
                    if (!za.d.m((x9.k) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (x9.k kVar : arrayList) {
                    x9.e eVar = kVar instanceof x9.e ? (x9.e) kVar : null;
                    Class clsK = eVar != null ? x1.k(eVar) : null;
                    a0 a0Var = clsK != null ? new a0(clsK) : null;
                    if (a0Var != null) {
                        arrayList2.add(a0Var);
                    }
                }
                return arrayList2;
            default:
                Collection<x9.e> collectionE = this.f11763b.a().E();
                i9.l.d(collectionE, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (x9.e eVar2 : collectionE) {
                    i9.l.c(eVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK2 = x1.k(eVar2);
                    a0 a0Var2 = clsK2 != null ? new a0(clsK2) : null;
                    if (a0Var2 != null) {
                        arrayList3.add(a0Var2);
                    }
                }
                return arrayList3;
        }
    }
}
