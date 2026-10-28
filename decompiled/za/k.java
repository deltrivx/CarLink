package za;

import aa.a0;
import aa.p0;
import aa.r0;
import aa.s0;
import aa.y0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import gb.o;
import hc.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import nb.f0;
import nb.h0;
import nb.w;
import u8.p;
import x9.k0;
import x9.n0;
import x9.q0;
import x9.t;
import x9.v;
import x9.x;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f15802a = new s(3, "ResolutionAnchorProvider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f15803b = new s(3, "StdlibClassFinder");

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 12 || i7 == 23 || i7 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 12 || i7 == 23 || i7 == 25) ? 2 : 3];
        switch (i7) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[0] = "enumClass";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 12) {
            objArr[1] = "createSetter";
        } else if (i7 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i7 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i7) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 12 && i7 != 23 && i7 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(x9.e eVar, LinkedHashSet linkedHashSet, o oVar, boolean z10) {
        for (x9.k kVar : g5.a.I(oVar, gb.f.f6175o, 2)) {
            if (kVar instanceof x9.e) {
                x9.e eVarC0 = (x9.e) kVar;
                if (eVarC0.G()) {
                    wa.e name = eVarC0.getName();
                    i9.l.d(name, "getName(...)");
                    x9.h hVarA = oVar.a(name, fa.b.f5505d);
                    eVarC0 = hVarA instanceof x9.e ? (x9.e) hVarA : hVarA instanceof q0 ? ((lb.s) ((q0) hVarA)).C0() : null;
                }
                if (eVarC0 != null) {
                    int i7 = d.f15791a;
                    Iterator it = eVarC0.t().m().iterator();
                    while (it.hasNext()) {
                        if (d.p((w) it.next(), eVar.a())) {
                            linkedHashSet.add(eVarC0);
                            break;
                        }
                    }
                    if (z10) {
                        o oVarN0 = eVarC0.n0();
                        i9.l.d(oVarN0, "getUnsubstitutedInnerClassesScope(...)");
                        c(eVar, linkedHashSet, oVarN0, z10);
                    }
                }
            }
        }
    }

    public static a0 e(x9.b bVar, w wVar, wa.e eVar, y9.h hVar, int i7) {
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (wVar == null) {
            return null;
        }
        hb.a aVar = new hb.a(bVar, wVar, eVar);
        zb.i iVar = wa.f.f14249a;
        return new a0(bVar, aVar, hVar, wa.e.e(wa.f.f14250b + '_' + i7));
    }

    public static aa.q0 f(k0 k0Var, y9.h hVar) {
        return l(k0Var, hVar, true, k0Var.getSource());
    }

    public static r0 g(k0 k0Var, y9.h hVar) {
        n0 source = k0Var.getSource();
        if (source != null) {
            return m(k0Var, hVar, y9.g.f15129a, true, k0Var.d(), source);
        }
        a(6);
        throw null;
    }

    public static p0 h(aa.c cVar) {
        if (cVar == null) {
            a(26);
            throw null;
        }
        y yVarD = d.d(cVar);
        i9.l.e(yVarD, "<this>");
        x9.e eVarD = v.d(yVarD, wa.h.f14279w);
        if (eVarD == null) {
            return null;
        }
        ga.o oVar = x9.o.f14721e;
        wa.e eVar = u9.o.f13198b;
        n0 source = cVar.getSource();
        x xVar = x.f14747b;
        p0 p0VarD0 = p0.D0(cVar, xVar, oVar, false, eVar, 4, source);
        aa.q0 q0Var = new aa.q0(p0VarD0, y9.g.f15129a, xVar, oVar, false, false, false, 4, null, cVar.getSource());
        p0VarD0.G0(q0Var, null, null, null);
        h0.f8997b.getClass();
        h0 h0Var = h0.f8998c;
        nb.k0 k0VarT = eVarD.t();
        List listSingletonList = Collections.singletonList(new f0(cVar.n()));
        i9.l.e(h0Var, "attributes");
        i9.l.e(k0VarT, "constructor");
        i9.l.e(listSingletonList, "arguments");
        nb.a0 a0VarT = nb.c.t(listSingletonList, h0Var, k0VarT, false);
        List list = Collections.EMPTY_LIST;
        p0VarD0.J0(a0VarT, list, null, null, list);
        q0Var.F0(p0VarD0.p());
        return p0VarD0;
    }

    public static s0 i(aa.c cVar) {
        if (cVar == null) {
            a(24);
            throw null;
        }
        s0 s0VarN0 = s0.N0(cVar, u9.o.f13199c, 4, cVar.getSource());
        y0 y0Var = new y0(s0VarN0, null, 0, y9.g.f15129a, wa.e.e("value"), db.e.e(cVar).v(), false, false, false, null, cVar.getSource());
        List list = Collections.EMPTY_LIST;
        return s0VarN0.H0(null, null, list, list, Collections.singletonList(y0Var), cVar.n(), x.f14747b, x9.o.f14721e);
    }

    public static s0 j(aa.c cVar) {
        if (cVar == null) {
            a(22);
            throw null;
        }
        s0 s0VarN0 = s0.N0(cVar, u9.o.f13197a, 4, cVar.getSource());
        List list = Collections.EMPTY_LIST;
        return s0VarN0.H0(null, null, list, list, list, db.e.e(cVar).h(cVar.n()), x.f14747b, x9.o.f14721e);
    }

    public static a0 k(x9.b bVar, w wVar, y9.h hVar) {
        if (wVar == null) {
            return null;
        }
        return new a0(bVar, new hb.b(bVar, wVar), hVar);
    }

    public static aa.q0 l(k0 k0Var, y9.h hVar, boolean z10, n0 n0Var) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (n0Var != null) {
            return new aa.q0(k0Var, hVar, k0Var.i(), k0Var.d(), z10, false, false, 1, null, n0Var);
        }
        a(19);
        throw null;
    }

    public static r0 m(k0 k0Var, y9.h hVar, y9.h hVar2, boolean z10, ga.o oVar, n0 n0Var) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (oVar == null) {
            a(10);
            throw null;
        }
        if (n0Var == null) {
            a(11);
            throw null;
        }
        r0 r0Var = new r0(k0Var, hVar, k0Var.i(), oVar, z10, false, false, 1, null, n0Var);
        r0Var.f429m = r0.E0(r0Var, k0Var.getType(), hVar2);
        return r0Var;
    }

    public static boolean n(t tVar) {
        if (tVar.f() != 4) {
            return false;
        }
        x9.k kVarL = tVar.l();
        int i7 = d.f15791a;
        return d.n(kVarL, x9.f.f14703c);
    }

    public static final Collection o(Collection collection, h9.k kVar) {
        i9.l.e(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i7 = wb.i.f14296c;
        wb.i iVarE = wb.l.e();
        while (!linkedList.isEmpty()) {
            Object objK0 = p.k0(linkedList);
            int i10 = wb.i.f14296c;
            wb.i iVarE2 = wb.l.e();
            ArrayList arrayListG = j.g(objK0, linkedList, kVar, new aa.a(29, iVarE2));
            if (arrayListG.size() == 1 && iVarE2.isEmpty()) {
                Object objZ0 = p.z0(arrayListG);
                i9.l.d(objZ0, "single(...)");
                iVarE.add(objZ0);
            } else {
                Object objS = j.s(arrayListG, kVar);
                x9.b bVar = (x9.b) kVar.invoke(objS);
                for (Object obj : arrayListG) {
                    i9.l.b(obj);
                    if (!j.k(bVar, (x9.b) kVar.invoke(obj))) {
                        iVarE2.add(obj);
                    }
                }
                if (!iVarE2.isEmpty()) {
                    iVarE.addAll(iVarE2);
                }
                iVarE.add(objS);
            }
        }
        return iVarE;
    }

    public abstract void b(x9.c cVar);

    public abstract void d(x9.c cVar, x9.c cVar2);

    public void p(x9.c cVar, Collection collection) {
        i9.l.e(cVar, "member");
        cVar.m0(collection);
    }
}
