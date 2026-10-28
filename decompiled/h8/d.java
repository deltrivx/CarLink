package h8;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f6458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f6459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f6464h;

    public d() {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.f6460d = -1;
        this.f6461e = -1;
        this.f6462f = -1;
        this.f6463g = -1;
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        this.f6464h = fArr3;
        int iA = a(35633, "\n        attribute vec4 aPosition;\n        attribute vec4 aTexCoord;\n        uniform mat4 uSTMatrix; \n        varying vec2 vTexCoord;\n        void main() {\n            gl_Position = aPosition;\n            // 应用纹理变换矩阵\n            vTexCoord = (uSTMatrix * aTexCoord).xy;\n        }\n    ");
        int iA2 = a(35632, "\n        #extension GL_OES_EGL_image_external : require\n        precision mediump float;\n        varying vec2 vTexCoord;\n        uniform samplerExternalOES sTexture;\n        void main() {\n            gl_FragColor = texture2D(sTexture, vTexCoord);\n        }\n    ");
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("VideoShader", "Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
            GLES20.glDeleteProgram(iGlCreateProgram);
            this.f6457a = 0;
        }
        this.f6457a = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            this.f6460d = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
            this.f6461e = GLES20.glGetAttribLocation(iGlCreateProgram, "aTexCoord");
            this.f6462f = GLES20.glGetUniformLocation(iGlCreateProgram, "uSTMatrix");
            this.f6463g = GLES20.glGetUniformLocation(iGlCreateProgram, "sTexture");
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.f6458b = floatBufferAsFloatBuffer;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.f6459c = floatBufferAsFloatBuffer2;
    }

    public static int a(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("VideoShader", "Could not compile shader " + i7 + ": " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
