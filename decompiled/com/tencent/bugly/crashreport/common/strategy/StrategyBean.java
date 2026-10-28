package com.tencent.bugly.crashreport.common.strategy;

import a7.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.ap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2972a = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f2973b = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f2974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2981j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<String, String> f2990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2993w;

    public StrategyBean() {
        this.f2975d = -1L;
        this.f2976e = -1L;
        this.f2977f = true;
        this.f2978g = true;
        this.f2979h = true;
        this.f2980i = true;
        this.f2981j = false;
        this.k = true;
        this.f2982l = true;
        this.f2983m = true;
        this.f2984n = true;
        this.f2986p = 30000L;
        this.f2987q = f2972a;
        this.f2988r = f2973b;
        this.f2991u = 10;
        this.f2992v = 300000L;
        this.f2993w = -1L;
        this.f2976e = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S(@L@L@)");
        f2974c = sb2.toString();
        sb2.setLength(0);
        sb2.append("*^@K#K@!");
        this.f2989s = sb2.toString();
    }

    public StrategyBean(Parcel parcel) {
        this.f2975d = -1L;
        this.f2976e = -1L;
        boolean z10 = true;
        this.f2977f = true;
        this.f2978g = true;
        this.f2979h = true;
        this.f2980i = true;
        this.f2981j = false;
        this.k = true;
        this.f2982l = true;
        this.f2983m = true;
        this.f2984n = true;
        this.f2986p = 30000L;
        this.f2987q = f2972a;
        this.f2988r = f2973b;
        this.f2991u = 10;
        this.f2992v = 300000L;
        this.f2993w = -1L;
        try {
            f2974c = "S(@L@L@)";
            this.f2976e = parcel.readLong();
            this.f2977f = parcel.readByte() == 1;
            this.f2978g = parcel.readByte() == 1;
            this.f2979h = parcel.readByte() == 1;
            this.f2987q = parcel.readString();
            this.f2988r = parcel.readString();
            this.f2989s = parcel.readString();
            this.f2990t = ap.b(parcel);
            this.f2980i = parcel.readByte() == 1;
            this.f2981j = parcel.readByte() == 1;
            this.f2983m = parcel.readByte() == 1;
            this.f2984n = parcel.readByte() == 1;
            this.f2986p = parcel.readLong();
            this.k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z10 = false;
            }
            this.f2982l = z10;
            this.f2985o = parcel.readLong();
            this.f2991u = parcel.readInt();
            this.f2992v = parcel.readLong();
            this.f2993w = parcel.readLong();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f2976e);
        parcel.writeByte(this.f2977f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2978g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2979h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f2987q);
        parcel.writeString(this.f2988r);
        parcel.writeString(this.f2989s);
        ap.b(parcel, this.f2990t);
        parcel.writeByte(this.f2980i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2981j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2983m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2984n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f2986p);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2982l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f2985o);
        parcel.writeInt(this.f2991u);
        parcel.writeLong(this.f2992v);
        parcel.writeLong(this.f2993w);
    }
}
