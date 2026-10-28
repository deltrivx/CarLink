package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new q(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f553c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f551a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g5.d f554d = null;

    public MediaSessionCompat$Token(Object obj, l lVar) {
        this.f552b = obj;
        this.f553c = lVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f551a) {
            dVar = this.f553c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f551a) {
            this.f553c = dVar;
        }
    }

    public final void c(g5.d dVar) {
        synchronized (this.f551a) {
            this.f554d = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f552b;
        Object obj3 = this.f552b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f552b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable((Parcelable) this.f552b, i7);
    }
}
