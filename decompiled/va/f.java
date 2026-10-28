package va;

import cc.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import n3.l;
import u8.a0;
import u8.c0;
import u8.n;
import u8.p;
import u8.q;
import u8.y;
import u8.z;
import ua.h;
import ua.i;
import ua.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ta.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f13714d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f13715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f13716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13717c;

    static {
        String strQ0 = p.q0(l.J('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listJ = l.J(ob.a.B(strQ0, "/Any"), ob.a.B(strQ0, "/Nothing"), ob.a.B(strQ0, "/Unit"), ob.a.B(strQ0, "/Throwable"), ob.a.B(strQ0, "/Number"), ob.a.B(strQ0, "/Byte"), ob.a.B(strQ0, "/Double"), ob.a.B(strQ0, "/Float"), ob.a.B(strQ0, "/Int"), ob.a.B(strQ0, "/Long"), ob.a.B(strQ0, "/Short"), ob.a.B(strQ0, "/Boolean"), ob.a.B(strQ0, "/Char"), ob.a.B(strQ0, "/CharSequence"), ob.a.B(strQ0, "/String"), ob.a.B(strQ0, "/Comparable"), ob.a.B(strQ0, "/Enum"), ob.a.B(strQ0, "/Array"), ob.a.B(strQ0, "/ByteArray"), ob.a.B(strQ0, "/DoubleArray"), ob.a.B(strQ0, "/FloatArray"), ob.a.B(strQ0, "/IntArray"), ob.a.B(strQ0, "/LongArray"), ob.a.B(strQ0, "/ShortArray"), ob.a.B(strQ0, "/BooleanArray"), ob.a.B(strQ0, "/CharArray"), ob.a.B(strQ0, "/Cloneable"), ob.a.B(strQ0, "/Annotation"), ob.a.B(strQ0, "/collections/Iterable"), ob.a.B(strQ0, "/collections/MutableIterable"), ob.a.B(strQ0, "/collections/Collection"), ob.a.B(strQ0, "/collections/MutableCollection"), ob.a.B(strQ0, "/collections/List"), ob.a.B(strQ0, "/collections/MutableList"), ob.a.B(strQ0, "/collections/Set"), ob.a.B(strQ0, "/collections/MutableSet"), ob.a.B(strQ0, "/collections/Map"), ob.a.B(strQ0, "/collections/MutableMap"), ob.a.B(strQ0, "/collections/Map.Entry"), ob.a.B(strQ0, "/collections/MutableMap.MutableEntry"), ob.a.B(strQ0, "/collections/Iterator"), ob.a.B(strQ0, "/collections/MutableIterator"), ob.a.B(strQ0, "/collections/ListIterator"), ob.a.B(strQ0, "/collections/MutableListIterator"));
        f13714d = listJ;
        n nVarN0 = p.N0(listJ);
        int iS0 = c0.S0(q.a0(nVarN0, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
        Iterator it = nVarN0.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f13099b.hasNext()) {
                return;
            }
            z zVar = (z) a0Var.next();
            linkedHashMap.put((String) zVar.f13126b, Integer.valueOf(zVar.f13125a));
        }
    }

    public f(j jVar, String[] strArr) {
        i9.l.e(strArr, "strings");
        List list = jVar.f13296c;
        Set setM0 = list.isEmpty() ? y.f13124a : p.M0(list);
        List<i> list2 = jVar.f13295b;
        i9.l.d(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (i iVar : list2) {
            int i7 = iVar.f13283c;
            for (int i10 = 0; i10 < i7; i10++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f13715a = strArr;
        this.f13716b = setM0;
        this.f13717c = arrayList;
    }

    @Override // ta.f
    public final String I(int i7) {
        return getString(i7);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // ta.f
    public final String getString(int i7) {
        String strM0;
        i iVar = (i) this.f13717c.get(i7);
        int i10 = iVar.f13282b;
        if ((i10 & 4) == 4) {
            Object obj = iVar.f13285e;
            if (obj instanceof String) {
                strM0 = (String) obj;
            } else {
                xa.d dVar = (xa.d) obj;
                String strV = dVar.v();
                if (dVar.p()) {
                    iVar.f13285e = strV;
                }
                strM0 = strV;
            }
        } else if ((i10 & 2) == 2) {
            List list = f13714d;
            int size = list.size();
            int i11 = iVar.f13284d;
            if (i11 < 0 || i11 >= size) {
                strM0 = this.f13715a[i7];
            } else {
                strM0 = (String) list.get(i11);
            }
        } else {
            strM0 = this.f13715a[i7];
        }
        if (iVar.f13287g.size() >= 2) {
            List list2 = iVar.f13287g;
            i9.l.b(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strM0.length()) {
                strM0 = strM0.substring(num.intValue(), num2.intValue());
                i9.l.d(strM0, "substring(...)");
            }
        }
        if (iVar.f13289i.size() >= 2) {
            List list3 = iVar.f13289i;
            i9.l.b(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            i9.l.b(strM0);
            strM0 = zb.q.m0(strM0, (char) num3.intValue(), (char) num4.intValue());
        }
        h hVar = iVar.f13286f;
        if (hVar == null) {
            hVar = h.NONE;
        }
        int iOrdinal = hVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i9.l.b(strM0);
                strM0 = zb.q.m0(strM0, '$', '.');
            } else {
                if (iOrdinal != 2) {
                    throw new s();
                }
                if (strM0.length() >= 2) {
                    strM0 = strM0.substring(1, strM0.length() - 1);
                    i9.l.d(strM0, "substring(...)");
                }
                strM0 = zb.q.m0(strM0, '$', '.');
            }
        }
        i9.l.b(strM0);
        return strM0;
    }

    @Override // ta.f
    public final boolean p0(int i7) {
        return this.f13716b.contains(Integer.valueOf(i7));
    }
}
