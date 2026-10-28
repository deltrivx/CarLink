package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.baidu.carlifevehicle.R;
import f7.b;
import f7.f;
import f7.l;
import f7.m;
import f7.o;
import f7.q;
import f7.r;
import f7.s;
import f7.u;
import g7.g;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import n5.d;
import n5.h;
import o9.e0;
import u0.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class BarcodeView extends f {
    public int A;
    public k B;
    public o C;
    public l D;
    public final Handler E;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = 1;
        this.B = null;
        b bVar = new b(this, 0);
        this.D = new q(0);
        this.E = new Handler(bVar);
    }

    public final f7.k f() {
        f7.k kVar;
        if (this.D == null) {
            this.D = new q(0);
        }
        m mVar = new m();
        HashMap map = new HashMap();
        map.put(d.NEED_RESULT_POINT_CALLBACK, mVar);
        q qVar = (q) this.D;
        qVar.getClass();
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.putAll(map);
        EnumMap enumMap2 = (EnumMap) qVar.f5448d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) qVar.f5447c;
        if (set != null) {
            enumMap.put(d.POSSIBLE_FORMATS, set);
        }
        String str = (String) qVar.f5449e;
        if (str != null) {
            enumMap.put(d.CHARACTER_SET, str);
        }
        h hVar = new h();
        hVar.c(enumMap);
        int i7 = qVar.f5446b;
        if (i7 == 0) {
            kVar = new f7.k(hVar);
        } else if (i7 == 1) {
            kVar = new r(hVar);
        } else if (i7 != 2) {
            kVar = new f7.k(hVar);
        } else {
            s sVar = new s(hVar);
            sVar.f5450c = true;
            kVar = sVar;
        }
        mVar.f5431a = kVar;
        return kVar;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        e0.U();
        Log.d("f", "pause()");
        this.f5396i = -1;
        g gVar = this.f5388a;
        if (gVar != null) {
            e0.U();
            if (gVar.f5974f) {
                gVar.f5969a.d(gVar.f5979l);
            } else {
                gVar.f5975g = true;
            }
            gVar.f5974f = false;
            this.f5388a = null;
            this.f5394g = false;
        } else {
            this.f5390c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f5402p == null && (surfaceView = this.f5392e) != null) {
            surfaceView.getHolder().removeCallback(this.f5409w);
        }
        if (this.f5402p == null && (textureView = this.f5393f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f5399m = null;
        this.f5400n = null;
        this.f5404r = null;
        q qVar = this.f5395h;
        u uVar = (u) qVar.f5448d;
        if (uVar != null) {
            uVar.disable();
        }
        qVar.f5448d = null;
        qVar.f5447c = null;
        qVar.f5449e = null;
        this.f5411y.j();
    }

    public l getDecoderFactory() {
        return this.D;
    }

    public final void h() {
        i();
        if (this.A == 1 || !this.f5394g) {
            return;
        }
        o oVar = new o(getCameraInstance(), f(), this.E);
        this.C = oVar;
        oVar.f5439f = getPreviewFramingRect();
        o oVar2 = this.C;
        oVar2.getClass();
        e0.U();
        HandlerThread handlerThread = new HandlerThread("o");
        oVar2.f5435b = handlerThread;
        handlerThread.start();
        oVar2.f5436c = new Handler(oVar2.f5435b.getLooper(), oVar2.f5442i);
        oVar2.f5440g = true;
        g gVar = oVar2.f5434a;
        gVar.f5976h.post(new g7.d(gVar, oVar2.f5443j, 0));
    }

    public final void i() {
        o oVar = this.C;
        if (oVar != null) {
            oVar.getClass();
            e0.U();
            synchronized (oVar.f5441h) {
                oVar.f5440g = false;
                oVar.f5436c.removeCallbacksAndMessages(null);
                oVar.f5435b.quit();
            }
            this.C = null;
        }
    }

    public void setDecoderFactory(l lVar) {
        e0.U();
        this.D = lVar;
        o oVar = this.C;
        if (oVar != null) {
            oVar.f5437d = f();
        }
    }
}
