package i8;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends TextureView implements TextureView.SurfaceTextureListener {
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        l.e(surfaceTexture, "surfaceTexture");
        h8.a aVar = h8.b.f6456a;
        h8.b.a(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l.e(surfaceTexture, "surfaceTexture");
        h8.b.a(null);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        l.e(surfaceTexture, "surfaceTexture");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        l.e(surfaceTexture, "surfaceTexture");
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
}
