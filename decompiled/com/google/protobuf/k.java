package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class k extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2780d;

    public k(byte[] bArr) {
        this.f2787a = 0;
        bArr.getClass();
        this.f2780d = bArr;
    }

    @Override // com.google.protobuf.l
    public byte c(int i7) {
        return this.f2780d[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || size() != ((l) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof k)) {
            return obj.equals(this);
        }
        k kVar = (k) obj;
        int i7 = this.f2787a;
        int i10 = kVar.f2787a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > kVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > kVar.size()) {
            StringBuilder sbT = ob.a.t("Ran off end of other: 0, ", ", ", size);
            sbT.append(kVar.size());
            throw new IllegalArgumentException(sbT.toString());
        }
        byte[] bArr = kVar.f2780d;
        int iW = w() + size;
        int iW2 = w();
        int iW3 = kVar.w();
        while (iW2 < iW) {
            if (this.f2780d[iW2] != bArr[iW3]) {
                return false;
            }
            iW2++;
            iW3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }

    @Override // com.google.protobuf.l
    public void n(byte[] bArr, int i7) {
        System.arraycopy(this.f2780d, 0, bArr, 0, i7);
    }

    @Override // com.google.protobuf.l
    public byte o(int i7) {
        return this.f2780d[i7];
    }

    @Override // com.google.protobuf.l
    public final boolean p() {
        int iW = w();
        return m2.f2795a.K(this.f2780d, iW, size() + iW);
    }

    @Override // com.google.protobuf.l
    public final p q() {
        return p.f(this.f2780d, w(), size(), true);
    }

    @Override // com.google.protobuf.l
    public final int r(int i7, int i10) {
        int iW = w();
        Charset charset = u0.f2861a;
        for (int i11 = iW; i11 < iW + i10; i11++) {
            i7 = (i7 * 31) + this.f2780d[i11];
        }
        return i7;
    }

    @Override // com.google.protobuf.l
    public final l s(int i7) {
        int iD = l.d(0, i7, size());
        return iD == 0 ? l.f2785b : new j(this.f2780d, w(), iD);
    }

    @Override // com.google.protobuf.l
    public int size() {
        return this.f2780d.length;
    }

    @Override // com.google.protobuf.l
    public final String t(Charset charset) {
        return new String(this.f2780d, w(), size(), charset);
    }

    @Override // com.google.protobuf.l
    public final void v(u uVar) {
        uVar.U(this.f2780d, w(), size());
    }

    public int w() {
        return 0;
    }
}
