package xa;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f14824b = new h0(new r());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14825a;

    public r() {
        this.f14825a = new ArrayList();
    }

    public r(s sVar) {
        this.f14825a = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override // xa.s
    public final List a() {
        return Collections.unmodifiableList(this.f14825a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f14825a.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).a();
        }
        boolean zAddAll = this.f14825a.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f14825a.size(), collection);
    }

    @Override // xa.s
    public final h0 b() {
        return new h0(this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14825a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f14825a;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strV = dVar.v();
            if (dVar.p()) {
                arrayList.set(i7, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = p.f14822a;
        try {
            String str = new String(bArr, "UTF-8");
            if (c0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
            return str;
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // xa.s
    public final d h(int i7) {
        d tVar;
        ArrayList arrayList = this.f14825a;
        Object obj = arrayList.get(i7);
        if (obj instanceof d) {
            tVar = (d) obj;
        } else if (obj instanceof String) {
            try {
                tVar = new t(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException("UTF-8 not supported?", e7);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tVar = new t(bArr2);
        }
        if (tVar != obj) {
            arrayList.set(i7, tVar);
        }
        return tVar;
    }

    @Override // xa.s
    public final void l(t tVar) {
        this.f14825a.add(tVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        Object objRemove = this.f14825a.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof d) {
            return ((d) objRemove).v();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = p.f14822a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2 = this.f14825a.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof d) {
            return ((d) obj2).v();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p.f14822a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14825a.size();
    }
}
