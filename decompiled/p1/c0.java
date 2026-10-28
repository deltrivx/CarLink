package p1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ListIterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10013a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10015c;

    public c0(i9.v vVar, d0 d0Var) {
        this.f10014b = vVar;
        this.f10015c = d0Var;
    }

    public c0(u8.d0 d0Var, int i7) {
        this.f10015c = d0Var;
        this.f10014b = d0Var.f13107a.listIterator(u8.p.e0(i7, d0Var));
    }

    public c0(u8.e0 e0Var, int i7) {
        this.f10015c = e0Var;
        this.f10014b = ((List) e0Var.f13109b).listIterator(u8.p.e0(i7, e0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f10013a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f10014b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10013a) {
            case 0:
                return ((i9.v) this.f10014b).f6686a < ((d0) this.f10015c).f10021d - 1;
            case 1:
                return ((ListIterator) this.f10014b).hasPrevious();
            default:
                return ((ListIterator) this.f10014b).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f10013a) {
            case 0:
                return ((i9.v) this.f10014b).f6686a >= 0;
            case 1:
                return ((ListIterator) this.f10014b).hasNext();
            default:
                return ((ListIterator) this.f10014b).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f10013a) {
            case 0:
                i9.v vVar = (i9.v) this.f10014b;
                int i7 = vVar.f6686a + 1;
                d0 d0Var = (d0) this.f10015c;
                q.a(i7, d0Var.f10021d);
                vVar.f6686a = i7;
                return d0Var.get(i7);
            case 1:
                return ((ListIterator) this.f10014b).previous();
            default:
                return ((ListIterator) this.f10014b).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f10013a) {
            case 0:
                return ((i9.v) this.f10014b).f6686a + 1;
            case 1:
                u8.d0 d0Var = (u8.d0) this.f10015c;
                return n3.l.A(d0Var) - ((ListIterator) this.f10014b).previousIndex();
            default:
                u8.e0 e0Var = (u8.e0) this.f10015c;
                return n3.l.A(e0Var) - ((ListIterator) this.f10014b).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f10013a) {
            case 0:
                i9.v vVar = (i9.v) this.f10014b;
                int i7 = vVar.f6686a;
                d0 d0Var = (d0) this.f10015c;
                q.a(i7, d0Var.f10021d);
                vVar.f6686a = i7 - 1;
                return d0Var.get(i7);
            case 1:
                return ((ListIterator) this.f10014b).next();
            default:
                return ((ListIterator) this.f10014b).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f10013a) {
            case 0:
                return ((i9.v) this.f10014b).f6686a;
            case 1:
                u8.d0 d0Var = (u8.d0) this.f10015c;
                return n3.l.A(d0Var) - ((ListIterator) this.f10014b).nextIndex();
            default:
                u8.e0 e0Var = (u8.e0) this.f10015c;
                return n3.l.A(e0Var) - ((ListIterator) this.f10014b).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f10013a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f10014b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f10013a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f10014b).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
