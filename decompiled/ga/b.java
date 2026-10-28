package ga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f6043c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f6044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6045b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String str = aVar.f6040a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, aVar);
            }
        }
        f6043c = linkedHashMap;
    }

    public b(u uVar) {
        i9.l.e(uVar, "javaTypeEnhancementState");
        this.f6044a = uVar;
        this.f6045b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z10) {
        y9.b bVar = (y9.b) obj;
        i9.l.e(bVar, "<this>");
        Map mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            u8.u.c0((!z10 || i9.l.a((wa.e) entry.getKey(), y.f6127b)) ? j((bb.g) entry.getValue()) : u8.w.f13122a, arrayList);
        }
        return arrayList;
    }

    public static Object c(Object obj, wa.c cVar) {
        for (Object obj2 : e(obj)) {
            if (i9.l.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static wa.c d(Object obj) {
        y9.b bVar = (y9.b) obj;
        i9.l.e(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        y9.h annotations;
        y9.b bVar = (y9.b) obj;
        i9.l.e(bVar, "<this>");
        x9.e eVarD = db.e.d(bVar);
        return (eVarD == null || (annotations = eVarD.getAnnotations()) == null) ? u8.w.f13122a : annotations;
    }

    public static boolean f(Object obj, wa.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (i9.l.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(bb.g gVar) {
        if (!(gVar instanceof bb.b)) {
            return gVar instanceof bb.i ? n3.l.I(((bb.i) gVar).f1685c.c()) : u8.w.f13122a;
        }
        Iterable iterable = (Iterable) ((bb.b) gVar).f1683a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u8.u.c0(j((bb.g) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x018d  */
    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [oa.h] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    public final v b(v vVar, y9.h hVar) {
        m mVar;
        c0 c0VarH;
        m mVar2;
        Object objC;
        Object next;
        t8.j jVar;
        boolean z10;
        boolean z11;
        ?? mVar3;
        int i7;
        oa.i iVarA;
        i9.l.e(hVar, "annotations");
        u uVar = this.f6044a;
        if (!uVar.f6118b) {
            ArrayList<m> arrayList = new ArrayList();
            for (Object obj : hVar) {
                boolean z12 = uVar.f6118b;
                c0 c0Var = c0.IGNORE;
                c0 c0Var2 = c0.WARN;
                if (z12 || (mVar = (m) n.f6100c.get(d(obj))) == null) {
                    mVar2 = null;
                } else {
                    wa.c cVarD = d(obj);
                    if (cVarD == null || !n.f6098a.containsKey(cVarD)) {
                        c0VarH = h(obj);
                        if (c0VarH == null) {
                            c0VarH = uVar.f6117a.f6120a;
                        }
                    } else {
                        c0VarH = (c0) t.f6115i.invoke(cVarD);
                    }
                    if (c0VarH == c0Var) {
                        c0VarH = null;
                    }
                    if (c0VarH == null) {
                        mVar2 = null;
                    } else {
                        oa.i iVarA2 = oa.i.a(mVar.f6095a, null, c0VarH == c0Var2, 1);
                        Collection collection = mVar.f6096b;
                        boolean z13 = mVar.f6097c;
                        i9.l.e(collection, "qualifierApplicabilityTypes");
                        mVar2 = new m(iVarA2, collection, z13);
                    }
                }
                if (mVar2 != null) {
                    mVar3 = mVar2;
                } else {
                    if (uVar.f6117a.f6123d || (objC = c(obj, z.f6147f)) == null) {
                        jVar = null;
                    } else {
                        Iterator it = e(obj).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (i(next) == null);
                        if (next == null) {
                            jVar = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = arrayListA.iterator();
                            while (it2.hasNext()) {
                                a aVar = (a) f6043c.get((String) it2.next());
                                if (aVar != null) {
                                    linkedHashSet.add(aVar);
                                }
                            }
                            if (linkedHashSet.contains(a.TYPE_USE)) {
                                Set setM0 = u8.l.M0(a.values());
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet(u8.c0.S0(setM0.size()));
                                boolean z14 = false;
                                for (Object obj2 : setM0) {
                                    if (z14 || !i9.l.a(obj2, a.TYPE_PARAMETER_BOUNDS)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                        z14 = true;
                                    }
                                    if (z10) {
                                        linkedHashSet2.add(obj2);
                                    }
                                }
                                linkedHashSet = u8.f0.g0(linkedHashSet2, linkedHashSet);
                            }
                            jVar = new t8.j(next, linkedHashSet);
                        }
                    }
                    if (jVar == null) {
                        mVar3 = 0;
                    } else {
                        Object obj3 = jVar.f12830a;
                        Set set = (Set) jVar.f12831b;
                        c0 c0VarH2 = h(obj);
                        if (c0VarH2 == null && (c0VarH2 = h(obj3)) == null) {
                            c0VarH2 = uVar.f6117a.f6120a;
                        }
                        if (c0VarH2 == c0Var) {
                            mVar3 = 0;
                        } else {
                            i9.l.e(obj3, "$this$extractNullability");
                            oa.i iVarG = g(obj3, false);
                            if (iVarG != null) {
                                iVarA = iVarG;
                            } else {
                                Object objI = i(obj3);
                                if (objI != null) {
                                    c0 c0VarH3 = h(obj3);
                                    if (c0VarH3 == null) {
                                        c0VarH3 = uVar.f6117a.f6120a;
                                    }
                                    if (c0VarH3 != c0Var) {
                                        z11 = false;
                                        oa.i iVarG2 = g(objI, false);
                                        if (iVarG2 != null) {
                                            mVar3 = 0;
                                            i7 = 1;
                                            iVarA = oa.i.a(iVarG2, null, c0VarH3 == c0Var2, 1);
                                        } else {
                                            mVar3 = 0;
                                            i7 = 1;
                                            iVarA = null;
                                        }
                                    }
                                    if (iVarA != null) {
                                        if (c0VarH2 == c0Var2) {
                                            z11 = true;
                                        }
                                        mVar3 = new m(oa.i.a(iVarA, mVar3, z11, i7), set);
                                    }
                                }
                                iVarA = null;
                            }
                            z11 = false;
                            mVar3 = 0;
                            i7 = 1;
                            if (iVarA != null) {
                                if (c0VarH2 == c0Var2) {
                                    z11 = true;
                                }
                                mVar3 = new m(oa.i.a(iVarA, mVar3, z11, i7), set);
                            }
                        }
                    }
                }
                if (mVar3 != 0) {
                    arrayList.add(mVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(a.class);
                for (m mVar4 : arrayList) {
                    for (a aVar2 : mVar4.f6096b) {
                        enumMap.containsKey(aVar2);
                        enumMap.put(aVar2, mVar4);
                    }
                }
                EnumMap enumMap2 = vVar != null ? new EnumMap(vVar.f6119a) : new EnumMap(a.class);
                boolean z15 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    a aVar3 = (a) entry.getKey();
                    m mVar5 = (m) entry.getValue();
                    if (mVar5 != null) {
                        enumMap2.put(aVar3, mVar5);
                        z15 = true;
                    }
                }
                if (z15) {
                    return new v(enumMap2);
                }
            }
        }
        return vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r9.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r9.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.i g(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            wa.c r0 = d(r9)
            r1 = 0
            if (r0 != 0) goto L9
            goto L90
        L9:
            ga.u r2 = r8.f6044a
            r2.getClass()
            ga.t r2 = ga.t.f6115i
            java.lang.Object r2 = r2.invoke(r0)
            ga.c0 r2 = (ga.c0) r2
            r2.getClass()
            ga.c0 r3 = ga.c0.IGNORE
            if (r2 != r3) goto L1e
            return r1
        L1e:
            java.util.Set r3 = ga.z.k
            boolean r3 = r3.contains(r0)
            oa.h r4 = oa.h.f9593c
            r5 = 0
            if (r3 == 0) goto L2a
            goto L82
        L2a:
            java.util.Set r3 = ga.z.f6152l
            boolean r3 = r3.contains(r0)
            oa.h r6 = oa.h.f9592b
            if (r3 == 0) goto L36
        L34:
            r4 = r6
            goto L82
        L36:
            java.util.Set r3 = ga.z.f6153m
            boolean r3 = r3.contains(r0)
            oa.h r7 = oa.h.f9591a
            if (r3 == 0) goto L42
        L40:
            r4 = r7
            goto L82
        L42:
            wa.c r3 = ga.z.f6148g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L90
            java.util.ArrayList r9 = a(r9, r5)
            java.lang.Object r9 = u8.p.l0(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L82
            int r0 = r9.hashCode()
            switch(r0) {
                case 73135176: goto L79;
                case 74175084: goto L70;
                case 433141802: goto L67;
                case 1933739535: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L90
        L5e:
            java.lang.String r0 = "ALWAYS"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L90
            goto L82
        L67:
            java.lang.String r0 = "UNKNOWN"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L40
            goto L90
        L70:
            java.lang.String r0 = "NEVER"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L34
            goto L90
        L79:
            java.lang.String r0 = "MAYBE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L34
            goto L90
        L82:
            oa.i r9 = new oa.i
            ga.c0 r0 = ga.c0.WARN
            if (r2 != r0) goto L89
            goto L8b
        L89:
            if (r10 == 0) goto L8c
        L8b:
            r5 = 1
        L8c:
            r9.<init>(r4, r5)
            return r9
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.b.g(java.lang.Object, boolean):oa.i");
    }

    public final c0 h(Object obj) {
        String str;
        u uVar = this.f6044a;
        c0 c0Var = (c0) uVar.f6117a.f6122c.get(d(obj));
        if (c0Var != null) {
            return c0Var;
        }
        Object objC = c(obj, z.f6156p);
        if (objC == null || (str = (String) u8.p.l0(a(objC, false))) == null) {
            return null;
        }
        c0 c0Var2 = uVar.f6117a.f6121b;
        if (c0Var2 != null) {
            return c0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return c0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return c0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return c0.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        i9.l.e(obj, "annotation");
        if (!this.f6044a.f6117a.f6123d) {
            if (u8.p.g0(z.f6151j, d(obj)) || f(obj, z.f6145d)) {
                return obj;
            }
            if (f(obj, z.f6146e)) {
                x9.e eVarD = db.e.d((y9.b) obj);
                i9.l.b(eVarD);
                ConcurrentHashMap concurrentHashMap = this.f6045b;
                Object obj2 = concurrentHashMap.get(eVarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(eVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
