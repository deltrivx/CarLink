package gb;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f6164c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f6166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f6167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f6168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f6169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f6170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f6171j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f6172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f6173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f6174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f6175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f6176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f6177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f6178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayList f6179s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6181b;

    static {
        e eVar;
        int i7 = f6165d;
        int i10 = i7 << 1;
        f6166e = i7;
        int i11 = i7 << 2;
        f6167f = i10;
        int i12 = i7 << 3;
        f6168g = i11;
        int i13 = i7 << 4;
        f6169h = i12;
        int i14 = i7 << 5;
        f6170i = i13;
        f6171j = i14;
        f6165d = i7 << 7;
        int i15 = (i7 << 6) - 1;
        k = i15;
        int i16 = i7 | i10 | i11;
        f6172l = i16;
        f6173m = new f(i15);
        f6174n = new f(i13 | i14);
        new f(i7);
        new f(i10);
        new f(i11);
        f6175o = new f(i16);
        new f(i12);
        f6176p = new f(i13);
        f6177q = new f(i14);
        new f(i10 | i13 | i14);
        Field[] fields = f.class.getFields();
        i9.l.d(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i17 = fVar.f6181b;
                String name = field2.getName();
                i9.l.d(name, "getName(...)");
                eVar2 = new e(i17, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f6178r = arrayList2;
        Field[] fields2 = f.class.getFields();
        i9.l.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (i9.l.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            i9.l.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                i9.l.d(name2, "getName(...)");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f6179s = arrayList5;
    }

    public /* synthetic */ f(int i7) {
        this(i7, w.f13122a);
    }

    public f(int i7, List list) {
        i9.l.e(list, "excludes");
        this.f6180a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i7 &= ~((d) it.next()).a();
        }
        this.f6181b = i7;
    }

    public final boolean a(int i7) {
        return (i7 & this.f6181b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i9.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return i9.l.a(this.f6180a, fVar.f6180a) && this.f6181b == fVar.f6181b;
    }

    public final int hashCode() {
        return (this.f6180a.hashCode() * 31) + this.f6181b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f6178r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).f6162a != this.f6181b);
        e eVar = (e) next;
        String strQ0 = eVar != null ? eVar.f6163b : null;
        if (strQ0 == null) {
            ArrayList arrayList = new ArrayList();
            for (e eVar2 : f6179s) {
                String str = a(eVar2.f6162a) ? eVar2.f6163b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strQ0 = u8.p.q0(arrayList, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + strQ0 + ", " + this.f6180a + ')';
    }
}
