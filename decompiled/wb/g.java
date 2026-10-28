package wb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14292b;

    public static /* synthetic */ void c(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i7 == 2 || i7 == 3) {
            objArr[1] = "iterator";
        } else if (i7 == 5 || i7 == 6 || i7 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        if (i7 < 0 || i7 > (i10 = this.f14291a)) {
            StringBuilder sbT = ob.a.t("Index: ", ", Size: ", i7);
            sbT.append(this.f14291a);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 == 0) {
            this.f14292b = obj;
        } else if (i10 == 1 && i7 == 0) {
            this.f14292b = new Object[]{obj, this.f14292b};
        } else {
            Object[] objArr = new Object[i10 + 1];
            if (i10 == 1) {
                objArr[0] = this.f14292b;
            } else {
                Object[] objArr2 = (Object[]) this.f14292b;
                System.arraycopy(objArr2, 0, objArr, 0, i7);
                System.arraycopy(objArr2, i7, objArr, i7 + 1, this.f14291a - i7);
            }
            objArr[i7] = obj;
            this.f14292b = objArr;
        }
        this.f14291a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i7 = this.f14291a;
        if (i7 == 0) {
            this.f14292b = obj;
        } else if (i7 == 1) {
            this.f14292b = new Object[]{this.f14292b, obj};
        } else {
            Object[] objArr = (Object[]) this.f14292b;
            int length = objArr.length;
            if (i7 >= length) {
                int i10 = ((length * 3) / 2) + 1;
                int i11 = i7 + 1;
                if (i10 < i11) {
                    i10 = i11;
                }
                Object[] objArr2 = new Object[i10];
                this.f14292b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f14291a] = obj;
        }
        this.f14291a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14292b = null;
        this.f14291a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10;
        if (i7 >= 0 && i7 < (i10 = this.f14291a)) {
            return i10 == 1 ? this.f14292b : ((Object[]) this.f14292b)[i7];
        }
        StringBuilder sbT = ob.a.t("Index: ", ", Size: ", i7);
        sbT.append(this.f14291a);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i7 = this.f14291a;
        if (i7 == 0) {
            return e.f14287a;
        }
        if (i7 == 1) {
            return new f(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        c(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i10;
        Object obj;
        if (i7 < 0 || i7 >= (i10 = this.f14291a)) {
            StringBuilder sbT = ob.a.t("Index: ", ", Size: ", i7);
            sbT.append(this.f14291a);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 == 1) {
            obj = this.f14292b;
            this.f14292b = null;
        } else {
            Object[] objArr = (Object[]) this.f14292b;
            Object obj2 = objArr[i7];
            if (i10 == 2) {
                this.f14292b = objArr[1 - i7];
            } else {
                int i11 = (i10 - i7) - 1;
                if (i11 > 0) {
                    System.arraycopy(objArr, i7 + 1, objArr, i7, i11);
                }
                objArr[this.f14291a - 1] = null;
            }
            obj = obj2;
        }
        this.f14291a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f14291a)) {
            StringBuilder sbT = ob.a.t("Index: ", ", Size: ", i7);
            sbT.append(this.f14291a);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 == 1) {
            Object obj2 = this.f14292b;
            this.f14292b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f14292b;
        Object obj3 = objArr[i7];
        objArr[i7] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14291a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i7 = this.f14291a;
        if (i7 >= 2) {
            Arrays.sort((Object[]) this.f14292b, 0, i7, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            c(4);
            throw null;
        }
        int length = objArr.length;
        int i7 = this.f14291a;
        if (i7 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f14292b;
                return objArr2;
            }
            objArr[0] = this.f14292b;
        } else {
            if (length < i7) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f14292b, i7, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                c(6);
                throw null;
            }
            if (i7 != 0) {
                System.arraycopy(this.f14292b, 0, objArr, 0, i7);
            }
        }
        int i10 = this.f14291a;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
