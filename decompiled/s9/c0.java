package s9;

import aa.y0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.r0;
import nb.x0;
import r9.x1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Member f12668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.b f12669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n9.d[] f12670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12671f;

    /* JADX WARN: Code duplicated, block: B:136:0x0296  */
    /* JADX WARN: Code duplicated, block: B:175:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[LOOP:1: B:23:0x006c->B:25:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    public c0(g gVar, x9.c cVar, boolean z10) {
        Class clsK0;
        Method declaredMethod;
        boolean z11;
        a2.b bVar;
        List listT0;
        List list;
        ArrayList arrayList;
        Iterator it;
        i9.l.e(cVar, "descriptor");
        this.f12666a = z10;
        boolean z12 = false;
        if (gVar instanceof t) {
            aa.a0 a0VarE0 = cVar.e0();
            a0VarE0 = a0VarE0 == null ? cVar.b0() : a0VarE0;
            nb.w type = a0VarE0 != null ? a0VarE0.getType() : null;
            if (type != null && za.f.h(type)) {
                if (z10) {
                    List listX = cVar.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    if (!listX.isEmpty()) {
                        Iterator it2 = listX.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((y0) it2.next()).D0()) {
                                    ArrayList arrayListT0 = n3.n.t0(nb.c.b(type));
                                    i9.l.b(arrayListT0);
                                    arrayList = new ArrayList(u8.q.a0(arrayListT0, 10));
                                    it = arrayListT0.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((t) gVar).f12689h, null));
                                    }
                                    gVar = new u((Method) ((q) gVar).f12692a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListT1 = n3.n.t0(nb.c.b(type));
                    i9.l.b(arrayListT1);
                    arrayList = new ArrayList(u8.q.a0(arrayListT1, 10));
                    it = arrayListT1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((t) gVar).f12689h, null));
                    }
                    gVar = new u((Method) ((q) gVar).f12692a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f12667b = gVar;
        this.f12668c = gVar.r();
        nb.w wVarP = cVar.p();
        i9.l.b(wVarP);
        boolean z13 = cVar instanceof x9.t;
        if (z13 && ((x9.t) cVar).o()) {
            nb.a0 a0VarI = za.f.i(wVarP);
            nb.w wVarI = a0VarI != null ? r0.d(wVarP).i(a0VarI, x0.INVARIANT) : null;
            if (wVarI == null || !u9.i.G(wVarI)) {
                clsK0 = n3.n.K0(wVarP);
                if (clsK0 != null) {
                    declaredMethod = clsK0.getDeclaredMethod("box-impl", n3.n.p0(clsK0, cVar).getReturnType());
                    i9.l.b(declaredMethod);
                } else {
                    declaredMethod = null;
                }
            } else {
                declaredMethod = null;
            }
        } else {
            clsK0 = n3.n.K0(wVarP);
            if (clsK0 != null) {
                try {
                    declaredMethod = clsK0.getDeclaredMethod("box-impl", n3.n.p0(clsK0, cVar).getReturnType());
                    i9.l.b(declaredMethod);
                } catch (NoSuchMethodException unused) {
                    throw new cc.a0(2, "No box method found in inline class: " + clsK0 + " (calling " + cVar + ')');
                }
            } else {
                declaredMethod = null;
            }
        }
        if (za.f.a(cVar)) {
            bVar = new a2.b(n9.d.f8972d, new List[0], declaredMethod);
        } else {
            int i7 = -1;
            if ((!(gVar instanceof t) || ((t) gVar).f12688g) && !(gVar instanceof u)) {
                if (cVar instanceof x9.j) {
                    if (!(gVar instanceof f)) {
                        i7 = 0;
                    }
                } else if (cVar.b0() == null || (gVar instanceof f)) {
                    i7 = 0;
                } else {
                    x9.k kVarL = cVar.l();
                    i9.l.d(kVarL, "getContainingDeclaration(...)");
                    if (za.f.f(kVarL)) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                }
            }
            int i10 = gVar instanceof u ? -((u) gVar).f12690g.length : i7;
            Member memberR = gVar.r();
            ArrayList arrayList2 = new ArrayList();
            aa.a0 a0VarE1 = cVar.e0();
            nb.w type2 = a0VarE1 != null ? a0VarE1.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (cVar instanceof x9.j) {
                x9.e eVarY = ((x9.j) cVar).y();
                i9.l.d(eVarY, "getConstructedClass(...)");
                if (eVarY.H()) {
                    x9.k kVarL2 = eVarY.l();
                    i9.l.c(kVarL2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((x9.e) kVarL2).n());
                }
            } else {
                x9.k kVarL3 = cVar.l();
                i9.l.d(kVarL3, "getContainingDeclaration(...)");
                if (kVarL3 instanceof x9.e) {
                    x9.e eVar = (x9.e) kVarL3;
                    if (za.f.f(eVar)) {
                        if (memberR == null) {
                            z11 = false;
                        } else {
                            Class<?> declaringClass = memberR.getDeclaringClass();
                            if (declaringClass == null ? false : !g5.a.O(declaringClass).j()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            nb.a0 a0VarN = eVar.n();
                            i9.l.d(a0VarN, "getDefaultType(...)");
                            arrayList2.add(n3.n.E0(a0VarN));
                        } else {
                            arrayList2.add(eVar.n());
                        }
                    }
                }
            }
            List listX2 = cVar.X();
            i9.l.d(listX2, "getValueParameters(...)");
            Iterator it3 = listX2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((y0) it3.next()).getType());
            }
            Iterator it4 = arrayList2.iterator();
            int size = 0;
            while (it4.hasNext()) {
                ArrayList arrayListT2 = n3.n.t0(nb.c.b((nb.w) it4.next()));
                size += arrayListT2 != null ? arrayListT2.size() : 1;
            }
            int i11 = size + i10 + (this.f12666a ? ((size + 31) / 32) + 1 : 0) + ((z13 && ((x9.t) cVar).o()) ? 1 : 0);
            boolean z14 = this.f12666a;
            if (n3.l.w(this) != i11) {
                throw new cc.a0(2, "Inconsistent number of parameters in the descriptor and Java reflection object: " + n3.l.w(this) + " != " + i11 + "\nCalling: " + cVar + "\nParameter types: " + this.f12667b.q() + ")\nDefault: " + z14);
            }
            n9.d dVarE0 = n3.r.e0(Math.max(i7, 0), arrayList2.size() + i7);
            List[] listArr = new List[i11];
            int i12 = 0;
            while (i12 < i11) {
                if (i12 <= dVarE0.f8966b && dVarE0.f8965a <= i12) {
                    nb.a0 a0VarB = nb.c.b((nb.w) arrayList2.get(i12 - i7));
                    listT0 = n3.n.t0(a0VarB);
                    if (listT0 == null) {
                        Class clsK1 = n3.n.K0(a0VarB);
                        if (clsK1 != null) {
                            listT0 = n3.l.I(n3.n.p0(clsK1, cVar));
                        } else {
                            listT0 = null;
                        }
                    }
                } else {
                    listT0 = null;
                }
                listArr[i12] = listT0;
                i12++;
            }
            bVar = new a2.b(dVarE0, listArr, declaredMethod);
        }
        this.f12669d = bVar;
        v8.b bVar2 = new v8.b(10);
        g gVar2 = this.f12667b;
        int length = gVar2 instanceof u ? ((u) gVar2).f12690g.length : gVar2 instanceof t ? 1 : 0;
        if (length > 0) {
            bVar2.add(n3.r.e0(0, length));
        }
        List[] listArr2 = (List[]) bVar.f13c;
        int length2 = listArr2.length;
        int i13 = 0;
        while (i13 < length2) {
            List list2 = listArr2[i13];
            int size2 = (list2 != null ? list2.size() : 1) + length;
            bVar2.add(n3.r.e0(length, size2));
            i13++;
            length = size2;
        }
        this.f12670e = (n9.d[]) n3.l.n(bVar2).toArray(new n9.d[0]);
        Iterable iterable = (n9.d) this.f12669d.f12b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it5 = iterable.iterator();
            do {
                n9.c cVar2 = (n9.c) it5;
                if (cVar2.f8970c) {
                    list = ((List[]) this.f12669d.f13c)[cVar2.nextInt()];
                }
            } while (!(list != null && list.size() > 1));
            z12 = true;
        }
        this.f12671f = z12;
    }

    public final n9.d a(int i7) {
        n9.d[] dVarArr = this.f12670e;
        if (i7 >= 0 && i7 < dVarArr.length) {
            return dVarArr[i7];
        }
        if (dVarArr.length == 0) {
            return new n9.d(i7, i7, 1);
        }
        int length = ((n9.d) u8.l.G0(dVarArr)).f8966b + 1 + (i7 - dVarArr.length);
        return new n9.d(length, length, 1);
    }

    @Override // s9.g
    public final Type p() {
        return this.f12667b.p();
    }

    @Override // s9.g
    public final List q() {
        return this.f12667b.q();
    }

    @Override // s9.g
    public final Member r() {
        return this.f12668c;
    }

    @Override // s9.g
    public final boolean s() {
        return this.f12667b instanceof r;
    }

    @Override // s9.g
    public final Object t(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        i9.l.e(objArr, "args");
        a2.b bVar = this.f12669d;
        n9.d dVar = (n9.d) bVar.f12b;
        List[] listArr = (List[]) bVar.f13c;
        Method method = (Method) bVar.f14d;
        boolean zIsEmpty = dVar.isEmpty();
        int i7 = dVar.f8966b;
        int i10 = dVar.f8965a;
        if (!zIsEmpty) {
            if (this.f12671f) {
                v8.b bVar2 = new v8.b(objArr.length);
                for (int i11 = 0; i11 < i10; i11++) {
                    bVar2.add(objArr[i11]);
                }
                if (i10 <= i7) {
                    while (true) {
                        List<Method> list = listArr[i10];
                        Object obj = objArr[i10];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    i9.l.d(returnType, "getReturnType(...)");
                                    objE2 = x1.e(returnType);
                                }
                                bVar2.add(objE2);
                            }
                        } else {
                            bVar2.add(obj);
                        }
                        if (i10 == i7) {
                            break;
                        }
                        i10++;
                    }
                }
                int i12 = i7 + 1;
                int length = objArr.length - 1;
                if (i12 <= length) {
                    while (true) {
                        bVar2.add(objArr[i12]);
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                    }
                }
                objArr = n3.l.n(bVar2).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    if (i13 > i7 || i10 > i13) {
                        objE = objArr[i13];
                    } else {
                        List list2 = listArr[i13];
                        Method method3 = list2 != null ? (Method) u8.p.A0(list2) : null;
                        objE = objArr[i13];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                i9.l.d(returnType2, "getReturnType(...)");
                                objE = x1.e(returnType2);
                            }
                        }
                    }
                    objArr2[i13] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objT = this.f12667b.t(objArr);
        return (objT == z8.a.f15774a || method == null || (objInvoke = method.invoke(null, objT)) == null) ? objT : objInvoke;
    }
}
