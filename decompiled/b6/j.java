package b6;

import java.util.ArrayList;
import java.util.EnumMap;
import n5.l;
import n5.m;
import n5.n;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1548c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1550b;

    public j(int i7) {
        switch (i7) {
            case 1:
                this.f1549a = new ArrayList();
                this.f1550b = new ArrayList();
                break;
            default:
                this.f1549a = new i(1);
                this.f1550b = new i(0);
                break;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f1549a).add(iArr);
        ((ArrayList) this.f1550b).add(str);
    }

    public m b(int i7, int i10, t5.a aVar) throws n5.i {
        EnumMap enumMap;
        int[] iArrL = k.l(aVar, i10, false, f1548c, new int[3]);
        try {
            return ((i) this.f1550b).a(i7, aVar, iArrL);
        } catch (l unused) {
            i iVar = (i) this.f1549a;
            StringBuilder sb2 = iVar.f1547b;
            sb2.setLength(0);
            int[] iArr = iVar.f1546a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i11 = aVar.f12760b;
            int iF = iArrL[1];
            int i12 = 0;
            for (int i13 = 0; i13 < 2 && iF < i11; i13++) {
                int iH = k.h(aVar, iArr, iF, k.f1554g);
                sb2.append((char) ((iH % 10) + 48));
                for (int i14 : iArr) {
                    iF += i14;
                }
                if (iH >= 10) {
                    i12 |= 1 << (1 - i13);
                }
                if (i13 != 1) {
                    iF = aVar.f(aVar.e(iF));
                }
            }
            if (sb2.length() != 2) {
                throw n5.i.f8833c;
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i12) {
                throw n5.i.f8833c;
            }
            String string = sb2.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(n.class);
                enumMap.put(n.f8847d, Integer.valueOf(string));
            }
            float f10 = i7;
            m mVar = new m(string, null, new o[]{new o((iArrL[0] + iArrL[1]) / 2.0f, f10), new o(iF, f10)}, n5.a.f8805q);
            if (enumMap != null) {
                mVar.a(enumMap);
            }
            return mVar;
        }
    }
}
