package r9;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f11771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f11772c;

    public /* synthetic */ v(w wVar, a0 a0Var, int i7) {
        this.f11770a = i7;
        this.f11771b = wVar;
        this.f11772c = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    @Override // h9.a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        int i7 = this.f11770a;
        a0 a0Var = this.f11772c;
        w wVar = this.f11771b;
        switch (i7) {
            case 0:
                Class cls = a0Var.f11648b;
                x9.e eVarA = wVar.a();
                if (eVarA.f() != x9.f.f14706f) {
                    return null;
                }
                if (eVarA.u()) {
                    LinkedHashSet linkedHashSet = u9.d.f13133a;
                    if (n3.u.D(eVarA)) {
                        declaredField = cls.getDeclaredField("INSTANCE");
                    } else {
                        declaredField = cls.getEnclosingClass().getDeclaredField(eVarA.getName().b());
                    }
                } else {
                    declaredField = cls.getDeclaredField("INSTANCE");
                }
                Object obj = declaredField.get(null);
                i9.l.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj;
            case 1:
                List<x9.r0> listQ = wVar.a().q();
                i9.l.d(listQ, "getDeclaredTypeParameters(...)");
                ArrayList arrayList = new ArrayList(u8.q.a0(listQ, 10));
                for (x9.r0 r0Var : listQ) {
                    i9.l.b(r0Var);
                    arrayList.add(new o1(a0Var, r0Var));
                }
                return arrayList;
            default:
                Collection<nb.w> collectionM = wVar.a().t().m();
                i9.l.d(collectionM, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(collectionM.size());
                for (nb.w wVar2 : collectionM) {
                    i9.l.b(wVar2);
                    arrayList2.add(new n1(wVar2, new aa.i(wVar2, wVar, a0Var, 2)));
                }
                x9.e eVarA2 = wVar.a();
                wa.e eVar = u9.i.f13141e;
                if (!u9.i.b(eVarA2, u9.n.f13166a) && !u9.i.b(eVarA2, u9.n.f13167b)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(new n1(db.e.e(wVar.a()).e(), u.f11766a));
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            x9.f fVarF = za.d.c(((n1) it.next()).f11727a).f();
                            i9.l.d(fVarF, "getKind(...)");
                            if (fVarF == x9.f.f14702b || fVarF == x9.f.f14705e) {
                            }
                        }
                        arrayList2.add(new n1(db.e.e(wVar.a()).e(), u.f11766a));
                    }
                }
                return wb.l.d(arrayList2);
        }
    }
}
