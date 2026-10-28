package b3;

import a8.y0;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p.i3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements u, pa.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f1431f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1436e;

    public r(Activity activity) {
        this.f1432a = new ArrayList();
        this.f1433b = activity;
    }

    public r(Activity activity, ArrayList arrayList, e6.f fVar, n4.e eVar, n4.e eVar2, o6.a aVar) {
        this.f1433b = activity;
        this.f1432a = arrayList;
        this.f1434c = fVar;
        this.f1435d = eVar2;
        this.f1436e = aVar;
    }

    public r(Layout layout) {
        this.f1433b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iZ0 = zb.j.z0(((Layout) this.f1433b).getText(), '\n', length, 4);
            length = iZ0 < 0 ? ((Layout) this.f1433b).getText().length() : iZ0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f1433b).getText().length());
        this.f1432a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(null);
        }
        this.f1434c = arrayList2;
        this.f1435d = new boolean[((ArrayList) this.f1432a).size()];
        ((ArrayList) this.f1432a).size();
    }

    public r(h hVar, r0 r0Var, List list, n3.c cVar, f3.d dVar) {
        String strSubstring;
        h hVar2 = hVar;
        r0 r0Var2 = r0Var;
        this.f1433b = hVar2;
        this.f1434c = list;
        final int i7 = 0;
        h9.a aVar = new h9.a(this) { // from class: b3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f1427b;

            {
                this.f1427b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f1427b.f1432a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f1449a.c();
                            int iA = n3.l.A(arrayList);
                            int i10 = 1;
                            if (1 <= iA) {
                                while (true) {
                                    Object obj4 = arrayList.get(i10);
                                    float fC2 = ((t) obj4).f1449a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i10 != iA) {
                                        i10++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf(tVar != null ? tVar.f1449a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f1427b.f1432a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC3 = ((t) obj5).f1449a.f6931i.c();
                            int iA2 = n3.l.A(arrayList2);
                            int i11 = 1;
                            if (1 <= iA2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i11);
                                    float fC4 = ((t) obj6).f1449a.f6931i.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj5 = obj6;
                                        fC3 = fC4;
                                    }
                                    if (i11 != iA2) {
                                        i11++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf(tVar2 != null ? tVar2.f1449a.f6931i.c() : 0.0f);
                }
            }
        };
        t8.i iVar = t8.i.f12828b;
        this.f1435d = t8.a.c(iVar, aVar);
        final int i10 = 1;
        this.f1436e = t8.a.c(iVar, new h9.a(this) { // from class: b3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f1427b;

            {
                this.f1427b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f1427b.f1432a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f1449a.c();
                            int iA = n3.l.A(arrayList);
                            int i11 = 1;
                            if (1 <= iA) {
                                while (true) {
                                    Object obj4 = arrayList.get(i11);
                                    float fC2 = ((t) obj4).f1449a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i11 != iA) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf(tVar != null ? tVar.f1449a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f1427b.f1432a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC3 = ((t) obj5).f1449a.f6931i.c();
                            int iA2 = n3.l.A(arrayList2);
                            int i12 = 1;
                            if (1 <= iA2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i12);
                                    float fC4 = ((t) obj6).f1449a.f6931i.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj5 = obj6;
                                        fC3 = fC4;
                                    }
                                    if (i12 != iA2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf(tVar2 != null ? tVar2.f1449a.f6931i.c() : 0.0f);
                }
            }
        });
        v vVar = r0Var2.f1439b;
        h hVar3 = i.f1371a;
        ArrayList arrayList = hVar2.f1355d;
        String str = hVar2.f1353b;
        u8.w wVar = u8.w.f13122a;
        List listE0 = arrayList != null ? u8.p.E0(arrayList, new g(i10)) : wVar;
        ArrayList arrayList2 = new ArrayList();
        u8.k kVar = new u8.k();
        int size = listE0.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            f fVar = (f) listE0.get(i11);
            v vVarA = vVar.a((v) fVar.f1324a);
            int i13 = fVar.f1325b;
            int i14 = fVar.f1326c;
            if (i13 > i14) {
                h3.a.a("Reversed range is not supported");
            }
            while (i12 < i13 && !kVar.isEmpty()) {
                f fVar2 = (f) kVar.last();
                listE0 = listE0;
                int i15 = fVar2.f1326c;
                wVar = wVar;
                Object obj = fVar2.f1324a;
                if (i13 < i15) {
                    arrayList2.add(new f(i12, i13, obj));
                    i12 = i13;
                } else {
                    int i16 = size;
                    arrayList2.add(new f(i12, i15, obj));
                    i12 = fVar2.f1326c;
                    while (!kVar.isEmpty() && i12 == ((f) kVar.last()).f1326c) {
                        kVar.removeLast();
                    }
                    size = i16;
                }
            }
            List list2 = listE0;
            u8.w wVar2 = wVar;
            int i17 = size;
            if (i12 < i13) {
                arrayList2.add(new f(i12, i13, vVar));
                i12 = i13;
            }
            f fVar3 = (f) kVar.o();
            if (fVar3 != null) {
                int i18 = fVar3.f1326c;
                Object obj2 = fVar3.f1324a;
                int i19 = fVar3.f1325b;
                if (i19 == i13 && i18 == i14) {
                    kVar.removeLast();
                    kVar.addLast(new f(i13, i14, ((v) obj2).a(vVarA)));
                } else if (i19 == i18) {
                    arrayList2.add(new f(i19, i18, obj2));
                    kVar.removeLast();
                    kVar.addLast(new f(i13, i14, vVarA));
                } else {
                    if (i18 < i14) {
                        throw new IllegalArgumentException();
                    }
                    kVar.addLast(new f(i13, i14, ((v) obj2).a(vVarA)));
                }
            } else {
                kVar.addLast(new f(i13, i14, vVarA));
            }
            i11++;
            listE0 = list2;
            wVar = wVar2;
            size = i17;
        }
        u8.w wVar3 = wVar;
        while (i12 <= str.length() && !kVar.isEmpty()) {
            f fVar4 = (f) kVar.last();
            Object obj3 = fVar4.f1324a;
            int i20 = fVar4.f1326c;
            arrayList2.add(new f(i12, i20, obj3));
            while (!kVar.isEmpty() && i20 == ((f) kVar.last()).f1326c) {
                kVar.removeLast();
            }
            i12 = i20;
        }
        if (i12 < str.length()) {
            arrayList2.add(new f(i12, str.length(), vVar));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new f(0, 0, vVar));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i21 = 0;
        while (i21 < size2) {
            f fVar5 = (f) arrayList2.get(i21);
            int i22 = fVar5.f1325b;
            int i23 = fVar5.f1326c;
            if (i22 != i23) {
                strSubstring = str.substring(i22, i23);
                i9.l.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = i.a(hVar2, i22, i23, new y0(10));
            h hVar4 = new h(strSubstring, listA == null ? wVar3 : listA);
            v vVar2 = (v) fVar5.f1324a;
            if (vVar2.f1454b == Integer.MIN_VALUE) {
                vVar2 = new v(vVar2.f1453a, vVar.f1454b, vVar2.f1455c, vVar2.f1456d, vVar2.f1457e, vVar2.f1458f, vVar2.f1459g, vVar2.f1460h, vVar2.f1461i);
            }
            r0 r0Var3 = new r0(r0Var2.f1438a, vVar.a(vVar2));
            List list3 = hVar4.f1352a;
            List list4 = list3 == null ? wVar3 : list3;
            List list5 = (List) this.f1434c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i24 = 0;
            while (i24 < size3) {
                f fVar6 = (f) list5.get(i24);
                int i25 = fVar6.f1325b;
                v vVar3 = vVar;
                int i26 = fVar6.f1326c;
                if (i.b(i22, i23, i25, i26)) {
                    if (i22 > i25 || i26 > i23) {
                        h3.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new f(i25 - i22, i26 - i22, fVar6.f1324a));
                }
                i24++;
                list5 = list5;
                vVar = vVar3;
            }
            arrayList3.add(new t(new j3.d(strSubstring, r0Var3, list4, arrayList4, dVar, cVar), i22, i23));
            i21++;
            hVar2 = hVar;
            r0Var2 = r0Var;
            str = str;
            arrayList2 = arrayList2;
        }
        this.f1432a = arrayList3;
    }

    public r(Map map) {
        i9.l.e(map, "initialState");
        this.f1433b = new LinkedHashMap(map);
        this.f1434c = new LinkedHashMap();
        this.f1435d = new LinkedHashMap();
        this.f1436e = new LinkedHashMap();
        this.f1432a = new c.f(4, this);
    }

    public r(i3 i3Var, i3 i3Var2, wa.e eVar, ArrayList arrayList) {
        this.f1434c = i3Var;
        this.f1435d = i3Var2;
        this.f1436e = eVar;
        this.f1432a = arrayList;
        this.f1433b = i3Var;
    }

    public static void r(Activity activity, List list, e6.f fVar, n4.e eVar, Runnable runnable) {
        int i7;
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i7 = 1;
                break;
            } else if (((z6.a) it.next()).l(activity) != 1) {
                i7 = 2;
                break;
            }
        }
        if (!d7.a.t() && i7 == 1) {
            runnable.run();
        } else {
            eVar.getClass();
            fVar.d(list, i7, new android.support.v4.media.session.r(eVar, activity, list, runnable));
        }
    }

    @Override // b3.u
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f1432a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((t) arrayList.get(i7)).f1449a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // pa.l
    public void b() {
        ((i3) this.f1434c).b();
        i3 i3Var = (i3) this.f1435d;
        ((HashMap) i3Var.f9786c).put((wa.e) this.f1436e, new bb.a((y9.b) u8.p.A0((ArrayList) this.f1432a)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // b3.u
    public float c() {
        return ((Number) this.f1435d.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // b3.u
    public float d() {
        return ((Number) this.f1436e.getValue()).floatValue();
    }

    @Override // pa.l
    public void e(wa.e eVar, bb.f fVar) {
        ((i3) this.f1433b).e(eVar, fVar);
    }

    @Override // pa.l
    public void f(wa.e eVar, wa.b bVar, wa.e eVar2) {
        ((i3) this.f1433b).f(eVar, bVar, eVar2);
    }

    @Override // pa.l
    public void g(wa.e eVar, Object obj) {
        ((i3) this.f1433b).g(eVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi h(int i7) {
        Bidi bidi;
        Layout layout = (Layout) this.f1433b;
        ArrayList arrayList = (ArrayList) this.f1432a;
        ArrayList arrayList2 = (ArrayList) this.f1434c;
        boolean[] zArr = (boolean[]) this.f1435d;
        if (zArr[i7]) {
            return (Bidi) arrayList2.get(i7);
        }
        int iIntValue = i7 == 0 ? 0 : ((Number) arrayList.get(i7 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i7)).intValue();
        int i10 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f1436e;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i10)) {
            bidi = new Bidi(cArr2, 0, null, 0, i10, layout.getParagraphDirection(layout.getLineForOffset(n(i7))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i7, bidi);
        zArr[i7] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f1436e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f1436e = cArr2;
        return bidi;
    }

    @Override // pa.l
    public pa.l i(wa.b bVar, wa.e eVar) {
        return ((i3) this.f1433b).i(bVar, eVar);
    }

    public float j(int i7, boolean z10) {
        Layout layout = (Layout) this.f1433b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i7) : layout.getSecondaryHorizontal(i7);
    }

    public float k(int i7, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iP = i7;
        Layout layout = (Layout) this.f1433b;
        if (!z11) {
            return j(i7, z10);
        }
        int iP2 = g5.a.P(layout, iP, z11);
        int lineStart = layout.getLineStart(iP2);
        int lineEnd = layout.getLineEnd(iP2);
        if (iP != lineStart && iP != lineEnd) {
            return j(i7, z10);
        }
        if (iP == 0 || iP == layout.getText().length()) {
            return j(i7, z10);
        }
        int iL = l(iP, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(n(iL))) == -1;
        int iP3 = p(lineEnd, lineStart);
        int iN = n(iL);
        int i12 = lineStart - iN;
        int i13 = iP3 - iN;
        Bidi bidiH = h(iL);
        Bidi bidiCreateLineBidi = bidiH != null ? bidiH.createLineBidi(i12, i13) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return iP == lineStart ? z12 : !z12 ? layout.getLineLeft(iP2) : layout.getLineRight(iP2);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        c3.g[] gVarArr = new c3.g[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            gVarArr[i14] = new c3.g(bidiCreateLineBidi.getRunStart(i14) + lineStart, bidiCreateLineBidi.getRunLimit(i14) + lineStart, bidiCreateLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) bidiCreateLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, gVarArr, 0, runCount);
        if (iP == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    i11 = -1;
                    break;
                }
                if (gVarArr[i16].f2374a == iP) {
                    i11 = i16;
                    break;
                }
                i16++;
            }
            boolean z13 = (z10 || z12 == gVarArr[i11].f2376c) ? !z12 : z12;
            if (i11 == 0 && z13) {
                return layout.getLineLeft(iP2);
            }
            if (i11 != runCount - 1 || z13) {
                return z13 ? layout.getPrimaryHorizontal(gVarArr[i11 - 1].f2374a) : layout.getPrimaryHorizontal(gVarArr[i11 + 1].f2374a);
            }
            return layout.getLineRight(iP2);
        }
        if (iP > iP3) {
            iP = p(iP, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                i10 = -1;
                break;
            }
            if (gVarArr[i17].f2375b == iP) {
                i10 = i17;
                break;
            }
            i17++;
        }
        boolean z14 = (z10 || z12 == gVarArr[i10].f2376c) ? z12 : !z12;
        if (i10 == 0 && z14) {
            return layout.getLineLeft(iP2);
        }
        if (i10 != runCount - 1 || z14) {
            return z14 ? layout.getPrimaryHorizontal(gVarArr[i10 - 1].f2375b) : layout.getPrimaryHorizontal(gVarArr[i10 + 1].f2375b);
        }
        return layout.getLineRight(iP2);
    }

    public int l(int i7, boolean z10) {
        int i10;
        ArrayList arrayList = (ArrayList) this.f1432a;
        Integer numValueOf = Integer.valueOf(i7);
        int size = arrayList.size();
        i9.l.e(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(a2.f.F("fromIndex (0) is greater than toIndex (", ").", size));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i11 = size - 1;
        int i12 = 0;
        while (true) {
            if (i12 > i11) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + i11) >>> 1;
            int iX = n3.n.X((Comparable) arrayList.get(i10), numValueOf);
            if (iX >= 0) {
                if (iX <= 0) {
                    break;
                }
                i11 = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        int i13 = i10 < 0 ? -(i10 + 1) : i10 + 1;
        if (z10 && i13 > 0) {
            int i14 = i13 - 1;
            if (i7 == ((Number) arrayList.get(i14)).intValue()) {
                return i14;
            }
        }
        return i13;
    }

    @Override // pa.l
    public pa.m m(wa.e eVar) {
        return ((i3) this.f1433b).m(eVar);
    }

    public int n(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f1432a).get(i7 - 1)).intValue();
    }

    public void o() {
        Activity activity = (Activity) this.f1433b;
        ArrayList<z6.a> arrayList = (ArrayList) this.f1432a;
        if (d7.a.q(activity)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (z6.a aVar : arrayList) {
            if (aVar.v(activity, false)) {
                arrayList2.add(aVar);
            } else {
                arrayList3.add(aVar);
            }
        }
        ((o6.a) this.f1436e).y0(arrayList2, arrayList3);
        d7.b.f3791a.postDelayed(new p6.d(activity, 0), 100L);
    }

    public int p(int i7, int i10) {
        while (i7 > i10) {
            char cCharAt = ((Layout) this.f1433b).getText().charAt(i7 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((i9.l.f(cCharAt, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) < 0 || i9.l.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i7;
            }
            i7--;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dd A[Catch: InvocationTargetException -> 0x00d7, IllegalAccessException -> 0x00d9, NoSuchMethodException -> 0x00db, TryCatch #7 {IllegalAccessException -> 0x00d9, NoSuchMethodException -> 0x00db, InvocationTargetException -> 0x00d7, blocks: (B:29:0x0084, B:31:0x008e, B:35:0x0096, B:37:0x00bf, B:39:0x00d2, B:46:0x00dd, B:48:0x00f7), top: B:175:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7 A[Catch: InvocationTargetException -> 0x00d7, IllegalAccessException -> 0x00d9, NoSuchMethodException -> 0x00db, TRY_LEAVE, TryCatch #7 {IllegalAccessException -> 0x00d9, NoSuchMethodException -> 0x00db, InvocationTargetException -> 0x00d7, blocks: (B:29:0x0084, B:31:0x008e, B:35:0x0096, B:37:0x00bf, B:39:0x00d2, B:46:0x00dd, B:48:0x00f7), top: B:175:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0107 -> B:54:0x0108). Please report as a decompilation issue!!! */
    public void q(o6.a aVar) {
        r6.a aVar2;
        List listK;
        int iIntValue;
        v6.a aVarX;
        v6.a aVar3;
        Field declaredField;
        Integer num;
        int i7;
        Context context = (Context) this.f1433b;
        if (context == null) {
            return;
        }
        if (((n4.e) this.f1434c) == null) {
            this.f1434c = new n4.e(3);
        }
        int i10 = 2;
        if (((n4.e) this.f1435d) == null) {
            this.f1435d = new n4.e(i10);
        }
        n4.e eVar = (n4.e) this.f1434c;
        n4.e eVar2 = (n4.e) this.f1435d;
        ArrayList<z6.a> arrayList = new ArrayList((ArrayList) this.f1432a);
        Activity activityG = d7.a.g(context);
        if (((Boolean) this.f1436e) == null) {
            if (f1431f == null) {
                f1431f = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            }
            this.f1436e = f1431f;
        }
        if (((Boolean) this.f1436e).booleanValue()) {
            if (activityG == null) {
                throw new IllegalArgumentException("The instance of the context must be an activity object");
            }
            if (activityG.isFinishing()) {
                throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            if (activityG.isDestroyed()) {
                throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
            }
            String str = context.getApplicationInfo().sourceDir;
            AssetManager assets = context.getAssets();
            try {
                if (context.getApplicationInfo().targetSdkVersion < 28 || (i7 = Build.VERSION.SDK_INT) < 28 || i7 >= 30) {
                    num = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    declaredMethod.setAccessible(true);
                    Method method = (Method) declaredMethod.invoke(AssetManager.class, "findCookieForPath", new Class[]{String.class});
                    if (method != null) {
                        method.setAccessible(true);
                        Integer num2 = (Integer) method.invoke(context.getAssets(), str);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            num = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        }
                    } else {
                        num = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    }
                }
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
            if (iIntValue == 0) {
                aVar3 = null;
            } else {
                try {
                    aVarX = n4.h.X(context, iIntValue);
                    try {
                        if (d7.a.v(context.getPackageName(), aVarX.f13625a)) {
                            aVar3 = aVarX;
                        } else {
                            aVar3 = null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        e.printStackTrace();
                    } catch (XmlPullParserException e13) {
                        e = e13;
                        e.printStackTrace();
                    }
                } catch (IOException | XmlPullParserException e14) {
                    e = e14;
                    aVarX = null;
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("The requested permission cannot be empty");
            }
            for (z6.a aVar4 : arrayList) {
                Class<?> cls = aVar4.getClass();
                String name = cls.getName();
                try {
                    declaredField = aVar4.getClass().getDeclaredField("CREATOR");
                } catch (NoSuchFieldException e15) {
                    e15.printStackTrace();
                    declaredField = null;
                }
                if (declaredField == null) {
                    throw new IllegalArgumentException("This permission class does not define the CREATOR field");
                }
                try {
                    Object obj = declaredField.get(null);
                    if (!(obj instanceof Parcelable.Creator)) {
                        throw new IllegalArgumentException("The CREATOR field in this " + name + " is not of type " + Parcelable.Creator.class.getName());
                    }
                    Type genericType = declaredField.getGenericType();
                    if (!(genericType instanceof ParameterizedType)) {
                        throw new IllegalArgumentException(a2.f.G("The generic type defined for the CREATOR field in this ", name, " is empty"));
                    }
                    Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                    if (actualTypeArguments.length != 1) {
                        throw new IllegalArgumentException(a2.f.G("The number of generics defined in the CREATOR field of this ", name, " can only be one"));
                    }
                    Type type = actualTypeArguments[0];
                    if (!(type instanceof Class) || !cls.isAssignableFrom((Class) type)) {
                        throw new IllegalArgumentException(a2.f.G("The generic type defined in the CREATOR field of this ", name, " is incorrect"));
                    }
                    if (((Parcelable.Creator) obj).newArray(0) == null) {
                        throw new IllegalArgumentException(a2.f.G("The newArray method of the CREATOR field in this ", name, " returns an empty value. This method cannot return an empty value"));
                    }
                    int iJ = aVar4.j(activityG);
                    if (activityG.getApplicationInfo().targetSdkVersion < iJ) {
                        throw new IllegalStateException("Request \"" + aVar4.n() + "\" permission, The targetSdkVersion SDK must be " + iJ + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permission");
                    }
                    if (aVar3 != null) {
                        ArrayList arrayList2 = aVar3.f13627c;
                        aVar4.d(activityG, arrayList, aVar3, arrayList2, z6.a.f(aVar4.n(), arrayList2));
                    }
                    aVar4.e(activityG, arrayList);
                } catch (Exception unused) {
                    throw new IllegalArgumentException(a2.f.G("The CREATOR field in the ", name, " has an access exception. Please modify CREATOR field with \"public static final\""));
                }
            }
        }
        if (d7.a.q(activityG)) {
            return;
        }
        synchronized (d7.a.class) {
            int i11 = -1;
            while (true) {
                i11++;
                if (i11 >= arrayList.size()) {
                    break;
                }
                z6.a aVar5 = (z6.a) arrayList.get(i11);
                if (Build.VERSION.SDK_INT < aVar5.h() && (listK = aVar5.k()) != null) {
                    ArrayList<z6.a> arrayList3 = (ArrayList) listK;
                    if (!arrayList3.isEmpty()) {
                        for (z6.a aVar6 : arrayList3) {
                            if (!d7.a.e(arrayList, aVar6)) {
                                i11++;
                                arrayList.add(i11, aVar6);
                            }
                        }
                    }
                }
            }
        }
        if (d7.a.u(context, arrayList)) {
            ArrayList arrayList4 = new ArrayList();
            eVar.getClass();
            aVar.y0(arrayList, arrayList4);
        } else {
            if (activityG instanceof p4.l) {
                p4.l lVar = (p4.l) activityG;
                aVar2 = new r6.a(lVar, ((p4.k) lVar.f10208s.f7772b).f10206f, 1);
            } else {
                aVar2 = new r6.a(activityG, activityG.getFragmentManager(), 0);
            }
            eVar.o(activityG, arrayList, aVar2, eVar2, aVar);
        }
    }

    public void s(Object obj, String str) {
        i9.l.e(str, "key");
        ((LinkedHashMap) this.f1433b).put(str, obj);
        fc.t tVar = (fc.t) ((LinkedHashMap) this.f1435d).get(str);
        if (tVar != null) {
            ((fc.h0) tVar).i(obj);
        }
        fc.t tVar2 = (fc.t) ((LinkedHashMap) this.f1436e).get(str);
        if (tVar2 != null) {
            ((fc.h0) tVar2).i(obj);
        }
    }
}
