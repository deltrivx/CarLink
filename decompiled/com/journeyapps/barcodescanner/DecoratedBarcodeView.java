package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import f7.l;
import f7.p;
import g7.j;
import r5.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeView f2897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewfinderView f2898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f2899c;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f11638c);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f2897a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.f2898b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f2897a);
        this.f2899c = (TextView) findViewById(R.id.zxing_status_view);
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public j getCameraSettings() {
        return this.f2897a.getCameraSettings();
    }

    public l getDecoderFactory() {
        return this.f2897a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f2899c;
    }

    public ViewfinderView getViewFinder() {
        return this.f2898b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 24) {
            this.f2897a.setTorch(true);
            return true;
        }
        if (i7 == 25) {
            this.f2897a.setTorch(false);
            return true;
        }
        if (i7 == 27 || i7 == 80) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    public void setCameraSettings(j jVar) {
        this.f2897a.setCameraSettings(jVar);
    }

    public void setDecoderFactory(l lVar) {
        this.f2897a.setDecoderFactory(lVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f2899c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(p pVar) {
    }
}
