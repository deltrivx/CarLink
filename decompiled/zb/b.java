package zb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15805a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n9.d f15808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f15810f;

    public b(c cVar) {
        this.f15810f = cVar;
        int iM = r.m(0, 0, cVar.f15811a.length());
        this.f15806b = iM;
        this.f15807c = iM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        t8.j jVar;
        c cVar = this.f15810f;
        CharSequence charSequence = cVar.f15811a;
        int i7 = this.f15807c;
        if (i7 < 0) {
            this.f15805a = 0;
            this.f15808d = null;
            return;
        }
        int i10 = cVar.f15812b;
        if (i10 > 0) {
            int i11 = this.f15809e + 1;
            this.f15809e = i11;
            if (i11 >= i10) {
                this.f15808d = new n9.d(this.f15806b, j.w0(charSequence), 1);
                this.f15807c = -1;
            } else if (i7 > charSequence.length() && (jVar = (t8.j) cVar.f15813c.invoke(charSequence, Integer.valueOf(this.f15807c))) != null) {
                int iIntValue = ((Number) jVar.f12830a).intValue();
                int iIntValue2 = ((Number) jVar.f12831b).intValue();
                this.f15808d = r.e0(this.f15806b, iIntValue);
                int i12 = iIntValue + iIntValue2;
                this.f15806b = i12;
                this.f15807c = i12 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f15808d = new n9.d(this.f15806b, j.w0(charSequence), 1);
                this.f15807c = -1;
            }
        } else if (i7 > charSequence.length()) {
            this.f15808d = new n9.d(this.f15806b, j.w0(charSequence), 1);
            this.f15807c = -1;
        } else {
            int iIntValue3 = ((Number) jVar.f12830a).intValue();
            int iIntValue4 = ((Number) jVar.f12831b).intValue();
            this.f15808d = r.e0(this.f15806b, iIntValue3);
            int i13 = iIntValue3 + iIntValue4;
            this.f15806b = i13;
            this.f15807c = i13 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f15805a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15805a == -1) {
            a();
        }
        return this.f15805a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15805a == -1) {
            a();
        }
        if (this.f15805a == 0) {
            throw new NoSuchElementException();
        }
        n9.d dVar = this.f15808d;
        i9.l.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f15808d = null;
        this.f15805a = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
