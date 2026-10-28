package z4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15731d;

    public g(int i7, int i10, long j5, long j10) {
        this.f15728a = i7;
        this.f15729b = i10;
        this.f15730c = j5;
        this.f15731d = j10;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f15728a);
            dataOutputStream.writeInt(this.f15729b);
            dataOutputStream.writeLong(this.f15730c);
            dataOutputStream.writeLong(this.f15731d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f15729b == gVar.f15729b && this.f15730c == gVar.f15730c && this.f15728a == gVar.f15728a && this.f15731d == gVar.f15731d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15729b), Long.valueOf(this.f15730c), Integer.valueOf(this.f15728a), Long.valueOf(this.f15731d));
    }
}
