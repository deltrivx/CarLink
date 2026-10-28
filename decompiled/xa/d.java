package xa;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f14765a = new t(new byte[0]);

    public static d c(Iterator it, int i7) {
        if (i7 == 1) {
            return (d) it.next();
        }
        int i10 = i7 >>> 1;
        return c(it, i10).d(c(it, i7 - i10));
    }

    public static c q() {
        return new c();
    }

    public final d d(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = y.f14833h;
        y yVar = this instanceof y ? (y) this : null;
        if (dVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return dVar;
        }
        int size3 = dVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = dVar.size();
            byte[] bArr = new byte[size4 + size5];
            k(0, bArr, 0, size4);
            dVar.k(0, bArr, size4, size5);
            return new t(bArr);
        }
        if (yVar != null) {
            d dVar2 = yVar.f14836d;
            if (dVar.size() + dVar2.size() < 128) {
                int size6 = dVar2.size();
                int size7 = dVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                dVar2.k(0, bArr2, 0, size6);
                dVar.k(0, bArr2, size6, size7);
                return new y(yVar.f14835c, new t(bArr2));
            }
        }
        if (yVar != null) {
            d dVar3 = yVar.f14836d;
            d dVar4 = yVar.f14835c;
            if (dVar4.n() > dVar3.n() && yVar.f14838f > dVar.n()) {
                return new y(dVar4, new y(dVar3, dVar));
            }
        }
        if (size3 >= y.f14833h[Math.max(n(), dVar.n()) + 1]) {
            return new y(this, dVar);
        }
        wb.b bVar = new wb.b(3);
        bVar.b(this);
        bVar.b(dVar);
        Stack stack = (Stack) bVar.f14284a;
        d yVar2 = (d) stack.pop();
        while (!stack.isEmpty()) {
            yVar2 = new y((d) stack.pop(), yVar2);
        }
        return yVar2;
    }

    public final void k(int i7, byte[] bArr, int i10, int i11) {
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i7);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i11 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i11);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i12 = i7 + i11;
        if (i12 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i12);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= bArr.length) {
            if (i11 > 0) {
                m(i7, bArr, i10, i11);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i13);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void m(int i7, byte[] bArr, int i10, int i11);

    public abstract int n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract int r(int i7, int i10, int i11);

    public abstract int s(int i7, int i10, int i11);

    public abstract int size();

    public abstract int t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u();

    public final String v() {
        try {
            return u();
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    public abstract void w(OutputStream outputStream, int i7, int i10);
}
