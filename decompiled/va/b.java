package va;

import java.util.LinkedHashMap;
import java.util.List;
import n3.l;
import u8.p;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13707a = p.q0(l.J('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f13708b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listJ = l.J("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iJ = i2.c.J(0, listJ.size() - 1, 2);
        if (iJ >= 0) {
            int i7 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f13707a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listJ.get(i7));
                int i10 = i7 + 1;
                linkedHashMap.put(sb2.toString(), listJ.get(i10));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(ob.a.s(sb3, (String) listJ.get(i7), "Array"), "[" + ((String) listJ.get(i10)));
                if (i7 == iJ) {
                    break;
                } else {
                    i7 += 2;
                }
            }
        }
        linkedHashMap.put(f13707a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : l.J("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : l.J("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, ob.a.q("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i11 = 0; i11 < 23; i11++) {
            String strE = a2.f.E(i11, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f13707a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i11);
            a(linkedHashMap, strE, sb4.toString());
            a(linkedHashMap, "reflect/KFunction" + i11, str4 + "/reflect/KFunction");
        }
        for (String str5 : l.J("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, ob.a.B(str5, ".Companion"), f13707a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f13708b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f13707a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        i9.l.e(str, "classId");
        String str2 = (String) f13708b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + q.m0(str, '.', '$') + ';';
    }
}
