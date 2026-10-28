package va;

import aa.f0;
import i9.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n3.r;
import ra.a0;
import ra.a1;
import ra.e0;
import ra.i0;
import ra.n;
import ra.s0;
import t8.j;
import u8.p;
import u8.q;
import ua.k;
import xa.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa.g f13718a;

    static {
        xa.g gVar = new xa.g();
        gVar.a(k.f13300a);
        gVar.a(k.f13301b);
        gVar.a(k.f13302c);
        gVar.a(k.f13303d);
        gVar.a(k.f13304e);
        gVar.a(k.f13305f);
        gVar.a(k.f13306g);
        gVar.a(k.f13307h);
        gVar.a(k.f13308i);
        gVar.a(k.f13309j);
        gVar.a(k.k);
        gVar.a(k.f13310l);
        gVar.a(k.f13311m);
        gVar.a(k.f13312n);
        f13718a = gVar;
    }

    public static e a(n nVar, ta.f fVar, f0 f0Var) throws IOException {
        String strQ0;
        l.e(nVar, "proto");
        l.e(fVar, "nameResolver");
        l.e(f0Var, "typeTable");
        m mVar = k.f13300a;
        l.d(mVar, "constructorSignature");
        ua.c cVar = (ua.c) n3.n.n0(nVar, mVar);
        String string = (cVar == null || (cVar.f13243b & 1) != 1) ? "<init>" : fVar.getString(cVar.f13244c);
        if (cVar == null || (cVar.f13243b & 2) != 2) {
            List<a1> list = nVar.f12098e;
            l.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(q.a0(list, 10));
            for (a1 a1Var : list) {
                l.b(a1Var);
                String strE = e(r.c0(a1Var, f0Var), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strQ0 = p.q0(arrayList, "", "(", ")V", null, 56);
        } else {
            strQ0 = fVar.getString(cVar.f13245d);
        }
        return new e(string, strQ0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static va.d b(ra.i0 r4, ta.f r5, aa.f0 r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            i9.l.e(r4, r0)
            java.lang.String r0 = "nameResolver"
            i9.l.e(r5, r0)
            java.lang.String r0 = "typeTable"
            i9.l.e(r6, r0)
            xa.m r0 = ua.k.f13303d
            java.lang.String r1 = "propertySignature"
            i9.l.d(r0, r1)
            java.lang.Object r0 = n3.n.n0(r4, r0)
            ua.e r0 = (ua.e) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f13256b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            ua.b r0 = r0.f13257c
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f13235b
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f13236c
            goto L3b
        L39:
            int r7 = r4.f12011f
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f13235b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f13237d
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            ra.s0 r4 = n3.r.S(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            va.d r6 = new va.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: va.g.b(ra.i0, ta.f, aa.f0, boolean):va.d");
    }

    public static e c(a0 a0Var, ta.f fVar, f0 f0Var) {
        String strS;
        l.e(a0Var, "proto");
        l.e(fVar, "nameResolver");
        l.e(f0Var, "typeTable");
        m mVar = k.f13301b;
        l.d(mVar, "methodSignature");
        ua.c cVar = (ua.c) n3.n.n0(a0Var, mVar);
        int i7 = (cVar == null || (cVar.f13243b & 1) != 1) ? a0Var.f11807f : cVar.f13244c;
        if (cVar == null || (cVar.f13243b & 2) != 2) {
            List listK = n3.l.K(r.M(a0Var, f0Var));
            List<a1> list = a0Var.f11815o;
            l.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(q.a0(list, 10));
            for (a1 a1Var : list) {
                l.b(a1Var);
                arrayList.add(r.c0(a1Var, f0Var));
            }
            ArrayList arrayListX0 = p.x0(arrayList, listK);
            ArrayList arrayList2 = new ArrayList(q.a0(arrayListX0, 10));
            Iterator it = arrayListX0.iterator();
            while (it.hasNext()) {
                String strE = e((s0) it.next(), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(r.R(a0Var, f0Var), fVar);
            if (strE2 == null) {
                return null;
            }
            strS = ob.a.s(new StringBuilder(), p.q0(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strS = fVar.getString(cVar.f13245d);
        }
        return new e(fVar.getString(i7), strS);
    }

    public static final boolean d(i0 i0Var) {
        l.e(i0Var, "proto");
        ta.b bVar = c.f13709a;
        Object objI = i0Var.i(k.f13304e);
        l.d(objI, "getExtension(...)");
        return bVar.i(((Number) objI).intValue()).booleanValue();
    }

    public static String e(s0 s0Var, ta.f fVar) {
        if ((s0Var.f12169c & 16) == 16) {
            return b.b(fVar.I(s0Var.f12175i));
        }
        return null;
    }

    public static final j f(String[] strArr, String[] strArr2) throws xa.q {
        l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        ra.a aVar = ra.k.L;
        aVar.getClass();
        xa.e eVar = new xa.e(byteArrayInputStream);
        xa.a aVar2 = (xa.a) aVar.a(eVar, f13718a);
        try {
            eVar.a(0);
            xa.b.b(aVar2);
            return new j(fVarG, (ra.k) aVar2);
        } catch (xa.q e7) {
            e7.f14823a = aVar2;
            throw e7;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        ua.j jVar = (ua.j) ua.j.f13293h.c(byteArrayInputStream, f13718a);
        l.d(jVar, "parseDelimitedFrom(...)");
        return new f(jVar, strArr);
    }

    public static final j h(String[] strArr, String[] strArr2) throws xa.q {
        l.e(strArr, "data");
        l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        ra.a aVar = e0.f11905l;
        aVar.getClass();
        xa.e eVar = new xa.e(byteArrayInputStream);
        xa.a aVar2 = (xa.a) aVar.a(eVar, f13718a);
        try {
            eVar.a(0);
            xa.b.b(aVar2);
            return new j(fVarG, (e0) aVar2);
        } catch (xa.q e7) {
            e7.f14823a = aVar2;
            throw e7;
        }
    }
}
