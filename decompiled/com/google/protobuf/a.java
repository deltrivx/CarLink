package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(InputStream inputStream, int i7, int i10) {
        super(inputStream);
        this.f2707a = i10;
        this.f2708b = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f2707a) {
            case 0:
                break;
        }
        return Math.min(super.available(), this.f2708b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2707a) {
            case 0:
                if (this.f2708b <= 0) {
                    return -1;
                }
                int i7 = super.read();
                if (i7 < 0) {
                    return i7;
                }
                this.f2708b--;
                return i7;
            default:
                if (this.f2708b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 < 0) {
                    return i10;
                }
                this.f2708b--;
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        switch (this.f2707a) {
            case 0:
                int i11 = this.f2708b;
                if (i11 <= 0) {
                    return -1;
                }
                int i12 = super.read(bArr, i7, Math.min(i10, i11));
                if (i12 < 0) {
                    return i12;
                }
                this.f2708b -= i12;
                return i12;
            default:
                int i13 = this.f2708b;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i7, Math.min(i10, i13));
                if (i14 < 0) {
                    return i14;
                }
                this.f2708b -= i14;
                return i14;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        switch (this.f2707a) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j5, this.f2708b));
                if (iSkip >= 0) {
                    this.f2708b -= iSkip;
                }
                return iSkip;
            default:
                long jSkip = super.skip(Math.min(j5, this.f2708b));
                if (jSkip >= 0) {
                    this.f2708b = (int) (((long) this.f2708b) - jSkip);
                }
                return jSkip;
        }
    }
}
