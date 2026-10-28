package f1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f4891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s.i0 f4892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.i0 f4893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.i0 f4894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f4895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s.i0 f4896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ x0 f4898j;
    public final /* synthetic */ c2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, y8.c cVar) {
        super(3, cVar);
        this.k = c2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void g(c2 c2Var, List list, List list2, List list3, s.i0 i0Var, s.i0 i0Var2, s.i0 i0Var3, s.i0 i0Var4) {
        char c10;
        long j5;
        long j10;
        synchronized (c2Var.f4904b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    y yVar = (y) list3.get(i7);
                    yVar.a();
                    c2Var.M(yVar);
                }
                list3.clear();
                Object[] objArr = i0Var.f12445b;
                long[] jArr = i0Var.f12444a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j5 = 255;
                    while (true) {
                        long j11 = jArr[i10];
                        c10 = 7;
                        j10 = -9187201950435737472L;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j11 & 255) < 128) {
                                    y yVar2 = (y) objArr[(i10 << 3) + i12];
                                    yVar2.a();
                                    c2Var.M(yVar2);
                                }
                                j11 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                } else {
                    c10 = 7;
                    j5 = 255;
                    j10 = -9187201950435737472L;
                }
                i0Var.b();
                Object[] objArr2 = i0Var2.f12445b;
                long[] jArr2 = i0Var2.f12444a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j12 = jArr2[i13];
                        if ((((~j12) << c10) & j12 & j10) == j10) {
                            if (i13 != length2) {
                                break;
                                break;
                            }
                            i13++;
                        } else {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j12 & j5) < 128) {
                                    ((y) objArr2[(i13 << 3) + i15]).g();
                                }
                                j12 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            } else if (i13 != length2) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                i0Var2.b();
                i0Var3.b();
                Object[] objArr3 = i0Var4.f12445b;
                long[] jArr3 = i0Var4.f12444a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j13 = jArr3[i16];
                        if ((((~j13) << c10) & j13 & j10) == j10) {
                            if (i16 != length3) {
                                break;
                                break;
                            }
                            i16++;
                        } else {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j13 & j5) < 128) {
                                    y yVar3 = (y) objArr3[(i16 << 3) + i18];
                                    yVar3.a();
                                    c2Var.M(yVar3);
                                }
                                j13 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            } else if (i16 != length3) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                }
                i0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void i(List list, c2 c2Var) {
        list.clear();
        synchronized (c2Var.f4904b) {
            try {
                ArrayList arrayList = c2Var.f4912j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((a1) arrayList.get(i7));
                }
                c2Var.f4912j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b2 b2Var = new b2(this.k, (y8.c) obj3);
        b2Var.f4898j = (x0) obj2;
        b2Var.invokeSuspend(t8.z.f12851a);
        return z8.a.f15774a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0091 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e7 -> B:25:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f5 -> B:12:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
