package com.tencent.bugly.crashreport.biz;

import a7.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.ap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2960j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map<String, String> f2967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<String, String> f2968s;

    public UserInfoBean() {
        this.k = 0L;
        this.f2961l = false;
        this.f2962m = "unknown";
        this.f2965p = -1;
        this.f2966q = -1;
        this.f2967r = null;
        this.f2968s = null;
    }

    public UserInfoBean(Parcel parcel) {
        this.k = 0L;
        this.f2961l = false;
        this.f2962m = "unknown";
        this.f2965p = -1;
        this.f2966q = -1;
        this.f2967r = null;
        this.f2968s = null;
        this.f2952b = parcel.readInt();
        this.f2953c = parcel.readString();
        this.f2954d = parcel.readString();
        this.f2955e = parcel.readLong();
        this.f2956f = parcel.readLong();
        this.f2957g = parcel.readLong();
        this.f2958h = parcel.readLong();
        this.f2959i = parcel.readLong();
        this.f2960j = parcel.readString();
        this.k = parcel.readLong();
        this.f2961l = parcel.readByte() == 1;
        this.f2962m = parcel.readString();
        this.f2965p = parcel.readInt();
        this.f2966q = parcel.readInt();
        this.f2967r = ap.b(parcel);
        this.f2968s = ap.b(parcel);
        this.f2963n = parcel.readString();
        this.f2964o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2952b);
        parcel.writeString(this.f2953c);
        parcel.writeString(this.f2954d);
        parcel.writeLong(this.f2955e);
        parcel.writeLong(this.f2956f);
        parcel.writeLong(this.f2957g);
        parcel.writeLong(this.f2958h);
        parcel.writeLong(this.f2959i);
        parcel.writeString(this.f2960j);
        parcel.writeLong(this.k);
        parcel.writeByte(this.f2961l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f2962m);
        parcel.writeInt(this.f2965p);
        parcel.writeInt(this.f2966q);
        ap.b(parcel, this.f2967r);
        ap.b(parcel, this.f2968s);
        parcel.writeString(this.f2963n);
        parcel.writeInt(this.f2964o);
    }
}
