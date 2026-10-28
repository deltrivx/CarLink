package r9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.c f11793a = new wa.c("kotlin.jvm.JvmStatic");

    public static final r a(o9.b bVar) {
        r rVar = bVar instanceof r ? (r) bVar : null;
        if (rVar != null) {
            return rVar;
        }
        g0 g0VarB = b(bVar);
        return g0VarB != null ? g0VarB : c(bVar);
    }

    public static final g0 b(Object obj) {
        o9.b bVarE;
        g0 g0Var = obj instanceof g0 ? (g0) obj : null;
        if (g0Var != null) {
            return g0Var;
        }
        i9.j jVar = obj instanceof i9.j ? (i9.j) obj : null;
        if (jVar != null) {
            bVarE = jVar.f6671a;
            if (bVarE == null) {
                bVarE = jVar.e();
                jVar.f6671a = bVarE;
            }
        } else {
            bVarE = null;
        }
        if (bVarE instanceof g0) {
            return (g0) bVarE;
        }
        return null;
    }

    public static final l1 c(Object obj) {
        l1 l1Var = obj instanceof l1 ? (l1) obj : null;
        if (l1Var != null) {
            return l1Var;
        }
        i9.s sVar = obj instanceof i9.s ? (i9.s) obj : null;
        o9.b bVarG = sVar != null ? sVar.g() : null;
        if (bVarG instanceof l1) {
            return (l1) bVarG;
        }
        return null;
    }

    public static final ArrayList d(y9.a aVar) throws IllegalAccessException, InvocationTargetException {
        List listI;
        i9.l.e(aVar, "<this>");
        y9.h annotations = aVar.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationJ = null;
            if (!it.hasNext()) {
                break;
            }
            y9.b bVar = (y9.b) it.next();
            x9.n0 source = bVar.getSource();
            if (source instanceof ca.a) {
                annotationJ = ((ca.a) source).f2574a;
            } else if (source instanceof ca.g) {
                da.s sVar = ((ca.g) source).f2583a;
                da.e eVar = sVar instanceof da.e ? (da.e) sVar : null;
                if (eVar != null) {
                    annotationJ = eVar.f3868a;
                }
            } else {
                annotationJ = j(bVar);
            }
            if (annotationJ != null) {
                arrayList.add(annotationJ);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (g5.a.L(g5.a.G((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsL = g5.a.L(g5.a.G(annotation));
                        if (!clsL.getSimpleName().equals("Container") || clsL.getAnnotation(i9.a0.class) == null) {
                            listI = n3.l.I(annotation);
                        } else {
                            Object objInvoke = clsL.getDeclaredMethod("value", null).invoke(annotation, null);
                            i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listI = u8.l.j0((Annotation[]) objInvoke);
                        }
                        u8.u.c0(listI, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        i9.l.e(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final x9.b f(Class cls, xa.k kVar, ta.f fVar, aa.f0 f0Var, ta.a aVar, h9.n nVar) {
        List list;
        i9.l.e(cls, "moduleAnchor");
        i9.l.e(kVar, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(aVar, "metadataVersion");
        ca.f fVarA = q1.a(cls);
        if (kVar instanceof ra.a0) {
            list = ((ra.a0) kVar).f11810i;
        } else {
            if (!(kVar instanceof ra.i0)) {
                throw new IllegalStateException(("Unsupported message: " + kVar).toString());
            }
            list = ((ra.i0) kVar).f12014i;
        }
        List list2 = list;
        jb.i iVar = fVarA.f2581a;
        x9.y yVar = iVar.f7019b;
        i9.l.b(list2);
        return (x9.b) nVar.invoke(new jb.t(new jb.k(iVar, fVar, yVar, f0Var, ta.g.f12888a, aVar, null, null, list2)), kVar);
    }

    public static final aa.a0 g(x9.c cVar) {
        i9.l.e(cVar, "<this>");
        if (cVar.b0() == null) {
            return null;
        }
        x9.k kVarL = cVar.l();
        i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((x9.e) kVarL).A0();
    }

    public static final boolean h(n1 n1Var) {
        nb.w wVar = n1Var.f11727a;
        return wVar != null && za.f.h(wVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class i(ClassLoader classLoader, wa.b bVar, int i7) {
        String str = w9.d.f14177a;
        wa.b bVarF = w9.d.f(bVar.a().f14240a);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String str2 = bVar.f14236a.f14240a.f14243a;
        String str3 = bVar.f14237b.f14240a.f14243a;
        if (i9.l.a(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str2.length() > 0) {
            sb2.append(str2.concat("."));
        }
        sb2.append(zb.q.m0(str3, '.', '$'));
        if (i7 > 0) {
            sb2.append(";");
        }
        return o9.e0.T(classLoader, sb2.toString());
    }

    public static final Annotation j(y9.b bVar) {
        x9.e eVarD = db.e.d(bVar);
        Class clsK = eVarD != null ? k(eVarD) : null;
        if (clsK == null) {
            clsK = null;
        }
        if (clsK == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            wa.e eVar = (wa.e) entry.getKey();
            bb.g gVar = (bb.g) entry.getValue();
            ClassLoader classLoader = clsK.getClassLoader();
            i9.l.d(classLoader, "getClassLoader(...)");
            Object objL = l(gVar, classLoader);
            t8.j jVar = objL != null ? new t8.j(eVar.b(), objL) : null;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        Map mapZ0 = u8.b0.Z0(arrayList);
        Set setKeySet = mapZ0.keySet();
        ArrayList arrayList2 = new ArrayList(u8.q.a0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) n3.u.q(clsK, mapZ0, arrayList2);
    }

    public static final Class k(x9.e eVar) {
        i9.l.e(eVar, "<this>");
        x9.n0 source = eVar.getSource();
        i9.l.d(source, "getSource(...)");
        if (source instanceof pa.o) {
            return ((pa.o) source).f10352a.f2576a;
        }
        if (source instanceof ca.g) {
            da.s sVar = ((ca.g) source).f2583a;
            i9.l.c(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((da.o) sVar).f3881a;
        }
        wa.b bVarF = db.e.f(eVar);
        if (bVarF == null) {
            return null;
        }
        return i(da.d.d(eVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(bb.g gVar, ClassLoader classLoader) {
        nb.w wVar;
        Class clsI;
        if (gVar instanceof bb.a) {
            return j((y9.b) ((bb.a) gVar).f1683a);
        }
        int i7 = 0;
        if (gVar instanceof bb.b) {
            bb.b bVar = (bb.b) gVar;
            bb.x xVar = bVar instanceof bb.x ? (bb.x) bVar : null;
            if (xVar != null && (wVar = xVar.f1692c) != null) {
                Object obj = bVar.f1683a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(l((bb.g) it.next(), classLoader));
                }
                wa.e eVar = u9.i.f13141e;
                x9.h hVarL = wVar.D0().l();
                u9.k kVarS = hVarL == null ? null : u9.i.s(hVarL);
                switch (kVarS == null ? -1 : w1.f11790a[kVarS.ordinal()]) {
                    case -1:
                        if (!u9.i.z(wVar)) {
                            throw new IllegalStateException(("Not an array type: " + wVar).toString());
                        }
                        nb.w wVarB = ((nb.n0) u8.p.A0(wVar.B0())).b();
                        i9.l.d(wVarB, "getType(...)");
                        x9.h hVarL2 = wVarB.D0().l();
                        x9.e eVar2 = hVarL2 instanceof x9.e ? (x9.e) hVarL2 : null;
                        if (eVar2 == null) {
                            throw new IllegalStateException(("Not a class type: " + wVarB).toString());
                        }
                        if (u9.i.H(wVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i7 < size) {
                                Object obj2 = arrayList.get(i7);
                                i9.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i7] = obj2;
                                i7++;
                            }
                            return strArr;
                        }
                        if (u9.i.b(eVar2, u9.n.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i7 < size2) {
                                Object obj3 = arrayList.get(i7);
                                i9.l.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i7] = obj3;
                                i7++;
                            }
                            return clsArr;
                        }
                        wa.b bVarF = db.e.f(eVar2);
                        if (bVarF != null && (clsI = i(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsI, ((List) obj).size());
                            i9.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i7 < size3) {
                                objArr[i7] = arrayList.get(i7);
                                i7++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new cc.s();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i7 < size4) {
                            Object obj4 = arrayList.get(i7);
                            i9.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i7] = ((Boolean) obj4).booleanValue();
                            i7++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i7 < size5) {
                            Object obj5 = arrayList.get(i7);
                            i9.l.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i7] = ((Character) obj5).charValue();
                            i7++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i7 < size6) {
                            Object obj6 = arrayList.get(i7);
                            i9.l.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i7] = ((Byte) obj6).byteValue();
                            i7++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i7 < size7) {
                            Object obj7 = arrayList.get(i7);
                            i9.l.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i7] = ((Short) obj7).shortValue();
                            i7++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i7 < size8) {
                            Object obj8 = arrayList.get(i7);
                            i9.l.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i7] = ((Integer) obj8).intValue();
                            i7++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i7 < size9) {
                            Object obj9 = arrayList.get(i7);
                            i9.l.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i7] = ((Float) obj9).floatValue();
                            i7++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i7 < size10) {
                            Object obj10 = arrayList.get(i7);
                            i9.l.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i7] = ((Long) obj10).longValue();
                            i7++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i7 < size11) {
                            Object obj11 = arrayList.get(i7);
                            i9.l.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i7] = ((Double) obj11).doubleValue();
                            i7++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof bb.i) {
            t8.j jVar = (t8.j) ((bb.i) gVar).f1683a;
            wa.b bVar2 = (wa.b) jVar.f12830a;
            wa.e eVar3 = (wa.e) jVar.f12831b;
            Class clsI2 = i(classLoader, bVar2, 0);
            if (clsI2 != null) {
                return Enum.valueOf(clsI2, eVar3.b());
            }
        } else {
            if (!(gVar instanceof bb.s)) {
                if ((gVar instanceof bb.j) || (gVar instanceof bb.u)) {
                    return null;
                }
                return gVar.b();
            }
            bb.r rVar = (bb.r) ((bb.s) gVar).f1683a;
            if (rVar instanceof bb.q) {
                bb.f fVar = ((bb.q) rVar).f1691a;
                return i(classLoader, fVar.f1681a, fVar.f1682b);
            }
            if (!(rVar instanceof bb.p)) {
                throw new cc.s();
            }
            x9.h hVarL3 = ((bb.p) rVar).f1690a.D0().l();
            x9.e eVar4 = hVarL3 instanceof x9.e ? (x9.e) hVarL3 : null;
            if (eVar4 != null) {
                return k(eVar4);
            }
        }
        return null;
    }
}
