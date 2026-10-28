package tb;

import aa.y0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.a0;
import nb.w0;
import x9.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f12897b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f12898c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f12899d = new h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f12900e = new h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f12901f = new h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f12902g = new h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f12903h = new h(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f12904i = new h(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f12905j = new h(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12906a;

    public /* synthetic */ h(int i7) {
        this.f12906a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.k
    public final Object invoke(Object obj) throws IOException {
        a0 a0VarN;
        w0 w0VarI0;
        nb.w wVarP;
        wa.b bVarF;
        nb.w wVarP2;
        boolean zB;
        boolean z10 = true;
        switch (this.f12906a) {
            case 0:
                i9.l.e((x9.t) obj, "<this>");
                return null;
            case 1:
                i9.l.e((x9.t) obj, "<this>");
                return null;
            case 2:
                i9.l.e((x9.t) obj, "<this>");
                return null;
            case 3:
                x9.t tVar = (x9.t) obj;
                List list = r.f12925d;
                i9.l.e(tVar, "$this$Checks");
                List listX = tVar.X();
                i9.l.d(listX, "getValueParameters(...)");
                y0 y0Var = (y0) u8.p.t0(listX);
                if (y0Var == null || db.e.a(y0Var) || y0Var.f475j != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                x9.t tVar2 = (x9.t) obj;
                List list2 = r.f12925d;
                i9.l.e(tVar2, "$this$Checks");
                x9.k kVarL = tVar2.l();
                i9.l.d(kVarL, "getContainingDeclaration(...)");
                if (kVarL instanceof x9.e) {
                    wa.e eVar = u9.i.f13141e;
                    if (u9.i.b((x9.e) kVarL, u9.n.f13166a)) {
                        return null;
                    }
                }
                Collection collectionM = tVar2.m();
                i9.l.d(collectionM, "getOverriddenDescriptors(...)");
                Collection collection = collectionM;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        x9.k kVarL2 = ((x9.t) it.next()).l();
                        i9.l.d(kVarL2, "getContainingDeclaration(...)");
                        if (kVarL2 instanceof x9.e) {
                            wa.e eVar2 = u9.i.f13141e;
                            if (u9.i.b((x9.e) kVarL2, u9.n.f13166a)) {
                                return null;
                            }
                        }
                    }
                }
                x9.k kVarL3 = tVar2.l();
                x9.e eVar3 = kVarL3 instanceof x9.e ? (x9.e) kVarL3 : null;
                if (eVar3 != null) {
                    if (!za.f.f(eVar3)) {
                        eVar3 = null;
                    }
                    if (eVar3 != null && (a0VarN = eVar3.n()) != null && (w0VarI0 = n3.n.I0(a0VarN)) != null && (wVarP = tVar2.p()) != null && i9.l.a(((aa.q) tVar2).getName(), s.f12929d)) {
                        wa.e eVar4 = u9.i.f13141e;
                        if ((u9.i.C(wVarP, u9.n.f13179h) || u9.i.F(wVarP)) && tVar2.X().size() == 1) {
                            nb.w type = ((y0) tVar2.X().get(0)).getType();
                            i9.l.d(type, "getType(...)");
                            if (i9.l.a(n3.n.I0(type), w0VarI0) && tVar2.i0().isEmpty() && tVar2.e0() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                x9.k kVarL4 = tVar2.l();
                i9.l.d(kVarL4, "getContainingDeclaration(...)");
                if (za.f.f(kVarL4)) {
                    ya.g gVar = ya.g.f15194d;
                    x9.k kVarL5 = tVar2.l();
                    i9.l.c(kVarL5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    a0 a0VarN2 = ((x9.e) kVarL5).n();
                    i9.l.d(a0VarN2, "getDefaultType(...)");
                    sb2.append(" or define ''equals(other: " + gVar.V(n3.n.I0(a0VarN2)) + "): Boolean''");
                }
                return sb2.toString();
            case 5:
                x9.t tVar3 = (x9.t) obj;
                List list3 = r.f12925d;
                i9.l.e(tVar3, "$this$Checks");
                aa.a0 a0VarB0 = tVar3.b0();
                if (a0VarB0 == null) {
                    a0VarB0 = tVar3.e0();
                }
                if (a0VarB0 == null) {
                    z10 = false;
                } else {
                    nb.w wVarP3 = tVar3.p();
                    if (!(wVarP3 != null ? ob.e.f9637a.b(wVarP3, a0VarB0.getType()) : false)) {
                        hb.d dVarC0 = a0VarB0.C0();
                        i9.l.d(dVarC0, "getValue(...)");
                        if (dVarC0 instanceof hb.c) {
                            x9.e eVar5 = ((hb.c) dVarC0).f6494a;
                            if (eVar5.G() && (bVarF = db.e.f(eVar5)) != null) {
                                x9.h hVarE = x9.v.e(db.e.j(eVar5), bVarF);
                                q0 q0Var = hVarE instanceof q0 ? (q0) hVarE : null;
                                if (q0Var == null || (wVarP2 = tVar3.p()) == null) {
                                    zB = false;
                                } else {
                                    zB = ob.e.f9637a.b(wVarP2, ((lb.s) q0Var).D0());
                                }
                            } else {
                                zB = false;
                            }
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                u9.i iVar = (u9.i) obj;
                t tVar4 = t.f12945c;
                i9.l.e(iVar, "<this>");
                return iVar.t(u9.k.BOOLEAN);
            case 7:
                u9.i iVar2 = (u9.i) obj;
                u uVar = u.f12946c;
                i9.l.e(iVar2, "<this>");
                return iVar2.t(u9.k.INT);
            default:
                u9.i iVar3 = (u9.i) obj;
                v vVar = v.f12947c;
                i9.l.e(iVar3, "<this>");
                return iVar3.x();
        }
    }
}
