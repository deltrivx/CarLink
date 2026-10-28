package xa;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14827c = 0;

    public t(byte[] bArr) {
        this.f14826b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof t) {
            return x((t) obj, 0, size());
        }
        if (obj instanceof y) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(ob.a.s(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iR = this.f14827c;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f14827c = iR;
        }
        return iR;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new com.google.protobuf.h(this);
    }

    @Override // xa.d
    public void m(int i7, byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f14826b, i7, bArr, i10, i11);
    }

    @Override // xa.d
    public final int n() {
        return 0;
    }

    @Override // xa.d
    public final boolean o() {
        return true;
    }

    @Override // xa.d
    public final boolean p() {
        byte[] bArr = this.f14826b;
        return c0.c(bArr, 0, bArr.length) == 0;
    }

    @Override // xa.d
    public final int r(int i7, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i7 = (i7 * 31) + this.f14826b[i12];
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // xa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f14826b
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = xa.c0.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = xa.c0.a(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = xa.c0.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.t.s(int, int, int):int");
    }

    @Override // xa.d
    public int size() {
        return this.f14826b.length;
    }

    @Override // xa.d
    public final int t() {
        return this.f14827c;
    }

    @Override // xa.d
    public final String u() {
        byte[] bArr = this.f14826b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // xa.d
    public final void w(OutputStream outputStream, int i7, int i10) throws IOException {
        outputStream.write(this.f14826b, i7, i10);
    }

    public final boolean x(t tVar, int i7, int i10) {
        byte[] bArr = tVar.f14826b;
        int length = bArr.length;
        byte[] bArr2 = this.f14826b;
        if (i10 > length) {
            int length2 = bArr2.length;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i7 + i10 <= bArr.length) {
            int i11 = 0;
            while (i11 < i10) {
                if (bArr2[i11] != bArr[i7]) {
                    return false;
                }
                i11++;
                i7++;
            }
            return true;
        }
        int length3 = tVar.f14826b.length;
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i7);
        sb3.append(", ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(length3);
        throw new IllegalArgumentException(sb3.toString());
    }
}
