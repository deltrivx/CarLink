package p1;

import android.os.Parcel;
import android.os.Parcelable;
import p.c3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10067a;

    public /* synthetic */ o(int i7) {
        this.f10067a = i7;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int i7 = parcel.readInt();
        if (i7 == 0) {
            return new p();
        }
        j1.f fVarN = j1.i.f6890b.n();
        for (int i10 = 0; i10 < i7; i10++) {
            fVarN.add(parcel.readValue(classLoader));
        }
        return new p(fVarN.k());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10067a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return k4.b.f7308b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new c3(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10067a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return k4.b.f7308b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new c3(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f10067a) {
            case 0:
                return new p[i7];
            case 1:
                return new k4.b[i7];
            default:
                return new c3[i7];
        }
    }
}
