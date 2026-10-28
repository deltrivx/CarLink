package zb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15827e;

    public h(CharSequence charSequence) {
        i9.l.e(charSequence, "string");
        this.f15823a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10;
        int i11 = this.f15824b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f15827e < 0) {
            this.f15824b = 2;
            return false;
        }
        CharSequence charSequence = this.f15823a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f15825c; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f15824b = 1;
                this.f15827e = i7;
                this.f15826d = length;
                return true;
            }
        }
        i7 = -1;
        this.f15824b = 1;
        this.f15827e = i7;
        this.f15826d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15824b = 0;
        int i7 = this.f15826d;
        int i10 = this.f15825c;
        this.f15825c = this.f15827e + i7;
        return this.f15823a.subSequence(i10, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
