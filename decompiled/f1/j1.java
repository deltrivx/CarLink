package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Parcelable.ClassLoaderCreator {
    public static k1 a(Parcel parcel, ClassLoader classLoader) {
        w0 w0Var;
        if (classLoader == null) {
            classLoader = j1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i7 = parcel.readInt();
        if (i7 == 0) {
            w0Var = w0.f5184c;
        } else if (i7 == 1) {
            w0Var = w0.f5187f;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException(a2.f.F("Unsupported MutableState policy ", " was restored", i7));
            }
            w0Var = w0.f5185d;
        }
        return new k1(value, w0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new k1[i7];
    }
}
