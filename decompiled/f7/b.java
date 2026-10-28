package f7;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.carlifevehicle.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f5381b;

    public /* synthetic */ b(BarcodeView barcodeView, int i7) {
        this.f5380a = i7;
        this.f5381b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        u0.k kVar;
        g7.l lVar;
        e eVar;
        switch (this.f5380a) {
            case 0:
                BarcodeView barcodeView = this.f5381b;
                int i7 = message.what;
                if (i7 != R.id.zxing_decode_succeeded) {
                    if (i7 == R.id.zxing_decode_failed) {
                        return true;
                    }
                    if (i7 != R.id.zxing_possible_result_points) {
                        return false;
                    }
                    List<n5.o> list = (List) message.obj;
                    u0.k kVar2 = barcodeView.B;
                    if (kVar2 == null || barcodeView.A == 1) {
                        return true;
                    }
                    kVar2.getClass();
                    for (n5.o oVar : list) {
                        ViewfinderView viewfinderView = ((DecoratedBarcodeView) kVar2.f12991c).f2898b;
                        if (viewfinderView.f2907g.size() < 20) {
                            viewfinderView.f2907g.add(oVar);
                        }
                    }
                    return true;
                }
                a aVar = (a) message.obj;
                if (aVar == null || (kVar = barcodeView.B) == null || barcodeView.A == 1) {
                    return true;
                }
                a2.d dVar = (a2.d) kVar.f12990b;
                ((j) dVar.f20b).f5418b.f2897a.g();
                e6.h hVar = ((j) dVar.f20b).f5425i;
                synchronized (hVar) {
                    if (hVar.f4442b) {
                        hVar.b();
                    }
                    break;
                }
                ((j) dVar.f20b).f5426j.post(new c.n(2, dVar, aVar));
                if (barcodeView.A != 2) {
                    return true;
                }
                barcodeView.A = 1;
                barcodeView.B = null;
                barcodeView.i();
                return true;
            default:
                BarcodeView barcodeView2 = this.f5381b;
                e eVar2 = barcodeView2.f5411y;
                int i10 = message.what;
                if (i10 != R.id.zxing_prewiew_size_ready) {
                    if (i10 == R.id.zxing_camera_error) {
                        Exception exc = (Exception) message.obj;
                        if (barcodeView2.f5388a != null) {
                            barcodeView2.g();
                            eVar2.c(exc);
                        }
                    } else if (i10 == R.id.zxing_camera_closed) {
                        eVar2.a();
                    }
                    return false;
                }
                v vVar = (v) message.obj;
                barcodeView2.f5400n = vVar;
                v vVar2 = barcodeView2.f5399m;
                if (vVar2 == null) {
                    return true;
                }
                if (vVar == null || (lVar = barcodeView2.k) == null) {
                    barcodeView2.f5404r = null;
                    barcodeView2.f5403q = null;
                    barcodeView2.f5401o = null;
                    throw new IllegalStateException("containerSize or previewSize is not set yet");
                }
                int i11 = vVar.f5455a;
                int i12 = vVar.f5456b;
                int i13 = vVar2.f5455a;
                int i14 = vVar2.f5456b;
                Rect rectB = ((g7.n) lVar.f6000d).b(vVar, (v) lVar.f5999c);
                if (rectB.width() > 0 && rectB.height() > 0) {
                    barcodeView2.f5401o = rectB;
                    Rect rect = new Rect(0, 0, i13, i14);
                    Rect rect2 = barcodeView2.f5401o;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (barcodeView2.f5405s != null) {
                        rect3.inset(Math.max(0, (rect3.width() - barcodeView2.f5405s.f5455a) / 2), Math.max(0, (rect3.height() - barcodeView2.f5405s.f5456b) / 2));
                        eVar = eVar2;
                    } else {
                        eVar = eVar2;
                        int iMin = (int) Math.min(((double) rect3.width()) * barcodeView2.f5406t, ((double) rect3.height()) * barcodeView2.f5406t);
                        rect3.inset(iMin, iMin);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    barcodeView2.f5403q = rect3;
                    Rect rect4 = new Rect(barcodeView2.f5403q);
                    Rect rect5 = barcodeView2.f5401o;
                    rect4.offset(-rect5.left, -rect5.top);
                    Rect rect6 = new Rect((rect4.left * i11) / barcodeView2.f5401o.width(), (rect4.top * i12) / barcodeView2.f5401o.height(), (rect4.right * i11) / barcodeView2.f5401o.width(), (rect4.bottom * i12) / barcodeView2.f5401o.height());
                    barcodeView2.f5404r = rect6;
                    if (rect6.width() <= 0 || barcodeView2.f5404r.height() <= 0) {
                        barcodeView2.f5404r = null;
                        barcodeView2.f5403q = null;
                        Log.w("f", "Preview frame is too small");
                    } else {
                        eVar.e();
                    }
                }
                barcodeView2.requestLayout();
                barcodeView2.e();
                return true;
        }
    }
}
