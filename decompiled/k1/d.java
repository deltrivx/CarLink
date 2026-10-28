package k1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n[] f7152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7154c = true;

    public d(m mVar, n[] nVarArr) {
        this.f7152a = nVarArr;
        nVarArr[0].a(mVar.f7176d, Integer.bitCount(mVar.f7173a) * 2, 0);
        this.f7153b = 0;
        a();
    }

    public final void a() {
        int i7 = this.f7153b;
        n[] nVarArr = this.f7152a;
        n nVar = nVarArr[i7];
        if (nVar.f7179c < nVar.f7178b) {
            return;
        }
        while (-1 < i7) {
            int iB = b(i7);
            if (iB == -1) {
                n nVar2 = nVarArr[i7];
                int i10 = nVar2.f7179c;
                Object[] objArr = nVar2.f7177a;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f7179c = i10 + 1;
                    iB = b(i7);
                }
            }
            if (iB != -1) {
                this.f7153b = iB;
                return;
            }
            if (i7 > 0) {
                n nVar3 = nVarArr[i7 - 1];
                int i11 = nVar3.f7179c;
                int length2 = nVar3.f7177a.length;
                nVar3.f7179c = i11 + 1;
            }
            nVarArr[i7].a(m.f7172e.f7176d, 0, 0);
            i7--;
        }
        this.f7154c = false;
    }

    public final int b(int i7) {
        n[] nVarArr = this.f7152a;
        n nVar = nVarArr[i7];
        int i10 = nVar.f7179c;
        if (i10 < nVar.f7178b) {
            return i7;
        }
        Object[] objArr = nVar.f7177a;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i7 == 6) {
            n nVar2 = nVarArr[i7 + 1];
            Object[] objArr2 = mVar.f7176d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i7 + 1].a(mVar.f7176d, Integer.bitCount(mVar.f7173a) * 2, 0);
        }
        return b(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7154c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f7154c) {
            throw new NoSuchElementException();
        }
        Object next = this.f7152a[this.f7153b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
