package x7;

import a8.c1;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.SurfaceView;
import android.view.WindowManager;
import cc.b0;
import cc.k0;
import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import n8.w;
import n8.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements TransportListener, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.c f14677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8.a f14678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f14679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f14680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f14681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DisplayManager f14682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SurfaceView f14683h;

    public o(int i7) {
        this.f14676a = i7;
        jc.e eVar = k0.f2635a;
        this.f14677b = b0.a(hc.m.f6531a);
        this.f14678c = new h8.a();
        this.f14681f = (l) l.f14660o.getValue();
        Object systemService = n8.a.b().getSystemService("display");
        i9.l.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        this.f14682g = displayManager;
        displayManager.registerDisplayListener(this, null);
    }

    public static final void a(o oVar) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        l lVar = oVar.f14681f;
        int i7 = lVar.f14664d;
        if (i7 == 0) {
            i7 = -1;
        }
        layoutParams.width = i7;
        int i10 = lVar.f14665e;
        layoutParams.height = i10 != 0 ? i10 : -1;
        layoutParams.x = lVar.f14666f;
        layoutParams.y = lVar.f14667g;
        Display display = oVar.f14682g.getDisplay(oVar.f14676a);
        if (display == null || !display.isValid()) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【互联投屏】副屏 Display 不可用，跳过初始化");
            return;
        }
        try {
            if (lVar.f14662b == 1) {
                if (oVar.f14679d == null) {
                    Context contextB = n8.a.b();
                    if (oVar.f14683h == null) {
                        SurfaceView surfaceView = new SurfaceView(contextB);
                        surfaceView.getHolder().addCallback(new f7.d(1, oVar));
                        oVar.f14683h = surfaceView;
                    }
                    SurfaceView surfaceView2 = oVar.f14683h;
                    i9.l.b(surfaceView2);
                    w wVar = new w(display, surfaceView2, layoutParams, null, 8);
                    wVar.b();
                    oVar.f14679d = wVar;
                    return;
                }
                return;
            }
            if (oVar.f14680e == null) {
                Context contextB2 = n8.a.b();
                if (oVar.f14683h == null) {
                    SurfaceView surfaceView3 = new SurfaceView(contextB2);
                    surfaceView3.getHolder().addCallback(new f7.d(1, oVar));
                    oVar.f14683h = surfaceView3;
                }
                SurfaceView surfaceView4 = oVar.f14683h;
                i9.l.b(surfaceView4);
                y yVar = new y(display, surfaceView4, layoutParams, null, 8);
                yVar.show();
                oVar.f14680e = yVar;
            }
        } catch (WindowManager.InvalidDisplayException e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【互联投屏】副屏显示失败：Display 已失效", e7);
        }
    }

    public static final void b(o oVar) {
        try {
            oVar.f14678c.g();
        } catch (Exception e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【互联投屏】解码器释放异常 ", e7.getMessage()));
        }
        oVar.f14683h = null;
        if (oVar.f14681f.f14662b == 1) {
            w wVar = oVar.f14679d;
            if (wVar != null) {
                wVar.a();
            }
            oVar.f14679d = null;
            return;
        }
        y yVar = oVar.f14680e;
        if (yVar == null || !yVar.isShowing()) {
            return;
        }
        y yVar2 = oVar.f14680e;
        if (yVar2 != null) {
            yVar2.dismiss();
        }
        oVar.f14680e = null;
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
        Logger.INSTANCE.d("CarLife_Vehicle", "【互联投屏】连接断开，移除 SurfaceView");
        b0.s(this.f14677b, null, new n(this, null, 0), 3);
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
        Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i7, "【互联投屏】副屏添加: "));
        if (i7 == this.f14676a) {
            b0.s(this.f14677b, null, new n(this, null, 1), 3);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i7, "【互联投屏】副屏状态变化: "));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
        Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i7, "【互联投屏】副屏移除: "));
        if (i7 == this.f14676a) {
            b0.s(this.f14677b, null, new n(this, null, 2), 3);
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        i9.l.e(carLifeContext, "context");
        i9.l.e(carLifeMessage, "message");
        int serviceType = carLifeMessage.getServiceType();
        h8.a aVar = this.f14678c;
        if (serviceType == 65544) {
            try {
                l1 protoPayload = carLifeMessage.getProtoPayload();
                i9.l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo");
                aVar.e((CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo) protoPayload);
                b0.s(this.f14677b, null, new c1(this, null, 28), 3);
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", "【互联投屏】解析视频初始化消息失败", e7);
            }
        } else if (serviceType == 131073) {
            aVar.getClass();
            if (carLifeMessage.getPayloadSize() != 0 && aVar.f6447a.get()) {
                carLifeMessage.acquire();
                aVar.f6455i.offer(carLifeMessage);
            }
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
