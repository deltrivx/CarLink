package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryScanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xa.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i0 f12005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f12006w = new a(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f12012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0 f12015j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f12016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f12017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a1 f12019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f12022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f12023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f12024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12025u;

    static {
        i0 i0Var = new i0();
        f12005v = i0Var;
        i0Var.n();
    }

    public i0() {
        this.f12018n = -1;
        this.f12024t = (byte) -1;
        this.f12025u = -1;
        this.f12007b = xa.d.f14765a;
    }

    public i0(h0 h0Var) {
        super(h0Var);
        this.f12018n = -1;
        this.f12024t = (byte) -1;
        this.f12025u = -1;
        this.f12007b = h0Var.f14792a;
    }

    public i0(xa.e eVar, xa.g gVar) {
        this.f12018n = -1;
        this.f12024t = (byte) -1;
        this.f12025u = -1;
        n();
        xa.c cVar = new xa.c();
        int i7 = 1;
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    r0 r0VarO = null;
                    z0 z0Var = null;
                    r0 r0VarO2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f12008c |= 2;
                            this.f12010e = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case 16:
                            this.f12008c |= 4;
                            this.f12011f = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                            if ((this.f12008c & 8) == 8) {
                                s0 s0Var = this.f12012g;
                                s0Var.getClass();
                                r0VarO = s0.o(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(s0.f12167u, gVar);
                            this.f12012g = s0Var2;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var2);
                                this.f12012g = r0VarO.e();
                            }
                            this.f12008c |= 8;
                            continue;
                            i7 = 1;
                            break;
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                            if ((i10 & 32) != 32) {
                                this.f12014i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f12014i.add(eVar.g(x0.f12255n, gVar));
                            continue;
                            i7 = 1;
                            break;
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                            if ((this.f12008c & 32) == 32) {
                                s0 s0Var3 = this.f12015j;
                                s0Var3.getClass();
                                r0VarO2 = s0.o(s0Var3);
                            }
                            s0 s0Var4 = (s0) eVar.g(s0.f12167u, gVar);
                            this.f12015j = s0Var4;
                            if (r0VarO2 != null) {
                                r0VarO2.g(s0Var4);
                                this.f12015j = r0VarO2.e();
                            }
                            this.f12008c |= 32;
                            continue;
                            i7 = 1;
                            break;
                        case 50:
                            if ((this.f12008c & 128) == 128) {
                                a1 a1Var = this.f12019o;
                                a1Var.getClass();
                                z0Var = new z0();
                                s0 s0Var5 = s0.f12166t;
                                z0Var.f12304g = s0Var5;
                                z0Var.f12306i = s0Var5;
                                z0Var.f(a1Var);
                            }
                            a1 a1Var2 = (a1) eVar.g(a1.f11823m, gVar);
                            this.f12019o = a1Var2;
                            if (z0Var != null) {
                                z0Var.f(a1Var2);
                                this.f12019o = z0Var.e();
                            }
                            this.f12008c |= 128;
                            continue;
                            i7 = 1;
                            break;
                        case 56:
                            this.f12008c |= 256;
                            this.f12020p = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                            this.f12008c |= 512;
                            this.f12021q = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case 72:
                            this.f12008c |= 16;
                            this.f12013h = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                            this.f12008c |= 64;
                            this.k = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case 88:
                            this.f12008c |= i7;
                            this.f12009d = eVar.k();
                            continue;
                            i7 = 1;
                            break;
                        case 98:
                            if ((i10 & 256) != 256) {
                                this.f12016l = new ArrayList();
                                i10 |= 256;
                            }
                            this.f12016l.add(eVar.g(s0.f12167u, gVar));
                            continue;
                            i7 = 1;
                            break;
                        case 104:
                            if ((i10 & 512) != 512) {
                                this.f12017m = new ArrayList();
                                i10 |= 512;
                            }
                            this.f12017m.add(Integer.valueOf(eVar.k()));
                            continue;
                            i7 = 1;
                            break;
                        case 106:
                            int iD = eVar.d(eVar.k());
                            if ((i10 & 512) != 512 && eVar.b() > 0) {
                                this.f12017m = new ArrayList();
                                i10 |= 512;
                            }
                            while (eVar.b() > 0) {
                                this.f12017m.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                            continue;
                            i7 = 1;
                            break;
                        case 248:
                            if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192) {
                                this.f12022r = new ArrayList();
                                i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                            }
                            this.f12022r.add(Integer.valueOf(eVar.k()));
                            continue;
                            i7 = 1;
                            break;
                        case 250:
                            int iD2 = eVar.d(eVar.k());
                            if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192 && eVar.b() > 0) {
                                this.f12022r = new ArrayList();
                                i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                            }
                            while (eVar.b() > 0) {
                                this.f12022r.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                            continue;
                            i7 = 1;
                            break;
                        case 258:
                            if ((i10 & 16384) != 16384) {
                                this.f12023s = new ArrayList();
                                i10 |= 16384;
                            }
                            this.f12023s.add(eVar.g(l.f12067h, gVar));
                            continue;
                            i7 = 1;
                            break;
                        default:
                            if (!l(eVar, eVarS, gVar, iN)) {
                            }
                            i7 = 1;
                            break;
                    }
                    z10 = true;
                    i7 = 1;
                } catch (Throwable th) {
                    if ((i10 & 32) == 32) {
                        this.f12014i = Collections.unmodifiableList(this.f12014i);
                    }
                    if ((i10 & 256) == 256) {
                        this.f12016l = Collections.unmodifiableList(this.f12016l);
                    }
                    if ((i10 & 512) == 512) {
                        this.f12017m = Collections.unmodifiableList(this.f12017m);
                    }
                    if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
                        this.f12022r = Collections.unmodifiableList(this.f12022r);
                    }
                    if ((i10 & 16384) == 16384) {
                        this.f12023s = Collections.unmodifiableList(this.f12023s);
                    }
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f12007b = cVar.c();
                    }
                    k();
                    throw th;
                }
            } catch (xa.q e7) {
                e7.f14823a = this;
                throw e7;
            } catch (IOException e10) {
                xa.q qVar = new xa.q(e10.getMessage());
                qVar.f14823a = this;
                throw qVar;
            }
        }
        if ((i10 & 32) == 32) {
            this.f12014i = Collections.unmodifiableList(this.f12014i);
        }
        if ((i10 & 256) == 256) {
            this.f12016l = Collections.unmodifiableList(this.f12016l);
        }
        if ((i10 & 512) == 512) {
            this.f12017m = Collections.unmodifiableList(this.f12017m);
        }
        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            this.f12022r = Collections.unmodifiableList(this.f12022r);
        }
        if ((i10 & 16384) == 16384) {
            this.f12023s = Collections.unmodifiableList(this.f12023s);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12007b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12025u;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12008c & 2) == 2 ? d3.e.d(1, this.f12010e) : 0;
        if ((this.f12008c & 4) == 4) {
            iD += d3.e.d(2, this.f12011f);
        }
        if ((this.f12008c & 8) == 8) {
            iD += d3.e.f(3, this.f12012g);
        }
        for (int i10 = 0; i10 < this.f12014i.size(); i10++) {
            iD += d3.e.f(4, (xa.a) this.f12014i.get(i10));
        }
        if ((this.f12008c & 32) == 32) {
            iD += d3.e.f(5, this.f12015j);
        }
        if ((this.f12008c & 128) == 128) {
            iD += d3.e.f(6, this.f12019o);
        }
        if ((this.f12008c & 256) == 256) {
            iD += d3.e.d(7, this.f12020p);
        }
        if ((this.f12008c & 512) == 512) {
            iD += d3.e.d(8, this.f12021q);
        }
        if ((this.f12008c & 16) == 16) {
            iD += d3.e.d(9, this.f12013h);
        }
        if ((this.f12008c & 64) == 64) {
            iD += d3.e.d(10, this.k);
        }
        if ((this.f12008c & 1) == 1) {
            iD += d3.e.d(11, this.f12009d);
        }
        for (int i11 = 0; i11 < this.f12016l.size(); i11++) {
            iD += d3.e.f(12, (xa.a) this.f12016l.get(i11));
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.f12017m.size(); i12++) {
            iE += d3.e.e(((Integer) this.f12017m.get(i12)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.f12017m.isEmpty()) {
            iE2 = iE2 + 1 + d3.e.e(iE);
        }
        this.f12018n = iE;
        int iE3 = 0;
        for (int i13 = 0; i13 < this.f12022r.size(); i13++) {
            iE3 += d3.e.e(((Integer) this.f12022r.get(i13)).intValue());
        }
        int size = (this.f12022r.size() * 2) + iE2 + iE3;
        for (int i14 = 0; i14 < this.f12023s.size(); i14++) {
            size += d3.e.f(32, (xa.a) this.f12023s.get(i14));
        }
        int size2 = this.f12007b.size() + h() + size;
        this.f12025u = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return h0.f();
    }

    @Override // xa.a
    public final xa.i c() {
        h0 h0VarF = h0.f();
        h0VarF.g(this);
        return h0VarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12008c & 2) == 2) {
            eVar.A(1, this.f12010e);
        }
        if ((this.f12008c & 4) == 4) {
            eVar.A(2, this.f12011f);
        }
        if ((this.f12008c & 8) == 8) {
            eVar.C(3, this.f12012g);
        }
        for (int i7 = 0; i7 < this.f12014i.size(); i7++) {
            eVar.C(4, (xa.a) this.f12014i.get(i7));
        }
        if ((this.f12008c & 32) == 32) {
            eVar.C(5, this.f12015j);
        }
        if ((this.f12008c & 128) == 128) {
            eVar.C(6, this.f12019o);
        }
        if ((this.f12008c & 256) == 256) {
            eVar.A(7, this.f12020p);
        }
        if ((this.f12008c & 512) == 512) {
            eVar.A(8, this.f12021q);
        }
        if ((this.f12008c & 16) == 16) {
            eVar.A(9, this.f12013h);
        }
        if ((this.f12008c & 64) == 64) {
            eVar.A(10, this.k);
        }
        if ((this.f12008c & 1) == 1) {
            eVar.A(11, this.f12009d);
        }
        for (int i10 = 0; i10 < this.f12016l.size(); i10++) {
            eVar.C(12, (xa.a) this.f12016l.get(i10));
        }
        if (this.f12017m.size() > 0) {
            eVar.J(106);
            eVar.J(this.f12018n);
        }
        for (int i11 = 0; i11 < this.f12017m.size(); i11++) {
            eVar.B(((Integer) this.f12017m.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f12022r.size(); i12++) {
            eVar.A(31, ((Integer) this.f12022r.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f12023s.size(); i13++) {
            eVar.C(32, (xa.a) this.f12023s.get(i13));
        }
        rVar.P(19000, eVar);
        eVar.F(this.f12007b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12005v;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12024t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f12008c;
        if ((i7 & 4) != 4) {
            this.f12024t = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f12012g.isInitialized()) {
            this.f12024t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f12014i.size(); i10++) {
            if (!((x0) this.f12014i.get(i10)).isInitialized()) {
                this.f12024t = (byte) 0;
                return false;
            }
        }
        if ((this.f12008c & 32) == 32 && !this.f12015j.isInitialized()) {
            this.f12024t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f12016l.size(); i11++) {
            if (!((s0) this.f12016l.get(i11)).isInitialized()) {
                this.f12024t = (byte) 0;
                return false;
            }
        }
        if ((this.f12008c & 128) == 128 && !this.f12019o.isInitialized()) {
            this.f12024t = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f12023s.size(); i12++) {
            if (!((l) this.f12023s.get(i12)).isInitialized()) {
                this.f12024t = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f12024t = (byte) 1;
            return true;
        }
        this.f12024t = (byte) 0;
        return false;
    }

    public final void n() {
        this.f12009d = 518;
        this.f12010e = 2054;
        this.f12011f = 0;
        s0 s0Var = s0.f12166t;
        this.f12012g = s0Var;
        this.f12013h = 0;
        List list = Collections.EMPTY_LIST;
        this.f12014i = list;
        this.f12015j = s0Var;
        this.k = 0;
        this.f12016l = list;
        this.f12017m = list;
        this.f12019o = a1.f11822l;
        this.f12020p = 0;
        this.f12021q = 0;
        this.f12022r = list;
        this.f12023s = list;
    }
}
