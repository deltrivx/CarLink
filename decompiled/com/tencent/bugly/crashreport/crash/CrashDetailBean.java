package com.tencent.bugly.crashreport.crash;

import a7.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.ap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new a(29);
    public String A;
    public String B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public long Q;
    public boolean R;
    public Map<String, String> S;
    public Map<String, String> T;
    public int U;
    public int V;
    public Map<String, String> W;
    public Map<String, String> X;
    public byte[] Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2994a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public String f2995aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, PlugInBean> f3002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, PlugInBean> f3003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3004j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f3007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f3009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f3012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f3014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f3015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f3016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f3017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f3018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map<String, String> f3019z;

    public CrashDetailBean() {
        this.f2994a = -1L;
        this.f2996b = 0;
        this.f2997c = UUID.randomUUID().toString();
        this.f2998d = false;
        this.f2999e = "";
        this.f3000f = "";
        this.f3001g = "";
        this.f3002h = null;
        this.f3003i = null;
        this.f3004j = false;
        this.k = false;
        this.f3005l = 0;
        this.f3006m = "";
        this.f3007n = "";
        this.f3008o = "";
        this.f3009p = "";
        this.f3010q = "";
        this.f3011r = -1L;
        this.f3012s = null;
        this.f3013t = 0;
        this.f3014u = "";
        this.f3015v = "";
        this.f3016w = null;
        this.f3017x = null;
        this.f3018y = null;
        this.f3019z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = -1L;
        this.R = false;
        this.S = null;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f2995aa = null;
    }

    public CrashDetailBean(Parcel parcel) {
        this.f2994a = -1L;
        this.f2996b = 0;
        this.f2997c = UUID.randomUUID().toString();
        this.f2998d = false;
        this.f2999e = "";
        this.f3000f = "";
        this.f3001g = "";
        this.f3002h = null;
        this.f3003i = null;
        this.f3004j = false;
        this.k = false;
        this.f3005l = 0;
        this.f3006m = "";
        this.f3007n = "";
        this.f3008o = "";
        this.f3009p = "";
        this.f3010q = "";
        this.f3011r = -1L;
        this.f3012s = null;
        this.f3013t = 0;
        this.f3014u = "";
        this.f3015v = "";
        this.f3016w = null;
        this.f3017x = null;
        this.f3018y = null;
        this.f3019z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = -1L;
        this.R = false;
        this.S = null;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f2995aa = null;
        this.f2996b = parcel.readInt();
        this.f2997c = parcel.readString();
        this.f2998d = parcel.readByte() == 1;
        this.f2999e = parcel.readString();
        this.f3000f = parcel.readString();
        this.f3001g = parcel.readString();
        this.f3004j = parcel.readByte() == 1;
        this.k = parcel.readByte() == 1;
        this.f3005l = parcel.readInt();
        this.f3006m = parcel.readString();
        this.f3007n = parcel.readString();
        this.f3008o = parcel.readString();
        this.f3009p = parcel.readString();
        this.f3010q = parcel.readString();
        this.f3011r = parcel.readLong();
        this.f3012s = parcel.readString();
        this.f3013t = parcel.readInt();
        this.f3014u = parcel.readString();
        this.f3015v = parcel.readString();
        this.f3016w = parcel.readString();
        this.f3019z = ap.b(parcel);
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readLong();
        this.R = parcel.readByte() == 1;
        this.S = ap.b(parcel);
        this.f3002h = ap.a(parcel);
        this.f3003i = ap.a(parcel);
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = ap.b(parcel);
        this.X = ap.b(parcel);
        this.Y = parcel.createByteArray();
        this.f3018y = parcel.createByteArray();
        this.Z = parcel.readString();
        this.f2995aa = parcel.readString();
        this.f3017x = parcel.readString();
        this.I = parcel.readLong();
        this.J = parcel.readLong();
        this.K = parcel.readLong();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j5 = this.f3011r - crashDetailBean2.f3011r;
        if (j5 <= 0) {
            return j5 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2996b);
        parcel.writeString(this.f2997c);
        parcel.writeByte(this.f2998d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f2999e);
        parcel.writeString(this.f3000f);
        parcel.writeString(this.f3001g);
        parcel.writeByte(this.f3004j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3005l);
        parcel.writeString(this.f3006m);
        parcel.writeString(this.f3007n);
        parcel.writeString(this.f3008o);
        parcel.writeString(this.f3009p);
        parcel.writeString(this.f3010q);
        parcel.writeLong(this.f3011r);
        parcel.writeString(this.f3012s);
        parcel.writeInt(this.f3013t);
        parcel.writeString(this.f3014u);
        parcel.writeString(this.f3015v);
        parcel.writeString(this.f3016w);
        ap.b(parcel, this.f3019z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeLong(this.Q);
        parcel.writeByte(this.R ? (byte) 1 : (byte) 0);
        ap.b(parcel, this.S);
        ap.a(parcel, this.f3002h);
        ap.a(parcel, this.f3003i);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        ap.b(parcel, this.W);
        ap.b(parcel, this.X);
        parcel.writeByteArray(this.Y);
        parcel.writeByteArray(this.f3018y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f2995aa);
        parcel.writeString(this.f3017x);
        parcel.writeLong(this.I);
        parcel.writeLong(this.J);
        parcel.writeLong(this.K);
    }
}
