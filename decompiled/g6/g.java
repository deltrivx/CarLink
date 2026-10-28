package g6;

import java.util.Arrays;
import n3.r;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2.d f5950a = new a2.d(23);

    public static c a(e eVar) {
        int[] iArr;
        int i7;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        if (eVar == null) {
            return null;
        }
        boolean z10 = eVar.f5948d;
        c cVar = (c) eVar.f12990b;
        a[] aVarArr = (a[]) eVar.f12991c;
        a aVarK1 = eVar.k1();
        int iMax = -1;
        if (aVarK1 == null) {
            iArr = null;
        } else {
            int i10 = aVarK1.f5934f;
            int iW0 = eVar.W0((int) (z10 ? cVar.f5938c : cVar.f5940e).f8855b);
            int i11 = -1;
            int i12 = 0;
            int iMax2 = 1;
            for (int iW1 = eVar.W0((int) (z10 ? cVar.f5937b : cVar.f5939d).f8855b); iW1 < iW0; iW1++) {
                a aVar = aVarArr[iW1];
                if (aVar != null) {
                    aVar.b();
                    int i13 = aVar.f5934f;
                    int i14 = i13 - i11;
                    if (i14 == 0) {
                        i12++;
                    } else {
                        if (i14 == 1) {
                            iMax2 = Math.max(iMax2, i12);
                            i11 = aVar.f5934f;
                        } else if (i13 >= i10) {
                            aVarArr[iW1] = null;
                        } else {
                            i11 = i13;
                        }
                        i12 = 1;
                    }
                }
            }
            iArr = new int[i10];
            for (a aVar2 : aVarArr) {
                if (aVar2 != null && (i7 = aVar2.f5934f) < i10) {
                    iArr[i7] = iArr[i7] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        for (int i15 : iArr) {
            iMax = Math.max(iMax, i15);
        }
        int i16 = 0;
        for (int i17 : iArr) {
            i16 += iMax - i17;
            if (i17 > 0) {
                break;
            }
        }
        for (int i18 = 0; i16 > 0 && aVarArr[i18] == null; i18++) {
            i16--;
        }
        int i19 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i20 = iArr[length];
            i19 += iMax - i20;
            if (i20 > 0) {
                break;
            }
        }
        for (int length2 = aVarArr.length - 1; i19 > 0 && aVarArr[length2] == null; length2--) {
            i19--;
        }
        o oVar5 = cVar.f5937b;
        o oVar6 = cVar.f5938c;
        o oVar7 = cVar.f5939d;
        o oVar8 = cVar.f5940e;
        if (i16 > 0) {
            o oVar9 = z10 ? oVar5 : oVar7;
            int i21 = ((int) oVar9.f8855b) - i16;
            o oVar10 = new o(oVar9.f8854a, i21 >= 0 ? i21 : 0);
            if (z10) {
                oVar2 = oVar7;
                oVar = oVar10;
            } else {
                oVar = oVar5;
                oVar2 = oVar10;
            }
        } else {
            oVar = oVar5;
            oVar2 = oVar7;
        }
        if (i19 > 0) {
            o oVar11 = z10 ? oVar6 : oVar8;
            int i22 = ((int) oVar11.f8855b) + i19;
            int i23 = cVar.f5936a.f12762b;
            if (i22 >= i23) {
                i22 = i23 - 1;
            }
            o oVar12 = new o(oVar11.f8854a, i22);
            if (z10) {
                oVar3 = oVar12;
            } else {
                oVar3 = oVar6;
                oVar4 = oVar12;
            }
            return new c(cVar.f5936a, oVar, oVar3, oVar2, oVar4);
        }
        oVar3 = oVar6;
        oVar4 = oVar8;
        return new c(cVar.f5936a, oVar, oVar3, oVar2, oVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:206:0x0408  */
    /* JADX WARN: Code duplicated, block: B:212:0x0428  */
    /* JADX WARN: Code duplicated, block: B:215:0x0430  */
    /* JADX WARN: Code duplicated, block: B:221:0x0443  */
    /* JADX WARN: Code duplicated, block: B:223:0x044c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x044e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0451  */
    /* JADX WARN: Code duplicated, block: B:227:0x0455 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:230:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0477  */
    /* JADX WARN: Code duplicated, block: B:238:0x047f  */
    /* JADX WARN: Code duplicated, block: B:262:0x04e9 A[LOOP:23: B:261:0x04e7->B:262:0x04e9, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static t5.d b(int[] r25, int r26, int[] r27) throws n5.f, n5.c {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.g.b(int[], int, int[]):t5.d");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0032 A[EDGE_INSN: B:120:0x0032->B:19:0x0032 BREAK  A[LOOP:1: B:9:0x0018->B:18:0x0030], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0060 A[EDGE_INSN: B:123:0x0060->B:34:0x0060 BREAK  A[LOOP:2: B:25:0x0045->B:126:0x0045], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[LOOP:1: B:9:0x0018->B:18:0x0030, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    public static a c(t5.b bVar, int i7, int i10, boolean z10, int i11, int i12, int i13, int i14) {
        int i15;
        a aVar;
        a aVar2;
        int i16 = i7;
        int i17 = z10 ? -1 : 1;
        boolean z11 = z10;
        int i18 = i11;
        loop0: for (int i19 = 0; i19 < 2; i19++) {
            while (true) {
                if (!z11) {
                    if (i18 >= i10) {
                        break;
                    }
                    if (z11 == bVar.b(i18, i12)) {
                        break;
                        break;
                    }
                    if (Math.abs(i11 - i18) > 2) {
                        i18 = i11;
                        break loop0;
                    }
                    i18 += i17;
                } else {
                    if (i18 < i16) {
                        break;
                    }
                    if (z11 == bVar.b(i18, i12)) {
                        break;
                    }
                    if (Math.abs(i11 - i18) > 2) {
                        i18 = i11;
                        break loop0;
                    }
                    i18 += i17;
                }
            }
            i17 = -i17;
            z11 = !z11;
        }
        int[] iArr = new int[8];
        int i20 = z10 ? 1 : -1;
        boolean z12 = z10;
        int i21 = i18;
        int i22 = 0;
        while (true) {
            if (!z10) {
                if (i21 < i16) {
                    break;
                }
                if (i22 < 8) {
                    break;
                    break;
                }
                if (bVar.b(i21, i12) == z12) {
                    iArr[i22] = iArr[i22] + 1;
                    i21 += i20;
                } else {
                    i22++;
                    z12 = !z12;
                }
            } else {
                if (i21 >= i10) {
                    break;
                }
                if (i22 < 8) {
                    break;
                }
                if (bVar.b(i21, i12) == z12) {
                    iArr[i22] = iArr[i22] + 1;
                    i21 += i20;
                } else {
                    i22++;
                    z12 = !z12;
                }
            }
        }
        if (i22 != 8) {
            if (z10) {
                i16 = i10;
            }
            if (i21 != i16 || i22 != 7) {
                iArr = null;
            }
        }
        if (iArr != null) {
            int iA0 = r.a0(iArr);
            if (z10) {
                i15 = i18 + iA0;
            } else {
                for (int i23 = 0; i23 < iArr.length / 2; i23++) {
                    int i24 = iArr[i23];
                    iArr[i23] = iArr[(iArr.length - 1) - i23];
                    iArr[(iArr.length - 1) - i23] = i24;
                }
                int i25 = i18;
                i18 -= iA0;
                i15 = i25;
            }
            if (i13 - 2 <= iA0 && iA0 <= i14 + 2) {
                float[][] fArr = f.f5949a;
                float fA0 = r.a0(iArr);
                int[] iArr2 = new int[8];
                int i26 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < 17; i28++) {
                    float f10 = ((i28 * fA0) / 17.0f) + (fA0 / 34.0f);
                    int i29 = iArr[i27] + i26;
                    if (i29 <= f10) {
                        i27++;
                        i26 = i29;
                    }
                    iArr2[i27] = iArr2[i27] + 1;
                }
                long j5 = 0;
                for (int i30 = 0; i30 < 8; i30++) {
                    for (int i31 = 0; i31 < iArr2[i30]; i31++) {
                        j5 = (j5 << 1) | ((long) (i30 % 2 == 0 ? 1 : 0));
                    }
                }
                int i32 = (int) j5;
                int[] iArr3 = f6.a.f5374b;
                int iBinarySearch = Arrays.binarySearch(iArr3, i32 & 262143);
                int[] iArr4 = f6.a.f5375c;
                if ((iBinarySearch < 0 ? -1 : (iArr4[iBinarySearch] - 1) % 929) == -1) {
                    i32 = -1;
                }
                if (i32 == -1) {
                    int iA1 = r.a0(iArr);
                    float[] fArr2 = new float[8];
                    if (iA1 > 1) {
                        for (int i33 = 0; i33 < 8; i33++) {
                            fArr2[i33] = iArr[i33] / iA1;
                        }
                    }
                    i32 = -1;
                    float f11 = Float.MAX_VALUE;
                    int i34 = 0;
                    while (true) {
                        float[][] fArr3 = f.f5949a;
                        if (i34 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i34];
                        float f12 = 0.0f;
                        for (int i35 = 0; i35 < 8; i35++) {
                            float f13 = fArr4[i35] - fArr2[i35];
                            f12 = (f13 * f13) + f12;
                            if (f12 >= f11) {
                                break;
                            }
                        }
                        if (f12 < f11) {
                            i32 = iArr3[i34];
                            f11 = f12;
                        }
                        i34++;
                    }
                }
                int iBinarySearch2 = Arrays.binarySearch(iArr3, i32 & 262143);
                int i36 = iBinarySearch2 < 0 ? -1 : (iArr4[iBinarySearch2] - 1) % 929;
                if (i36 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i37 = i32;
                int i38 = 7;
                int i39 = 0;
                while (true) {
                    int i40 = i37 & 1;
                    if (i40 != i39) {
                        i38--;
                        if (i38 < 0) {
                            return new a(i18, i15, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i36, 1);
                        }
                        aVar2 = aVar;
                        i39 = i40;
                    } else {
                        aVar2 = aVar;
                    }
                    iArr5[i38] = iArr5[i38] + 1;
                    i37 >>= 1;
                    aVar = aVar2;
                    i36 = i36;
                }
            }
        }
        return null;
    }

    public static e d(t5.b bVar, c cVar, o oVar, boolean z10, int i7, int i10) {
        e eVar = new e(cVar, z10);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int i13 = (int) oVar.f8854a;
            int i14 = (int) oVar.f8855b;
            while (i14 <= cVar.f5944i && i14 >= cVar.f5943h) {
                a aVarC = c(bVar, 0, bVar.f12761a, z10, i13, i14, i7, i10);
                if (aVarC != null) {
                    ((a[]) eVar.f12991c)[eVar.W0(i14)] = aVarC;
                    i13 = z10 ? aVarC.f5930b : aVarC.f5931c;
                }
                i14 += i12;
                z10 = z10;
            }
            i11++;
        }
        return eVar;
    }
}
