package b9;

import a2.f;
import java.io.Serializable;
import u8.e;
import u8.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f1675a;

    public b(Enum[] enumArr) {
        this.f1675a = enumArr;
    }

    @Override // u8.a
    public final int c() {
        return this.f1675a.length;
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r8 = (Enum) obj;
        return ((Enum) l.B0(this.f1675a, r8.ordinal())) == r8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f1675a;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(f.D(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // u8.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r8 = (Enum) obj;
        int iOrdinal = r8.ordinal();
        if (((Enum) l.B0(this.f1675a, iOrdinal)) == r8) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // u8.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r8 = (Enum) obj;
        int iOrdinal = r8.ordinal();
        if (((Enum) l.B0(this.f1675a, iOrdinal)) == r8) {
            return iOrdinal;
        }
        return -1;
    }
}
