package f7;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5433b;

    public /* synthetic */ n(int i7, Object obj) {
        this.f5432a = i7;
        this.f5433b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0122, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        n5.j jVar;
        n5.m mVar;
        n5.m mVarB;
        ArrayList arrayList;
        float f10;
        int i7 = this.f5432a;
        Object obj = this.f5433b;
        switch (i7) {
            case 0:
                o oVar = (o) obj;
                a2.d dVar = oVar.f5443j;
                g7.g gVar = oVar.f5434a;
                int i10 = message.what;
                if (i10 != R.id.zxing_decode) {
                    int i11 = 0;
                    if (i10 != R.id.zxing_preview_failed) {
                        return true;
                    }
                    gVar.f5976h.post(new g7.d(gVar, dVar, i11));
                    return true;
                }
                w wVar = (w) message.obj;
                Handler handler = oVar.f5438e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Rect rect = oVar.f5439f;
                wVar.f5460d = rect;
                t tVar = wVar.f5457a;
                int i12 = tVar.f5452b;
                if (rect == null) {
                    jVar = null;
                } else {
                    int i13 = wVar.f5459c;
                    byte[] bArr = tVar.f5451a;
                    int i14 = tVar.f5453c;
                    if (i13 == 90) {
                        byte[] bArr2 = new byte[i12 * i14];
                        int i15 = 0;
                        for (int i16 = 0; i16 < i12; i16++) {
                            for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                bArr2[i15] = bArr[(i17 * i12) + i16];
                                i15++;
                            }
                        }
                        tVar = new t(bArr2, i14, i12);
                    } else if (i13 == 180) {
                        int i18 = i12 * i14;
                        byte[] bArr3 = new byte[i18];
                        int i19 = i18 - 1;
                        for (int i20 = 0; i20 < i18; i20++) {
                            bArr3[i19] = bArr[i20];
                            i19--;
                        }
                        tVar = new t(bArr3, i12, i14);
                    } else if (i13 == 270) {
                        int i21 = i12 * i14;
                        byte[] bArr4 = new byte[i21];
                        int i22 = i21 - 1;
                        for (int i23 = 0; i23 < i12; i23++) {
                            for (int i24 = i14 - 1; i24 >= 0; i24--) {
                                bArr4[i22] = bArr[(i24 * i12) + i23];
                                i22--;
                            }
                        }
                        tVar = new t(bArr4, i14, i12);
                    }
                    Rect rect2 = wVar.f5460d;
                    byte[] bArr5 = tVar.f5451a;
                    int i25 = tVar.f5452b;
                    int iWidth = rect2.width();
                    int iHeight = rect2.height();
                    byte[] bArr6 = new byte[iWidth * iHeight];
                    int i26 = (rect2.top * i25) + rect2.left;
                    for (int i27 = 0; i27 < iHeight; i27++) {
                        System.arraycopy(bArr5, i26, bArr6, i27 * iWidth, iWidth);
                        i26 += i25;
                    }
                    jVar = new n5.j(iWidth, iHeight, iWidth, bArr6, iHeight);
                }
                if (jVar != null) {
                    k kVar = oVar.f5437d;
                    n5.b bVarB = kVar.b(jVar);
                    n5.h hVar = kVar.f5429a;
                    kVar.f5430b.clear();
                    try {
                        try {
                            if (ob.a.A(hVar)) {
                                if (hVar.f8832b == null) {
                                    hVar.c(null);
                                }
                                mVarB = hVar.b(bVarB);
                            } else {
                                mVar = null;
                                try {
                                    hVar.c(null);
                                    mVarB = hVar.b(bVarB);
                                } catch (Exception unused) {
                                    hVar.reset();
                                    mVarB = mVar;
                                }
                            }
                            hVar.reset();
                        } catch (Throwable th) {
                            hVar.reset();
                            throw th;
                        }
                        break;
                    } catch (Exception unused2) {
                        mVar = null;
                    }
                    if (mVarB != null) {
                        Log.d("o", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                        if (handler != null) {
                            a aVar = new a();
                            aVar.f5378a = mVarB;
                            aVar.f5379b = wVar;
                            Message messageObtain = Message.obtain(handler, R.id.zxing_decode_succeeded, aVar);
                            messageObtain.setData(new Bundle());
                            messageObtain.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        k kVar2 = oVar.f5437d;
                        kVar2.getClass();
                        ArrayList<n5.o> arrayList2 = new ArrayList(kVar2.f5430b);
                        arrayList = new ArrayList(arrayList2.size());
                        for (n5.o oVar2 : arrayList2) {
                            float f11 = 1;
                            float f12 = oVar2.f8854a * f11;
                            Rect rect3 = wVar.f5460d;
                            f10 = f12 + rect3.left;
                            float f13 = (oVar2.f8855b * f11) + rect3.top;
                            if (wVar.f5461e) {
                                f10 = i12 - f10;
                            }
                            arrayList.add(new n5.o(f10, f13));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                    }
                    gVar.f5976h.post(new g7.d(gVar, dVar, 0));
                    return true;
                }
                mVar = null;
                mVarB = mVar;
                if (mVarB != null) {
                    Log.d("o", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                    if (handler != null) {
                        a aVar2 = new a();
                        aVar2.f5378a = mVarB;
                        aVar2.f5379b = wVar;
                        Message messageObtain2 = Message.obtain(handler, R.id.zxing_decode_succeeded, aVar2);
                        messageObtain2.setData(new Bundle());
                        messageObtain2.sendToTarget();
                    }
                } else if (handler != null) {
                    Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                }
                if (handler != null) {
                    k kVar3 = oVar.f5437d;
                    kVar3.getClass();
                    ArrayList<n5.o> arrayList3 = new ArrayList(kVar3.f5430b);
                    arrayList = new ArrayList(arrayList3.size());
                    while (r3.hasNext()) {
                        float f14 = 1;
                        float f15 = oVar2.f8854a * f14;
                        Rect rect4 = wVar.f5460d;
                        f10 = f15 + rect4.left;
                        float f16 = (oVar2.f8855b * f14) + rect4.top;
                        if (wVar.f5461e) {
                            f10 = i12 - f10;
                        }
                        arrayList.add(new n5.o(f10, f16));
                    }
                    Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                }
                gVar.f5976h.post(new g7.d(gVar, dVar, 0));
                return true;
            default:
                int i28 = message.what;
                g7.b bVar = (g7.b) obj;
                bVar.getClass();
                if (i28 != 1) {
                    return false;
                }
                bVar.b();
                return true;
        }
    }
}
