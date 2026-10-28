package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xa.k {
    public static final k K;
    public static final a L = new a(3);
    public int A;
    public List B;
    public List C;
    public int D;
    public y0 E;
    public List F;
    public f1 G;
    public List H;
    public byte I;
    public int J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f12042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12045j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f12047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f12048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f12050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f12051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f12052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f12053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f12054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f12055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s0 f12058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f12060z;

    static {
        k kVar = new k();
        K = kVar;
        kVar.n();
    }

    public k() {
        this.f12045j = -1;
        this.f12046l = -1;
        this.f12049o = -1;
        this.f12056v = -1;
        this.A = -1;
        this.D = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.f12037b = xa.d.f14765a;
    }

    public k(i iVar) {
        super(iVar);
        this.f12045j = -1;
        this.f12046l = -1;
        this.f12049o = -1;
        this.f12056v = -1;
        this.A = -1;
        this.D = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.f12037b = iVar.f14792a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    public k(xa.e eVar, xa.g gVar) throws Throwable {
        int i7;
        this.f12045j = -1;
        this.f12046l = -1;
        this.f12049o = -1;
        this.f12056v = -1;
        this.A = -1;
        this.D = -1;
        this.I = (byte) -1;
        this.J = -1;
        n();
        xa.c cVarQ = xa.d.q();
        d3.e eVarS = d3.e.s(cVarQ, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                int iN = eVar.n();
                switch (iN) {
                    case 0:
                        z10 = true;
                        break;
                    case 8:
                        this.f12038c |= 1;
                        this.f12039d = eVar.f();
                        break;
                    case 16:
                        if ((i10 & 32) != 32) {
                            this.f12044i = new ArrayList();
                            i10 |= 32;
                        }
                        this.f12044i.add(Integer.valueOf(eVar.f()));
                        break;
                    case 18:
                        int iD = eVar.d(eVar.k());
                        if ((i10 & 32) != 32 && eVar.b() > 0) {
                            this.f12044i = new ArrayList();
                            i10 |= 32;
                        }
                        while (eVar.b() > 0) {
                            this.f12044i.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD);
                        break;
                    case 24:
                        this.f12038c |= 2;
                        this.f12040e = eVar.f();
                        break;
                    case 32:
                        this.f12038c |= 4;
                        this.f12041f = eVar.f();
                        break;
                    case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        if ((i10 & 8) != 8) {
                            this.f12042g = new ArrayList();
                            i10 |= 8;
                        }
                        this.f12042g.add(eVar.g(x0.f12255n, gVar));
                        break;
                    case 50:
                        if ((i10 & 16) != 16) {
                            this.f12043h = new ArrayList();
                            i10 |= 16;
                        }
                        this.f12043h.add(eVar.g(s0.f12167u, gVar));
                        break;
                    case 56:
                        if ((i10 & 64) != 64) {
                            this.k = new ArrayList();
                            i10 |= 64;
                        }
                        this.k.add(Integer.valueOf(eVar.f()));
                        break;
                    case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                        int iD2 = eVar.d(eVar.k());
                        if ((i10 & 64) != 64 && eVar.b() > 0) {
                            this.k = new ArrayList();
                            i10 |= 64;
                        }
                        while (eVar.b() > 0) {
                            this.k.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD2);
                        break;
                    case 66:
                        if ((i10 & 512) != 512) {
                            this.f12050p = new ArrayList();
                            i10 |= 512;
                        }
                        this.f12050p.add(eVar.g(n.k, gVar));
                        break;
                    case 74:
                        if ((i10 & 1024) != 1024) {
                            this.f12051q = new ArrayList();
                            i10 |= 1024;
                        }
                        this.f12051q.add(eVar.g(a0.f11802w, gVar));
                        break;
                    case 82:
                        if ((i10 & 2048) != 2048) {
                            this.f12052r = new ArrayList();
                            i10 |= 2048;
                        }
                        this.f12052r.add(eVar.g(i0.f12006w, gVar));
                        break;
                    case 90:
                        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 4096) {
                            this.f12053s = new ArrayList();
                            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                        }
                        this.f12053s.add(eVar.g(u0.f12208q, gVar));
                        break;
                    case 106:
                        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192) {
                            this.f12054t = new ArrayList();
                            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                        }
                        this.f12054t.add(eVar.g(v.f12223h, gVar));
                        break;
                    case 128:
                        if ((i10 & 16384) != 16384) {
                            this.f12055u = new ArrayList();
                            i10 |= 16384;
                        }
                        this.f12055u.add(Integer.valueOf(eVar.f()));
                        break;
                    case 130:
                        int iD3 = eVar.d(eVar.k());
                        if ((i10 & 16384) != 16384 && eVar.b() > 0) {
                            this.f12055u = new ArrayList();
                            i10 |= 16384;
                        }
                        while (eVar.b() > 0) {
                            this.f12055u.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD3);
                        break;
                    case 136:
                        this.f12038c |= 8;
                        this.f12057w = eVar.f();
                        break;
                    case 146:
                        r0 r0VarC = (this.f12038c & 16) == 16 ? this.f12058x.c() : null;
                        s0 s0Var = (s0) eVar.g(s0.f12167u, gVar);
                        this.f12058x = s0Var;
                        if (r0VarC != 0) {
                            r0VarC.g(s0Var);
                            this.f12058x = r0VarC.e();
                        }
                        this.f12038c |= 16;
                        break;
                    case 152:
                        this.f12038c |= 32;
                        this.f12059y = eVar.f();
                        break;
                    case 162:
                        if ((i10 & 128) != 128) {
                            this.f12047m = new ArrayList();
                            i10 |= 128;
                        }
                        this.f12047m.add(eVar.g(s0.f12167u, gVar));
                        break;
                    case 168:
                        if ((i10 & 256) != 256) {
                            this.f12048n = new ArrayList();
                            i10 |= 256;
                        }
                        this.f12048n.add(Integer.valueOf(eVar.f()));
                        break;
                    case 170:
                        int iD4 = eVar.d(eVar.k());
                        if ((i10 & 256) != 256 && eVar.b() > 0) {
                            this.f12048n = new ArrayList();
                            i10 |= 256;
                        }
                        while (eVar.b() > 0) {
                            this.f12048n.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD4);
                        break;
                    case 176:
                        if ((i10 & 262144) != 262144) {
                            this.f12060z = new ArrayList();
                            i10 |= 262144;
                        }
                        this.f12060z.add(Integer.valueOf(eVar.f()));
                        break;
                    case 178:
                        int iD5 = eVar.d(eVar.k());
                        if ((i10 & 262144) != 262144 && eVar.b() > 0) {
                            this.f12060z = new ArrayList();
                            i10 |= 262144;
                        }
                        while (eVar.b() > 0) {
                            this.f12060z.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD5);
                        break;
                    case 186:
                        if ((i10 & 524288) != 524288) {
                            this.B = new ArrayList();
                            i10 |= 524288;
                        }
                        this.B.add(eVar.g(s0.f12167u, gVar));
                        break;
                    case 192:
                        if ((i10 & 1048576) != 1048576) {
                            this.C = new ArrayList();
                            i10 |= 1048576;
                        }
                        this.C.add(Integer.valueOf(eVar.f()));
                        break;
                    case 194:
                        int iD6 = eVar.d(eVar.k());
                        if ((i10 & 1048576) != 1048576 && eVar.b() > 0) {
                            this.C = new ArrayList();
                            i10 |= 1048576;
                        }
                        while (eVar.b() > 0) {
                            this.C.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD6);
                        break;
                    case 242:
                        g gVarH = (this.f12038c & 64) == 64 ? this.E.h() : null;
                        y0 y0Var = (y0) eVar.g(y0.f12279h, gVar);
                        this.E = y0Var;
                        if (gVarH != 0) {
                            gVarH.h(y0Var);
                            this.E = gVarH.e();
                        }
                        this.f12038c |= 64;
                        break;
                    case 248:
                        if ((i10 & 4194304) != 4194304) {
                            this.F = new ArrayList();
                            i10 |= 4194304;
                        }
                        this.F.add(Integer.valueOf(eVar.f()));
                        break;
                    case 250:
                        int iD7 = eVar.d(eVar.k());
                        if ((i10 & 4194304) != 4194304 && eVar.b() > 0) {
                            this.F = new ArrayList();
                            i10 |= 4194304;
                        }
                        while (eVar.b() > 0) {
                            this.F.add(Integer.valueOf(eVar.f()));
                        }
                        eVar.c(iD7);
                        break;
                    case 258:
                        o oVarG = (this.f12038c & 128) == 128 ? this.G.g() : null;
                        f1 f1Var = (f1) eVar.g(f1.f11940f, gVar);
                        this.G = f1Var;
                        if (oVarG != 0) {
                            oVarG.k(f1Var);
                            this.G = oVarG.g();
                        }
                        this.f12038c |= 128;
                        break;
                    case 266:
                        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL) != 16777216) {
                            this.H = new ArrayList();
                            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL;
                        }
                        List list = this.H;
                        i7 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL;
                        try {
                            try {
                                list.add(eVar.g(l.f12067h, gVar));
                            } catch (Throwable th) {
                                th = th;
                                if ((i10 & 32) == 32) {
                                    this.f12044i = Collections.unmodifiableList(this.f12044i);
                                }
                                if ((i10 & 8) == 8) {
                                    this.f12042g = Collections.unmodifiableList(this.f12042g);
                                }
                                if ((i10 & 16) == 16) {
                                    this.f12043h = Collections.unmodifiableList(this.f12043h);
                                }
                                if ((i10 & 64) == 64) {
                                    this.k = Collections.unmodifiableList(this.k);
                                }
                                if ((i10 & 512) == 512) {
                                    this.f12050p = Collections.unmodifiableList(this.f12050p);
                                }
                                if ((i10 & 1024) == 1024) {
                                    this.f12051q = Collections.unmodifiableList(this.f12051q);
                                }
                                if ((i10 & 2048) == 2048) {
                                    this.f12052r = Collections.unmodifiableList(this.f12052r);
                                }
                                if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
                                    this.f12053s = Collections.unmodifiableList(this.f12053s);
                                }
                                if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
                                    this.f12054t = Collections.unmodifiableList(this.f12054t);
                                }
                                if ((i10 & 16384) == 16384) {
                                    this.f12055u = Collections.unmodifiableList(this.f12055u);
                                }
                                if ((i10 & 128) == 128) {
                                    this.f12047m = Collections.unmodifiableList(this.f12047m);
                                }
                                if ((i10 & 256) == 256) {
                                    this.f12048n = Collections.unmodifiableList(this.f12048n);
                                }
                                if ((i10 & 262144) == 262144) {
                                    this.f12060z = Collections.unmodifiableList(this.f12060z);
                                }
                                if ((i10 & 524288) == 524288) {
                                    this.B = Collections.unmodifiableList(this.B);
                                }
                                if ((i10 & 1048576) == 1048576) {
                                    this.C = Collections.unmodifiableList(this.C);
                                }
                                if ((i10 & 4194304) == 4194304) {
                                    this.F = Collections.unmodifiableList(this.F);
                                }
                                if ((i10 & i7) == 16777216) {
                                    this.H = Collections.unmodifiableList(this.H);
                                }
                                try {
                                    eVarS.k();
                                    break;
                                } catch (IOException unused) {
                                } finally {
                                    this.f12037b = cVarQ.c();
                                }
                                k();
                                throw th;
                            }
                        } catch (xa.q e7) {
                            e = e7;
                            e.f14823a = this;
                            throw e;
                        } catch (IOException e10) {
                            e = e10;
                            xa.q qVar = new xa.q(e.getMessage());
                            qVar.f14823a = this;
                            throw qVar;
                        }
                        break;
                    default:
                        if (!l(eVar, eVarS, gVar, iN)) {
                            z10 = true;
                        }
                        break;
                }
            } catch (xa.q e11) {
                e = e11;
            } catch (IOException e12) {
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                i7 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL;
            }
        }
        if ((i10 & 32) == 32) {
            this.f12044i = Collections.unmodifiableList(this.f12044i);
        }
        if ((i10 & 8) == 8) {
            this.f12042g = Collections.unmodifiableList(this.f12042g);
        }
        if ((i10 & 16) == 16) {
            this.f12043h = Collections.unmodifiableList(this.f12043h);
        }
        if ((i10 & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i10 & 512) == 512) {
            this.f12050p = Collections.unmodifiableList(this.f12050p);
        }
        if ((i10 & 1024) == 1024) {
            this.f12051q = Collections.unmodifiableList(this.f12051q);
        }
        if ((i10 & 2048) == 2048) {
            this.f12052r = Collections.unmodifiableList(this.f12052r);
        }
        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            this.f12053s = Collections.unmodifiableList(this.f12053s);
        }
        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            this.f12054t = Collections.unmodifiableList(this.f12054t);
        }
        if ((i10 & 16384) == 16384) {
            this.f12055u = Collections.unmodifiableList(this.f12055u);
        }
        if ((i10 & 128) == 128) {
            this.f12047m = Collections.unmodifiableList(this.f12047m);
        }
        if ((i10 & 256) == 256) {
            this.f12048n = Collections.unmodifiableList(this.f12048n);
        }
        if ((i10 & 262144) == 262144) {
            this.f12060z = Collections.unmodifiableList(this.f12060z);
        }
        if ((i10 & 524288) == 524288) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if ((i10 & 1048576) == 1048576) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if ((i10 & 4194304) == 4194304) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if ((i10 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL) == 16777216) {
            this.H = Collections.unmodifiableList(this.H);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12037b = cVarQ.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.J;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12038c & 1) == 1 ? d3.e.d(1, this.f12039d) : 0;
        int iE = 0;
        for (int i10 = 0; i10 < this.f12044i.size(); i10++) {
            iE += d3.e.e(((Integer) this.f12044i.get(i10)).intValue());
        }
        int iF = iD + iE;
        if (!this.f12044i.isEmpty()) {
            iF = iF + 1 + d3.e.e(iE);
        }
        this.f12045j = iE;
        if ((this.f12038c & 2) == 2) {
            iF += d3.e.d(3, this.f12040e);
        }
        if ((this.f12038c & 4) == 4) {
            iF += d3.e.d(4, this.f12041f);
        }
        for (int i11 = 0; i11 < this.f12042g.size(); i11++) {
            iF += d3.e.f(5, (xa.a) this.f12042g.get(i11));
        }
        for (int i12 = 0; i12 < this.f12043h.size(); i12++) {
            iF += d3.e.f(6, (xa.a) this.f12043h.get(i12));
        }
        int iE2 = 0;
        for (int i13 = 0; i13 < this.k.size(); i13++) {
            iE2 += d3.e.e(((Integer) this.k.get(i13)).intValue());
        }
        int iF2 = iF + iE2;
        if (!this.k.isEmpty()) {
            iF2 = iF2 + 1 + d3.e.e(iE2);
        }
        this.f12046l = iE2;
        for (int i14 = 0; i14 < this.f12050p.size(); i14++) {
            iF2 += d3.e.f(8, (xa.a) this.f12050p.get(i14));
        }
        for (int i15 = 0; i15 < this.f12051q.size(); i15++) {
            iF2 += d3.e.f(9, (xa.a) this.f12051q.get(i15));
        }
        for (int i16 = 0; i16 < this.f12052r.size(); i16++) {
            iF2 += d3.e.f(10, (xa.a) this.f12052r.get(i16));
        }
        for (int i17 = 0; i17 < this.f12053s.size(); i17++) {
            iF2 += d3.e.f(11, (xa.a) this.f12053s.get(i17));
        }
        for (int i18 = 0; i18 < this.f12054t.size(); i18++) {
            iF2 += d3.e.f(13, (xa.a) this.f12054t.get(i18));
        }
        int iE3 = 0;
        for (int i19 = 0; i19 < this.f12055u.size(); i19++) {
            iE3 += d3.e.e(((Integer) this.f12055u.get(i19)).intValue());
        }
        int iF3 = iF2 + iE3;
        if (!this.f12055u.isEmpty()) {
            iF3 = iF3 + 2 + d3.e.e(iE3);
        }
        this.f12056v = iE3;
        if ((this.f12038c & 8) == 8) {
            iF3 += d3.e.d(17, this.f12057w);
        }
        if ((this.f12038c & 16) == 16) {
            iF3 += d3.e.f(18, this.f12058x);
        }
        if ((this.f12038c & 32) == 32) {
            iF3 += d3.e.d(19, this.f12059y);
        }
        for (int i20 = 0; i20 < this.f12047m.size(); i20++) {
            iF3 += d3.e.f(20, (xa.a) this.f12047m.get(i20));
        }
        int iE4 = 0;
        for (int i21 = 0; i21 < this.f12048n.size(); i21++) {
            iE4 += d3.e.e(((Integer) this.f12048n.get(i21)).intValue());
        }
        int iE5 = iF3 + iE4;
        if (!this.f12048n.isEmpty()) {
            iE5 = iE5 + 2 + d3.e.e(iE4);
        }
        this.f12049o = iE4;
        int iE6 = 0;
        for (int i22 = 0; i22 < this.f12060z.size(); i22++) {
            iE6 += d3.e.e(((Integer) this.f12060z.get(i22)).intValue());
        }
        int iF4 = iE5 + iE6;
        if (!this.f12060z.isEmpty()) {
            iF4 = iF4 + 2 + d3.e.e(iE6);
        }
        this.A = iE6;
        for (int i23 = 0; i23 < this.B.size(); i23++) {
            iF4 += d3.e.f(23, (xa.a) this.B.get(i23));
        }
        int iE7 = 0;
        for (int i24 = 0; i24 < this.C.size(); i24++) {
            iE7 += d3.e.e(((Integer) this.C.get(i24)).intValue());
        }
        int iF5 = iF4 + iE7;
        if (!this.C.isEmpty()) {
            iF5 = iF5 + 2 + d3.e.e(iE7);
        }
        this.D = iE7;
        if ((this.f12038c & 64) == 64) {
            iF5 += d3.e.f(30, this.E);
        }
        int iE8 = 0;
        for (int i25 = 0; i25 < this.F.size(); i25++) {
            iE8 += d3.e.e(((Integer) this.F.get(i25)).intValue());
        }
        int size = (this.F.size() * 2) + iF5 + iE8;
        if ((this.f12038c & 128) == 128) {
            size += d3.e.f(32, this.G);
        }
        for (int i26 = 0; i26 < this.H.size(); i26++) {
            size += d3.e.f(33, (xa.a) this.H.get(i26));
        }
        int size2 = this.f12037b.size() + h() + size;
        this.J = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return i.f();
    }

    @Override // xa.a
    public final xa.i c() {
        i iVarF = i.f();
        iVarF.g(this);
        return iVarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12038c & 1) == 1) {
            eVar.A(1, this.f12039d);
        }
        if (this.f12044i.size() > 0) {
            eVar.J(18);
            eVar.J(this.f12045j);
        }
        for (int i7 = 0; i7 < this.f12044i.size(); i7++) {
            eVar.B(((Integer) this.f12044i.get(i7)).intValue());
        }
        if ((this.f12038c & 2) == 2) {
            eVar.A(3, this.f12040e);
        }
        if ((this.f12038c & 4) == 4) {
            eVar.A(4, this.f12041f);
        }
        for (int i10 = 0; i10 < this.f12042g.size(); i10++) {
            eVar.C(5, (xa.a) this.f12042g.get(i10));
        }
        for (int i11 = 0; i11 < this.f12043h.size(); i11++) {
            eVar.C(6, (xa.a) this.f12043h.get(i11));
        }
        if (this.k.size() > 0) {
            eVar.J(58);
            eVar.J(this.f12046l);
        }
        for (int i12 = 0; i12 < this.k.size(); i12++) {
            eVar.B(((Integer) this.k.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f12050p.size(); i13++) {
            eVar.C(8, (xa.a) this.f12050p.get(i13));
        }
        for (int i14 = 0; i14 < this.f12051q.size(); i14++) {
            eVar.C(9, (xa.a) this.f12051q.get(i14));
        }
        for (int i15 = 0; i15 < this.f12052r.size(); i15++) {
            eVar.C(10, (xa.a) this.f12052r.get(i15));
        }
        for (int i16 = 0; i16 < this.f12053s.size(); i16++) {
            eVar.C(11, (xa.a) this.f12053s.get(i16));
        }
        for (int i17 = 0; i17 < this.f12054t.size(); i17++) {
            eVar.C(13, (xa.a) this.f12054t.get(i17));
        }
        if (this.f12055u.size() > 0) {
            eVar.J(130);
            eVar.J(this.f12056v);
        }
        for (int i18 = 0; i18 < this.f12055u.size(); i18++) {
            eVar.B(((Integer) this.f12055u.get(i18)).intValue());
        }
        if ((this.f12038c & 8) == 8) {
            eVar.A(17, this.f12057w);
        }
        if ((this.f12038c & 16) == 16) {
            eVar.C(18, this.f12058x);
        }
        if ((this.f12038c & 32) == 32) {
            eVar.A(19, this.f12059y);
        }
        for (int i19 = 0; i19 < this.f12047m.size(); i19++) {
            eVar.C(20, (xa.a) this.f12047m.get(i19));
        }
        if (this.f12048n.size() > 0) {
            eVar.J(170);
            eVar.J(this.f12049o);
        }
        for (int i20 = 0; i20 < this.f12048n.size(); i20++) {
            eVar.B(((Integer) this.f12048n.get(i20)).intValue());
        }
        if (this.f12060z.size() > 0) {
            eVar.J(178);
            eVar.J(this.A);
        }
        for (int i21 = 0; i21 < this.f12060z.size(); i21++) {
            eVar.B(((Integer) this.f12060z.get(i21)).intValue());
        }
        for (int i22 = 0; i22 < this.B.size(); i22++) {
            eVar.C(23, (xa.a) this.B.get(i22));
        }
        if (this.C.size() > 0) {
            eVar.J(194);
            eVar.J(this.D);
        }
        for (int i23 = 0; i23 < this.C.size(); i23++) {
            eVar.B(((Integer) this.C.get(i23)).intValue());
        }
        if ((this.f12038c & 64) == 64) {
            eVar.C(30, this.E);
        }
        for (int i24 = 0; i24 < this.F.size(); i24++) {
            eVar.A(31, ((Integer) this.F.get(i24)).intValue());
        }
        if ((this.f12038c & 128) == 128) {
            eVar.C(32, this.G);
        }
        for (int i25 = 0; i25 < this.H.size(); i25++) {
            eVar.C(33, (xa.a) this.H.get(i25));
        }
        rVar.P(19000, eVar);
        eVar.F(this.f12037b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return K;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f12038c & 2) != 2) {
            this.I = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f12042g.size(); i7++) {
            if (!((x0) this.f12042g.get(i7)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f12043h.size(); i10++) {
            if (!((s0) this.f12043h.get(i10)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f12047m.size(); i11++) {
            if (!((s0) this.f12047m.get(i11)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f12050p.size(); i12++) {
            if (!((n) this.f12050p.get(i12)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f12051q.size(); i13++) {
            if (!((a0) this.f12051q.get(i13)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f12052r.size(); i14++) {
            if (!((i0) this.f12052r.get(i14)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f12053s.size(); i15++) {
            if (!((u0) this.f12053s.get(i15)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f12054t.size(); i16++) {
            if (!((v) this.f12054t.get(i16)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.f12038c & 16) == 16 && !this.f12058x.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.B.size(); i17++) {
            if (!((s0) this.B.get(i17)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.f12038c & 64) == 64 && !this.E.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.H.size(); i18++) {
            if (!((l) this.H.get(i18)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    public final void n() {
        this.f12039d = 6;
        this.f12040e = 0;
        this.f12041f = 0;
        List list = Collections.EMPTY_LIST;
        this.f12042g = list;
        this.f12043h = list;
        this.f12044i = list;
        this.k = list;
        this.f12047m = list;
        this.f12048n = list;
        this.f12050p = list;
        this.f12051q = list;
        this.f12052r = list;
        this.f12053s = list;
        this.f12054t = list;
        this.f12055u = list;
        this.f12057w = 0;
        this.f12058x = s0.f12166t;
        this.f12059y = 0;
        this.f12060z = list;
        this.B = list;
        this.C = list;
        this.E = y0.f12278g;
        this.F = list;
        this.G = f1.f11939e;
        this.H = list;
    }
}
