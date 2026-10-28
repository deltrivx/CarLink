package c0;

import android.os.Parcel;
import n3.r;
import n3.s;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f1798a;

    public long a() {
        int i7 = q.f14959n;
        long j5 = this.f1798a.readLong();
        long j10 = 63 & j5;
        return j10 < 16 ? j5 : (j5 & (-64)) | (j10 + 1);
    }

    public long b() {
        long j5;
        Parcel parcel = this.f1798a;
        byte b10 = parcel.readByte();
        if (b10 == 1) {
            j5 = 4294967296L;
        } else {
            j5 = b10 == 2 ? 8589934592L : 0L;
        }
        return s.a(j5, 0L) ? n3.q.f8754c : r.K(parcel.readFloat(), j5);
    }

    public void c(byte b10) {
        this.f1798a.writeByte(b10);
    }

    public void d(float f10) {
        this.f1798a.writeFloat(f10);
    }

    public void e(long j5) {
        long jB = n3.q.b(j5);
        byte b10 = 0;
        if (!s.a(jB, 0L)) {
            if (s.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (s.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        c(b10);
        if (s.a(n3.q.b(j5), 0L)) {
            return;
        }
        d(n3.q.c(j5));
    }
}
