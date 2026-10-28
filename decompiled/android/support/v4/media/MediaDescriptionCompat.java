package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a7.a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f541i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f533a = str;
        this.f534b = charSequence;
        this.f535c = charSequence2;
        this.f536d = charSequence3;
        this.f537e = bitmap;
        this.f538f = uri;
        this.f539g = bundle;
        this.f540h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f534b) + ", " + ((Object) this.f535c) + ", " + ((Object) this.f536d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionA = this.f541i;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f533a);
            a.p(builderB, this.f534b);
            a.o(builderB, this.f535c);
            a.j(builderB, this.f536d);
            a.l(builderB, this.f537e);
            a.m(builderB, this.f538f);
            Bundle bundle2 = this.f539g;
            Uri uri = this.f540h;
            if (i10 >= 23 || uri == null) {
                a.k(builderB, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                a.k(builderB, bundle);
            }
            if (i10 >= 23) {
                b.b(builderB, uri);
            }
            mediaDescriptionA = a.a(builderB);
            this.f541i = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i7);
    }
}
