package o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n3.l;
import s.h0;
import s.o0;
import u8.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f9278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f9279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f9280c;

    public g(Map map, h9.k kVar) {
        h0 h0Var;
        this.f9278a = kVar;
        if (map == null || map.isEmpty()) {
            h0Var = null;
        } else {
            h0Var = new h0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                h0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f9279b = h0Var;
    }

    @Override // o1.f
    public final boolean a(Object obj) {
        return ((Boolean) this.f9278a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    @Override // o1.f
    public final Map b() {
        long j5;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        char c11;
        h0 h0Var = this.f9279b;
        if (h0Var == null && this.f9280c == null) {
            return x.f13123a;
        }
        int i7 = 0;
        int i10 = h0Var != null ? h0Var.f12441e : 0;
        h0 h0Var2 = this.f9280c;
        HashMap map = new HashMap(i10 + (h0Var2 != null ? h0Var2.f12441e : 0));
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (h0Var != null) {
            Object[] objArr = h0Var.f12438b;
            Object[] objArr2 = h0Var.f12439c;
            long[] jArr3 = h0Var.f12437a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                j10 = 128;
                while (true) {
                    long j13 = jArr3[i11];
                    j11 = 255;
                    if ((((~j13) << c12) & j13 & j12) != j12) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j13 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                map.put((String) objArr[i14], (List) objArr2[i14]);
                            }
                            j13 >>= 8;
                            i13++;
                            j12 = j12;
                        }
                        j5 = j12;
                        c10 = 7;
                        if (i12 != 8) {
                            break;
                        }
                    } else {
                        j5 = j12;
                        c10 = 7;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    j12 = j5;
                    c12 = 7;
                }
            } else {
                j5 = -9187201950435737472L;
                j10 = 128;
                j11 = 255;
                c10 = 7;
            }
        } else {
            j5 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
            c10 = 7;
        }
        h0 h0Var3 = this.f9280c;
        if (h0Var3 != null) {
            Object[] objArr3 = h0Var3.f12438b;
            Object[] objArr4 = h0Var3.f12439c;
            long[] jArr4 = h0Var3.f12437a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i15 = 0;
                while (true) {
                    long j14 = jArr4[i15];
                    if ((((~j14) << c10) & j14 & j5) != j5) {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j14 & j11) < j10) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr3[i18];
                                List list = (List) objArr4[i18];
                                String str = (String) obj;
                                c11 = '\b';
                                if (list.size() == 1) {
                                    Object objInvoke = ((h9.a) list.get(i7)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(k.a(objInvoke).toString());
                                        }
                                        Object[] objArr5 = new Object[1];
                                        objArr5[i7] = objInvoke;
                                        map.put(str, l.m(objArr5));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i7 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((h9.a) list.get(i7)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(k.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i7++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                c11 = '\b';
                            }
                            j14 >>= c11;
                            i17++;
                            jArr4 = jArr2;
                            i7 = 0;
                        }
                        jArr = jArr4;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i15 == length2) {
                        break;
                    }
                    i15++;
                    jArr4 = jArr;
                    i7 = 0;
                }
            }
        }
        return map;
    }

    @Override // o1.f
    public final Object c(String str) {
        h0 h0Var = this.f9279b;
        List list = h0Var != null ? (List) h0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && h0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = h0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = h0Var.f12439c;
            Object obj = objArr[iF];
            h0Var.f12438b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // o1.f
    public final e e(String str, h9.a aVar) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!l.H(str.charAt(i7))) {
                h0 h0Var = this.f9280c;
                if (h0Var == null) {
                    long[] jArr = o0.f12476a;
                    h0Var = new h0();
                    this.f9280c = h0Var;
                }
                Object objG = h0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    h0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new a2.b(h0Var, str, aVar, 18);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
