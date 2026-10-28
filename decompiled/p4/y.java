package p4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a7.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f10277j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f10279m;

    public y(Parcel parcel) {
        this.f10268a = parcel.readString();
        this.f10269b = parcel.readString();
        this.f10270c = parcel.readInt() != 0;
        this.f10271d = parcel.readInt();
        this.f10272e = parcel.readInt();
        this.f10273f = parcel.readString();
        this.f10274g = parcel.readInt() != 0;
        this.f10275h = parcel.readInt() != 0;
        this.f10276i = parcel.readInt() != 0;
        this.f10277j = parcel.readBundle();
        this.k = parcel.readInt() != 0;
        this.f10279m = parcel.readBundle();
        this.f10278l = parcel.readInt();
    }

    public y(i iVar) {
        this.f10268a = iVar.getClass().getName();
        this.f10269b = iVar.f10180e;
        this.f10270c = iVar.f10187m;
        this.f10271d = iVar.f10196v;
        this.f10272e = iVar.f10197w;
        this.f10273f = iVar.f10198x;
        this.f10274g = iVar.A;
        this.f10275h = iVar.f10186l;
        this.f10276i = iVar.f10200z;
        this.f10277j = iVar.f10181f;
        this.k = iVar.f10199y;
        this.f10278l = iVar.L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f10268a);
        sb2.append(" (");
        sb2.append(this.f10269b);
        sb2.append(")}:");
        if (this.f10270c) {
            sb2.append(" fromLayout");
        }
        int i7 = this.f10272e;
        if (i7 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i7));
        }
        String str = this.f10273f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f10274g) {
            sb2.append(" retainInstance");
        }
        if (this.f10275h) {
            sb2.append(" removing");
        }
        if (this.f10276i) {
            sb2.append(" detached");
        }
        if (this.k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10268a);
        parcel.writeString(this.f10269b);
        parcel.writeInt(this.f10270c ? 1 : 0);
        parcel.writeInt(this.f10271d);
        parcel.writeInt(this.f10272e);
        parcel.writeString(this.f10273f);
        parcel.writeInt(this.f10274g ? 1 : 0);
        parcel.writeInt(this.f10275h ? 1 : 0);
        parcel.writeInt(this.f10276i ? 1 : 0);
        parcel.writeBundle(this.f10277j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.f10279m);
        parcel.writeInt(this.f10278l);
    }
}
