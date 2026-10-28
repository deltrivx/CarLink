package s9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import r9.e0;
import r9.x1;
import x9.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f12654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f12655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12658e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public b0(x9.t tVar, e0 e0Var, String str, List list) {
        ?? I;
        i9.l.e(e0Var, "container");
        i9.l.e(str, "constructorDesc");
        Method methodD = e0Var.d("constructor-impl", str);
        i9.l.b(methodD);
        this.f12654a = methodD;
        Method methodD2 = e0Var.d("box-impl", zb.j.I0(str, "V") + da.d.b(e0Var.a()));
        i9.l.b(methodD2);
        this.f12655b = methodD2;
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List listI = null;
            if (!it.hasNext()) {
                break;
            }
            nb.w type = ((i0) it.next()).getType();
            i9.l.d(type, "getType(...)");
            nb.a0 a0VarB = nb.c.b(type);
            ArrayList arrayListT0 = n3.n.t0(a0VarB);
            if (arrayListT0 == null) {
                Class clsK0 = n3.n.K0(a0VarB);
                if (clsK0 != null) {
                    listI = n3.l.I(n3.n.p0(clsK0, tVar));
                }
            } else {
                listI = arrayListT0;
            }
            arrayList.add(listI);
        }
        this.f12656c = arrayList;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                n3.l.Y();
                throw null;
            }
            x9.h hVarL = ((i0) obj).getType().D0().l();
            i9.l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            x9.e eVar = (x9.e) hVarL;
            List list2 = (List) this.f12656c.get(i7);
            if (list2 != null) {
                I = new ArrayList(u8.q.a0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    I.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsK = x1.k(eVar);
                i9.l.b(clsK);
                I = n3.l.I(clsK);
            }
            arrayList2.add(I);
            i7 = i10;
        }
        this.f12657d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            u8.u.c0((Iterable) it3.next(), arrayList3);
        }
        this.f12658e = arrayList3;
    }

    @Override // s9.g
    public final Type p() {
        Class<?> returnType = this.f12655b.getReturnType();
        i9.l.d(returnType, "getReturnType(...)");
        return returnType;
    }

    @Override // s9.g
    public final List q() {
        return this.f12658e;
    }

    @Override // s9.g
    public final /* bridge */ /* synthetic */ Member r() {
        return null;
    }

    @Override // s9.g
    public final boolean s() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // s9.g
    public final Object t(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        ?? I;
        i9.l.e(objArr, "args");
        ArrayList arrayList = this.f12656c;
        i9.l.e(arrayList, "other");
        int length = objArr.length;
        ArrayList<t8.j> arrayList2 = new ArrayList(Math.min(u8.q.a0(arrayList, 10), length));
        int i7 = 0;
        for (Object obj : arrayList) {
            if (i7 >= length) {
                break;
            }
            arrayList2.add(new t8.j(objArr[i7], obj));
            i7++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (t8.j jVar : arrayList2) {
            Object obj2 = jVar.f12830a;
            List list = (List) jVar.f12831b;
            if (list != null) {
                I = new ArrayList(u8.q.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    I.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                I = n3.l.I(obj2);
            }
            u8.u.c0(I, arrayList3);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.f12654a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f12655b.invoke(null, Arrays.copyOf(array, array.length));
    }
}
