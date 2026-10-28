package z;

import android.content.res.AssetManager;
import android.os.Build;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f15575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15579h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public w0(AssetManager assetManager, Executor executor, z4.d dVar, String str, File file) {
        this.f15572a = false;
        this.f15573b = executor;
        this.f15574c = dVar;
        this.f15577f = str;
        this.f15576e = file;
        int i7 = Build.VERSION.SDK_INT;
        ?? r8 = 0;
        r8 = 0;
        if (i7 >= 24) {
            if (i7 < 31) {
                switch (i7) {
                    case 24:
                    case 25:
                        r8 = z4.e.f15725h;
                        break;
                    case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        r8 = z4.e.f15724g;
                        break;
                    case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        r8 = z4.e.f15723f;
                        break;
                    case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                    case ServiceTypes.KEYCODE_TEL /* 29 */:
                    case 30:
                        r8 = z4.e.f15722e;
                        break;
                }
            } else {
                r8 = z4.e.f15721d;
            }
        }
        this.f15575d = r8;
    }

    public w0(t1 t1Var, wb.b bVar, n1.b bVar2, n3.c cVar) {
        this.f15573b = t1Var;
        this.f15574c = bVar;
        this.f15575d = bVar2;
        this.f15576e = cVar;
        this.f15577f = i2.c.c(Integer.MAX_VALUE, 6, null);
        this.f15579h = new android.support.v4.media.session.r(27);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object a(w0 w0Var, t1 t1Var, q0 q0Var, float f10, float f11, a9.c cVar) {
        r0 r0Var;
        i9.u uVar;
        float f12;
        t1 t1Var2;
        w0Var.getClass();
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i7 = r0Var.f15481f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                r0Var.f15481f = i7 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(w0Var, cVar);
            }
        } else {
            r0Var = new r0(w0Var, cVar);
        }
        r0 r0Var2 = r0Var;
        Object obj = r0Var2.f15479d;
        int i10 = r0Var2.f15481f;
        Object obj2 = t8.z.f12851a;
        Object obj3 = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(obj);
            i9.x xVar = new i9.x();
            xVar.f6688a = q0Var;
            w0Var.g(q0Var);
            q0 q0VarF = f((ec.h) w0Var.f15577f);
            if (q0VarF != null) {
                w0Var.g(q0VarF);
                xVar.f6688a = ((q0) xVar.f6688a).a(q0VarF);
            }
            i9.u uVar2 = new i9.u();
            float fG = t1Var.g(t1Var.e(((q0) xVar.f6688a).f15457a));
            uVar2.f6685a = fG;
            if (!p0.a(fG)) {
                i9.x xVar2 = new i9.x();
                xVar2.f6688a = v.d.b(0.0f, 30);
                s0 s0Var = new s0(uVar2, xVar2, xVar, f10, w0Var, f11, t1Var, null);
                r0Var2.f15476a = t1Var;
                r0Var2.f15477b = uVar2;
                r0Var2.f15478c = f11;
                r0Var2.f15481f = 1;
                if (w0Var.h(t1Var, s0Var, r0Var2) != obj3) {
                    uVar = uVar2;
                    f12 = f11;
                    t1Var2 = t1Var;
                }
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
            return obj2;
        }
        f12 = r0Var2.f15478c;
        uVar = r0Var2.f15477b;
        t1Var2 = r0Var2.f15476a;
        t8.a.e(obj);
        android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) w0Var.f15579h;
        long jD = n3.u.d(((l2.c) rVar.f604b).b(Float.MAX_VALUE), ((l2.c) rVar.f605c).b(Float.MAX_VALUE));
        if (jD == 0) {
            float fD = t1Var2.d(Math.signum(uVar.f6685a)) * Math.min(Math.abs(uVar.f6685a) / 100, f12) * 1000;
            if (fD == 0.0f) {
                jD = 0;
            } else {
                jD = t1Var2.f15520d == x0.f15592b ? n3.u.d(fD, 0.0f) : n3.u.d(0.0f, fD);
            }
        }
        n1.b bVar = (n1.b) w0Var.f15575d;
        r0Var2.f15476a = null;
        r0Var2.f15477b = null;
        r0Var2.f15481f = 2;
        m1 m1Var = (m1) bVar.f6660a;
        cc.b0.s(m1Var.B.c(), null, new k1(m1Var, jD, null, 2), 3);
        return obj2 == obj3 ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(w0 w0Var, i9.x xVar, i9.u uVar, t1 t1Var, i9.x xVar2, long j5, a9.c cVar) throws Throwable {
        t0 t0Var;
        i9.u uVar2;
        t1 t1Var2;
        i9.x xVar3;
        boolean z10;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i7 = t0Var.f15516g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                t0Var.f15516g = i7 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(cVar);
            }
        } else {
            t0Var = new t0(cVar);
        }
        Object objB = t0Var.f15515f;
        int i10 = t0Var.f15516g;
        if (i10 == 0) {
            t8.a.e(objB);
            if (j5 < 0) {
                return Boolean.FALSE;
            }
            u0 u0Var = new u0(w0Var, (y8.c) null);
            t0Var.f15510a = w0Var;
            t0Var.f15511b = xVar;
            t0Var.f15512c = uVar;
            t0Var.f15513d = t1Var;
            t0Var.f15514e = xVar2;
            t0Var.f15516g = 1;
            objB = cc.b0.B(j5, u0Var, t0Var);
            z8.a aVar = z8.a.f15774a;
            if (objB == aVar) {
                return aVar;
            }
            uVar2 = uVar;
            t1Var2 = t1Var;
            xVar3 = xVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9.x xVar4 = t0Var.f15514e;
            t1 t1Var3 = t0Var.f15513d;
            uVar2 = t0Var.f15512c;
            i9.x xVar5 = t0Var.f15511b;
            w0 w0Var2 = t0Var.f15510a;
            t8.a.e(objB);
            xVar3 = xVar4;
            t1Var2 = t1Var3;
            xVar = xVar5;
            w0Var = w0Var2;
        }
        q0 q0Var = (q0) objB;
        if (q0Var != null) {
            boolean z11 = ((q0) xVar.f6688a).f15459c;
            long j10 = q0Var.f15457a;
            xVar.f6688a = new q0(j10, q0Var.f15458b, z11);
            uVar2.f6685a = t1Var2.g(t1Var2.e(j10));
            xVar3.f6688a = v.d.b(0.0f, 30);
            w0Var.g(q0Var);
            z10 = !p0.a(uVar2.f6685a);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q0 f(ec.h hVar) {
        q0 q0Var = null;
        yb.k kVarE = n3.u.E(new l0.x0((Object) new v0.p(3, hVar), (y8.c) (0 == true ? 1 : 0), 3));
        while (kVarE.hasNext()) {
            q0 q0VarA = (q0) kVarE.next();
            if (q0Var != null) {
                q0VarA = q0Var.a(q0VarA);
            }
            q0Var = q0VarA;
        }
        return q0Var;
    }

    public float c(r1 r1Var, float f10) {
        t1 t1Var = (t1) this.f15573b;
        long jH = t1Var.h(t1Var.d(f10));
        t1 t1Var2 = r1Var.f15482a;
        return t1Var.g(t1Var.e(t1Var2.c(t1Var2.k, jH, 1)));
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((z4.d) this.f15574c).d();
            return null;
        }
    }

    public void e(int i7, Serializable serializable) {
        ((Executor) this.f15573b).execute(new c.k(i7, 2, this, serializable));
    }

    public void g(q0 q0Var) {
        android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) this.f15579h;
        long j5 = q0Var.f15458b;
        long j10 = q0Var.f15457a;
        ((l2.c) rVar.f604b).a(Float.intBitsToFloat((int) (j10 >> 32)), j5);
        ((l2.c) rVar.f605c).a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(t1 t1Var, s0 s0Var, a9.c cVar) {
        v0 v0Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i7 = v0Var.f15563c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                v0Var.f15563c = i7 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object obj = v0Var.f15561a;
        int i10 = v0Var.f15563c;
        if (i10 == 0) {
            t8.a.e(obj);
            this.f15572a = true;
            b0.g gVar = new b0.g(t1Var, s0Var, null, 27);
            v0Var.f15563c = 1;
            cc.p1 p1Var = new cc.p1(v0Var.getContext(), v0Var, 0);
            Object objQ = o9.e0.Q(p1Var, p1Var, gVar);
            z8.a aVar = z8.a.f15774a;
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        this.f15572a = false;
        return t8.z.f12851a;
    }
}
