package y7;

import cc.b0;
import f1.s;
import h9.n;
import i9.l;
import i9.u;
import java.util.Iterator;
import java.util.List;
import k2.v;
import t8.j;
import t8.z;
import u8.p;
import z.m1;
import z7.f;
import z7.g;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15097b;

    public /* synthetic */ a(int i7, int i10, Object obj) {
        this.f15096a = i10;
        this.f15097b = obj;
    }

    public /* synthetic */ a(int i7, Object obj) {
        this.f15096a = i7;
        this.f15097b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f A[LOOP:0: B:20:0x005e->B:31:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0032  */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        Object next;
        j jVar;
        Object next2;
        String str;
        String str2;
        switch (this.f15096a) {
            case 0:
                ((Integer) obj2).getClass();
                ((d) this.f15097b).b(f1.b.y(1), (s) obj);
                return z.f12851a;
            case 1:
                u uVar = (u) this.f15097b;
                float fFloatValue = ((Float) obj2).floatValue();
                ((v) obj).a();
                uVar.f6685a = fFloatValue;
                return z.f12851a;
            case 2:
                m1 m1Var = (m1) this.f15097b;
                b0.s(m1Var.m0(), null, new l8.d(m1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null, 1), 3);
                return Boolean.TRUE;
            case 3:
                ((Integer) obj2).getClass();
                ((f) this.f15097b).a(f1.b.y(7), (s) obj);
                return z.f12851a;
            case 4:
                ((Integer) obj2).getClass();
                ((g) this.f15097b).i(f1.b.y(1), (s) obj);
                return z.f12851a;
            default:
                List list = (List) this.f15097b;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l.e(charSequence, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    String str3 = (String) p.z0(list);
                    int iA0 = zb.j.A0(charSequence, str3, iIntValue, false, 4);
                    if (iA0 < 0) {
                        jVar = null;
                    } else {
                        jVar = new j(Integer.valueOf(iA0), str3);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    n9.d dVar = new n9.d(iIntValue, charSequence.length(), 1);
                    boolean z10 = charSequence instanceof String;
                    int i10 = dVar.f8967c;
                    int i11 = dVar.f8966b;
                    if (z10) {
                        if ((i10 <= 0 || iIntValue > i11) && (i10 >= 0 || i11 > iIntValue)) {
                            jVar = null;
                        } else {
                            int i12 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        jVar = new j(Integer.valueOf(i12), str);
                                    } else if (i12 != i11) {
                                        i12 += i10;
                                    } else {
                                        jVar = null;
                                    }
                                } while (!q.k0(0, i12, str2.length(), str2, (String) charSequence, false));
                                str = (String) next2;
                                if (str != null) {
                                    jVar = new j(Integer.valueOf(i12), str);
                                } else if (i12 != i11) {
                                    i12 += i10;
                                } else {
                                    jVar = null;
                                }
                            }
                        }
                    } else if ((i10 <= 0 || iIntValue > i11) && (i10 >= 0 || i11 > iIntValue)) {
                        jVar = null;
                    } else {
                        int i13 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    i7 = i11;
                                    if (!zb.j.G0(str4, 0, charSequence, i13, str4.length(), false)) {
                                        i11 = i7;
                                    }
                                } else {
                                    i7 = i11;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                jVar = new j(Integer.valueOf(i13), str5);
                            } else if (i13 != i7) {
                                i13 += i10;
                                i11 = i7;
                            } else {
                                jVar = null;
                            }
                        }
                    }
                }
                if (jVar != null) {
                    return new j(jVar.f12830a, Integer.valueOf(((String) jVar.f12831b).length()));
                }
                return null;
        }
    }
}
