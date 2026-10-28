package p4;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f10168b = new StringBuilder(128);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10167a = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f10168b;
        if (sb2.length() > 0) {
            Log.d(this.f10167a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i7 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f10168b.append(c10);
            }
        }
    }
}
