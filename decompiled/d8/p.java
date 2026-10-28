package d8;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MediaPlayer f3826a;

    public static void a(String str, final int i7, boolean z10) {
        i9.l.e(str, "fileName");
        MediaPlayer mediaPlayer = f3826a;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.reset();
                mediaPlayer.release();
            } catch (Exception unused) {
            }
        }
        f3826a = null;
        File file = new File(n8.a.b().getExternalFilesDir(null), "audio");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            hc.c cVar = n8.c.f8897a;
            n8.c.j(0, "文件不存在: ".concat(str));
            Logger.INSTANCE.e(Constants.TAG, ob.a.q("文件不存在: ", file2.getAbsolutePath()));
            return;
        }
        try {
            final MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: d8.m
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i10, int i11) {
                    Logger.INSTANCE.e(Constants.TAG, a2.f.D(i10, i11, "播放错误 what=", " extra="));
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.j(0, "音频通道 " + i7 + " 无效");
                    return true;
                }
            });
            mediaPlayer2.setDataSource(file2.getAbsolutePath());
            if (Build.VERSION.SDK_INT < 23 || z10) {
                mediaPlayer2.setAudioStreamType(i7);
            } else {
                mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(i7).setContentType(2).build());
            }
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: d8.n
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    mediaPlayer2.start();
                }
            });
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: d8.o
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    mediaPlayer2.release();
                }
            });
            mediaPlayer2.prepareAsync();
            f3826a = mediaPlayer2;
        } catch (IOException e7) {
            hc.c cVar2 = n8.c.f8897a;
            n8.c.j(0, "音频加载失败");
            Logger.INSTANCE.e(Constants.TAG, ob.a.q("IO 错误: ", e7.getMessage()));
        } catch (Exception e10) {
            hc.c cVar3 = n8.c.f8897a;
            n8.c.j(0, "音频通道 " + i7 + " 无效");
            Logger.INSTANCE.e(Constants.TAG, ob.a.q("未知错误: ", e10.getMessage()));
        }
    }
}
