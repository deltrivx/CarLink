package s9;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12665g;

    public /* synthetic */ c(Class cls, ArrayList arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, b.f12652b, arrayList2);
    }

    public c(Class cls, ArrayList arrayList, a aVar, b bVar, List list) {
        i9.l.e(cls, "jClass");
        i9.l.e(list, "methods");
        this.f12659a = cls;
        this.f12660b = arrayList;
        this.f12661c = aVar;
        this.f12662d = list;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f12663e = arrayList2;
        List list2 = this.f12662d;
        ArrayList arrayList3 = new ArrayList(u8.q.a0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            i9.l.b(returnType);
            List list3 = da.d.f3860a;
            Class<?> cls2 = (Class) da.d.f3862c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f12664f = arrayList3;
        List list4 = this.f12662d;
        ArrayList arrayList4 = new ArrayList(u8.q.a0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f12665g = arrayList4;
        if (this.f12661c == a.f12648b && bVar == b.f12651a && !u8.p.u0(this.f12660b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // s9.g
    public final Type p() {
        return this.f12659a;
    }

    @Override // s9.g
    public final List q() {
        return this.f12663e;
    }

    @Override // s9.g
    public final /* bridge */ /* synthetic */ Member r() {
        return null;
    }

    @Override // s9.g
    public final boolean s() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    @Override // s9.g
    public final Object t(Object[] objArr) {
        String strK;
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12660b;
            if (i7 >= length) {
                return n3.u.q(this.f12659a, u8.b0.Z0(u8.p.O0(arrayList2, arrayList)), this.f12662d);
            }
            Object array = objArr[i7];
            int i11 = i10 + 1;
            ArrayList arrayList3 = this.f12664f;
            if (array == null && this.f12661c == a.f12647a) {
                array = this.f12665g.get(i10);
            } else {
                Class cls = (Class) arrayList3.get(i10);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof o9.c) {
                        array = g5.a.L((o9.c) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (objArr2 instanceof Class[]) {
                            array = null;
                        } else if (objArr2 instanceof o9.c[]) {
                            o9.c[] cVarArr = (o9.c[]) array;
                            ArrayList arrayList4 = new ArrayList(cVarArr.length);
                            for (o9.c cVar : cVarArr) {
                                arrayList4.add(g5.a.L(cVar));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr2;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i10);
                Class cls2 = (Class) arrayList3.get(i10);
                o9.c cVarB = i9.l.a(cls2, Class.class) ? i9.y.f6689a.b(o9.c.class) : (cls2.isArray() && i9.l.a(cls2.getComponentType(), Class.class)) ? i9.y.f6689a.b(o9.c[].class) : g5.a.O(cls2);
                if (i9.l.a(cVarB.k(), i9.y.f6689a.b(Object[].class).k())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cVarB.k());
                    sb2.append('<');
                    Class<?> componentType = g5.a.L(cVarB).getComponentType();
                    i9.l.d(componentType, "getComponentType(...)");
                    sb2.append(g5.a.O(componentType).k());
                    sb2.append('>');
                    strK = sb2.toString();
                } else {
                    strK = cVarB.k();
                }
                throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strK);
            }
            arrayList.add(array);
            i7++;
            i10 = i11;
        }
    }
}
