package i8;

import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends SurfaceView implements SurfaceHolder.Callback {
    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e7) {
            Logger.INSTANCE.e("VideoSurface", "onAttachedToWindow failed, safely ignored.", e7);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.e(motionEvent, "event");
        if (h8.b.f6456a.f6452f == null) {
            return true;
        }
        h8.b.b(this, motionEvent);
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        l.e(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l.e(surfaceHolder, "holder");
        h8.a aVar = h8.b.f6456a;
        h8.b.a(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l.e(surfaceHolder, "holder");
        h8.b.a(null);
    }
}
