package tb;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12892b;

    @Override // tb.a
    public final int c() {
        return this.f12892b;
    }

    @Override // tb.a
    public final void d(int i7, nb.g gVar) {
        Object[] objArr = this.f12891a;
        if (objArr.length <= i7) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i7);
            Object[] objArrCopyOf = Arrays.copyOf(this.f12891a, length);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12891a = objArrCopyOf;
        }
        Object[] objArr2 = this.f12891a;
        if (objArr2[i7] == null) {
            this.f12892b++;
        }
        objArr2[i7] = gVar;
    }

    @Override // tb.a
    public final Object get(int i7) {
        return u8.l.B0(this.f12891a, i7);
    }

    @Override // tb.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
