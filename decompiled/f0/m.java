package f0;

import cc.y;
import d0.h0;
import f1.b1;
import h0.b0;
import h0.x;
import h0.z;
import java.util.ArrayList;
import java.util.List;
import o2.i1;
import o2.n0;
import z.n1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4794a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f4795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f4796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.g f4797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f4798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f4799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1 f4800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4801h;

    public m(u uVar, h0 h0Var, o9.r rVar, d0.g gVar, y yVar, y1.v vVar, b0 b0Var, r1.f fVar) {
        this.f4800g = uVar;
        this.f4795b = h0Var;
        this.f4796c = rVar;
        this.f4797d = gVar;
        this.f4798e = yVar;
        this.f4799f = b0Var;
        this.f4801h = fVar;
    }

    public m(g0.v vVar, h0 h0Var, o9.r rVar, g0.c cVar, d0.g gVar, d0.e eVar, y yVar, y1.v vVar2, b0 b0Var) {
        this.f4800g = vVar;
        this.f4795b = h0Var;
        this.f4796c = rVar;
        this.f4801h = cVar;
        this.f4797d = gVar;
        this.f4798e = yVar;
        this.f4799f = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0329  */
    /* JADX WARN: Code duplicated, block: B:112:0x033b  */
    /* JADX WARN: Code duplicated, block: B:115:0x033f  */
    /* JADX WARN: Code duplicated, block: B:119:0x034f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0362  */
    /* JADX WARN: Code duplicated, block: B:126:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0394  */
    /* JADX WARN: Code duplicated, block: B:135:0x0397  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a7 A[LOOP:4: B:134:0x0395->B:138:0x03a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b7 A[LOOP:5: B:142:0x03b7->B:149:0x03d6, LOOP_START, PHI: r9 r15
      0x03b7: PHI (r9v61 int) = (r9v21 int), (r9v65 int) binds: [B:141:0x03b5, B:149:0x03d6] A[DONT_GENERATE, DONT_INLINE]
      0x03b7: PHI (r15v41 java.util.List) = (r15v15 java.util.List), (r15v42 java.util.List) binds: [B:141:0x03b5, B:149:0x03d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x03c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d6 A[LOOP:5: B:142:0x03b7->B:149:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x03db  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e6 A[LOOP:6: B:153:0x03e4->B:154:0x03e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0419  */
    /* JADX WARN: Code duplicated, block: B:159:0x041d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0431 A[LOOP:7: B:158:0x041b->B:162:0x0431, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x043a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0558  */
    /* JADX WARN: Code duplicated, block: B:240:0x057b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0587 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x0589  */
    /* JADX WARN: Code duplicated, block: B:247:0x059a  */
    /* JADX WARN: Code duplicated, block: B:250:0x05a5 A[LOOP:15: B:249:0x05a3->B:250:0x05a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:262:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:263:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:270:0x0602  */
    /* JADX WARN: Code duplicated, block: B:275:0x060f  */
    /* JADX WARN: Code duplicated, block: B:278:0x061d A[LOOP:16: B:277:0x061b->B:278:0x061d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0630  */
    /* JADX WARN: Code duplicated, block: B:292:0x066c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0675  */
    /* JADX WARN: Code duplicated, block: B:296:0x0686 A[LOOP:19: B:295:0x0684->B:296:0x0686, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x06a7 A[LOOP:20: B:298:0x06a5->B:299:0x06a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x06c0 A[LOOP:21: B:301:0x06be->B:302:0x06c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:307:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:309:0x0708  */
    /* JADX WARN: Code duplicated, block: B:311:0x070f A[LOOP:18: B:310:0x070d->B:311:0x070f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:314:0x071f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0728  */
    /* JADX WARN: Code duplicated, block: B:318:0x072a  */
    /* JADX WARN: Code duplicated, block: B:321:0x0734  */
    /* JADX WARN: Code duplicated, block: B:322:0x0739  */
    /* JADX WARN: Code duplicated, block: B:325:0x0743  */
    /* JADX WARN: Code duplicated, block: B:326:0x0748  */
    /* JADX WARN: Code duplicated, block: B:329:0x0769  */
    /* JADX WARN: Code duplicated, block: B:331:0x0771  */
    /* JADX WARN: Code duplicated, block: B:332:0x0778  */
    /* JADX WARN: Code duplicated, block: B:333:0x077a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0780  */
    /* JADX WARN: Code duplicated, block: B:336:0x0782  */
    /* JADX WARN: Code duplicated, block: B:339:0x078c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0794  */
    /* JADX WARN: Code duplicated, block: B:343:0x079c  */
    /* JADX WARN: Code duplicated, block: B:345:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:346:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:348:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:353:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:356:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:357:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:359:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:360:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:384:0x03af A[EDGE_INSN: B:384:0x03af->B:140:0x03af BREAK  A[LOOP:4: B:134:0x0395->B:138:0x03a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x03d9 A[EDGE_INSN: B:385:0x03d9->B:150:0x03d9 BREAK  A[LOOP:5: B:142:0x03b7->B:149:0x03d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x043f A[EDGE_INSN: B:387:0x043f->B:164:0x043f BREAK  A[LOOP:7: B:158:0x041b->B:162:0x0431], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0389 A[ADDED_TO_REGION, EDGE_INSN: B:416:0x0389->B:130:0x0389 BREAK  A[LOOP:22: B:123:0x0360->B:129:0x037a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.util.Collection, java.util.List] */
    private final n0 b(x xVar, long j5) throws Throwable {
        int i7;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        int i16;
        p pVar;
        int iC;
        int i17;
        p pVar2;
        int iMax;
        int i18;
        float f12;
        List arrayList;
        int size;
        int size2;
        int iMax2;
        int i19;
        int iMin;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList2;
        List arrayList3;
        int size3;
        int i23;
        int size4;
        int iMax3;
        int i24;
        boolean z10;
        int iG;
        int iF;
        int i25;
        boolean z11;
        ArrayList arrayList4;
        p pVar3;
        boolean z12;
        int size5;
        int i26;
        int i27;
        int iC2;
        int i28;
        int i29;
        int size6;
        int i30;
        int i31;
        Object obj;
        p pVar4;
        int i32;
        p pVar5;
        int i33;
        Object obj2;
        p pVar6;
        Integer numValueOf;
        p pVar7;
        Integer numValueOf2;
        boolean z13;
        int iIntValue;
        int iIntValue2;
        o oVar;
        i1 i1Var;
        p pVar8;
        p pVar9;
        int iF2;
        int size7;
        int i34;
        int iC3;
        int[] iArr;
        int i35;
        int[] iArr2;
        int i36;
        int iIntValue3;
        p pVar10;
        float f13;
        p pVar11;
        Object obj3;
        int i37;
        Object obj4;
        int i38;
        int iMin2;
        p pVar12;
        Object obj5;
        ArrayList arrayList5;
        int i39;
        int iIntValue4;
        boolean zA = n3.m.a(0L, 0L);
        i1 i1Var2 = xVar.f6405b;
        u uVar = (u) this.f4800g;
        uVar.f4869s.getValue();
        boolean z14 = uVar.f4853b || i1Var2.Q();
        x0 x0Var = x0.f15591a;
        n4.h.n(j5, x0Var);
        n3.o layoutDirection = i1Var2.getLayoutDirection();
        h0 h0Var = this.f4795b;
        int iA0 = i1Var2.a0(h0Var.a(layoutDirection));
        int iA1 = i1Var2.a0(h0Var.b(i1Var2.getLayoutDirection()));
        int iA2 = i1Var2.a0(h0Var.f3572b);
        int iA3 = i1Var2.a0(h0Var.f3574d) + iA2;
        int i40 = iA1 + iA0;
        int i41 = iA3 - iA2;
        long jI = n3.b.i(-i40, -iA3, j5);
        j jVar = (j) this.f4796c.invoke();
        c cVar = jVar.f4780c;
        int iH = n3.a.h(jI);
        int iG2 = n3.a.g(jI);
        cVar.f4764a.g(iH);
        cVar.f4765b.g(iG2);
        d0.g gVar = this.f4797d;
        if (gVar == null) {
            c0.b.b("null verticalArrangement when isVertical == true");
            throw new cc.s();
        }
        int iA4 = i1Var2.a0(gVar.a());
        int i42 = jVar.f4779b.k().f5998b;
        int iG3 = n3.a.g(j5) - iA3;
        long j11 = jI;
        l lVar = new l(j11, jVar, xVar, i42, iA4, (r1.f) this.f4801h, iA2, i41, (((long) iA0) << 32) | (((long) iA2) & 4294967295L), (u) this.f4800g);
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            r rVar = uVar.f4856e;
            int iF3 = rVar.f4839b.f();
            int i43 = z.i(iF3, jVar, rVar.f4842e);
            if (iF3 != i43) {
                rVar.f4839b.g(i43);
                rVar.f4843f.b(iF3);
            }
            int iF4 = rVar.f4840c.f();
            n4.e.r(fVarH, fVarK, kVarE);
            List listG = z.g(jVar, uVar.f4868r, uVar.f4865o);
            float fFloatValue = (i1Var2.Q() || !z14) ? uVar.f4859h : ((Number) ((v.k) uVar.f4873w.f12991c).f13387b.getValue()).floatValue();
            androidx.compose.foundation.lazy.layout.b bVar = uVar.f4864n;
            boolean zQ = i1Var2.Q();
            o oVar2 = uVar.f4854c;
            b1 b1Var = uVar.f4872v;
            if (iA2 < 0) {
                c0.b.a("invalid beforeContentPadding");
            }
            if (r11 < 0) {
                c0.b.a("invalid afterContentPadding");
            }
            u8.x xVar2 = u8.x.f13123a;
            float f14 = fFloatValue;
            j jVar2 = lVar.f4784b;
            y yVar = this.f4798e;
            u8.w wVar = u8.w.f13122a;
            if (i42 <= 0) {
                int iJ = n3.a.j(j11);
                int i44 = n3.a.i(j11);
                bVar.c(iJ, i44, new ArrayList(), jVar2.f4781d, lVar, zQ, 1, z14, 0, 0);
                if (!zQ) {
                    bVar.b();
                    if (!zA) {
                        iJ = n3.b.g((int) 0, j11);
                        i44 = n3.b.f((int) 0, j11);
                    }
                }
                int i45 = iG3 + r11;
                i1Var = i1Var2;
                oVar = new o(null, 0, false, 0.0f, i1Var2.i(n3.b.g(iJ + i40, j5), n3.b.f(i44 + iA3, j5), xVar2, new u7.d(27)), 0.0f, false, yVar, xVar, lVar.f4786d, wVar, -iA2, i45, 0, x0Var, i41, iA4);
            } else {
                if (i43 >= i42) {
                    i7 = i42 - 1;
                    i10 = 0;
                } else {
                    i7 = i43;
                    i10 = iF4;
                }
                int iRound = Math.round(f14);
                int i46 = i10 - iRound;
                if (i7 == 0 && i46 < 0) {
                    iRound += i46;
                    i46 = 0;
                }
                u8.k kVar = new u8.k();
                int i47 = -iA2;
                if (iA4 < 0) {
                    i12 = iA4;
                    i11 = i12;
                } else {
                    i11 = iA4;
                    i12 = 0;
                }
                int i48 = i47 + i12;
                int i49 = i46 + i48;
                int i50 = i7;
                int iMax4 = 0;
                while (true) {
                    j10 = lVar.f4786d;
                    if (i49 >= 0 || i50 <= 0) {
                        break;
                    }
                    int i51 = i47;
                    int i52 = i50 - 1;
                    p pVarW0 = lVar.w0(i52, j10);
                    kVar.add(0, pVarW0);
                    iMax4 = Math.max(iMax4, pVarW0.f4833m);
                    i49 += pVarW0.f4832l;
                    i50 = i52;
                    i47 = i51;
                }
                int i53 = i47;
                if (i49 < i48) {
                    iRound -= i48 - i49;
                    i49 = i48;
                }
                int i54 = iRound;
                int i55 = i49 - i48;
                int i56 = iG3 + r11;
                int i57 = iMax4;
                int i58 = i56 < 0 ? 0 : i56;
                int i59 = -i55;
                int i60 = i50;
                int i61 = 0;
                boolean z15 = false;
                while (i61 < kVar.f13115c) {
                    if (i59 >= i58) {
                        kVar.d(i61);
                        z15 = true;
                    } else {
                        i60++;
                        i59 += ((p) kVar.get(i61)).f4832l;
                        i61++;
                    }
                }
                int iMax5 = i57;
                int i62 = i55;
                boolean z16 = z15;
                int i63 = i60;
                while (i63 < i42 && (i59 < i58 || i59 <= 0 || kVar.isEmpty())) {
                    int i64 = i58;
                    p pVarW1 = lVar.w0(i63, j10);
                    long j12 = j11;
                    int i65 = pVarW1.f4832l;
                    i59 += i65;
                    if (i59 > i48 || i63 == i42 - 1) {
                        int iMax6 = Math.max(iMax5, pVarW1.f4833m);
                        kVar.addLast(pVarW1);
                        iMax5 = iMax6;
                    } else {
                        i62 -= i65;
                        i50 = i63 + 1;
                        z16 = true;
                    }
                    i63++;
                    i58 = i64;
                    j11 = j12;
                }
                long j13 = j11;
                int i66 = iG3;
                if (i59 < i66) {
                    int i67 = i66 - i59;
                    i59 += i67;
                    int i68 = i62 - i67;
                    while (i68 < iA2 && i50 > 0) {
                        int i69 = i50 - 1;
                        int i70 = i67;
                        p pVarW2 = lVar.w0(i69, j10);
                        kVar.add(0, pVarW2);
                        iMax5 = Math.max(iMax5, pVarW2.f4833m);
                        i68 += pVarW2.f4832l;
                        i50 = i69;
                        i67 = i70;
                    }
                    i62 = i68;
                    i13 = i54 + i67;
                    if (i62 < 0) {
                        i13 += i62;
                        i59 += i62;
                        i15 = i50;
                        i14 = 0;
                    }
                    int i71 = iMax5;
                    if (Integer.signum(Math.round(f14)) == Integer.signum(i13) || Math.abs(Math.round(f14)) < Math.abs(i13)) {
                        f10 = f14;
                    } else {
                        f10 = i13;
                    }
                    float f15 = f14 - f10;
                    if (zQ || i13 <= i54 || f15 > 0.0f) {
                        f11 = 0.0f;
                    } else {
                        f11 = (i13 - i54) + f15;
                    }
                    if (i14 < 0) {
                        c0.b.a("negative currentFirstItemScrollOffset");
                    }
                    i16 = -i14;
                    pVar = (p) kVar.first();
                    if (iA2 <= 0 || i11 < 0) {
                        iC = kVar.c();
                        p pVar13 = pVar;
                        i17 = 0;
                        while (i17 < iC) {
                            int i72 = iC;
                            int i73 = ((p) kVar.get(i17)).f4832l;
                            if (i14 != 0 || i73 > i14 || i17 == n3.l.A(kVar)) {
                                break;
                            }
                            i14 -= i73;
                            i17++;
                            pVar13 = (p) kVar.get(i17);
                            iC = i72;
                        }
                        pVar2 = pVar13;
                    } else {
                        pVar2 = pVar;
                    }
                    int i74 = i14;
                    iMax = Math.max(0, i15);
                    i18 = i15 - 1;
                    if (iMax <= i18) {
                        arrayList = null;
                        while (true) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            f12 = f10;
                            arrayList.add(lVar.w0(i18, j10));
                            if (i18 != iMax) {
                                break;
                            }
                            i18--;
                            f10 = f12;
                        }
                    } else {
                        f12 = f10;
                        arrayList = null;
                    }
                    size = listG.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            i39 = size - 1;
                            iIntValue4 = ((Number) listG.get(size)).intValue();
                            if (iIntValue4 < iMax) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(lVar.w0(iIntValue4, j10));
                            }
                            if (i39 < 0) {
                                break;
                            }
                            size = i39;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = wVar;
                    }
                    iMax2 = i71;
                    i19 = 0;
                    for (size2 = arrayList.size(); i19 < size2; size2 = size2) {
                        iMax2 = Math.max(iMax2, ((p) arrayList.get(i19)).f4833m);
                        i19++;
                    }
                    int i75 = i42 - 1;
                    iMin = Math.min(((p) u8.p.s0(kVar)).f4822a, i75);
                    int i76 = iMax2;
                    i20 = ((p) u8.p.s0(kVar)).f4822a + 1;
                    if (i20 <= iMin) {
                        arrayList5 = null;
                        while (true) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            i21 = i63;
                            i22 = i16;
                            arrayList2 = arrayList5;
                            arrayList2.add(lVar.w0(i20, j10));
                            if (i20 != iMin) {
                                break;
                            }
                            i20++;
                            arrayList5 = arrayList2;
                            i16 = i22;
                            i63 = i21;
                        }
                    } else {
                        i21 = i63;
                        i22 = i16;
                        arrayList2 = null;
                    }
                    if (zQ || oVar2 == null) {
                        i66 = i66;
                        arrayList = arrayList;
                        arrayList3 = arrayList2;
                    } else {
                        ?? r8 = oVar2.k;
                        if (r8.isEmpty()) {
                            i66 = i66;
                            arrayList = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            int size8 = r8.size() - 1;
                            ArrayList arrayList6 = arrayList2;
                            while (true) {
                                if (-1 >= size8) {
                                    pVar10 = null;
                                    break;
                                }
                                if (((p) r8.get(size8)).f4822a > iMin && (size8 == 0 || ((p) r8.get(size8 - 1)).f4822a <= iMin)) {
                                    pVar10 = (p) r8.get(size8);
                                    break;
                                }
                                size8--;
                            }
                            p pVar14 = (p) u8.p.s0(r8);
                            if (pVar10 != null && (i38 = pVar10.f4822a) <= (iMin2 = Math.min(pVar14.f4822a, i75))) {
                                arrayList3 = arrayList6;
                                while (true) {
                                    if (arrayList3 != null) {
                                        int size9 = arrayList3.size();
                                        int i77 = 0;
                                        while (true) {
                                            if (i77 >= size9) {
                                                obj5 = null;
                                                break;
                                            }
                                            obj5 = arrayList3.get(i77);
                                            int i78 = i77;
                                            if (((p) obj5).f4822a == i38) {
                                                break;
                                            }
                                            i77 = i78 + 1;
                                        }
                                        pVar12 = (p) obj5;
                                    } else {
                                        pVar12 = null;
                                    }
                                    if (pVar12 == null) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(lVar.w0(i38, j10));
                                    }
                                    if (i38 == iMin2) {
                                        break;
                                    }
                                    i38++;
                                    arrayList = arrayList;
                                    i66 = i66;
                                }
                            } else {
                                i66 = i66;
                                arrayList = arrayList;
                                arrayList3 = arrayList6;
                            }
                            float f16 = ((oVar2.f4817m - pVar14.f4831j) - pVar14.k) - f12;
                            if (f16 > 0.0f) {
                                int i79 = pVar14.f4822a + 1;
                                int i80 = 0;
                                while (i79 < i42 && i80 < f16) {
                                    if (i79 <= iMin) {
                                        int iC4 = kVar.c();
                                        int i81 = 0;
                                        while (true) {
                                            if (i81 >= iC4) {
                                                f13 = f16;
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = kVar.get(i81);
                                            f13 = f16;
                                            if (((p) obj4).f4822a == i79) {
                                                break;
                                            }
                                            i81++;
                                            f16 = f13;
                                        }
                                        pVar11 = (p) obj4;
                                    } else {
                                        f13 = f16;
                                        if (arrayList3 != null) {
                                            int size10 = arrayList3.size();
                                            int i82 = 0;
                                            while (true) {
                                                if (i82 >= size10) {
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = arrayList3.get(i82);
                                                if (((p) obj3).f4822a == i79) {
                                                    break;
                                                }
                                                i82++;
                                            }
                                            pVar11 = (p) obj3;
                                        } else {
                                            pVar11 = null;
                                        }
                                    }
                                    if (pVar11 != null) {
                                        i79++;
                                        i37 = pVar11.f4832l;
                                    } else {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(lVar.w0(i79, j10));
                                        i79++;
                                        i37 = ((p) u8.p.s0(arrayList3)).f4832l;
                                    }
                                    i80 += i37;
                                    f16 = f13;
                                }
                            }
                        }
                    }
                    if (arrayList3 != null && ((p) u8.p.s0(arrayList3)).f4822a > iMin) {
                        iMin = ((p) u8.p.s0(arrayList3)).f4822a;
                    }
                    size3 = listG.size();
                    for (i23 = 0; i23 < size3; i23++) {
                        iIntValue3 = ((Number) listG.get(i23)).intValue();
                        if (iIntValue3 <= iMin) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(lVar.w0(iIntValue3, j10));
                        }
                    }
                    if (arrayList3 == null) {
                        arrayList3 = wVar;
                    }
                    size4 = arrayList3.size();
                    iMax3 = i76;
                    for (i24 = 0; i24 < size4; i24++) {
                        iMax3 = Math.max(iMax3, ((p) arrayList3.get(i24)).f4833m);
                    }
                    if (!i9.l.a(pVar2, kVar.first()) && arrayList.isEmpty() && arrayList3.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iG = n3.b.g(iMax3, j13);
                    iF = n3.b.f(i59, j13);
                    i25 = i66;
                    if (i59 < Math.min(iF, i25)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && i22 != 0) {
                        c0.b.c("non-zero itemsScrollOffset");
                    }
                    arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + kVar.c());
                    if (z11) {
                        if (arrayList.isEmpty() || !arrayList3.isEmpty()) {
                            c0.b.a("no extra items");
                        }
                        iC3 = kVar.c();
                        iArr = new int[iC3];
                        for (i35 = 0; i35 < iC3; i35++) {
                            iArr[i35] = ((p) kVar.get(i35)).k;
                        }
                        iArr2 = new int[iC3];
                        if (gVar != null) {
                            c0.b.b("null verticalArrangement when isVertical == true");
                            throw new cc.s();
                        }
                        gVar.b(iF, xVar, iArr, iArr2);
                        n9.d dVarY0 = u8.l.y0(iArr2);
                        int i83 = dVarY0.f8965a;
                        pVar3 = pVar2;
                        int i84 = dVarY0.f8966b;
                        i36 = dVarY0.f8967c;
                        if ((i36 <= 0 && i83 <= i84) || (i36 < 0 && i84 <= i83)) {
                            while (true) {
                                int i85 = iArr2[i83];
                                z12 = z10;
                                p pVar15 = (p) kVar.get(i83);
                                pVar15.k(i85, iG, iF);
                                arrayList4.add(pVar15);
                                if (i83 == i84) {
                                    break;
                                }
                                i83 += i36;
                                z10 = z12;
                            }
                        }
                    } else {
                        pVar3 = pVar2;
                        z12 = z10;
                        i26 = i22;
                        i27 = 0;
                        for (size5 = arrayList.size(); i27 < size5; size5 = size5) {
                            p pVar16 = (p) arrayList.get(i27);
                            i26 -= pVar16.f4832l;
                            pVar16.k(i26, iG, iF);
                            arrayList4.add(pVar16);
                            i27++;
                        }
                        iC2 = kVar.c();
                        i28 = i22;
                        for (i29 = 0; i29 < iC2; i29++) {
                            p pVar17 = (p) kVar.get(i29);
                            pVar17.k(i28, iG, iF);
                            arrayList4.add(pVar17);
                            i28 += pVar17.f4832l;
                        }
                        size6 = arrayList3.size();
                        for (i30 = 0; i30 < size6; i30++) {
                            p pVar18 = (p) arrayList3.get(i30);
                            pVar18.k(i28, iG, iF);
                            arrayList4.add(pVar18);
                            i28 += pVar18.f4832l;
                        }
                    }
                    bVar.c(iG, iF, arrayList4, jVar2.f4781d, lVar, zQ, 1, z14, i74, i59);
                    int i86 = i59;
                    if (zQ) {
                        i31 = iF;
                    } else {
                        bVar.b();
                        if (zA) {
                            i31 = iF;
                        } else {
                            iG = n3.b.g(Math.max(iG, (int) 0), j13);
                            iF2 = n3.b.f(Math.max(iF, (int) 0), j13);
                            if (iF2 != iF) {
                                size7 = arrayList4.size();
                                for (i34 = 0; i34 < size7; i34++) {
                                    ((p) arrayList4.get(i34)).f4835o = iF2;
                                }
                            }
                            i31 = iF2;
                        }
                    }
                    int i87 = iG;
                    if (kVar.isEmpty()) {
                        obj = null;
                    } else {
                        obj = kVar.f13114b[kVar.f13113a];
                    }
                    pVar4 = (p) obj;
                    if (pVar4 != null) {
                        i32 = pVar4.f4822a;
                    } else {
                        i32 = 0;
                    }
                    pVar5 = (p) kVar.o();
                    if (pVar5 != null) {
                        i33 = pVar5.f4822a;
                    } else {
                        i33 = 0;
                    }
                    jVar2.f4779b.getClass();
                    List listF = z.f(this.f4799f, i32, i33, arrayList4, s.j.f12449a, iA2, i87, i31, new c8.k(3, lVar));
                    if (z12) {
                        pVar9 = (p) u8.p.m0(arrayList4);
                        if (pVar9 != null) {
                            numValueOf = Integer.valueOf(pVar9.f4822a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        if (kVar.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = kVar.f13114b[kVar.f13113a];
                        }
                        pVar6 = (p) obj2;
                        if (pVar6 != null) {
                            numValueOf = Integer.valueOf(pVar6.f4822a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z12) {
                        pVar8 = (p) u8.p.t0(arrayList4);
                        if (pVar8 != null) {
                            numValueOf2 = Integer.valueOf(pVar8.f4822a);
                        } else {
                            numValueOf2 = null;
                        }
                    } else {
                        pVar7 = (p) kVar.o();
                        if (pVar7 != null) {
                            numValueOf2 = Integer.valueOf(pVar7.f4822a);
                        } else {
                            numValueOf2 = null;
                        }
                    }
                    if (i21 >= i42 || i86 > i25) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n0 n0VarI = i1Var2.i(n3.b.g(i87 + i40, j5), n3.b.f(i31 + iA3, j5), xVar2, new n(b1Var, arrayList4, listF, zQ, 0));
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    List listM = z.m(iIntValue, iIntValue2, arrayList4, listF);
                    i1Var = i1Var2;
                    oVar = new o(pVar3, i74, z13, f12, n0VarI, f11, z16, yVar, xVar, lVar.f4786d, listM, i53, i56, i42, x0Var, r11, i11);
                } else {
                    i13 = i54;
                }
                i14 = i62;
                i15 = i50;
                int i710 = iMax5;
                if (Integer.signum(Math.round(f14)) == Integer.signum(i13)) {
                    f10 = f14;
                } else {
                    f10 = f14;
                }
                float f17 = f14 - f10;
                if (zQ) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                }
                if (i14 < 0) {
                    c0.b.a("negative currentFirstItemScrollOffset");
                }
                i16 = -i14;
                pVar = (p) kVar.first();
                if (iA2 <= 0) {
                    iC = kVar.c();
                    p pVar19 = pVar;
                    i17 = 0;
                    while (i17 < iC) {
                        int i711 = iC;
                        int i712 = ((p) kVar.get(i17)).f4832l;
                        if (i14 != 0) {
                            break;
                        }
                        break;
                    }
                    pVar2 = pVar19;
                } else {
                    iC = kVar.c();
                    p pVar110 = pVar;
                    i17 = 0;
                    while (i17 < iC) {
                        int i713 = iC;
                        int i714 = ((p) kVar.get(i17)).f4832l;
                        if (i14 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    pVar2 = pVar110;
                }
                int i715 = i14;
                iMax = Math.max(0, i15);
                i18 = i15 - 1;
                if (iMax <= i18) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        f12 = f10;
                        arrayList.add(lVar.w0(i18, j10));
                        if (i18 != iMax) {
                            break;
                            break;
                        }
                        i18--;
                        f10 = f12;
                    }
                } else {
                    f12 = f10;
                    arrayList = null;
                }
                size = listG.size() - 1;
                if (size >= 0) {
                    while (true) {
                        i39 = size - 1;
                        iIntValue4 = ((Number) listG.get(size)).intValue();
                        if (iIntValue4 < iMax) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(lVar.w0(iIntValue4, j10));
                        }
                        if (i39 < 0) {
                            break;
                            break;
                        }
                        size = i39;
                    }
                }
                if (arrayList == null) {
                    arrayList = wVar;
                }
                iMax2 = i710;
                i19 = 0;
                while (i19 < size2) {
                    iMax2 = Math.max(iMax2, ((p) arrayList.get(i19)).f4833m);
                    i19++;
                }
                int i716 = i42 - 1;
                iMin = Math.min(((p) u8.p.s0(kVar)).f4822a, i716);
                int i717 = iMax2;
                i20 = ((p) u8.p.s0(kVar)).f4822a + 1;
                if (i20 <= iMin) {
                    arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i21 = i63;
                        i22 = i16;
                        arrayList2 = arrayList5;
                        arrayList2.add(lVar.w0(i20, j10));
                        if (i20 != iMin) {
                            break;
                            break;
                        }
                        i20++;
                        arrayList5 = arrayList2;
                        i16 = i22;
                        i63 = i21;
                    }
                } else {
                    i21 = i63;
                    i22 = i16;
                    arrayList2 = null;
                }
                if (zQ) {
                    i66 = i66;
                    arrayList = arrayList;
                    arrayList3 = arrayList2;
                } else {
                    i66 = i66;
                    arrayList = arrayList;
                    arrayList3 = arrayList2;
                }
                if (arrayList3 != null) {
                    iMin = ((p) u8.p.s0(arrayList3)).f4822a;
                }
                size3 = listG.size();
                while (i23 < size3) {
                    iIntValue3 = ((Number) listG.get(i23)).intValue();
                    if (iIntValue3 <= iMin) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(lVar.w0(iIntValue3, j10));
                    }
                }
                if (arrayList3 == null) {
                    arrayList3 = wVar;
                }
                size4 = arrayList3.size();
                iMax3 = i717;
                while (i24 < size4) {
                    iMax3 = Math.max(iMax3, ((p) arrayList3.get(i24)).f4833m);
                }
                if (!i9.l.a(pVar2, kVar.first())) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                iG = n3.b.g(iMax3, j13);
                iF = n3.b.f(i59, j13);
                i25 = i66;
                if (i59 < Math.min(iF, i25)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c0.b.c("non-zero itemsScrollOffset");
                }
                arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + kVar.c());
                if (z11) {
                    if (arrayList.isEmpty()) {
                        c0.b.a("no extra items");
                    } else {
                        c0.b.a("no extra items");
                    }
                    iC3 = kVar.c();
                    iArr = new int[iC3];
                    while (i35 < iC3) {
                        iArr[i35] = ((p) kVar.get(i35)).k;
                    }
                    iArr2 = new int[iC3];
                    if (gVar != null) {
                        c0.b.b("null verticalArrangement when isVertical == true");
                        throw new cc.s();
                    }
                    gVar.b(iF, xVar, iArr, iArr2);
                    n9.d dVarY1 = u8.l.y0(iArr2);
                    int i88 = dVarY1.f8965a;
                    pVar3 = pVar2;
                    int i89 = dVarY1.f8966b;
                    i36 = dVarY1.f8967c;
                    z12 = i36 <= 0 ? z10 : z10;
                } else {
                    pVar3 = pVar2;
                    z12 = z10;
                    i26 = i22;
                    i27 = 0;
                    while (i27 < size5) {
                        p pVar111 = (p) arrayList.get(i27);
                        i26 -= pVar111.f4832l;
                        pVar111.k(i26, iG, iF);
                        arrayList4.add(pVar111);
                        i27++;
                    }
                    iC2 = kVar.c();
                    i28 = i22;
                    while (i29 < iC2) {
                        p pVar112 = (p) kVar.get(i29);
                        pVar112.k(i28, iG, iF);
                        arrayList4.add(pVar112);
                        i28 += pVar112.f4832l;
                    }
                    size6 = arrayList3.size();
                    while (i30 < size6) {
                        p pVar113 = (p) arrayList3.get(i30);
                        pVar113.k(i28, iG, iF);
                        arrayList4.add(pVar113);
                        i28 += pVar113.f4832l;
                    }
                }
                bVar.c(iG, iF, arrayList4, jVar2.f4781d, lVar, zQ, 1, z14, i715, i59);
                int i810 = i59;
                if (zQ) {
                    bVar.b();
                    if (zA) {
                        iG = n3.b.g(Math.max(iG, (int) 0), j13);
                        iF2 = n3.b.f(Math.max(iF, (int) 0), j13);
                        if (iF2 != iF) {
                            size7 = arrayList4.size();
                            while (i34 < size7) {
                                ((p) arrayList4.get(i34)).f4835o = iF2;
                            }
                        }
                        i31 = iF2;
                    } else {
                        i31 = iF;
                    }
                } else {
                    i31 = iF;
                }
                int i811 = iG;
                if (kVar.isEmpty()) {
                    obj = null;
                } else {
                    obj = kVar.f13114b[kVar.f13113a];
                }
                pVar4 = (p) obj;
                if (pVar4 != null) {
                    i32 = pVar4.f4822a;
                } else {
                    i32 = 0;
                }
                pVar5 = (p) kVar.o();
                if (pVar5 != null) {
                    i33 = pVar5.f4822a;
                } else {
                    i33 = 0;
                }
                jVar2.f4779b.getClass();
                List listF2 = z.f(this.f4799f, i32, i33, arrayList4, s.j.f12449a, iA2, i811, i31, new c8.k(3, lVar));
                if (z12) {
                    pVar9 = (p) u8.p.m0(arrayList4);
                    if (pVar9 != null) {
                        numValueOf = Integer.valueOf(pVar9.f4822a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    if (kVar.isEmpty()) {
                        obj2 = null;
                    } else {
                        obj2 = kVar.f13114b[kVar.f13113a];
                    }
                    pVar6 = (p) obj2;
                    if (pVar6 != null) {
                        numValueOf = Integer.valueOf(pVar6.f4822a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z12) {
                    pVar8 = (p) u8.p.t0(arrayList4);
                    if (pVar8 != null) {
                        numValueOf2 = Integer.valueOf(pVar8.f4822a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    pVar7 = (p) kVar.o();
                    if (pVar7 != null) {
                        numValueOf2 = Integer.valueOf(pVar7.f4822a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                if (i21 >= i42) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                n0 n0VarI2 = i1Var2.i(n3.b.g(i811 + i40, j5), n3.b.f(i31 + iA3, j5), xVar2, new n(b1Var, arrayList4, listF2, zQ, 0));
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                List listM2 = z.m(iIntValue, iIntValue2, arrayList4, listF2);
                i1Var = i1Var2;
                oVar = new o(pVar3, i715, z13, f12, n0VarI2, f11, z16, yVar, xVar, lVar.f4786d, listM2, i53, i56, i42, x0Var, r11, i11);
            }
            uVar.f(oVar, i1Var.Q(), false);
            return oVar;
        } catch (Throwable th) {
            n4.e.r(fVarH, fVarK, kVarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x040e  */
    /* JADX WARN: Code duplicated, block: B:154:0x044a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0457  */
    /* JADX WARN: Code duplicated, block: B:159:0x045a  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:201:0x0508  */
    /* JADX WARN: Code duplicated, block: B:204:0x0510  */
    /* JADX WARN: Code duplicated, block: B:205:0x0513  */
    /* JADX WARN: Code duplicated, block: B:208:0x051c  */
    /* JADX WARN: Code duplicated, block: B:225:0x058a  */
    /* JADX WARN: Code duplicated, block: B:230:0x059f  */
    /* JADX WARN: Code duplicated, block: B:231:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:236:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:238:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:240:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:251:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:252:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:259:0x0605 A[LOOP:12: B:258:0x0603->B:259:0x0605, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x0619  */
    /* JADX WARN: Code duplicated, block: B:267:0x0626  */
    /* JADX WARN: Code duplicated, block: B:270:0x0634 A[LOOP:13: B:269:0x0632->B:270:0x0634, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x068b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0699  */
    /* JADX WARN: Code duplicated, block: B:290:0x06b4 A[LOOP:17: B:287:0x069b->B:290:0x06b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:295:0x06d5 A[LOOP:19: B:294:0x06d3->B:295:0x06d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x06ee A[LOOP:20: B:298:0x06ec->B:299:0x06ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x071d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0722  */
    /* JADX WARN: Code duplicated, block: B:306:0x0738  */
    /* JADX WARN: Code duplicated, block: B:308:0x073f A[LOOP:16: B:307:0x073d->B:308:0x073f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:315:0x077c  */
    /* JADX WARN: Code duplicated, block: B:339:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x06b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x05d6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final n0 a(x xVar, long j5) throws Throwable {
        android.support.v4.media.session.r rVar;
        int iC;
        int iF;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        ArrayList arrayList;
        int i15;
        List list;
        int i16;
        ArrayList arrayList2;
        List list2;
        int size2;
        int i17;
        int i18;
        List list3;
        int iC2;
        int i19;
        g0.p pVar;
        int i20;
        int i21;
        int iH;
        int iF2;
        List listX0;
        boolean z11;
        int size3;
        int i22;
        int length;
        ArrayList arrayList3;
        x xVar2;
        int size4;
        int size5;
        int i23;
        int i24;
        int size6;
        int i25;
        g0.o[] oVarArrA;
        int length2;
        int i26;
        int i27;
        int i28;
        List list4;
        int i29;
        boolean z12;
        g0.n nVar;
        int iF3;
        int size7;
        int i30;
        int size8;
        int[] iArr;
        int i31;
        int i32;
        int iIntValue;
        List list5;
        int i33;
        g0.l lVar;
        g0.o oVar;
        int iIntValue2;
        switch (this.f4794a) {
            case 0:
                return b(xVar, j5);
            default:
                boolean zA = n3.m.a(0L, 0L);
                i1 i1Var = xVar.f6405b;
                g0.v vVar = (g0.v) this.f4800g;
                vVar.f5755s.getValue();
                boolean z13 = vVar.f5739b || i1Var.Q();
                x0 x0Var = x0.f15591a;
                n4.h.n(j5, x0Var);
                n3.o layoutDirection = i1Var.getLayoutDirection();
                h0 h0Var = this.f4795b;
                int iA0 = i1Var.a0(h0Var.a(layoutDirection));
                int iA1 = i1Var.a0(h0Var.b(i1Var.getLayoutDirection()));
                int iA2 = i1Var.a0(h0Var.f3572b);
                int iA3 = i1Var.a0(h0Var.f3574d) + iA2;
                int i34 = iA1 + iA0;
                int i35 = iA3 - iA2;
                long jI = n3.b.i(-i34, -iA3, j5);
                g0.i iVar = (g0.i) this.f4796c.invoke();
                g0.s sVar = iVar.f5647b.f5644b;
                g0.c cVar = (g0.c) this.f4801h;
                if (cVar.f5627d != null && n3.a.b(cVar.f5625b, jI) && cVar.f5626c == i1Var.a()) {
                    rVar = cVar.f5627d;
                    i9.l.b(rVar);
                } else {
                    cVar.f5625b = jI;
                    cVar.f5626c = i1Var.a();
                    android.support.v4.media.session.r rVar2 = (android.support.v4.media.session.r) cVar.f5624a.invoke(xVar, new n3.a(jI));
                    cVar.f5627d = rVar2;
                    rVar = rVar2;
                }
                int length3 = ((int[]) rVar.f604b).length;
                android.support.v4.media.session.r rVar3 = rVar;
                if (length3 != sVar.f5728i) {
                    sVar.f5728i = length3;
                    ArrayList arrayList4 = sVar.f5721b;
                    arrayList4.clear();
                    arrayList4.add(new g0.q(0, 0));
                    sVar.f5722c = 0;
                    sVar.f5723d = 0;
                    sVar.f5724e = 0;
                    sVar.f5725f = -1;
                    sVar.f5726g.clear();
                }
                d0.g gVar = this.f4797d;
                int iA4 = i1Var.a0(gVar.a());
                int i36 = iVar.f5647b.k().f5998b;
                int iG = n3.a.g(j5) - iA3;
                i1 i1Var2 = i1Var;
                g0.l lVar2 = new g0.l(iVar, xVar, iA4, (g0.v) this.f4800g, iA2, i35, (((long) iA0) << 32) | (((long) iA2) & 4294967295L));
                g0.m mVar = new g0.m(rVar3, i36, iA4, lVar2, sVar);
                int i37 = i36;
                c8.p pVar2 = new c8.p(9, sVar, mVar);
                c8.k kVar = new c8.k(9, sVar);
                p1.f fVarH = n4.e.h();
                ArrayList arrayList5 = null;
                h9.k kVarE = fVarH != null ? fVarH.e() : null;
                p1.f fVarK = n4.e.k(fVarH);
                try {
                    r rVar4 = vVar.f5741d;
                    int iF4 = rVar4.f4839b.f();
                    int i38 = z.i(iF4, iVar, rVar4.f4842e);
                    if (iF4 != i38) {
                        rVar4.f4839b.g(i38);
                        rVar4.f4843f.b(iF4);
                    }
                    if (i38 < i37 || i37 <= 0) {
                        iC = sVar.c(i38);
                        iF = rVar4.f4840c.f();
                    } else {
                        iC = sVar.c(i37 - 1);
                        iF = 0;
                    }
                    n4.e.r(fVarH, fVarK, kVarE);
                    List listG = z.g(iVar, vVar.f5753q, vVar.f5750n);
                    float fFloatValue = (i1Var2.Q() || !z13) ? vVar.f5744g : ((Number) ((v.k) vVar.f5758v.f12991c).f13387b.getValue()).floatValue();
                    androidx.compose.foundation.lazy.layout.b bVar = vVar.f5749m;
                    boolean zQ = i1Var2.Q();
                    g0.n nVar2 = vVar.f5740c;
                    b1 b1Var = vVar.f5754r;
                    if (iA2 < 0) {
                        c0.b.a("negative beforeContentPadding");
                    }
                    if (i35 < 0) {
                        c0.b.a("negative afterContentPadding");
                    }
                    u8.x xVar3 = u8.x.f13123a;
                    g0.i iVar2 = lVar2.f5661b;
                    y yVar = this.f4798e;
                    u8.w wVar = u8.w.f13122a;
                    if (i37 <= 0) {
                        int iJ = n3.a.j(jI);
                        int i39 = n3.a.i(jI);
                        bVar.c(iJ, i39, new ArrayList(), iVar2.f5648c, lVar2, zQ, length3, z13, 0, 0);
                        if (!zQ) {
                            bVar.b();
                            if (!zA) {
                                iJ = n3.b.g((int) 0, jI);
                                i39 = n3.b.f((int) 0, jI);
                            }
                        }
                        nVar = new g0.n(null, 0, false, 0.0f, i1Var2.i(n3.b.g(iJ + i34, j5), n3.b.f(i39 + iA3, j5), xVar3, new u7.d(27)), 0.0f, false, yVar, xVar, length3, pVar2, kVar, wVar, -iA2, iG + i35, 0, x0Var, i35, iA4);
                    } else {
                        int i40 = iC;
                        float f10 = fFloatValue;
                        g0.l lVar3 = lVar2;
                        int i41 = iA2;
                        int iRound = Math.round(f10);
                        int i42 = iF - iRound;
                        if (i40 == 0 && i42 < 0) {
                            iRound += i42;
                            i42 = 0;
                        }
                        u8.k kVar2 = new u8.k();
                        int i43 = -i41;
                        int i44 = i43 + (iA4 < 0 ? iA4 : 0);
                        int i45 = i42 + i44;
                        while (i45 < 0 && i40 > 0) {
                            u8.x xVar4 = xVar3;
                            int i46 = i40 - 1;
                            g0.p pVarB = mVar.b(i46);
                            i40 = i46;
                            kVar2.add(0, pVarB);
                            i45 += pVarB.f5716g;
                            xVar3 = xVar4;
                        }
                        u8.x xVar5 = xVar3;
                        if (i45 < i44) {
                            iRound -= i44 - i45;
                            i45 = i44;
                        }
                        int i47 = iRound;
                        int i48 = i45 - i44;
                        int i49 = iG + i35;
                        if (i49 < 0) {
                            i49 = 0;
                        }
                        int i50 = -i48;
                        int i51 = i48;
                        int i52 = i40;
                        int i53 = 0;
                        boolean z14 = false;
                        while (i53 < kVar2.f13115c) {
                            if (i50 >= i49) {
                                kVar2.d(i53);
                                z14 = true;
                            } else {
                                i52++;
                                i50 += ((g0.p) kVar2.get(i53)).f5716g;
                                i53++;
                            }
                        }
                        boolean z15 = z14;
                        int i54 = i52;
                        while (true) {
                            if (i54 >= i37 || (i50 >= i49 && i50 > 0 && !kVar2.isEmpty())) {
                                z10 = z15;
                            } else {
                                z10 = z15;
                                g0.p pVarB2 = mVar.b(i54);
                                int i55 = i49;
                                int i56 = pVarB2.f5716g;
                                g0.o[] oVarArr = pVarB2.f5711b;
                                int i57 = i54;
                                if (oVarArr.length != 0) {
                                    i50 += i56;
                                    if (i50 > i44 || ((g0.o) u8.l.G0(oVarArr)).f5693a == i37 - 1) {
                                        kVar2.addLast(pVarB2);
                                        z15 = z10;
                                    } else {
                                        i51 -= i56;
                                        i40 = i57 + 1;
                                        z15 = true;
                                    }
                                    i54 = i57 + 1;
                                    i49 = i55;
                                }
                            }
                        }
                        if (i50 < iG) {
                            int i58 = iG - i50;
                            int i59 = i50 + i58;
                            i11 = i51 - i58;
                            while (i11 < i41 && i40 > 0) {
                                int i60 = i40 - 1;
                                int i61 = i59;
                                g0.p pVarB3 = mVar.b(i60);
                                kVar2.add(0, pVarB3);
                                i11 += pVarB3.f5716g;
                                i59 = i61;
                                i41 = i41;
                                i40 = i60;
                            }
                            int i62 = i59;
                            i7 = i41;
                            i10 = i58 + i47;
                            if (i11 < 0) {
                                i10 += i11;
                                i50 = i62 + i11;
                                i11 = 0;
                            } else {
                                i50 = i62;
                            }
                        } else {
                            i7 = i41;
                            i10 = i47;
                            i11 = i51;
                        }
                        float f11 = (Integer.signum(Math.round(f10)) != Integer.signum(i10) || Math.abs(Math.round(f10)) < Math.abs(i10)) ? f10 : i10;
                        float f12 = f10 - f11;
                        float f13 = (!zQ || i10 <= i47 || f12 > 0.0f) ? 0.0f : (i10 - i47) + f12;
                        if (i11 < 0) {
                            c0.b.a("negative initial offset");
                        }
                        int i63 = -i11;
                        g0.p pVar3 = (g0.p) kVar2.first();
                        float f14 = f13;
                        g0.o oVar2 = (g0.o) u8.l.x0(pVar3.f5711b);
                        int i64 = oVar2 != null ? oVar2.f5693a : 0;
                        float f15 = f11;
                        g0.p pVar4 = (g0.p) kVar2.o();
                        if (pVar4 != null) {
                            g0.o[] oVarArr2 = pVar4.f5711b;
                            i12 = i63;
                            g0.o oVar3 = oVarArr2.length == 0 ? null : oVarArr2[oVarArr2.length - 1];
                            i13 = oVar3 != null ? oVar3.f5693a : 0;
                            size = listG.size();
                            i14 = i11;
                            arrayList = null;
                            i15 = 0;
                            while (true) {
                                g0.s sVar2 = mVar.f5673e;
                                if (i15 < size) {
                                    int i65 = size;
                                    iIntValue2 = ((Number) listG.get(i15)).intValue();
                                    if (iIntValue2 < 0 && iIntValue2 < i64) {
                                        int i66 = sVar2.f5728i;
                                        int iE = sVar2.e(iIntValue2);
                                        g0.o oVarW0 = lVar3.w0(iIntValue2, mVar.a(0, iE), 0, iE, lVar3.f5663d);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        ArrayList arrayList6 = arrayList;
                                        arrayList6.add(oVarW0);
                                        arrayList = arrayList6;
                                    }
                                    i15++;
                                    i64 = i64;
                                    size = i65;
                                } else {
                                    int i67 = i64;
                                    if (arrayList == null) {
                                        list = wVar;
                                    } else {
                                        list = arrayList;
                                    }
                                    if (zQ || nVar2 == null) {
                                        i16 = i13;
                                        arrayList2 = null;
                                    } else {
                                        ?? r10 = nVar2.f5686m;
                                        if (r10.isEmpty()) {
                                            i16 = i13;
                                            arrayList2 = null;
                                        } else {
                                            int size9 = r10.size();
                                            while (true) {
                                                size9--;
                                                if (-1 >= size9) {
                                                    oVar = null;
                                                } else if (((g0.o) r10.get(size9)).f5693a > i13 && (size9 == 0 || ((g0.o) r10.get(size9 - 1)).f5693a <= i13)) {
                                                    oVar = (g0.o) r10.get(size9);
                                                }
                                            }
                                            g0.o oVar4 = (g0.o) u8.p.s0(r10);
                                            g0.p pVar5 = (g0.p) u8.p.t0(kVar2);
                                            int i68 = pVar5 != null ? pVar5.f5710a + 1 : 0;
                                            if (oVar != null) {
                                                int i69 = oVar.f5693a;
                                                i16 = i13;
                                                int iMin = Math.min(oVar4.f5693a, i37 - 1);
                                                if (i69 <= iMin) {
                                                    ArrayList arrayList7 = null;
                                                    while (true) {
                                                        list = list;
                                                        if (arrayList7 != null) {
                                                            int size10 = arrayList7.size();
                                                            int i70 = 0;
                                                            while (true) {
                                                                if (i70 < size10) {
                                                                    int i71 = i70;
                                                                    g0.o[] oVarArr3 = ((g0.p) arrayList7.get(i70)).f5711b;
                                                                    int i72 = size10;
                                                                    int length4 = oVarArr3.length;
                                                                    int i73 = 0;
                                                                    while (true) {
                                                                        if (i73 < length4) {
                                                                            int i74 = i73;
                                                                            if (oVarArr3[i74].f5693a != i69) {
                                                                                i73 = i74 + 1;
                                                                            }
                                                                        } else {
                                                                            i70 = i71 + 1;
                                                                            size10 = i72;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (arrayList7 == null) {
                                                                        arrayList7 = new ArrayList();
                                                                    }
                                                                    g0.p pVarB4 = mVar.b(i68);
                                                                    i68++;
                                                                    arrayList7.add(pVarB4);
                                                                }
                                                            }
                                                        } else {
                                                            if (arrayList7 == null) {
                                                                arrayList7 = new ArrayList();
                                                            }
                                                            g0.p pVarB5 = mVar.b(i68);
                                                            i68++;
                                                            arrayList7.add(pVarB5);
                                                        }
                                                        if (i69 != iMin) {
                                                            i69++;
                                                            list = list;
                                                        } else {
                                                            arrayList2 = arrayList7;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i16 = i13;
                                            }
                                            arrayList2 = null;
                                        }
                                    }
                                    if (arrayList2 == null) {
                                        list2 = wVar;
                                    } else {
                                        list2 = arrayList2;
                                    }
                                    size2 = listG.size();
                                    i17 = 0;
                                    while (i17 < size2) {
                                        iIntValue = ((Number) listG.get(i17)).intValue();
                                        if (i16 + 1 <= iIntValue || iIntValue >= i37) {
                                            list5 = listG;
                                            i33 = i37;
                                        } else {
                                            if (zQ) {
                                                int size11 = list2.size();
                                                int i75 = 0;
                                                while (true) {
                                                    if (i75 < size11) {
                                                        list5 = listG;
                                                        g0.o[] oVarArr4 = ((g0.p) list2.get(i75)).f5711b;
                                                        i33 = i37;
                                                        int length5 = oVarArr4.length;
                                                        int i76 = 0;
                                                        while (true) {
                                                            if (i76 < length5) {
                                                                int i77 = i76;
                                                                if (oVarArr4[i77].f5693a != iIntValue) {
                                                                    i76 = i77 + 1;
                                                                }
                                                            } else {
                                                                i75++;
                                                                listG = list5;
                                                                i37 = i33;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            list5 = listG;
                                            i33 = i37;
                                            int i78 = sVar2.f5728i;
                                            int iE2 = sVar2.e(iIntValue);
                                            lVar = lVar3;
                                            g0.o oVarW1 = lVar.w0(iIntValue, mVar.a(0, iE2), 0, iE2, lVar3.f5663d);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            ArrayList arrayList8 = arrayList5;
                                            arrayList8.add(oVarW1);
                                            arrayList5 = arrayList8;
                                            i17++;
                                            lVar3 = lVar;
                                            listG = list5;
                                            i37 = i33;
                                        }
                                        lVar = lVar3;
                                        i17++;
                                        lVar3 = lVar;
                                        listG = list5;
                                        i37 = i33;
                                    }
                                    i18 = i37;
                                    g0.l lVar4 = lVar3;
                                    if (arrayList5 == null) {
                                        list3 = wVar;
                                    } else {
                                        list3 = arrayList5;
                                    }
                                    if (i7 <= 0 || iA4 < 0) {
                                        iC2 = kVar2.c();
                                        i19 = i14;
                                        pVar = pVar3;
                                        i20 = 0;
                                        while (i20 < iC2) {
                                            int i79 = ((g0.p) kVar2.get(i20)).f5716g;
                                            if (i19 != 0 || i79 > i19 || i20 == n3.l.A(kVar2)) {
                                                i21 = i19;
                                            } else {
                                                i19 -= i79;
                                                i20++;
                                                pVar = (g0.p) kVar2.get(i20);
                                            }
                                        }
                                        i21 = i19;
                                    } else {
                                        i21 = i14;
                                        pVar = pVar3;
                                    }
                                    iH = n3.a.h(jI);
                                    iF2 = n3.b.f(i50, jI);
                                    listX0 = kVar2;
                                    if (!list2.isEmpty()) {
                                        listX0 = u8.p.x0(list2, kVar2);
                                    }
                                    if (i50 < Math.min(iF2, iG)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && i12 != 0) {
                                        c0.b.c("non-zero firstLineScrollOffset");
                                    }
                                    size3 = listX0.size();
                                    length = 0;
                                    for (i22 = 0; i22 < size3; i22++) {
                                        length += ((g0.p) listX0.get(i22)).f5711b.length;
                                    }
                                    arrayList3 = new ArrayList(length);
                                    if (z11) {
                                        if (list.isEmpty() || !list3.isEmpty()) {
                                            c0.b.a("no items");
                                        }
                                        size8 = listX0.size();
                                        iArr = new int[size8];
                                        for (i31 = 0; i31 < size8; i31++) {
                                            iArr[i31] = ((g0.p) listX0.get(i31)).f5715f;
                                        }
                                        int[] iArr2 = new int[size8];
                                        xVar2 = xVar;
                                        gVar.b(iF2, xVar2, iArr, iArr2);
                                        n9.d dVarY0 = u8.l.y0(iArr2);
                                        int i80 = dVarY0.f8965a;
                                        int i81 = dVarY0.f8966b;
                                        i32 = dVarY0.f8967c;
                                        if ((i32 <= 0 && i80 <= i81) || (i32 < 0 && i81 <= i80)) {
                                            while (true) {
                                                int[] iArr3 = iArr2;
                                                g0.o[] oVarArrA2 = ((g0.p) listX0.get(i80)).a(iArr2[i80], iH, iF2);
                                                int length6 = oVarArrA2.length;
                                                int i82 = 0;
                                                while (i82 < length6) {
                                                    int i83 = i82;
                                                    arrayList3.add(oVarArrA2[i83]);
                                                    i82 = i83 + 1;
                                                }
                                                if (i80 != i81) {
                                                    i80 += i32;
                                                    iArr2 = iArr3;
                                                }
                                            }
                                        }
                                    } else {
                                        xVar2 = xVar;
                                        size4 = list.size() - 1;
                                        if (size4 >= 0) {
                                            i27 = i12;
                                            while (true) {
                                                i28 = size4 - 1;
                                                list4 = list;
                                                g0.o oVar5 = (g0.o) list4.get(size4);
                                                i27 -= oVar5.f5703l;
                                                oVar5.h(i27, iH, iF2);
                                                arrayList3.add(oVar5);
                                                if (i28 < 0) {
                                                    size4 = i28;
                                                    list = list4;
                                                }
                                            }
                                        }
                                        size5 = listX0.size();
                                        i23 = i12;
                                        i24 = 0;
                                        while (i24 < size5) {
                                            g0.p pVar6 = (g0.p) listX0.get(i24);
                                            int i84 = size5;
                                            oVarArrA = pVar6.a(i23, iH, iF2);
                                            int i85 = i24;
                                            length2 = oVarArrA.length;
                                            i26 = 0;
                                            while (i26 < length2) {
                                                int i86 = i26;
                                                arrayList3.add(oVarArrA[i86]);
                                                i26 = i86 + 1;
                                            }
                                            i23 += pVar6.f5716g;
                                            i24 = i85 + 1;
                                            size5 = i84;
                                        }
                                        size6 = list3.size();
                                        for (i25 = 0; i25 < size6; i25++) {
                                            g0.o oVar6 = (g0.o) list3.get(i25);
                                            oVar6.h(i23, iH, iF2);
                                            arrayList3.add(oVar6);
                                            i23 += oVar6.f5703l;
                                        }
                                    }
                                    int i87 = i50;
                                    bVar.c(iH, iF2, arrayList3, iVar2.f5648c, lVar4, zQ, length3, z13, i21, i87);
                                    if (!zQ) {
                                        bVar.b();
                                        if (!zA) {
                                            iH = n3.b.g(Math.max(iH, (int) 0), jI);
                                            iF3 = n3.b.f(Math.max(iF2, (int) 0), jI);
                                            if (iF3 != iF2) {
                                                size7 = arrayList3.size();
                                                for (i30 = 0; i30 < size7; i30++) {
                                                    ((g0.o) arrayList3.get(i30)).f5704m = iF3;
                                                }
                                            }
                                            iF2 = iF3;
                                        }
                                    }
                                    int i88 = iH;
                                    iVar2.f5647b.getClass();
                                    i29 = i16;
                                    int i89 = iF2;
                                    List listF = z.f(this.f4799f, i67, i29, arrayList3, s.j.f12449a, i7, i88, i89, new c8.p(10, mVar, lVar4));
                                    if (i29 == i18 - 1 || i87 > iG) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    i1Var2 = i1Var2;
                                    nVar = new g0.n(pVar, i21, z12, f15, i1Var2.i(n3.b.g(i88 + i34, j5), n3.b.f(i89 + iA3, j5), xVar5, new n(b1Var, arrayList3, listF, zQ, 1)), f14, z10, yVar, xVar2, length3, pVar2, kVar, z.m(i67, i29, arrayList3, listF), i43, i49, i18, x0Var, i35, iA4);
                                }
                            }
                        } else {
                            i12 = i63;
                        }
                        size = listG.size();
                        i14 = i11;
                        arrayList = null;
                        i15 = 0;
                        while (true) {
                            g0.s sVar3 = mVar.f5673e;
                            if (i15 < size) {
                                int i610 = size;
                                iIntValue2 = ((Number) listG.get(i15)).intValue();
                                if (iIntValue2 < 0) {
                                }
                                i15++;
                                i64 = i64;
                                size = i610;
                            } else {
                                int i611 = i64;
                                if (arrayList == null) {
                                    list = wVar;
                                } else {
                                    list = arrayList;
                                }
                                if (zQ) {
                                    i16 = i13;
                                    arrayList2 = null;
                                } else {
                                    i16 = i13;
                                    arrayList2 = null;
                                }
                                if (arrayList2 == null) {
                                    list2 = wVar;
                                } else {
                                    list2 = arrayList2;
                                }
                                size2 = listG.size();
                                i17 = 0;
                                while (i17 < size2) {
                                    iIntValue = ((Number) listG.get(i17)).intValue();
                                    if (i16 + 1 <= iIntValue) {
                                        list5 = listG;
                                        i33 = i37;
                                        lVar = lVar3;
                                    } else {
                                        list5 = listG;
                                        i33 = i37;
                                        lVar = lVar3;
                                    }
                                    i17++;
                                    lVar3 = lVar;
                                    listG = list5;
                                    i37 = i33;
                                }
                                i18 = i37;
                                g0.l lVar5 = lVar3;
                                if (arrayList5 == null) {
                                    list3 = wVar;
                                } else {
                                    list3 = arrayList5;
                                }
                                if (i7 <= 0) {
                                    iC2 = kVar2.c();
                                    i19 = i14;
                                    pVar = pVar3;
                                    i20 = 0;
                                    while (i20 < iC2) {
                                        int i710 = ((g0.p) kVar2.get(i20)).f5716g;
                                        if (i19 != 0) {
                                        }
                                        i21 = i19;
                                    }
                                    i21 = i19;
                                } else {
                                    iC2 = kVar2.c();
                                    i19 = i14;
                                    pVar = pVar3;
                                    i20 = 0;
                                    while (i20 < iC2) {
                                        int i711 = ((g0.p) kVar2.get(i20)).f5716g;
                                        if (i19 != 0) {
                                        }
                                        i21 = i19;
                                    }
                                    i21 = i19;
                                }
                                iH = n3.a.h(jI);
                                iF2 = n3.b.f(i50, jI);
                                listX0 = kVar2;
                                if (!list2.isEmpty()) {
                                    listX0 = u8.p.x0(list2, kVar2);
                                }
                                if (i50 < Math.min(iF2, iG)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    c0.b.c("non-zero firstLineScrollOffset");
                                }
                                size3 = listX0.size();
                                length = 0;
                                while (i22 < size3) {
                                    length += ((g0.p) listX0.get(i22)).f5711b.length;
                                }
                                arrayList3 = new ArrayList(length);
                                if (z11) {
                                    if (list.isEmpty()) {
                                        c0.b.a("no items");
                                    } else {
                                        c0.b.a("no items");
                                    }
                                    size8 = listX0.size();
                                    iArr = new int[size8];
                                    while (i31 < size8) {
                                        iArr[i31] = ((g0.p) listX0.get(i31)).f5715f;
                                    }
                                    int[] iArr4 = new int[size8];
                                    xVar2 = xVar;
                                    gVar.b(iF2, xVar2, iArr, iArr4);
                                    n9.d dVarY1 = u8.l.y0(iArr4);
                                    int i810 = dVarY1.f8965a;
                                    int i811 = dVarY1.f8966b;
                                    i32 = dVarY1.f8967c;
                                    if (i32 <= 0) {
                                    }
                                } else {
                                    xVar2 = xVar;
                                    size4 = list.size() - 1;
                                    if (size4 >= 0) {
                                        i27 = i12;
                                        while (true) {
                                            i28 = size4 - 1;
                                            list4 = list;
                                            g0.o oVar7 = (g0.o) list4.get(size4);
                                            i27 -= oVar7.f5703l;
                                            oVar7.h(i27, iH, iF2);
                                            arrayList3.add(oVar7);
                                            if (i28 < 0) {
                                                size4 = i28;
                                                list = list4;
                                            }
                                        }
                                    }
                                    size5 = listX0.size();
                                    i23 = i12;
                                    i24 = 0;
                                    while (i24 < size5) {
                                        g0.p pVar7 = (g0.p) listX0.get(i24);
                                        int i812 = size5;
                                        oVarArrA = pVar7.a(i23, iH, iF2);
                                        int i813 = i24;
                                        length2 = oVarArrA.length;
                                        i26 = 0;
                                        while (i26 < length2) {
                                            int i814 = i26;
                                            arrayList3.add(oVarArrA[i814]);
                                            i26 = i814 + 1;
                                        }
                                        i23 += pVar7.f5716g;
                                        i24 = i813 + 1;
                                        size5 = i812;
                                    }
                                    size6 = list3.size();
                                    while (i25 < size6) {
                                        g0.o oVar8 = (g0.o) list3.get(i25);
                                        oVar8.h(i23, iH, iF2);
                                        arrayList3.add(oVar8);
                                        i23 += oVar8.f5703l;
                                    }
                                }
                                int i815 = i50;
                                bVar.c(iH, iF2, arrayList3, iVar2.f5648c, lVar5, zQ, length3, z13, i21, i815);
                                if (!zQ) {
                                    bVar.b();
                                    if (!zA) {
                                        iH = n3.b.g(Math.max(iH, (int) 0), jI);
                                        iF3 = n3.b.f(Math.max(iF2, (int) 0), jI);
                                        if (iF3 != iF2) {
                                            size7 = arrayList3.size();
                                            while (i30 < size7) {
                                                ((g0.o) arrayList3.get(i30)).f5704m = iF3;
                                            }
                                        }
                                        iF2 = iF3;
                                    }
                                }
                                int i816 = iH;
                                iVar2.f5647b.getClass();
                                i29 = i16;
                                int i817 = iF2;
                                List listF2 = z.f(this.f4799f, i611, i29, arrayList3, s.j.f12449a, i7, i816, i817, new c8.p(10, mVar, lVar5));
                                if (i29 == i18 - 1) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                i1Var2 = i1Var2;
                                nVar = new g0.n(pVar, i21, z12, f15, i1Var2.i(n3.b.g(i816 + i34, j5), n3.b.f(i817 + iA3, j5), xVar5, new n(b1Var, arrayList3, listF2, zQ, 1)), f14, z10, yVar, xVar2, length3, pVar2, kVar, z.m(i611, i29, arrayList3, listF2), i43, i49, i18, x0Var, i35, iA4);
                            }
                        }
                    }
                    vVar.f(nVar, i1Var2.Q(), false);
                    return nVar;
                } catch (Throwable th) {
                    n4.e.r(fVarH, fVarK, kVarE);
                    throw th;
                }
        }
    }
}
