package g5;

import android.os.Parcel;
import android.util.SparseIntArray;
import s.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f5923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5928j;
    public int k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f5922d = new SparseIntArray();
        this.f5927i = -1;
        this.k = -1;
        this.f5923e = parcel;
        this.f5924f = i7;
        this.f5925g = i10;
        this.f5928j = i7;
        this.f5926h = str;
    }

    @Override // g5.b
    public final c a() {
        Parcel parcel = this.f5923e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f5928j;
        if (i7 == this.f5924f) {
            i7 = this.f5925g;
        }
        return new c(parcel, iDataPosition, i7, ob.a.s(new StringBuilder(), this.f5926h, "  "), this.f5919a, this.f5920b, this.f5921c);
    }

    @Override // g5.b
    public final boolean e(int i7) {
        while (this.f5928j < this.f5925g) {
            int i10 = this.k;
            if (i10 == i7) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i11 = this.f5928j;
            Parcel parcel = this.f5923e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.k = parcel.readInt();
            this.f5928j += i12;
        }
        return this.k == i7;
    }

    @Override // g5.b
    public final void i(int i7) {
        int i10 = this.f5927i;
        SparseIntArray sparseIntArray = this.f5922d;
        Parcel parcel = this.f5923e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f5927i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }
}
