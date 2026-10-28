package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2753a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2754b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterable f2756d;

    public h(k kVar) {
        this.f2756d = kVar;
        this.f2755c = kVar.size();
    }

    public h(xa.t tVar) {
        this.f2756d = tVar;
        this.f2755c = tVar.f14826b.length;
    }

    public byte a() {
        try {
            byte[] bArr = ((xa.t) this.f2756d).f14826b;
            int i7 = this.f2754b;
            this.f2754b = i7 + 1;
            return bArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2753a) {
            case 0:
                return this.f2754b < this.f2755c;
            default:
                return this.f2754b < this.f2755c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2753a) {
            case 0:
                int i7 = this.f2754b;
                if (i7 >= this.f2755c) {
                    throw new NoSuchElementException();
                }
                this.f2754b = i7 + 1;
                return Byte.valueOf(((k) this.f2756d).o(i7));
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2753a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
