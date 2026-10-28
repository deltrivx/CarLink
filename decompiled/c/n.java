package c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.receiver.transport.hotspot.BluetoothDeviceDiscover;
import com.baidu.carlife.sdk.util.Logger;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1769c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.f1767a = i7;
        this.f1768b = obj;
        this.f1769c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [k7.g] */
    /* JADX WARN: Type inference failed for: r11v5, types: [k7.g] */
    /* JADX WARN: Type inference failed for: r11v6, types: [k7.g] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, k7.g] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String absolutePath;
        boolean z10;
        ?? r11;
        ?? r12;
        int i7 = this.f1767a;
        Object obj = this.f1769c;
        Object obj2 = this.f1768b;
        switch (i7) {
            case 0:
                p4.l lVar = (p4.l) obj2;
                int i10 = o.f1771r;
                lVar.f13057a.a(new h(0, (l0) obj, lVar));
                return;
            case 1:
                BluetoothDeviceDiscover.startScan$lambda$0((Context) obj2, (BluetoothDeviceDiscover.ScanCallback) obj);
                return;
            case 2:
                f7.a aVar = (f7.a) obj;
                n5.m mVar = aVar.f5378a;
                f7.j jVar = (f7.j) ((a2.d) obj2).f20b;
                CaptureActivity captureActivity = jVar.f5417a;
                if (jVar.f5420d) {
                    f7.w wVar = aVar.f5379b;
                    f7.t tVar = wVar.f5457a;
                    int i11 = wVar.f5459c;
                    Rect rect = new Rect(0, 0, tVar.f5452b, tVar.f5453c);
                    YuvImage yuvImage = new YuvImage(tVar.f5451a, wVar.f5458b, tVar.f5452b, tVar.f5453c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i11 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i11);
                        bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    }
                    Bitmap bitmap = bitmapDecodeByteArray;
                    try {
                        File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        absolutePath = fileCreateTempFile.getAbsolutePath();
                    } catch (IOException e7) {
                        Log.w("j", "Unable to create temporary file and store bitmap! " + e7);
                        absolutePath = null;
                    }
                    break;
                } else {
                    absolutePath = null;
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", mVar.f8839a);
                intent.putExtra("SCAN_RESULT_FORMAT", mVar.f8842d.toString());
                byte[] bArr = mVar.f8840b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                Map map = mVar.f8843e;
                if (map != null) {
                    n5.n nVar = n5.n.f8850g;
                    if (map.containsKey(nVar)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(nVar).toString());
                    }
                    Number number = (Number) map.get(n5.n.f8844a);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str = (String) map.get(n5.n.f8846c);
                    if (str != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str);
                    }
                    Iterable iterable = (Iterable) map.get(n5.n.f8845b);
                    if (iterable != null) {
                        Iterator it = iterable.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i12, (byte[]) it.next());
                            i12++;
                        }
                    }
                }
                if (absolutePath != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", absolutePath);
                }
                captureActivity.setResult(-1, intent);
                jVar.a();
                return;
            case 3:
                j.o oVar = (j.o) obj2;
                Runnable runnable = (Runnable) obj;
                oVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    oVar.a();
                }
            case 4:
                k7.d dVar = (k7.d) obj2;
                n7.d dVar2 = (n7.d) obj;
                k7.a aVar2 = new k7.a();
                n7.c cVarK = dVar2.k();
                int i13 = dVar.f7344a;
                ?? r14 = dVar.f7345b;
                int iS = i2.c.s(dVar, i13);
                if (Build.VERSION.SDK_INT < 23) {
                    z10 = true;
                } else {
                    if (i13 != 4 ? i13 != 5 ? i2.c.B().f8595d : i2.c.B().f8597f : i2.c.B().f8596e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                dVar.f7346c = k7.a.a(aVar2, cVarK, iS, z10, null, 24);
                dVar.h(k7.h.f7356d);
                r14.e();
                try {
                    dVar.g(dVar2);
                    Logger.INSTANCE.d(Constants.TAG, a2.f.E(i13, "【音频播放】播放完成，已停止-"));
                    r12 = r14;
                } catch (Exception e10) {
                    ?? r13 = r14;
                    try {
                        Logger.INSTANCE.e(Constants.TAG, "【音频播放】播放异常-" + i13 + "：" + e10.getMessage() + " ", e10);
                        dVar.h(k7.h.f7360h);
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "播放异常-" + i13;
                        }
                        r13.a(dVar2, message);
                        Logger.INSTANCE.d(Constants.TAG, a2.f.E(i13, "【音频播放】播放完成，已停止-"));
                        r12 = r13;
                    } catch (Throwable th) {
                        th = th;
                        r11 = r13;
                        Logger.INSTANCE.d(Constants.TAG, a2.f.E(i13, "【音频播放】播放完成，已停止-"));
                        r11.d(dVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r11 = r14;
                    Logger.INSTANCE.d(Constants.TAG, a2.f.E(i13, "【音频播放】播放完成，已停止-"));
                    r11.d(dVar2);
                    throw th;
                }
                r12.d(dVar2);
                return;
            case 5:
                n4.h.z((t1.c) obj2, (LongSparseArray) obj);
                return;
            default:
                ((d3.e) obj2).v((Typeface) obj);
                return;
        }
    }
}
