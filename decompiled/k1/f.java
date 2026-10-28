package k1;

import i9.b0;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7164g;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f7157c, nVarArr);
        this.f7161d = eVar;
        this.f7164g = eVar.f7159e;
    }

    public final void c(int i7, m mVar, Object obj, int i10) {
        int i11 = i10 * 5;
        n[] nVarArr = this.f7152a;
        if (i11 <= 30) {
            int iJ = 1 << a.a.J(i7, i11);
            if (mVar.h(iJ)) {
                nVarArr[i10].a(mVar.f7176d, Integer.bitCount(mVar.f7173a) * 2, mVar.f(iJ));
                this.f7153b = i10;
                return;
            } else {
                int iT = mVar.t(iJ);
                m mVarS = mVar.s(iT);
                nVarArr[i10].a(mVar.f7176d, Integer.bitCount(mVar.f7173a) * 2, iT);
                c(i7, mVarS, obj, i10 + 1);
                return;
            }
        }
        n nVar = nVarArr[i10];
        Object[] objArr = mVar.f7176d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i10];
            if (i9.l.a(nVar2.f7177a[nVar2.f7179c], obj)) {
                this.f7153b = i10;
                return;
            } else {
                nVarArr[i10].f7179c += 2;
            }
        }
    }

    @Override // k1.d, java.util.Iterator
    public final Object next() {
        if (this.f7161d.f7159e != this.f7164g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f7154c) {
            throw new NoSuchElementException();
        }
        n nVar = this.f7152a[this.f7153b];
        this.f7162e = nVar.f7177a[nVar.f7179c];
        this.f7163f = true;
        return super.next();
    }

    @Override // k1.d, java.util.Iterator
    public final void remove() {
        if (!this.f7163f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f7154c;
        e eVar = this.f7161d;
        if (!z10) {
            b0.b(eVar).remove(this.f7162e);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = this.f7152a[this.f7153b];
            Object obj = nVar.f7177a[nVar.f7179c];
            b0.b(eVar).remove(this.f7162e);
            c(obj != null ? obj.hashCode() : 0, eVar.f7157c, obj, 0);
        }
        this.f7162e = null;
        this.f7163f = false;
        this.f7164g = eVar.f7159e;
    }
}
