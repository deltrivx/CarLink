package x7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import c1.u2;
import cc.b0;
import cc.k0;
import com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import com.google.protobuf.u0;
import f1.q1;
import f1.s;
import f1.w1;
import fc.h0;
import java.util.Arrays;
import java.util.Locale;
import n3.r;
import n8.w;
import n8.y;
import q2.a0;
import r1.p;
import y1.g0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements TransportListener, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.c f14636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f14637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f14638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f14639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f14640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f14641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f14642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DisplayManager f14643i;

    public f(int i7) {
        this.f14635a = i7;
        jc.e eVar = k0.f2635a;
        this.f14636b = b0.a(hc.m.f6531a);
        this.f14639e = fc.y.b(com.google.protobuf.l.f2785b);
        this.f14640f = fc.y.b(0);
        this.f14641g = fc.y.b("");
        this.f14642h = (l) l.f14660o.getValue();
        Object systemService = n8.a.b().getSystemService("display");
        i9.l.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        this.f14643i = displayManager;
        displayManager.registerDisplayListener(this, null);
    }

    public static final void b(f fVar) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        l lVar = fVar.f14642h;
        int i7 = lVar.f14670j;
        if (i7 == 0) {
            i7 = -1;
        }
        layoutParams.width = i7;
        int i10 = lVar.k;
        layoutParams.height = i10 != 0 ? i10 : -1;
        layoutParams.x = lVar.f14671l;
        layoutParams.y = lVar.f14672m;
        Display display = fVar.f14643i.getDisplay(fVar.f14635a);
        if (display == null || !display.isValid()) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【HUD投屏】Display 不可用，跳过初始化");
            return;
        }
        try {
            int i11 = lVar.f14669i;
            if (i11 == 1) {
                if (fVar.f14637c == null) {
                    w wVar = new w(display, null, layoutParams, new n1.c(new d(fVar, 0), -1715533728, true), 2);
                    fVar.f14637c = wVar;
                    wVar.b();
                    return;
                }
                return;
            }
            if (i11 == 0 && fVar.f14638d == null) {
                y yVar = new y(display, null, layoutParams, new n1.c(new d(fVar, 1), -34998471, true), 2);
                fVar.f14638d = yVar;
                yVar.show();
            }
        } catch (WindowManager.InvalidDisplayException e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【HUD投屏】显示失败：Display 已失效", e7);
        }
    }

    public static final void c(f fVar) {
        y yVar;
        fVar.f14639e.i(com.google.protobuf.l.f2785b);
        h0 h0Var = fVar.f14640f;
        h0Var.getClass();
        h0Var.j(null, 0);
        h0 h0Var2 = fVar.f14641g;
        h0Var2.getClass();
        h0Var2.j(null, "");
        int i7 = fVar.f14642h.f14669i;
        if (i7 == 1) {
            w wVar = fVar.f14637c;
            if (wVar != null) {
                wVar.a();
            }
            fVar.f14637c = null;
            return;
        }
        if (i7 == 0 && (yVar = fVar.f14638d) != null && yVar.isShowing()) {
            y yVar2 = fVar.f14638d;
            if (yVar2 != null) {
                yVar2.dismiss();
            }
            fVar.f14638d = null;
        }
    }

    public final void a(int i7, s sVar) {
        byte[] bArr;
        String str;
        boolean z10;
        s sVar2 = sVar;
        sVar2.Y(1118692152);
        if (((i7 | (sVar2.h(this) ? 4 : 2)) & 3) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            long j5 = q.f14957l;
            g0 g0Var = y1.h0.f14898a;
            r1.m mVar = r1.m.f11116a;
            p pVarB = androidx.compose.foundation.a.b(mVar, j5, g0Var);
            d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
            long j10 = sVar2.T;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL = sVar2.l();
            p pVarC = r1.a.c(sVar2, pVarB);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, q2.i.f10708e, sVarA);
            f1.b.w(sVar2, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar2, i10, hVar);
            }
            f1.b.w(sVar2, q2.i.f10706c, pVarC);
            com.google.protobuf.l lVar = (com.google.protobuf.l) f1.b.k(this.f14639e, sVar2).getValue();
            int size = lVar.size();
            if (size == 0) {
                bArr = u0.f2862b;
            } else {
                byte[] bArr2 = new byte[size];
                lVar.n(bArr2, size);
                bArr = bArr2;
            }
            sVar2.W(-1956495289);
            i9.l.b(bArr);
            if (bArr.length == 0) {
                z10 = false;
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                i9.l.b(bitmapDecodeByteArray);
                n3.n.C(new y1.f(bitmapDecodeByteArray), "Turn Icon", androidx.compose.foundation.layout.c.h(mVar, Constants.MSG_RESPONSE_SUCCESS), sVar2, 432, 248);
                int iIntValue = ((Number) f1.b.k(this.f14640f, sVar2).getValue()).intValue();
                if (iIntValue >= 1000) {
                    double d10 = ((double) iIntValue) / 1000.0d;
                    if (d10 % 1.0d == 0.0d) {
                        str = ((int) d10) + "公里";
                    } else {
                        str = String.format(Locale.getDefault(), "%.1f公里", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
                    }
                } else {
                    str = iIntValue + "米";
                }
                String strB = ob.a.B(str, " 进入");
                long jD = r.D(50);
                long j11 = q.f14951e;
                z10 = false;
                u2.b(strB, null, j11, jD, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3456, 0, 131058);
                u2.b((String) f1.b.k(this.f14641g, sVar).getValue(), null, j11, r.D(50), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3456, 0, 131058);
                sVar2 = sVar;
            }
            sVar2.p(z10);
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 29, this);
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionDetached(CarLifeContext carLifeContext) {
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【HUD投屏】连接断开，移除 HUD");
        b0.s(this.f14636b, null, new e(this, null, 0), 3);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        com.baidu.carlife.sdk.a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
        if (i7 == this.f14635a) {
            b0.s(this.f14636b, null, new e(this, null, 1), 3);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i7, "【HUD投屏】副屏状态变化: "));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
        if (i7 == this.f14635a) {
            b0.s(this.f14636b, null, new e(this, null, 2), 3);
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        i9.l.e(carLifeContext, "context");
        i9.l.e(carLifeMessage, "message");
        if (carLifeMessage.getServiceType() != 65584) {
            return false;
        }
        b0.s(this.f14636b, null, new e(this, null, 3), 3);
        l1 protoPayload = carLifeMessage.getProtoPayload();
        CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo carlifeNaviNextTurnInfo = protoPayload instanceof CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo ? (CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo) protoPayload : null;
        if (carlifeNaviNextTurnInfo == null) {
            return false;
        }
        this.f14639e.i(carlifeNaviNextTurnInfo.getTurnIconData());
        Integer numValueOf = Integer.valueOf(carlifeNaviNextTurnInfo.getRemainDistance());
        h0 h0Var = this.f14640f;
        h0Var.getClass();
        h0Var.j(null, numValueOf);
        String roadName = carlifeNaviNextTurnInfo.getRoadName();
        i9.l.d(roadName, "getRoadName(...)");
        h0 h0Var2 = this.f14641g;
        h0Var2.getClass();
        h0Var2.j(null, roadName);
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
