package b6;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.util.Map;
import n5.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f1532j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[][] f1533l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f1535i;

    public e(int i7) {
        this.f1534h = i7;
        switch (i7) {
            case 1:
                this.f1535i = new int[4];
                break;
            case 2:
                this.f1535i = new int[4];
                break;
            case 3:
                this.f1535i = new e(0);
                break;
            default:
                this.f1535i = new int[4];
                break;
        }
    }

    public static m o(m mVar) throws n5.f {
        String str = mVar.f8839a;
        if (str.charAt(0) != '0') {
            throw n5.f.a();
        }
        m mVar2 = new m(str.substring(1), null, mVar.f8841c, n5.a.f8803o);
        Map map = mVar.f8843e;
        if (map != null) {
            mVar2.a(map);
        }
        return mVar2;
    }

    @Override // b6.h, n5.k
    public m a(n5.b bVar, Map map) {
        switch (this.f1534h) {
            case 3:
                return o(((e) this.f1535i).a(bVar, map));
            default:
                return super.a(bVar, map);
        }
    }

    @Override // b6.k, b6.h
    public m b(int i7, t5.a aVar, Map map) {
        switch (this.f1534h) {
            case 3:
                return o(((e) this.f1535i).b(i7, aVar, map));
            default:
                return super.b(i7, aVar, map);
        }
    }

    @Override // b6.k
    public boolean g(String str) {
        switch (this.f1534h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(str.charAt(0));
                char c10 = cArr[5];
                switch (c10) {
                    case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                    case '2':
                        sb2.append(cArr, 0, 2);
                        sb2.append(c10);
                        sb2.append("0000");
                        sb2.append(cArr, 2, 3);
                        break;
                    case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                        sb2.append(cArr, 0, 3);
                        sb2.append("00000");
                        sb2.append(cArr, 3, 2);
                        break;
                    case UsbAccessoryStarter.AOA_SEND_IDENT /* 52 */:
                        sb2.append(cArr, 0, 4);
                        sb2.append("00000");
                        sb2.append(cArr[4]);
                        break;
                    default:
                        sb2.append(cArr, 0, 5);
                        sb2.append("0000");
                        sb2.append(c10);
                        break;
                }
                if (str.length() >= 8) {
                    sb2.append(str.charAt(7));
                }
                return super.g(sb2.toString());
            default:
                return super.g(str);
        }
    }

    @Override // b6.k
    public int[] i(t5.a aVar, int i7) {
        switch (this.f1534h) {
            case 1:
                return k.l(aVar, i7, true, k, new int[6]);
            default:
                return super.i(aVar, i7);
        }
    }

    @Override // b6.k
    public final int j(t5.a aVar, int[] iArr, StringBuilder sb2) throws n5.i {
        int[][] iArr2;
        switch (this.f1534h) {
            case 0:
                int[] iArr3 = (int[]) this.f1535i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i7 = aVar.f12760b;
                int i10 = iArr[1];
                int i11 = 0;
                for (int i12 = 0; i12 < 6 && i10 < i7; i12++) {
                    int iH = k.h(aVar, iArr3, i10, k.f1554g);
                    sb2.append((char) ((iH % 10) + 48));
                    for (int i13 : iArr3) {
                        i10 += i13;
                    }
                    if (iH >= 10) {
                        i11 |= 1 << (5 - i12);
                    }
                }
                for (int i14 = 0; i14 < 10; i14++) {
                    if (i11 == f1532j[i14]) {
                        sb2.insert(0, (char) (i14 + 48));
                        int i15 = k.l(aVar, i10, true, k.f1552e, new int[5])[1];
                        for (int i16 = 0; i16 < 6 && i15 < i7; i16++) {
                            sb2.append((char) (k.h(aVar, iArr3, i15, k.f1553f) + 48));
                            for (int i17 : iArr3) {
                                i15 += i17;
                            }
                        }
                        return i15;
                    }
                }
                throw n5.i.f8833c;
            case 1:
                int[] iArr4 = (int[]) this.f1535i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i18 = aVar.f12760b;
                int i19 = iArr[1];
                int i20 = 0;
                for (int i21 = 0; i21 < 6 && i19 < i18; i21++) {
                    int iH2 = k.h(aVar, iArr4, i19, k.f1554g);
                    sb2.append((char) ((iH2 % 10) + 48));
                    for (int i22 : iArr4) {
                        i19 += i22;
                    }
                    if (iH2 >= 10) {
                        i20 |= 1 << (5 - i21);
                    }
                }
                for (int i23 = 0; i23 <= 1; i23++) {
                    for (int i24 = 0; i24 < 10; i24++) {
                        if (i20 == f1533l[i23][i24]) {
                            sb2.insert(0, (char) (i23 + 48));
                            sb2.append((char) (i24 + 48));
                            return i19;
                        }
                    }
                }
                throw n5.i.f8833c;
            case 2:
                int[] iArr5 = (int[]) this.f1535i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i25 = aVar.f12760b;
                int i26 = iArr[1];
                int i27 = 0;
                while (true) {
                    iArr2 = k.f1553f;
                    if (i27 < 4 && i26 < i25) {
                        sb2.append((char) (k.h(aVar, iArr5, i26, iArr2) + 48));
                        for (int i28 : iArr5) {
                            i26 += i28;
                        }
                        i27++;
                    }
                }
                int i29 = k.l(aVar, i26, true, k.f1552e, new int[5])[1];
                for (int i30 = 0; i30 < 4 && i29 < i25; i30++) {
                    sb2.append((char) (k.h(aVar, iArr5, i29, iArr2) + 48));
                    for (int i31 : iArr5) {
                        i29 += i31;
                    }
                }
                return i29;
            default:
                return ((e) this.f1535i).j(aVar, iArr, sb2);
        }
    }

    @Override // b6.k
    public m k(int i7, t5.a aVar, int[] iArr, Map map) {
        switch (this.f1534h) {
            case 3:
                return o(((e) this.f1535i).k(i7, aVar, iArr, map));
            default:
                return super.k(i7, aVar, iArr, map);
        }
    }

    @Override // b6.k
    public final n5.a n() {
        switch (this.f1534h) {
            case 0:
                return n5.a.f8797h;
            case 1:
                return n5.a.f8804p;
            case 2:
                return n5.a.f8796g;
            default:
                return n5.a.f8803o;
        }
    }
}
