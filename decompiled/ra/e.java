package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryScanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xa.n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f11889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f11890q = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f11891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f11893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f11900j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f11903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11904o;

    static {
        e eVar = new e();
        f11889p = eVar;
        eVar.g();
    }

    public e() {
        this.f11903n = (byte) -1;
        this.f11904o = -1;
        this.f11891a = xa.d.f14765a;
    }

    public e(c cVar) {
        this.f11903n = (byte) -1;
        this.f11904o = -1;
        this.f11891a = cVar.f14792a;
    }

    public e(xa.e eVar, xa.g gVar) {
        g gVar2;
        this.f11903n = (byte) -1;
        this.f11904o = -1;
        g();
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = eVar.k();
                            d dVarA = d.a(iK);
                            if (dVarA == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f11892b |= 1;
                                this.f11893c = dVarA;
                                continue;
                            }
                            break;
                        case 16:
                            this.f11892b |= 2;
                            long jL = eVar.l();
                            this.f11894d = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                            this.f11892b |= 4;
                            this.f11895e = Float.intBitsToFloat(eVar.i());
                            continue;
                        case ServiceTypes.KEYCODE_VR_START /* 33 */:
                            this.f11892b |= 8;
                            this.f11896f = Double.longBitsToDouble(eVar.j());
                            continue;
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                            this.f11892b |= 16;
                            this.f11897g = eVar.k();
                            continue;
                        case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                            this.f11892b |= 32;
                            this.f11898h = eVar.k();
                            continue;
                        case 56:
                            this.f11892b |= 64;
                            this.f11899i = eVar.k();
                            continue;
                        case 66:
                            if ((this.f11892b & 128) == 128) {
                                h hVar = this.f11900j;
                                hVar.getClass();
                                gVar2 = new g(0);
                                gVar2.f11947d = Collections.EMPTY_LIST;
                                gVar2.g(hVar);
                            } else {
                                gVar2 = null;
                            }
                            h hVar2 = (h) eVar.g(h.f11961h, gVar);
                            this.f11900j = hVar2;
                            if (gVar2 != null) {
                                gVar2.g(hVar2);
                                this.f11900j = gVar2.d();
                            }
                            this.f11892b |= 128;
                            continue;
                        case 74:
                            if ((c10 & 256) != 256) {
                                this.k = new ArrayList();
                                c10 = 256;
                            }
                            this.k.add(eVar.g(f11890q, gVar));
                            continue;
                        case UsbAccessoryScanner.STORAGE_INTERFACE_PROTOCOL /* 80 */:
                            this.f11892b |= 512;
                            this.f11902m = eVar.k();
                            continue;
                        case 88:
                            this.f11892b |= 256;
                            this.f11901l = eVar.k();
                            continue;
                        default:
                            if (!eVar.q(iN, eVarS)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (xa.q e7) {
                    e7.f14823a = this;
                    throw e7;
                } catch (IOException e10) {
                    xa.q qVar = new xa.q(e10.getMessage());
                    qVar.f14823a = this;
                    throw qVar;
                }
            } catch (Throwable th) {
                if ((c10 & 256) == 256) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11891a = cVar.c();
                }
                throw th;
            }
        }
        if ((c10 & 256) == 256) {
            this.k = Collections.unmodifiableList(this.k);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11891a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11904o;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f11892b & 1) == 1 ? d3.e.c(1, this.f11893c.f11877a) : 0;
        if ((this.f11892b & 2) == 2) {
            long j5 = this.f11894d;
            iC += d3.e.i((j5 >> 63) ^ (j5 << 1)) + d3.e.j(2);
        }
        if ((this.f11892b & 4) == 4) {
            iC += d3.e.j(3) + 4;
        }
        if ((this.f11892b & 8) == 8) {
            iC += d3.e.j(4) + 8;
        }
        if ((this.f11892b & 16) == 16) {
            iC += d3.e.d(5, this.f11897g);
        }
        if ((this.f11892b & 32) == 32) {
            iC += d3.e.d(6, this.f11898h);
        }
        if ((this.f11892b & 64) == 64) {
            iC += d3.e.d(7, this.f11899i);
        }
        if ((this.f11892b & 128) == 128) {
            iC += d3.e.f(8, this.f11900j);
        }
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            iC += d3.e.f(9, (xa.a) this.k.get(i10));
        }
        if ((this.f11892b & 512) == 512) {
            iC += d3.e.d(10, this.f11902m);
        }
        if ((this.f11892b & 256) == 256) {
            iC += d3.e.d(11, this.f11901l);
        }
        int size = this.f11891a.size() + iC;
        this.f11904o = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return c.e();
    }

    @Override // xa.a
    public final xa.i c() {
        c cVarE = c.e();
        cVarE.f(this);
        return cVarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f11892b & 1) == 1) {
            eVar.z(1, this.f11893c.f11877a);
        }
        if ((this.f11892b & 2) == 2) {
            long j5 = this.f11894d;
            eVar.L(2, 0);
            eVar.K((j5 >> 63) ^ (j5 << 1));
        }
        if ((this.f11892b & 4) == 4) {
            float f10 = this.f11895e;
            eVar.L(3, 5);
            eVar.H(Float.floatToRawIntBits(f10));
        }
        if ((this.f11892b & 8) == 8) {
            double d10 = this.f11896f;
            eVar.L(4, 1);
            eVar.I(Double.doubleToRawLongBits(d10));
        }
        if ((this.f11892b & 16) == 16) {
            eVar.A(5, this.f11897g);
        }
        if ((this.f11892b & 32) == 32) {
            eVar.A(6, this.f11898h);
        }
        if ((this.f11892b & 64) == 64) {
            eVar.A(7, this.f11899i);
        }
        if ((this.f11892b & 128) == 128) {
            eVar.C(8, this.f11900j);
        }
        for (int i7 = 0; i7 < this.k.size(); i7++) {
            eVar.C(9, (xa.a) this.k.get(i7));
        }
        if ((this.f11892b & 512) == 512) {
            eVar.A(10, this.f11902m);
        }
        if ((this.f11892b & 256) == 256) {
            eVar.A(11, this.f11901l);
        }
        eVar.F(this.f11891a);
    }

    public final void g() {
        this.f11893c = d.BYTE;
        this.f11894d = 0L;
        this.f11895e = 0.0f;
        this.f11896f = 0.0d;
        this.f11897g = 0;
        this.f11898h = 0;
        this.f11899i = 0;
        this.f11900j = h.f11960g;
        this.k = Collections.EMPTY_LIST;
        this.f11901l = 0;
        this.f11902m = 0;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11903n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f11892b & 128) == 128 && !this.f11900j.isInitialized()) {
            this.f11903n = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.k.size(); i7++) {
            if (!((e) this.k.get(i7)).isInitialized()) {
                this.f11903n = (byte) 0;
                return false;
            }
        }
        this.f11903n = (byte) 1;
        return true;
    }
}
