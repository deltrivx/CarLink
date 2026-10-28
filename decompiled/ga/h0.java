package ga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f6082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f6083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f6085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f6086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f6087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f6088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f6089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f6090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f6091j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM0 = u8.l.M0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(u8.q.a0(setM0, 10));
        for (String str : setM0) {
            String strC = eb.c.BOOLEAN.c();
            i9.l.d(strC, "getDesc(...)");
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f6082a = arrayList;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((d0) it.next()).f6065e);
        }
        f6083b = arrayList2;
        ArrayList arrayList3 = f6082a;
        ArrayList arrayList4 = new ArrayList(u8.q.a0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((d0) it2.next()).f6062b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        eb.c cVar = eb.c.BOOLEAN;
        String strC2 = cVar.c();
        i9.l.d(strC2, "getDesc(...)");
        d0 d0VarA = l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        g0 g0Var = g0.f6077d;
        t8.j jVar = new t8.j(d0VarA, g0Var);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = cVar.c();
        i9.l.d(strC3, "getDesc(...)");
        t8.j jVar2 = new t8.j(l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), g0Var);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = cVar.c();
        i9.l.d(strC4, "getDesc(...)");
        t8.j jVar3 = new t8.j(l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), g0Var);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = cVar.c();
        i9.l.d(strC5, "getDesc(...)");
        t8.j jVar4 = new t8.j(l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), g0Var);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = cVar.c();
        i9.l.d(strC6, "getDesc(...)");
        t8.j jVar5 = new t8.j(l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), g0Var);
        t8.j jVar6 = new t8.j(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), g0.f6078e);
        d0 d0VarA2 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        g0 g0Var2 = g0.f6075b;
        t8.j jVar7 = new t8.j(d0VarA2, g0Var2);
        t8.j jVar8 = new t8.j(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), g0Var2);
        String strConcat6 = "java/util/".concat("List");
        eb.c cVar2 = eb.c.INT;
        String strC7 = cVar2.c();
        i9.l.d(strC7, "getDesc(...)");
        d0 d0VarA3 = l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        g0 g0Var3 = g0.f6076c;
        t8.j jVar9 = new t8.j(d0VarA3, g0Var3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = cVar2.c();
        i9.l.d(strC8, "getDesc(...)");
        Map mapW0 = u8.b0.W0(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, new t8.j(l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), g0Var3));
        f6084c = mapW0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u8.c0.S0(mapW0.size()));
        for (Map.Entry entry : mapW0.entrySet()) {
            linkedHashMap.put(((d0) entry.getKey()).f6065e, entry.getValue());
        }
        f6085d = linkedHashMap;
        LinkedHashSet linkedHashSetG0 = u8.f0.g0(f6084c.keySet(), f6082a);
        ArrayList arrayList5 = new ArrayList(u8.q.a0(linkedHashSetG0, 10));
        Iterator it3 = linkedHashSetG0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((d0) it3.next()).f6062b);
        }
        f6086e = u8.p.M0(arrayList5);
        ArrayList arrayList6 = new ArrayList(u8.q.a0(linkedHashSetG0, 10));
        Iterator it4 = linkedHashSetG0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((d0) it4.next()).f6065e);
        }
        f6087f = u8.p.M0(arrayList6);
        eb.c cVar3 = eb.c.INT;
        String strC9 = cVar3.c();
        i9.l.d(strC9, "getDesc(...)");
        d0 d0VarA4 = l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f6088g = d0VarA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = eb.c.BYTE.c();
        i9.l.d(strC10, "getDesc(...)");
        t8.j jVar10 = new t8.j(l.a(strConcat8, "toByte", "", strC10), wa.e.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = eb.c.SHORT.c();
        i9.l.d(strC11, "getDesc(...)");
        t8.j jVar11 = new t8.j(l.a(strConcat9, "toShort", "", strC11), wa.e.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = cVar3.c();
        i9.l.d(strC12, "getDesc(...)");
        t8.j jVar12 = new t8.j(l.a(strConcat10, "toInt", "", strC12), wa.e.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = eb.c.LONG.c();
        i9.l.d(strC13, "getDesc(...)");
        t8.j jVar13 = new t8.j(l.a(strConcat11, "toLong", "", strC13), wa.e.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = eb.c.FLOAT.c();
        i9.l.d(strC14, "getDesc(...)");
        t8.j jVar14 = new t8.j(l.a(strConcat12, "toFloat", "", strC14), wa.e.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = eb.c.DOUBLE.c();
        i9.l.d(strC15, "getDesc(...)");
        t8.j jVar15 = new t8.j(l.a(strConcat13, "toDouble", "", strC15), wa.e.e("doubleValue"));
        t8.j jVar16 = new t8.j(d0VarA4, wa.e.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = cVar3.c();
        i9.l.d(strC16, "getDesc(...)");
        String strC17 = eb.c.CHAR.c();
        i9.l.d(strC17, "getDesc(...)");
        Map mapW1 = u8.b0.W0(jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, new t8.j(l.a(strConcat14, "get", strC16, strC17), wa.e.e("charAt")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), wa.e.e("getAndAdd")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), wa.e.e("addAndGet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), wa.e.e("getAndAdd")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), wa.e.e("addAndGet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), wa.e.e("compareAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), wa.e.e("getAndAdd")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), wa.e.e("addAndGet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), wa.e.e("compareAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), wa.e.e("getAndAdd")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), wa.e.e("addAndGet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), wa.e.e("get")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), wa.e.e("set")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), wa.e.e("getAndSet")), new t8.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), wa.e.e("compareAndSet")));
        f6089h = mapW1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u8.c0.S0(mapW1.size()));
        for (Map.Entry entry2 : mapW1.entrySet()) {
            linkedHashMap2.put(((d0) entry2.getKey()).f6065e, entry2.getValue());
        }
        f6090i = linkedHashMap2;
        ?? r8 = f6089h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r8.entrySet()) {
            d0 d0Var = (d0) entry3.getKey();
            wa.e eVar = (wa.e) entry3.getValue();
            String str2 = d0Var.f6061a;
            String str3 = d0Var.f6063c;
            String str4 = d0Var.f6064d;
            i9.l.e(str2, "classInternalName");
            i9.l.e(eVar, "name");
            String str5 = eVar + '(' + str3 + ')' + str4;
            i9.l.e(str5, "jvmDescriptor");
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set setKeySet = f6089h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((d0) it5.next()).f6062b);
        }
        f6091j = hashSet;
        Set<Map.Entry> setEntrySet = f6089h.entrySet();
        ArrayList<t8.j> arrayList7 = new ArrayList(u8.q.a0(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new t8.j(((d0) entry4.getKey()).f6062b, entry4.getValue()));
        }
        int iS0 = u8.c0.S0(u8.q.a0(arrayList7, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS0 >= 16 ? iS0 : 16);
        for (t8.j jVar17 : arrayList7) {
            linkedHashMap3.put((wa.e) jVar17.f12831b, (wa.e) jVar17.f12830a);
        }
        k = linkedHashMap3;
    }
}
