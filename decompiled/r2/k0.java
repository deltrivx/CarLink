package r2;

import android.os.Looper;
import android.view.Choreographer;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i9.n implements h9.a {
    public static final k0 A;
    public static final k0 B;
    public static final k0 C;
    public static final k0 D;
    public static final k0 E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f11292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f11293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f11294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f11295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f11296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k0 f11297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k0 f11298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k0 f11299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k0 f11300j;
    public static final k0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k0 f11301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k0 f11302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k0 f11303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k0 f11304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k0 f11305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k0 f11306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k0 f11307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k0 f11308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k0 f11309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k0 f11310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k0 f11311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k0 f11312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k0 f11313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k0 f11314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k0 f11315z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11316a;

    static {
        int i7 = 0;
        f11292b = new k0(i7, 0);
        f11293c = new k0(i7, 1);
        f11294d = new k0(i7, 2);
        f11295e = new k0(i7, 3);
        f11296f = new k0(i7, 4);
        f11297g = new k0(i7, 5);
        f11298h = new k0(i7, 6);
        f11299i = new k0(i7, 7);
        f11300j = new k0(i7, 8);
        k = new k0(i7, 9);
        f11301l = new k0(i7, 10);
        f11302m = new k0(i7, 11);
        f11303n = new k0(i7, 12);
        f11304o = new k0(i7, 13);
        f11305p = new k0(i7, 14);
        f11306q = new k0(i7, 15);
        f11307r = new k0(i7, 16);
        f11308s = new k0(i7, 17);
        f11309t = new k0(i7, 18);
        f11310u = new k0(i7, 19);
        f11311v = new k0(i7, 20);
        f11312w = new k0(i7, 21);
        f11313x = new k0(i7, 22);
        f11314y = new k0(i7, 23);
        f11315z = new k0(i7, 24);
        A = new k0(i7, 25);
        B = new k0(i7, 26);
        C = new k0(i7, 27);
        D = new k0(i7, 28);
        E = new k0(i7, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i7, int i10) {
        super(i7);
        this.f11316a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.a
    public final Object invoke() throws Throwable {
        cc.t0 t0VarA;
        y8.h hVarJ;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.f11316a) {
            case 0:
                n0.b("LocalConfiguration");
                throw null;
            case 1:
                n0.b("LocalContext");
                throw null;
            case 2:
                n0.b("LocalImageVectorCache");
                throw null;
            case 3:
                n0.b("LocalResourceIdCache");
                throw null;
            case 4:
                n0.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    jc.e eVar = cc.k0.f2635a;
                    dc.d dVar = hc.m.f6531a;
                    h9.n j2Var = new c1.j2(2, objArr == true ? 1 : 0, 1);
                    Thread threadCurrentThread = Thread.currentThread();
                    y8.d dVar2 = y8.d.f15107a;
                    y8.e eVar2 = (y8.e) dVar.l(dVar2);
                    y8.i iVar = y8.i.f15108a;
                    if (eVar2 == null) {
                        t0VarA = cc.s1.a();
                        hVarJ = cc.b0.j(iVar, n3.u.G(dVar, t0VarA), true);
                        jc.e eVar3 = cc.k0.f2635a;
                        if (hVarJ != eVar3 && hVarJ.l(dVar2) == null) {
                            hVarJ = hVarJ.s(eVar3);
                        }
                    } else {
                        if (eVar2 instanceof cc.t0) {
                        }
                        t0VarA = (cc.t0) cc.s1.f2667a.get();
                        hVarJ = cc.b0.j(iVar, dVar, true);
                        jc.e eVar4 = cc.k0.f2635a;
                        if (hVarJ != eVar4 && hVarJ.l(dVar2) == null) {
                            hVarJ = hVarJ.s(eVar4);
                        }
                    }
                    cc.f fVar = new cc.f(hVarJ, threadCurrentThread, t0VarA);
                    fVar.g0(cc.z.f2689a, fVar, j2Var);
                    cc.t0 t0Var = fVar.f2614e;
                    if (t0Var != null) {
                        int i7 = cc.t0.f2670f;
                        t0Var.A(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jB = t0Var != null ? t0Var.B() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cc.h1.f2628a;
                            if (atomicReferenceFieldUpdater.get(fVar) instanceof cc.x0) {
                                LockSupport.parkNanos(fVar, jB);
                            } else {
                                if (t0Var != null) {
                                    int i10 = cc.t0.f2670f;
                                    t0Var.x(false);
                                }
                                Object objY = cc.b0.y(atomicReferenceFieldUpdater.get(fVar));
                                cc.r rVar = objY instanceof cc.r ? (cc.r) objY : null;
                                if (rVar != null) {
                                    throw rVar.f2662a;
                                }
                                choreographer = (Choreographer) objY;
                            }
                        } catch (Throwable th) {
                            if (t0Var != null) {
                                int i11 = cc.t0.f2670f;
                                t0Var.x(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    fVar.B(interruptedException);
                    throw interruptedException;
                } else {
                    choreographer = Choreographer.getInstance();
                }
                s0 s0Var = new s0(choreographer, o9.e0.q(Looper.getMainLooper()));
                return n3.u.G(s0Var, s0Var.f11399l);
            case 6:
            case 7:
                return null;
            case 8:
                j1.b("LocalAutofillManager");
                throw null;
            case 9:
                j1.b("LocalAutofillTree");
                throw null;
            case 10:
                j1.b("LocalClipboard");
                throw null;
            case 11:
                j1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                j1.b("LocalDensity");
                throw null;
            case 14:
                j1.b("LocalFocusManager");
                throw null;
            case 15:
                j1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                j1.b("LocalFontLoader");
                throw null;
            case 17:
                j1.b("LocalGraphicsContext");
                throw null;
            case 18:
                j1.b("LocalHapticFeedback");
                throw null;
            case 19:
                j1.b("LocalInputManager");
                throw null;
            case 20:
                j1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                j1.b("LocalTextToolbar");
                throw null;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                j1.b("LocalUriHandler");
                throw null;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                j1.b("LocalViewConfiguration");
                throw null;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                j1.b("LocalWindowInfo");
                throw null;
            default:
                return null;
        }
    }
}
