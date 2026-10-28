package u8;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends u {
    public static Object A0(List list) {
        i9.l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object B0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object C0(List list) {
        i9.l.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List D0(List list, n9.d dVar) {
        i9.l.e(list, "<this>");
        i9.l.e(dVar, "indices");
        return dVar.isEmpty() ? w.f13122a : J0(list.subList(dVar.f8965a, dVar.f8966b + 1));
    }

    public static List E0(Iterable iterable, Comparator comparator) {
        ArrayList arrayListK0;
        i9.l.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        if (z10) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return J0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            l.I0(array, comparator);
            return l.j0(array);
        }
        if (z10) {
            arrayListK0 = K0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            H0(iterable, arrayList);
            arrayListK0 = arrayList;
        }
        t.b0(arrayListK0, comparator);
        return arrayListK0;
    }

    public static List F0(int i7, List list) {
        i9.l.e(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested element count ", " is less than zero.", i7).toString());
        }
        if (i7 == 0) {
            return w.f13122a;
        }
        if (i7 >= list.size()) {
            return J0(list);
        }
        if (i7 == 1) {
            return n3.l.I(j0(list));
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i7) {
                break;
            }
        }
        return n3.l.M(arrayList);
    }

    public static List G0(int i7, List list) {
        i9.l.e(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Requested element count ", " is less than zero.", i7).toString());
        }
        if (i7 == 0) {
            return w.f13122a;
        }
        int size = list.size();
        if (i7 >= size) {
            return J0(list);
        }
        if (i7 == 1) {
            return n3.l.I(s0(list));
        }
        ArrayList arrayList = new ArrayList(i7);
        if (list instanceof RandomAccess) {
            for (int i10 = size - i7; i10 < size; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i7);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void H0(Iterable iterable, AbstractCollection abstractCollection) {
        i9.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] I0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List J0(Iterable iterable) {
        ArrayList arrayListK0;
        i9.l.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        if (!z10) {
            if (z10) {
                arrayListK0 = K0((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                H0(iterable, arrayList);
                arrayListK0 = arrayList;
            }
            return n3.l.M(arrayListK0);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.f13122a;
        }
        if (size != 1) {
            return K0(collection);
        }
        return n3.l.I(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList K0(Collection collection) {
        i9.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set L0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set M0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return n3.r.W(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(c0.S0(collection.size()));
                H0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            H0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : n3.r.W(linkedHashSet2.iterator().next());
            }
        }
        return y.f13124a;
    }

    public static n N0(List list) {
        i9.l.e(list, "<this>");
        return new n(1, new a5.e(28, list));
    }

    public static ArrayList O0(List list, List list2) {
        i9.l.e(list, "<this>");
        i9.l.e(list2, "other");
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q.a0(list, 10), q.a0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new t8.j(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int d0(int i7, List list) {
        if (i7 >= 0 && i7 <= n3.l.A(list)) {
            return n3.l.A(list) - i7;
        }
        StringBuilder sbT = ob.a.t("Element index ", " must be in range [", i7);
        sbT.append(new n9.d(0, n3.l.A(list), 1));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static final int e0(int i7, List list) {
        if (i7 >= 0 && i7 <= list.size()) {
            return list.size() - i7;
        }
        StringBuilder sbT = ob.a.t("Position index ", " must be in range [", i7);
        sbT.append(new n9.d(0, list.size(), 1));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static o f0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        return new o(1, iterable);
    }

    public static boolean g0(Iterable iterable, Object obj) {
        int iIndexOf;
        i9.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i7 = 0;
            for (Object obj2 : iterable) {
                if (i7 < 0) {
                    n3.l.Y();
                    throw null;
                }
                if (i9.l.a(obj, obj2)) {
                    iIndexOf = i7;
                } else {
                    i7++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List h0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return w.f13122a;
        }
        if (size == 1) {
            return n3.l.I(r0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i7 = 1; i7 < size2; i7++) {
                arrayList.add(list.get(i7));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List i0(List list) {
        i9.l.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return F0(size, list);
    }

    public static Object j0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return k0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object k0(List list) {
        i9.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object l0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object m0(List list) {
        i9.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object n0(int i7, List list) {
        i9.l.e(list, "<this>");
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static final void o0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, h9.k kVar) throws IOException {
        i9.l.e(iterable, "<this>");
        i9.l.e(appendable, "buffer");
        i9.l.e(charSequence2, "prefix");
        i9.l.e(charSequence3, "postfix");
        appendable.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                appendable.append(charSequence);
            }
            n3.r.c(appendable, obj, kVar);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void p0(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, h9.k kVar, int i7) throws IOException {
        if ((i7 & 4) != 0) {
            str2 = "";
        }
        if ((i7 & 8) != 0) {
            str3 = "";
        }
        if ((i7 & 64) != 0) {
            kVar = null;
        }
        o0(iterable, sb2, str, str2, str3, "...", kVar);
    }

    public static String q0(Iterable iterable, String str, String str2, String str3, h9.k kVar, int i7) throws IOException {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            kVar = null;
        }
        i9.l.e(iterable, "<this>");
        i9.l.e(str5, "prefix");
        StringBuilder sb2 = new StringBuilder();
        o0(iterable, sb2, str4, str5, str6, "...", kVar);
        return sb2.toString();
    }

    public static Object r0(Iterable iterable) {
        if (iterable instanceof List) {
            return s0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object s0(List list) {
        i9.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(n3.l.A(list));
    }

    public static Object t0(List list) {
        i9.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList u0(Iterable iterable, Object obj) {
        i9.l.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q.a0(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && i9.l.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList v0(Iterable iterable, Iterable iterable2) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return x0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        u.c0(iterable, arrayList);
        u.c0(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList w0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return y0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        u.c0(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList x0(Iterable iterable, Collection collection) {
        i9.l.e(collection, "<this>");
        i9.l.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u.c0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList y0(Collection collection, Object obj) {
        i9.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object z0(Iterable iterable) {
        i9.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }
}
