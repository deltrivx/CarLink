package j1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f6886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f6888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6889f;

    public h(f fVar, int i7) {
        super(i7, fVar.f6883h);
        this.f6886c = fVar;
        this.f6887d = fVar.n();
        this.f6889f = -1;
        b();
    }

    public final void a() {
        if (this.f6887d != this.f6886c.n()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j1.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i7 = this.f6866a;
        f fVar = this.f6886c;
        fVar.add(i7, obj);
        this.f6866a++;
        this.f6867b = fVar.c();
        this.f6887d = fVar.n();
        this.f6889f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f6886c;
        Object[] objArr = fVar.f6881f;
        if (objArr == null) {
            this.f6888e = null;
            return;
        }
        int i7 = (fVar.f6883h - 1) & (-32);
        int i10 = this.f6866a;
        if (i10 > i7) {
            i10 = i7;
        }
        int i11 = (fVar.f6879d / 5) + 1;
        j jVar = this.f6888e;
        if (jVar == null) {
            this.f6888e = new j(objArr, i10, i7, i11);
            return;
        }
        jVar.f6866a = i10;
        jVar.f6867b = i7;
        jVar.f6892c = i11;
        if (jVar.f6893d.length < i11) {
            jVar.f6893d = new Object[i11];
        }
        jVar.f6893d[0] = objArr;
        ?? r8 = i10 == i7 ? 1 : 0;
        jVar.f6894e = r8;
        jVar.b(i10 - r8, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6866a;
        this.f6889f = i7;
        j jVar = this.f6888e;
        f fVar = this.f6886c;
        if (jVar == null) {
            Object[] objArr = fVar.f6882g;
            this.f6866a = i7 + 1;
            return objArr[i7];
        }
        if (jVar.hasNext()) {
            this.f6866a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f6882g;
        int i10 = this.f6866a;
        this.f6866a = i10 + 1;
        return objArr2[i10 - jVar.f6867b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6866a;
        this.f6889f = i7 - 1;
        j jVar = this.f6888e;
        f fVar = this.f6886c;
        if (jVar == null) {
            Object[] objArr = fVar.f6882g;
            int i10 = i7 - 1;
            this.f6866a = i10;
            return objArr[i10];
        }
        int i11 = jVar.f6867b;
        if (i7 <= i11) {
            this.f6866a = i7 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f6882g;
        int i12 = i7 - 1;
        this.f6866a = i12;
        return objArr2[i12 - i11];
    }

    @Override // j1.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i7 = this.f6889f;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f6886c;
        fVar.d(i7);
        int i10 = this.f6889f;
        if (i10 < this.f6866a) {
            this.f6866a = i10;
        }
        this.f6867b = fVar.c();
        this.f6887d = fVar.n();
        this.f6889f = -1;
        b();
    }

    @Override // j1.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f6889f;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f6886c;
        fVar.set(i7, obj);
        this.f6887d = fVar.n();
        b();
    }
}
