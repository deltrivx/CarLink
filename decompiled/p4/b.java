package p4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a7.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f10154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f10160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10161j;
    public final CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f10162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f10163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10164n;

    public b(Parcel parcel) {
        this.f10152a = parcel.createIntArray();
        this.f10153b = parcel.createStringArrayList();
        this.f10154c = parcel.createIntArray();
        this.f10155d = parcel.createIntArray();
        this.f10156e = parcel.readInt();
        this.f10157f = parcel.readString();
        this.f10158g = parcel.readInt();
        this.f10159h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10160i = (CharSequence) creator.createFromParcel(parcel);
        this.f10161j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.f10162l = parcel.createStringArrayList();
        this.f10163m = parcel.createStringArrayList();
        this.f10164n = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f10126a.size();
        this.f10152a = new int[size * 6];
        if (!aVar.f10132g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10153b = new ArrayList(size);
        this.f10154c = new int[size];
        this.f10155d = new int[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) aVar.f10126a.get(i10);
            int i11 = i7 + 1;
            this.f10152a[i7] = a0Var.f10143a;
            ArrayList arrayList = this.f10153b;
            i iVar = a0Var.f10144b;
            arrayList.add(iVar != null ? iVar.f10180e : null);
            int[] iArr = this.f10152a;
            iArr[i11] = a0Var.f10145c ? 1 : 0;
            iArr[i7 + 2] = a0Var.f10146d;
            iArr[i7 + 3] = a0Var.f10147e;
            int i12 = i7 + 5;
            iArr[i7 + 4] = a0Var.f10148f;
            i7 += 6;
            iArr[i12] = a0Var.f10149g;
            this.f10154c[i10] = a0Var.f10150h.ordinal();
            this.f10155d[i10] = a0Var.f10151i.ordinal();
        }
        this.f10156e = aVar.f10131f;
        this.f10157f = aVar.f10133h;
        this.f10158g = aVar.f10142r;
        this.f10159h = aVar.f10134i;
        this.f10160i = aVar.f10135j;
        this.f10161j = aVar.k;
        this.k = aVar.f10136l;
        this.f10162l = aVar.f10137m;
        this.f10163m = aVar.f10138n;
        this.f10164n = aVar.f10139o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f10152a);
        parcel.writeStringList(this.f10153b);
        parcel.writeIntArray(this.f10154c);
        parcel.writeIntArray(this.f10155d);
        parcel.writeInt(this.f10156e);
        parcel.writeString(this.f10157f);
        parcel.writeInt(this.f10158g);
        parcel.writeInt(this.f10159h);
        TextUtils.writeToParcel(this.f10160i, parcel, 0);
        parcel.writeInt(this.f10161j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f10162l);
        parcel.writeStringList(this.f10163m);
        parcel.writeInt(this.f10164n ? 1 : 0);
    }
}
