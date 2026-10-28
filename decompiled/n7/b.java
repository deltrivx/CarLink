package n7;

import b3.i0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f8870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8871b;

    public b(ByteBuffer byteBuffer, c cVar) {
        this.f8870a = byteBuffer;
        this.f8871b = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8870a.rewind();
    }

    @Override // n7.d
    public final int f() {
        return 0;
    }

    @Override // n7.d
    public final int i(k6.a aVar, i0 i0Var) {
        byte[] bArr = aVar.f7310a;
        int length = bArr.length;
        aVar.f7311b = 0;
        if (length > bArr.length) {
            byte[] bArr2 = new byte[Math.max(length, bArr.length * 2)];
            System.arraycopy(aVar.f7310a, 0, bArr2, 0, aVar.f7311b);
            aVar.f7310a = bArr2;
        }
        ByteBuffer byteBuffer = this.f8870a;
        int iRemaining = byteBuffer.remaining();
        if (length > iRemaining) {
            length = iRemaining;
        }
        if (length > 0) {
            byteBuffer.get(aVar.f7310a, aVar.f7311b, length);
            aVar.f7311b += length;
        }
        int i7 = aVar.f7311b;
        if (i7 == 0) {
            return -1;
        }
        return i7;
    }

    @Override // n7.d
    public final boolean isClosed() {
        return this.f8870a.remaining() == 0;
    }

    @Override // n7.d
    public final c k() {
        this.f8870a.rewind();
        return this.f8871b;
    }
}
