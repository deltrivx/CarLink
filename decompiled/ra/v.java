package ra;

import com.baidu.carlife.sdk.Constants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends xa.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f12222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12223h = new a(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f12227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12228f;

    static {
        v vVar = new v();
        f12222g = vVar;
        vVar.f12226d = 0;
    }

    public v() {
        this.f12227e = (byte) -1;
        this.f12228f = -1;
        this.f12224b = xa.d.f14765a;
    }

    public v(u uVar) {
        super(uVar);
        this.f12227e = (byte) -1;
        this.f12228f = -1;
        this.f12224b = uVar.f14792a;
    }

    public v(xa.e eVar, xa.g gVar) {
        this.f12227e = (byte) -1;
        this.f12228f = -1;
        boolean z10 = false;
        this.f12226d = 0;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f12225c |= 1;
                            this.f12226d = eVar.k();
                        } else if (!l(eVar, eVarS, gVar, iN)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f12224b = cVar.c();
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
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12224b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12228f;
        if (i7 != -1) {
            return i7;
        }
        int size = this.f12224b.size() + h() + ((this.f12225c & 1) == 1 ? d3.e.d(1, this.f12226d) : 0);
        this.f12228f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return new u();
    }

    @Override // xa.a
    public final xa.i c() {
        u uVar = new u();
        uVar.e(this);
        return uVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12225c & 1) == 1) {
            eVar.A(1, this.f12226d);
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f12224b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12222g;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12227e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (g()) {
            this.f12227e = (byte) 1;
            return true;
        }
        this.f12227e = (byte) 0;
        return false;
    }
}
