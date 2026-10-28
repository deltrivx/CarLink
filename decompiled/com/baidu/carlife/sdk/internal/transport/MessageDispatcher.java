package com.baidu.carlife.sdk.internal.transport;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.InvokeTimeoutMonitor;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/MessageDispatcher;", "Ljava/lang/Thread;", "Landroid/os/Handler$Callback;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "transport", "", "monitorSendTimeout", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;Z)V", "Lt8/z;", "start", "()V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "postMessage", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "sendMessage", "dispatchMessage", "terminate", "run", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)Z", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "getTransport", "()Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "Z", "Landroid/os/Handler;", "sendHandler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "sender", "Landroid/os/HandlerThread;", "Lcom/baidu/carlife/sdk/util/InvokeTimeoutMonitor;", "sendTimeoutMonitor", "Lcom/baidu/carlife/sdk/util/InvokeTimeoutMonitor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MessageDispatcher extends Thread implements Handler.Callback {
    private final CarLifeContext context;
    private AtomicBoolean isTerminated;
    private final boolean monitorSendTimeout;
    private Handler sendHandler;
    private final InvokeTimeoutMonitor sendTimeoutMonitor;
    private final HandlerThread sender;
    private final ProtocolTransport transport;

    public MessageDispatcher(CarLifeContext carLifeContext, ProtocolTransport protocolTransport, boolean z10) {
        l.e(carLifeContext, "context");
        l.e(protocolTransport, "transport");
        this.context = carLifeContext;
        this.transport = protocolTransport;
        this.monitorSendTimeout = z10;
        HandlerThread handlerThread = new HandlerThread("CarLife_MesssageSender", -2);
        this.sender = handlerThread;
        Looper mainLooper = Looper.getMainLooper();
        l.d(mainLooper, "getMainLooper()");
        InvokeTimeoutMonitor invokeTimeoutMonitor = new InvokeTimeoutMonitor(mainLooper, 3000L, new MessageDispatcher$sendTimeoutMonitor$1(this));
        this.sendTimeoutMonitor = invokeTimeoutMonitor;
        this.isTerminated = new AtomicBoolean(false);
        setName("CarLife_MessageDispatcher");
        handlerThread.start();
        this.sendHandler = new Handler(handlerThread.getLooper(), this);
        if (z10) {
            invokeTimeoutMonitor.tick();
        }
    }

    public /* synthetic */ MessageDispatcher(CarLifeContext carLifeContext, ProtocolTransport protocolTransport, boolean z10, int i7, g gVar) {
        this(carLifeContext, protocolTransport, (i7 & 4) != 0 ? false : z10);
    }

    public final void dispatchMessage(CarLifeMessage message) {
        l.e(message, "message");
        CarLifeContext carLifeContext = this.context;
        carLifeContext.onReceiveMessage(carLifeContext, message);
    }

    public final ProtocolTransport getTransport() {
        return this.transport;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        l.e(msg, "msg");
        Object obj = msg.obj;
        l.c(obj, "null cannot be cast to non-null type com.baidu.carlife.sdk.internal.protocol.CarLifeMessage");
        sendMessage((CarLifeMessage) obj);
        return true;
    }

    public final void postMessage(CarLifeMessage message) {
        l.e(message, "message");
        Handler handler = this.sendHandler;
        if (handler == null) {
            l.j("sendHandler");
            throw null;
        }
        if (handler != null) {
            handler.sendMessage(Message.obtain(handler, 0, message));
        } else {
            l.j("sendHandler");
            throw null;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.isTerminated.get()) {
            try {
                CarLifeMessage carLifeMessage = this.transport.read();
                try {
                    if (carLifeMessage.getSupportEncrypt() && this.context.getIsEncryptionEnabled()) {
                        CarLifeMessage carLifeMessageDecrypt = this.context.decrypt(carLifeMessage);
                        try {
                            CarLifeContext carLifeContext = this.context;
                            carLifeContext.onReceiveMessage(carLifeContext, carLifeMessageDecrypt);
                            if (carLifeMessageDecrypt != carLifeMessage) {
                                carLifeMessageDecrypt.recycle();
                            }
                        } catch (Throwable th) {
                            if (carLifeMessageDecrypt != carLifeMessage) {
                                carLifeMessageDecrypt.recycle();
                            }
                            throw th;
                        }
                    } else {
                        CarLifeContext carLifeContext2 = this.context;
                        carLifeContext2.onReceiveMessage(carLifeContext2, carLifeMessage);
                    }
                    carLifeMessage.recycle();
                } catch (Throwable th2) {
                    carLifeMessage.recycle();
                    throw th2;
                }
            } catch (Exception e7) {
                if (!this.isTerminated.get()) {
                    Logger.INSTANCE.e(Constants.TAG, "MessageDispatcher run exception0: ", e7);
                }
                Logger.INSTANCE.e(Constants.TAG, "MessageDispatcher run exception1: ", e7);
            }
        }
        terminate();
    }

    public final void sendMessage(CarLifeMessage message) {
        CarLifeMessage carLifeMessageEncrypt;
        l.e(message, "message");
        try {
            try {
                this.sendTimeoutMonitor.enter();
                if (message.getSupportEncrypt() && this.context.getIsEncryptionEnabled()) {
                    synchronized (this) {
                        carLifeMessageEncrypt = this.context.encrypt(message);
                    }
                    try {
                        this.transport.write(carLifeMessageEncrypt);
                        carLifeMessageEncrypt.recycle();
                    } catch (Throwable th) {
                        carLifeMessageEncrypt.recycle();
                        throw th;
                    }
                } else {
                    this.transport.write(message);
                }
                this.sendTimeoutMonitor.exit();
                CarLifeContext carLifeContext = this.context;
                carLifeContext.onSendMessage(carLifeContext, message);
                message.recycle();
            } catch (Exception e7) {
                e7.printStackTrace();
                if (!this.isTerminated.get()) {
                    Logger.INSTANCE.e(Constants.TAG, "MessageDispatcher handleMessage exception: " + Log.getStackTraceString(e7));
                    terminate();
                }
                message.recycle();
            }
        } catch (Throwable th2) {
            message.recycle();
            throw th2;
        }
    }

    @Override // java.lang.Thread
    public void start() {
        if (getState() == Thread.State.NEW) {
            super.start();
        }
    }

    public final void terminate() {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        this.sendTimeoutMonitor.release();
        this.transport.terminate();
        this.sender.quit();
        Logger.INSTANCE.d(Constants.TAG, "MessageDispatcher terminate");
    }
}
