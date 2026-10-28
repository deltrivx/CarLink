package androidx.lifecycle;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Process;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.receiver.transport.GroupedProtocolTransport;
import com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectDiscoverableTask;
import com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothDeviceDiscover;
import com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothDeviceDiscover$discoverRunnable$1;
import com.baidu.carlife.sdk.util.Logger;
import com.journeyapps.barcodescanner.BarcodeView;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1089b;

    public /* synthetic */ z(int i7, Object obj) {
        this.f1088a = i7;
        this.f1089b = obj;
    }

    private final void a() {
        l4.r rVar = (l4.r) this.f1089b;
        synchronized (rVar.f8032d) {
            try {
                if (rVar.f8036h == null) {
                    return;
                }
                try {
                    b4.m mVarC = rVar.c();
                    int i7 = mVarC.f1507e;
                    if (i7 == 2) {
                        synchronized (rVar.f8032d) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i10 = a4.j.f38a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        kb.d dVar = rVar.f8031c;
                        Context context = rVar.f8029a;
                        dVar.getClass();
                        b4.m[] mVarArr = {mVarC};
                        n3.u uVar = x3.e.f14570a;
                        o9.e0.m("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceS = x3.e.f14570a.s(context, mVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferT = n4.h.T(rVar.f8029a, mVarC.f1503a);
                            if (mappedByteBufferT == null || typefaceS == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                da.a aVar = new da.a(typefaceS, a.a.P(mappedByteBufferT));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (rVar.f8032d) {
                                    try {
                                        k9.a aVar2 = rVar.f8036h;
                                        if (aVar2 != null) {
                                            aVar2.G(aVar);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                rVar.a();
                            } catch (Throwable th2) {
                                int i11 = a4.j.f38a;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        int i12 = a4.j.f38a;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (rVar.f8032d) {
                        try {
                            k9.a aVar3 = rVar.f8036h;
                            if (aVar3 != null) {
                                aVar3.F(th5);
                            }
                            rVar.a();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02bd A[Catch: all -> 0x02ed, Exception -> 0x02f2, TryCatch #10 {all -> 0x02ed, blocks: (B:122:0x0247, B:134:0x027f, B:135:0x0281, B:137:0x0284, B:141:0x028b, B:142:0x0290, B:156:0x02b7, B:158:0x02bd, B:162:0x02c8), top: B:289:0x0247 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x0314  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:285:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x02b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [android.media.AudioManager$OnAudioFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        View viewFindFocus;
        MediaCodec.BufferInfo bufferInfo;
        MediaCodec mediaCodec;
        int payloadSize;
        int i7;
        int i10;
        int iDequeueInputBuffer;
        MediaCodec.BufferInfo bufferInfo2;
        char c10;
        ByteBuffer inputBuffer;
        MediaCodec.BufferInfo bufferInfo3;
        int iRemaining;
        Surface surface;
        r2.u uVar;
        int i11 = 1;
        switch (this.f1088a) {
            case 0:
                c0 c0Var = (c0) this.f1089b;
                v vVar = c0Var.f1021f;
                if (c0Var.f1017b == 0) {
                    z10 = true;
                    c0Var.f1018c = true;
                    vVar.d(n.ON_PAUSE);
                } else {
                    z10 = true;
                }
                if (c0Var.f1016a == 0 && c0Var.f1018c) {
                    vVar.d(n.ON_STOP);
                    c0Var.f1019d = z10;
                    return;
                }
                return;
            case 1:
                b1.k.setRippleState$lambda$2((b1.k) this.f1089b);
                return;
            case 2:
                c.j jVar = (c.j) this.f1089b;
                Runnable runnable = jVar.f1735b;
                if (runnable != null) {
                    runnable.run();
                    jVar.f1735b = null;
                    return;
                }
                return;
            case 3:
                c.q.a((c.q) this.f1089b);
                return;
            case 4:
                WifiDirectDiscoverableTask.mDiscoverPeers$lambda$0((WifiDirectDiscoverableTask) this.f1089b);
                return;
            case 5:
                BluetoothDeviceDiscover$discoverRunnable$1.run$lambda$0((BluetoothDeviceDiscover) this.f1089b);
                return;
            case 6:
                ((d8.f) this.f1089b).f3800b = null;
                return;
            case 7:
                View view = (View) this.f1089b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 8:
                f7.f.a((BarcodeView) ((a2.d) this.f1089b).f20b);
                return;
            case 9:
                g3.z zVar = (g3.z) this.f1089b;
                a2.b bVar = zVar.f5900b;
                zVar.f5911n = null;
                h1.e eVar = zVar.f5910m;
                View view2 = zVar.f5899a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar.h();
                    return;
                }
                Object[] objArr = eVar.f6421a;
                int i12 = eVar.f6423c;
                Boolean bool = null;
                Boolean boolValueOf = null;
                for (int i13 = 0; i13 < i12; i13++) {
                    g3.y yVar = (g3.y) objArr[i13];
                    int iOrdinal = yVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new cc.s();
                            }
                            if (!i9.l.a(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(yVar == g3.y.f5896c);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                eVar.h();
                if (i9.l.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) bVar.f13c.getValue()).restartInput((View) bVar.f12b);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((a2.d) ((a2.d) bVar.f14d).f20b).A();
                    } else {
                        ((a2.d) ((a2.d) bVar.f14d).f20b).p();
                    }
                }
                if (i9.l.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) bVar.f13c.getValue()).restartInput((View) bVar.f12b);
                    return;
                }
                return;
            case 10:
                g7.b bVar2 = ((g7.a) this.f1089b).f5951a;
                bVar2.f5954b = false;
                bVar2.a();
                return;
            case 11:
                h8.a aVar = (h8.a) this.f1089b;
                Process.setThreadPriority(-8);
                MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo = aVar.f6454h;
                int frameRate = carlifeVideoEncoderInfo != null ? carlifeVideoEncoderInfo.getFrameRate() : 30;
                while (aVar.f6447a.get() && !Thread.currentThread().isInterrupted()) {
                    try {
                        try {
                            if (aVar.f6455i.size() > frameRate) {
                                CarLifeMessage carLifeMessageD = aVar.d();
                                if (carLifeMessageD != null) {
                                    aVar.c(carLifeMessageD);
                                    aVar.f6449c.set(false);
                                } else if (aVar.f6455i.size() > frameRate * 3) {
                                    Logger.Companion companion = Logger.INSTANCE;
                                    Object[] objArr2 = new Object[i11];
                                    objArr2[0] = "【视频解码】积压严重且无I帧，强制重置";
                                    companion.e("CarLife_Vehicle", objArr2);
                                    aVar.f6455i.clear();
                                    aVar.f6449c.set(i11);
                                    CarLife.receiver().postMessage(i11, ServiceTypes.MSG_CMD_VIDEO_ENCODER_PAUSE);
                                    CarLife.receiver().postMessage(i11, ServiceTypes.MSG_CMD_VIDEO_ENCODER_START);
                                }
                            }
                            Surface surface2 = aVar.f6453g;
                            if (surface2 == null || !surface2.isValid()) {
                                bufferInfo = bufferInfo4;
                                LockSupport.parkNanos(100000000L);
                                bufferInfo4 = bufferInfo;
                                i11 = 1;
                            } else {
                                CarLifeMessage carLifeMessage = (CarLifeMessage) aVar.f6455i.poll(200L, TimeUnit.MILLISECONDS);
                                if (carLifeMessage == null) {
                                    continue;
                                } else {
                                    try {
                                        try {
                                            if (!aVar.f6449c.get()) {
                                                synchronized (aVar.f6450d) {
                                                    mediaCodec = aVar.f6452f;
                                                    if (mediaCodec == null) {
                                                        carLifeMessage.recycle();
                                                        carLifeMessage.recycle();
                                                    } else {
                                                        payloadSize = carLifeMessage.getPayloadSize();
                                                        i7 = 0;
                                                        i10 = i11;
                                                        while (aVar.f6447a.get()) {
                                                            iDequeueInputBuffer = -1;
                                                            if (aVar.f6447a.get()) {
                                                                iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                                                            }
                                                            if (iDequeueInputBuffer >= 0) {
                                                                inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                                                                if (inputBuffer != null) {
                                                                    inputBuffer.clear();
                                                                    iRemaining = inputBuffer.remaining();
                                                                    if (payloadSize > iRemaining) {
                                                                        iRemaining = payloadSize;
                                                                    }
                                                                    inputBuffer.put(carLifeMessage.getBody(), carLifeMessage.getCommandSize() + i7, iRemaining);
                                                                    bufferInfo2 = bufferInfo4;
                                                                    c10 = 1;
                                                                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, System.nanoTime() / ((long) 1000), 0);
                                                                    payloadSize -= iRemaining;
                                                                    i7 += iRemaining;
                                                                    bufferInfo4 = bufferInfo2;
                                                                } else {
                                                                    bufferInfo3 = bufferInfo4;
                                                                }
                                                                i10 = 1;
                                                            } else {
                                                                bufferInfo3 = bufferInfo4;
                                                                aVar.b(mediaCodec, bufferInfo3);
                                                            }
                                                            bufferInfo4 = bufferInfo3;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        bufferInfo = bufferInfo4;
                                                        aVar.b(mediaCodec, bufferInfo);
                                                        carLifeMessage.recycle();
                                                        bufferInfo4 = bufferInfo;
                                                        i11 = 1;
                                                    }
                                                    carLifeMessage.recycle();
                                                    throw th;
                                                }
                                            }
                                            try {
                                                if (h8.a.f(carLifeMessage.getBody(), carLifeMessage.getCommandSize())) {
                                                    Logger.Companion companion2 = Logger.INSTANCE;
                                                    Object[] objArr3 = new Object[i11];
                                                    objArr3[0] = "【视频解码】收到首个关键帧，开始解码";
                                                    companion2.w("CarLife_Vehicle", objArr3);
                                                    aVar.f6449c.set(false);
                                                    synchronized (aVar.f6450d) {
                                                        try {
                                                            mediaCodec = aVar.f6452f;
                                                        } catch (Throwable th) {
                                                            bufferInfo = bufferInfo4;
                                                            throw th;
                                                        }
                                                    }
                                                    if (mediaCodec == null) {
                                                        carLifeMessage.recycle();
                                                    } else {
                                                        payloadSize = carLifeMessage.getPayloadSize();
                                                        i7 = 0;
                                                        i10 = i11;
                                                        while (aVar.f6447a.get() && payloadSize > 0) {
                                                            iDequeueInputBuffer = -1;
                                                            try {
                                                                if (aVar.f6447a.get() && (surface = aVar.f6453g) != null && surface.isValid() == i10) {
                                                                    iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                                                                }
                                                                break;
                                                            } catch (Exception unused) {
                                                            }
                                                            if (iDequeueInputBuffer >= 0) {
                                                                try {
                                                                    inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                                                                    if (inputBuffer != null) {
                                                                        inputBuffer.clear();
                                                                        iRemaining = inputBuffer.remaining();
                                                                        if (payloadSize > iRemaining) {
                                                                            iRemaining = payloadSize;
                                                                        }
                                                                        inputBuffer.put(carLifeMessage.getBody(), carLifeMessage.getCommandSize() + i7, iRemaining);
                                                                        bufferInfo2 = bufferInfo4;
                                                                        c10 = 1;
                                                                        try {
                                                                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, System.nanoTime() / ((long) 1000), 0);
                                                                            payloadSize -= iRemaining;
                                                                            i7 += iRemaining;
                                                                            bufferInfo4 = bufferInfo2;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            try {
                                                                                Logger.Companion companion3 = Logger.INSTANCE;
                                                                                Object[] objArr4 = new Object[2];
                                                                                objArr4[0] = "【视频解码】queueInputBuffer 失败";
                                                                                objArr4[c10] = e;
                                                                                companion3.e("CarLife_Vehicle", objArr4);
                                                                                bufferInfo = bufferInfo2;
                                                                                aVar.b(mediaCodec, bufferInfo);
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                bufferInfo = bufferInfo2;
                                                                                Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】单帧处理异常: " + e.getMessage());
                                                                            }
                                                                            carLifeMessage.recycle();
                                                                            bufferInfo4 = bufferInfo;
                                                                            i11 = 1;
                                                                        }
                                                                    } else {
                                                                        bufferInfo3 = bufferInfo4;
                                                                    }
                                                                    i10 = 1;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    bufferInfo2 = bufferInfo4;
                                                                    c10 = 1;
                                                                }
                                                            } else {
                                                                bufferInfo3 = bufferInfo4;
                                                                aVar.b(mediaCodec, bufferInfo3);
                                                            }
                                                            bufferInfo4 = bufferInfo3;
                                                            i10 = 1;
                                                        }
                                                        bufferInfo = bufferInfo4;
                                                        try {
                                                            aVar.b(mediaCodec, bufferInfo);
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】单帧处理异常: " + e.getMessage());
                                                        }
                                                        carLifeMessage.recycle();
                                                        bufferInfo4 = bufferInfo;
                                                        i11 = 1;
                                                    }
                                                    carLifeMessage.recycle();
                                                    throw th;
                                                }
                                                carLifeMessage.recycle();
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            bufferInfo = bufferInfo4;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        } catch (InterruptedException unused2) {
                            Logger.Companion companion4 = Logger.INSTANCE;
                            companion4.d("CarLife_Vehicle", "【视频解码】线程被中断，正常退出");
                            companion4.d("CarLife_Vehicle", "【视频解码】线程循环结束");
                            return;
                        } catch (Exception e14) {
                            Logger.Companion companion5 = Logger.INSTANCE;
                            companion5.e("CarLife_Vehicle", "【视频解码】线程异常退出: " + e14.getMessage(), e14);
                            companion5.d("CarLife_Vehicle", "【视频解码】线程循环结束");
                            return;
                        }
                    } catch (Throwable th4) {
                        Logger.INSTANCE.d("CarLife_Vehicle", "【视频解码】线程循环结束");
                        throw th4;
                    }
                }
                Logger.INSTANCE.d("CarLife_Vehicle", "【视频解码】线程循环结束");
                return;
            case 12:
                ((GroupedProtocolTransport) this.f1089b).connect();
                return;
            case 13:
                k7.b bVar3 = (k7.b) this.f1089b;
                k7.c cVar = k7.c.f7339a;
                k7.c.a(bVar3.f7337c);
                return;
            case 14:
                k7.f fVar = (k7.f) this.f1089b;
                android.support.v4.media.session.r rVar = fVar.f7351a;
                if (rVar != null) {
                    rVar.J(new k7.e(fVar), null);
                    return;
                }
                return;
            case 15:
                a();
                return;
            case 16:
                n7.f fVar2 = (n7.f) this.f1089b;
                while (!fVar2.f8880e) {
                    try {
                        fVar2.a();
                    } catch (InterruptedException unused3) {
                        return;
                    } catch (Exception e15) {
                        Logger.INSTANCE.e(Constants.TAG, ob.a.q("【音频解码】线程异常: ", e15.getMessage()), e15);
                    }
                }
                return;
            case 17:
                ((p6.a) this.f1089b).a();
                return;
            case 18:
                ((p6.b) this.f1089b).a();
                return;
            case 19:
                ((p6.c) this.f1089b).f10297g++;
                return;
            case 20:
                ((b3.r) this.f1089b).o();
                return;
            case 21:
                r2.u uVar2 = (r2.u) this.f1089b;
                uVar2.H0 = false;
                MotionEvent motionEvent = uVar2.z0;
                i9.l.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                uVar2.M(motionEvent);
                return;
            case 22:
                b1.a aVar2 = (b1.a) this.f1089b;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    aVar2.invoke();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 23:
                r2.b0 b0Var = (r2.b0) this.f1089b;
                Trace.beginSection("measureAndLayout");
                try {
                    b0Var.f11169d.y(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        b0Var.i();
                        Trace.endSection();
                        b0Var.L = false;
                        return;
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    Trace.endSection();
                    throw th6;
                }
            case 24:
                t1.c cVar2 = (t1.c) this.f1089b;
                boolean zL = cVar2.l();
                r2.u uVar3 = cVar2.f12733a;
                if (zL) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        uVar3.y(true);
                        s.w wVar = cVar2.f12743l;
                        int[] iArr = wVar.f12462b;
                        long[] jArr = wVar.f12461a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j5 = jArr[i14];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((255 & j5) < 128) {
                                            int i17 = iArr[(i14 << 3) + i16];
                                            if (!cVar2.k().a(i17)) {
                                                cVar2.f12736d.add(new t1.d(i17, cVar2.k, t1.e.f12752b, null));
                                                cVar2.f12740h.x(t8.z.f12851a);
                                            }
                                        }
                                        j5 >>= 8;
                                        i16++;
                                        uVar3 = uVar3;
                                    }
                                    uVar = uVar3;
                                    if (i15 == 8) {
                                    }
                                } else {
                                    uVar = uVar3;
                                }
                                if (i14 != length) {
                                    i14++;
                                    uVar3 = uVar;
                                }
                            }
                        } else {
                            uVar = uVar3;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            cVar2.n(uVar.getSemanticsOwner().a(), cVar2.f12744m);
                            Trace.endSection();
                            cVar2.i(cVar2.k());
                            cVar2.r();
                            cVar2.f12745n = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th7) {
                        Trace.endSection();
                        throw th7;
                    }
                }
                return;
            default:
                ((Window) this.f1089b).getDecorView().setPadding(0, 0, 0, 0);
                return;
        }
    }
}
