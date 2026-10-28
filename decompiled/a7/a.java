package a7;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.r;
import androidx.versionedparcelable.ParcelImpl;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import i9.l;
import java.util.ArrayList;
import java.util.Objects;
import p.p0;
import p4.t;
import p4.v;
import p4.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    public /* synthetic */ a(int i7) {
        this.f50a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri uriA;
        boolean z10 = true;
        boolean z11 = true;
        b.b bVar = null;
        int i7 = 0;
        switch (this.f50a) {
            case 0:
                return new b(i7);
            case 1:
                return new c(i7);
            case 2:
                return new d(i7);
            case 3:
                return new e(i7);
            case 4:
                return new g(i7);
            case 5:
                return new h(i7);
            case 6:
                return new i(i7);
            case 7:
                String string = parcel.readString();
                Objects.requireNonNull(string);
                return new j(string, parcel.readString(), parcel.readInt());
            case 8:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a7.a(8);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f531a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f532b;

                    {
                        this.f531a = parcel.readInt();
                        this.f532b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f531a + ", mDescription=" + this.f532b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f531a);
                        this.f532b.writeToParcel(parcel2, i10);
                    }
                };
            case 9:
                int i10 = Build.VERSION.SDK_INT;
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = r.O(bundleD);
                }
                Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uri != null) {
                    if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                        bundleD = null;
                    } else {
                        bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                        bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }
                if (uri != null) {
                    uriA = uri;
                } else {
                    uriA = i10 >= 23 ? android.support.v4.media.b.a(mediaDescription) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundleD, uriA);
                mediaDescriptionCompat.f541i = mediaDescription;
                return mediaDescriptionCompat;
            case 10:
                return new MediaMetadataCompat(parcel);
            case 11:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case 12:
                b.d dVar = new b.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i11 = b.c.f1101c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.b.f1100a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.b)) {
                        b.a aVar = new b.a();
                        aVar.f1099b = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f1103a = bVar;
                return dVar;
            case 13:
                return new b7.a(parcel.readString());
            case 14:
                return new b7.b(z10 ? 1 : 0);
            case 15:
                return new b7.c(z11 ? 1 : 0);
            case 16:
                l.e(parcel, "parcel");
                return new f.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 17:
                l.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                l.b(parcelable);
                return new f.d((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 18:
                return new ParcelImpl(parcel);
            case 19:
                i4.i iVar = new i4.i(parcel);
                iVar.f6643a = parcel.readInt();
                return iVar;
            case 20:
                return new UserInfoBean(parcel);
            case 21:
                p0 p0Var = new p0(parcel);
                p0Var.f9865a = parcel.readByte() != 0;
                return p0Var;
            case 22:
                return new p4.b(parcel);
            case 23:
                return new p4.c(parcel);
            case 24:
                t tVar = new t();
                tVar.f10226a = parcel.readString();
                tVar.f10227b = parcel.readInt();
                return tVar;
            case 25:
                v vVar = new v();
                vVar.f10257e = null;
                vVar.f10258f = new ArrayList();
                vVar.f10259g = new ArrayList();
                vVar.f10253a = parcel.createStringArrayList();
                vVar.f10254b = parcel.createStringArrayList();
                vVar.f10255c = (p4.b[]) parcel.createTypedArray(p4.b.CREATOR);
                vVar.f10256d = parcel.readInt();
                vVar.f10257e = parcel.readString();
                vVar.f10258f = parcel.createStringArrayList();
                vVar.f10259g = parcel.createTypedArrayList(p4.c.CREATOR);
                vVar.f10260h = parcel.createTypedArrayList(t.CREATOR);
                return vVar;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return new y(parcel);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return new PlugInBean(parcel);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return new StrategyBean(parcel);
            default:
                return new CrashDetailBean(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f50a) {
            case 0:
                return new b[i7];
            case 1:
                return new c[i7];
            case 2:
                return new d[i7];
            case 3:
                return new e[i7];
            case 4:
                return new g[i7];
            case 5:
                return new h[i7];
            case 6:
                return new i[i7];
            case 7:
                return new j[i7];
            case 8:
                return new MediaBrowserCompat$MediaItem[i7];
            case 9:
                return new MediaDescriptionCompat[i7];
            case 10:
                return new MediaMetadataCompat[i7];
            case 11:
                return new RatingCompat[i7];
            case 12:
                return new b.d[i7];
            case 13:
                return new b7.a[i7];
            case 14:
                return new b7.b[i7];
            case 15:
                return new b7.c[i7];
            case 16:
                return new f.a[i7];
            case 17:
                return new f.d[i7];
            case 18:
                return new ParcelImpl[i7];
            case 19:
                return new i4.i[i7];
            case 20:
                return new UserInfoBean[i7];
            case 21:
                return new p0[i7];
            case 22:
                return new p4.b[i7];
            case 23:
                return new p4.c[i7];
            case 24:
                return new t[i7];
            case 25:
                return new v[i7];
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return new y[i7];
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return new PlugInBean[i7];
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return new StrategyBean[i7];
            default:
                return new CrashDetailBean[i7];
        }
    }
}
