package n7;

import android.media.AudioTrack;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8875d;

    public /* synthetic */ c(int i7, int i10, int i11) {
        this(i7, i10, i11, -1L);
    }

    public c(int i7, int i10, int i11, long j5) {
        this.f8872a = i7;
        this.f8873b = i10;
        this.f8874c = i11;
        this.f8875d = j5;
    }

    public final int a() {
        int iIntValue;
        int i7 = this.f8872a;
        if (8000 > i7 || i7 >= 16001) {
            iIntValue = (16000 > i7 || i7 >= 32001) ? 65536 : 32768;
        } else {
            iIntValue = 16384;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i7, this.f8873b == 1 ? 4 : 12, this.f8874c == 16 ? 2 : 3);
        Integer numValueOf = Integer.valueOf(minBufferSize);
        if (minBufferSize <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            Logger.INSTANCE.w(Constants.TAG, "getMinBufferSize 返回非法值，使用默认缓冲区大小");
        }
        int i10 = iIntValue * 2;
        if (i10 > 1048576) {
            return 1048576;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8872a == cVar.f8872a && this.f8873b == cVar.f8873b && this.f8874c == cVar.f8874c && this.f8875d == cVar.f8875d;
    }

    public final int hashCode() {
        int i7 = ((((this.f8872a * 31) + this.f8873b) * 31) + this.f8874c) * 31;
        long j5 = this.f8875d;
        return i7 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "AudioParams(sampleRate=" + this.f8872a + ", channelCount=" + this.f8873b + ", bitDepth=" + this.f8874c + ", duration=" + this.f8875d + ")";
    }
}
