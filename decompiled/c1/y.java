package c1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.x2 f2319a = new f1.x2(x.f2272b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.x2 f2320b = new f1.x2(x.f2273c);

    public static final long a(w wVar, long j5) {
        long j10 = wVar.f2225a;
        long j11 = wVar.f2240q;
        if (y1.q.c(j5, j10)) {
            return wVar.f2226b;
        }
        if (y1.q.c(j5, wVar.f2230f)) {
            return wVar.f2231g;
        }
        if (y1.q.c(j5, wVar.f2234j)) {
            return wVar.k;
        }
        if (y1.q.c(j5, wVar.f2237n)) {
            return wVar.f2238o;
        }
        if (y1.q.c(j5, wVar.f2246w)) {
            return wVar.f2247x;
        }
        if (y1.q.c(j5, wVar.f2227c)) {
            return wVar.f2228d;
        }
        if (y1.q.c(j5, wVar.f2232h)) {
            return wVar.f2233i;
        }
        if (y1.q.c(j5, wVar.f2235l)) {
            return wVar.f2236m;
        }
        if (y1.q.c(j5, wVar.f2248y)) {
            return wVar.f2249z;
        }
        if (y1.q.c(j5, wVar.f2244u)) {
            return wVar.f2245v;
        }
        if (y1.q.c(j5, wVar.f2239p)) {
            return j11;
        }
        if (y1.q.c(j5, wVar.f2241r)) {
            return wVar.f2242s;
        }
        if (y1.q.c(j5, wVar.D) || y1.q.c(j5, wVar.F) || y1.q.c(j5, wVar.G) || y1.q.c(j5, wVar.H) || y1.q.c(j5, wVar.I) || y1.q.c(j5, wVar.J)) {
            return j11;
        }
        int i7 = y1.q.f14959n;
        return y1.q.f14958m;
    }

    public static w b(long j5, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i7, int i10) {
        return new w(j5, (i7 & 2) != 0 ? e1.b.f3925j : j10, (i7 & 4) != 0 ? e1.b.f3934t : j11, (i7 & 8) != 0 ? e1.b.k : j12, (i7 & 16) != 0 ? e1.b.f3920e : j13, j14, (i7 & 64) != 0 ? e1.b.f3926l : j15, (i7 & 128) != 0 ? e1.b.f3936v : j16, (i7 & 256) != 0 ? e1.b.f3927m : j17, j18, (i7 & 1024) != 0 ? e1.b.f3930p : j19, (i7 & 2048) != 0 ? e1.b.F : j20, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? e1.b.f3931q : j21, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 ? e1.b.f3916a : j22, (i7 & 16384) != 0 ? e1.b.f3922g : j23, (32768 & i7) != 0 ? e1.b.f3937w : j24, (65536 & i7) != 0 ? e1.b.f3928n : j25, (131072 & i7) != 0 ? e1.b.E : j26, (262144 & i7) != 0 ? e1.b.f3929o : j27, (524288 & i7) != 0 ? j5 : j28, (1048576 & i7) != 0 ? e1.b.f3921f : j29, (2097152 & i7) != 0 ? e1.b.f3919d : j30, e1.b.f3917b, e1.b.f3923h, e1.b.f3918c, e1.b.f3924i, (67108864 & i7) != 0 ? e1.b.f3932r : j31, (134217728 & i7) != 0 ? e1.b.f3933s : j32, (268435456 & i7) != 0 ? e1.b.f3935u : j33, (536870912 & i7) != 0 ? e1.b.f3938x : j34, (i10 & 8) != 0 ? e1.b.D : j40, (1073741824 & i7) != 0 ? e1.b.f3939y : j35, (i7 & Integer.MIN_VALUE) != 0 ? e1.b.f3940z : j36, (i10 & 1) != 0 ? e1.b.A : j37, (i10 & 2) != 0 ? e1.b.B : j38, (i10 & 4) != 0 ? e1.b.C : j39);
    }

    public static final long c(w wVar, int i7) {
        switch (e1.d.b(i7)) {
            case 0:
                return wVar.f2237n;
            case 1:
                return wVar.f2246w;
            case 2:
                return wVar.f2248y;
            case 3:
                return wVar.f2245v;
            case 4:
                return wVar.f2229e;
            case 5:
                return wVar.f2244u;
            case 6:
                return wVar.f2238o;
            case 7:
                return wVar.f2247x;
            case 8:
                return wVar.f2249z;
            case 9:
                return wVar.f2226b;
            case 10:
                return wVar.f2228d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
            default:
                return y1.q.f14958m;
            case 13:
                return wVar.f2231g;
            case 14:
                return wVar.f2233i;
            case 17:
                return wVar.f2240q;
            case 18:
                return wVar.f2242s;
            case 19:
                return wVar.k;
            case 20:
                return wVar.f2236m;
            case 23:
                return wVar.A;
            case 24:
                return wVar.B;
            case 25:
                return wVar.f2225a;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return wVar.f2227c;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                return wVar.C;
            case 30:
                return wVar.f2230f;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                return wVar.f2232h;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                return wVar.f2239p;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                return wVar.D;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                return wVar.F;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                return wVar.G;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                return wVar.H;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                return wVar.I;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                return wVar.J;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                return wVar.E;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                return wVar.f2243t;
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                return wVar.f2241r;
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                return wVar.f2234j;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                return wVar.f2235l;
        }
    }

    public static w d(long j5, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i7, int i10) {
        long j41 = (i7 & 1) != 0 ? e1.c.f3959t : j5;
        return new w(j41, (i7 & 2) != 0 ? e1.c.f3950j : j10, (i7 & 4) != 0 ? e1.c.f3960u : j11, (i7 & 8) != 0 ? e1.c.k : j12, (i7 & 16) != 0 ? e1.c.f3945e : j13, (i7 & 32) != 0 ? e1.c.f3962w : j14, (i7 & 64) != 0 ? e1.c.f3951l : j15, (i7 & 128) != 0 ? e1.c.f3963x : j16, (i7 & 256) != 0 ? e1.c.f3952m : j17, (i7 & 512) != 0 ? e1.c.H : j18, (i7 & 1024) != 0 ? e1.c.f3955p : j19, (i7 & 2048) != 0 ? e1.c.I : j20, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? e1.c.f3956q : j21, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 ? e1.c.f3941a : j22, (i7 & 16384) != 0 ? e1.c.f3947g : j23, (32768 & i7) != 0 ? e1.c.f3964y : j24, (65536 & i7) != 0 ? e1.c.f3953n : j25, (131072 & i7) != 0 ? e1.c.G : j26, (262144 & i7) != 0 ? e1.c.f3954o : j27, (524288 & i7) != 0 ? j41 : j28, (1048576 & i7) != 0 ? e1.c.f3946f : j29, (2097152 & i7) != 0 ? e1.c.f3944d : j30, e1.c.f3942b, e1.c.f3948h, e1.c.f3943c, e1.c.f3949i, (67108864 & i7) != 0 ? e1.c.f3957r : j31, (134217728 & i7) != 0 ? e1.c.f3958s : j32, (268435456 & i7) != 0 ? e1.c.f3961v : j33, (536870912 & i7) != 0 ? e1.c.f3965z : j34, (i10 & 8) != 0 ? e1.c.F : j40, (1073741824 & i7) != 0 ? e1.c.A : j35, (i7 & Integer.MIN_VALUE) != 0 ? e1.c.B : j36, (i10 & 1) != 0 ? e1.c.C : j37, (i10 & 2) != 0 ? e1.c.D : j38, (i10 & 4) != 0 ? e1.c.E : j39);
    }
}
