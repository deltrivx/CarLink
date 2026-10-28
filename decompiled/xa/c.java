package xa;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f14757f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14760c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14762e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14758a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14759b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f14761d = new byte[128];

    public final void a(int i7) {
        this.f14759b.add(new t(this.f14761d));
        int length = this.f14760c + this.f14761d.length;
        this.f14760c = length;
        this.f14761d = new byte[Math.max(this.f14758a, Math.max(i7, length >>> 1))];
        this.f14762e = 0;
    }

    public final void b() {
        int i7 = this.f14762e;
        byte[] bArr = this.f14761d;
        int length = bArr.length;
        ArrayList arrayList = this.f14759b;
        if (i7 >= length) {
            arrayList.add(new t(this.f14761d));
            this.f14761d = f14757f;
        } else if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i7));
            arrayList.add(new t(bArr2));
        }
        this.f14760c += this.f14762e;
        this.f14762e = 0;
    }

    public final synchronized d c() {
        ArrayList arrayList;
        b();
        arrayList = this.f14759b;
        if (!(arrayList != null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((d) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? d.f14765a : d.c(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i7;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i7 = this.f14760c + this.f14762e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i7));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        try {
            if (this.f14762e == this.f14761d.length) {
                a(1);
            }
            byte[] bArr = this.f14761d;
            int i10 = this.f14762e;
            this.f14762e = i10 + 1;
            bArr[i10] = (byte) i7;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i10) {
        try {
            byte[] bArr2 = this.f14761d;
            int length = bArr2.length;
            int i11 = this.f14762e;
            if (i10 <= length - i11) {
                System.arraycopy(bArr, i7, bArr2, i11, i10);
                this.f14762e += i10;
            } else {
                int length2 = bArr2.length - i11;
                System.arraycopy(bArr, i7, bArr2, i11, length2);
                int i12 = i10 - length2;
                a(i12);
                System.arraycopy(bArr, i7 + length2, this.f14761d, 0, i12);
                this.f14762e = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
