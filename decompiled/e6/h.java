package e6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.util.Log;
import com.baidu.carlifevehicle.R;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.IOException;
import n3.t;
import rc.u;
import z.j1;
import z.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h implements j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4443c;

    public h(CaptureActivity captureActivity) {
        this.f4441a = 3;
        this.f4442b = true;
        captureActivity.setVolumeControlStream(3);
        this.f4443c = captureActivity.getApplicationContext();
    }

    public h(j.g gVar) {
        this.f4441a = 4;
        this.f4443c = gVar;
        this.f4442b = true;
    }

    public /* synthetic */ h(Object obj, int i7, boolean z10) {
        this.f4441a = i7;
        this.f4442b = z10;
        this.f4443c = obj;
    }

    @Override // j2.a
    public /* synthetic */ long G(int i7, long j5) {
        return 0L;
    }

    public void a() {
        this.f4442b = false;
    }

    public void b() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new r5.b());
        mediaPlayer.setOnErrorListener(new r5.c());
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = ((Context) this.f4443c).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException e7) {
            Log.w("h", e7);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public void c(byte b10) {
        ((j.g) this.f4443c).k(String.valueOf(b10));
    }

    public void d(char c10) {
        j.g gVar = (j.g) this.f4443c;
        gVar.e(gVar.f6794b, 1);
        char[] cArr = (char[]) gVar.f6795c;
        int i7 = gVar.f6794b;
        gVar.f6794b = i7 + 1;
        cArr[i7] = c10;
    }

    public void e(int i7) {
        ((j.g) this.f4443c).k(String.valueOf(i7));
    }

    public void f(long j5) {
        ((j.g) this.f4443c).k(String.valueOf(j5));
    }

    @Override // j2.a
    public long f0(long j5, long j10, int i7) {
        if (!this.f4442b) {
            return 0L;
        }
        t1 t1Var = (t1) this.f4443c;
        if (t1Var.f15517a.a()) {
            return 0L;
        }
        return t1Var.h(t1Var.d(t1Var.f15517a.e(t1Var.d(t1Var.g(j10)))));
    }

    public void g(String str) {
        i9.l.e(str, "v");
        ((j.g) this.f4443c).k(str);
    }

    public void h(short s2) {
        ((j.g) this.f4443c).k(String.valueOf(s2));
    }

    public void i(String str) {
        byte b10;
        i9.l.e(str, "value");
        j.g gVar = (j.g) this.f4443c;
        gVar.e(gVar.f6794b, str.length() + 2);
        char[] cArr = (char[]) gVar.f6795c;
        int i7 = gVar.f6794b;
        int i10 = i7 + 1;
        cArr[i7] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            byte[] bArr = u.f12369b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = str.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    gVar.e(i12, 2);
                    char cCharAt = str.charAt(i13);
                    byte[] bArr2 = u.f12369b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) gVar.f6795c)[i12] = cCharAt;
                        i12 = i14;
                    } else if (b10 == 1) {
                        String str2 = u.f12368a[cCharAt];
                        i9.l.b(str2);
                        gVar.e(i12, str2.length());
                        str2.getChars(0, str2.length(), (char[]) gVar.f6795c, i12);
                        int length3 = str2.length() + i12;
                        gVar.f6794b = length3;
                        i12 = length3;
                    } else {
                        char[] cArr2 = (char[]) gVar.f6795c;
                        cArr2[i12] = '\\';
                        cArr2[i12 + 1] = (char) b10;
                        i12 += 2;
                        gVar.f6794b = i12;
                    }
                }
                gVar.e(i12, 1);
                ((char[]) gVar.f6795c)[i12] = '\"';
                gVar.f6794b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        gVar.f6794b = i11 + 1;
    }

    public void j() {
    }

    public void k() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j2.a
    public Object l(long j5, long j10, y8.c cVar) {
        j1 j1Var;
        long jD;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i7 = j1Var.f15418d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                j1Var.f15418d = i7 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, (a9.c) cVar);
            }
        } else {
            j1Var = new j1(this, (a9.c) cVar);
        }
        Object objA = j1Var.f15416b;
        int i10 = j1Var.f15418d;
        if (i10 == 0) {
            t8.a.e(objA);
            jD = 0;
            if (this.f4442b) {
                t1 t1Var = (t1) this.f4443c;
                if (!t1Var.f15525i) {
                    j1Var.f15415a = j10;
                    j1Var.f15418d = 1;
                    objA = t1Var.a(j10, j1Var);
                    z8.a aVar = z8.a.f15774a;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = t.d(j10, jD);
            }
            return new t(jD);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = j1Var.f15415a;
        t8.a.e(objA);
        jD = ((t) objA).f8763a;
        jD = t.d(j10, jD);
        return new t(jD);
    }

    public String toString() {
        switch (this.f4441a) {
            case 2:
                return this.f4442b ? "FALL_THROUGH" : String.valueOf(this.f4443c);
            default:
                return super.toString();
        }
    }

    @Override // j2.a
    public Object u(long j5, y8.c cVar) {
        return new t(0L);
    }
}
