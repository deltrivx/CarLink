package p1;

import f1.q2;
import f1.w0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q2.r1;
import s.h0;
import s.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f10077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.c0 f10079c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10086j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10080d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f10081e = k9.a.o();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f10082f = new h0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f10083g = new i0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.e f10084h = new h1.e(new f1.f0[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.r f10085i = new f1.r(1, this);
    public final h0 k = k9.a.o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f10087l = new HashMap();

    public t(h9.k kVar) {
        this.f10077a = kVar;
    }

    public final void a(Object obj, c8.k kVar, h9.a aVar) {
        int i7;
        char c10;
        Object obj2 = this.f10078b;
        s.c0 c0Var = this.f10079c;
        int i10 = this.f10080d;
        this.f10078b = obj;
        this.f10079c = (s.c0) this.f10082f.g(obj);
        if (this.f10080d == -1) {
            long jG = l.k().g();
            this.f10080d = (int) (jG ^ (jG >>> 32));
        }
        f1.r rVar = this.f10085i;
        h1.e eVarM = f1.b.m();
        try {
            eVarM.b(rVar);
            n4.e.m(aVar, kVar);
            eVarM.l(eVarM.f6423c - 1);
            Object obj3 = this.f10078b;
            i9.l.b(obj3);
            int i11 = this.f10080d;
            s.c0 c0Var2 = this.f10079c;
            if (c0Var2 != null) {
                long[] jArr = c0Var2.f12397a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    int i15 = (i12 << 3) + i14;
                                    c10 = '\b';
                                    Object obj4 = c0Var2.f12398b[i15];
                                    i7 = i14;
                                    boolean z10 = c0Var2.f12399c[i15] != i11;
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        c0Var2.g(i15);
                                    }
                                } else {
                                    i7 = i14;
                                    c10 = '\b';
                                }
                                j5 >>= c10;
                                i14 = i7 + 1;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            this.f10078b = obj2;
            this.f10079c = c0Var;
            this.f10080d = i10;
        } catch (Throwable th) {
            eVarM.l(eVarM.f6423c - 1);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0274 A[DONT_INVERT, PHI: r13
      0x0274: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x024d, B:117:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0276 A[LOOP:6: B:108:0x0243->B:119:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0495 A[DONT_INVERT, PHI: r13
      0x0495: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x046e, B:218:0x0493] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x0497 A[LOOP:20: B:209:0x0464->B:220:0x0497, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f2 A[DONT_INVERT, PHI: r13
      0x04f2: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04cb, B:240:0x04f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x04f4 A[LOOP:18: B:231:0x04c1->B:242:0x04f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x0157 A[EDGE_INSN: B:294:0x0157->B:62:0x0157 BREAK  A[LOOP:4: B:46:0x00f7->B:58:0x0132], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x027d A[EDGE_INSN: B:299:0x027d->B:121:0x027d BREAK  A[LOOP:6: B:108:0x0243->B:119:0x0276], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x021f A[EDGE_INSN: B:304:0x021f->B:99:0x021f BREAK  A[LOOP:8: B:84:0x01d6->B:95:0x0209], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x04fb A[EDGE_INSN: B:321:0x04fb->B:244:0x04fb BREAK  A[LOOP:18: B:231:0x04c1->B:242:0x04f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x04a9 A[EDGE_INSN: B:332:0x04a9->B:224:0x04a9 BREAK  A[LOOP:20: B:209:0x0464->B:220:0x0497], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0130 A[DONT_INVERT, PHI: r33
      0x0130: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x0105, B:56:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0132 A[LOOP:4: B:46:0x00f7->B:58:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0207 A[DONT_INVERT, PHI: r13
      0x0207: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e0, B:93:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0209 A[LOOP:8: B:84:0x01d6->B:95:0x0209, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0215  */
    public final boolean b(Set set) {
        char c10;
        long j5;
        boolean z10;
        Iterator it;
        String str;
        h0 h0Var;
        Object objG;
        Object[] objArr;
        Iterator it2;
        int i7;
        String str2;
        h0 h0Var2;
        long j10;
        long[] jArr;
        int i10;
        Object[] objArr2;
        int i11;
        s.c0 c0Var;
        long[] jArr2;
        w0 w0Var;
        Object[] objArr3;
        long[] jArr3;
        w0 w0Var2;
        Object[] objArr4;
        int i12;
        int i13;
        int i14;
        long j11;
        Object obj;
        Object obj2;
        Object obj3;
        int i15;
        int i16;
        long j12;
        int i17;
        w0 w0Var3 = w0.f5187f;
        boolean z11 = set instanceof h1.h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        h1.e eVar = this.f10084h;
        h0 h0Var3 = this.k;
        HashMap map = this.f10087l;
        h0 h0Var4 = this.f10081e;
        i0 i0Var = this.f10083g;
        if (z11) {
            i0 i0Var2 = ((h1.h) set).f6434a;
            Object[] objArr5 = i0Var2.f12445b;
            long[] jArr4 = i0Var2.f12444a;
            c10 = 7;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i18 = 0;
                z10 = false;
                j5 = -9187201950435737472L;
                while (true) {
                    char c11 = '\b';
                    long j13 = jArr4[i18];
                    int i19 = i18;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i19 - length)) >>> 31);
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j13 & 255) < 128) {
                                jArr3 = jArr4;
                                Object obj4 = objArr5[(i19 << 3) + i21];
                                w0Var2 = w0Var3;
                                if (obj4 instanceof a0) {
                                    objArr4 = objArr5;
                                    if (!((a0) obj4).b(2)) {
                                    }
                                    i21 = i14 + 1;
                                    c11 = '\b';
                                    j13 = j11 >> 8;
                                    w0Var3 = w0Var2;
                                    jArr4 = jArr3;
                                    objArr5 = objArr4;
                                    length = i12;
                                    i20 = i13;
                                } else {
                                    objArr4 = objArr5;
                                }
                                if (h0Var3.c(obj4)) {
                                    Object objG2 = h0Var3.g(obj4);
                                    if (objG2 == null) {
                                        obj2 = obj4;
                                        i12 = length;
                                        i13 = i20;
                                        i14 = i21;
                                        j11 = j13;
                                    } else if (objG2 instanceof i0) {
                                        i0 i0Var3 = (i0) objG2;
                                        Object[] objArr6 = i0Var3.f12445b;
                                        long[] jArr5 = i0Var3.f12444a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            i14 = i21;
                                            boolean z12 = z10;
                                            int i22 = 0;
                                            while (true) {
                                                long j14 = jArr5[i22];
                                                j11 = j13;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                    int i24 = 0;
                                                    while (i24 < i23) {
                                                        if ((j14 & 255) < 128) {
                                                            j12 = j14;
                                                            f1.f0 f0Var = (f1.f0) objArr6[(i22 << 3) + i24];
                                                            i9.l.c(f0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                            Object obj5 = map.get(f0Var);
                                                            i17 = i24;
                                                            q2 q2Var = f0Var.f4953c;
                                                            if (q2Var == null) {
                                                                q2Var = w0Var2;
                                                            }
                                                            if (q2Var.a(f0Var.g().f4941f, obj5)) {
                                                                obj3 = obj4;
                                                                i15 = length;
                                                                i16 = i20;
                                                                eVar.b(f0Var);
                                                            } else {
                                                                Object objG3 = h0Var4.g(f0Var);
                                                                if (objG3 == null) {
                                                                    obj3 = obj4;
                                                                    i15 = length;
                                                                    i16 = i20;
                                                                } else if (objG3 instanceof i0) {
                                                                    i0 i0Var4 = (i0) objG3;
                                                                    Object[] objArr7 = i0Var4.f12445b;
                                                                    long[] jArr6 = i0Var4.f12444a;
                                                                    int length3 = jArr6.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i15 = length;
                                                                        i16 = i20;
                                                                        int i25 = 0;
                                                                        while (true) {
                                                                            long j15 = jArr6[i25];
                                                                            long[] jArr7 = jArr6;
                                                                            obj3 = obj4;
                                                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i25 != length3) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i25++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                c11 = '\b';
                                                                            } else {
                                                                                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                                                                for (int i27 = 0; i27 < i26; i27++) {
                                                                                    if ((j15 & 255) < 128) {
                                                                                        i0Var.a(objArr7[(i25 << 3) + i27]);
                                                                                        z12 = true;
                                                                                    }
                                                                                    j15 >>= c11;
                                                                                }
                                                                                if (i26 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i25 != length3) {
                                                                                    break;
                                                                                }
                                                                                i25++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                c11 = '\b';
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj3 = obj4;
                                                                        i15 = length;
                                                                        i16 = i20;
                                                                    }
                                                                } else {
                                                                    obj3 = obj4;
                                                                    i15 = length;
                                                                    i16 = i20;
                                                                    i0Var.a(objG3);
                                                                    z12 = true;
                                                                }
                                                            }
                                                        } else {
                                                            obj3 = obj4;
                                                            i15 = length;
                                                            i16 = i20;
                                                            j12 = j14;
                                                            i17 = i24;
                                                        }
                                                        j14 = j12 >> 8;
                                                        i24 = i17 + 1;
                                                        c11 = '\b';
                                                        length = i15;
                                                        i20 = i16;
                                                        obj4 = obj3;
                                                    }
                                                    obj2 = obj4;
                                                    i12 = length;
                                                    i13 = i20;
                                                    if (i23 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    obj2 = obj4;
                                                    i12 = length;
                                                    i13 = i20;
                                                }
                                                if (i22 == length2) {
                                                    break;
                                                }
                                                i22++;
                                                c11 = '\b';
                                                j13 = j11;
                                                length = i12;
                                                i20 = i13;
                                                obj4 = obj2;
                                            }
                                            z10 = z12;
                                        } else {
                                            obj2 = obj4;
                                            i12 = length;
                                            i13 = i20;
                                            i14 = i21;
                                            j11 = j13;
                                        }
                                    } else {
                                        obj2 = obj4;
                                        i12 = length;
                                        i13 = i20;
                                        i14 = i21;
                                        j11 = j13;
                                        f1.f0 f0Var2 = (f1.f0) objG2;
                                        Object obj6 = map.get(f0Var2);
                                        q2 q2Var2 = f0Var2.f4953c;
                                        if (q2Var2 == null) {
                                            q2Var2 = w0Var2;
                                        }
                                        if (q2Var2.a(f0Var2.g().f4941f, obj6)) {
                                            eVar.b(f0Var2);
                                        } else {
                                            Object objG4 = h0Var4.g(f0Var2);
                                            if (objG4 != null) {
                                                if (objG4 instanceof i0) {
                                                    i0 i0Var5 = (i0) objG4;
                                                    Object[] objArr8 = i0Var5.f12445b;
                                                    long[] jArr8 = i0Var5.f12444a;
                                                    int length4 = jArr8.length - 2;
                                                    if (length4 >= 0) {
                                                        int i28 = 0;
                                                        while (true) {
                                                            long j16 = jArr8[i28];
                                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                if (i28 != length4) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i28++;
                                                            } else {
                                                                int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                for (int i30 = 0; i30 < i29; i30++) {
                                                                    if ((j16 & 255) < 128) {
                                                                        i0Var.a(objArr8[(i28 << 3) + i30]);
                                                                        z10 = true;
                                                                    }
                                                                    j16 >>= 8;
                                                                }
                                                                if (i29 != 8) {
                                                                    break;
                                                                }
                                                                if (i28 != length4) {
                                                                    break;
                                                                }
                                                                i28++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i0Var.a(objG4);
                                                    z10 = true;
                                                }
                                            }
                                        }
                                    }
                                    obj = obj2;
                                } else {
                                    i12 = length;
                                    i13 = i20;
                                    i14 = i21;
                                    j11 = j13;
                                    obj = obj4;
                                }
                                Object objG5 = h0Var4.g(obj);
                                if (objG5 != null) {
                                    if (objG5 instanceof i0) {
                                        i0 i0Var6 = (i0) objG5;
                                        Object[] objArr9 = i0Var6.f12445b;
                                        long[] jArr9 = i0Var6.f12444a;
                                        int length5 = jArr9.length - 2;
                                        if (length5 >= 0) {
                                            int i31 = 0;
                                            while (true) {
                                                long j17 = jArr9[i31];
                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i31 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i31++;
                                                } else {
                                                    int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                    for (int i33 = 0; i33 < i32; i33++) {
                                                        if ((j17 & 255) < 128) {
                                                            i0Var.a(objArr9[(i31 << 3) + i33]);
                                                            z10 = true;
                                                        }
                                                        j17 >>= 8;
                                                    }
                                                    if (i32 != 8) {
                                                        break;
                                                    }
                                                    if (i31 != length5) {
                                                        break;
                                                    }
                                                    i31++;
                                                }
                                            }
                                        }
                                    } else {
                                        i0Var.a(objG5);
                                        z10 = true;
                                    }
                                }
                                i21 = i14 + 1;
                                c11 = '\b';
                                j13 = j11 >> 8;
                                w0Var3 = w0Var2;
                                jArr4 = jArr3;
                                objArr5 = objArr4;
                                length = i12;
                                i20 = i13;
                            } else {
                                jArr3 = jArr4;
                                w0Var2 = w0Var3;
                                objArr4 = objArr5;
                            }
                            i12 = length;
                            i13 = i20;
                            i14 = i21;
                            j11 = j13;
                            i21 = i14 + 1;
                            c11 = '\b';
                            j13 = j11 >> 8;
                            w0Var3 = w0Var2;
                            jArr4 = jArr3;
                            objArr5 = objArr4;
                            length = i12;
                            i20 = i13;
                        }
                        jArr2 = jArr4;
                        w0Var = w0Var3;
                        objArr3 = objArr5;
                        int i34 = length;
                        if (i20 != 8) {
                            break;
                        }
                        length = i34;
                    } else {
                        jArr2 = jArr4;
                        w0Var = w0Var3;
                        objArr3 = objArr5;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i18 = i19 + 1;
                    w0Var3 = w0Var;
                    jArr4 = jArr2;
                    objArr5 = objArr3;
                }
            } else {
                j5 = -9187201950435737472L;
                z10 = false;
            }
        } else {
            c10 = 7;
            j5 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z10 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof a0) || ((a0) next).b(2)) {
                    if (!h0Var3.c(next) || (objG = h0Var3.g(next)) == null) {
                        it = it3;
                        str = str3;
                        h0Var = h0Var3;
                    } else if (objG instanceof i0) {
                        i0 i0Var7 = (i0) objG;
                        Object[] objArr10 = i0Var7.f12445b;
                        long[] jArr10 = i0Var7.f12444a;
                        int length6 = jArr10.length - 2;
                        if (length6 >= 0) {
                            int i35 = 0;
                            while (true) {
                                long j18 = jArr10[i35];
                                long[] jArr11 = jArr10;
                                Object[] objArr11 = objArr10;
                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i36 = 8 - ((~(i35 - length6)) >>> 31);
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if ((j18 & 255) < 128) {
                                            it2 = it3;
                                            f1.f0 f0Var3 = (f1.f0) objArr11[(i35 << 3) + i37];
                                            i9.l.c(f0Var3, str3);
                                            i7 = i37;
                                            Object obj7 = map.get(f0Var3);
                                            str2 = str3;
                                            q2 q2Var3 = f0Var3.f4953c;
                                            if (q2Var3 == null) {
                                                q2Var3 = w0Var3;
                                            }
                                            h0Var2 = h0Var3;
                                            if (q2Var3.a(f0Var3.g().f4941f, obj7)) {
                                                j10 = j18;
                                                eVar.b(f0Var3);
                                            } else {
                                                Object objG6 = h0Var4.g(f0Var3);
                                                if (objG6 != null) {
                                                    if (objG6 instanceof i0) {
                                                        i0 i0Var8 = (i0) objG6;
                                                        Object[] objArr12 = i0Var8.f12445b;
                                                        long[] jArr12 = i0Var8.f12444a;
                                                        int length7 = jArr12.length - 2;
                                                        if (length7 >= 0) {
                                                            boolean z13 = z10;
                                                            int i38 = 0;
                                                            while (true) {
                                                                long j19 = jArr12[i38];
                                                                j10 = j18;
                                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                                    int i40 = 0;
                                                                    while (i40 < i39) {
                                                                        if ((j19 & 255) < 128) {
                                                                            i0Var.a(objArr12[(i38 << 3) + i40]);
                                                                            z13 = true;
                                                                        }
                                                                        j19 >>= 8;
                                                                        i40++;
                                                                        jArr12 = jArr12;
                                                                    }
                                                                    jArr = jArr12;
                                                                    if (i39 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr = jArr12;
                                                                }
                                                                if (i38 == length7) {
                                                                    break;
                                                                }
                                                                i38++;
                                                                j18 = j10;
                                                                jArr12 = jArr;
                                                            }
                                                            z10 = z13;
                                                        }
                                                    } else {
                                                        j10 = j18;
                                                        i0Var.a(objG6);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            j18 = j10 >> 8;
                                            str3 = str2;
                                            h0Var3 = h0Var2;
                                            objArr11 = objArr11;
                                            i37 = i7 + 1;
                                            it3 = it2;
                                        } else {
                                            it2 = it3;
                                            i7 = i37;
                                            str2 = str3;
                                            h0Var2 = h0Var3;
                                        }
                                        j10 = j18;
                                        j18 = j10 >> 8;
                                        str3 = str2;
                                        h0Var3 = h0Var2;
                                        objArr11 = objArr11;
                                        i37 = i7 + 1;
                                        it3 = it2;
                                    }
                                    it = it3;
                                    str = str3;
                                    h0Var = h0Var3;
                                    objArr = objArr11;
                                    if (i36 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it3;
                                    str = str3;
                                    h0Var = h0Var3;
                                    objArr = objArr11;
                                }
                                if (i35 == length6) {
                                    break;
                                }
                                i35++;
                                it3 = it;
                                jArr10 = jArr11;
                                str3 = str;
                                h0Var3 = h0Var;
                                objArr10 = objArr;
                            }
                        } else {
                            it = it3;
                            str = str3;
                            h0Var = h0Var3;
                        }
                    } else {
                        it = it3;
                        str = str3;
                        h0Var = h0Var3;
                        f1.f0 f0Var4 = (f1.f0) objG;
                        Object obj8 = map.get(f0Var4);
                        q2 q2Var4 = f0Var4.f4953c;
                        if (q2Var4 == null) {
                            q2Var4 = w0Var3;
                        }
                        if (q2Var4.a(f0Var4.g().f4941f, obj8)) {
                            eVar.b(f0Var4);
                        } else {
                            Object objG7 = h0Var4.g(f0Var4);
                            if (objG7 != null) {
                                if (objG7 instanceof i0) {
                                    i0 i0Var9 = (i0) objG7;
                                    Object[] objArr13 = i0Var9.f12445b;
                                    long[] jArr13 = i0Var9.f12444a;
                                    int length8 = jArr13.length - 2;
                                    if (length8 >= 0) {
                                        int i41 = 0;
                                        while (true) {
                                            long j20 = jArr13[i41];
                                            if ((((~j20) << 7) & j20 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i41 != length8) {
                                                    break;
                                                    break;
                                                }
                                                i41++;
                                            } else {
                                                int i42 = 8 - ((~(i41 - length8)) >>> 31);
                                                for (int i43 = 0; i43 < i42; i43++) {
                                                    if ((j20 & 255) < 128) {
                                                        i0Var.a(objArr13[(i41 << 3) + i43]);
                                                        z10 = true;
                                                    }
                                                    j20 >>= 8;
                                                }
                                                if (i42 != 8) {
                                                    break;
                                                }
                                                if (i41 != length8) {
                                                    break;
                                                }
                                                i41++;
                                            }
                                        }
                                    }
                                } else {
                                    i0Var.a(objG7);
                                    z10 = true;
                                }
                            }
                        }
                    }
                    Object objG8 = h0Var4.g(next);
                    if (objG8 != null) {
                        if (objG8 instanceof i0) {
                            i0 i0Var10 = (i0) objG8;
                            Object[] objArr14 = i0Var10.f12445b;
                            long[] jArr14 = i0Var10.f12444a;
                            int length9 = jArr14.length - 2;
                            if (length9 >= 0) {
                                int i44 = 0;
                                while (true) {
                                    long j21 = jArr14[i44];
                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i44 != length9) {
                                            break;
                                            break;
                                        }
                                        i44++;
                                    } else {
                                        int i45 = 8 - ((~(i44 - length9)) >>> 31);
                                        for (int i46 = 0; i46 < i45; i46++) {
                                            if ((j21 & 255) < 128) {
                                                i0Var.a(objArr14[(i44 << 3) + i46]);
                                                z10 = true;
                                            }
                                            j21 >>= 8;
                                        }
                                        if (i45 != 8) {
                                            break;
                                        }
                                        if (i44 != length9) {
                                            break;
                                        }
                                        i44++;
                                    }
                                }
                            }
                        } else {
                            i0Var.a(objG8);
                            z10 = true;
                        }
                    }
                } else {
                    it = it3;
                    str = str3;
                    h0Var = h0Var3;
                }
                it3 = it;
                str3 = str;
                h0Var3 = h0Var;
            }
        }
        int i47 = eVar.f6423c;
        if (i47 == 0) {
            return z10;
        }
        Object[] objArr15 = eVar.f6421a;
        int i48 = 0;
        while (i48 < i47) {
            f1.f0 f0Var5 = (f1.f0) objArr15[i48];
            long jG = l.k().g();
            int i49 = (int) (jG ^ (jG >>> 32));
            Object objG9 = h0Var4.g(f0Var5);
            if (objG9 != null) {
                boolean z14 = objG9 instanceof i0;
                h0 h0Var5 = this.f10082f;
                if (z14) {
                    i0 i0Var11 = (i0) objG9;
                    Object[] objArr16 = i0Var11.f12445b;
                    long[] jArr15 = i0Var11.f12444a;
                    int length10 = jArr15.length - 2;
                    if (length10 >= 0) {
                        int i50 = 0;
                        while (true) {
                            long j22 = jArr15[i50];
                            i10 = i47;
                            objArr2 = objArr15;
                            if ((((~j22) << c10) & j22 & j5) != j5) {
                                int i51 = 8 - ((~(i50 - length10)) >>> 31);
                                int i52 = 0;
                                while (i52 < i51) {
                                    if ((j22 & 255) < 128) {
                                        Object obj9 = objArr16[(i50 << 3) + i52];
                                        s.c0 c0Var2 = (s.c0) h0Var5.g(obj9);
                                        if (c0Var2 == null) {
                                            c0Var = new s.c0();
                                            h0Var5.m(obj9, c0Var);
                                        } else {
                                            c0Var = c0Var2;
                                        }
                                        c(f0Var5, i49, obj9, c0Var);
                                    }
                                    j22 >>= 8;
                                    i52++;
                                    i48 = i48;
                                }
                                i11 = i48;
                                if (i51 != 8) {
                                    break;
                                }
                            } else {
                                i11 = i48;
                            }
                            if (i50 == length10) {
                                break;
                            }
                            i50++;
                            i47 = i10;
                            objArr15 = objArr2;
                            i48 = i11;
                        }
                    } else {
                        i10 = i47;
                        objArr2 = objArr15;
                        i11 = i48;
                    }
                } else {
                    i10 = i47;
                    objArr2 = objArr15;
                    i11 = i48;
                    s.c0 c0Var3 = (s.c0) h0Var5.g(objG9);
                    if (c0Var3 == null) {
                        c0Var3 = new s.c0();
                        h0Var5.m(objG9, c0Var3);
                    }
                    c(f0Var5, i49, objG9, c0Var3);
                }
            } else {
                i10 = i47;
                objArr2 = objArr15;
                i11 = i48;
            }
            i48 = i11 + 1;
            i47 = i10;
            objArr15 = objArr2;
        }
        eVar.h();
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void c(Object obj, int i7, Object obj2, s.c0 c0Var) {
        int i10;
        if (this.f10086j > 0) {
            return;
        }
        int iC = c0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i10 = -1;
        } else {
            i10 = c0Var.f12399c[iC];
        }
        c0Var.f12398b[iC] = obj;
        c0Var.f12399c[iC] = i7;
        if ((obj instanceof f1.f0) && i10 != i7) {
            f1.e0 e0VarG = ((f1.f0) obj).g();
            this.f10087l.put(obj, e0VarG.f4941f);
            s.c0 c0Var2 = e0VarG.f4940e;
            h0 h0Var = this.k;
            k9.a.L(h0Var, obj);
            Object[] objArr = c0Var2.f12398b;
            long[] jArr = c0Var2.f12397a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j5 = jArr[i11];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j5 & 255) < 128) {
                                z zVar = (z) objArr[(i11 << 3) + i13];
                                if (zVar instanceof a0) {
                                    ((a0) zVar).e(2);
                                }
                                k9.a.h(h0Var, zVar, obj);
                            }
                            j5 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            if (obj instanceof a0) {
                ((a0) obj).e(2);
            }
            k9.a.h(this.f10081e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        h0 h0Var = this.f10081e;
        k9.a.K(h0Var, obj2, obj);
        if (!(obj2 instanceof f1.f0) || h0Var.c(obj2)) {
            return;
        }
        k9.a.L(this.k, obj2);
        this.f10087l.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0 A[EDGE_INSN: B:46:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j5;
        long j10;
        boolean z10;
        h0 h0Var = this.f10082f;
        long[] jArr3 = h0Var.f12437a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j11 = jArr3[i7];
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j11 & 255) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj = h0Var.f12438b[i12];
                        j10 = j12;
                        s.c0 c0Var = (s.c0) h0Var.f12439c[i12];
                        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zP = ((r1) obj).p();
                        if (zP) {
                            jArr2 = jArr3;
                            j5 = j11;
                            z10 = zP;
                        } else {
                            Object[] objArr = c0Var.f12398b;
                            int[] iArr = c0Var.f12399c;
                            long[] jArr4 = c0Var.f12397a;
                            char c10 = '\b';
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j5 = j11;
                                int i13 = 0;
                                while (true) {
                                    long j13 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    z10 = zP;
                                    if ((((~j13) << 7) & j13 & j10) == j10) {
                                        if (i13 != length2) {
                                            break;
                                            break;
                                        }
                                        i13++;
                                        zP = z10;
                                        jArr4 = jArr5;
                                        c10 = '\b';
                                    } else {
                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j13 & 255) < 128) {
                                                int i16 = (i13 << 3) + i15;
                                                Object obj2 = objArr[i16];
                                                int i17 = iArr[i16];
                                                d(obj, obj2);
                                            }
                                            j13 >>= c10;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length2) {
                                            break;
                                        }
                                        i13++;
                                        zP = z10;
                                        jArr4 = jArr5;
                                        c10 = '\b';
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j5 = j11;
                                z10 = zP;
                            }
                        }
                        if (!z10) {
                            h0Var.l(i12);
                        }
                    } else {
                        jArr2 = jArr3;
                        j5 = j11;
                        j10 = j12;
                    }
                    i11++;
                    j11 = j5 >> 8;
                    j12 = j10;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i10 != 8) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            jArr3 = jArr;
        }
    }
}
