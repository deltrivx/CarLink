package i8;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.Surface;
import com.baidu.carlife.sdk.internal.transport.communicator.SocketCommunicator;
import i9.l;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends GLSurfaceView implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceTexture f6657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h8.d f6659c;

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        SurfaceTexture surfaceTexture = this.f6657a;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        GLES20.glClear(16384);
        h8.d dVar = this.f6659c;
        if (dVar == null) {
            l.j("shader");
            throw null;
        }
        int i7 = this.f6658b;
        int i10 = dVar.f6461e;
        int i11 = dVar.f6460d;
        int i12 = dVar.f6457a;
        if (i12 == 0) {
            return;
        }
        GLES20.glUseProgram(i12);
        int i13 = dVar.f6462f;
        if (i13 >= 0) {
            GLES20.glUniformMatrix4fv(i13, 1, false, dVar.f6464h, 0);
        }
        if (i11 >= 0) {
            GLES20.glEnableVertexAttribArray(i11);
            GLES20.glVertexAttribPointer(dVar.f6460d, 2, 5126, false, 0, (Buffer) dVar.f6458b);
        }
        if (i10 >= 0) {
            GLES20.glEnableVertexAttribArray(i10);
            GLES20.glVertexAttribPointer(dVar.f6461e, 2, 5126, false, 0, (Buffer) dVar.f6459c);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i7);
        int i14 = dVar.f6463g;
        if (i14 >= 0) {
            GLES20.glUniform1i(i14, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        if (i11 >= 0) {
            GLES20.glDisableVertexAttribArray(i11);
        }
        if (i10 >= 0) {
            GLES20.glDisableVertexAttribArray(i10);
        }
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        super.onPause();
        h8.b.a(null);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i7 = iArr[0];
        this.f6658b = i7;
        GLES20.glBindTexture(36197, i7);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, SocketCommunicator.MAX_PACKET_SIZE, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f6658b);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: i8.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f6656a.requestRender();
            }
        });
        this.f6657a = surfaceTexture;
        h8.a aVar = h8.b.f6456a;
        h8.b.a(new Surface(this.f6657a));
        this.f6659c = new h8.d();
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
