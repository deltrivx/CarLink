package com.tencent.bugly.crashreport.common.info;

import a7.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2971c;

    public PlugInBean(Parcel parcel) {
        this.f2969a = parcel.readString();
        this.f2970b = parcel.readString();
        this.f2971c = parcel.readString();
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f2969a = str;
        this.f2970b = str2;
        this.f2971c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f2969a + " plV:" + this.f2970b + " plUUID:" + this.f2971c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2969a);
        parcel.writeString(this.f2970b);
        parcel.writeString(this.f2971c);
    }
}
